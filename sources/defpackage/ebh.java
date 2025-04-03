package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebh extends hvh implements itu {
    public ebe a;

    public ebh(ebe ebeVar) {
        this.a = ebeVar;
    }

    @Override // defpackage.itu
    public final ipo b(ipq ipqVar, ipl iplVar, long j) {
        ipo ei;
        float b = this.a.b(ipqVar.q());
        float d = this.a.d();
        float c = this.a.c(ipqVar.q());
        float a = this.a.a();
        if (!((Float.compare(b, 0.0f) >= 0) & (Float.compare(d, 0.0f) >= 0) & (Float.compare(c, 0.0f) >= 0) & (Float.compare(a, 0.0f) >= 0))) {
            edc.a("Padding must be non-negative");
        }
        int eo = ipqVar.eo(b);
        int eo2 = ipqVar.eo(c) + eo;
        int eo3 = ipqVar.eo(d);
        int eo4 = ipqVar.eo(a) + eo3;
        iqk e = iplVar.e(jzl.h(j, -eo2, -eo4));
        ei = ipqVar.ei(jzl.c(j, e.a + eo2), jzl.b(j, e.b + eo4), ffem.a, new ebg(e, eo, eo3));
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
