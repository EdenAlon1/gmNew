package defpackage;

import android.os.Build;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpkp extends ffkk implements ffjm {
    final /* synthetic */ hho a;
    final /* synthetic */ kgc b;
    final /* synthetic */ dplw c;
    final /* synthetic */ float d;
    final /* synthetic */ ffix e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpkp(hho hhoVar, kgc kgcVar, dplw dplwVar, float f, ffix ffixVar) {
        super(2);
        this.a = hhoVar;
        this.b = kgcVar;
        this.c = dplwVar;
        this.d = f;
        this.e = ffixVar;
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        kfr kfrVar;
        kfr kfrVar2;
        kfr kfrVar3;
        kfr kfrVar4;
        kfr kfrVar5;
        kfr kfrVar6;
        cxj cxjVar;
        kfr kfrVar7;
        kfr kfrVar8;
        kfr kfrVar9;
        int i;
        int i2;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            this.a.b(ffcu.a);
            this.b.c();
            kgc kgcVar = this.b;
            hfdVar.v(1933055854);
            kgb b = kgcVar.b();
            kfr a = b.a();
            kfr b2 = b.b();
            kfr c = b.c();
            kgc kgcVar2 = b.a;
            kfr a2 = kgcVar2.a();
            kfr a3 = kgcVar2.a();
            kfr a4 = kgcVar2.a();
            kfr a5 = kgcVar2.a();
            kfr a6 = kgcVar2.a();
            kfr a7 = kgcVar2.a();
            hfdVar.v(755095256);
            Object f = hfdVar.f();
            if (f == hfc.a) {
                f = cxk.a(1.0f);
                hfdVar.y(f);
            }
            cxj cxjVar2 = (cxj) f;
            hfdVar.o();
            dplw dplwVar = this.c;
            hvi k = ebs.k(hvi.e, this.d * 0.7f);
            hfdVar.v(755101152);
            Object f2 = hfdVar.f();
            if (f2 == hfc.a) {
                f2 = dpjq.a;
                hfdVar.y(f2);
            }
            hfdVar.o();
            hvi a8 = hvr.a(kgc.d(k, a2, (ffji) f2), 1.0f);
            hfdVar.v(755107846);
            boolean F = hfdVar.F(cxjVar2);
            Object f3 = hfdVar.f();
            if (F || f3 == hfc.a) {
                f3 = new dpkd(cxjVar2);
                hfdVar.y(f3);
            }
            hfdVar.o();
            dpkz.h(dplwVar, icf.a(a8, (ffji) f3), hfdVar, 0);
            float d = eci.a(ecv.h(hfdVar), hfdVar).d();
            ffji b3 = this.c.b();
            hve hveVar = hvi.e;
            hfdVar.v(755118041);
            boolean A = hfdVar.A(d);
            Object f4 = hfdVar.f();
            if (A || f4 == hfc.a) {
                f4 = new dpke(d);
                hfdVar.y(f4);
            }
            hfdVar.o();
            dpmj.a(kgc.d(hveVar, a, (ffji) f4), b3, hfdVar, 0);
            hfdVar.v(755125779);
            dplw dplwVar2 = this.c;
            if ((dplwVar2 instanceof dplq) || (dplwVar2 instanceof dplv)) {
                qgp d2 = qhj.d(new qgu(R.raw.camera_lottie), hfdVar);
                hvi k2 = ebs.k(hvi.e, 76.0f);
                hfdVar.v(755135184);
                boolean D = hfdVar.D(c);
                Object f5 = hfdVar.f();
                if (D || f5 == hfc.a) {
                    f5 = new dpkf(c);
                    hfdVar.y(f5);
                }
                hfdVar.o();
                kfrVar = c;
                kfrVar2 = a2;
                kfrVar3 = a3;
                kfrVar4 = a4;
                kfrVar5 = a5;
                kfrVar6 = a6;
                cxjVar = cxjVar2;
                kfrVar7 = a7;
                qgf.b(d2.a(), kgc.d(k2, b2, (ffji) f5), false, false, null, 0.0f, 0, null, null, null, null, false, hfdVar, 0, 0, 262140);
            } else {
                kfrVar = c;
                kfrVar2 = a2;
                kfrVar3 = a3;
                kfrVar4 = a4;
                kfrVar5 = a5;
                kfrVar6 = a6;
                cxjVar = cxjVar2;
                kfrVar7 = a7;
            }
            hfdVar.o();
            hfdVar.v(755144431);
            if (this.c instanceof dplq) {
                hve hveVar2 = hvi.e;
                hfdVar.v(755147430);
                kfrVar9 = kfrVar2;
                boolean D2 = hfdVar.D(kfrVar9);
                Object f6 = hfdVar.f();
                if (D2 || f6 == hfc.a) {
                    f6 = new dpkg(kfrVar9);
                    hfdVar.y(f6);
                }
                hfdVar.o();
                kfrVar8 = kfrVar;
                dpkz.k(jii.a(R.string.popup_camera_pre_recording_text, hfdVar), true, kgc.d(hveVar2, kfrVar8, (ffji) f6), hfdVar, 48);
                if (((dplq) this.c).c == null) {
                    hfdVar.v(1935095002);
                    hvi j = eba.j(hvi.e, 0.0f, 16.0f, 0.0f, 0.0f, 13);
                    hfdVar.v(755163113);
                    boolean D3 = hfdVar.D(kfrVar9);
                    Object f7 = hfdVar.f();
                    if (D3 || f7 == hfc.a) {
                        f7 = new dpkh(kfrVar9);
                        hfdVar.y(f7);
                    }
                    hfdVar.o();
                    hvi d3 = kgc.d(j, kfrVar7, (ffji) f7);
                    dxn dxnVar = new dxn(16.0f, true, dxr.a);
                    int i3 = huo.a;
                    ipn a9 = ebm.a(dxnVar, hum.n, hfdVar, 54);
                    int a10 = hey.a(hfdVar);
                    hgb c2 = hfdVar.c();
                    hvi b4 = huz.b(hfdVar, d3);
                    int i4 = ist.a;
                    ffix ffixVar = iss.a;
                    hfdVar.M();
                    hfdVar.x();
                    if (hfdVar.H()) {
                        hfdVar.j(ffixVar);
                    } else {
                        hfdVar.z();
                    }
                    hlc.b(hfdVar, a9, iss.e);
                    hlc.b(hfdVar, c2, iss.d);
                    ffjm ffjmVar = iss.f;
                    if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a10))) {
                        Integer valueOf = Integer.valueOf(a10);
                        hfdVar.y(valueOf);
                        hfdVar.h(valueOf, ffjmVar);
                    }
                    hlc.b(hfdVar, b4, iss.c);
                    ebv.a(ebs.k(hvi.e, 52.0f), hfdVar);
                    hfdVar.v(1187617128);
                    boolean D4 = hfdVar.D(this.c);
                    Object f8 = hfdVar.f();
                    if (D4 || f8 == hfc.a) {
                        f8 = new dpki(this.c, null);
                        hfdVar.y(f8);
                    }
                    hfdVar.o();
                    i = 0;
                    dpmy.a((ffji) f8, hfdVar, 0);
                    dpnd.a((dplq) this.c, null, hfdVar, 0, 2);
                    hfdVar.n();
                    hfdVar.o();
                } else {
                    kfr kfrVar10 = kfrVar7;
                    i = 0;
                    hfdVar.v(1935674733);
                    dplq dplqVar = (dplq) this.c;
                    hvi j2 = eba.j(hvi.e, 0.0f, 16.0f, 0.0f, 0.0f, 13);
                    hfdVar.v(755182505);
                    boolean D5 = hfdVar.D(kfrVar9);
                    Object f9 = hfdVar.f();
                    if (D5 || f9 == hfc.a) {
                        f9 = new dpkj(kfrVar9);
                        hfdVar.y(f9);
                    }
                    hfdVar.o();
                    dpnd.a(dplqVar, kgc.d(j2, kfrVar10, (ffji) f9), hfdVar, 0, 0);
                    hfdVar.o();
                }
            } else {
                kfrVar8 = kfrVar;
                kfrVar9 = kfrVar2;
                i = 0;
            }
            hfdVar.o();
            hve hveVar3 = hvi.e;
            hfdVar.v(755191612);
            boolean D6 = hfdVar.D(kfrVar9);
            Object f10 = hfdVar.f();
            if (D6 || f10 == hfc.a) {
                f10 = new dpkk(kfrVar9);
                hfdVar.y(f10);
            }
            hfdVar.o();
            dpkz.k(jii.a(R.string.popup_camera_recording_text, hfdVar), this.c instanceof dplv, kgc.d(hveVar3, kfrVar8, (ffji) f10), hfdVar, i);
            dplw dplwVar3 = this.c;
            float f11 = this.d;
            cue cueVar = cue.a;
            cug cugVar = cug.a;
            hvi k3 = ebs.k(hvi.e, f11 * 0.8f);
            hfdVar.v(755210326);
            Object f12 = hfdVar.f();
            if (f12 == hfc.a) {
                f12 = dpjr.a;
                hfdVar.y(f12);
            }
            hfdVar.o();
            kfr kfrVar11 = kfrVar4;
            cru.b(dplwVar3 instanceof dplv, kgc.d(k3, kfrVar6, (ffji) f12), cueVar, cugVar, null, hpx.d(1474792153, new dpjv(kfrVar11, kfrVar3, this.c), hfdVar), hfdVar, 196608, 16);
            hfdVar.v(755275240);
            if (this.c instanceof dplk) {
                hfdVar.v(755275608);
                Object f13 = hfdVar.f();
                if (f13 == hfc.a) {
                    f13 = cxk.a(0.0f);
                    hfdVar.y(f13);
                }
                cxj cxjVar3 = (cxj) f13;
                hfdVar.o();
                Object f14 = hfdVar.f();
                if (f14 == hfc.a) {
                    f14 = hgs.a(ffhe.a, hfdVar);
                    hfdVar.y(f14);
                }
                ffsk ffskVar = (ffsk) f14;
                hvi o = ebs.o(hvi.e, this.d);
                hfdVar.v(755281797);
                Object f15 = hfdVar.f();
                if (f15 == hfc.a) {
                    f15 = dpjw.a;
                    hfdVar.y(f15);
                }
                hfdVar.o();
                hvi d4 = kgc.d(o, kfrVar5, (ffji) f15);
                hfdVar.v(755286938);
                boolean F2 = hfdVar.F(cxjVar3);
                Object f16 = hfdVar.f();
                if (F2 || f16 == hfc.a) {
                    f16 = new dpjx(cxjVar3);
                    hfdVar.y(f16);
                }
                hfdVar.o();
                hvi a11 = icf.a(d4, (ffji) f16);
                int i5 = huo.a;
                ipn a12 = ebm.a(dxu.g, hum.n, hfdVar, 54);
                int a13 = hey.a(hfdVar);
                hgb c3 = hfdVar.c();
                hvi b5 = huz.b(hfdVar, a11);
                int i6 = ist.a;
                ffix ffixVar2 = iss.a;
                hfdVar.M();
                hfdVar.x();
                if (hfdVar.H()) {
                    hfdVar.j(ffixVar2);
                } else {
                    hfdVar.z();
                }
                hlc.b(hfdVar, a12, iss.e);
                hlc.b(hfdVar, c3, iss.d);
                ffjm ffjmVar2 = iss.f;
                if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a13))) {
                    Integer valueOf2 = Integer.valueOf(a13);
                    hfdVar.y(valueOf2);
                    hfdVar.h(valueOf2, ffjmVar2);
                }
                hlc.b(hfdVar, b5, iss.c);
                hfdVar.v(1187736518);
                float f17 = 32.0f;
                if (Build.VERSION.SDK_INT >= 35 && !((dplk) this.c).c) {
                    f17 = eci.a(ecv.h(hfdVar), hfdVar).a();
                }
                hfdVar.o();
                hvi e = eba.e(hvi.e, 16.0f, f17);
                dplc dplcVar = ((dplk) this.c).a;
                hfdVar.v(1187750588);
                boolean F3 = hfdVar.F(dplcVar);
                Object f18 = hfdVar.f();
                if (F3 || f18 == hfc.a) {
                    f18 = new dpjy(dplcVar);
                    hfdVar.y(f18);
                }
                hfdVar.o();
                dpmf.a(e, (ffji) ((ffmq) f18), hfdVar, i);
                hvi e2 = eba.e(hvi.e, 16.0f, f17);
                hfdVar.v(1187759042);
                cxj cxjVar4 = cxjVar;
                boolean D7 = hfdVar.D(this.e) | hfdVar.F(ffskVar) | hfdVar.F(cxjVar4) | hfdVar.F(cxjVar3) | hfdVar.D(this.c);
                Object f19 = hfdVar.f();
                if (D7 || f19 == hfc.a) {
                    i2 = i;
                    dpkb dpkbVar = new dpkb(this.e, ffskVar, cxjVar4, cxjVar3, this.c, null);
                    hfdVar.y(dpkbVar);
                    f19 = dpkbVar;
                } else {
                    i2 = i;
                }
                hfdVar.o();
                dpmf.b(e2, (ffji) f19, hfdVar, i2);
                hfdVar.n();
                ffcu ffcuVar = ffcu.a;
                hfdVar.v(755330817);
                boolean F4 = hfdVar.F(cxjVar3);
                Object f20 = hfdVar.f();
                if (F4 || f20 == hfc.a) {
                    f20 = new dpkc(cxjVar3, null);
                    hfdVar.y(f20);
                }
                hfdVar.o();
                hgs.g(ffcuVar, (ffjm) f20, hfdVar);
            }
            hfdVar.o();
            hfdVar.o();
            hfdVar.v(-2087871650);
            hfdVar.o();
        }
        return ffcu.a;
    }
}
