package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czyb {
    public static final void a(final ffix ffixVar, final hvi hviVar, final ffjm ffjmVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-2024626801);
        if (i3 == 0) {
            i2 = (true != b.F(ffixVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffjmVar) ? 128 : 256;
        }
        int i4 = i2;
        if ((i4 & 147) == 146 && b.I()) {
            b.s();
        } else {
            hvi k = ebs.k(hviVar, 48.0f);
            b.v(1437568910);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new dwn();
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hvi j = eba.j(dfb.c(k, (dwn) R, fmn.a(false, 18.0f, 4), false, null, new jjj(0), ffixVar, 12), 8.0f, 19.5f, 0.0f, 0.0f, 12);
            int i5 = huo.a;
            ipn a = dyc.a(hum.a, false);
            int a2 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, j);
            int i6 = ist.a;
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
            } else {
                b.z();
            }
            hlc.b(b, a, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar2);
            }
            hlc.b(b, b2, iss.c);
            ffjmVar.a(b, Integer.valueOf((i4 >> 6) & 14));
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: czxr
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ffix ffixVar3 = ffix.this;
                    hvi hviVar2 = hviVar;
                    int i7 = i;
                    czyb.a(ffixVar3, hviVar2, ffjmVar, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final czxn czxnVar, final ffix ffixVar, hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        final hvi hviVar2;
        hfd b = hfdVar.b(-1287955633);
        if ((i & 6) == 0) {
            i2 = (true != b.F(czxnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffixVar) ? 16 : 32;
        }
        int i3 = i2 | 384;
        if ((i3 & 147) == 146 && b.I()) {
            b.s();
            hviVar2 = hviVar;
        } else {
            int i4 = i3 >> 3;
            hviVar2 = hvi.e;
            final jlm b2 = czxm.b(czxnVar, true, b, 0);
            jpo y = jpo.y(gft.d(b).k, gft.a(b).s, 0L, null, null, null, null, 0L, null, 3, 0, 0L, null, null, 0, 16744446);
            int i5 = i4 & 112;
            if (crnx.j((Context) b.e(AndroidCompositionLocals_androidKt.b))) {
                b.v(770139798);
                dwfj.e(ffixVar, hviVar2, false, null, null, new ebd(), hpx.d(-528381193, new czxt(b2, y), b), b, (i4 & 14) | 817889280 | i5, 380);
                ((hfm) b).Z();
            } else {
                b.v(770343127);
                b.v(856137325);
                boolean D = b.D(b2) | ((i3 & 112) == 32);
                hfm hfmVar = (hfm) b;
                Object R = hfmVar.R();
                if (D || R == hfc.a) {
                    R = new ffji() { // from class: czxp
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj) {
                            int intValue = ((Integer) obj).intValue();
                            if (((jlk) ffdx.M(jlm.this.e(VCardConstants.PROPERTY_URL, intValue, intValue))) != null) {
                                ffixVar.invoke();
                            }
                            return ffcu.a;
                        }
                    };
                    hfmVar.ad(R);
                }
                hfmVar.Z();
                esg.a(b2, hviVar2, y, false, 0, 0, null, (ffji) R, b, i5, 120);
                hfmVar.Z();
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: czxq
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    czxn czxnVar2 = czxn.this;
                    ffix ffixVar2 = ffixVar;
                    int i6 = i;
                    czyb.b(czxnVar2, ffixVar2, hviVar2, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final czxn czxnVar, final ffix ffixVar, final ffix ffixVar2, hvi hviVar, hfd hfdVar, final int i) {
        czxn czxnVar2;
        int i2;
        final hvi hviVar2;
        hvi d;
        hvi b;
        hfd hfdVar2;
        hvi d2;
        hvi c;
        ffixVar.getClass();
        ffixVar2.getClass();
        hfd b2 = hfdVar.b(-792385139);
        if ((i & 6) == 0) {
            czxnVar2 = czxnVar;
            i2 = (true != b2.F(czxnVar2) ? 2 : 4) | i;
        } else {
            czxnVar2 = czxnVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.F(ffixVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b2.F(ffixVar2) ? 128 : 256;
        }
        if (((i2 | 3072) & 1171) == 1170 && b2.I()) {
            b2.s();
            hviVar2 = hviVar;
            hfdVar2 = b2;
        } else {
            hviVar2 = hvi.e;
            int i3 = huo.a;
            huo huoVar = hum.b;
            hvi a = eao.a(hviVar2, 1);
            ipn a2 = dyc.a(huoVar, false);
            int a3 = hey.a(b2);
            hfm hfmVar = (hfm) b2;
            hqb ai = hfmVar.ai();
            hvi b3 = huz.b(b2, a);
            int i4 = ist.a;
            ffix ffixVar3 = iss.a;
            b2.x();
            if (hfmVar.z) {
                b2.j(ffixVar3);
            } else {
                b2.z();
            }
            hlc.b(b2, a2, iss.e);
            hlc.b(b2, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfmVar.ad(valueOf);
                b2.h(valueOf, ffjmVar);
            }
            hlc.b(b2, b3, iss.c);
            d = ebs.d(ebs.u(eba.f(hviVar2, 8.0f, 8.0f, 8.0f, 8.0f), 36.0f, 0.0f, 2), 1.0f);
            b = ebs.b(d, 1.0f);
            gpa.c(hvr.a(b, -1.0f), eqm.b(12.0f), gft.a(b2).I, 0L, 0.0f, 0.0f, null, czws.a, b2, 120);
            hfdVar2 = b2;
            d2 = ebs.d(eba.j(hviVar2, 8.0f, 0.0f, 0.0f, 8.0f, 6), 1.0f);
            hfdVar2.v(-1003410150);
            hfdVar2.v(-2013492259);
            hfmVar.Z();
            jzn jznVar = (jzn) hfdVar2.e(jdr.e);
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
            boolean F = hfdVar2.F(kgqVar) | hfdVar2.B(257);
            Object R6 = hfmVar.R();
            if (F || R6 == hfc.a) {
                R6 = new czxx(hhoVar2, kgqVar, kgjVar, hhoVar);
                hfmVar.ad(R6);
            }
            ipn ipnVar = (ipn) R6;
            Object R7 = hfmVar.R();
            if (R7 == hfc.a) {
                R7 = new czxy(hhoVar, kgjVar);
                hfmVar.ad(R7);
            }
            boolean F2 = hfdVar2.F(kgqVar);
            Object R8 = hfmVar.R();
            if (F2 || R8 == hfc.a) {
                R8 = new czxz(kgqVar);
                hfmVar.ad(R8);
            }
            c = jjs.c(d2, false, (ffji) R8);
            iol.b(c, hpx.d(1200550679, new czya(hhoVar2, kgcVar, czxnVar2, ffixVar, ffixVar2), hfdVar2), ipnVar, hfdVar2, 48);
            hfmVar.Z();
            hfdVar2.n();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: czxs
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    czxn czxnVar3 = czxn.this;
                    ffix ffixVar4 = ffixVar;
                    ffix ffixVar5 = ffixVar2;
                    czyb.c(czxnVar3, ffixVar4, ffixVar5, hviVar2, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
