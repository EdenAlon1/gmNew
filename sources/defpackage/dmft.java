package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmft {
    public static final void a(final dmfu dmfuVar, final hvi hviVar, final idh idhVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        long j;
        hfd b = hfdVar.b(-202065262);
        if ((i & 6) == 0) {
            i2 = (true != b.D(dmfuVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= true != b.D(idhVar) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && b.I()) {
            b.s();
        } else {
            b.t();
            if ((i & 1) == 0 || b.G()) {
                hviVar = hvi.e;
            } else {
                b.s();
            }
            b.l();
            d = ebs.d(hviVar, 1.0f);
            hvi u = ebs.u(d, 40.0f, 0.0f, 2);
            if (dmfuVar.c) {
                b.v(-1098324605);
                j = dmfv.a(dmfuVar, b);
                ((hfm) b).Z();
            } else {
                b.v(-1098267596);
                j = gft.a(b).B;
                ((hfm) b).Z();
            }
            gpa.c(u, idhVar, dmfv.a(dmfuVar, b), 0L, 0.0f, 0.0f, des.a(1.0f, j), hpx.d(-1648320403, new dmfs(dmfuVar), b), b, 56);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmfr
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmfu dmfuVar2 = dmfu.this;
                    hvi hviVar2 = hviVar;
                    int i4 = i;
                    dmft.a(dmfuVar2, hviVar2, idhVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
