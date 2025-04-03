package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ipk {
    public static final void a(ffjn ffjnVar, hfd hfdVar, int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1078066484);
        if (i3 == 0) {
            i2 = (true != b.F(ffjnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (b.J((i2 & 3) != 2, i2 & 1)) {
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new ipf();
                hfmVar.ad(R);
            }
            ipf ipfVar = (ipf) R;
            ipg ipgVar = ipg.a;
            b.x();
            if (hfmVar.z) {
                b.j(ipgVar);
            } else {
                b.z();
            }
            hlc.a(b, iph.a);
            hlc.b(b, ipfVar, ipi.a);
            ffjnVar.a(ipfVar, b, Integer.valueOf((i2 << 3) & 112));
            b.n();
        } else {
            b.s();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ipj(ffjnVar, i);
        }
    }
}
