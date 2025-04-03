package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ear extends eaq {
    public boolean a = true;
    public int b;

    public ear(int i) {
        this.b = i;
    }

    @Override // defpackage.eaq
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.eaq, defpackage.itu
    public final int f(iny inyVar, inx inxVar, int i) {
        return this.b == 1 ? inxVar.d(i) : inxVar.b(i);
    }

    @Override // defpackage.eaq, defpackage.itu
    public final int h(iny inyVar, inx inxVar, int i) {
        return this.b == 1 ? inxVar.d(i) : inxVar.b(i);
    }

    @Override // defpackage.eaq
    public final long i(ipl iplVar, long j) {
        int d = this.b == 1 ? iplVar.d(jzk.a(j)) : iplVar.b(jzk.a(j));
        if (d < 0) {
            d = 0;
        }
        return jzj.d(d);
    }
}
