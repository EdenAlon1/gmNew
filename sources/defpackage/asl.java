package defpackage;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asl implements aub {
    public final bfh a = bfh.a();

    public static asl a(bdp bdpVar) {
        asl aslVar = new asl();
        bdpVar.u(new ask(aslVar, bdpVar));
        return aslVar;
    }

    public final asm b() {
        return new asm(bfn.f(this.a));
    }

    public final void c(CaptureRequest.Key key, Object obj) {
        this.a.c(afm.d(key), obj);
    }

    @Override // defpackage.aub
    public final bfh f() {
        throw null;
    }
}
