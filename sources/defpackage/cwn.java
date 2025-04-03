package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwn {
    public static final dac a = cxu.b(0.0f, 400.0f, ddh.a, 1);
    public static final cwd c = new cwd();
    public static final cwc d = new Object() { // from class: cwc
    };
    public static final cop b = new cop((byte[]) null);

    public static final void a(ffjo ffjoVar, hfd hfdVar, int i) {
        int i2;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(-2093217917);
        if (i3 == 0) {
            i2 = (true != b2.F(ffjoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (b2.J((i2 & 3) != 2, i2 & 1)) {
            ipk.a(hpx.d(-863967934, new cwl(ffjoVar), b2), b2, 6);
        } else {
            b2.s();
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new cwm(ffjoVar, i);
        }
    }

    public static final void b(hvi hviVar, ffjn ffjnVar, hfd hfdVar, int i) {
        int i2 = i & 48;
        int i3 = i | 6;
        hfd b2 = hfdVar.b(2043053727);
        if (i2 == 0) {
            i3 |= true != b2.F(ffjnVar) ? 16 : 32;
        }
        if (b2.J((i3 & 19) != 18, i3 & 1)) {
            hviVar = hvi.e;
            a(hpx.d(-130587847, new cwe(ffjnVar), b2), b2, 6);
        } else {
            b2.s();
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new cwf(hviVar, ffjnVar, i);
        }
    }
}
