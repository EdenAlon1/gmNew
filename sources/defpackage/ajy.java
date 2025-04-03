package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajy implements bgf {
    static final ajy a = new ajy();

    @Override // defpackage.bgf
    public final void a(Size size, bhh bhhVar, bgc bgcVar) {
        bgk v = bhhVar.v();
        bdp bdpVar = bfn.b;
        int b = bgk.d().b();
        if (v != null) {
            b = v.b();
            bgcVar.c(v.c);
            bgcVar.e(v.d);
            bgcVar.d(v.e());
            bdpVar = v.c();
        }
        bgcVar.r(bdpVar);
        if (bhhVar instanceof bfq) {
            Rational rational = arn.a;
            if (((PreviewPixelHDRnetQuirk) ara.a(PreviewPixelHDRnetQuirk.class)) != null && !arn.a.equals(new Rational(size.getWidth(), size.getHeight()))) {
                afl aflVar = new afl();
                aflVar.d(CaptureRequest.TONEMAP_MODE, 2);
                bgcVar.h(aflVar.a());
            }
        }
        afm afmVar = new afm(bhhVar);
        bgcVar.t(afmVar.a(b));
        bgcVar.g((CameraDevice.StateCallback) afmVar.g.m(afm.c, new ake()));
        bgcVar.l((CameraCaptureSession.StateCallback) afmVar.g.m(afm.d, new akc()));
        bgcVar.f(new akj(afmVar.b(new ahx())));
        bgcVar.u(bhhVar.d());
        bgcVar.s(bhhVar.b());
        bfh a2 = bfh.a();
        a2.c(afm.f, afmVar.e());
        bdp bdpVar2 = afmVar.g;
        bdn bdnVar = afm.b;
        Long l = (Long) bdpVar2.m(bdnVar, -1L);
        l.longValue();
        a2.c(bdnVar, l);
        bgcVar.h(a2);
        bgcVar.h(afmVar.c());
    }
}
