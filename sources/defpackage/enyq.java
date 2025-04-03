package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enyq {
    public final enxz a;
    public final double b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    private final enxp g;
    private enxp h;

    public enyq(enxz enxzVar, double d) {
        this.a = enxzVar;
        this.b = d;
        if (enxzVar.E()) {
            double d2 = 1.0d + d;
            double d3 = -d2;
            this.g = new enxp(new enxo(d3, d2), new enxo(d3, d2));
            double d4 = -d;
            this.h = new enxp(new enxo(d4, d), new enxo(d4, d));
            this.d = 0;
            this.c = 0;
            this.e = enxzVar.b() & 1;
            this.f = 0;
            return;
        }
        long q = enxzVar.q();
        int c = enxz.c(q);
        int d5 = enxz.d(q);
        this.e = enxz.e(q);
        int h = enxzVar.h();
        this.f = h;
        enxp enxpVar = new enxp();
        int g = enxz.g(h);
        enxz.A(c, g, enxpVar.a);
        enxz.A(d5, g, enxpVar.b);
        this.g = enxpVar.b(d);
        int i = -enxz.g(h);
        this.c = c & i;
        this.d = i & d5;
    }

    public final enxp a() {
        if (this.h == null) {
            int i = this.f;
            int i2 = this.c;
            int i3 = this.d;
            double d = this.b;
            long j = i2;
            long g = enxz.g(i);
            enxv enxvVar = enzn.a;
            double c = enzn.c(enzn.b(j + j + g));
            enxo enxoVar = new enxo(c - d, c + d);
            double d2 = this.b;
            long j2 = i3;
            double c2 = enzn.c(enzn.b(j2 + j2 + g));
            this.h = new enxp(enxoVar, new enxo(c2 - d2, c2 + d2));
        }
        return this.h;
    }

    public enyq(enyq enyqVar, int i, int i2, int i3) {
        this.b = enyqVar.b;
        enxp enxpVar = enyqVar.g;
        enxp enxpVar2 = new enxp(new enxo(enxpVar.a), new enxo(enxpVar.b));
        this.g = enxpVar2;
        int i4 = enyqVar.f + 1;
        this.f = i4;
        enxz enxzVar = enyqVar.a;
        this.a = new enxz(enxzVar.d + (((i + i) - 3) * (enxzVar.l() >>> 2)));
        int g = enxz.g(i4);
        this.c = enyqVar.c + (i2 * g);
        this.d = enyqVar.d + (g * i3);
        this.e = enyqVar.e ^ enxw.b(i);
        enxp a = enyqVar.a();
        enxo enxoVar = enxpVar2.a;
        enxo enxoVar2 = a.a;
        int i5 = i2 == 0 ? 2 : 1;
        enxn.b(i5, enxoVar, enxn.a(i5, enxoVar2));
        enxo enxoVar3 = enxpVar2.b;
        enxo enxoVar4 = a.b;
        int i6 = 1 != i3 ? 2 : 1;
        enxn.b(i6, enxoVar3, enxn.a(i6, enxoVar4));
    }
}
