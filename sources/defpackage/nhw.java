package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nhw implements nht {
    private final int a;
    private final int b;
    private final luv c;

    public nhw(lvj lvjVar, lqc lqcVar) {
        luv luvVar = lvjVar.a;
        this.c = luvVar;
        luvVar.K(12);
        int m = luvVar.m();
        if ("audio/raw".equals(lqcVar.o)) {
            int n = lvf.n(lqcVar.G, lqcVar.E);
            if (m == 0 || m % n != 0) {
                luj.f("BoxParsers", a.r(m, n, "Audio sample size mismatch. stsd sample size: ", ", stsz sample size: "));
                m = n;
            }
        }
        this.a = m == 0 ? -1 : m;
        this.b = luvVar.m();
    }

    @Override // defpackage.nht
    public final int a() {
        return this.a;
    }

    @Override // defpackage.nht
    public final int b() {
        return this.b;
    }

    @Override // defpackage.nht
    public final int c() {
        int i = this.a;
        return i == -1 ? this.c.m() : i;
    }
}
