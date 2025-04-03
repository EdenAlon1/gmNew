package defpackage;

import com.google.android.apps.messaging.R;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmsz {
    public static final void a(final ebq ebqVar, final dmte dmteVar, final hzi hziVar, hfd hfdVar, final int i) {
        int i2;
        hvi a;
        hvi c;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1433315823);
        if (i3 == 0) {
            i2 = (true != b.D(ebqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dmteVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(hziVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            a = ebqVar.a(jfw.a(hvi.e, "ContactSearchBar"), 1.0f, true);
            c = dix.c(a, dix.a(0, b, 0, 1), true & ((r6 & 8) == 0), (r6 & 2) != 0, true);
            dzt.b(c, new dxn(4.0f, true, dxr.a), null, null, 0, 0, hpx.d(303743116, new dmsv(dmteVar, hziVar), b), b, 1572912, 60);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmsn
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ebq ebqVar2 = ebq.this;
                    dmte dmteVar2 = dmteVar;
                    int i4 = i;
                    dmsz.a(ebqVar2, dmteVar2, hziVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final boolean z, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(569445051);
        if (i3 == 0) {
            i2 = (true != b.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hfdVar2 = b;
            dwjt.b(jii.a(z ? R.string.contact_bar_hint_filled : R.string.contact_bar_hint_empty, b), null, gft.a(b).s, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, gft.d(b).k, hfdVar2, 0, 3120, 55290);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmsr
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dmsz.b(z, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.hfd r25, int r26) {
        /*
            r0 = 1862085784(0x6efd2c98, float:3.917681E28)
            r1 = r25
            hfd r0 = r1.b(r0)
            if (r26 != 0) goto L1b
            boolean r1 = r0.I()
            r2 = 0
            if (r1 != 0) goto L15
            r24 = r2
            goto L1d
        L15:
            r0.s()
            r20 = r0
            goto L5f
        L1b:
            r24 = r26
        L1d:
            hve r1 = defpackage.hvi.e
            r5 = 0
            r6 = 9
            r2 = 0
            r3 = 1096810496(0x41600000, float:14.0)
            r4 = 1099956224(0x41900000, float:18.0)
            hvi r2 = defpackage.eba.j(r1, r2, r3, r4, r5, r6)
            r1 = 2132083532(0x7f15034c, float:1.9807209E38)
            java.lang.String r1 = defpackage.jii.a(r1, r0)
            fxz r3 = defpackage.gft.a(r0)
            long r3 = r3.q
            gvs r5 = defpackage.gft.d(r0)
            jpo r5 = r5.k
            r22 = 0
            r23 = 65528(0xfff8, float:9.1824E-41)
            r19 = r5
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r21 = 48
            r20 = r0
            defpackage.dwjt.b(r1, r2, r3, r5, r7, r8, r9, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r2 = r24
        L5f:
            hio r0 = r20.L()
            if (r0 == 0) goto L6c
            dmsq r1 = new dmsq
            r1.<init>()
            r0.d = r1
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmsz.c(hfd, int):void");
    }

    public static final void d(eag eagVar, final dmte dmteVar, hzi hziVar, hfd hfdVar, final int i) {
        int i2;
        final eag eagVar2;
        final hzi hziVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-115612018);
        if (i3 == 0) {
            i2 = (true != b.D(eagVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dmteVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(hziVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
            eagVar2 = eagVar;
            hziVar2 = hziVar;
        } else {
            List list = dmteVar.a;
            b.v(1207815859);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                dmjp.e((dmjr) it.next(), null, b, 0);
            }
            ((hfm) b).Z();
            eagVar2 = eagVar;
            hziVar2 = hziVar;
            e(eagVar2, !list.isEmpty(), dmteVar.e, dmteVar.b, dmteVar.c, dmteVar.d, hziVar2, b, (i2 & 14) | ((i2 << 12) & 3670016));
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmsp
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    eag eagVar3 = eag.this;
                    dmte dmteVar2 = dmteVar;
                    int i4 = i;
                    dmsz.d(eagVar3, dmteVar2, hziVar2, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final eag eagVar, final boolean z, final hkx hkxVar, final ffji ffjiVar, final ffix ffixVar, final ffix ffixVar2, final hzi hziVar, hfd hfdVar, final int i) {
        int i2;
        hvi a;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-321324693);
        if (i3 == 0) {
            i2 = (true != b.D(eagVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(hkxVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(ffjiVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.F(ffixVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.F(ffixVar2) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != b.D(hziVar) ? 524288 : 1048576;
        }
        if ((599187 & i2) == 599186 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            long j = gft.a(b).a;
            b.v(1922407569);
            boolean C = b.C(j);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (C || R == hfc.a) {
                hic hicVar = new hic(new idl(j), hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            hho hhoVar = (hho) R;
            hfmVar.Z();
            a = eagVar.a(hvi.e, 1.0f, true);
            hvi a2 = hzk.a(a, hziVar);
            b.v(1922413831);
            int i4 = 57344 & i2;
            Object R2 = hfmVar.R();
            if (i4 == 16384 || R2 == hfc.a) {
                R2 = new dmsw(ffixVar);
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            hvi a3 = jfw.a(ija.a(a2, (ffji) R2), "ContactSearchField");
            idl idlVar = (idl) hhoVar.a();
            euw euwVar = new euw(2, null, 0, 7, 118);
            jpo y = jpo.y(gft.d(b).k, gft.a(b).q, 0L, null, null, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214);
            b.v(1922430487);
            int i5 = 458752 & i2;
            Object R3 = hfmVar.R();
            if (i5 == 131072 || R3 == hfc.a) {
                R3 = new ffji() { // from class: dmss
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ((euu) obj).getClass();
                        ffix.this.invoke();
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R3);
            }
            hfmVar.Z();
            euv euvVar = new euv((ffji) R3, null, null, null, 62);
            String str = (String) hkxVar.a();
            b.v(1922423872);
            int i6 = i2 & 7168;
            Object R4 = hfmVar.R();
            if (i6 == 2048 || R4 == hfc.a) {
                R4 = new ffji() { // from class: dmst
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        String str2 = (String) obj;
                        str2.getClass();
                        ffji.this.invoke(str2);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R4);
            }
            hfmVar.Z();
            hfdVar2 = b;
            eri.d(str, (ffji) R4, a3, false, y, euwVar, euvVar, true, 0, 0, null, null, null, idlVar, hpx.d(-2121727858, new dmsy(hkxVar, z), b), hfdVar2, 102236160, 196608, 15896);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmsu
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    eag eagVar2 = eag.this;
                    boolean z2 = z;
                    hkx hkxVar2 = hkxVar;
                    ffji ffjiVar2 = ffjiVar;
                    ffix ffixVar3 = ffixVar;
                    ffix ffixVar4 = ffixVar2;
                    dmsz.e(eagVar2, z2, hkxVar2, ffjiVar2, ffixVar3, ffixVar4, hziVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void f(final dmte dmteVar, final hvi hviVar, final hzi hziVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        hvi a;
        int i3 = i & 6;
        hfd b = hfdVar.b(-677013339);
        if (i3 == 0) {
            i2 = (true != b.D(dmteVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(hziVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            b.t();
            if ((i & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            d = ebs.d(hviVar, 1.0f);
            hvi f = ebs.f(d, 48.0f, 120.0f);
            b.v(955277174);
            long j = gft.a(b).F;
            hfm hfmVar = (hfm) b;
            hfmVar.Z();
            a = dee.a(f, j, idb.a);
            hvi j2 = eba.j(a, 20.0f, 0.0f, 16.0f, 0.0f, 10);
            dxi dxiVar = dxu.a;
            int i4 = huo.a;
            ipn a2 = ebm.a(dxiVar, hum.m, b, 0);
            int a3 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, j2);
            int i5 = ist.a;
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
            ebr ebrVar = ebr.a;
            c(b, 0);
            a(ebrVar, dmteVar, hziVar, b, (i2 & 896) | ((i2 << 3) & 112) | 6);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmso
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmte dmteVar2 = dmte.this;
                    hvi hviVar2 = hviVar;
                    int i6 = i;
                    dmsz.f(dmteVar2, hviVar2, hziVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
