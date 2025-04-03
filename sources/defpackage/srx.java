package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class srx {
    public static final void a(final srq srqVar, final cyq cyqVar, final cyq cyqVar2, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1698094240);
        if (i3 == 0) {
            i2 = (true != b.D(srqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(cyqVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(cyqVar2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(hviVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            b.v(1840106499);
            b.v(1607292936);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                hic hicVar = new hic(srqVar, hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            hho hhoVar = (hho) R;
            hfmVar.Z();
            if (srqVar != null && !ffkj.e(srqVar, d(hhoVar))) {
                hhoVar.b(srqVar);
            }
            ffcf ffcfVar = new ffcf(d(hhoVar), Boolean.valueOf(srqVar != null));
            hfmVar.Z();
            srq srqVar2 = (srq) ffcfVar.a;
            boolean booleanValue = ((Boolean) ffcfVar.b).booleanValue();
            b.v(-1247164676);
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                R2 = new ffji() { // from class: srt
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(-((Integer) obj).intValue());
                    }
                };
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            cue e = ctt.e(cyqVar, (ffji) R2);
            b.v(-1247162180);
            Object R3 = hfmVar.R();
            if (R3 == hfc.a) {
                R3 = new ffji() { // from class: sru
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(-((Integer) obj).intValue());
                    }
                };
                hfmVar.ad(R3);
            }
            hfmVar.Z();
            cru.b(booleanValue, null, e, ctt.h(cyqVar2, (ffji) R3), null, hpx.d(-351007864, new srw(srqVar2, hviVar), b), b, 196608, 18);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: srv
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    srq srqVar3 = srq.this;
                    cyq cyqVar3 = cyqVar;
                    cyq cyqVar4 = cyqVar2;
                    srx.a(srqVar3, cyqVar3, cyqVar4, hviVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(srq srqVar, hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        final srq srqVar2;
        final hvi hviVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1916634779);
        if (i3 == 0) {
            i2 = (true != b.D(srqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            srqVar2 = srqVar;
            hviVar2 = hviVar;
        } else {
            cyq cyqVar = dooy.c(b).a;
            cyq cyqVar2 = dooy.c(b).b;
            b.v(1460848880);
            srqVar2 = srqVar;
            hviVar2 = hviVar;
            a(srqVar2, cyqVar, cyqVar2, hviVar2, b, (i2 & 14) | ((i2 << 6) & 7168));
            ((hfm) b).Z();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: srs
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    srq srqVar3 = srq.this;
                    int i4 = i;
                    srx.b(srqVar3, hviVar2, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final srq srqVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(285504848);
        if (i3 == 0) {
            i2 = (true != b.D(srqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else if (srqVar != null) {
            if (srqVar instanceof ssy) {
                b.v(-381068666);
                stb.a((ssy) srqVar, hviVar, b, i2 & 112);
                ((hfm) b).Z();
            } else if (srqVar instanceof std) {
                b.v(-381066709);
                stf.a((std) srqVar, hviVar, b, i2 & 112);
                ((hfm) b).Z();
            } else {
                b.v(1071869654);
                ((hfm) b).Z();
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: srr
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    srq srqVar2 = srq.this;
                    int i4 = i;
                    srx.c(srqVar2, hviVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    private static final srq d(hho hhoVar) {
        return (srq) hhoVar.a();
    }
}
