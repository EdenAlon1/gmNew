package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import android.view.SurfaceView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.Formatter;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsvs {
    public static final long a(hkx hkxVar) {
        return ((Number) hkxVar.a()).longValue();
    }

    public static final nwb b(Context context) {
        nwb nwbVar = new nwb(context);
        nwbVar.setKeepScreenOn(true);
        lti.g(nwbVar.a);
        nwbVar.a.b(3);
        lti.c(true);
        nwbVar.setClickable(nwbVar.hasOnClickListeners());
        if (!nwbVar.h) {
            return nwbVar;
        }
        nwbVar.h = false;
        if (nwbVar.r()) {
            nwbVar.e.c(nwbVar.g);
        } else {
            nva nvaVar = nwbVar.e;
            if (nvaVar != null) {
                nvaVar.b();
                nwbVar.e.c(null);
            }
        }
        nwbVar.j();
        return nwbVar;
    }

    public static final dswc c(hho hhoVar) {
        return (dswc) hhoVar.a();
    }

    public static final void d(hho hhoVar, dswc dswcVar) {
        hhoVar.b(dswcVar);
    }

    public static final void e(hho hhoVar, boolean z) {
        hhoVar.b(Boolean.valueOf(z));
    }

    public static final void f(hho hhoVar, boolean z) {
        hhoVar.b(Boolean.valueOf(z));
    }

    public static final boolean g(hho hhoVar) {
        return ((Boolean) hhoVar.a()).booleanValue();
    }

    public static final boolean h(hho hhoVar) {
        return ((Boolean) hhoVar.a()).booleanValue();
    }

    public static final boolean i(hkx hkxVar) {
        return ((Boolean) hkxVar.a()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final defpackage.dspe r17, final defpackage.hvi r18, final defpackage.dsvy r19, final boolean r20, final defpackage.ffji r21, final boolean r22, final defpackage.ffjo r23, defpackage.hfd r24, final int r25) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsvs.j(dspe, hvi, dsvy, boolean, ffji, boolean, ffjo, hfd, int):void");
    }

    public static final void k(final dspe dspeVar, final hvi hviVar, final dsvy dsvyVar, final boolean z, final ffji ffjiVar, hfd hfdVar, final int i) {
        int i2;
        boolean z2;
        hfd hfdVar2;
        hfd b = hfdVar.b(-922228167);
        if ((i & 6) == 0) {
            i2 = (true != b.F(dspeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(dsvyVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.E(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.F(ffjiVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            final dswd dswdVar = dsvyVar.a;
            dsuq dsuqVar = (dsuq) dswdVar;
            final hkx b2 = hkt.b(dsuqVar.c, false, null, b, 2);
            hkx b3 = hkt.b(dsuqVar.e, 0L, null, b, 2);
            b.v(2065783767);
            boolean D = b.D(dswdVar);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (D || R == hfc.a) {
                hic hicVar = new hic(Boolean.valueOf(a(b3) > 0), hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            hho hhoVar = (hho) R;
            hfmVar.Z();
            b.v(2065787332);
            boolean D2 = b.D(dswdVar);
            Object R2 = hfmVar.R();
            if (D2 || R2 == hfc.a) {
                R2 = new hic(null, hla.a);
                hfmVar.ad(R2);
            }
            hho hhoVar2 = (hho) R2;
            hfmVar.Z();
            if (i(b2)) {
                hhoVar.b(true);
            }
            b.v(2065795506);
            boolean D3 = b.D(dswdVar);
            Object R3 = hfmVar.R();
            if (D3 || R3 == hfc.a) {
                R3 = new ffix() { // from class: dsuv
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dswd dswdVar2 = dswd.this;
                        if (dsvs.i(b2)) {
                            dswdVar2.b();
                        } else {
                            dswdVar2.c();
                        }
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R3);
            }
            ffix ffixVar = (ffix) R3;
            hfmVar.Z();
            b.v(2065801303);
            Object R4 = hfmVar.R();
            if (R4 == hfc.a) {
                hic hicVar2 = new hic(true, hla.a);
                hfmVar.ad(hicVar2);
                R4 = hicVar2;
            }
            final hho hhoVar3 = (hho) R4;
            hfmVar.Z();
            if (i(b2)) {
                z2 = true;
            } else {
                z2 = true;
                e(hhoVar3, true);
            }
            b.v(2065808248);
            b.v(2065808268);
            boolean z3 = (i(b2) && h(hhoVar3) && !dlsp.b(b)) ? z2 : false;
            hfmVar.Z();
            if (z3) {
                b.v(2065810941);
                Object R5 = hfmVar.R();
                if (R5 == hfc.a) {
                    R5 = new dsvi(hhoVar3, null);
                    hfmVar.ad(R5);
                }
                hfmVar.Z();
                hgs.g(dspeVar, (ffjm) R5, b);
            }
            hfmVar.Z();
            b.v(2065814314);
            boolean F = b.F(dsvyVar) | b.F(dspeVar);
            Object R6 = hfmVar.R();
            if (F || R6 == hfc.a) {
                R6 = new ffix() { // from class: dsuw
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dsvs.e(hhoVar3, !dsvs.h(r0));
                        if (dsvy.this.c) {
                            dspeVar.g();
                        }
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R6);
            }
            ffix ffixVar2 = (ffix) R6;
            hfmVar.Z();
            Boolean valueOf = Boolean.valueOf(z);
            b.v(2065821789);
            int i3 = i2;
            boolean D4 = ((i2 & 7168) == 2048) | b.D(b2) | b.F(dswdVar);
            Object R7 = hfmVar.R();
            if (D4 || R7 == hfc.a) {
                R7 = new dsvj(z, dswdVar, b2, null);
                hfmVar.ad(R7);
            }
            hfmVar.Z();
            hgs.g(valueOf, (ffjm) R7, b);
            hfdVar2 = b;
            dym.a(hviVar, null, hpx.d(-317298141, new dsvn(ffixVar2, dspeVar, dsvyVar, dswdVar, ffjiVar, z, ffixVar, hhoVar3, b2, hhoVar, hhoVar2, b3), b), hfdVar2, ((i3 >> 3) & 14) | 3072, 6);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dsux
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dspe dspeVar2 = dspe.this;
                    hvi hviVar2 = hviVar;
                    dsvy dsvyVar2 = dsvyVar;
                    boolean z4 = z;
                    dsvs.k(dspeVar2, hviVar2, dsvyVar2, z4, ffjiVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void l(final hvi hviVar, final dswd dswdVar, final boolean z, final boolean z2, final dswc dswcVar, final boolean z3, hfd hfdVar, final int i) {
        hvi hviVar2;
        int i2;
        int i3;
        final hho hhoVar;
        int i4 = i & 6;
        hfd b = hfdVar.b(-160069411);
        if (i4 == 0) {
            hviVar2 = hviVar;
            i2 = (true != b.D(hviVar2) ? 2 : 4) | i;
        } else {
            hviVar2 = hviVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(dswdVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.E(z2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.D(dswcVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.E(z3) ? 65536 : 131072;
        }
        if ((74899 & i2) == 74898 && b.I()) {
            b.s();
        } else {
            int i5 = i2 << 3;
            final lkr lkrVar = (lkr) b.e(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            final ExoPlayer exoPlayer = ((dsuq) dswdVar).h;
            b.v(1642243448);
            boolean F = b.F(dswdVar) | b.F(lkrVar);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (F || R == hfc.a) {
                R = new ffji() { // from class: dsva
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ((hgp) obj).getClass();
                        final dswd dswdVar2 = dswdVar;
                        lkp lkpVar = new lkp() { // from class: dsuu
                            @Override // defpackage.lkp
                            public final void hg(lkr lkrVar2, lki lkiVar) {
                                if (lkiVar == lki.ON_STOP) {
                                    dswd.this.b();
                                }
                            }
                        };
                        lkr lkrVar2 = lkr.this;
                        lkrVar2.P().c(lkpVar);
                        return new dsvr(dswdVar2, lkrVar2, lkpVar);
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hgs.c(dswdVar, (ffji) R, b);
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                R2 = hgs.a(ffhe.a, b);
                hfmVar.ad(R2);
            }
            final ffsk ffskVar = (ffsk) R2;
            b.v(1642256203);
            Object R3 = hfmVar.R();
            if (R3 == hfc.a) {
                R3 = new dswa();
                hfmVar.ad(R3);
            }
            final dswa dswaVar = (dswa) R3;
            hfmVar.Z();
            b.v(1642257901);
            Object R4 = hfmVar.R();
            if (R4 == hfc.a) {
                hic hicVar = new hic(false, hla.a);
                hfmVar.ad(hicVar);
                R4 = hicVar;
            }
            int i6 = i5 & 112;
            hho hhoVar2 = (hho) R4;
            hfmVar.Z();
            if (z3) {
                b.v(-629527431);
                b.v(1642262057);
                boolean F2 = b.F(exoPlayer);
                Object R5 = hfmVar.R();
                if (F2 || R5 == hfc.a) {
                    R5 = new ffji() { // from class: dsvb
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj) {
                            Context context = (Context) obj;
                            context.getClass();
                            SurfaceView surfaceView = new SurfaceView(context);
                            nwb b2 = dsvs.b(context);
                            lro lroVar = lro.this;
                            b2.e(lroVar);
                            lroVar.getClass();
                            lroVar.W(surfaceView);
                            return surfaceView;
                        }
                    };
                    hfmVar.ad(R5);
                }
                ffji ffjiVar = (ffji) R5;
                hfmVar.Z();
                b.v(1642269969);
                i3 = i2;
                boolean F3 = b.F(ffskVar) | ((i2 & 7168) == 2048) | ((i2 & 896) == 256) | ((i3 & 57344) == 16384) | b.F(dswaVar);
                Object R6 = hfmVar.R();
                if (F3 || R6 == hfc.a) {
                    hhoVar = hhoVar2;
                    ffji ffjiVar2 = new ffji() { // from class: dsvc
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj) {
                            SurfaceView surfaceView = (SurfaceView) obj;
                            surfaceView.getClass();
                            hho hhoVar3 = hhoVar;
                            if (z2 && !z && dswcVar == null) {
                                ffqy.d(ffskVar, null, null, new dsvp(surfaceView, dswaVar, hhoVar3, null), 3);
                            } else {
                                dsvs.f(hhoVar3, false);
                            }
                            return ffcu.a;
                        }
                    };
                    hfmVar.ad(ffjiVar2);
                    R6 = ffjiVar2;
                } else {
                    hhoVar = hhoVar2;
                }
                hfmVar.Z();
                kcg.b(ffjiVar, hviVar2, (ffji) R6, b, i6, 0);
                hfmVar.Z();
            } else {
                i3 = i2;
                hhoVar = hhoVar2;
                b.v(-628749734);
                b.v(1642287581);
                Object R7 = hfmVar.R();
                if (R7 == hfc.a) {
                    R7 = dsvq.a;
                    hfmVar.ad(R7);
                }
                hfmVar.Z();
                ffji ffjiVar3 = (ffji) ((ffmq) R7);
                b.v(1642288732);
                boolean F4 = b.F(exoPlayer);
                Object R8 = hfmVar.R();
                if (F4 || R8 == hfc.a) {
                    R8 = new ffji() { // from class: dsus
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj) {
                            nwb nwbVar = (nwb) obj;
                            nwbVar.getClass();
                            nwbVar.e(lro.this);
                            return ffcu.a;
                        }
                    };
                    hfmVar.ad(R8);
                }
                hfmVar.Z();
                kcg.b(ffjiVar3, hviVar, (ffji) R8, b, i6 | 6, 0);
                hfmVar.Z();
            }
            if (((Boolean) hhoVar.a()).booleanValue()) {
                dgx.b((ich) dswaVar.c.a(), null, hviVar, null, null, b, ((i3 << 6) & 896) | 48, 248);
                b = b;
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dsut
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar3 = hvi.this;
                    dswd dswdVar2 = dswdVar;
                    boolean z4 = z;
                    boolean z5 = z2;
                    dswc dswcVar2 = dswcVar;
                    dsvs.l(hviVar3, dswdVar2, z4, z5, dswcVar2, z3, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final /* synthetic */ String m(long j, hfd hfdVar) {
        LocaleList locales;
        int size;
        hfdVar.v(-594652735);
        StringBuilder sb = new StringBuilder();
        locales = ((Configuration) hfdVar.e(AndroidCompositionLocals_androidKt.a)).getLocales();
        locales.getClass();
        size = locales.size();
        String J = lvf.J(sb, new Formatter(sb, size > 0 ? locales.get(0) : Locale.getDefault()), j);
        J.getClass();
        hfdVar.o();
        return J;
    }
}
