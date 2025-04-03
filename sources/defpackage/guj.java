package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.material3.ClockDialModifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class guj {
    public static final float a = 0.39453125f;
    public static final float b = 0.26953125f;
    public static final float c = 24.0f;
    public static final float d = 74.0f;
    public static final cmw e = cmx.a(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55);
    public static final cmw f;
    public static final cmw g;
    public static final float h;
    public static final float i;
    public static final float j;
    public static final float k;
    private static final float l = 36.0f;
    private static final float m = 24.0f;
    private static final float n = 7.0f;
    private static final float o = 24.0f;
    private static final float p = 48.0f;
    private static final float q;

    static {
        cmw a2 = cmx.a(12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        f = a2;
        cnv cnvVar = new cnv(a2.b);
        int[] iArr = a2.a;
        int i2 = a2.b;
        for (int i3 = 0; i3 < i2; i3++) {
            cnvVar.e((iArr[i3] % 12) + 12);
        }
        g = cnvVar;
        q = 12.0f;
        h = 384.0f;
        i = 330.0f;
        j = 238.0f;
        k = 200.0f;
    }

    public static final void A(ftb ftbVar, hvi hviVar, grs grsVar, boolean z, hfd hfdVar, int i2) {
        int i3;
        hvi c2;
        ftb ftbVar2;
        grs grsVar2;
        boolean z2;
        int i4 = i2 & 6;
        hfd b2 = hfdVar.b(1249591487);
        if (i4 == 0) {
            i3 = (true != b2.F(ftbVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != b2.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != b2.D(grsVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != b2.E(z) ? 1024 : 2048;
        }
        if ((i3 & 1171) == 1170 && b2.I()) {
            b2.s();
            ftbVar2 = ftbVar;
            z2 = z;
            grsVar2 = grsVar;
        } else {
            b2.t();
            if ((i2 & 1) != 0 && !b2.G()) {
                b2.s();
            }
            b2.l();
            c2 = jjs.c(hviVar, false, gue.a);
            int i5 = huo.a;
            ipn a2 = dyo.a(dxu.c, hum.k, b2, 48);
            int a3 = hey.a(b2);
            hfm hfmVar = (hfm) b2;
            hqb ai = hfmVar.ai();
            hvi b3 = huz.b(b2, c2);
            int i6 = ist.a;
            ffix ffixVar = iss.a;
            b2.x();
            if (hfmVar.z) {
                b2.j(ffixVar);
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
            s(ftbVar, grsVar, b2, (i3 & 14) | ((i3 >> 3) & 112));
            ebv.a(ebs.e(hvi.e, l), b2);
            ftbVar2 = ftbVar;
            j(ebs.k(hvi.e, 256.0f), ftbVar2, grsVar, z, b2, ((i3 << 3) & 112) | 6 | (i3 & 896) | (i3 & 7168));
            grsVar2 = grsVar;
            z2 = z;
            ebv.a(ebs.e(hvi.e, 24.0f), b2);
            b2.n();
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new guf(ftbVar2, hviVar, grsVar2, z2, i2);
        }
    }

    public static final /* synthetic */ void B(hvi hviVar, float f2, ffjm ffjmVar, hfd hfdVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        hfd b2 = hfdVar.b(-835074232);
        if (i4 == 0) {
            i3 = (true != b2.D(hviVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != b2.A(f2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != b2.F(ffjmVar) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && b2.I()) {
            b2.s();
        } else {
            int i5 = i3 & 112;
            hfm hfmVar = (hfm) b2;
            Object R = hfmVar.R();
            if (i5 == 32 || R == hfc.a) {
                R = new gru(f2);
                hfmVar.ad(R);
            }
            ipn ipnVar = (ipn) R;
            int a2 = hey.a(b2);
            hqb ai = hfmVar.ai();
            hvi b3 = huz.b(b2, hviVar);
            int i6 = ist.a;
            int i7 = (((((i3 << 3) & 112) | ((i3 >> 6) & 14)) << 6) & 896) | 6;
            ffix ffixVar = iss.a;
            b2.x();
            if (hfmVar.z) {
                b2.j(ffixVar);
            } else {
                b2.z();
            }
            hlc.b(b2, ipnVar, iss.e);
            hlc.b(b2, ai, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b2.h(valueOf, ffjmVar2);
            }
            hlc.b(b2, b3, iss.c);
            ffjmVar.a(b2, Integer.valueOf((i7 >> 6) & 14));
            b2.n();
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new grv(hviVar, f2, ffjmVar, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0494, code lost:
    
        if (r8.F(r5) != false) goto L126;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x04a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void C(defpackage.hvi r105, defpackage.jvu r106, defpackage.ffji r107, defpackage.gul r108, int r109, defpackage.euw r110, defpackage.euv r111, defpackage.grs r112, defpackage.hfd r113, int r114) {
        /*
            Method dump skipped, instructions count: 1248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.guj.C(hvi, jvu, ffji, gul, int, euw, euv, grs, hfd, int):void");
    }

    public static final String D(int i2, boolean z, int i3, hfd hfdVar) {
        int i4 = guk.b(i2, 1) ? R.string.m3c_time_picker_minute_suffix : z ? R.string.m3c_time_picker_hour_24h_suffix : R.string.m3c_time_picker_hour_suffix;
        Object[] objArr = {Integer.valueOf(i3)};
        String b2 = hcb.b(i4, hfdVar);
        Locale f2 = kqt.a((Configuration) hfdVar.e(AndroidCompositionLocals_androidKt.a)).f(0);
        if (f2 == null) {
            f2 = Locale.getDefault();
        }
        Object[] copyOf = Arrays.copyOf(objArr, 1);
        String format = String.format(f2, b2, Arrays.copyOf(copyOf, copyOf.length));
        format.getClass();
        return format;
    }

    private static final boolean E(hkx hkxVar) {
        return ((Boolean) hkxVar.a()).booleanValue();
    }

    public static final float a(float f2, float f3) {
        float atan2 = ((float) Math.atan2(f2, f3)) - 1.5707964f;
        return atan2 < 0.0f ? atan2 + 6.2831855f : atan2;
    }

    public static final int b(gul gulVar) {
        if (gulVar.k()) {
            return gulVar.d() % 24;
        }
        if (gulVar.d() % 12 == 0) {
            return 12;
        }
        return w(gulVar) ? gulVar.d() - 12 : gulVar.d();
    }

    public static final long c(hho hhoVar) {
        return ((iak) hhoVar.a()).a;
    }

    public static final long d(ftb ftbVar) {
        float c2;
        float f2;
        float c3 = ftbVar.c() / 256.0f;
        if (ftbVar.k() && w(ftbVar) && guk.b(ftbVar.f(), 0)) {
            c2 = ftbVar.c();
            f2 = 0.26953125f;
        } else {
            c2 = ftbVar.c();
            f2 = 0.39453125f;
        }
        float f3 = c3 * 24.0f;
        float f4 = ((jzq) ffmk.m(new jzq((c2 * f2) - f3), new jzq(0.0f))).a;
        float f5 = f4 + f3;
        return jzr.a((f5 * ((float) Math.cos(ftbVar.b()))) + (ftbVar.c() / 2.0f), (((float) Math.sin(ftbVar.b())) * f5) + (ftbVar.c() / 2.0f));
    }

    public static final iam e(hho hhoVar) {
        return (iam) hhoVar.a();
    }

    public static final jvu f(hho hhoVar) {
        return (jvu) hhoVar.a();
    }

    public static final jvu g(hho hhoVar) {
        return (jvu) hhoVar.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00af, code lost:
    
        if (defpackage.ffsw.c(100, r6) == r7) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(defpackage.ftb r11, float r12, float r13, float r14, boolean r15, long r16, defpackage.cxt r18, defpackage.ffgu r19) {
        /*
            r0 = r19
            boolean r1 = r0 instanceof defpackage.guh
            if (r1 == 0) goto L15
            r1 = r0
            guh r1 = (defpackage.guh) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.c = r2
            goto L1a
        L15:
            guh r1 = new guh
            r1.<init>(r0)
        L1a:
            r6 = r1
            java.lang.Object r0 = r6.b
            ffhh r7 = defpackage.ffhh.a
            int r1 = r6.c
            r8 = 2
            r9 = 1
            if (r1 == 0) goto L43
            if (r1 == r9) goto L3a
            if (r1 != r8) goto L32
            boolean r1 = r6.a
            ftb r2 = r6.d
            defpackage.ffci.b(r0)
            goto Lb2
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3a:
            boolean r1 = r6.a
            ftb r2 = r6.d
            defpackage.ffci.b(r0)
            r0 = r2
            goto L96
        L43:
            defpackage.ffci.b(r0)
            int r0 = defpackage.kaa.b(r16)
            float r0 = (float) r0
            float r0 = r13 - r0
            int r1 = defpackage.kaa.a(r16)
            float r1 = (float) r1
            float r1 = r12 - r1
            float r0 = a(r0, r1)
            int r1 = r11.f()
            boolean r1 = defpackage.guk.b(r1, r9)
            if (r1 == 0) goto L71
            r1 = 1037465424(0x3dd67750, float:0.10471976)
            float r0 = r0 / r1
            r2 = 1084227584(0x40a00000, float:5.0)
            float r0 = r0 / r2
            double r3 = (double) r0
            double r3 = java.lang.Math.rint(r3)
            float r0 = (float) r3
            float r0 = r0 * r2
            goto L7b
        L71:
            r1 = 1057360530(0x3f060a92, float:0.5235988)
            float r0 = r0 / r1
            double r2 = (double) r0
            double r2 = java.lang.Math.rint(r2)
            float r0 = (float) r2
        L7b:
            float r0 = r0 * r1
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r16
            r10 = r0
            r0 = r11
            u(r0, r1, r2, r3, r4)
            r6.d = r11
            r6.a = r15
            r6.c = r9
            r2 = r18
            java.lang.Object r2 = r11.g(r10, r2, r9, r6)
            if (r2 == r7) goto Lba
            r0 = r11
            r1 = r15
        L96:
            int r2 = r0.f()
            r3 = 0
            boolean r2 = defpackage.guk.b(r2, r3)
            if (r2 == 0) goto Lb1
            if (r1 == 0) goto Lb1
            r6.d = r0
            r6.a = r9
            r6.c = r8
            r2 = 100
            java.lang.Object r2 = defpackage.ffsw.c(r2, r6)
            if (r2 == r7) goto Lba
        Lb1:
            r2 = r0
        Lb2:
            if (r1 == 0) goto Lb7
            r2.j(r9)
        Lb7:
            ffcu r0 = defpackage.ffcu.a
            return r0
        Lba:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.guj.h(ftb, float, float, float, boolean, long, cxt, ffgu):java.lang.Object");
    }

    public static final void i(gul gulVar, grs grsVar, hfd hfdVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        hfd b2 = hfdVar.b(-934561141);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? b2.D(gulVar) : b2.F(gulVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != b2.D(grsVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && b2.I()) {
            b2.s();
        } else {
            hfz.b(new hil[]{grl.a.c(gvu.a(heg.l, b2)), jdr.j.c(kah.a)}, hpx.d(-477913269, new grw(gulVar, grsVar), b2), b2, 56);
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new grx(gulVar, grsVar, i2);
        }
    }

    public static final void j(hvi hviVar, ftb ftbVar, grs grsVar, boolean z, hfd hfdVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        hfd b2 = hfdVar.b(-478841003);
        if (i4 == 0) {
            i3 = (true != b2.D(hviVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != b2.F(ftbVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != b2.D(grsVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != b2.E(z) ? 1024 : 2048;
        }
        if ((i3 & 1171) == 1170 && b2.I()) {
            b2.s();
        } else {
            css.a(guk.b(ftbVar.f(), 1) ? e : f, hxs.c(dee.a(hviVar, grsVar.a, eqm.a).a(new ClockDialModifier(ftbVar, z, ftbVar.f(), gjb.a(1, b2))), new gug(ftbVar, grsVar)), gjb.a(4, b2), null, hpx.d(747010833, new gse(grsVar, ftbVar, z), b2), b2, 24576, 8);
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new gsf(hviVar, ftbVar, grsVar, z, i2);
        }
    }

    public static final void k(hvi hviVar, ftb ftbVar, int i2, boolean z, hfd hfdVar, int i3) {
        int i4;
        boolean z2;
        hvi a2;
        huo huoVar;
        hfd hfdVar2;
        int i5 = i3 & 6;
        hfd b2 = hfdVar.b(-206784607);
        if (i5 == 0) {
            i4 = (true != b2.D(hviVar) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != b2.F(ftbVar) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != b2.B(i2) ? 128 : 256;
        }
        if ((i3 & 3072) == 0) {
            z2 = z;
            i4 |= true != b2.E(z2) ? 1024 : 2048;
        } else {
            z2 = z;
        }
        if ((i4 & 1171) == 1170 && b2.I()) {
            b2.s();
            hfdVar2 = b2;
        } else {
            jpo a3 = gvu.a(heg.a, b2);
            jzn jznVar = (jzn) b2.e(jdr.e);
            float em = jznVar.em(74.0f);
            hfm hfmVar = (hfm) b2;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                hic hicVar = new hic(new iak(0L), hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            hho hhoVar = (hho) R;
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                hic hicVar2 = new hic(new kaa(0L), hla.a);
                hfmVar.ad(hicVar2);
                R2 = hicVar2;
            }
            hho hhoVar2 = (hho) R2;
            Object R3 = hfmVar.R();
            if (R3 == hfc.a) {
                hic hicVar3 = new hic(iam.a, hla.a);
                hfmVar.ad(hicVar3);
                R3 = hicVar3;
            }
            hho hhoVar3 = (hho) R3;
            Object R4 = hfmVar.R();
            if (R4 == hfc.a) {
                hgd hgdVar = new hgd(hgs.a(ffhe.a, b2));
                hfmVar.ad(hgdVar);
                R4 = hgdVar;
            }
            ffsk ffskVar = ((hgd) R4).a;
            String D = D(ftbVar.f(), ftbVar.k(), i2, b2);
            String a4 = fwc.a(i2, 0, 7);
            boolean D2 = b2.D(ftbVar);
            Object R5 = hfmVar.R();
            if (D2 || R5 == hfc.a) {
                gsm gsmVar = new gsm(ftbVar, jznVar, hhoVar3);
                hqg hqgVar = hkg.a;
                R5 = new hgk(gsmVar, null);
                hfmVar.ad(R5);
            }
            hkx hkxVar = (hkx) R5;
            int i6 = huo.a;
            huo huoVar2 = hum.e;
            Object R6 = hfmVar.R();
            if (R6 == hfc.a) {
                R6 = new gsg(hhoVar2, hhoVar3, hhoVar);
                hfmVar.ad(R6);
            }
            a2 = dfz.a(ebs.k(gex.a(ipx.a(hviVar, (ffji) R6)), 48.0f), true, null);
            boolean F = ((i4 & 7168) == 2048) | b2.F(ffskVar) | b2.F(ftbVar) | b2.A(em) | b2.D(hkxVar);
            Object R7 = hfmVar.R();
            if (F || R7 == hfc.a) {
                huoVar = huoVar2;
                gsj gsjVar = new gsj(ffskVar, ftbVar, em, z2, hhoVar, hhoVar2, hkxVar);
                hfmVar.ad(gsjVar);
                R7 = gsjVar;
            } else {
                huoVar = huoVar2;
            }
            hvi c2 = jjs.c(a2, true, (ffji) R7);
            ipn a5 = dyc.a(huoVar, false);
            int a6 = hey.a(b2);
            hqb ai = hfmVar.ai();
            hvi b3 = huz.b(b2, c2);
            int i7 = ist.a;
            ffix ffixVar = iss.a;
            b2.x();
            if (hfmVar.z) {
                b2.j(ffixVar);
            } else {
                b2.z();
            }
            hlc.b(b2, a5, iss.e);
            hlc.b(b2, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a6))) {
                Integer valueOf = Integer.valueOf(a6);
                hfmVar.ad(valueOf);
                b2.h(valueOf, ffjmVar);
            }
            hlc.b(b2, b3, iss.c);
            hve hveVar = hvi.e;
            boolean D3 = b2.D(D);
            Object R8 = hfmVar.R();
            if (D3 || R8 == hfc.a) {
                R8 = new gsk(D);
                hfmVar.ad(R8);
            }
            hfdVar2 = b2;
            grl.b(a4, jjs.b(hveVar, (ffji) R8), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, a3, hfdVar2, 0, 0, 65532);
            hfdVar2.n();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new gsl(hviVar, ftbVar, i2, z, i3);
        }
    }

    public static final void l(hvi hviVar, hfd hfdVar, int i2) {
        int i3;
        hfd hfdVar2;
        int i4 = i2 & 6;
        hfd b2 = hfdVar.b(2100674302);
        if (i4 == 0) {
            i3 = (true != b2.D(hviVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && b2.I()) {
            b2.s();
            hfdVar2 = b2;
        } else {
            jpo y = jpo.y((jpo) b2.e(grl.a), 0L, 0L, null, null, null, null, 0L, null, 3, 0, 0L, null, new jyh(jye.a, 17), 0, 15695871);
            hvi b3 = jjs.b(hviVar, gsn.a);
            int i5 = huo.a;
            ipn a2 = dyc.a(hum.e, false);
            int a3 = hey.a(b2);
            hfm hfmVar = (hfm) b2;
            hqb ai = hfmVar.ai();
            hvi b4 = huz.b(b2, b3);
            int i6 = ist.a;
            ffix ffixVar = iss.a;
            b2.x();
            if (hfmVar.z) {
                b2.j(ffixVar);
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
            hlc.b(b2, b4, iss.c);
            hfdVar2 = b2;
            grl.b(":", null, fyc.h(18, b2), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y, hfdVar2, 6, 0, 65530);
            hfdVar2.n();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new gso(hviVar, i2);
        }
    }

    public static final void m(gul gulVar, grs grsVar, hfd hfdVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        hfd b2 = hfdVar.b(755539561);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? b2.D(gulVar) : b2.F(gulVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != b2.D(grsVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && b2.I()) {
            b2.s();
        } else {
            dxj dxjVar = dxu.e;
            hve hveVar = hvi.e;
            int i5 = huo.a;
            ipn a2 = dyo.a(dxjVar, hum.j, b2, 6);
            int a3 = hey.a(b2);
            hfm hfmVar = (hfm) b2;
            hqb ai = hfmVar.ai();
            hvi b3 = huz.b(b2, hveVar);
            int i6 = ist.a;
            ffix ffixVar = iss.a;
            b2.x();
            if (hfmVar.z) {
                b2.j(ffixVar);
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
            i(gulVar, grsVar, b2, i3 & 126);
            if (gulVar.k()) {
                b2.v(-1554663480);
                hfmVar.Z();
            } else {
                b2.v(-1555106501);
                hvi j2 = eba.j(hvi.e, 0.0f, q, 0.0f, 0.0f, 13);
                ipn a4 = dyc.a(hum.a, false);
                int a5 = hey.a(b2);
                hqb ai2 = hfmVar.ai();
                hvi b4 = huz.b(b2, j2);
                ffix ffixVar2 = iss.a;
                b2.x();
                if (hfmVar.z) {
                    b2.j(ffixVar2);
                } else {
                    b2.z();
                }
                hlc.b(b2, a4, iss.e);
                hlc.b(b2, ai2, iss.d);
                ffjm ffjmVar2 = iss.f;
                if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a5))) {
                    Integer valueOf2 = Integer.valueOf(a5);
                    hfmVar.ad(valueOf2);
                    b2.h(valueOf2, ffjmVar2);
                }
                hlc.b(b2, b4, iss.c);
                int i7 = i3 << 3;
                n(ebs.m(hvi.e, 216.0f, 38.0f), gulVar, grsVar, b2, (i7 & 896) | (i7 & 112) | 6);
                b2.n();
                hfmVar.Z();
            }
            b2.n();
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new gsp(gulVar, grsVar, i2);
        }
    }

    public static final void n(hvi hviVar, gul gulVar, grs grsVar, hfd hfdVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        hfd b2 = hfdVar.b(1261215927);
        if (i4 == 0) {
            i3 = (true != b2.D(hviVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? b2.D(gulVar) : b2.F(gulVar)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != b2.D(grsVar) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && b2.I()) {
            b2.s();
        } else {
            hfm hfmVar = (hfm) b2;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = gss.a;
                hfmVar.ad(R);
            }
            idh c2 = glx.c(11, b2);
            c2.getClass();
            eqd eqdVar = (eqd) c2;
            eqd eqdVar2 = glu.a;
            eqe eqeVar = glu.i;
            o(hviVar, gulVar, grsVar, (ipn) R, eqd.d(eqdVar, null, eqeVar, eqeVar, null, 9), glx.a(eqdVar), b2, (i3 & 896) | (i3 & 14) | 3072 | (i3 & 112));
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new gsq(hviVar, gulVar, grsVar, i2);
        }
    }

    public static final void o(hvi hviVar, gul gulVar, grs grsVar, ipn ipnVar, idh idhVar, idh idhVar2, hfd hfdVar, int i2) {
        int i3;
        idh idhVar3;
        hvi c2;
        hvi c3;
        hvi a2;
        int i4 = i2 & 6;
        hfd b2 = hfdVar.b(1374241901);
        if (i4 == 0) {
            i3 = (true != b2.D(hviVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? b2.D(gulVar) : b2.F(gulVar)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != b2.D(grsVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != b2.D(ipnVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            idhVar3 = idhVar;
            i3 |= true != b2.D(idhVar3) ? 8192 : 16384;
        } else {
            idhVar3 = idhVar;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != b2.D(idhVar2) ? 65536 : 131072;
        }
        int i5 = i3;
        if ((74899 & i5) == 74898 && b2.I()) {
            b2.s();
        } else {
            der a3 = des.a(1.0f, grsVar.c);
            idh c4 = glx.c(11, b2);
            c4.getClass();
            eqd eqdVar = (eqd) c4;
            String b3 = hcb.b(R.string.m3c_time_picker_period_toggle_description, b2);
            boolean D = b2.D(b3);
            hfm hfmVar = (hfm) b2;
            Object R = hfmVar.R();
            if (D || R == hfc.a) {
                R = new gsv(b3);
                hfmVar.ad(R);
            }
            c2 = jjs.c(hviVar, false, (ffji) R);
            hvi b4 = dek.b(epp.a(c2), a3, eqdVar);
            int a4 = hey.a(b2);
            hqb ai = hfmVar.ai();
            hvi b5 = huz.b(b2, b4);
            int i6 = ist.a;
            ffix ffixVar = iss.a;
            b2.x();
            if (hfmVar.z) {
                b2.j(ffixVar);
            } else {
                b2.z();
            }
            hlc.b(b2, ipnVar, iss.e);
            hlc.b(b2, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a4))) {
                Integer valueOf = Integer.valueOf(a4);
                hfmVar.ad(valueOf);
                b2.h(valueOf, ffjmVar);
            }
            hlc.b(b2, b5, iss.c);
            boolean z = !w(gulVar);
            int i7 = i5 & 112;
            boolean z2 = false;
            boolean z3 = i7 == 32 || ((i5 & 64) != 0 && b2.F(gulVar));
            Object R2 = hfmVar.R();
            if (z3 || R2 == hfc.a) {
                R2 = new gsw(gulVar);
                hfmVar.ad(R2);
            }
            int i8 = (i5 << 3) & 7168;
            r(z, idhVar3, (ffix) R2, grsVar, fza.a, b2, ((i5 >> 9) & 112) | 24576 | i8);
            c3 = ebs.c(hvr.a(ioe.a(hvi.e, "Spacer"), 2.0f), 1.0f);
            a2 = dee.a(c3, grsVar.c, idb.a);
            ebv.a(a2, b2);
            boolean w = w(gulVar);
            if (i7 == 32 || ((i5 & 64) != 0 && b2.F(gulVar))) {
                z2 = true;
            }
            Object R3 = hfmVar.R();
            if (z2 || R3 == hfc.a) {
                R3 = new gsx(gulVar);
                hfmVar.ad(R3);
            }
            r(w, idhVar2, (ffix) R3, grsVar, fza.b, b2, ((i5 >> 12) & 112) | 24576 | i8);
            b2.n();
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new gsy(hviVar, gulVar, grsVar, ipnVar, idhVar, idhVar2, i2);
        }
    }

    public static final void p(hvi hviVar, grs grsVar, gul gulVar, hfd hfdVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        hfd b2 = hfdVar.b(-475657989);
        if (i4 == 0) {
            i3 = (true != b2.D(hviVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != b2.D(grsVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != ((i2 & 512) == 0 ? b2.D(gulVar) : b2.F(gulVar)) ? 128 : 256;
        }
        int i5 = i3;
        if ((i5 & 147) == 146 && b2.I()) {
            b2.s();
        } else {
            int i6 = i5 & 896;
            Object[] objArr = new Object[0];
            hrh hrhVar = jvu.a;
            boolean z = i6 == 256 || ((i5 & 512) != 0 && b2.F(gulVar));
            hfm hfmVar = (hfm) b2;
            Object R = hfmVar.R();
            if (z || R == hfc.a) {
                R = new gtk(gulVar);
                hfmVar.ad(R);
            }
            hho b3 = hqr.b(objArr, hrhVar, (ffix) R, b2);
            Object[] objArr2 = new Object[0];
            hrh hrhVar2 = jvu.a;
            boolean z2 = i6 == 256 || ((i5 & 512) != 0 && b2.F(gulVar));
            Object R2 = hfmVar.R();
            if (z2 || R2 == hfc.a) {
                R2 = new gtl(gulVar);
                hfmVar.ad(R2);
            }
            hho b4 = hqr.b(objArr2, hrhVar2, (ffix) R2, b2);
            hvi j2 = eba.j(hviVar, 0.0f, 0.0f, 0.0f, 24.0f, 7);
            int i7 = huo.a;
            ipn a2 = ebm.a(dxu.a, hum.m, b2, 48);
            int a3 = hey.a(b2);
            hqb ai = hfmVar.ai();
            hvi b5 = huz.b(b2, j2);
            int i8 = ist.a;
            ffix ffixVar = iss.a;
            b2.x();
            if (hfmVar.z) {
                b2.j(ffixVar);
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
            hlc.b(b2, b5, iss.c);
            hfz.b(new hil[]{grl.a.c(jpo.y(gvu.a(hef.e, b2), grsVar.c(true), 0L, null, null, null, null, 0L, null, 3, 0, 0L, null, null, 0, 16744446)), jdr.j.c(kah.a)}, hpx.d(1306700887, new gti(b3, gulVar, grsVar, b4), b2), b2, 56);
            if (((guo) gulVar).a) {
                b2.v(-1323922935);
                hfmVar.Z();
            } else {
                b2.v(-1324257363);
                hvi j3 = eba.j(hvi.e, q, 0.0f, 0.0f, 0.0f, 14);
                ipn a4 = dyc.a(hum.a, false);
                int a5 = hey.a(b2);
                hqb ai2 = hfmVar.ai();
                hvi b6 = huz.b(b2, j3);
                ffix ffixVar2 = iss.a;
                b2.x();
                if (hfmVar.z) {
                    b2.j(ffixVar2);
                } else {
                    b2.z();
                }
                hlc.b(b2, a4, iss.e);
                hlc.b(b2, ai2, iss.d);
                ffjm ffjmVar2 = iss.f;
                if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a5))) {
                    Integer valueOf2 = Integer.valueOf(a5);
                    hfmVar.ad(valueOf2);
                    b2.h(valueOf2, ffjmVar2);
                }
                hlc.b(b2, b6, iss.c);
                t(ebs.m(hvi.e, 52.0f, 72.0f), gulVar, grsVar, b2, ((i5 >> 3) & 112) | 6 | ((i5 << 3) & 896));
                b2.n();
                hfmVar.Z();
            }
            b2.n();
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new gtj(hviVar, grsVar, gulVar, i2);
        }
    }

    public static final void q(hvi hviVar, int i2, gul gulVar, int i3, grs grsVar, hfd hfdVar, int i4) {
        int i5;
        hfd hfdVar2;
        int i6 = i4 & 6;
        hfd b2 = hfdVar.b(-1148055889);
        if (i6 == 0) {
            i5 = (true != b2.D(hviVar) ? 2 : 4) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= true != b2.B(i2) ? 16 : 32;
        }
        if ((i4 & 384) == 0) {
            i5 |= true != ((i4 & 512) == 0 ? b2.D(gulVar) : b2.F(gulVar)) ? 128 : 256;
        }
        if ((i4 & 3072) == 0) {
            i5 |= true != b2.B(i3) ? 1024 : 2048;
        }
        if ((i4 & 24576) == 0) {
            i5 |= true != b2.D(grsVar) ? 8192 : 16384;
        }
        if ((i5 & 9363) == 9362 && b2.I()) {
            b2.s();
            hfdVar2 = b2;
        } else {
            boolean b3 = guk.b(gulVar.f(), i3);
            String b4 = hcb.b(true != guk.b(i3, 0) ? R.string.m3c_time_picker_minute_selection : R.string.m3c_time_picker_hour_selection, b2);
            long b5 = grsVar.b(b3);
            long c2 = grsVar.c(b3);
            boolean D = b2.D(b4);
            hfm hfmVar = (hfm) b2;
            Object R = hfmVar.R();
            if (D || R == hfc.a) {
                R = new gtt(b4);
                hfmVar.ad(R);
            }
            hvi c3 = jjs.c(hviVar, true, (ffji) R);
            idh c4 = glx.c(11, b2);
            boolean z = ((i5 & 7168) == 2048) | ((i5 & 896) == 256 || ((i5 & 512) != 0 && b2.F(gulVar)));
            Object R2 = hfmVar.R();
            if (z || R2 == hfc.a) {
                R2 = new gtu(i3, gulVar);
                hfmVar.ad(R2);
            }
            hfdVar2 = b2;
            gpa.d(b3, (ffix) R2, c3, false, c4, b5, 0.0f, null, null, hpx.d(-1477282471, new gtw(i3, gulVar, i2, c2), b2), hfdVar2, 1992);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new gtx(hviVar, i2, gulVar, i3, grsVar, i4);
        }
    }

    public static final void r(boolean z, idh idhVar, ffix ffixVar, grs grsVar, ffjn ffjnVar, hfd hfdVar, int i2) {
        int i3;
        idh idhVar2;
        hvi c2;
        hvi c3;
        int i4 = i2 & 6;
        hfd b2 = hfdVar.b(-1937408098);
        if (i4 == 0) {
            i3 = (true != b2.E(z) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            idhVar2 = idhVar;
            i3 |= true != b2.D(idhVar2) ? 16 : 32;
        } else {
            idhVar2 = idhVar;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != b2.F(ffixVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != b2.D(grsVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != b2.F(ffjnVar) ? 8192 : 16384;
        }
        if ((i3 & 9363) == 9362 && b2.I()) {
            b2.s();
        } else {
            long j2 = z ? grsVar.f : grsVar.g;
            long j3 = z ? grsVar.d : grsVar.e;
            c2 = ebs.c(hvr.a(hvi.e, true != z ? 1.0f : 0.0f), 1.0f);
            int i5 = i3 & 14;
            hfm hfmVar = (hfm) b2;
            int i6 = i3;
            Object R = hfmVar.R();
            if (i5 == 4 || R == hfc.a) {
                R = new gty(z);
                hfmVar.ad(R);
            }
            c3 = jjs.c(c2, false, (ffji) R);
            ebf ebfVar = new ebf(0.0f, 0.0f, 0.0f, 0.0f);
            ebe ebeVar = fvp.a;
            fwa.c(ffixVar, c3, false, idhVar2, fvp.e(j3, j2, b2, 12), ebfVar, ffjnVar, b2, ((i6 >> 6) & 14) | 12582912 | ((i6 << 6) & 7168) | (1879048192 & (i6 << 15)), 356);
            b2 = b2;
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new gtz(z, idhVar, ffixVar, grsVar, ffjnVar, i2);
        }
    }

    public static final void s(gul gulVar, grs grsVar, hfd hfdVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        hfd b2 = hfdVar.b(2054675515);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? b2.D(gulVar) : b2.F(gulVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != b2.D(grsVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && b2.I()) {
            b2.s();
        } else {
            dxj dxjVar = dxu.e;
            hve hveVar = hvi.e;
            int i5 = huo.a;
            ipn a2 = ebm.a(dxjVar, hum.m, b2, 6);
            int a3 = hey.a(b2);
            hfm hfmVar = (hfm) b2;
            hqb ai = hfmVar.ai();
            hvi b3 = huz.b(b2, hveVar);
            int i6 = ist.a;
            ffix ffixVar = iss.a;
            b2.x();
            if (hfmVar.z) {
                b2.j(ffixVar);
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
            i(gulVar, grsVar, b2, i3 & 126);
            if (gulVar.k()) {
                b2.v(-517888458);
                hfmVar.Z();
            } else {
                b2.v(-518327635);
                hvi j2 = eba.j(hvi.e, q, 0.0f, 0.0f, 0.0f, 14);
                ipn a4 = dyc.a(hum.a, false);
                int a5 = hey.a(b2);
                hqb ai2 = hfmVar.ai();
                hvi b4 = huz.b(b2, j2);
                ffix ffixVar2 = iss.a;
                b2.x();
                if (hfmVar.z) {
                    b2.j(ffixVar2);
                } else {
                    b2.z();
                }
                hlc.b(b2, a4, iss.e);
                hlc.b(b2, ai2, iss.d);
                ffjm ffjmVar2 = iss.f;
                if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a5))) {
                    Integer valueOf2 = Integer.valueOf(a5);
                    hfmVar.ad(valueOf2);
                    b2.h(valueOf2, ffjmVar2);
                }
                hlc.b(b2, b4, iss.c);
                int i7 = i3 << 3;
                t(ebs.m(hvi.e, 52.0f, 80.0f), gulVar, grsVar, b2, (i7 & 896) | (i7 & 112) | 6);
                b2.n();
                hfmVar.Z();
            }
            b2.n();
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new gua(gulVar, grsVar, i2);
        }
    }

    public static final void t(hvi hviVar, gul gulVar, grs grsVar, hfd hfdVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        hfd b2 = hfdVar.b(-1898918107);
        if (i4 == 0) {
            i3 = (true != b2.D(hviVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? b2.D(gulVar) : b2.F(gulVar)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != b2.D(grsVar) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && b2.I()) {
            b2.s();
        } else {
            hfm hfmVar = (hfm) b2;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = gud.a;
                hfmVar.ad(R);
            }
            idh c2 = glx.c(11, b2);
            c2.getClass();
            eqd eqdVar = (eqd) c2;
            eqd b3 = glx.b(eqdVar);
            eqd eqdVar2 = glu.a;
            eqe eqeVar = glu.i;
            o(hviVar, gulVar, grsVar, (ipn) R, b3, eqd.d(eqdVar, eqeVar, eqeVar, null, null, 12), b2, (i3 & 896) | (i3 & 14) | 3072 | (i3 & 112));
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new gub(hviVar, gulVar, grsVar, i2);
        }
    }

    public static final void u(gul gulVar, float f2, float f3, float f4, long j2) {
        if (guk.b(gulVar.f(), 0) && gulVar.k()) {
            float hypot = (float) Math.hypot(kaa.a(j2) - f2, kaa.b(j2) - f3);
            if (w(gulVar)) {
                gulVar.h(gulVar.d() - (hypot >= f4 ? 12 : 0));
            } else {
                gulVar.h(gulVar.d() + (hypot < f4 ? 12 : 0));
            }
        }
    }

    public static final void v(int i2, gul gulVar, jvu jvuVar, jvu jvuVar2, int i3, ffji ffjiVar) {
        if (ffkj.e(jvuVar.a(), jvuVar2.a())) {
            ffjiVar.invoke(jvuVar);
            return;
        }
        if (jvuVar.a().length() == 0) {
            if (guk.b(i2, 0)) {
                gulVar.h((!w(gulVar) || ((guo) gulVar).a) ? 0 : 12);
            } else {
                gulVar.i(0);
            }
            ffjiVar.invoke(jvu.c(jvuVar, ""));
            return;
        }
        try {
            int d2 = (jvuVar.a().length() == 3 && jpm.e(jvuVar.c) == 1) ? ffol.d(jvuVar.a().charAt(0)) : Integer.parseInt(jvuVar.a());
            if (d2 <= i3) {
                if (guk.b(i2, 0)) {
                    if (!w(gulVar) || ((guo) gulVar).a) {
                        r0 = 0;
                    }
                    gulVar.h(r0 + d2);
                    if (d2 > 1 && !((guo) gulVar).a) {
                        gulVar.j(1);
                    }
                } else {
                    gulVar.i(d2);
                }
                if (jvuVar.a().length() > 2) {
                    jvuVar = jvu.c(jvuVar, String.valueOf(jvuVar.a().charAt(0)));
                }
                ffjiVar.invoke(jvuVar);
            }
        } catch (NumberFormatException | IllegalArgumentException unused) {
        }
    }

    public static final boolean w(gul gulVar) {
        return gulVar.d() >= 12;
    }

    public static final void x(ftb ftbVar, hvi hviVar, grs grsVar, boolean z, hfd hfdVar, int i2) {
        int i3;
        boolean z2;
        hvi c2;
        int i4 = i2 & 6;
        hfd b2 = hfdVar.b(1432307537);
        if (i4 == 0) {
            i3 = (true != b2.F(ftbVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != b2.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != b2.D(grsVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            z2 = z;
            i3 |= true != b2.E(z2) ? 1024 : 2048;
        } else {
            z2 = z;
        }
        if ((i3 & 1171) == 1170 && b2.I()) {
            b2.s();
        } else {
            b2.t();
            if ((i2 & 1) != 0 && !b2.G()) {
                b2.s();
            }
            b2.l();
            c2 = jjs.c(hviVar, false, gst.a);
            hvi j2 = eba.j(c2, 0.0f, 0.0f, 0.0f, 24.0f, 7);
            int i5 = huo.a;
            ipn a2 = ebm.a(dxu.a, hum.n, b2, 48);
            int a3 = hey.a(b2);
            hfm hfmVar = (hfm) b2;
            hqb ai = hfmVar.ai();
            hvi b3 = huz.b(b2, j2);
            int i6 = ist.a;
            ffix ffixVar = iss.a;
            b2.x();
            if (hfmVar.z) {
                b2.j(ffixVar);
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
            m(ftbVar, grsVar, b2, (i3 & 14) | ((i3 >> 3) & 112));
            ebv.a(ebs.o(hvi.e, l), b2);
            j(new fxx(), ftbVar, grsVar, z2, b2, ((i3 << 3) & 112) | (i3 & 896) | (i3 & 7168));
            b2.n();
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new gsu(ftbVar, hviVar, grsVar, z, i2);
        }
    }

    public static final void y(gul gulVar, hvi hviVar, grs grsVar, hfd hfdVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        hfd b2 = hfdVar.b(-760850373);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? b2.D(gulVar) : b2.F(gulVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != b2.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != b2.D(grsVar) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && b2.I()) {
            b2.s();
        } else {
            b2.t();
            if ((i2 & 1) != 0 && !b2.G()) {
                b2.s();
            }
            b2.l();
            p(hviVar, grsVar, gulVar, b2, ((i3 << 6) & 896) | ((i3 >> 3) & 126));
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new gsz(gulVar, hviVar, grsVar, i2);
        }
    }

    public static final void z(gul gulVar, hvi hviVar, grs grsVar, int i2, hfd hfdVar, int i3) {
        int i4;
        hvi hviVar2;
        grs grsVar2;
        hfd b2 = hfdVar.b(-619286452);
        if ((i3 & 6) == 0) {
            i4 = (true != ((i3 & 8) == 0 ? b2.D(gulVar) : b2.F(gulVar)) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != b2.D(hviVar) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != b2.D(grsVar) ? 128 : 256;
        }
        if ((i3 & 3072) == 0) {
            i4 |= true != b2.B(i2) ? 1024 : 2048;
        }
        if ((i4 & 1171) == 1170 && b2.I()) {
            b2.s();
            hviVar2 = hviVar;
            grsVar2 = grsVar;
        } else {
            b2.t();
            if ((i3 & 1) != 0 && !b2.G()) {
                b2.s();
            }
            b2.l();
            Object systemService = ((Context) b2.e(AndroidCompositionLocals_androidKt.b)).getSystemService("accessibility");
            systemService.getClass();
            AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
            boolean E = b2.E(true) | b2.E(true) | b2.E(true);
            hfm hfmVar = (hfm) b2;
            Object R = hfmVar.R();
            if (E || R == hfc.a) {
                R = new hbp();
                hfmVar.ad(R);
            }
            hbp hbpVar = (hbp) R;
            lkr lkrVar = (lkr) b2.e(lnr.a);
            boolean D = b2.D(hbpVar) | b2.F(accessibilityManager);
            Object R2 = hfmVar.R();
            if (D || R2 == hfc.a) {
                R2 = new gxw(hbpVar, accessibilityManager);
                hfmVar.ad(R2);
            }
            ffji ffjiVar = (ffji) R2;
            boolean D2 = b2.D(hbpVar) | b2.F(accessibilityManager);
            Object R3 = hfmVar.R();
            if (D2 || R3 == hfc.a) {
                R3 = new gxx(hbpVar, accessibilityManager);
                hfmVar.ad(R3);
            }
            boolean z = false;
            gxy.a(lkrVar, ffjiVar, (ffix) R3, b2, 0);
            if ((i4 & 14) == 4 || ((i4 & 8) != 0 && b2.D(gulVar))) {
                z = true;
            }
            Object R4 = hfmVar.R();
            if (z || R4 == hfc.a) {
                R4 = new ftb(gulVar);
                hfmVar.ad(R4);
            }
            int i5 = i4 & 1008;
            ftb ftbVar = (ftb) R4;
            if (i2 == 1) {
                b2.v(-337055870);
                hviVar2 = hviVar;
                grsVar2 = grsVar;
                A(ftbVar, hviVar2, grsVar2, !E(hbpVar), b2, i5);
                hfmVar.Z();
            } else {
                hviVar2 = hviVar;
                grsVar2 = grsVar;
                b2.v(-336857408);
                x(ftbVar, hviVar2, grsVar2, !E(hbpVar), b2, i5);
                hfmVar.Z();
            }
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new gtm(gulVar, hviVar2, grsVar2, i2, i3);
        }
    }
}
