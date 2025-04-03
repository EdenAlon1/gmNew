package defpackage;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alx extends ahy {
    static final alx b = new alx();

    private alx() {
    }

    @Override // defpackage.ahy, defpackage.bdj
    public final void a(bhh bhhVar, bdi bdiVar) {
        CaptureRequest.Key key;
        CaptureRequest.Key key2;
        super.a(bhhVar, bdiVar);
        if (!(bhhVar instanceof beo)) {
            throw new IllegalArgumentException("config is not ImageCaptureConfig");
        }
        afl aflVar = new afl();
        if (bfy.g(bhhVar, beo.a)) {
            int C = ((beo) bhhVar).C();
            if (((ImageCapturePixelHDRPlusQuirk) ara.a(ImageCapturePixelHDRPlusQuirk.class)) != null) {
                if (C == 0) {
                    key = CaptureRequest.CONTROL_ENABLE_ZSL;
                    aflVar.d(key, true);
                } else if (C == 1) {
                    key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
                    aflVar.d(key2, false);
                }
            }
        }
        bdiVar.f(aflVar.a());
    }
}
