package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsvn implements ffjn {
    final /* synthetic */ ffix a;
    final /* synthetic */ dspe b;
    final /* synthetic */ dsvy c;
    final /* synthetic */ dswd d;
    final /* synthetic */ ffji e;
    final /* synthetic */ boolean f;
    final /* synthetic */ ffix g;
    final /* synthetic */ hho h;
    final /* synthetic */ hkx i;
    final /* synthetic */ hho j;
    final /* synthetic */ hho k;
    final /* synthetic */ hkx l;

    public dsvn(ffix ffixVar, dspe dspeVar, dsvy dsvyVar, dswd dswdVar, ffji ffjiVar, boolean z, ffix ffixVar2, hho hhoVar, hkx hkxVar, hho hhoVar2, hho hhoVar3, hkx hkxVar2) {
        this.a = ffixVar;
        this.b = dspeVar;
        this.c = dsvyVar;
        this.d = dswdVar;
        this.e = ffjiVar;
        this.f = z;
        this.g = ffixVar2;
        this.h = hhoVar;
        this.i = hkxVar;
        this.j = hhoVar2;
        this.k = hhoVar3;
        this.l = hkxVar2;
    }

    public static final void b(hho hhoVar, boolean z) {
        hhoVar.b(Boolean.valueOf(z));
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        String a;
        hvi a2;
        String m;
        boolean z;
        boolean z2;
        hfd hfdVar;
        float a3;
        dyn dynVar = (dyn) obj;
        hfd hfdVar2 = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        dynVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar2.D(dynVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar2.I()) {
            hfdVar2.s();
        } else {
            hfdVar2.v(925055804);
            Object f = hfdVar2.f();
            if (f == hfc.a) {
                f = new dwn();
                hfdVar2.y(f);
            }
            dwn dwnVar = (dwn) f;
            hfdVar2.o();
            if (dsvs.h(this.h)) {
                hfdVar2.v(-1387927407);
                a = jii.a(R.string.video_hide_controls_clickable_content_description, hfdVar2);
                hfdVar2.o();
            } else {
                hfdVar2.v(-1387830191);
                a = jii.a(R.string.video_show_controls_clickable_content_description, hfdVar2);
                hfdVar2.o();
            }
            hvi c = dfb.c(hvi.e, dwnVar, null, false, a, null, this.a, 20);
            dspe dspeVar = this.b;
            hve hveVar = hvi.e;
            int i = huo.a;
            hvi a4 = dstl.a(hxo.a(dspeVar.e(dynVar.a(hveVar, hum.e), this.c.c), eqm.b(20.0f)), dynVar, this.c, hfdVar2);
            if ((this.c.e && dsvs.i(this.i)) || this.c.c) {
                a4 = a4.a(c);
            }
            if (dsvs.g(this.j)) {
                hfdVar2.v(-1386946443);
                hvi a5 = jfw.a(a4, "LocalVideoRenderer.Player");
                dswd dswdVar = this.d;
                hkx hkxVar = this.i;
                dsvy dsvyVar = this.c;
                dsvs.l(a5, dswdVar, dsvs.i(hkxVar), dsvyVar.c, dsvs.c(this.k), dsvyVar.e, hfdVar2, 0);
                hfdVar2.o();
            } else {
                hfdVar2.v(-1386728637);
                dsuh.a(this.b, iqd.a(jfw.a(a4, "LocalVideoRenderer.Preview"), this.e), this.c, null, hfdVar2, 0, 4);
                hfdVar2 = hfdVar2;
                hfdVar2.o();
            }
            a2 = dlsj.a(jfw.a(dynVar.b(hvi.e), "LocalVideoRenderer.Controls"), this.c.b, true);
            dswc c2 = dsvs.c(this.k);
            String m2 = dsvs.m(c2 != null ? (long) (c2.a * ((dsuq) this.d).d) : dsvs.a(this.l), hfdVar2);
            String m3 = dsvs.m(((dsuq) this.d).d, hfdVar2);
            if (dsvs.g(this.j)) {
                hfdVar2.v(925121504);
                m = dsvs.m(dsvs.a(this.l), hfdVar2);
                hfdVar2.o();
            } else {
                hfdVar2.v(925123433);
                m = dsvs.m(((dsuq) this.d).d, hfdVar2);
                hfdVar2.o();
            }
            String str = m;
            boolean z3 = this.c.e;
            if (z3) {
                hfdVar2.v(-1385620139);
                hfdVar2.v(925136612);
                boolean D = hfdVar2.D(this.d);
                Object f2 = hfdVar2.f();
                if (D || f2 == hfc.a) {
                    hic hicVar = new hic(false, hla.a);
                    hfdVar2.y(hicVar);
                    f2 = hicVar;
                }
                final hho hhoVar = (hho) f2;
                hfdVar2.o();
                hho hhoVar2 = this.k;
                hkx hkxVar2 = this.l;
                dswc c3 = dsvs.c(hhoVar2);
                long a6 = dsvs.a(hkxVar2);
                hfdVar2.v(925139233);
                boolean D2 = hfdVar2.D(c3) | hfdVar2.C(a6);
                dswd dswdVar2 = this.d;
                hho hhoVar3 = this.k;
                hkx hkxVar3 = this.l;
                Object f3 = hfdVar2.f();
                if (D2 || f3 == hfc.a) {
                    if (dsvs.c(hhoVar3) != null) {
                        dswc c4 = dsvs.c(hhoVar3);
                        if (c4 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        a3 = c4.a;
                    } else {
                        a3 = dsvs.a(hkxVar3) / ((dsuq) dswdVar2).d;
                        dswc.a(a3);
                    }
                    f3 = new dswc(a3);
                    hfdVar2.y(f3);
                }
                float f4 = ((dswc) f3).a;
                hfdVar2.o();
                hfdVar2.v(925146715);
                boolean D3 = hfdVar2.D(this.d);
                final dswd dswdVar3 = this.d;
                final hkx hkxVar4 = this.i;
                final hho hhoVar4 = this.k;
                Object f5 = hfdVar2.f();
                if (D3 || f5 == hfc.a) {
                    f5 = new ffji() { // from class: dsvk
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj4) {
                            float floatValue = ((Float) obj4).floatValue();
                            if (dsvs.i(hkxVar4)) {
                                hho hhoVar5 = hhoVar;
                                dswd.this.b();
                                dsvn.b(hhoVar5, true);
                            }
                            hho hhoVar6 = hhoVar4;
                            dswc.a(floatValue);
                            dsvs.d(hhoVar6, new dswc(floatValue));
                            return ffcu.a;
                        }
                    };
                    hfdVar2.y(f5);
                }
                ffji ffjiVar = (ffji) f5;
                hfdVar2.o();
                hfdVar2.v(925156251);
                boolean D4 = hfdVar2.D(this.d);
                final dswd dswdVar4 = this.d;
                final hho hhoVar5 = this.k;
                Object f6 = hfdVar2.f();
                if (D4 || f6 == hfc.a) {
                    f6 = new ffix() { // from class: dsvl
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            dswd dswdVar5 = dswd.this;
                            hho hhoVar6 = hhoVar5;
                            dswc c5 = dsvs.c(hhoVar6);
                            if (c5 != null) {
                                enrr enrrVar = (enrr) dsuq.a.h().h("com/google/android/libraries/compose/ui/projector/renderers/video/HugoVideoPlayer", "seek-2oFupE4", 127, "HugoVideoPlayer.kt");
                                float f7 = c5.a;
                                enrrVar.t("Seeking to position: %s", Float.valueOf(f7));
                                dsuq dsuqVar = (dsuq) dswdVar5;
                                long j = (long) (dsuqVar.d * f7);
                                dsuqVar.e.f(Long.valueOf(j));
                                dsuqVar.a();
                                if (!dsuqVar.f) {
                                    ((enrr) dsuq.a.h().h("com/google/android/libraries/compose/ui/projector/renderers/video/HugoVideoPlayer", "seek-2oFupE4", 132, "HugoVideoPlayer.kt")).q("HugoVideoPlayer not prepared. Preparing and then seeking to position.");
                                    dsuqVar.d(false);
                                }
                                lro lroVar = dsuqVar.h;
                                if (lroVar != null) {
                                    ((lpm) lroVar).t(j);
                                }
                            }
                            hho hhoVar7 = hhoVar;
                            dsvs.d(hhoVar6, null);
                            if (((Boolean) hhoVar7.a()).booleanValue()) {
                                dswdVar5.c();
                                dsvn.b(hhoVar7, false);
                            }
                            return ffcu.a;
                        }
                    };
                    hfdVar2.y(f6);
                }
                hfdVar2.o();
                hkx hkxVar5 = this.i;
                z2 = true;
                z = z3;
                hfd hfdVar3 = hfdVar2;
                dswt.h(a2, dsvs.h(this.h), true, this.f, dsvs.i(hkxVar5), m2, m3, f4, this.g, ffjiVar, (ffix) f6, hfdVar3, 0, 0);
                hfdVar = hfdVar3;
                hfdVar.o();
            } else {
                z = z3;
                z2 = true;
                hfdVar2.v(-1384132728);
                if (dsvs.i(this.i)) {
                    a2 = a2.a(c);
                }
                hfd hfdVar4 = hfdVar2;
                dswt.g(a2, dsvs.i(this.i), dsvs.h(this.h), str, this.g, hfdVar4, 0);
                hfdVar = hfdVar4;
                hfdVar.o();
            }
            hvi a7 = dynVar.a(hvi.e, hum.g);
            boolean z4 = (z || this.c.d == null) ? false : z2;
            dbu dbuVar = dswb.a;
            cru.b(z4, a7, ctt.l(dswb.a, 2), ctt.m(dswb.a, 2), null, hpx.d(915480139, new dsvm(this.c), hfdVar), hfdVar, 196608, 16);
        }
        return ffcu.a;
    }
}
