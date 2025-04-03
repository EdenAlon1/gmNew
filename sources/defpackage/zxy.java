package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zxy {
    public static final Float a(hho hhoVar) {
        return (Float) hhoVar.a();
    }

    public static final void b(final zyd zydVar, final Long l, final dlvp dlvpVar, final idh idhVar, final boolean z, final boolean z2, hfd hfdVar, final int i) {
        int i2;
        boolean z3;
        hfd b = hfdVar.b(1046802024);
        if ((i & 6) == 0) {
            i2 = (true != b.D(zydVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(l) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(dlvpVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(idhVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.E(z) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            z3 = z2;
            i2 |= true != b.E(z3) ? 65536 : 131072;
        } else {
            z3 = z2;
        }
        if ((74899 & i2) == 74898 && b.I()) {
            b.s();
        } else {
            final zxl zxlVar = zydVar.a;
            final hkx b2 = hkt.b(zxlVar.f(), false, null, b, 2);
            b.v(1052180447);
            boolean D = b.D(zxlVar);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (D || R == hfc.a) {
                R = new hic(null, hla.a);
                hfmVar.ad(R);
            }
            final hho hhoVar = (hho) R;
            hfmVar.Z();
            b.v(1052182720);
            boolean D2 = b.D(zxlVar);
            Object R2 = hfmVar.R();
            if (D2 || R2 == hfc.a) {
                R2 = new hic(false, hla.a);
                hfmVar.ad(R2);
            }
            final hho hhoVar2 = (hho) R2;
            hfmVar.Z();
            b.v(1052185042);
            boolean D3 = b.D(zxlVar);
            Object R3 = hfmVar.R();
            if (D3 || R3 == hfc.a) {
                R3 = new ffji() { // from class: zxq
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        Float f = (Float) obj;
                        f.floatValue();
                        if (zxy.e(b2)) {
                            hho hhoVar3 = hhoVar2;
                            zxl.this.g();
                            zxy.d(hhoVar3, true);
                        }
                        zxy.c(hhoVar, f);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R3);
            }
            ffji ffjiVar = (ffji) R3;
            hfmVar.Z();
            b.v(1052192179);
            boolean D4 = b.D(zxlVar);
            int i3 = i2;
            Object R4 = hfmVar.R();
            if (D4 || R4 == hfc.a) {
                R4 = new ffix() { // from class: zxr
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        zxl zxlVar2 = zxl.this;
                        hho hhoVar3 = hhoVar;
                        Float a = zxy.a(hhoVar3);
                        if (a != null) {
                            zxlVar2.l(a.floatValue());
                        }
                        hho hhoVar4 = hhoVar2;
                        zxy.c(hhoVar3, null);
                        if (((Boolean) hhoVar4.a()).booleanValue()) {
                            zxlVar2.h();
                            zxy.d(hhoVar4, false);
                        }
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R4);
            }
            ffix ffixVar = (ffix) R4;
            hfmVar.Z();
            b.v(1052200493);
            boolean D5 = b.D(zxlVar);
            Object R5 = hfmVar.R();
            if (D5 || R5 == hfc.a) {
                R5 = new ffix() { // from class: zxs
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        zxl zxlVar2 = zxl.this;
                        if (zxy.e(b2)) {
                            zxlVar2.g();
                        } else {
                            zxlVar2.h();
                        }
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R5);
            }
            ffix ffixVar2 = (ffix) R5;
            hfmVar.Z();
            dlvo dlvoVar = new dlvo(g(a(hhoVar), l, zxlVar.a()), ffjiVar, ffixVar);
            List list = zydVar.k;
            dmae dmaeVar = (list == null || list.isEmpty()) ? null : new dmae(list, new dlzu(dlvoVar.a, dlvoVar.b, dlvoVar.c));
            boolean e = e(b2);
            long h = h(a(hhoVar), l, zxlVar.a());
            boolean z4 = zydVar.d;
            String str = zydVar.c;
            dowd dowdVar = zydVar.j;
            dnwi dnwiVar = zydVar.l;
            zyc zycVar = zydVar.m;
            dlvj dlvjVar = new dlvj(str, dlvpVar, dowdVar, z, z3, z4, e, h, ffixVar2, dlvoVar, null, dnwiVar, dmaeVar, new dlvg(zycVar.a, zycVar.b), 1024);
            String str2 = zydVar.c;
            boolean z5 = zydVar.d;
            zyc zycVar2 = zydVar.m;
            dlza.a(new dlzf(dlvjVar, new dlze(zycVar2.a, zycVar2.b), str2, z5, (ffix) null, 48), null, idhVar, b, (i3 >> 3) & 896, 2);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: zxt
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    zyd zydVar2 = zyd.this;
                    Long l2 = l;
                    dlvp dlvpVar2 = dlvpVar;
                    idh idhVar2 = idhVar;
                    boolean z6 = z;
                    zxy.b(zydVar2, l2, dlvpVar2, idhVar2, z6, z2, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(hho hhoVar, Float f) {
        hhoVar.b(f);
    }

    public static final void d(hho hhoVar, boolean z) {
        hhoVar.b(Boolean.valueOf(z));
    }

    public static final boolean e(hkx hkxVar) {
        return ((Boolean) hkxVar.a()).booleanValue();
    }

    public static final void f(final zyd zydVar, idh idhVar, boolean z, hfd hfdVar, final int i) {
        int i2;
        doui douiVar;
        int i3;
        dlvp dlvpVar;
        hkx hkxVar;
        hfd hfdVar2;
        final idh idhVar2 = idhVar;
        final boolean z2 = z;
        hfd b = hfdVar.b(-1444251918);
        if ((i & 6) == 0) {
            i2 = (true != b.D(zydVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(idhVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(z2) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            b.t();
            if ((i & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            b.v(298773012);
            int i4 = i2 & 14;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            dmae dmaeVar = null;
            if (i4 == 4 || R == hfc.a) {
                R = new zxu(zydVar, null);
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hgs.g(zydVar, (ffjm) R, b);
            hkx b2 = hkt.b(zydVar.a.e(), false, null, b, 2);
            hkx b3 = hkt.b(zydVar.a.c(), false, null, b, 2);
            b.v(298780593);
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                R2 = new zxx(null);
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            hkx a = hkk.a(false, (ffjm) R2, b);
            zxl zxlVar = zydVar.a;
            b.v(298782371);
            Object R3 = hfmVar.R();
            if (i4 == 4 || R3 == hfc.a) {
                R3 = new ffji() { // from class: zxn
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ((hgp) obj).getClass();
                        return new zxw(zyd.this);
                    }
                };
                hfmVar.ad(R3);
            }
            hfmVar.Z();
            hgs.c(zxlVar, (ffji) R3, b);
            zys zysVar = zydVar.h;
            b.v(298784707);
            Object R4 = hfmVar.R();
            if (i4 == 4 || R4 == hfc.a) {
                R4 = new ffji() { // from class: zxo
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ((hgp) obj).getClass();
                        zys zysVar2 = zyd.this.h;
                        if (zysVar2 != null) {
                            zysVar2.e.invoke();
                        }
                        return new zxv();
                    }
                };
                hfmVar.ad(R4);
            }
            hfmVar.Z();
            hgs.c(zysVar, (ffji) R4, b);
            zys zysVar2 = zydVar.h;
            doue doueVar = zysVar2 != null ? zysVar2.b : null;
            b.v(298791233);
            if (zysVar2 == null) {
                i3 = i2;
                douiVar = null;
            } else {
                b.v(298792591);
                douiVar = zysVar2.a;
                if (douiVar instanceof doug) {
                    b.v(-511947271);
                    i3 = i2;
                    douiVar = doug.a((doug) douiVar, ((Boolean) a.a()).booleanValue(), ((Number) hkt.b(zysVar2.d, Float.valueOf(0.0f), null, b, 2).a()).floatValue());
                    hfmVar.Z();
                } else {
                    i3 = i2;
                    if (douiVar instanceof douf) {
                        b.v(1309707424);
                        douiVar = douf.b((douf) douiVar, ((Boolean) hkf.a(zysVar2.c, b).a()).booleanValue());
                        hfmVar.Z();
                    } else {
                        b.v(-511937019);
                        hfmVar.Z();
                    }
                }
                hfmVar.Z();
            }
            hfmVar.Z();
            dlvp dlvpVar2 = douiVar != null ? new dlvp(douiVar, doueVar) : null;
            hkx b4 = hkt.b(zydVar.a.b(), null, null, b, 2);
            hkx b5 = hkt.b(zydVar.a.d(), null, null, b, 2);
            List list = zydVar.k;
            if (list == null || list.isEmpty()) {
                dlvpVar = dlvpVar2;
                hkxVar = b4;
            } else {
                dlvpVar = dlvpVar2;
                hkxVar = b4;
                dmaeVar = new dmae(list, new dlzu(g(i(b5), j(b4), zydVar.a.a()), 6));
            }
            if (((Boolean) b3.a()).booleanValue()) {
                int i5 = (i3 << 3) & 896;
                b.v(298831929);
                boolean z3 = zydVar.e;
                boolean z4 = zydVar.d;
                String str = zydVar.c;
                zyc zycVar = zydVar.m;
                dlve dlveVar = new dlve(str, dlvpVar, z3, z2, z4, new dlvg(zycVar.a, zycVar.b), 68);
                String str2 = zydVar.c;
                boolean z5 = zydVar.d;
                zyc zycVar2 = zydVar.m;
                dlzf dlzfVar = new dlzf(dlveVar, new dlze(zycVar2.a, zycVar2.b), str2, z5, (ffix) null, 48);
                idhVar2 = idhVar;
                hfdVar2 = b;
                dlza.a(dlzfVar, null, idhVar2, hfdVar2, i5, 2);
                hfmVar.Z();
            } else {
                dlvp dlvpVar3 = dlvpVar;
                if (((Boolean) b2.a()).booleanValue()) {
                    b.v(298867633);
                    boolean z6 = zydVar.e;
                    boolean z7 = zydVar.d;
                    String str3 = zydVar.c;
                    long h = h(i(b5), j(hkxVar), zydVar.a.a());
                    dowd dowdVar = zydVar.j;
                    dnwi dnwiVar = zydVar.l;
                    zyc zycVar3 = zydVar.m;
                    dlvn dlvnVar = new dlvn(str3, dlvpVar3, dowdVar, z6, z, z7, dnwiVar, h, dmaeVar, new dlvg(zycVar3.a, zycVar3.b));
                    String str4 = zydVar.c;
                    boolean z8 = zydVar.d;
                    zyc zycVar4 = zydVar.m;
                    dlzf dlzfVar2 = new dlzf(dlvnVar, new dlze(zycVar4.a, zycVar4.b), str4, z8, (ffix) null, 48);
                    idhVar2 = idhVar;
                    hfdVar2 = b;
                    dlza.a(dlzfVar2, null, idhVar2, hfdVar2, (i3 << 3) & 896, 2);
                    hfmVar.Z();
                } else if (zydVar.f) {
                    int i6 = (i3 << 3) & 896;
                    b.v(298915033);
                    boolean z9 = zydVar.e;
                    boolean z10 = zydVar.d;
                    String str5 = zydVar.c;
                    dowd dowdVar2 = zydVar.j;
                    dnwi dnwiVar2 = zydVar.l;
                    zyc zycVar5 = zydVar.m;
                    dlvl dlvlVar = new dlvl(str5, dlvpVar3, dowdVar2, z9, z, z10, dnwiVar2, new dlvg(zycVar5.a, zycVar5.b));
                    String str6 = zydVar.c;
                    boolean z11 = zydVar.d;
                    zyc zycVar6 = zydVar.m;
                    dlzf dlzfVar3 = new dlzf(dlvlVar, new dlze(zycVar6.a, zycVar6.b), str6, z11, (ffix) null, 48);
                    idhVar2 = idhVar;
                    hfdVar2 = b;
                    dlza.a(dlzfVar3, null, idhVar2, hfdVar2, i6, 2);
                    hfmVar.Z();
                } else {
                    b.v(298952314);
                    idhVar2 = idhVar;
                    b(zydVar, j(hkxVar), dlvpVar3, idhVar2, zydVar.e, z, b, ((i3 << 6) & 7168) | i4 | (458752 & (i3 << 9)));
                    hfdVar2 = b;
                    z2 = z;
                    hfmVar.Z();
                }
            }
            z2 = z;
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: zxp
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    zyd zydVar2 = zyd.this;
                    idh idhVar3 = idhVar2;
                    int i7 = i;
                    zxy.f(zydVar2, idhVar3, z2, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    private static final float g(Float f, Long l, long j) {
        if (f != null) {
            return f.floatValue();
        }
        if (j <= 0 || l == null) {
            return 0.0f;
        }
        return l.longValue() / j;
    }

    private static final long h(Float f, Long l, long j) {
        if (f != null) {
            return (long) (f.floatValue() * j);
        }
        return l == null ? j : l.longValue();
    }

    private static final Float i(hkx hkxVar) {
        return (Float) hkxVar.a();
    }

    private static final Long j(hkx hkxVar) {
        return (Long) hkxVar.a();
    }
}
