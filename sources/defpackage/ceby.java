package defpackage;

import android.content.Context;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ceby;
import io.grpc.Status;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceby implements cebg {
    public static final entd b = entd.c("BugleCms");
    static final cfup c = cfvl.e(cfvl.b, "cms_opt_out_pwq_step_max_retry", 3);
    public final babm d;
    public final Context e;
    public final axkm f;
    public final errl g;
    public final errl h;
    private final ceaa i;
    private final cdzq j;
    private final cdzf k;
    private final cdyu l;

    /* compiled from: PG */
    public interface a {
        ceac cm();

        ceac cn();

        ceac co();

        ceac cp();

        ceac cq();

        ceac cr();

        ceac cs();
    }

    public ceby(Context context, babm babmVar, ceaa ceaaVar, cdzq cdzqVar, cdzf cdzfVar, cdyu cdyuVar, axkm axkmVar, errl errlVar, errl errlVar2) {
        this.e = context;
        this.d = babmVar;
        this.i = ceaaVar;
        this.j = cdzqVar;
        this.k = cdzfVar;
        this.l = cdyuVar;
        this.f = axkmVar;
        this.g = errlVar;
        this.h = errlVar2;
    }

    public final elfl a(ceaj ceajVar, final int i, final ceal cealVar, elfl elflVar) {
        elfl c2;
        switch (ceajVar.ordinal()) {
            case 1:
                return elflVar.i(new eroh() { // from class: cebp
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        entd entdVar = ceby.b;
                        return ((ceby.a) obj).cs().a(i, cealVar);
                    }
                }, this.g);
            case 2:
                return elflVar.i(new eroh() { // from class: cebh
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        entd entdVar = ceby.b;
                        ceac cr = ((ceby.a) obj).cr();
                        boolean booleanValue = ((Boolean) cebc.b.e()).booleanValue();
                        int i2 = i;
                        final ceal cealVar2 = cealVar;
                        if (!booleanValue) {
                            ensz enszVar = (ensz) cebc.a.h();
                            enszVar.Y(cdii.I, Integer.valueOf(i2));
                            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsSetFeatureDisabledOnServerStep", "doWork", 55, "CmsSetFeatureDisabledOnServerStep.java")).q("Removing status object from the server");
                            return ((cebc) cr).c.h().h(new emwl() { // from class: ceba
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    ((ensz) ((ensz) cebc.a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsSetFeatureDisabledOnServerStep", "doWork", 61, "CmsSetFeatureDisabledOnServerStep.java")).q("MultiDeviceStatus set to disabled on server successfully");
                                    ceaf ceafVar = (ceaf) ceal.this.toBuilder();
                                    ceafVar.copyOnWrite();
                                    ceal cealVar3 = (ceal) ceafVar.instance;
                                    cealVar3.f = 2;
                                    cealVar3.c |= 4;
                                    return (ceal) ceafVar.build();
                                }
                            }, erpp.a).e(csgw.class, new emwl() { // from class: cebb
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    ((ensz) ((ensz) cebc.a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsSetFeatureDisabledOnServerStep", "doWork", 68, "CmsSetFeatureDisabledOnServerStep.java")).q("Skipping delete of MultiDeviceStatus on CMS because device id did not match the one on CMS.");
                                    ceaf ceafVar = (ceaf) ceal.this.toBuilder();
                                    ceafVar.copyOnWrite();
                                    ceal cealVar3 = (ceal) ceafVar.instance;
                                    cealVar3.f = 2;
                                    cealVar3.c |= 4;
                                    return (ceal) ceafVar.build();
                                }
                            }, erpp.a);
                        }
                        ensz enszVar2 = (ensz) cebc.a.h();
                        enszVar2.Y(cdii.I, Integer.valueOf(i2));
                        ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsSetFeatureDisabledOnServerStep", "doWork", 48, "CmsSetFeatureDisabledOnServerStep.java")).q("Remove status object from the server step is skipped");
                        ceaf ceafVar = (ceaf) cealVar2.toBuilder();
                        ceafVar.copyOnWrite();
                        ceal cealVar3 = (ceal) ceafVar.instance;
                        cealVar3.f = 2;
                        cealVar3.c |= 4;
                        return elfo.e((ceal) ceafVar.build());
                    }
                }, this.g);
            case 3:
                final ceaa ceaaVar = this.i;
                final eixo eixoVar = ceaaVar.d;
                elfl a2 = ceaaVar.a.a();
                eixoVar.getClass();
                return a2.i(new eroh() { // from class: cdzx
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return eixo.this.c((eisx) obj);
                    }
                }, ceaaVar.f).i(new eroh() { // from class: cdzy
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        final eixn eixnVar = (eixn) obj;
                        final ceaa ceaaVar2 = ceaa.this;
                        final ceal cealVar2 = cealVar;
                        return ceaaVar2.h.b("CmsCompleteOptOutMdStep#doWork", new Runnable() { // from class: cdzu
                            @Override // java.lang.Runnable
                            public final void run() {
                                ceaa ceaaVar3 = ceaa.this;
                                if (((Boolean) ceaaVar3.g.b()).booleanValue()) {
                                    if (new eygk(cealVar2.g, ceal.a).contains(ceaj.RETRIEVE_CMS_TIMESTAMP)) {
                                        ceaaVar3.b.Y(eixnVar.b().c);
                                    } else {
                                        ceaaVar3.b.E();
                                    }
                                }
                                ceaaVar3.b();
                                ceaaVar3.a.b();
                                dtuu dtuuVar = ceaaVar3.c;
                                dtut dtutVar = new dtut() { // from class: cdzw
                                    @Override // defpackage.dtut
                                    public final ekzz a() {
                                        return eleg.f("CCOOMS::notifyDataChanged::runAfterCommit");
                                    }
                                };
                                axkm axkmVar = ceaaVar3.b;
                                axkmVar.getClass();
                                dtuuVar.g(dtutVar, "CmsCompleteOptOutMdStep#doWork", new cdzt(axkmVar));
                            }
                        }).h(new emwl() { // from class: cdzv
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                ceaf ceafVar = (ceaf) ceal.this.toBuilder();
                                ceafVar.copyOnWrite();
                                ceal cealVar3 = (ceal) ceafVar.instance;
                                cealVar3.f = 2;
                                cealVar3.c |= 4;
                                return (ceal) ceafVar.build();
                            }
                        }, ceaaVar2.f);
                    }
                }, ceaaVar.e).e(babn.class, new emwl() { // from class: cdzz
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        final ceaa ceaaVar2 = ceaa.this;
                        ceaaVar2.c.d("CmsCompleteOptOutMdStep#catchNoLinkedAccountException", new Runnable() { // from class: cdzr
                            @Override // java.lang.Runnable
                            public final void run() {
                                ceaa ceaaVar3 = ceaa.this;
                                ceaaVar3.b.E();
                                ceaaVar3.b();
                            }
                        });
                        dtut dtutVar = new dtut() { // from class: cdzs
                            @Override // defpackage.dtut
                            public final ekzz a() {
                                return eleg.f("CCOOMS::notifyDataChanged::runAfterCommit");
                            }
                        };
                        axkm axkmVar = ceaaVar2.b;
                        axkmVar.getClass();
                        ceaaVar2.c.g(dtutVar, "CmsCompleteOptOutMdStep#doWork", new cdzt(axkmVar));
                        ceaf ceafVar = (ceaf) cealVar.toBuilder();
                        ceafVar.copyOnWrite();
                        ceal cealVar2 = (ceal) ceafVar.instance;
                        cealVar2.f = 2;
                        cealVar2.c |= 4;
                        return (ceal) ceafVar.build();
                    }
                }, ceaaVar.e);
            case 4:
                return elflVar.i(new eroh() { // from class: cebq
                    /* JADX WARN: Type inference failed for: r1v6, types: [comc, java.lang.Object] */
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        entd entdVar = ceby.b;
                        ceac co = ((ceby.a) obj).co();
                        final ceal cealVar2 = cealVar;
                        ensn a3 = ceab.a(cealVar2);
                        boolean booleanValue = ((Boolean) cdzc.b.e()).booleanValue();
                        int i2 = i;
                        if (booleanValue) {
                            ensz enszVar = (ensz) cdzc.a.h();
                            enszVar.Y(a3, Integer.valueOf(i2));
                            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsClearPrimaryDeviceIdStep", "doWork", 48, "CmsClearPrimaryDeviceIdStep.java")).q("Clear primary device id step is skipped");
                            ceaf ceafVar = (ceaf) cealVar2.toBuilder();
                            ceafVar.copyOnWrite();
                            ceal cealVar3 = (ceal) ceafVar.instance;
                            cealVar3.f = 2;
                            cealVar3.c |= 4;
                            return elfo.e((ceal) ceafVar.build());
                        }
                        ensz enszVar2 = (ensz) cdzc.a.h();
                        enszVar2.Y(a3, Integer.valueOf(i2));
                        ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsClearPrimaryDeviceIdStep", "doWork", 52, "CmsClearPrimaryDeviceIdStep.java")).q("Doing clear primary device id");
                        final crvt crvtVar = ((cdzc) co).c;
                        final elfl h = crvtVar.e.e.get().h().h(new emwl() { // from class: axjh
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                axez axezVar = (axez) obj2;
                                cskc cskcVar = axkm.a;
                                return (axezVar.b & 512) != 0 ? Optional.of(axezVar.m) : Optional.empty();
                            }
                        }, erpp.a);
                        eyfg eyfgVar = (eyfg) eyfh.a.createBuilder();
                        eyfgVar.a("box_devices");
                        final elfl k = crvtVar.f.k((eyfh) eyfgVar.build());
                        final elfl n = crvtVar.e.n();
                        return elfo.m(h, k, n).b(new erog() { // from class: crvp
                            @Override // defpackage.erog
                            public final ListenableFuture a() {
                                Optional optional = (Optional) erqt.q(h);
                                Optional optional2 = (Optional) erqt.q(n);
                                esvv esvvVar = (esvv) erqt.q(k);
                                engw a4 = cscq.a(esvvVar);
                                if (optional2.isEmpty()) {
                                    ((ensz) ((ensz) crvt.a.j()).h("com/google/android/apps/messaging/shared/util/cloudstore/CmsBoxDetailsManager", "clearPrimaryDevice", 260, "CmsBoxDetailsManager.java")).q("No device ID on the device");
                                    return elfo.e(null);
                                }
                                if (!a4.contains(optional2.get())) {
                                    ensz enszVar3 = (ensz) crvt.a.h();
                                    enszVar3.Y(cdii.m, (String) optional2.get());
                                    enszVar3.Y(cdii.x, "Current device is not primary device in box");
                                    ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsBoxDetailsManager", "clearPrimaryDevice", 269, "CmsBoxDetailsManager.java")).q("Skip clearing primary device in box");
                                    return elfo.e(null);
                                }
                                crvt crvtVar2 = crvt.this;
                                String str = (String) optional.orElse("");
                                String a5 = eirv.b().a(a4);
                                epfc epfcVar = (epfc) epfe.a.createBuilder();
                                epfcVar.copyOnWrite();
                                epfe epfeVar = (epfe) epfcVar.instance;
                                epfeVar.c = 2;
                                epfeVar.b |= 1;
                                epfcVar.copyOnWrite();
                                epfe epfeVar2 = (epfe) epfcVar.instance;
                                str.getClass();
                                epfeVar2.b = 2 | epfeVar2.b;
                                epfeVar2.d = str;
                                epfcVar.copyOnWrite();
                                epfe epfeVar3 = (epfe) epfcVar.instance;
                                epfeVar3.b |= 8;
                                epfeVar3.f = a5;
                                crvtVar2.h.s((epfe) epfcVar.build());
                                final String str2 = (String) optional2.get();
                                esvu esvuVar = (esvu) esvv.b.createBuilder();
                                String str3 = esvvVar.d;
                                esvuVar.copyOnWrite();
                                esvv esvvVar2 = (esvv) esvuVar.instance;
                                str3.getClass();
                                esvvVar2.d = str3;
                                esvuVar.a((Iterable) Collection.EL.stream(esvvVar.f).filter(new Predicate() { // from class: crvq
                                    public final /* synthetic */ Predicate and(Predicate predicate) {
                                        return Predicate$CC.$default$and(this, predicate);
                                    }

                                    @Override // java.util.function.Predicate
                                    /* renamed from: negate */
                                    public final /* synthetic */ Predicate mo439negate() {
                                        return Predicate$CC.$default$negate(this);
                                    }

                                    public final /* synthetic */ Predicate or(Predicate predicate) {
                                        return Predicate$CC.$default$or(this, predicate);
                                    }

                                    @Override // java.util.function.Predicate
                                    public final boolean test(Object obj2) {
                                        esvx esvxVar = (esvx) obj2;
                                        entd entdVar2 = crvt.a;
                                        int a6 = esvz.a(esvxVar.c);
                                        return (a6 != 0 && a6 == 3 && str2.equals(esvxVar.b)) ? false : true;
                                    }
                                }).collect(Collectors.toCollection(new crvn())));
                                eszs eszsVar = crvt.d;
                                esvuVar.copyOnWrite();
                                esvv esvvVar3 = (esvv) esvuVar.instance;
                                eszsVar.getClass();
                                esvvVar3.b();
                                esvvVar3.e.add(eszsVar);
                                esvv esvvVar4 = (esvv) esvuVar.build();
                                ensz enszVar4 = (ensz) crvt.a.h();
                                enszVar4.Y(cdii.m, str2);
                                ((ensz) enszVar4.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsBoxDetailsManager", "clearPrimaryDeviceInBox", 297, "CmsBoxDetailsManager.java")).q("Clear primary device id from box");
                                crty crtyVar = crvtVar2.f;
                                return (csgj.a() && ((Boolean) ((cfup) csfu.b.get()).e()).booleanValue()) ? crtyVar.ai(esvvVar4, crvt.b, crvt.c, 3).h(new emwl() { // from class: crvr
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj2) {
                                        entd entdVar2 = crvt.a;
                                        return null;
                                    }
                                }, erpp.a) : crtyVar.S(esvvVar4, crvt.b, crvt.c).h(new emwl() { // from class: crvs
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj2) {
                                        entd entdVar2 = crvt.a;
                                        return null;
                                    }
                                }, erpp.a);
                            }
                        }, crvtVar.i).h(new emwl() { // from class: cdzb
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                ((ensz) ((ensz) cdzc.a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsClearPrimaryDeviceIdStep", "doWork", 58, "CmsClearPrimaryDeviceIdStep.java")).q("Clearing primary device id completed successfully");
                                ceaf ceafVar2 = (ceaf) ceal.this.toBuilder();
                                ceafVar2.copyOnWrite();
                                ceal cealVar4 = (ceal) ceafVar2.instance;
                                cealVar4.f = 2;
                                cealVar4.c |= 4;
                                return (ceal) ceafVar2.build();
                            }
                        }, erpp.a);
                    }
                }, this.g);
            case 5:
                return elflVar.i(new eroh() { // from class: cebr
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        entd entdVar = ceby.b;
                        ceac cn = ((ceby.a) obj).cn();
                        final ceal cealVar2 = cealVar;
                        ensn a3 = ceab.a(cealVar2);
                        ensz enszVar = (ensz) cdza.a.h();
                        enszVar.Y(a3, Integer.valueOf(i));
                        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsClearInitialSyncStatusStep", "doWork", 38, "CmsClearInitialSyncStatusStep.java")).q("Removing initial sync status object from the server");
                        return ((cdza) cn).b.e().h(new emwl() { // from class: cdyy
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                ((ensz) ((ensz) cdza.a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsClearInitialSyncStatusStep", "doWork", 44, "CmsClearInitialSyncStatusStep.java")).q("InitialSyncStatus successfully cleared on server");
                                ceaf ceafVar = (ceaf) ceal.this.toBuilder();
                                ceafVar.copyOnWrite();
                                ceal cealVar3 = (ceal) ceafVar.instance;
                                cealVar3.f = 2;
                                cealVar3.c |= 4;
                                return (ceal) ceafVar.build();
                            }
                        }, erpp.a).e(csgw.class, new emwl() { // from class: cdyz
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                ((ensz) ((ensz) cdza.a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsClearInitialSyncStatusStep", "doWork", 51, "CmsClearInitialSyncStatusStep.java")).q("Skipping InitialSyncStatus reset on CMS because device id did not match the one on CMS.");
                                ceaf ceafVar = (ceaf) ceal.this.toBuilder();
                                ceafVar.copyOnWrite();
                                ceal cealVar3 = (ceal) ceafVar.instance;
                                cealVar3.f = 2;
                                cealVar3.c |= 4;
                                return (ceal) ceafVar.build();
                            }
                        }, erpp.a);
                    }
                }, this.g);
            case 6:
                return elflVar.i(new eroh() { // from class: cebu
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        entd entdVar = ceby.b;
                        ceac cp = ((ceby.a) obj).cp();
                        csjb c3 = ceav.a.c();
                        final ceal cealVar2 = cealVar;
                        ceah b2 = ceah.b(cealVar2.h);
                        if (b2 == null) {
                            b2 = ceah.UNSPECIFIED_FLOW;
                        }
                        int i2 = i;
                        c3.A("OptOutFlow", b2);
                        c3.y("attemptCount", i2);
                        c3.I("Resetting CMS box while disabling the cloud sync feature");
                        c3.r();
                        final ceav ceavVar = (ceav) cp;
                        return ceavVar.e.R().i(new eroh() { // from class: ceaq
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                ((ensz) ((ensz) ceav.c.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsResetBoxStep", "doWork", 92, "CmsResetBoxStep.java")).q("Successfully reset the user's box");
                                final ceav ceavVar2 = ceav.this;
                                ceavVar2.b();
                                ceaf ceafVar = (ceaf) cealVar2.toBuilder();
                                ceafVar.copyOnWrite();
                                ceal cealVar3 = (ceal) ceafVar.instance;
                                cealVar3.f = 2;
                                cealVar3.c |= 4;
                                final ceal cealVar4 = (ceal) ceafVar.build();
                                if (!csgj.a()) {
                                    return elfo.e(cealVar4);
                                }
                                ceav.b.p("Resetting Folsom keys.");
                                return ceavVar2.d.b().i(new eroh() { // from class: ceas
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj3) {
                                        return ceav.this.f.A(new Function() { // from class: axfd
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj4) {
                                                axep axepVar = (axep) obj4;
                                                cskc cskcVar = axkm.a;
                                                axepVar.copyOnWrite();
                                                axez axezVar = (axez) axepVar.instance;
                                                axez axezVar2 = axez.a;
                                                axezVar.b |= Integer.MIN_VALUE;
                                                axezVar.D = false;
                                                return axepVar;
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        });
                                    }
                                }, ceavVar2.h).h(new emwl() { // from class: ceat
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj3) {
                                        cskc cskcVar = ceav.a;
                                        return ceal.this;
                                    }
                                }, erpp.a).f(dfqu.class, new eroh() { // from class: ceau
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj3) {
                                        ((ensz) ((ensz) ceav.c.j()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsResetBoxStep", "resetFolsomKeys", 132, "CmsResetBoxStep.java")).q("Failed to reset folsom keys");
                                        return elfo.d((dfqu) obj3);
                                    }
                                }, erpp.a);
                            }
                        }, ceavVar.g).f(fedn.class, new eroh() { // from class: cear
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                fedn fednVar = (fedn) obj2;
                                if (!fednVar.a.getCode().equals(Status.Code.NOT_FOUND)) {
                                    return elfo.d(fednVar);
                                }
                                ceal cealVar3 = cealVar2;
                                ceav ceavVar2 = ceav.this;
                                ((ensz) ((ensz) ceav.c.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsResetBoxStep", "doWork", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "CmsResetBoxStep.java")).q("Skipping user's box reset because box was not found on CMS.");
                                ceavVar2.b();
                                ceaf ceafVar = (ceaf) cealVar3.toBuilder();
                                ceafVar.copyOnWrite();
                                ceal cealVar4 = (ceal) ceafVar.instance;
                                cealVar4.f = 2;
                                cealVar4.c |= 4;
                                return elfo.e((ceal) ceafVar.build());
                            }
                        }, erpp.a);
                    }
                }, this.g);
            case 7:
                return this.l.a(i, cealVar);
            case 8:
                final cdzq cdzqVar = this.j;
                if (!((Boolean) cdzqVar.h.b()).booleanValue()) {
                    return cdzqVar.i.b("CmsCompleteOptOutBnrStep#doWork", new Runnable() { // from class: cdzo
                        @Override // java.lang.Runnable
                        public final void run() {
                            cdzq cdzqVar2 = cdzq.this;
                            cdzqVar2.b.I();
                            cdzqVar2.b();
                            cdzqVar2.a.b();
                            cdzqVar2.c();
                        }
                    }).h(new emwl() { // from class: cdzp
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            ceaf ceafVar = (ceaf) ceal.this.toBuilder();
                            ceafVar.copyOnWrite();
                            ceal cealVar2 = (ceal) ceafVar.instance;
                            cealVar2.f = 2;
                            cealVar2.c |= 4;
                            return (ceal) ceafVar.build();
                        }
                    }, cdzqVar.f);
                }
                babf babfVar = cdzqVar.a;
                final eixo eixoVar2 = cdzqVar.d;
                elfl a3 = babfVar.a();
                eixoVar2.getClass();
                return a3.i(new eroh() { // from class: cdzl
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return eixo.this.c((eisx) obj);
                    }
                }, cdzqVar.f).i(new eroh() { // from class: cdzm
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        final eixn eixnVar = (eixn) obj;
                        final cdzq cdzqVar2 = cdzq.this;
                        final ceal cealVar2 = cealVar;
                        return cdzqVar2.i.b("CmsCompleteOptOutBnrStep#doWork", new Runnable() { // from class: cdzg
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean contains = new eygk(cealVar2.g, ceal.a).contains(ceaj.RETRIEVE_CMS_TIMESTAMP);
                                cdzq cdzqVar3 = cdzq.this;
                                if (contains) {
                                    cdzqVar3.b.Y(eixnVar.b().c);
                                } else {
                                    cdzqVar3.b.E();
                                }
                                cdzqVar3.b.I();
                                cdzqVar3.b();
                                cdzqVar3.a.b();
                                cdzqVar3.c();
                            }
                        }).h(new emwl() { // from class: cdzh
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                ceaf ceafVar = (ceaf) ceal.this.toBuilder();
                                ceafVar.copyOnWrite();
                                ceal cealVar3 = (ceal) ceafVar.instance;
                                cealVar3.f = 2;
                                cealVar3.c |= 4;
                                return (ceal) ceafVar.build();
                            }
                        }, cdzqVar2.f);
                    }
                }, cdzqVar.e).e(babn.class, new emwl() { // from class: cdzn
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        final cdzq cdzqVar2 = cdzq.this;
                        cdzqVar2.c.d("CmsCompleteOptOutBnrStep#catchNoLinkedAccountException", new Runnable() { // from class: cdzi
                            @Override // java.lang.Runnable
                            public final void run() {
                                cdzq cdzqVar3 = cdzq.this;
                                cdzqVar3.b.I();
                                cdzqVar3.b.E();
                                cdzqVar3.b();
                            }
                        });
                        cdzqVar2.c();
                        ceaf ceafVar = (ceaf) cealVar.toBuilder();
                        ceafVar.copyOnWrite();
                        ceal cealVar2 = (ceal) ceafVar.instance;
                        cealVar2.f = 2;
                        cealVar2.c |= 4;
                        return (ceal) ceafVar.build();
                    }
                }, cdzqVar.e);
            case 9:
                cdzf cdzfVar = this.k;
                cealVar.getClass();
                c2 = axol.c(cdzfVar.c, ffhe.a, ffsm.a, new cdze(cdzfVar, cealVar, null));
                return c2;
            case 10:
                return elflVar.i(new eroh() { // from class: cebs
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        entd entdVar = ceby.b;
                        ceac cm = ((ceby.a) obj).cm();
                        final ceal cealVar2 = cealVar;
                        ensn a4 = ceab.a(cealVar2);
                        ensz enszVar = (ensz) cdyx.a.h();
                        enszVar.Y(a4, Integer.valueOf(i));
                        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsClearFeatureTypesStep", "doWork", 40, "CmsClearFeatureTypesStep.java")).q("Clearing feature types from the server");
                        crtz crtzVar = ((cdyx) cm).b;
                        int i2 = engw.d;
                        return crtzVar.f(enou.a).h(new emwl() { // from class: cdyv
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                ((ensz) ((ensz) cdyx.a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsClearFeatureTypesStep", "doWork", 46, "CmsClearFeatureTypesStep.java")).q("Successfully cleared feature types on server");
                                ceaf ceafVar = (ceaf) ceal.this.toBuilder();
                                ceafVar.copyOnWrite();
                                ceal cealVar3 = (ceal) ceafVar.instance;
                                cealVar3.f = 2;
                                cealVar3.c |= 4;
                                return (ceal) ceafVar.build();
                            }
                        }, erpp.a).e(fedn.class, new emwl() { // from class: cdyw
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                fedn fednVar = (fedn) obj2;
                                Status status = fednVar.a;
                                entd entdVar2 = cdyx.a;
                                if (status.getCode() != Status.Code.INVALID_ARGUMENT) {
                                    throw fednVar;
                                }
                                ceal cealVar3 = ceal.this;
                                ((ensz) ((ensz) ((ensz) cdyx.a.j()).g(fednVar)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsClearFeatureTypesStep", "doWork", '6', "CmsClearFeatureTypesStep.java")).q("Skipping ClearFeatureTypes due to CMS failure.");
                                ceaf ceafVar = (ceaf) cealVar3.toBuilder();
                                ceafVar.copyOnWrite();
                                ceal cealVar4 = (ceal) ceafVar.instance;
                                cealVar4.f = 2;
                                cealVar4.c |= 4;
                                return (ceal) ceafVar.build();
                            }
                        }, erpp.a);
                    }
                }, this.g);
            case 11:
                return elflVar.i(new eroh() { // from class: cebt
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        entd entdVar = ceby.b;
                        ceac cq = ((ceby.a) obj).cq();
                        ceal cealVar2 = cealVar;
                        final ensn a4 = ceab.a(cealVar2);
                        ceaf ceafVar = (ceaf) cealVar2.toBuilder();
                        ceafVar.copyOnWrite();
                        ceal cealVar3 = (ceal) ceafVar.instance;
                        cealVar3.f = 2;
                        cealVar3.c |= 4;
                        final ceal cealVar4 = (ceal) ceafVar.build();
                        final ceaz ceazVar = (ceaz) cq;
                        elfl b2 = ceazVar.c.b();
                        final int i2 = i;
                        return b2.i(new eroh() { // from class: ceaw
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                esye esyeVar = (esye) obj2;
                                boolean equals = esyeVar.equals(esye.COMPLETE);
                                final ceaz ceazVar2 = ceaz.this;
                                final ceal cealVar5 = cealVar4;
                                if (!equals) {
                                    ensk h = ceaz.a.h();
                                    h.Y(ente.a, "BugleCms");
                                    ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsRetrieveTimestampStep", "doWork", 92, "CmsRetrieveTimestampStep.java")).t("Server initialSyncState value: %s, clearing opt out timestamp.", esyeVar);
                                    ceazVar2.d.W(eykm.c);
                                    return erqt.i(cealVar5);
                                }
                                int i3 = i2;
                                ensn ensnVar = a4;
                                ensk h2 = ceaz.a.h();
                                h2.Y(ente.a, "BugleCms");
                                enrr enrrVar = (enrr) h2;
                                enrrVar.Y(ensnVar, Integer.valueOf(i3));
                                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsRetrieveTimestampStep", "doWork", 68, "CmsRetrieveTimestampStep.java")).q("Retrieving CMS timestamp from the server");
                                return ceazVar2.b.l().h(new emwl() { // from class: ceax
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj3) {
                                        eyja eyjaVar = (eyja) obj3;
                                        ensk h3 = ceaz.a.h();
                                        h3.Y(ente.a, "BugleCms");
                                        ((enrr) ((enrr) h3).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsRetrieveTimestampStep", "doWork", 73, "CmsRetrieveTimestampStep.java")).t("Saving opt out timestamp %s", eykm.i(eyjaVar));
                                        ceaz.this.d.W(eyjaVar);
                                        return cealVar5;
                                    }
                                }, ceazVar2.e).e(csgw.class, new emwl() { // from class: ceay
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj3) {
                                        ensk h3 = ceaz.a.h();
                                        h3.Y(ente.a, "BugleCms");
                                        ((enrr) ((enrr) h3).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsRetrieveTimestampStep", "doWork", 83, "CmsRetrieveTimestampStep.java")).q("CmsRetrieveTimestampStep: Skipped saving opt out timestamp. because device id did not match the one on CMS.");
                                        ceaz.this.d.W(eykm.c);
                                        return cealVar5;
                                    }
                                }, ceazVar2.e);
                            }
                        }, ceazVar.e);
                    }
                }, this.g);
            default:
                ((ensz) ((ensz) b.j()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/OptOutStepDelegatorImpl", "processCurrentStep", 308, "OptOutStepDelegatorImpl.java")).q("Encounter unspecified opt out step");
                return elfo.d(new cshc(34, csgx.NO_RETRY));
        }
    }
}
