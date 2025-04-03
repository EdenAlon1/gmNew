package defpackage;

import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btv implements bhg, bes {
    public final bfh a;

    private btv(bfh bfhVar) {
        this.a = bfhVar;
        if (!bfhVar.s(buu.a)) {
            throw new IllegalArgumentException("VideoOutput is required");
        }
        Class cls = (Class) bfhVar.m(bli.n, null);
        if (cls != null && !cls.equals(btz.class)) {
            throw new IllegalArgumentException(a.j(cls, this, "Invalid target class configuration for ", ": "));
        }
        bfhVar.c(bhh.x, bhj.VIDEO_CAPTURE);
        bfhVar.c(bli.n, btz.class);
        if (bfhVar.m(bli.m, null) == null) {
            bfhVar.c(bli.m, a.u(btz.class));
        }
    }

    static btv a(bdp bdpVar) {
        return new btv(bfh.b(bdpVar));
    }

    @Override // defpackage.bhg
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final buu c() {
        return new buu(bfn.f(this.a));
    }

    public final void d(aua auaVar) {
        this.a.c(beq.o, auaVar);
    }

    @Override // defpackage.bes
    public final /* bridge */ /* synthetic */ void e(boy boyVar) {
        this.a.c(bet.M, boyVar);
    }

    @Override // defpackage.aub
    public final bfh f() {
        return this.a;
    }

    @Override // defpackage.bes
    public final /* bridge */ /* synthetic */ void g(Size size) {
        throw new UnsupportedOperationException("setTargetResolution is not supported.");
    }

    @Override // defpackage.bes
    public final /* bridge */ /* synthetic */ void h(int i) {
        this.a.c(bet.F, Integer.valueOf(i));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public btv(defpackage.bul r3) {
        /*
            r2 = this;
            bfh r0 = defpackage.bfh.a()
            bdn r1 = defpackage.buu.a
            r0.c(r1, r3)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btv.<init>(bul):void");
    }
}
