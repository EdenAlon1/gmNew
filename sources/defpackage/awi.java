package defpackage;

import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awi implements bhg, bes {
    public final bfh a;

    public awi() {
        this(bfh.a());
    }

    static awi a(bdp bdpVar) {
        return new awi(bfh.b(bdpVar));
    }

    public final awl b() {
        bfq c = c();
        ber.d(c);
        return new awl(c);
    }

    @Override // defpackage.bhg
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final bfq c() {
        return new bfq(bfn.f(this.a));
    }

    @Override // defpackage.aub
    public final bfh f() {
        return this.a;
    }

    @Override // defpackage.bes
    @Deprecated
    public final /* bridge */ /* synthetic */ void g(Size size) {
        this.a.c(bet.I, size);
    }

    @Override // defpackage.bes
    public final /* bridge */ /* synthetic */ void h(int i) {
        bfh bfhVar = this.a;
        bdn bdnVar = bfq.F;
        Integer valueOf = Integer.valueOf(i);
        bfhVar.c(bdnVar, valueOf);
        this.a.c(bet.G, valueOf);
    }

    public final void i(aua auaVar) {
        this.a.c(beq.o, auaVar);
    }

    @Override // defpackage.bes
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void e(boy boyVar) {
        this.a.c(bet.M, boyVar);
    }

    public final void k(String str) {
        this.a.c(bfq.m, str);
    }

    private awi(bfh bfhVar) {
        this.a = bfhVar;
        Class cls = (Class) bfhVar.m(bli.n, null);
        if (cls != null && !cls.equals(awl.class)) {
            throw new IllegalArgumentException(a.j(cls, this, "Invalid target class configuration for ", ": "));
        }
        bfhVar.c(bhh.x, bhj.PREVIEW);
        bfhVar.c(bfq.n, awl.class);
        if (bfhVar.m(bfq.m, null) == null) {
            k(a.u(awl.class));
        }
        if (((Integer) bfhVar.m(bet.H, -1)).intValue() == -1) {
            bfhVar.c(bet.H, 2);
        }
    }
}
