package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebc extends hvh implements itu {
    public float a;
    public float b;
    public float c;
    public float d;
    public boolean e = true;

    public ebc(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.itu
    public final ipo b(ipq ipqVar, ipl iplVar, long j) {
        ipo ei;
        int eo = ipqVar.eo(this.a) + ipqVar.eo(this.c);
        int eo2 = ipqVar.eo(this.b) + ipqVar.eo(this.d);
        iqk e = iplVar.e(jzl.h(j, -eo, -eo2));
        int i = e.a + eo;
        int i2 = e.b + eo2;
        ei = ipqVar.ei(jzl.c(j, i), jzl.b(j, i2), ffem.a, new ebb(this, e, ipqVar));
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
