package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bph implements bhg {
    public final bfh a;

    bph() {
        this(bfh.a());
    }

    @Override // defpackage.bhg
    public final /* bridge */ /* synthetic */ bhh c() {
        return new bpi(bfn.f(this.a));
    }

    @Override // defpackage.aub
    public final bfh f() {
        return this.a;
    }

    public bph(bfh bfhVar) {
        this.a = bfhVar;
        Class cls = (Class) bfhVar.m(bli.n, null);
        if (cls != null && !cls.equals(bpg.class)) {
            throw new IllegalArgumentException(a.j(cls, this, "Invalid target class configuration for ", ": "));
        }
        bfhVar.c(bhh.x, bhj.STREAM_SHARING);
        bfhVar.c(bli.n, bpg.class);
        if (bfhVar.m(bli.m, null) == null) {
            bfhVar.c(bli.m, a.u(bpg.class));
        }
    }
}
