package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czg {
    public final hne a = new hne(new cza[16]);
    private final hho d = new hic(false, hla.a);
    public long b = Long.MIN_VALUE;
    public final hho c = new hic(true, hla.a);

    public final void a(hfd hfdVar, int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-318043801);
        if (i3 == 0) {
            i2 = (true != b.F(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (b.J((i2 & 3) != 2, i2 & 1)) {
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                hic hicVar = new hic(null, hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            hho hhoVar = (hho) R;
            if (((Boolean) this.c.a()).booleanValue() || ((Boolean) this.d.a()).booleanValue()) {
                b.v(1719883733);
                boolean F = b.F(this);
                Object R2 = hfmVar.R();
                if (F || R2 == hfc.a) {
                    R2 = new cze(hhoVar, this, null);
                    hfmVar.ad(R2);
                }
                hgs.g(this, (ffjm) R2, b);
                hfmVar.Z();
            } else {
                b.v(1721270456);
                hfmVar.Z();
            }
        } else {
            b.s();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new czf(this, i);
        }
    }

    public final void b(boolean z) {
        this.d.b(Boolean.valueOf(z));
    }
}
