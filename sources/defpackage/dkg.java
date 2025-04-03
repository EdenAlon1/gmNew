package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkg {
    public final hss a = new hss();

    public final void a(djw djwVar, hfd hfdVar, int i) {
        int i2 = i & 6;
        hfd b = hfdVar.b(1320309496);
        int i3 = i2 == 0 ? (true != b.D(djwVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != b.D(this) ? 16 : 32;
        }
        if (b.J((i3 & 19) != 18, i3 & 1)) {
            hss hssVar = this.a;
            int a = hssVar.a();
            for (int i4 = 0; i4 < a; i4++) {
                ((ffjn) hssVar.get(i4)).a(djwVar, b, Integer.valueOf(i3 & 14));
            }
        } else {
            b.s();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new dke(this, djwVar, i);
        }
    }
}
