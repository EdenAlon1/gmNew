package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dssz {
    public static final void a(final dsou dsouVar, final hvi hviVar, final dste dsteVar, boolean z, hfd hfdVar, final int i, final int i2) {
        int i3;
        dstm dstmVar;
        dstm dstmVar2;
        dsss dsssVar;
        final long f;
        boolean z2 = z;
        dsteVar.getClass();
        int i4 = i & 6;
        hfd b = hfdVar.b(-1965804175);
        if (i4 == 0) {
            i3 = (true != b.F(dsouVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != ((i & 512) == 0 ? b.D(dsteVar) : b.F(dsteVar)) ? 128 : 256;
        }
        int i5 = i2 & 4;
        boolean z3 = i5 == 0;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= true != b.E(z2) ? 1024 : 2048;
        }
        if ((i3 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            z2 &= z3;
            if (Build.VERSION.SDK_INT >= 31) {
                hvi a = hxe.a(hviVar, ((Number) cxo.c((((Boolean) dsouVar.a.a()).booleanValue() || z2) ? 0.0f : 1.0f, cxu.c(150, 0, cyp.d, 2), null, b, 0, 28).a()).floatValue());
                b.v(-1719049184);
                float f2 = dsteVar.b;
                if (f2 > 0.0f) {
                    Object obj = dsteVar.a;
                    dstmVar = new dstm(obj instanceof dsss ? (dsss) obj : null, 1.0f - f2);
                    Object obj2 = dsteVar.c;
                    dstmVar2 = new dstm(obj2 instanceof dsss ? (dsss) obj2 : null, dsteVar.b);
                } else if (f2 < 0.0f) {
                    Object obj3 = dsteVar.c;
                    dstmVar = new dstm(obj3 instanceof dsss ? (dsss) obj3 : null, -f2);
                    Object obj4 = dsteVar.a;
                    dstmVar2 = new dstm(obj4 instanceof dsss ? (dsss) obj4 : null, dsteVar.b + 1.0f);
                } else {
                    Object obj5 = dsteVar.a;
                    dstmVar = new dstm(obj5 instanceof dsss ? (dsss) obj5 : null, 1.0f);
                    Object obj6 = dsteVar.c;
                    dstmVar2 = new dstm(obj6 instanceof dsss ? (dsss) obj6 : null, 0.0f);
                }
                b.v(1307071392);
                b.v(1465957363);
                hfm hfmVar = (hfm) b;
                Object R = hfmVar.R();
                if (R == hfc.a) {
                    hic hicVar = new hic(null, hla.a);
                    hfmVar.ad(hicVar);
                    R = hicVar;
                }
                hho hhoVar = (hho) R;
                hfmVar.Z();
                b.v(1465960275);
                Object R2 = hfmVar.R();
                if (R2 == hfc.a) {
                    hic hicVar2 = new hic(null, hla.a);
                    hfmVar.ad(hicVar2);
                    R2 = hicVar2;
                }
                hho hhoVar2 = (hho) R2;
                hfmVar.Z();
                dsss dsssVar2 = dstmVar.a;
                if ((dsssVar2 == null || !ffkj.e(dsssVar2, f(hhoVar2))) && ((dsssVar = dstmVar2.a) == null || !ffkj.e(dsssVar, e(hhoVar)))) {
                    dstm dstmVar3 = dstmVar;
                    dstmVar = dstmVar2;
                    dstmVar2 = dstmVar3;
                }
                dsss dsssVar3 = dstmVar2.a;
                if (dsssVar3 != null) {
                    hhoVar.b(dsssVar3);
                }
                dsss dsssVar4 = dstmVar.a;
                if (dsssVar4 != null) {
                    hhoVar2.b(dsssVar4);
                }
                ffcf ffcfVar = new ffcf(g(dstmVar2, e(hhoVar)), g(dstmVar, f(hhoVar2)));
                hfmVar.Z();
                hfmVar.Z();
                dstm dstmVar4 = (dstm) ffcfVar.a;
                dstm dstmVar5 = (dstm) ffcfVar.b;
                if (dstmVar4.a != null || dstmVar5.a != null) {
                    f = iby.f(ibw.d(r11), ibw.c(r11), ibw.b(r11), 0.4f, ibw.f(gft.a(b).v));
                    b.v(888425809);
                    boolean C = b.C(f);
                    Object R3 = hfmVar.R();
                    if (C || R3 == hfc.a) {
                        R3 = new ffji() { // from class: dssv
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj7) {
                                ifo ifoVar = (ifo) obj7;
                                ifoVar.getClass();
                                ifoVar.p();
                                ifoVar.r(f, 0L, (r20 & 4) != 0 ? ifq.c(ifoVar.b(), 0L) : 0L, (r20 & 8) != 0 ? 1.0f : 0.0f, (r20 & 16) != 0 ? ifu.a : null, (r20 & 32) != 0 ? null : null, (r20 & 64) != 0 ? 3 : 0);
                                return ffcu.a;
                            }
                        };
                        hfmVar.ad(R3);
                    }
                    hfmVar.Z();
                    gpa.c(hxs.c(a, (ffji) R3), null, 0L, 0L, 0.0f, 0.0f, null, hpx.d(-126540096, new dssx(dsouVar, a, dstmVar4, dstmVar5), b), b, 126);
                    b = b;
                }
            }
        }
        final boolean z4 = z2;
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dssw
                @Override // defpackage.ffjm
                public final Object a(Object obj7, Object obj8) {
                    ((Integer) obj8).intValue();
                    dsou dsouVar2 = dsou.this;
                    hvi hviVar2 = hviVar;
                    dste dsteVar2 = dsteVar;
                    dssz.a(dsouVar2, hviVar2, dsteVar2, z4, (hfd) obj7, hip.a(i | 1), i2);
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(dsou dsouVar, final hvi hviVar, dsss dsssVar, hfd hfdVar, final int i) {
        int i2;
        final dsou dsouVar2;
        final dsss dsssVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1719099910);
        if (i3 == 0) {
            i2 = (true != b.F(dsouVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(dsssVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
            dsouVar2 = dsouVar;
            dsssVar2 = dsssVar;
        } else {
            hvi a = hxg.a(hviVar, 50.0f, 50.0f, null);
            int i4 = inp.a;
            dsouVar2 = dsouVar;
            dsssVar2 = dsssVar;
            dsuh.a(dsouVar2, a, dsssVar2, ino.a, b, (i2 & 14) | 3072 | (i2 & 896), 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dssu
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dsou dsouVar3 = dsou.this;
                    hvi hviVar2 = hviVar;
                    int i5 = i;
                    dssz.b(dsouVar3, hviVar2, dsssVar2, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final dsou dsouVar, final hvi hviVar, final dsss dsssVar, final float f, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1704380817);
        if (i3 == 0) {
            i2 = (true != b.F(dsouVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(dsssVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.A(f) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            cru.b(dsssVar != null, null, null, null, null, hpx.d(-614536377, new dssy(dsssVar, dsouVar, hviVar, f), b), b, 196608, 30);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dsst
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dsou dsouVar2 = dsou.this;
                    hvi hviVar2 = hviVar;
                    dsss dsssVar2 = dsssVar;
                    dssz.c(dsouVar2, hviVar2, dsssVar2, f, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    private static final dsss e(hho hhoVar) {
        return (dsss) hhoVar.a();
    }

    private static final dsss f(hho hhoVar) {
        return (dsss) hhoVar.a();
    }

    private static final dstm g(dstm dstmVar, dsss dsssVar) {
        return (dstmVar.a != null || dsssVar == null) ? dstmVar : new dstm(dsssVar, 0.0f);
    }
}
