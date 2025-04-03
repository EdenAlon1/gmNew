package defpackage;

import android.content.ClipData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyui {
    public static final void a(final cyub cyubVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        long j;
        jpo jpoVar;
        int i3;
        final iyk iykVar;
        final iir iirVar;
        int i4;
        hfm hfmVar;
        hfd hfdVar2;
        long j2;
        jpo jpoVar2;
        hfm hfmVar2;
        hfd hfdVar3;
        int i5 = i & 6;
        hfd b = hfdVar.b(363636561);
        if (i5 == 0) {
            i2 = (true != b.D(cyubVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hfdVar3 = b;
        } else {
            if (cyubVar.a == null && cyubVar.b == null) {
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: cyuc
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            cyub cyubVar2 = cyub.this;
                            int i6 = i;
                            cyui.a(cyubVar2, hviVar, (hfd) obj, hip.a(i6 | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            final iyk iykVar2 = (iyk) b.e(jdr.b);
            final iir iirVar2 = (iir) b.e(jdr.h);
            hvi j3 = eba.j(hvi.e, 0.0f, true != cyubVar.d.a ? 8.0f : 16.0f, 0.0f, 0.0f, 13);
            int i6 = huo.a;
            ipn a = dyo.a(dxu.c, hum.k, b, 48);
            int a2 = hey.a(b);
            hfm hfmVar3 = (hfm) b;
            hqb ai = hfmVar3.ai();
            hvi b2 = huz.b(b, j3);
            int i7 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar3.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar3.z || !ffkj.e(hfmVar3.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar3.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            final String str = cyubVar.a;
            b.v(1534036063);
            if (str == null) {
                i3 = i2;
                hfdVar2 = b;
                iykVar = iykVar2;
                iirVar = iirVar2;
                i4 = 4;
                hfmVar = hfmVar3;
            } else {
                if (cyubVar.d.a) {
                    b.v(-1029673084);
                    j = gft.a(b).d;
                    hfmVar3.Z();
                } else {
                    b.v(-1029597971);
                    j = gft.a(b).q;
                    hfmVar3.Z();
                }
                if (cyubVar.d.a) {
                    b.v(-1029427223);
                    jpoVar = gft.d(b).e;
                    hfmVar3.Z();
                } else {
                    b.v(-1029356884);
                    jpoVar = gft.d(b).h;
                    hfmVar3.Z();
                }
                jpo jpoVar3 = jpoVar;
                b.v(-1280121312);
                boolean F = b.F(iirVar2) | b.F(iykVar2) | b.D(str);
                Object R = hfmVar3.R();
                if (F || R == hfc.a) {
                    R = new ffix() { // from class: cyud
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            iir.this.a(0);
                            String str2 = str;
                            ClipData newPlainText = ClipData.newPlainText(str2, str2);
                            newPlainText.getClass();
                            iykVar2.a(new jcq(newPlainText));
                            return ffcu.a;
                        }
                    };
                    hfmVar3.ad(R);
                }
                ffix ffixVar2 = (ffix) R;
                hfmVar3.Z();
                b.v(-1280122502);
                Object R2 = hfmVar3.R();
                if (R2 == hfc.a) {
                    R2 = new ffix() { // from class: cyue
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            return ffcu.a;
                        }
                    };
                    hfmVar3.ad(R2);
                }
                hfmVar3.Z();
                i3 = i2;
                iykVar = iykVar2;
                iirVar = iirVar2;
                i4 = 4;
                hfmVar = hfmVar3;
                dwjt.b(str, dfb.g(hviVar, true, ffixVar2, (ffix) R2, 110), j, 0L, null, null, 0L, new jyj(3), 0L, 2, false, 1, 0, null, jpoVar3, b, 0, 3120, 54776);
                hfdVar2 = b;
            }
            hfmVar.Z();
            String str2 = cyubVar.b;
            hfdVar2.v(1534069190);
            if (str2 == null) {
                hfdVar3 = hfdVar2;
                hfmVar2 = hfmVar;
            } else {
                if (cyubVar.d.a) {
                    hfdVar2.v(-1028649340);
                    j2 = gft.a(hfdVar2).d;
                    hfmVar.Z();
                } else {
                    hfdVar2.v(-1028574227);
                    j2 = gft.a(hfdVar2).q;
                    hfmVar.Z();
                }
                if (cyubVar.d.a) {
                    hfdVar2.v(-1028340146);
                    jpoVar2 = gft.d(hfdVar2).j;
                    hfmVar.Z();
                } else {
                    hfdVar2.v(-1028274643);
                    jpoVar2 = gft.d(hfdVar2).k;
                    hfmVar.Z();
                }
                jpo jpoVar4 = jpoVar2;
                hve hveVar = hvi.e;
                hfdVar2.v(-1280081210);
                boolean z = (i3 & 14) == i4;
                boolean F2 = hfdVar2.F(iirVar) | z | hfdVar2.F(iykVar);
                Object R3 = hfmVar.R();
                if (F2 || R3 == hfc.a) {
                    R3 = new ffix() { // from class: cyuf
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            String str3 = cyub.this.c;
                            if (str3 != null) {
                                iyk iykVar3 = iykVar;
                                iirVar.a(0);
                                ClipData newPlainText = ClipData.newPlainText(str3, str3);
                                newPlainText.getClass();
                                iykVar3.a(new jcq(newPlainText));
                            }
                            return ffcu.a;
                        }
                    };
                    hfmVar2 = hfmVar;
                    hfmVar2.ad(R3);
                } else {
                    hfmVar2 = hfmVar;
                }
                ffix ffixVar3 = (ffix) R3;
                hfmVar2.Z();
                hfdVar2.v(-1280089445);
                boolean F3 = z | hfdVar2.F(iykVar);
                Object R4 = hfmVar2.R();
                if (F3 || R4 == hfc.a) {
                    R4 = new ffix() { // from class: cyug
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            String str3 = cyub.this.c;
                            if (str3 != null) {
                                iyk iykVar3 = iykVar;
                                ClipData newPlainText = ClipData.newPlainText(str3, str3);
                                newPlainText.getClass();
                                iykVar3.a(new jcq(newPlainText));
                            }
                            return ffcu.a;
                        }
                    };
                    hfmVar2.ad(R4);
                }
                hfmVar2.Z();
                hfdVar3 = hfdVar2;
                dwjt.b(str2, dfb.g(hveVar, true, ffixVar3, (ffix) R4, 110), j2, 0L, null, null, 0L, new jyj(3), 0L, 2, false, 1, 0, null, jpoVar4, hfdVar3, 0, 3120, 54776);
            }
            hfmVar2.Z();
            hfdVar3.n();
        }
        hio L2 = hfdVar3.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: cyuh
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cyub cyubVar2 = cyub.this;
                    int i8 = i;
                    cyui.a(cyubVar2, hviVar, (hfd) obj, hip.a(i8 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
