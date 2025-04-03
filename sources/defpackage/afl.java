package defpackage;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afl implements aub {
    public final bfh a = bfh.a();

    public final afm a() {
        return new afm(bfn.f(this.a));
    }

    public final void b(bdp bdpVar) {
        c(bdpVar, bdo.OPTIONAL);
    }

    public final void c(bdp bdpVar, bdo bdoVar) {
        for (bdn bdnVar : bdpVar.r()) {
            this.a.d(bdnVar, bdoVar, bdpVar.l(bdnVar));
        }
    }

    public final void d(CaptureRequest.Key key, Object obj) {
        this.a.c(afm.d(key), obj);
    }

    public final void e(CaptureRequest.Key key, Object obj, bdo bdoVar) {
        this.a.d(afm.d(key), bdoVar, obj);
    }

    @Override // defpackage.aub
    public final bfh f() {
        throw null;
    }
}
