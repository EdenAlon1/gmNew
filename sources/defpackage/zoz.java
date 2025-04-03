package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zoz {
    public static final void a(final zmz zmzVar, final eey eeyVar, final zqy zqyVar, hfd hfdVar, final int i) {
        int i2;
        lkj lkjVar;
        int i3 = i & 6;
        hfd b = hfdVar.b(1231026869);
        if (i3 == 0) {
            i2 = (true != b.D(zmzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(eeyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(zqyVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            lkj lkjVar2 = (lkj) hkf.a(((lkr) b.e(lnr.a)).P().b(), b).a();
            boolean z = !eeyVar.g();
            Boolean valueOf = Boolean.valueOf(z);
            String b2 = zqyVar.b();
            b.v(221006076);
            boolean E = b.E(z) | b.D(lkjVar2);
            boolean z2 = (i2 & 896) == 256;
            boolean z3 = (i2 & 14) == 4;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (((E | z2) || z3) || R == hfc.a) {
                lkjVar = lkjVar2;
                R = new znj(z, lkjVar, zqyVar, zmzVar, null);
                hfmVar.ad(R);
            } else {
                lkjVar = lkjVar2;
            }
            hfmVar.Z();
            hgs.e(valueOf, lkjVar, b2, (ffjm) R, b);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: zne
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    zmz zmzVar2 = zmz.this;
                    eey eeyVar2 = eeyVar;
                    int i4 = i;
                    zoz.a(zmzVar2, eeyVar2, zqyVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final eey eeyVar, final zmz zmzVar, final zkq zkqVar, final float f, hfd hfdVar, final int i) {
        int i2;
        hkx hkxVar;
        float f2;
        hkx hkxVar2;
        hkx hkxVar3;
        hkx hkxVar4;
        int i3;
        cxj cxjVar;
        int i4;
        hvi c;
        hvi a;
        dxq dxqVar;
        final zkp zkpVar;
        hfm hfmVar;
        zmz zmzVar2;
        hfd hfdVar2;
        hfm hfmVar2;
        hvi c2;
        ffcu ffcuVar;
        final eey eeyVar2 = eeyVar;
        hfd b = hfdVar.b(1551411922);
        if ((i & 6) == 0) {
            i2 = (true != b.D(eeyVar2) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(zmzVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(zkqVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.A(f) ? 1024 : 2048;
        }
        int i5 = i2;
        if ((i5 & 1171) == 1170 && b.I()) {
            b.s();
            zmzVar2 = zmzVar;
            hfdVar2 = b;
        } else {
            int i6 = i5 & 112;
            olu oluVar = zkqVar.a;
            int i7 = i5 & 14;
            eeyVar2.getClass();
            b.v(1974972348);
            b.v(455093604);
            int i8 = i7 | 64;
            boolean D = ((((i8 & 14) ^ 6) > 4 && b.D(eeyVar2)) || (i8 & 6) == 4) | b.D(oluVar);
            hfm hfmVar3 = (hfm) b;
            Object R = hfmVar3.R();
            if (D || R == hfc.a) {
                R = new zkp(eeyVar2, oluVar);
                hfmVar3.ad(R);
            }
            zkp zkpVar2 = (zkp) R;
            hfmVar3.Z();
            hfmVar3.Z();
            hkx a2 = hkf.a(zmzVar.f, b);
            b.v(1909409167);
            if (zmzVar.s.a) {
                b.v(305394458);
                hkxVar = hkf.a(zmzVar.e, b);
                hfmVar3.Z();
            } else {
                b.v(305446414);
                b.v(2088063274);
                Object R2 = hfmVar3.R();
                if (R2 == hfc.a) {
                    hic hicVar = new hic(null, hla.a);
                    hfmVar3.ad(hicVar);
                    R2 = hicVar;
                }
                hkxVar = (hho) R2;
                hfmVar3.Z();
                hfmVar3.Z();
            }
            hkx hkxVar5 = hkxVar;
            hfmVar3.Z();
            hkxVar5.getClass();
            b.v(-1870953452);
            boolean z = zmzVar.s.a && hkxVar5.a() != null;
            hfmVar3.Z();
            Object R3 = hfmVar3.R();
            if (R3 == hfc.a) {
                R3 = hgs.a(ffhe.a, b);
                hfmVar3.ad(R3);
            }
            ffsk ffskVar = (ffsk) R3;
            b.v(2013508098);
            Object R4 = hfmVar3.R();
            if (R4 == hfc.a) {
                R4 = new hhw(0.0f);
                hfmVar3.ad(R4);
            }
            hjx hjxVar = (hjx) R4;
            hfmVar3.Z();
            b.v(2013509805);
            Object R5 = hfmVar3.R();
            if (R5 == hfc.a) {
                R5 = cxk.a(hjxVar.c());
                hfmVar3.ad(R5);
            }
            cxj cxjVar2 = (cxj) R5;
            hfmVar3.Z();
            hkx b2 = hkt.b(zmzVar.j, true, null, b, 2);
            final boolean z2 = z;
            hkx b3 = hkt.b(zmzVar.i, false, null, b, 2);
            b.v(2013543178);
            float d = z2 ? f - eci.a(ecv.h(b), b).d() : f;
            hfmVar3.Z();
            b.v(2013557334);
            zmy zmyVar = zmzVar.s;
            if (!zmyVar.b || (zmyVar.c && ((Boolean) b3.a()).booleanValue())) {
                f2 = d;
                hkxVar2 = b3;
                hkxVar3 = hkxVar5;
                hkxVar4 = a2;
                i3 = i7;
                cxjVar = cxjVar2;
                i4 = i6;
                c = ebs.c(hvi.e, 1.0f);
                a = jfw.a(c, "message_list");
            } else {
                c2 = ebs.c(hvi.e, 1.0f);
                hvi a3 = jfw.a(c2, "message_list");
                ffcu ffcuVar2 = ffcu.a;
                b.v(2013564743);
                boolean F = (i6 == 32) | b.F(ffskVar) | b.F(cxjVar2) | b.D(b2);
                Object R6 = hfmVar3.R();
                if (F || R6 == hfc.a) {
                    ffcuVar = ffcuVar2;
                    i4 = i6;
                    hkxVar3 = hkxVar5;
                    f2 = d;
                    hkxVar2 = b3;
                    hkxVar4 = a2;
                    cxjVar = cxjVar2;
                    i3 = i7;
                    znn znnVar = new znn(ffskVar, hjxVar, cxjVar, zmzVar, b2);
                    hfmVar3.ad(znnVar);
                    R6 = znnVar;
                } else {
                    i4 = i6;
                    f2 = d;
                    hkxVar2 = b3;
                    hkxVar3 = hkxVar5;
                    hkxVar4 = a2;
                    i3 = i7;
                    cxjVar = cxjVar2;
                    ffcuVar = ffcuVar2;
                }
                hfmVar3.Z();
                a = ilv.a(a3, ffcuVar, (PointerInputEventHandler) R6);
            }
            hvi hviVar = a;
            hfmVar3.Z();
            b.v(2013583086);
            if (z2) {
                b.v(1940031661);
                dxqVar = new zoy();
                hfmVar3.Z();
            } else {
                dxqVar = dxu.d;
            }
            dxq dxqVar2 = dxqVar;
            hfmVar3.Z();
            b.v(2013588584);
            boolean z3 = i4 == 32;
            boolean D2 = z3 | b.D(hkxVar4) | ((i5 & 896) == 256) | b.F(zkpVar2);
            boolean z4 = i3 == 4;
            final hkx hkxVar6 = hkxVar3;
            final float f3 = f2;
            boolean D3 = D2 | z4 | b.D(hkxVar2) | b.F(cxjVar) | b.E(z2) | b.D(hkxVar6) | b.A(f3);
            Object R7 = hfmVar3.R();
            if (D3 || R7 == hfc.a) {
                final cxj cxjVar3 = cxjVar;
                zkpVar = zkpVar2;
                final hkx hkxVar7 = hkxVar4;
                hfmVar = hfmVar3;
                final hkx hkxVar8 = hkxVar2;
                ffji ffjiVar = new ffji() { // from class: zna
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        edp edpVar = (edp) obj;
                        edpVar.getClass();
                        final zmz zmzVar3 = zmzVar;
                        eek.a(edpVar, null, new hpw(-552032217, true, new zno(zmzVar3)), 3);
                        eek.a(edpVar, null, new hpw(-1188394018, true, new znp(zmzVar3)), 3);
                        aave aaveVar = (aave) hkxVar7.a();
                        if (!aaveVar.a.isEmpty()) {
                            eek.a(edpVar, null, new hpw(-557483322, true, new zon(aaveVar)), 3);
                        }
                        cxj cxjVar4 = cxjVar3;
                        hkx hkxVar9 = hkxVar8;
                        eey eeyVar3 = eeyVar;
                        zkp zkpVar3 = zkpVar;
                        boolean z5 = z2;
                        final zkq zkqVar2 = zkq.this;
                        eek.b(edpVar, aaveVar.a.size(), null, new hpw(744985368, true, new zoo(aaveVar)), 6);
                        edpVar.a(zkqVar2.a.a(), new ffji() { // from class: znf
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj2) {
                                Integer num = (Integer) obj2;
                                return zmz.this.k.a(num, zkqVar2.a.g(num.intValue()));
                            }
                        }, new ffji() { // from class: zng
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj2) {
                                ((Integer) obj2).intValue();
                                return "message";
                            }
                        }, new hpw(-1393466384, true, new zns(zkpVar3, zmzVar3, eeyVar3, hkxVar9, cxjVar4)));
                        if (z5) {
                            eek.a(edpVar, null, new hpw(1513559042, true, new znt(hkxVar6)), 3);
                        }
                        eek.a(edpVar, null, new hpw(364693343, true, new znu(f3)), 3);
                        return ffcu.a;
                    }
                };
                zmzVar2 = zmzVar;
                hfmVar.ad(ffjiVar);
                R7 = ffjiVar;
            } else {
                zmzVar2 = zmzVar;
                zkpVar = zkpVar2;
                hfmVar = hfmVar3;
            }
            hfmVar.Z();
            hfdVar2 = b;
            zkp zkpVar3 = zkpVar;
            hfm hfmVar4 = hfmVar;
            eeyVar2 = eeyVar;
            edh.a(hviVar, eeyVar2, null, true, dxqVar2, null, null, false, null, (ffji) R7, hfdVar2, ((i5 << 3) & 112) | 3072, 484);
            hfdVar2.v(2013646677);
            boolean F2 = z3 | hfdVar2.F(zkpVar3);
            Object R8 = hfmVar4.R();
            if ((F2 || z4) || R8 == hfc.a) {
                R8 = new znw(zmzVar2, zkpVar3, eeyVar2, null);
                hfmVar2 = hfmVar4;
                hfmVar2.ad(R8);
            } else {
                hfmVar2 = hfmVar4;
            }
            hfmVar2.Z();
            hgs.g(zkpVar3, (ffjm) R8, hfdVar2);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            final zmz zmzVar3 = zmzVar2;
            L.d = new ffjm() { // from class: znb
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    eey eeyVar3 = eey.this;
                    zmz zmzVar4 = zmzVar3;
                    zkq zkqVar2 = zkqVar;
                    zoz.b(eeyVar3, zmzVar4, zkqVar2, f, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final zqy zqyVar, final zmz zmzVar, hfd hfdVar, final int i) {
        List b;
        int i2 = i & 6;
        hfd b2 = hfdVar.b(-569209560);
        int i3 = i2 == 0 ? (true != b2.D(zqyVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != b2.D(zmzVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && b2.I()) {
            b2.s();
        } else {
            dnto dntoVar = zqyVar instanceof zsn ? ((zsn) zqyVar).a.l : null;
            if (dntoVar != null && (b = dntoVar.b()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : b) {
                    if (obj instanceof dnsk) {
                        arrayList.add(obj);
                    }
                }
                if (((dnsk) ffdx.M(arrayList)) != null) {
                    throw null;
                }
            }
            b2.v(368454776);
            hfm hfmVar = (hfm) b2;
            hfmVar.Z();
            String b3 = zqyVar.b();
            b2.v(368457447);
            boolean z = (i3 & 112) == 32;
            boolean z2 = (i3 & 14) == 4;
            Object R = hfmVar.R();
            if ((z | z2) || R == hfc.a) {
                R = new zom(zmzVar, zqyVar, null);
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hgs.e(b3, dntoVar, null, (ffjm) R, b2);
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: znd
                @Override // defpackage.ffjm
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    zqy zqyVar2 = zqy.this;
                    int i4 = i;
                    zoz.c(zqyVar2, zmzVar, (hfd) obj2, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(zmz zmzVar, eey eeyVar) {
        int b = eeyVar.b();
        zmzVar.v.b(b * (((eei) ffdx.M(eeyVar.d().i())) != null ? r2.h : 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0335  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final defpackage.zmz r24, final float r25, final defpackage.hvi r26, defpackage.hfd r27, final int r28) {
        /*
            Method dump skipped, instructions count: 869
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zoz.e(zmz, float, hvi, hfd, int):void");
    }

    public static final float f(zqv zqvVar, hfd hfdVar) {
        hfdVar.v(-1520118675);
        float ek = ((jzn) hfdVar.e(jdr.e)).ek(((Number) hkt.b(zqvVar.e, 0, null, hfdVar, 2).a()).intValue());
        hfdVar.v(-616041986);
        if (jzq.b(ek, 0.0f)) {
            hfdVar.v(1280460081);
            jzn jznVar = (jzn) hfdVar.e(jdr.e);
            ek = ((jzq) ffmk.m(new jzq(dmkx.a(hfdVar) + 16.0f + jznVar.ek(new eat(ecv.f(hfdVar), 32).a(jznVar))), new jzq(0.0f))).a;
            hfdVar.o();
        }
        hfdVar.o();
        hfdVar.o();
        return ek;
    }
}
