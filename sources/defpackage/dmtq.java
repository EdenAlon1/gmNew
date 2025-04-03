package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmtq {
    public static final void a(final hvi hviVar, final dmve dmveVar, hfd hfdVar, final int i) {
        int i2;
        hpn d;
        long b;
        hfd hfdVar2;
        hviVar.getClass();
        int i3 = i & 6;
        hfd b2 = hfdVar.b(-1516118501);
        if (i3 == 0) {
            i2 = i | (true != b2.D(hviVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.D(dmveVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b2.I()) {
            b2.s();
            hfdVar2 = b2;
        } else {
            dmzz dmzzVar = dmveVar.c;
            String str = dmveVar.d;
            ffix ffixVar = dmveVar.i;
            b2.v(-2055180876);
            hpn d2 = dmzzVar == null ? null : hpx.d(2111198353, new dmtg(dmzzVar), b2);
            hfm hfmVar = (hfm) b2;
            hfmVar.Z();
            b2.v(-2055177522);
            hpn d3 = str != null ? hpx.d(1106741809, new dmti(str), b2) : null;
            hfmVar.Z();
            if (dmveVar.e) {
                b2.v(714160361);
                d = hpx.d(-859932344, new dmtk(dmveVar), b2);
                hfmVar.Z();
            } else {
                b2.v(714316136);
                d = hpx.d(-1034530849, new dmtl(dmveVar), b2);
                hfmVar.Z();
            }
            if (dmveVar.f) {
                b2.v(714714641);
                b = gft.a(b2).w;
                hfmVar.Z();
            } else {
                b2.v(714769356);
                b = dwek.b(b2);
                hfmVar.Z();
            }
            hfdVar2 = b2;
            dweq.a(ffixVar, hpx.d(-1670386077, new dmtn(dmveVar), b2), hviVar, hpx.d(-1243831579, new dmtp(dmveVar), b2), d2, d3, d, null, 0L, 0.0f, b, 0L, 0L, null, hfdVar2, ((i2 << 6) & 896) | 3120, 0, 15232);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmtf
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    int i4 = i;
                    dmtq.a(hviVar2, dmveVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
