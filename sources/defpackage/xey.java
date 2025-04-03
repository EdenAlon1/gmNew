package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xey {
    public static final void a(final xfa xfaVar, final long j, final float f, final boolean z, hfd hfdVar, final int i) {
        int i2;
        long f2;
        hvi a;
        int i3;
        hvi a2;
        boolean z2;
        hvi a3;
        int i4 = i & 6;
        hfd b = hfdVar.b(-889326263);
        if (i4 == 0) {
            i2 = (true != b.D(xfaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.C(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.A(f) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.E(z) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            f2 = iby.f(ibw.d(j), ibw.c(j), ibw.b(j), f, ibw.f(j));
            Configuration configuration = (Configuration) b.e(AndroidCompositionLocals_androidKt.a);
            dmpj dmpjVar = xfaVar.a;
            b.v(-1230729637);
            a = dee.a(hvi.e, f2, idb.a);
            if (xfaVar.a.g.g) {
                hve hveVar = hvi.e;
                b.v(1252611096);
                hfm hfmVar = (hfm) b;
                Object R = hfmVar.R();
                i3 = i2;
                if (R == hfc.a) {
                    R = new ffji() { // from class: xer
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj) {
                            MotionEvent motionEvent = (MotionEvent) obj;
                            motionEvent.getClass();
                            chrt.a.a(motionEvent);
                            return ffcu.a;
                        }
                    };
                    hfmVar.ad(R);
                }
                hfmVar.Z();
                a = a.a(iln.a(hveVar, (ffji) R));
            } else {
                i3 = i2;
            }
            hfm hfmVar2 = (hfm) b;
            hfmVar2.Z();
            long j2 = f2;
            dmnj.a(dmpjVar, a, null, b, 0, 4);
            dsho dshoVar = xfaVar.b;
            hve hveVar2 = hvi.e;
            if (true == ersy.a("bugle.prevent_input_close_on_scroll", "bugle")) {
                j2 = j;
            }
            a2 = dee.a(hveVar2, j2, idb.a);
            if (dooy.g(b) && !(xfaVar.b.a instanceof dtbi)) {
                a3 = dee.a(hvi.e, gft.a(b).J, idb.a);
                a2 = a2.a(a3);
            }
            if (z) {
                z2 = true;
                a2 = a2.a(ebs.u(hvi.e, 0.0f, configuration.screenHeightDp * (configuration.orientation == 2 ? 0.5f : 0.75f), 1));
            } else {
                z2 = true;
            }
            dshl.b(dshoVar, a2, false, b, 0);
            Context context = (Context) b.e(AndroidCompositionLocals_androidKt.b);
            ffcu ffcuVar = ffcu.a;
            b.v(-1230691373);
            if ((i3 & 14) != 4) {
                z2 = false;
            }
            boolean F = b.F(context) | z2;
            Object R2 = hfmVar2.R();
            if (F || R2 == hfc.a) {
                R2 = new xex(xfaVar, context, null);
                hfmVar2.ad(R2);
            }
            hfmVar2.Z();
            hgs.g(ffcuVar, (ffjm) R2, b);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: xes
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    xfa xfaVar2 = xfa.this;
                    long j3 = j;
                    float f3 = f;
                    xey.a(xfaVar2, j3, f3, z, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dlut dlutVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        int i3 = i & 6;
        hfd b = hfdVar.b(-2126555103);
        if (i3 == 0) {
            i2 = (true != b.D(dlutVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            d = ebs.d(hvi.e, 1.0f);
            hvi a = jfw.a(ecs.b(eba.e(dee.a(d, gft.a(b).I, eqm.d(4.0f, 4.0f, 0.0f, 0.0f, 12)), 30.0f, 20.0f)), ((dluu) dlutVar).a);
            int i4 = huo.a;
            ipn a2 = dyc.a(hum.e, false);
            int a3 = hey.a(b);
            hfm hfmVar = (hfm) b;
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
            dlur.e(dlutVar, jfw.a(hvi.e, "Compose:Disabled"), 0L, null, null, 0L, null, false, null, b, (i2 & 14) | 48, 508);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: xeq
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    xey.b(dlut.this, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final xen xenVar, final hvi hviVar, final boolean z, final boolean z2, hfd hfdVar, final int i) {
        int i2;
        hvi hviVar2;
        hvi d;
        ffhd ffhdVar;
        hfm hfmVar;
        boolean z3;
        hvi d2;
        cyq cyqVar;
        long j;
        hfd b = hfdVar.b(-1903709791);
        if ((i & 6) == 0) {
            i2 = (true != b.D(xenVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            hviVar2 = hviVar;
            i2 |= true != b.D(hviVar2) ? 16 : 32;
        } else {
            hviVar2 = hviVar;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.E(z2) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            d = ebs.d(hviVar2, 1.0f);
            b.v(-1982276431);
            int i3 = i2 & 14;
            hfm hfmVar2 = (hfm) b;
            Object R = hfmVar2.R();
            if (i3 == 4 || R == hfc.a) {
                R = new ffji() { // from class: xeo
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ioc iocVar = (ioc) obj;
                        iocVar.getClass();
                        long g = iocVar.g() & 4294967295L;
                        zqv zqvVar = xen.this.d;
                        if (!zqvVar.c.contains("bottom_content_insets")) {
                            zqvVar.b.put("bottom_content_insets", Integer.valueOf(ffmk.f((int) g, 0)));
                            fgcm fgcmVar = zqvVar.e;
                            Collection values = zqvVar.b.values();
                            values.getClass();
                            fgcmVar.f(Integer.valueOf(ffdx.E(values)));
                        }
                        return ffcu.a;
                    }
                };
                hfmVar2.ad(R);
            }
            hfmVar2.Z();
            hvi a = ipx.a(d, (ffji) R);
            dxq dxqVar = dxu.c;
            int i4 = huo.a;
            ipn a2 = dyo.a(dxqVar, hum.j, b, 0);
            int a3 = hey.a(b);
            hqb ai = hfmVar2.ai();
            hvi b2 = huz.b(b, a);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar2.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a2, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar2.z || !ffkj.e(hfmVar2.R(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfmVar2.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            dys dysVar = dys.a;
            if (ersy.a("bugle.allow_alert_card_in_bottom_content", "bugle")) {
                b.v(1028578360);
                fgdj fgdjVar = xenVar.c;
                b.v(-1075176037);
                boolean D = b.D(fgdjVar);
                Object R2 = hfmVar2.R();
                if (D || R2 == hfc.a) {
                    fgbv fgbvVar = new fgbv(new ffcf(null, false), xenVar.c, new xet(null));
                    hfmVar2.ad(fgbvVar);
                    R2 = fgbvVar;
                }
                hfmVar2.Z();
                ffcf ffcfVar = (ffcf) hkt.b((ffxx) R2, new ffcf(null, false), null, b, 2).a();
                dnmx dnmxVar = (dnmx) ffcfVar.a;
                boolean booleanValue = ((Boolean) ffcfVar.b).booleanValue();
                hvi a4 = dys.a(hvi.e, hum.k);
                cfup cfupVar = cubs.a;
                Boolean bool = (Boolean) ((cfup) cubs.O.get()).e();
                bool.getClass();
                if (bool.booleanValue()) {
                    a4 = a4.a(eba.i(hvi.e, 8.0f, 0.0f, 2));
                }
                hfmVar = hfmVar2;
                ffhdVar = null;
                z3 = false;
                cru.f(dysVar, booleanValue, a4, null, null, null, hpx.d(-864435574, new xeu(dnmxVar), b), b, 1572870, 28);
                hfmVar.Z();
            } else {
                ffhdVar = null;
                hfmVar = hfmVar2;
                z3 = false;
                b.v(1030390465);
                fgdj fgdjVar2 = xenVar.b;
                b.v(-1075117521);
                boolean D2 = b.D(fgdjVar2);
                Object R3 = hfmVar.R();
                if (D2 || R3 == hfc.a) {
                    fgbv fgbvVar2 = new fgbv(new ffcf(null, false), xenVar.b, new xev(null));
                    hfmVar.ad(fgbvVar2);
                    R3 = fgbvVar2;
                }
                hfmVar.Z();
                ffcf ffcfVar2 = (ffcf) hkt.b((ffxx) R3, new ffcf(null, false), null, b, 2).a();
                cru.f(dysVar, ((Boolean) ffcfVar2.b).booleanValue(), dys.a(hvi.e, hum.k), null, null, null, hpx.d(-2072199405, new xew((doqo) ffcfVar2.a), b), b, 1572870, 28);
                hfmVar.Z();
            }
            d2 = ebs.d(hvi.e, 1.0f);
            boolean z4 = z3;
            ipn a5 = dyo.a(dxu.c, hum.j, b, z4 ? 1 : 0);
            int a6 = hey.a(b);
            hqb ai2 = hfmVar.ai();
            hvi b3 = huz.b(b, d2);
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
            } else {
                b.z();
            }
            hlc.b(b, a5, iss.e);
            hlc.b(b, ai2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a6))) {
                Integer valueOf2 = Integer.valueOf(a6);
                hfmVar.ad(valueOf2);
                b.h(valueOf2, ffjmVar2);
            }
            hlc.b(b, b3, iss.c);
            hkx a7 = hkf.a(xenVar.a, b);
            xsb xsbVar = ((xfa) a7.a()).e;
            if (xsbVar != null) {
                b.v(1010921957);
                b(xsbVar.a, b, z4 ? 1 : 0);
                hfmVar.Z();
            } else {
                b.v(1011040222);
                boolean booleanValue2 = ((Boolean) hkt.b(((xfa) a7.a()).d, Boolean.valueOf(z4), ffhdVar, b, 2).a()).booleanValue();
                float f = true != booleanValue2 ? 0.96f : 0.25f;
                if (booleanValue2) {
                    b.v(1011373131);
                    cyqVar = dooy.c(b).j;
                    hfmVar.Z();
                } else {
                    b.v(1011463372);
                    cyqVar = dooy.c(b).i;
                    hfmVar.Z();
                }
                hkx c = cxo.c(f, cyqVar, null, b, 3072, 20);
                xfa xfaVar = (xfa) a7.a();
                b.v(400030459);
                if (dooy.g(b)) {
                    b.v(1602018500);
                    j = dooy.a(b).d.a;
                    hfmVar.Z();
                } else if (z) {
                    b.v(1602020299);
                    j = dooy.a(b).E;
                    hfmVar.Z();
                } else {
                    b.v(1602022081);
                    j = gft.a(b).p;
                    hfmVar.Z();
                }
                hfmVar.Z();
                a(xfaVar, j, ((Number) c.a()).floatValue(), z2, b, i2 & 7168);
                hfmVar.Z();
            }
            b.n();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: xep
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    xen xenVar2 = xen.this;
                    hvi hviVar3 = hviVar;
                    boolean z5 = z;
                    xey.c(xenVar2, hviVar3, z5, z2, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
