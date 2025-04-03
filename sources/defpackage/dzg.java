package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzg extends hvh implements itu {
    public float a;
    public int b;

    public dzg(int i, float f) {
        this.b = i;
        this.a = f;
    }

    @Override // defpackage.itu
    public final ipo b(ipq ipqVar, ipl iplVar, long j) {
        int d;
        int b;
        int a;
        int i;
        ipo ei;
        if (!jzk.i(j) || this.b == 1) {
            d = jzk.d(j);
            b = jzk.b(j);
        } else {
            float b2 = jzk.b(j) * this.a;
            int d2 = jzk.d(j);
            d = jzk.b(j);
            int round = Math.round(b2);
            if (round >= d2) {
                d2 = round;
            }
            if (d2 <= d) {
                d = d2;
            }
            b = d;
        }
        if (!jzk.h(j) || this.b == 2) {
            int c = jzk.c(j);
            a = jzk.a(j);
            i = c;
        } else {
            float a2 = jzk.a(j) * this.a;
            int c2 = jzk.c(j);
            i = jzk.a(j);
            int round2 = Math.round(a2);
            if (round2 >= c2) {
                c2 = round2;
            }
            if (c2 <= i) {
                i = c2;
            }
            a = i;
        }
        iqk e = iplVar.e(jzl.d(d, b, i, a));
        ei = ipqVar.ei(e.a, e.b, ffem.a, new dzf(e));
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
