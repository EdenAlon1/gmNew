package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eca extends hvh implements itu {
    public float a;
    public float b;

    public eca(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.itu
    public final ipo b(ipq ipqVar, ipl iplVar, long j) {
        int d;
        int c;
        ipo ei;
        if (Float.isNaN(this.a) || jzk.d(j) != 0) {
            d = jzk.d(j);
        } else {
            int eo = ipqVar.eo(this.a);
            d = jzk.b(j);
            if (eo < 0) {
                eo = 0;
            }
            if (eo <= d) {
                d = eo;
            }
        }
        int b = jzk.b(j);
        if (Float.isNaN(this.b) || jzk.c(j) != 0) {
            c = jzk.c(j);
        } else {
            int eo2 = ipqVar.eo(this.b);
            c = jzk.a(j);
            int i = eo2 >= 0 ? eo2 : 0;
            if (i <= c) {
                c = i;
            }
        }
        iqk e = iplVar.e(jzl.d(d, b, c, jzk.a(j)));
        ei = ipqVar.ei(e.a, e.b, ffem.a, new ebz(e));
        return ei;
    }

    @Override // defpackage.itu
    public final int e(iny inyVar, inx inxVar, int i) {
        int a = inxVar.a(i);
        int eo = !Float.isNaN(this.b) ? inyVar.eo(this.b) : 0;
        return a < eo ? eo : a;
    }

    @Override // defpackage.itu
    public final int f(iny inyVar, inx inxVar, int i) {
        int b = inxVar.b(i);
        int eo = !Float.isNaN(this.a) ? inyVar.eo(this.a) : 0;
        return b < eo ? eo : b;
    }

    @Override // defpackage.itu
    public final int g(iny inyVar, inx inxVar, int i) {
        int c = inxVar.c(i);
        int eo = !Float.isNaN(this.b) ? inyVar.eo(this.b) : 0;
        return c < eo ? eo : c;
    }

    @Override // defpackage.itu
    public final int h(iny inyVar, inx inxVar, int i) {
        int d = inxVar.d(i);
        int eo = !Float.isNaN(this.a) ? inyVar.eo(this.a) : 0;
        return d < eo ? eo : d;
    }
}
