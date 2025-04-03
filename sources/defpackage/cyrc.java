package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyrc {
    public static final void a(final cyrt cyrtVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1692652074);
        if (i3 == 0) {
            i2 = (true != b.D(cyrtVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            dwhr.a(cyqw.a, null, null, null, hpx.d(48340744, new cyqy(cyrtVar.a), b), hpx.d(-296575001, new cyrb(cyrtVar.d, cyrtVar), b), dwhp.a(gft.a(b).D, b, 510), b, 221190, 398);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cyqx
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    cyrc.a(cyrt.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
