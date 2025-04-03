package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djis implements fbbf {
    private final djit a;
    private final int b;

    public djis(djit djitVar, int i) {
        this.a = djitVar;
        this.b = i;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final Object b() {
        int i = this.b;
        if (i == 0) {
            djjc m = this.a.a.m();
            m.getClass();
            return m;
        }
        if (i != 1) {
            errl v = this.a.a.v();
            v.getClass();
            return v;
        }
        dkel p = this.a.a.p();
        p.getClass();
        return p;
    }
}
