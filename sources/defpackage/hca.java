package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hca {
    public static final void a(long j, jpo jpoVar, ffjm ffjmVar, hfd hfdVar, int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-716124955);
        if (i3 == 0) {
            i2 = (true != b.C(j) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(jpoVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffjmVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            hfz.b(new hil[]{fzc.a.c(new ibw(j)), grl.a.c(((jpo) b.e(grl.a)).m(jpoVar))}, ffjmVar, b, ((i2 >> 3) & 112) | 8);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new hbz(j, jpoVar, ffjmVar, i);
        }
    }
}
