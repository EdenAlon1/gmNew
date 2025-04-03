package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggo extends hvh implements isu, itu {
    @Override // defpackage.itu
    public final ipo b(ipq ipqVar, ipl iplVar, long j) {
        ipo ei;
        float c = ffmk.c(((jzq) isv.a(this, gex.a)).a, 0.0f);
        iqk e = iplVar.e(j);
        boolean z = this.z && !Float.isNaN(c) && Float.compare(c, 0.0f) > 0;
        int eo = Float.isNaN(c) ? 0 : ipqVar.eo(c);
        int max = z ? Math.max(e.a, eo) : e.a;
        int max2 = z ? Math.max(e.b, eo) : e.b;
        ei = ipqVar.ei(max, max2, ffem.a, new ggn(max, e, max2));
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
