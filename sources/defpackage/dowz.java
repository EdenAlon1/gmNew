package defpackage;

import android.content.Context;
import android.webkit.WebView;
import com.android.vcard.VCardConfig;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dowz {
    public static final WebView a(hho hhoVar) {
        return (WebView) hhoVar.a();
    }

    public static final void b(final doxf doxfVar, final List list, final hvi hviVar, boolean z, doxe doxeVar, ffji ffjiVar, ffji ffjiVar2, dowj dowjVar, dowe doweVar, ffji ffjiVar3, hfd hfdVar, final int i) {
        int i2;
        doxe doxeVar2;
        ffji ffjiVar4;
        dowe doweVar2;
        boolean z2;
        ffji ffjiVar5;
        dowj dowjVar2;
        ffji ffjiVar6;
        hfd hfdVar2;
        final ffji ffjiVar7;
        final ffji ffjiVar8;
        final dowe doweVar3;
        final dowj dowjVar3;
        final doxe doxeVar3;
        final boolean z3;
        final ffji ffjiVar9;
        doxfVar.getClass();
        list.getClass();
        hfd b = hfdVar.b(-1546687207);
        if ((i & 6) == 0) {
            i2 = (true != b.D(doxfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(list) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(hviVar) ? 128 : 256;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 = i2 | 11264;
        }
        int i4 = 1769472 | i3;
        if ((12582912 & i) == 0) {
            i4 = i3 | 5963776;
        }
        if ((100663296 & i) == 0) {
            i4 |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
        }
        int i5 = 805306368 | i4;
        if ((306783379 & i5) == 306783378 && b.I()) {
            b.s();
            z3 = z;
            doxeVar3 = doxeVar;
            ffjiVar8 = ffjiVar;
            ffjiVar9 = ffjiVar2;
            dowjVar3 = dowjVar;
            doweVar3 = doweVar;
            hfdVar2 = b;
            ffjiVar7 = ffjiVar3;
        } else {
            int i6 = i5 & (-264298497);
            b.t();
            if ((i & 1) == 0 || b.G()) {
                b.v(2062471267);
                hfm hfmVar = (hfm) b;
                Object R = hfmVar.R();
                if (R == hfc.a) {
                    R = hgs.a(ffhe.a, b);
                    hfmVar.ad(R);
                }
                ffsk ffskVar = (ffsk) R;
                b.v(27994143);
                boolean D = b.D(ffskVar);
                Object R2 = hfmVar.R();
                if (D || R2 == hfc.a) {
                    R2 = new doxe(ffskVar);
                    hfmVar.ad(R2);
                }
                doxe doxeVar4 = (doxe) R2;
                hfmVar.Z();
                hfmVar.Z();
                b.v(-1185233820);
                Object R3 = hfmVar.R();
                if (R3 == hfc.a) {
                    R3 = new ffji() { // from class: dowo
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj) {
                            ((WebView) obj).getClass();
                            return ffcu.a;
                        }
                    };
                    hfmVar.ad(R3);
                }
                ffji ffjiVar10 = (ffji) R3;
                hfmVar.Z();
                b.v(-1185232636);
                Object R4 = hfmVar.R();
                if (R4 == hfc.a) {
                    R4 = new ffji() { // from class: dowp
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj) {
                            ((WebView) obj).getClass();
                            return ffcu.a;
                        }
                    };
                    hfmVar.ad(R4);
                }
                ffji ffjiVar11 = (ffji) R4;
                hfmVar.Z();
                b.v(-1185231083);
                Object R5 = hfmVar.R();
                if (R5 == hfc.a) {
                    R5 = new dowj(new eeoz(list));
                    hfmVar.ad(R5);
                }
                dowj dowjVar4 = (dowj) R5;
                hfmVar.Z();
                b.v(-1185226965);
                Object R6 = hfmVar.R();
                if (R6 == hfc.a) {
                    R6 = new dowe();
                    hfmVar.ad(R6);
                }
                dowe doweVar4 = (dowe) R6;
                hfmVar.Z();
                b.v(-1185224463);
                Object R7 = hfmVar.R();
                if (R7 == hfc.a) {
                    R7 = new ffji() { // from class: dowq
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj) {
                            Context context = (Context) obj;
                            context.getClass();
                            return new WebView(context);
                        }
                    };
                    hfmVar.ad(R7);
                }
                hfmVar.Z();
                doxeVar2 = doxeVar4;
                ffjiVar4 = ffjiVar10;
                doweVar2 = doweVar4;
                z2 = true;
                ffjiVar5 = ffjiVar11;
                dowjVar2 = dowjVar4;
                ffjiVar6 = (ffji) R7;
            } else {
                b.s();
                z2 = z;
                doxeVar2 = doxeVar;
                ffjiVar4 = ffjiVar;
                ffjiVar5 = ffjiVar2;
                dowjVar2 = dowjVar;
                doweVar2 = doweVar;
                ffjiVar6 = ffjiVar3;
            }
            b.l();
            b.v(-1185223219);
            hfm hfmVar2 = (hfm) b;
            Object R8 = hfmVar2.R();
            ffji ffjiVar12 = ffjiVar6;
            if (R8 == hfc.a) {
                R8 = new hic(null, hla.a);
                hfmVar2.ad(R8);
            }
            final hho hhoVar = (hho) R8;
            hfmVar2.Z();
            boolean z4 = z2 && ((Boolean) doxeVar2.b.a()).booleanValue();
            b.v(-1185219977);
            Object R9 = hfmVar2.R();
            ffji ffjiVar13 = ffjiVar4;
            if (R9 == hfc.a) {
                R9 = new ffix() { // from class: dowr
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        WebView a = dowz.a(hho.this);
                        if (a != null) {
                            a.goBack();
                        }
                        return ffcu.a;
                    }
                };
                hfmVar2.ad(R9);
            }
            hfmVar2.Z();
            acu.a(z4, (ffix) R9, b, 48, 0);
            WebView a = a(hhoVar);
            b.v(-1185218021);
            boolean D2 = b.D(doxeVar2);
            Object R10 = hfmVar2.R();
            if (D2 || R10 == hfc.a) {
                R10 = new dowu(doxeVar2, hhoVar, null);
                hfmVar2.ad(R10);
            }
            hfmVar2.Z();
            hgs.f(a, doxeVar2, (ffjm) R10, b);
            final hkx a2 = hku.a(ffjiVar5, b);
            final WebView a3 = a(hhoVar);
            b.v(-1185213877);
            if (a3 != null) {
                b.v(-966195897);
                boolean D3 = b.D(a2) | b.F(a3);
                Object R11 = hfmVar2.R();
                if (D3 || R11 == hfc.a) {
                    R11 = new ffji() { // from class: dows
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj) {
                            ((hgp) obj).getClass();
                            return new dowy(a3, a2);
                        }
                    };
                    hfmVar2.ad(R11);
                }
                hfmVar2.Z();
                hgs.c(a3, (ffji) R11, b);
            }
            hfmVar2.Z();
            dowjVar2.a = doxfVar;
            doxeVar2.getClass();
            dowjVar2.b = doxeVar2;
            doweVar2.a = doxfVar;
            dym.a(hviVar, null, hpx.d(360397423, new dowx(ffjiVar12, ffjiVar13, doweVar2, dowjVar2, ((Boolean) b.e(jet.a)).booleanValue(), doxfVar, doxeVar2, hhoVar), b), b, ((i6 >> 6) & 14) | 3072, 6);
            hfdVar2 = b;
            ffjiVar7 = ffjiVar12;
            ffjiVar8 = ffjiVar13;
            doweVar3 = doweVar2;
            dowjVar3 = dowjVar2;
            doxeVar3 = doxeVar2;
            z3 = z2;
            ffjiVar9 = ffjiVar5;
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dowt
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    doxf doxfVar2 = doxf.this;
                    List list2 = list;
                    hvi hviVar2 = hviVar;
                    boolean z5 = z3;
                    doxe doxeVar5 = doxeVar3;
                    ffji ffjiVar14 = ffjiVar8;
                    ffji ffjiVar15 = ffjiVar9;
                    dowj dowjVar5 = dowjVar3;
                    dowe doweVar5 = doweVar3;
                    dowz.b(doxfVar2, list2, hviVar2, z5, doxeVar5, ffjiVar14, ffjiVar15, dowjVar5, doweVar5, ffjiVar7, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
