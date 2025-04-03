package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alz {
    public final Object a = new Object();
    public boolean b = false;
    public boolean c;
    final agi d;
    private final agj e;
    private final boolean f;

    public alz(agj agjVar, apd apdVar) {
        this.e = agjVar;
        boolean a = a(apdVar);
        this.f = a;
        new llg(-1);
        agi agiVar = new agi() { // from class: aly
            @Override // defpackage.agi
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return false;
            }
        };
        this.d = agiVar;
        if (a) {
            agjVar.o(agiVar);
        }
    }

    static boolean a(apd apdVar) {
        int[] iArr;
        if (Build.VERSION.SDK_INT > 34 && (iArr = (int[]) apdVar.c(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES)) != null) {
            for (int i : iArr) {
                if (i == 6) {
                    return true;
                }
            }
        }
        return false;
    }
}
