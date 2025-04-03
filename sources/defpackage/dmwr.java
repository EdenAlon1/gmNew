package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmwr {
    public static final void a(final hvi hviVar, final dmvq dmvqVar, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        hviVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(-977599828);
        if (i3 == 0) {
            i2 = i | (true != b.D(hviVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dmvqVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            String str = dmvqVar.a;
            ffix ffixVar = dmvqVar.f;
            doas doasVar = dmvqVar.e;
            b.v(-1715217906);
            hpn d = doasVar == null ? null : hpx.d(1619950758, new dmwm(doasVar), b);
            ((hfm) b).Z();
            hfdVar2 = b;
            dweq.a(ffixVar, hpx.d(-319590556, new dmwn(dmvqVar), b), hviVar, d, hpx.d(1388464257, new dmwo(dmvqVar), b), hpx.d(526160096, new dmwp(str), b), hpx.d(-336144065, new dmwq(dmvqVar), b), null, 0L, 0.0f, 0L, 0L, 0L, null, hfdVar2, ((i2 << 6) & 896) | 1794096, 0, 16256);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmwk
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    int i4 = i;
                    dmwr.a(hviVar2, dmvqVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dmvp dmvpVar, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1322571187);
        if (i3 == 0) {
            i2 = (true != b.D(dmvpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            b.v(412401879);
            hfdVar2 = b;
            dnac.a(dmvpVar.a, null, ebs.k(hvi.e, 64.0f), null, null, null, null, null, 0.0f, null, null, null, "verification_dialog_glide_icon", null, null, null, hfdVar2, 432, 196608, 491512);
            ((hfm) hfdVar2).Z();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmwl
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dmwr.b(dmvp.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
