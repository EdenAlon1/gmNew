package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wnm {
    public static final void a(final ebq ebqVar, final String str, dji djiVar, final hho hhoVar, final ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        dji djiVar2;
        hvi b;
        hvi a;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(-1738962866);
        if (i3 == 0) {
            i2 = (true != b2.D(ebqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.D(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            djiVar2 = djiVar;
            i2 |= true != b2.D(djiVar2) ? 128 : 256;
        } else {
            djiVar2 = djiVar;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b2.D(hhoVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b2.F(ffixVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && b2.I()) {
            b2.s();
        } else {
            if (djiVar2.b() - djiVar2.c() < ((jzn) b2.e(jdr.e)).el(kal.c(14)) || !djiVar2.h()) {
                hhoVar.b(true);
            }
            b = ebs.b(hvi.e, 1.0f);
            a = ebqVar.a(b, 1.0f, true);
            eql b3 = eqm.b(24.0f);
            ebe ebeVar = dwfd.a;
            dwfj.a(ffixVar, a, ((Boolean) hhoVar.a()).booleanValue(), b3, dwfd.b(gft.a(b2).a, gft.a(b2).b, b2, 12), null, null, null, hpx.d(-1170592162, new wnl(str), b2), b2, ((i2 >> 12) & 14) | 805502976, 448);
            b2 = b2;
        }
        hio L = b2.L();
        if (L != null) {
            final dji djiVar3 = djiVar2;
            L.d = new ffjm() { // from class: wmz
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ebq ebqVar2 = ebq.this;
                    String str2 = str;
                    dji djiVar4 = djiVar3;
                    hho hhoVar2 = hhoVar;
                    wnm.a(ebqVar2, str2, djiVar4, hhoVar2, ffixVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final boolean z, final ffix ffixVar, final ffix ffixVar2, final ffix ffixVar3, final ffix ffixVar4, final ffix ffixVar5, hfd hfdVar, final int i) {
        int i2;
        hvi b;
        hvi c;
        hvi d;
        hvi c2;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(-1698894231);
        if (i3 == 0) {
            i2 = (true != b2.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.F(ffixVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b2.F(ffixVar2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b2.F(ffixVar3) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b2.F(ffixVar4) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b2.F(ffixVar5) ? 65536 : 131072;
        }
        if ((74899 & i2) == 74898 && b2.I()) {
            b2.s();
        } else {
            hvi j = eba.j(hvi.e, 16.0f, 0.0f, 16.0f, 8.0f, 2);
            dxq dxqVar = dxu.c;
            int i4 = huo.a;
            ipn a = dyo.a(dxqVar, hum.j, b2, 0);
            int a2 = hey.a(b2);
            hfm hfmVar = (hfm) b2;
            hqb ai = hfmVar.ai();
            hvi b3 = huz.b(b2, j);
            int i5 = ist.a;
            ffix ffixVar6 = iss.a;
            b2.x();
            if (hfmVar.z) {
                b2.j(ffixVar6);
            } else {
                b2.z();
            }
            hlc.b(b2, a, iss.e);
            hlc.b(b2, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b2.h(valueOf, ffjmVar);
            }
            hlc.b(b2, b3, iss.c);
            dji a3 = dix.a(0, b2, 0, 1);
            hun hunVar = hum.k;
            b = dys.b(hvi.e, 1.0f, true);
            c = dix.c(b, a3, false & ((r6 & 8) == 0), (r6 & 2) != 0, true);
            hvi a4 = dmyk.a(c, a3);
            ipn a5 = dyo.a(dxu.c, hunVar, b2, 48);
            int a6 = hey.a(b2);
            hqb ai2 = hfmVar.ai();
            hvi b4 = huz.b(b2, a4);
            ffix ffixVar7 = iss.a;
            b2.x();
            if (hfmVar.z) {
                b2.j(ffixVar7);
            } else {
                b2.z();
            }
            hlc.b(b2, a5, iss.e);
            hlc.b(b2, ai2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a6))) {
                Integer valueOf2 = Integer.valueOf(a6);
                hfmVar.ad(valueOf2);
                b2.h(valueOf2, ffjmVar2);
            }
            hlc.b(b2, b4, iss.c);
            ebv.a(ebs.e(hvi.e, 12.0f), b2);
            d = ebs.d(hvi.e, 1.0f);
            b2.v(-1003410150);
            b2.v(-2013492259);
            hfmVar.Z();
            jzn jznVar = (jzn) b2.e(jdr.e);
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new kgq(jznVar);
                hfmVar.ad(R);
            }
            kgq kgqVar = (kgq) R;
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                R2 = new kgc();
                hfmVar.ad(R2);
            }
            kgc kgcVar = (kgc) R2;
            Object R3 = hfmVar.R();
            if (R3 == hfc.a) {
                hic hicVar = new hic(false, hla.a);
                hfmVar.ad(hicVar);
                R3 = hicVar;
            }
            hho hhoVar = (hho) R3;
            Object R4 = hfmVar.R();
            if (R4 == hfc.a) {
                R4 = new kgj(kgcVar);
                hfmVar.ad(R4);
            }
            kgj kgjVar = (kgj) R4;
            Object R5 = hfmVar.R();
            if (R5 == hfc.a) {
                hic hicVar2 = new hic(ffcu.a, hhs.a);
                hfmVar.ad(hicVar2);
                R5 = hicVar2;
            }
            hho hhoVar2 = (hho) R5;
            boolean F = b2.F(kgqVar) | b2.B(257);
            Object R6 = hfmVar.R();
            if (F || R6 == hfc.a) {
                R6 = new wnh(hhoVar2, kgqVar, kgjVar, hhoVar);
                hfmVar.ad(R6);
            }
            ipn ipnVar = (ipn) R6;
            Object R7 = hfmVar.R();
            if (R7 == hfc.a) {
                R7 = new wni(hhoVar, kgjVar);
                hfmVar.ad(R7);
            }
            boolean F2 = b2.F(kgqVar);
            Object R8 = hfmVar.R();
            if (F2 || R8 == hfc.a) {
                R8 = new wnj(kgqVar);
                hfmVar.ad(R8);
            }
            c2 = jjs.c(d, false, (ffji) R8);
            iol.b(c2, hpx.d(1200550679, new wnk(hhoVar2, kgcVar), b2), ipnVar, b2, 48);
            hfmVar.Z();
            dwjt.b(jii.a(R.string.onboarding_title, b2), eba.i(hvi.e, 4.0f, 0.0f, 2), gft.a(b2).s, 0L, null, null, 0L, new jyj(3), 0L, 0, false, 0, 0, null, gft.d(b2).h, b2, 48, 0, 65016);
            b2 = b2;
            ebv.a(ebs.e(hvi.e, 12.0f), b2);
            String a7 = jii.a(R.string.onboarding_privacy, b2);
            String a8 = jii.a(R.string.onboarding_learn_more, b2);
            String a9 = jii.a(R.string.onboarding_settings, b2);
            String b5 = jii.b(true != z ? R.string.onboarding_body : R.string.onboarding_body_st_and_mr, new Object[]{a7, a8, a9}, b2);
            int Q = ffpc.Q(b5, a7, 0, false, 6);
            int Q2 = ffpc.Q(b5, a8, 0, false, 6);
            int Q3 = ffpc.Q(b5, a9, 0, false, 6);
            b2.v(-1467932665);
            if (Q >= 0 && Q2 >= 0 && Q3 >= 0) {
                dltq[] dltqVarArr = new dltq[3];
                int length = Q + a7.length();
                b2.v(-1467921721);
                int i6 = i2 & 112;
                Object R9 = hfmVar.R();
                if (i6 == 32 || R9 == hfc.a) {
                    R9 = new ffji() { // from class: wna
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj) {
                            ffix.this.invoke();
                            return true;
                        }
                    };
                    hfmVar.ad(R9);
                }
                hfmVar.Z();
                dltqVarArr[0] = new dltp("https://www.google.com/policies/privacy/", Q, length, (ffji) R9, 24);
                int length2 = Q2 + a8.length();
                b2.v(-1467911869);
                int i7 = i2 & 896;
                Object R10 = hfmVar.R();
                if (i7 == 256 || R10 == hfc.a) {
                    R10 = new ffji() { // from class: wnb
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj) {
                            ffix.this.invoke();
                            return true;
                        }
                    };
                    hfmVar.ad(R10);
                }
                hfmVar.Z();
                dltqVarArr[1] = new dltp("https://support.google.com/messages?p=magic_compose", Q2, length2, (ffji) R10, 24);
                dlus dlusVar = dlus.h;
                int length3 = Q3 + a9.length();
                b2.v(-1467901636);
                int i8 = i2 & 7168;
                Object R11 = hfmVar.R();
                if (i8 == 2048 || R11 == hfc.a) {
                    R11 = new ffji() { // from class: wnc
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj) {
                            ffix.this.invoke();
                            return true;
                        }
                    };
                    hfmVar.ad(R11);
                }
                hfmVar.Z();
                dltqVarArr[2] = new dlto(dlusVar, Q3, length3, a9, (ffji) R11);
                dlur.e(new dluu(b5, ffdx.g(dltqVarArr), 4), null, gft.a(b2).s, gft.d(b2).l.m(new jpo(0L, 0L, null, null, 0L, 3, 0L, 16744447)), null, 0L, null, false, null, b2, 0, 498);
                b2 = b2;
            }
            hfmVar.Z();
            ebv.a(ebs.e(hvi.e, 16.0f), b2);
            b2.n();
            ebv.a(ebs.e(hvi.e, 4.0f), b2);
            dxn dxnVar = new dxn(8.0f, true, dxr.a);
            hvi u = ebs.u(eao.a(hvi.e, 1), 40.0f, 0.0f, 2);
            ipn a10 = ebm.a(dxnVar, hum.m, b2, 6);
            int a11 = hey.a(b2);
            hqb ai3 = hfmVar.ai();
            hvi b6 = huz.b(b2, u);
            ffix ffixVar8 = iss.a;
            b2.x();
            if (hfmVar.z) {
                b2.j(ffixVar8);
            } else {
                b2.z();
            }
            hlc.b(b2, a10, iss.e);
            hlc.b(b2, ai3, iss.d);
            ffjm ffjmVar3 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a11))) {
                Integer valueOf3 = Integer.valueOf(a11);
                hfmVar.ad(valueOf3);
                b2.h(valueOf3, ffjmVar3);
            }
            hlc.b(b2, b6, iss.c);
            ebr ebrVar = ebr.a;
            b2.v(-1467882065);
            Object R12 = hfmVar.R();
            if (R12 == hfc.a) {
                hic hicVar3 = new hic(false, hla.a);
                hfmVar.ad(hicVar3);
                R12 = hicVar3;
            }
            hho hhoVar3 = (hho) R12;
            hfmVar.Z();
            a(ebrVar, jii.a(R.string.onboarding_negative_button, b2), a3, hhoVar3, ffixVar4, b2, (i2 & 57344) | 3078);
            a(ebrVar, jii.a(R.string.onboarding_positive_button, b2), a3, hhoVar3, ffixVar5, b2, ((i2 >> 3) & 57344) | 3078);
            b2.n();
            b2.n();
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: wnd
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    boolean z2 = z;
                    ffix ffixVar9 = ffixVar;
                    ffix ffixVar10 = ffixVar2;
                    ffix ffixVar11 = ffixVar3;
                    ffix ffixVar12 = ffixVar4;
                    wnm.b(z2, ffixVar9, ffixVar10, ffixVar11, ffixVar12, ffixVar5, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
