package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import androidx.camera.view.PreviewView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpkz {
    public static final dbu a(Duration duration, cym cymVar) {
        return cxu.c((int) duration.toMillis(), 0, cymVar, 2);
    }

    public static final void b(final Integer num, hfd hfdVar, final int i, final int i2) {
        int i3;
        hfd b = hfdVar.b(319757845);
        if (i2 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != b.D(num) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && b.I()) {
            b.s();
        } else {
            if (1 == i2) {
                num = null;
            }
            final Context context = (Context) b.e(AndroidCompositionLocals_androidKt.b);
            b.v(-1689921686);
            boolean F = b.F(context) | ((i3 & 14) == 4);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (F || R == hfc.a) {
                R = new ffji() { // from class: dpii
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ((hgp) obj).getClass();
                        Activity b2 = dskj.b(context);
                        int requestedOrientation = b2.getRequestedOrientation();
                        Integer num2 = num;
                        if (num2 != null) {
                            num2.intValue();
                            b2.setRequestedOrientation(1);
                        } else {
                            b2.setRequestedOrientation(14);
                        }
                        return new dpje(b2, requestedOrientation);
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hgs.c(num, (ffji) R, b);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dpij
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dpkz.b(num, (hfd) obj, hip.a(i4 | 1), i2);
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final dplw dplwVar, hfd hfdVar, final int i) {
        int i2;
        long f;
        boolean z;
        hho hhoVar;
        cxj cxjVar;
        long j;
        hfm hfmVar;
        final rva rvaVar;
        cxj cxjVar2;
        final boolean z2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-250248083);
        if (i3 == 0) {
            i2 = (true != b.D(dplwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            int i4 = i2 & 14;
            e(dplwVar, b, i4);
            rva a = rvd.a(b);
            f = iby.f(ibw.d(r5), ibw.c(r5), ibw.b(r5), 0.96f, ibw.f(dfq.a(b) ? ibw.a : ibw.d));
            boolean z3 = !dfq.a(b);
            b.v(-1863973211);
            hfm hfmVar2 = (hfm) b;
            Object R = hfmVar2.R();
            if (i4 == 4 || R == hfc.a) {
                hic hicVar = new hic(false, hla.a);
                hfmVar2.ad(hicVar);
                R = hicVar;
            }
            hho hhoVar2 = (hho) R;
            hfmVar2.Z();
            b.v(-1346940673);
            Configuration configuration = (Configuration) b.e(AndroidCompositionLocals_androidKt.a);
            float min = Math.min(configuration.screenWidthDp, configuration.screenHeightDp / 2);
            hfmVar2.Z();
            b.v(-1863969930);
            Object R2 = hfmVar2.R();
            if (R2 == hfc.a) {
                R2 = cxk.a(0.0f);
                hfmVar2.ad(R2);
            }
            cxj cxjVar3 = (cxj) R2;
            hfmVar2.Z();
            Object R3 = hfmVar2.R();
            if (R3 == hfc.a) {
                R3 = hgs.a(ffhe.a, b);
                hfmVar2.ad(R3);
            }
            final ffsk ffskVar = (ffsk) R3;
            if (Build.VERSION.SDK_INT >= 35) {
                b.v(-1948321333);
                Duration duration = dpgt.a;
                kev kevVar = dpgt.d;
                b.v(-1863961967);
                boolean F = (i4 == 4) | b.F(ffskVar);
                Object R4 = hfmVar2.R();
                if (F || R4 == hfc.a) {
                    R4 = new ffix() { // from class: dpig
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            ffqy.d(ffsk.this, null, null, new dpjf(dplwVar, null), 3);
                            return ffcu.a;
                        }
                    };
                    hfmVar2.ad(R4);
                }
                hfmVar2.Z();
                kdy.b(kevVar, (ffix) R4, new kex(512, true, false), hpx.d(1300872678, new dpji(cxjVar3, f, dplwVar, min, hhoVar2), b), b, 3456, 0);
                hfmVar2.Z();
                hfmVar = hfmVar2;
                j = f;
                z = z3;
                hhoVar = hhoVar2;
                cxjVar = cxjVar3;
            } else {
                z = z3;
                b.v(-1947782739);
                int i5 = huo.a;
                huo huoVar = hum.e;
                b.v(-1863945039);
                boolean F2 = b.F(ffskVar) | (i4 == 4);
                Object R5 = hfmVar2.R();
                if (F2 || R5 == hfc.a) {
                    R5 = new ffix() { // from class: dpiq
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            ffqy.d(ffsk.this, null, null, new dpjj(dplwVar, null), 3);
                            return ffcu.a;
                        }
                    };
                    hfmVar2.ad(R5);
                }
                hfmVar2.Z();
                hhoVar = hhoVar2;
                cxjVar = cxjVar3;
                j = f;
                hfmVar = hfmVar2;
                kdy.d(huoVar, (ffix) R5, new kex(true, true, 8), hpx.d(814122702, new dpjm(cxjVar, j, dplwVar, min, hhoVar), b), b, 27654);
                hfmVar.Z();
            }
            Object d = cxjVar.d();
            b.v(-1863931869);
            boolean D = b.D(a) | b.C(j) | b.F(cxjVar) | b.E(z);
            Object R6 = hfmVar.R();
            if (D || R6 == hfc.a) {
                cxj cxjVar4 = cxjVar;
                boolean z4 = z;
                rvaVar = a;
                dpjn dpjnVar = new dpjn(rvaVar, j, cxjVar4, z4, null);
                cxjVar2 = cxjVar4;
                z2 = z4;
                hfmVar.ad(dpjnVar);
                R6 = dpjnVar;
            } else {
                cxjVar2 = cxjVar;
                z2 = z;
                rvaVar = a;
            }
            hfmVar.Z();
            hgs.g(d, (ffjm) R6, b);
            Boolean valueOf = Boolean.valueOf(f(hhoVar));
            b.v(-1863925523);
            boolean F3 = b.F(cxjVar2) | b.D(hhoVar);
            Object R7 = hfmVar.R();
            if (F3 || R7 == hfc.a) {
                R7 = new dpjo(cxjVar2, hhoVar, null);
                hfmVar.ad(R7);
            }
            hfmVar.Z();
            hgs.g(valueOf, (ffjm) R7, b);
            ffcu ffcuVar = ffcu.a;
            b.v(-1863919020);
            boolean D2 = b.D(rvaVar) | b.E(z2);
            Object R8 = hfmVar.R();
            if (D2 || R8 == hfc.a) {
                R8 = new ffji() { // from class: dpis
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ((hgp) obj).getClass();
                        return new dpjp(rva.this, z2);
                    }
                };
                hfmVar.ad(R8);
            }
            hfmVar.Z();
            hgs.c(ffcuVar, (ffji) R8, b);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dpit
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    dpkz.c(dplw.this, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final cxj cxjVar, final Duration duration, final cxj cxjVar2, final cxj cxjVar3, final cxj cxjVar4, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(452075919);
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? b.D(cxjVar) : b.F(cxjVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(duration) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? b.D(cxjVar2) : b.F(cxjVar2)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? b.D(cxjVar3) : b.F(cxjVar3)) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != ((i & 32768) == 0 ? b.D(cxjVar4) : b.F(cxjVar4)) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && b.I()) {
            b.s();
        } else {
            ffcu ffcuVar = ffcu.a;
            b.v(1616358389);
            boolean F = ((i2 & 14) == 4 || ((i2 & 8) != 0 && b.F(cxjVar))) | b.F(duration) | ((i2 & 7168) == 2048 || ((i2 & 4096) != 0 && b.F(cxjVar3))) | ((i2 & 896) == 256 || ((i2 & 512) != 0 && b.F(cxjVar2)));
            if ((57344 & i2) != 16384 && ((i2 & 32768) == 0 || !b.F(cxjVar4))) {
                z = false;
            }
            boolean z2 = F | z;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (z2 || R == hfc.a) {
                dpkx dpkxVar = new dpkx(cxjVar, duration, cxjVar3, cxjVar2, cxjVar4, null);
                hfmVar.ad(dpkxVar);
                R = dpkxVar;
            }
            hfmVar.Z();
            hgs.g(ffcuVar, (ffjm) R, b);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dpil
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cxj cxjVar5 = cxj.this;
                    Duration duration2 = duration;
                    cxj cxjVar6 = cxjVar2;
                    cxj cxjVar7 = cxjVar3;
                    dpkz.d(cxjVar5, duration2, cxjVar6, cxjVar7, cxjVar4, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final dplw dplwVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-2030580212);
        if (i3 == 0) {
            i2 = (true != b.D(dplwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = hgs.a(ffhe.a, b);
                hfmVar.ad(R);
            }
            final ffsk ffskVar = (ffsk) R;
            b.v(-1565857394);
            Configuration configuration = (Configuration) b.e(AndroidCompositionLocals_androidKt.a);
            boolean z = configuration.screenWidthDp < 600 || configuration.screenHeightDp < 480;
            hfmVar.Z();
            if (z) {
                b.v(-1724201041);
                b(1, b, 6, 0);
                hfmVar.Z();
            } else {
                b.v(-1724123913);
                b(null, b, 0, 1);
                hfmVar.Z();
            }
            lki lkiVar = lki.ON_PAUSE;
            b.v(-609803511);
            boolean F = b.F(ffskVar) | ((i2 & 14) == 4);
            Object R2 = hfmVar.R();
            if (F || R2 == hfc.a) {
                R2 = new ffix() { // from class: dpin
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ffqy.d(ffsk.this, null, null, new dpky(dplwVar, null), 3);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            lnp.a(lkiVar, null, (ffix) R2, b, 6);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dpio
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dpkz.e(dplw.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final boolean f(hho hhoVar) {
        return ((Boolean) hhoVar.a()).booleanValue();
    }

    public static final void g(final dplw dplwVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hvi c;
        hvi a;
        hfm hfmVar;
        cxj cxjVar;
        final ixm ixmVar;
        ffgu ffguVar;
        hvi c2;
        long f;
        hvi a2;
        hvi c3;
        hvi c4;
        int i3 = i & 6;
        hfd b = hfdVar.b(-2025522367);
        if (i3 == 0) {
            i2 = (true != b.D(dplwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            b.v(-121774943);
            hfm hfmVar2 = (hfm) b;
            Object R = hfmVar2.R();
            if (R == hfc.a) {
                R = cxk.a(0.0f);
                hfmVar2.ad(R);
            }
            final cxj cxjVar2 = (cxj) R;
            hfmVar2.Z();
            lkr lkrVar = (lkr) b.e(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            b.v(-121771675);
            Object R2 = hfmVar2.R();
            if (R2 == hfc.a) {
                R2 = new ixm();
                hfmVar2.ad(R2);
            }
            final ixm ixmVar2 = (ixm) R2;
            hfmVar2.Z();
            b.v(-121768967);
            boolean F = b.F(cxjVar2);
            Object R3 = hfmVar2.R();
            if (F || R3 == hfc.a) {
                R3 = new ffji() { // from class: dpiu
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        idd iddVar = (idd) obj;
                        iddVar.getClass();
                        cxj cxjVar3 = cxj.this;
                        iddVar.x(((Number) cxjVar3.d()).floatValue());
                        iddVar.y(((Number) cxjVar3.d()).floatValue());
                        return ffcu.a;
                    }
                };
                hfmVar2.ad(R3);
            }
            hfmVar2.Z();
            hvi a3 = icf.a(hviVar, (ffji) R3);
            int i4 = huo.a;
            ipn a4 = dyc.a(hum.a, false);
            int a5 = hey.a(b);
            hqb ai = hfmVar2.ai();
            hvi b2 = huz.b(b, a3);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar2.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a4, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar2.z || !ffkj.e(hfmVar2.R(), Integer.valueOf(a5))) {
                Integer valueOf = Integer.valueOf(a5);
                hfmVar2.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            dyi dyiVar = dyi.a;
            ffjn d = dplwVar.d();
            b.v(-1419428844);
            boolean F2 = ((i2 & 14) == 4) | b.F(lkrVar) | b.F(ixmVar2);
            Object R4 = hfmVar2.R();
            if (F2 || R4 == hfc.a) {
                R4 = new dpja(dplwVar, lkrVar, ixmVar2, null);
                hfmVar2.ad(R4);
            }
            hfmVar2.Z();
            hgs.g(d, (ffjm) R4, b);
            b.v(-1419426264);
            Object R5 = hfmVar2.R();
            if (R5 == hfc.a) {
                R5 = new ffji() { // from class: dpiv
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        Context context = (Context) obj;
                        context.getClass();
                        return new PreviewView(context);
                    }
                };
                hfmVar2.ad(R5);
            }
            ffji ffjiVar = (ffji) R5;
            hfmVar2.Z();
            c = ebs.c(hxo.a(dyiVar.a(hvi.e, hum.e), eqm.a), 1.0f);
            a = dlsj.a(dek.c(c, 0.0f, iby.d(4287533455L), eqm.a), jii.a(R.string.popup_camera_preview_content_description, b), true);
            b.v(-1419415875);
            boolean F3 = b.F(ixmVar2);
            Object R6 = hfmVar2.R();
            if (F3 || R6 == hfc.a) {
                R6 = new ffji() { // from class: dpiw
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        PreviewView previewView = (PreviewView) obj;
                        previewView.getClass();
                        previewView.d(2);
                        ixm.this.a = previewView;
                        return ffcu.a;
                    }
                };
                hfmVar2.ad(R6);
            }
            hfmVar2.Z();
            kcg.b(ffjiVar, a, (ffji) R6, b, 6, 0);
            b.v(-1419405172);
            if (!(dplwVar instanceof dplq) || ((dplq) dplwVar).c == null) {
                hfmVar = hfmVar2;
                cxjVar = cxjVar2;
                ixmVar = ixmVar2;
                ffguVar = null;
            } else {
                c2 = ebs.c(hxo.a(dyiVar.a(hvi.e, hum.e), eqm.a), 1.0f);
                f = iby.f(ibw.d(r4), ibw.c(r4), ibw.b(r4), 0.3f, ibw.f(ibw.a));
                a2 = dee.a(c2, f, idb.a);
                dyc.b(hvr.a(a2, 1.0f), b, 0);
                final String a6 = jii.a(R.string.popup_camera_countdown_text_content_description, b);
                qgp d2 = qhj.d(new qgu(R.raw.countdown_lottie), b);
                c3 = ebs.c(hvi.e, 1.0f);
                hvi a7 = hvr.a(hxo.a(dyiVar.a(c3, hum.e), eqm.a), 2.0f);
                b.v(-1419384568);
                boolean D = b.D(a6);
                Object R7 = hfmVar2.R();
                if (D || R7 == hfc.a) {
                    R7 = new ffji() { // from class: dpix
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj) {
                            jkv jkvVar = (jkv) obj;
                            jkvVar.getClass();
                            jkr.k(jkvVar, a6);
                            return ffcu.a;
                        }
                    };
                    hfmVar2.ad(R7);
                }
                hfmVar2.Z();
                c4 = jjs.c(a7, false, (ffji) R7);
                qci a8 = d2.a();
                hfmVar = hfmVar2;
                cxjVar = cxjVar2;
                ixmVar = ixmVar2;
                ffguVar = null;
                qgf.b(a8, c4, false, false, null, 1.05f, 0, null, null, null, null, false, b, 196608, 0, 262108);
                b = b;
            }
            hfmVar.Z();
            ffcu ffcuVar = ffcu.a;
            b.v(-1419377230);
            boolean F4 = b.F(ixmVar);
            Object R8 = hfmVar.R();
            if (F4 || R8 == hfc.a) {
                R8 = new ffji() { // from class: dpiy
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ((hgp) obj).getClass();
                        return new dpjc(ixm.this);
                    }
                };
                hfmVar.ad(R8);
            }
            hfmVar.Z();
            hgs.c(ffcuVar, (ffji) R8, b);
            b.n();
            ffcu ffcuVar2 = ffcu.a;
            b.v(-121710940);
            boolean F5 = b.F(cxjVar);
            Object R9 = hfmVar.R();
            if (F5 || R9 == hfc.a) {
                R9 = new dpjb(cxjVar, ffguVar);
                hfmVar.ad(R9);
            }
            hfmVar.Z();
            hgs.g(ffcuVar2, (ffjm) R9, b);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dpiz
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dplw dplwVar2 = dplw.this;
                    int i6 = i;
                    dpkz.g(dplwVar2, hviVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void h(final dplw dplwVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1836417432);
        if (i3 == 0) {
            i2 = (true != b.D(dplwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            int i4 = i2 & 112;
            if (dplwVar instanceof dplk) {
                b.v(-1780583526);
                i((dplk) dplwVar, hviVar, b, i4);
                ((hfm) b).Z();
            } else {
                b.v(-1780520813);
                g(dplwVar, hviVar, b, i2 & 126);
                ((hfm) b).Z();
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dpim
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dplw dplwVar2 = dplw.this;
                    int i5 = i;
                    dpkz.h(dplwVar2, hviVar, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void i(final dplk dplkVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hvi c;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1893418027);
        if (i3 == 0) {
            i2 = (true != b.D(dplkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            b.v(1354102213);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = cxk.a(1.0f);
                hfmVar.ad(R);
            }
            cxj cxjVar = (cxj) R;
            hfmVar.Z();
            float floatValue = ((Number) cxjVar.d()).floatValue();
            hvi a = hya.a(hviVar, floatValue, floatValue);
            int i4 = huo.a;
            ipn a2 = dyc.a(hum.a, false);
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
            Uri parse = Uri.parse(dplkVar.b.b);
            String a4 = jii.a(R.string.popup_camera_gif_viewer_content_description, b);
            c = ebs.c(hxo.a(hvi.e, eqm.a), 1.0f);
            dnac.a(parse, a4, dek.c(c, 0.0f, iby.d(4287533455L), eqm.a), null, null, null, null, null, 0.0f, null, null, null, null, null, null, null, b, 0, 0, 524280);
            hfdVar2 = b;
            hfdVar2.n();
            ffcu ffcuVar = ffcu.a;
            hfdVar2.v(1354115589);
            boolean F = hfdVar2.F(cxjVar);
            Object R2 = hfmVar.R();
            if (F || R2 == hfc.a) {
                R2 = new dpjd(cxjVar, null);
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            hgs.g(ffcuVar, (ffjm) R2, hfdVar2);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dpik
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dplk dplkVar2 = dplk.this;
                    int i6 = i;
                    dpkz.i(dplkVar2, hviVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void j(dplw dplwVar, float f, ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        hvi c;
        hvi c2;
        final dplw dplwVar2;
        final float f2;
        final ffix ffixVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1537689622);
        if (i3 == 0) {
            i2 = (true != b.D(dplwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.A(f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffixVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
            dplwVar2 = dplwVar;
            f2 = f;
            ffixVar2 = ffixVar;
        } else {
            c = ebs.c(hvi.e, 1.0f);
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
                R6 = new dpkm(hhoVar2, kgqVar, kgjVar, hhoVar);
                hfmVar.ad(R6);
            }
            ipn ipnVar = (ipn) R6;
            Object R7 = hfmVar.R();
            if (R7 == hfc.a) {
                R7 = new dpkn(hhoVar, kgjVar);
                hfmVar.ad(R7);
            }
            boolean F2 = b.F(kgqVar);
            Object R8 = hfmVar.R();
            if (F2 || R8 == hfc.a) {
                R8 = new dpko(kgqVar);
                hfmVar.ad(R8);
            }
            c2 = jjs.c(c, false, (ffji) R8);
            dplwVar2 = dplwVar;
            f2 = f;
            ffixVar2 = ffixVar;
            iol.b(c2, hpx.d(1200550679, new dpkp(hhoVar2, kgcVar, dplwVar2, f2, ffixVar2), b), ipnVar, b, 48);
            hfmVar.Z();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dpih
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dplw dplwVar3 = dplw.this;
                    float f3 = f2;
                    int i4 = i;
                    dpkz.j(dplwVar3, f3, ffixVar2, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void k(final String str, final boolean z, hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        final hvi hviVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(2049818465);
        if (i3 == 0) {
            i2 = (true != b.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(hviVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
            hviVar2 = hviVar;
        } else {
            b.v(725331762);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new czq(false);
                hfmVar.ad(R);
            }
            czq czqVar = (czq) R;
            hfmVar.Z();
            czqVar.d(Boolean.valueOf(z));
            b.v(725335752);
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                R2 = new ffji() { // from class: dpip
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(((Integer) obj).intValue() / 2);
                    }
                };
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            hviVar2 = hviVar;
            cru.a(czqVar, hviVar2, ctt.r((ffji) R2).a(ctt.l(null, 3)), ctt.m(null, 3), null, hpx.d(931258937, new dpkq(str), b), b, ((i2 >> 3) & 112) | 200064, 16);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dpir
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    boolean z2 = z;
                    int i4 = i;
                    dpkz.k(str2, z2, hviVar2, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
