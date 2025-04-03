package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.Range;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afn implements anv {
    private final apd a;
    private final Range b;
    private kfb d;
    private boolean f;
    private float c = 1.0f;
    private float e = 1.0f;

    public afn(apd apdVar) {
        CameraCharacteristics.Key key;
        CameraCharacteristics.Key key2;
        boolean z = false;
        this.f = false;
        this.a = apdVar;
        key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
        this.b = (Range) apdVar.c(key);
        if (Build.VERSION.SDK_INT >= 34) {
            apc apcVar = apdVar.b;
            key2 = CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES;
            int[] iArr = (int[]) apcVar.a(key2);
            if (iArr != null) {
                int i = 0;
                while (true) {
                    if (i >= iArr.length) {
                        break;
                    }
                    if (iArr[i] == 1) {
                        z = true;
                        break;
                    }
                    i++;
                }
            }
        }
        this.f = z;
    }

    @Override // defpackage.anv
    public final float a() {
        return ((Float) this.b.getUpper()).floatValue();
    }

    @Override // defpackage.anv
    public final float b() {
        return ((Float) this.b.getLower()).floatValue();
    }

    @Override // defpackage.anv
    public final Rect c() {
        Rect rect = (Rect) this.a.c(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        ksw.h(rect);
        return rect;
    }

    @Override // defpackage.anv
    public final void d(afl aflVar) {
        CaptureRequest.Key key;
        CaptureRequest.Key key2;
        key = CaptureRequest.CONTROL_ZOOM_RATIO;
        aflVar.e(key, Float.valueOf(this.c), bdo.REQUIRED);
        if (this.f) {
            bdo bdoVar = bdo.REQUIRED;
            bdoVar.getClass();
            if (Build.VERSION.SDK_INT >= 34) {
                key2 = CaptureRequest.CONTROL_SETTINGS_OVERRIDE;
                aflVar.e(key2, 1, bdoVar);
            }
        }
    }

    @Override // defpackage.anv
    public final void e(TotalCaptureResult totalCaptureResult) {
        CaptureRequest.Key key;
        Float f;
        if (this.d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            if (request == null) {
                f = null;
            } else {
                key = CaptureRequest.CONTROL_ZOOM_RATIO;
                f = (Float) request.get(key);
            }
            if (f == null) {
                return;
            }
            if (this.e == f.floatValue()) {
                this.d.b(null);
                this.d = null;
            }
        }
    }

    @Override // defpackage.anv
    public final void f() {
        this.c = 1.0f;
        kfb kfbVar = this.d;
        if (kfbVar != null) {
            kfbVar.c(new atb("Camera is not active."));
            this.d = null;
        }
    }

    @Override // defpackage.anv
    public final void g(float f, kfb kfbVar) {
        this.c = f;
        kfb kfbVar2 = this.d;
        if (kfbVar2 != null) {
            kfbVar2.c(new atb("There is a new zoomRatio being set"));
        }
        this.e = this.c;
        this.d = kfbVar;
    }
}
