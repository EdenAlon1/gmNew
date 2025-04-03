package defpackage;

import android.os.Bundle;
import android.view.ViewTreeObserver;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aece implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ Bundle a;
    final /* synthetic */ aedh b;

    public aece(aedh aedhVar, Bundle bundle) {
        this.a = bundle;
        this.b = aedhVar;
    }

    public final /* synthetic */ void a(Bundle bundle) {
        ekzz f = eleg.f("HomeFragmentPeer#AppInteractive");
        try {
            aedh aedhVar = this.b;
            if (aedhVar.b.a.c == lkj.DESTROYED) {
                if (((aube) aedhVar.bv.b()).a()) {
                    ensk j = aedh.a.j();
                    j.Y(ente.a, "HomeFragmentFlogger");
                    ((enrr) ((enrr) j).h("com/google/android/apps/messaging/home/HomeFragmentPeer$15", "onPreDraw", 2006, "HomeFragmentPeer.java")).q("fragment is destroyed after posting on UI thread.");
                } else {
                    aeaa.a.r("fragment is destroyed after posting on UI thread.");
                }
                f.close();
                return;
            }
            ekzz f2 = eleg.f("HomeFragmentPeer#runPostAppInteractiveColdStartupJobs");
            try {
                if (aedhVar.j().w()) {
                    ecqk.a.b(aedhVar.b.G());
                    aedhVar.s.h(3);
                    if (aedhVar.a() == 0 && aedhVar.aZ) {
                        ((aehw) aedhVar.p.b()).A(new aeci(aedhVar, aedhVar.Y.d()));
                    }
                    axnw.h(((axpn) aedhVar.be.b()).a("HomeFragmentPeer#appInteractive"));
                    if (((aube) aedhVar.bv.b()).a()) {
                        ensk h = aedh.a.h();
                        h.Y(ente.a, "HomeFragmentFlogger");
                        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "logAppInteractive", 2945, "HomeFragmentPeer.java")).q("Chat list recyclerView rendered");
                    } else {
                        aeaa.a.p("Chat list recyclerView rendered");
                    }
                    axnw.h(((cpdr) aedhVar.k.b()).a(aedhVar.al));
                    ((carb) aedhVar.f.b()).b();
                    if (((aube) aedhVar.bv.b()).a()) {
                        ensk h2 = aedh.a.h();
                        h2.Y(ente.a, "HomeFragmentFlogger");
                        ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "exposeCalibrationFlags", 2170, "HomeFragmentPeer.java")).t("CalibrationFlag(auto):OpenBeta10p: %s", Boolean.valueOf(aedhVar.bg.a()));
                        ensk h3 = aedh.a.h();
                        h3.Y(ente.a, "HomeFragmentFlogger");
                        ((enrr) ((enrr) h3).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "exposeCalibrationFlags", 2172, "HomeFragmentPeer.java")).t("CalibrationFlag(auto):OpenBeta50p: %s", Boolean.valueOf(aedhVar.bh.a()));
                        ensk h4 = aedh.a.h();
                        h4.Y(ente.a, "HomeFragmentFlogger");
                        ((enrr) ((enrr) h4).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "exposeCalibrationFlags", 2174, "HomeFragmentPeer.java")).t("CalibrationFlag(auto):Prod1p: %s", Boolean.valueOf(aedhVar.bi.a()));
                        ensk h5 = aedh.a.h();
                        h5.Y(ente.a, "HomeFragmentFlogger");
                        ((enrr) ((enrr) h5).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "exposeCalibrationFlags", 2175, "HomeFragmentPeer.java")).t("CalibrationFlag(auto):Prod10p: %s", Boolean.valueOf(aedhVar.bj.a()));
                    } else {
                        csjb c = aeaa.a.c();
                        c.B("CalibrationFlag(auto):OpenBeta10p", aedhVar.bg.a());
                        c.r();
                        csjb c2 = aeaa.a.c();
                        c2.B("CalibrationFlag(auto):OpenBeta50p", aedhVar.bh.a());
                        c2.r();
                        csjb c3 = aeaa.a.c();
                        c3.B("CalibrationFlag(auto):Prod1p", aedhVar.bi.a());
                        c3.r();
                        csjb c4 = aeaa.a.c();
                        c4.B("CalibrationFlag(auto):Prod10p", aedhVar.bj.a());
                        c4.r();
                    }
                    if (((aube) aedhVar.bv.b()).a()) {
                        ensk h6 = aedh.a.h();
                        h6.Y(ente.a, "HomeFragmentFlogger");
                        ((enrr) ((enrr) h6).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "runPostAppInteractiveColdStartupJobs", 2206, "HomeFragmentPeer.java")).r("Current theme mode: %s", je.b);
                    } else {
                        aeaa.a.p(a.h(je.b, "Current theme mode: "));
                    }
                    eg G = aedhVar.b.G();
                    if (G != null && G.getIntent().getBooleanExtra("via_rcs_not_delivered_notification", false)) {
                        ((cluo) aedhVar.ah.b()).a();
                    }
                    if (((asmv) aedhVar.bs.b()).a()) {
                        axnw.h(((alqj) aedhVar.bt.b()).a(2, aedhVar.l.f()));
                    } else {
                        axnw.h(((alql) aedhVar.br.b()).a(2, aedhVar.l.f()));
                    }
                    axvh axvhVar = (axvh) aedhVar.ak.b();
                    int i = axwg.a;
                    if (!axwg.a()) {
                        ((ensz) axvh.a.e()).q("ContactsSyncFeature is not enabled. Returning no-op.");
                    } else if (!axvhVar.d.d()) {
                        ((ensz) axvh.a.e()).q("Default SMS App is not Bugle. Disabling Contacts sync.");
                    } else if (axvhVar.h.compareAndSet(false, true)) {
                        axol.k(axvhVar.b, null, new axva(axvhVar, null), 3);
                    }
                    cmao cmaoVar = (cmao) aedhVar.Z.b();
                    cmaoVar.p.set(true);
                    cmaoVar.k.a(elfo.e(null), cmel.b);
                    ((cnpd) aedhVar.aF.b()).i();
                    for (cnvt cnvtVar : (Set) aedhVar.bx.b()) {
                        ensk h7 = cnvt.a.h();
                        h7.Y(ente.a, "BugleSatellite");
                        ((enrr) h7.h("com/google/android/apps/messaging/shared/satelliteapi/telephony/TelephonySatelliteReporter", "onColdStartup", 86, "TelephonySatelliteReporterImpl.kt")).q("Processing onColdStartup event.");
                        cnvtVar.c();
                    }
                    f2.close();
                    if (cufg.a()) {
                        cufk cufkVar = (cufk) aedhVar.bC.b();
                        axol.m(cufkVar.d, new cufj(cufkVar, null));
                    }
                } else {
                    f2.close();
                }
                final aedh aedhVar2 = this.b;
                aedh.b(aedhVar2.b).z(new aecg(aedhVar2));
                if (aedhVar2.aK.b()) {
                    f2 = eleg.f("registerPopUpListener");
                    try {
                        ajif ajifVar = aedhVar2.aw;
                        ajid ajidVar = aedhVar2.av;
                        elbx elbxVar = (elbx) ajifVar.a.b();
                        elbxVar.getClass();
                        ajidVar.getClass();
                        aedhVar2.aW = new ajie(elbxVar, ajidVar);
                        aedhVar2.aW.f(aedhVar2.b.A());
                        f2.close();
                    } finally {
                    }
                }
                if (!aedhVar2.aK.b()) {
                    aedhVar2.b.av(true);
                }
                aedhVar2.t();
                if (ddjr.b()) {
                    ((Optional) aedhVar2.N.b()).ifPresent(new Consumer() { // from class: aeae
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            csvs.c(((cnla) obj).d(), "Bugle", "Failed to dismiss triggered reminders");
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    if (ddjr.c() && ((Boolean) ((cfup) ddjr.c.get()).e()).booleanValue() && ((Optional) aedhVar2.N.b()).isPresent()) {
                        axnw.h(((cnla) ((Optional) aedhVar2.N.b()).get()).g());
                    }
                    aedhVar2.j().k();
                }
                cesz ceszVar = (cesz) aedhVar2.O.b();
                cesx cesxVar = (cesx) cesy.a.createBuilder();
                cesxVar.copyOnWrite();
                cesy.a((cesy) cesxVar.instance);
                cesy cesyVar = (cesy) cesxVar.build();
                cetp cetpVar = new cetp();
                cetpVar.b = "update_unread_counter_dedupe";
                ceszVar.a(cesyVar, cetpVar.a());
                if (aedhVar2.aK.b()) {
                    ((adsd) aedhVar2.h.b()).a(3);
                    eg G2 = aedhVar2.b.G();
                    if (G2 != null && G2.getIntent() != null && G2.getIntent().getBooleanExtra("opted_in_through_growth_kit_flow", false)) {
                        ((adsd) aedhVar2.h.b()).a(16);
                    }
                    if (bundle == null && aedhVar2.b.aF()) {
                        aedhVar2.m();
                    }
                }
                aefs aefsVar = aedhVar2.C;
                ((aegg) aefsVar).i.set(true);
                Iterator it = ((aegg) aefsVar).j.iterator();
                while (it.hasNext()) {
                    ((ejvp) ((aegg) aefsVar).h.b()).a(elfo.e(null), (String) it.next());
                }
                Iterator it2 = ((aegg) aefsVar).k.iterator();
                while (it2.hasNext()) {
                    ((ejvp) ((aegg) aefsVar).h.b()).a(elfo.e(null), (ejuj) it2.next());
                }
                efbd.c();
                ((aegg) aefsVar).l = true;
                ((aegg) aefsVar).c();
                cxig cxigVar = (cxig) ((aenw) aedhVar2.y.b()).d.b();
                cxigVar.d.set(true);
                cxigVar.b();
                aeiu aeiuVar = aedhVar2.q;
                final Optional of = djai.F() ? Optional.of(Long.valueOf(aedhVar2.l.f().toEpochMilli())) : Optional.empty();
                aeiuVar.a.ifPresent(new Consumer() { // from class: aeis
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        ((aefk) obj).a(Optional.this);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                aekp aekpVar = (aekp) aedhVar2.bf.b();
                lkv lkvVar = aedhVar2.b.a;
                lkvVar.getClass();
                aekpVar.e.set(true);
                Iterator it3 = aekpVar.a.iterator();
                while (it3.hasNext()) {
                    ((aeko) it3.next()).f(lkvVar, aekpVar.c);
                }
                if (!aekpVar.d.a()) {
                    Iterator it4 = aekpVar.a.iterator();
                    while (it4.hasNext()) {
                        aekpVar.c.a(elfo.e(null), ((aeko) it4.next()).e());
                    }
                }
                if (adhu.a() && csgj.a() && ((Optional) ((fbbb) aedhVar2.at).a).isPresent()) {
                    ((tde) ((Optional) ((fbbb) aedhVar2.at).a).get()).d();
                }
                ((Optional) aedhVar2.t.b()).ifPresent(new Consumer() { // from class: aebv
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        final aedh aedhVar3 = aedh.this;
                        ((adze) obj).a(new ffjm() { // from class: aeay
                            @Override // defpackage.ffjm
                            public final Object a(Object obj2, Object obj3) {
                                aedh.this.p((adhl) obj2, (Optional) obj3);
                                return ffcu.a;
                            }
                        });
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                aedhVar2.aM.g();
                f.close();
                aedh aedhVar3 = this.b;
                ahrb ahrbVar = (ahrb) aedhVar3.bm.b();
                eisx eisxVar = aedhVar3.al;
                eisxVar.getClass();
                efbd.g();
                if (ahrbVar.b) {
                    Iterator it5 = ((Set) ahrbVar.a.b()).iterator();
                    while (it5.hasNext()) {
                        ((ahrc) it5.next()).a(eisxVar);
                    }
                    ahrbVar.b = false;
                }
            } finally {
            }
        } finally {
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        aedh aedhVar = this.b;
        if (aedhVar.aJ) {
            final Bundle bundle = this.a;
            efbd.e(eldl.l(new Runnable() { // from class: aecd
                @Override // java.lang.Runnable
                public final void run() {
                    aece.this.a(bundle);
                }
            }));
        } else if (((aube) aedhVar.bv.b()).a()) {
            ensk e = aedh.a.e();
            e.Y(ente.a, "HomeFragmentFlogger");
            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/home/HomeFragmentPeer$15", "onPreDraw", 2029, "HomeFragmentPeer.java")).q("Skipping pre-draw");
        } else {
            aeaa.a.m("Skipping pre-draw");
        }
        return true;
    }
}
