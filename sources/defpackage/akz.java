package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akz implements anv {
    private final apd a;
    private kfb c;
    private Rect b = null;
    private Rect d = null;

    public akz(apd apdVar) {
        this.a = apdVar;
    }

    private final Rect h() {
        Rect rect = (Rect) this.a.c(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        ksw.h(rect);
        return rect;
    }

    @Override // defpackage.anv
    public final float a() {
        Float f = (Float) this.a.c(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f != null && f.floatValue() >= 1.0f) {
            return f.floatValue();
        }
        return 1.0f;
    }

    @Override // defpackage.anv
    public final float b() {
        return 1.0f;
    }

    @Override // defpackage.anv
    public final Rect c() {
        Rect rect = this.b;
        return rect != null ? rect : h();
    }

    @Override // defpackage.anv
    public final void d(afl aflVar) {
        if (this.b != null) {
            aflVar.e(CaptureRequest.SCALER_CROP_REGION, this.b, bdo.REQUIRED);
        }
    }

    @Override // defpackage.anv
    public final void e(TotalCaptureResult totalCaptureResult) {
        if (this.c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = this.d;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            this.c.b(null);
            this.c = null;
            this.d = null;
        }
    }

    @Override // defpackage.anv
    public final void f() {
        this.d = null;
        this.b = null;
        kfb kfbVar = this.c;
        if (kfbVar != null) {
            kfbVar.c(new atb("Camera is not active."));
            this.c = null;
        }
    }

    @Override // defpackage.anv
    public final void g(float f, kfb kfbVar) {
        Rect h = h();
        float width = h.width();
        float height = h.height();
        float width2 = h.width();
        float f2 = height / f;
        float height2 = (h.height() - f2) / 2.0f;
        float f3 = width / f;
        float f4 = (width2 - f3) / 2.0f;
        this.b = new Rect((int) f4, (int) height2, (int) (f3 + f4), (int) (f2 + height2));
        kfb kfbVar2 = this.c;
        if (kfbVar2 != null) {
            kfbVar2.c(new atb("There is a new zoomRatio being set"));
        }
        this.d = this.b;
        this.c = kfbVar;
    }
}
