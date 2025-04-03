package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejp {
    public static final void a(ffix ffixVar, hvi hviVar, ekh ekhVar, ffjm ffjmVar, hfd hfdVar, int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(2002163445);
        if (i3 == 0) {
            i2 = (true != b.F(ffixVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(ekhVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(ffjmVar) ? 1024 : 2048;
        }
        if (b.J((i2 & 1171) != 1170, i2 & 1)) {
            elm.a(hpx.d(-1488997347, new ejn(ekhVar, hviVar, ffjmVar, hku.a(ffixVar, b)), b), b, 6);
        } else {
            b.s();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ejo(ffixVar, hviVar, ekhVar, ffjmVar, i);
        }
    }
}
