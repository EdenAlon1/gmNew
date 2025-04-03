package defpackage;

import android.hardware.camera2.CameraCharacteristics;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alt extends ffkk implements ffix {
    final /* synthetic */ alw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alt(alw alwVar) {
        super(0);
        this.a = alwVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        int[] iArr = (int[]) this.a.a.c(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z = false;
        if (iArr != null) {
            int i = 0;
            while (true) {
                if (i >= iArr.length) {
                    break;
                }
                if (iArr[i] == 9) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        return Boolean.valueOf(z);
    }
}
