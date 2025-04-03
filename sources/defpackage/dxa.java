package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dxa extends hvh implements itu {
    public imq a;
    public float b;
    public float c;

    public dxa(imq imqVar, float f, float f2) {
        this.a = imqVar;
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.itu
    public final ipo b(ipq ipqVar, ipl iplVar, long j) {
        long j2;
        long m;
        ipo ei;
        imq imqVar = this.a;
        boolean z = imqVar instanceof inv;
        float f = this.b;
        float f2 = this.c;
        if (z) {
            j2 = j;
            m = jzk.m(j2, 0, 0, 0, 0, 11);
        } else {
            j2 = j;
            m = jzk.m(j2, 0, 0, 0, 0, 14);
        }
        iqk e = iplVar.e(m);
        int eh = e.eh(imqVar);
        if (eh == Integer.MIN_VALUE) {
            eh = 0;
        }
        int i = z ? e.b : e.a;
        int a = (z ? jzk.a(j2) : jzk.b(j2)) - i;
        int i2 = ffmk.i((!Float.isNaN(f) ? ipqVar.eo(f) : 0) - eh, 0, a);
        int i3 = ffmk.i(((!Float.isNaN(f2) ? ipqVar.eo(f2) : 0) - i) + eh, 0, a - i2);
        int max = z ? e.a : Math.max(e.a + i2 + i3, jzk.d(j2));
        int max2 = z ? Math.max(e.b + i2 + i3, jzk.c(j2)) : e.b;
        int i4 = max;
        ei = ipqVar.ei(i4, max2, ffem.a, new dwy(imqVar, f, i2, i4, i3, e, max2));
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
