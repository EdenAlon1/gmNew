package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmgq {
    public static final void a(final dmgr dmgrVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1487250617);
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? b.D(dmgrVar) : b.F(dmgrVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            ffcu ffcuVar = ffcu.a;
            b.v(-632526425);
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !b.F(dmgrVar))) {
                z = false;
            }
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (z || R == hfc.a) {
                R = new dmgp(dmgrVar, null);
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hgs.g(ffcuVar, (ffjm) R, b);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmgk
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dmgq.a(dmgr.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dmgh dmghVar, hvi hviVar, hfd hfdVar, final int i) {
        final hvi hviVar2;
        hfd b = hfdVar.b(227905107);
        int i2 = ((i & 6) == 0 ? (true != b.D(dmghVar) ? 2 : 4) | i : i) | 48;
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hviVar2 = hviVar;
        } else {
            hviVar2 = hvi.e;
            iil b2 = iim.b(jij.b(R.drawable.spark, b), b);
            long a = dmyh.a(dooy.a(b).v, b);
            long a2 = dmyh.a(dooy.a(b).w, b);
            b.v(-833105627);
            fffs fffsVar = new fffs((byte[]) null);
            b.v(-833105135);
            if (dmghVar.d) {
                b.v(-2114106922);
                hfm hfmVar = (hfm) b;
                Object R = hfmVar.R();
                if (R == hfc.a) {
                    R = cxk.a(0.0f);
                    hfmVar.ad(R);
                }
                cxj cxjVar = (cxj) R;
                hfmVar.Z();
                b.v(-2114105418);
                Object R2 = hfmVar.R();
                if (R2 == hfc.a) {
                    R2 = cxk.a(0.0f);
                    hfmVar.ad(R2);
                }
                hfmVar.Z();
                fffsVar.add(new dmgr(-0.01f, -0.1f, a, cxjVar, (cxj) R2, BasePaymentResult.ERROR_REQUEST_FAILED));
                b.v(-2114098666);
                Object R3 = hfmVar.R();
                if (R3 == hfc.a) {
                    R3 = cxk.a(0.0f);
                    hfmVar.ad(R3);
                }
                cxj cxjVar2 = (cxj) R3;
                hfmVar.Z();
                b.v(-2114097162);
                Object R4 = hfmVar.R();
                if (R4 == hfc.a) {
                    R4 = cxk.a(0.0f);
                    hfmVar.ad(R4);
                }
                hfmVar.Z();
                fffsVar.add(new dmgr(0.85f, 0.55f, a2, cxjVar2, (cxj) R4, 400));
                b.v(-2114089866);
                Object R5 = hfmVar.R();
                if (R5 == hfc.a) {
                    R5 = cxk.a(0.0f);
                    hfmVar.ad(R5);
                }
                cxj cxjVar3 = (cxj) R5;
                hfmVar.Z();
                b.v(-2114088362);
                Object R6 = hfmVar.R();
                if (R6 == hfc.a) {
                    R6 = cxk.a(0.0f);
                    hfmVar.ad(R6);
                }
                hfmVar.Z();
                fffsVar.add(new dmgr(0.3f, 0.0f, a, cxjVar3, (cxj) R6, 600));
                b.v(-2114080970);
                Object R7 = hfmVar.R();
                if (R7 == hfc.a) {
                    R7 = cxk.a(0.0f);
                    hfmVar.ad(R7);
                }
                cxj cxjVar4 = (cxj) R7;
                hfmVar.Z();
                b.v(-2114079466);
                Object R8 = hfmVar.R();
                if (R8 == hfc.a) {
                    R8 = cxk.a(0.0f);
                    hfmVar.ad(R8);
                }
                hfmVar.Z();
                fffsVar.add(new dmgr(0.15f, 0.55f, a, cxjVar4, (cxj) R8, 800, 0.75f));
                b.v(-2114071050);
                Object R9 = hfmVar.R();
                if (R9 == hfc.a) {
                    R9 = cxk.a(0.0f);
                    hfmVar.ad(R9);
                }
                cxj cxjVar5 = (cxj) R9;
                hfmVar.Z();
                b.v(-2114069546);
                Object R10 = hfmVar.R();
                if (R10 == hfc.a) {
                    R10 = cxk.a(0.0f);
                    hfmVar.ad(R10);
                }
                hfmVar.Z();
                fffsVar.add(new dmgr(0.65f, -0.1f, a2, cxjVar5, (cxj) R10, 1000, 0.75f));
                b.v(-2114061130);
                Object R11 = hfmVar.R();
                if (R11 == hfc.a) {
                    R11 = cxk.a(0.0f);
                    hfmVar.ad(R11);
                }
                cxj cxjVar6 = (cxj) R11;
                hfmVar.Z();
                b.v(-2114059626);
                Object R12 = hfmVar.R();
                if (R12 == hfc.a) {
                    R12 = cxk.a(0.0f);
                    hfmVar.ad(R12);
                }
                hfmVar.Z();
                fffsVar.add(new dmgr(0.45f, 0.55f, a2, cxjVar6, (cxj) R12, 1200));
            }
            hfm hfmVar2 = (hfm) b;
            hfmVar2.Z();
            List<dmgr> a3 = ffdx.a(fffsVar);
            hfmVar2.Z();
            b.v(-833050593);
            Iterator it = a3.iterator();
            while (it.hasNext()) {
                a((dmgr) it.next(), b, 8);
            }
            hfmVar2.Z();
            b.v(-833047846);
            Object R13 = hfmVar2.R();
            if (R13 == hfc.a) {
                hic hicVar = new hic(0, hla.a);
                hfmVar2.ad(hicVar);
                R13 = hicVar;
            }
            final hho hhoVar = (hho) R13;
            hfmVar2.Z();
            b.v(-833046246);
            Object R14 = hfmVar2.R();
            if (R14 == hfc.a) {
                hic hicVar2 = new hic(0, hla.a);
                hfmVar2.ad(hicVar2);
                R14 = hicVar2;
            }
            final hho hhoVar2 = (hho) R14;
            hfmVar2.Z();
            hve hveVar = hvi.e;
            b.v(-833044135);
            Object R15 = hfmVar2.R();
            if (R15 == hfc.a) {
                R15 = new ffji() { // from class: dmgi
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        kaf kafVar = (kaf) obj;
                        hho.this.b(Integer.valueOf((int) (kafVar.a >> 32)));
                        hhoVar2.b(Integer.valueOf((int) (kafVar.a & 4294967295L)));
                        return ffcu.a;
                    }
                };
                hfmVar2.ad(R15);
            }
            hfmVar2.Z();
            hvi a4 = iqd.a(hveVar, (ffji) R15);
            int i3 = huo.a;
            ipn a5 = dyc.a(hum.a, false);
            int a6 = hey.a(b);
            hqb ai = hfmVar2.ai();
            hvi b3 = huz.b(b, a4);
            int i4 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar2.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a5, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar2.z || !ffkj.e(hfmVar2.R(), Integer.valueOf(a6))) {
                Integer valueOf = Integer.valueOf(a6);
                hfmVar2.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b3, iss.c);
            dyi dyiVar = dyi.a;
            b.v(-2114046769);
            if (c(hhoVar) > 0 && d(hhoVar2) > 0) {
                for (dmgr dmgrVar : a3) {
                    hvi b4 = eau.b(hvr.a(ebs.k(hvi.e, 26.0f), 2.0f), ((jzn) b.e(jdr.e)).eg(dmgrVar.a * c(hhoVar)), ((jzn) b.e(jdr.e)).eg(dmgrVar.b * d(hhoVar2)));
                    ipn a7 = dyc.a(hum.a, false);
                    int a8 = hey.a(b);
                    hqb ai2 = hfmVar2.ai();
                    hvi b5 = huz.b(b, b4);
                    ffix ffixVar2 = iss.a;
                    b.x();
                    int i5 = i2;
                    if (hfmVar2.z) {
                        b.j(ffixVar2);
                    } else {
                        b.z();
                    }
                    hlc.b(b, a7, iss.e);
                    hlc.b(b, ai2, iss.d);
                    ffjm ffjmVar2 = iss.f;
                    if (hfmVar2.z || !ffkj.e(hfmVar2.R(), Integer.valueOf(a8))) {
                        Integer valueOf2 = Integer.valueOf(a8);
                        hfmVar2.ad(valueOf2);
                        b.h(valueOf2, ffjmVar2);
                    }
                    hlc.b(b, b5, iss.c);
                    hvi a9 = dyi.a.a(hvi.e, hum.e);
                    float floatValue = ((Number) dmgrVar.d.d()).floatValue();
                    dwho.a(b2, null, hxe.a(hya.a(a9, floatValue, floatValue), ((Number) dmgrVar.e.d()).floatValue()), dmgrVar.c, b, 56, 0);
                    b.n();
                    i2 = i5;
                }
            }
            hfmVar2.Z();
            dmgf.d(dmghVar, dyiVar.a(hvr.a(hviVar2, 1.0f), hum.d), b, i2 & 14);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmgj
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmgh dmghVar2 = dmgh.this;
                    int i6 = i;
                    dmgq.b(dmghVar2, hviVar2, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    private static final int c(hho hhoVar) {
        return ((Number) hhoVar.a()).intValue();
    }

    private static final int d(hho hhoVar) {
        return ((Number) hhoVar.a()).intValue();
    }
}
