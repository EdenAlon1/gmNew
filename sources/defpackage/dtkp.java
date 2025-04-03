package defpackage;

import com.google.android.apps.messaging.R;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtkp {
    public static final void a(final boolean z, final ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(893910622);
        if (i3 == 0) {
            i2 = (true != b.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffixVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            int i4 = z ? R.drawable.gs_mic_noise_cancel_high_vd_theme_24 : R.drawable.gs_mic_noise_cancel_off_vd_theme_24;
            int i5 = z ? R.string.noise_cancellation_on : R.string.noise_cancellation_off;
            eqd eqdVar = gft.c(b).b;
            eqe a = eqg.a(50);
            dwft.a(z, ffixVar, hpx.d(1210934731, new dtjv(i5), b), null, false, hpx.d(1973667240, new dtjw(i4), b), new eql(a, a, a, a), dwgy.a(gft.a(b).n, gft.a(b).o, gft.a(b).o, b, 2431), null, null, b, (i2 & 14) | 196992 | (i2 & 112), 0, 3672);
            b = b;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dtjr
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    boolean z2 = z;
                    int i6 = i;
                    dtkp.a(z2, ffixVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dtlg dtlgVar, final dmae dmaeVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        hvi c;
        int i3 = i & 6;
        hfd b = hfdVar.b(2074869296);
        if (i3 == 0) {
            i2 = (true != b.D(dtlgVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dmaeVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            d = ebs.d(hvi.e, 1.0f);
            b.v(-1003410150);
            b.v(-2013492259);
            hfm hfmVar = (hfm) b;
            hfmVar.Z();
            jzn jznVar = (jzn) b.e(jdr.e);
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
            boolean F = b.F(kgqVar) | b.B(257);
            Object R6 = hfmVar.R();
            if (F || R6 == hfc.a) {
                R6 = new dtjy(hhoVar2, kgqVar, kgjVar, hhoVar);
                hfmVar.ad(R6);
            }
            ipn ipnVar = (ipn) R6;
            Object R7 = hfmVar.R();
            if (R7 == hfc.a) {
                R7 = new dtjz(hhoVar, kgjVar);
                hfmVar.ad(R7);
            }
            boolean F2 = b.F(kgqVar);
            Object R8 = hfmVar.R();
            if (F2 || R8 == hfc.a) {
                R8 = new dtka(kgqVar);
                hfmVar.ad(R8);
            }
            c = jjs.c(d, false, (ffji) R8);
            iol.b(c, hpx.d(1200550679, new dtkb(hhoVar2, kgcVar, dtlgVar, dmaeVar), b), ipnVar, b, 48);
            hfmVar.Z();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dtju
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dtlg dtlgVar2 = dtlg.this;
                    int i4 = i;
                    dtkp.b(dtlgVar2, dmaeVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.hfd r26, int r27) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtkp.c(hfd, int):void");
    }

    public static final boolean d(dtil dtilVar, dtlj dtljVar) {
        return ((Boolean) dtilVar.a.c()).booleanValue() && !dtilVar.b.isEmpty() && (dtljVar instanceof dtlg);
    }

    public static final void e(final ffxx ffxxVar, final ffxx ffxxVar2, final dtik dtikVar, final dtil dtilVar, hfd hfdVar, final int i) {
        int i2;
        dlzu dlzuVar;
        hfd b = hfdVar.b(1415415211);
        if ((i & 6) == 0) {
            i2 = (true != b.F(ffxxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffxxVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(dtikVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(dtilVar) ? 1024 : 2048;
        }
        int i3 = i2;
        if ((i3 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            b.t();
            if ((i & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            dtlj dtljVar = (dtlj) hkt.b(ffxxVar, dtlh.a, null, b, 2).a();
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = hgs.a(ffhe.a, b);
                hfmVar.ad(R);
            }
            ffsk ffskVar = (ffsk) R;
            b.v(1834672803);
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                R2 = new hss();
                hfmVar.ad(R2);
            }
            hss hssVar = (hss) R2;
            hfmVar.Z();
            b.v(1834675035);
            boolean F = b.F(ffskVar) | b.F(ffxxVar2);
            Object R3 = hfmVar.R();
            if (F || R3 == hfc.a) {
                R3 = new dtkh(ffskVar, ffxxVar2, hssVar, null);
                hfmVar.ad(R3);
            }
            hfmVar.Z();
            hgs.g(ffskVar, (ffjm) R3, b);
            boolean z = dtljVar instanceof dtlg;
            dtlg dtlgVar = z ? (dtlg) dtljVar : null;
            b.v(1834682050);
            if (dtlgVar == null) {
                dlzuVar = null;
            } else {
                b.v(-195684176);
                dtii dtiiVar = dtlgVar.f;
                boolean F2 = b.F(dtiiVar);
                Object R4 = hfmVar.R();
                if (F2 || R4 == hfc.a) {
                    R4 = new dtkm(dtiiVar);
                    hfmVar.ad(R4);
                }
                hfmVar.Z();
                ffji ffjiVar = (ffji) ((ffmq) R4);
                dtii dtiiVar2 = dtlgVar.f;
                b.v(-195682344);
                boolean F3 = b.F(dtiiVar2);
                Object R5 = hfmVar.R();
                if (F3 || R5 == hfc.a) {
                    R5 = new dtkn(dtiiVar2);
                    hfmVar.ad(R5);
                }
                float f = dtlgVar.e;
                hfmVar.Z();
                dlzuVar = new dlzu(f, ffjiVar, (ffix) ((ffmq) R5));
            }
            hfmVar.Z();
            dmae dmaeVar = new dmae(hssVar, dlzuVar);
            iir iirVar = (iir) b.e(jdr.h);
            dtko dtkoVar = new dtko(dtikVar, iirVar, hssVar, dtljVar);
            hvi a = jfw.a(eba.d(hvi.e, 8.0f), "voice_screen");
            dxn dxnVar = new dxn(8.0f, true, dxr.a);
            int i4 = huo.a;
            ipn a2 = dyo.a(dxnVar, hum.j, b, 6);
            int a3 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, a);
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
            hfz.a(jdr.j.c(kah.a), hpx.d(-625942731, new dtkl(dtilVar, dtljVar, dys.a, dtikVar, iirVar, dtkoVar, dmaeVar), b), b, 56);
            b.v(-195540722);
            if (d(dtilVar, dtljVar)) {
                if (!z) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                dtis.b((dtlg) dtljVar, dtilVar, null, b, (i3 >> 6) & 112);
            }
            hfmVar.Z();
            dtia.g(dtljVar, ((Boolean) hkf.a(dtilVar.a, b).a()).booleanValue(), dtkoVar, b, 0);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dtjt
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ffxx ffxxVar3 = ffxx.this;
                    ffxx ffxxVar4 = ffxxVar2;
                    dtik dtikVar2 = dtikVar;
                    dtkp.e(ffxxVar3, ffxxVar4, dtikVar2, dtilVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final dtca f(dtlj dtljVar, float f, hfd hfdVar) {
        dtca dtcaVar;
        long j;
        dtljVar.getClass();
        hfdVar.v(-485633043);
        if (dtljVar instanceof dtli) {
            hfdVar.v(-1533329061);
            dtbw dtbwVar = new dtbw(f, gft.a(hfdVar).w);
            dtli dtliVar = (dtli) dtljVar;
            Duration duration = dtliVar.a;
            Duration minus = dtliVar.b.minus(duration);
            Duration duration2 = dtiv.a;
            if (minus.compareTo(dtiv.a) <= 0) {
                hfdVar.v(-288344780);
                j = gft.a(hfdVar).w;
                hfdVar.o();
            } else {
                hfdVar.v(-288282160);
                j = gft.a(hfdVar).q;
                hfdVar.o();
            }
            dtcaVar = new dtca(dtbwVar, duration, j, gft.d(hfdVar).f);
            hfdVar.o();
        } else if (dtljVar instanceof dtlg) {
            hfdVar.v(-1533314355);
            dtlg dtlgVar = (dtlg) dtljVar;
            Duration duration3 = !ffkj.e(dtlgVar.d, Duration.ZERO) ? dtlgVar.d : dtlgVar.a;
            hfdVar.v(-1533308252);
            long j2 = dtfe.c(dtlgVar.g) ? ibw.a : gft.a(hfdVar).q;
            hfdVar.o();
            dtcaVar = new dtca(duration3, j2, gft.d(hfdVar).m);
            hfdVar.o();
        } else {
            hfdVar.v(-287699640);
            hfdVar.o();
            dtcaVar = null;
        }
        hfdVar.o();
        return dtcaVar;
    }
}
