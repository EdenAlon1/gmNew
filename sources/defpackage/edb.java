package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edb extends hvh implements itu {
    public ffjm a;
    public int b;

    public edb(int i, ffjm ffjmVar) {
        this.b = i;
        this.a = ffjmVar;
    }

    @Override // defpackage.itu
    public final ipo b(ipq ipqVar, ipl iplVar, long j) {
        ipo ei;
        int i = this.b;
        iqk e = iplVar.e(jzl.d(i != 1 ? 0 : jzk.d(j), jzk.b(j), i == 2 ? jzk.c(j) : 0, jzk.a(j)));
        int i2 = ffmk.i(e.a, jzk.d(j), jzk.b(j));
        int i3 = ffmk.i(e.b, jzk.c(j), jzk.a(j));
        ei = ipqVar.ei(i2, i3, ffem.a, new eda(this, i2, e, i3, ipqVar));
        return ei;
    }

    @Override // defpackage.itu
    public final /* synthetic */ int e(iny inyVar, inx inxVar, int i) {
        return itt.a(this, inyVar, inxVar, i);
    }

    @Override // defpackage.itu
    public final /* synthetic */ int f(iny inyVar, inx inxVar, int i) {
        return itt.b(this, inyVar, inxVar, i);
    }

    @Override // defpackage.itu
    public final /* synthetic */ int g(iny inyVar, inx inxVar, int i) {
        return itt.c(this, inyVar, inxVar, i);
    }

    @Override // defpackage.itu
    public final /* synthetic */ int h(iny inyVar, inx inxVar, int i) {
        return itt.d(this, inyVar, inxVar, i);
    }
}
