package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmkb {
    public static final void a(final boolean z, hfd hfdVar, final int i) {
        int i2;
        hvi c;
        int i3 = i & 6;
        hfd b = hfdVar.b(1400902942);
        if (i3 == 0) {
            i2 = (true != b.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            hvi a = dee.a(ebs.h(hvi.e, 20.0f), gft.a(b).a, eqm.a);
            b.v(-363274803);
            int i4 = i2 & 14;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (i4 == 4 || R == hfc.a) {
                R = new ffji() { // from class: dmjt
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        jkv jkvVar = (jkv) obj;
                        jkvVar.getClass();
                        if (!z) {
                            jkr.g(jkvVar);
                        }
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            c = jjs.c(a, false, (ffji) R);
            dwho.a(dnaa.a(dmzz.ad, b), null, c, gft.a(b).b, b, 48, 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmju
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    dmkb.a(z, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dmke dmkeVar, final hvi hviVar, hfd hfdVar, final int i, final int i2) {
        int i3;
        hvi c;
        int i4 = i2 & 1;
        hfd b = hfdVar.b(1971594751);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != b.D(dmkeVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && b.I()) {
            b.s();
        } else {
            if (i5 != 0) {
                hviVar = hvi.e;
            }
            b.v(-2136150616);
            int i6 = i3 & 14;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (i6 == 4 || R == hfc.a) {
                R = new ffji() { // from class: dmjv
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        jkv jkvVar = (jkv) obj;
                        jkvVar.getClass();
                        String str = dmke.this.a;
                        if (str != null) {
                            jkr.k(jkvVar, str);
                        }
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            c = jjs.c(hviVar, false, (ffji) R);
            hvi a = jfw.a(c, "circle_checkbox");
            int i7 = huo.a;
            ipn a2 = dyc.a(hum.e, false);
            int a3 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, a);
            int i8 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a2, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            b.v(-366153285);
            Object R2 = hfmVar.R();
            if (i6 == 4 || R2 == hfc.a) {
                R2 = new ffix() { // from class: dmjw
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dmke.this.c.invoke(Boolean.valueOf(!r0.b));
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            dwhl.b((ffix) R2, null, false, null, null, hpx.d(942190243, new dmka(dmkeVar), b), b, 1572864, 62);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmjx
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmke dmkeVar2 = dmke.this;
                    int i9 = i;
                    dmkb.b(dmkeVar2, hviVar, (hfd) obj, hip.a(i9 | 1), i2);
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final boolean z, hfd hfdVar, final int i) {
        int i2;
        hvi c;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1626461833);
        if (i3 == 0) {
            i2 = (true != b.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            hvi c2 = dek.c(ebs.h(hvi.e, 20.0f), 1.5f, gft.a(b).s, eqm.a);
            b.v(-853257932);
            int i4 = i2 & 14;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (i4 == 4 || R == hfc.a) {
                R = new ffji() { // from class: dmjy
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        jkv jkvVar = (jkv) obj;
                        jkvVar.getClass();
                        if (!z) {
                            jkr.g(jkvVar);
                        }
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            c = jjs.c(c2, false, (ffji) R);
            ebv.a(c, b);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmjz
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    dmkb.c(z, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
