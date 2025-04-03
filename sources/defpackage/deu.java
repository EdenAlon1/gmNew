package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class deu {
    public static final void a(hvi hviVar, ffji ffjiVar, hfd hfdVar, int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-932836462);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffjiVar) ? 16 : 32;
        }
        if (b.J((i2 & 19) != 18, i2 & 1)) {
            ebv.a(hxs.a(hviVar, ffjiVar), b);
        } else {
            b.s();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new det(hviVar, ffjiVar, i);
        }
    }
}
