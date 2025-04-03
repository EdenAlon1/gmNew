package defpackage;

import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aul implements bes, bhg {
    public final bfh a;

    public aul() {
        this(bfh.a());
    }

    static aul a(bdp bdpVar) {
        return new aul(bfh.b(bdpVar));
    }

    @Override // defpackage.bhg
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ben c() {
        return new ben(bfn.f(this.a));
    }

    @Override // defpackage.bes
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void e(boy boyVar) {
        this.a.c(bet.M, boyVar);
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
        this.a.c(bet.F, Integer.valueOf(i));
    }

    private aul(bfh bfhVar) {
        this.a = bfhVar;
        Class cls = (Class) bfhVar.m(bli.n, null);
        if (cls != null && !cls.equals(auo.class)) {
            throw new IllegalArgumentException(a.j(cls, this, "Invalid target class configuration for ", ": "));
        }
        bfhVar.c(bhh.x, bhj.IMAGE_ANALYSIS);
        bfhVar.c(bhh.n, auo.class);
        if (bfhVar.m(bhh.m, null) == null) {
            bfhVar.c(bhh.m, a.u(auo.class));
        }
    }
}
