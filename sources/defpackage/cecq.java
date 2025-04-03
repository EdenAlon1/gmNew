package defpackage;

import android.content.Context;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.cecq;
import io.grpc.Status;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cecq extends ceut {
    static final cfup a = cfvl.e(cfvl.b, "cms_box_copy_multi_device_and_initial_sync_status_max_retry_attempts", 5);
    public static final entd b = entd.c("BugleCms");
    public final axkm c;
    public final babf d;
    public final Context e;
    public final errl f;
    private final errl g;

    /* compiled from: PG */
    public interface a {
        crty eR();

        crtz eU();
    }

    public cecq(axkm axkmVar, babf babfVar, Context context, errl errlVar, errl errlVar2) {
        this.c = axkmVar;
        this.d = babfVar;
        this.e = context;
        this.g = errlVar;
        this.f = errlVar2;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.c(Alert.DURATION_SHOW_INDEFINITELY);
        l.b(cevc.WORKMANAGER_ONLY);
        l.f(poa.EXPONENTIAL);
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("CmsBoxCopyMultiDeviceAndInitialSyncStatusHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cetw.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        entd entdVar = b;
        ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsBoxCopyMultiDeviceAndInitialSyncStatusHandler", "processPendingWorkItemAsync", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "CmsBoxCopyMultiDeviceAndInitialSyncStatusHandler.java")).q("CmsBoxState upgrade steps triggered");
        if (((cetk) ceuwVar.a()).c <= ((Integer) a.e()).intValue()) {
            return this.c.l().i(new eroh() { // from class: ceci
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    int a2 = axkp.a(((axkq) obj).e);
                    if (a2 != 0 && a2 == 2) {
                        ((ensz) ((ensz) cecq.b.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsBoxCopyMultiDeviceAndInitialSyncStatusHandler", "processPendingWorkItemAsync", 117, "CmsBoxCopyMultiDeviceAndInitialSyncStatusHandler.java")).q("CmsBoxState upgrade skipped because upgrade was already performed on this device.");
                        return elfo.e(ceyt.i());
                    }
                    final cecq cecqVar = cecq.this;
                    return cecqVar.d.a().i(new eroh() { // from class: cecm
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            final cecq cecqVar2 = cecq.this;
                            cecq.a aVar = (cecq.a) ekhv.a(cecqVar2.e, cecq.a.class, (eisx) obj2);
                            ((ensz) cecq.b.n().h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsBoxCopyMultiDeviceAndInitialSyncStatusHandler", "processUpgradeTask", 147, "CmsBoxCopyMultiDeviceAndInitialSyncStatusHandler.java")).q("CmsBoxState upgrade step beginning migration of object status values.");
                            crty eR = aVar.eR();
                            final crtz eU = aVar.eU();
                            final elfl e = eR.r("multidevice_status").h(new emwl() { // from class: cecp
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    eszz eszzVar = (eszz) obj3;
                                    Collection arrayList = new ArrayList();
                                    if ((eszzVar.b & 4) != 0) {
                                        etao etaoVar = eszzVar.i;
                                        if (etaoVar == null) {
                                            etaoVar = etao.a;
                                        }
                                        arrayList = etaoVar.b;
                                    }
                                    Optional findFirst = Collection.EL.stream(arrayList).filter(new Predicate() { // from class: csbu
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
                                        public final boolean test(Object obj4) {
                                            return ((etaq) obj4).f.equals("multidevice_status@message.cms.google");
                                        }
                                    }).findFirst();
                                    if (findFirst.isEmpty()) {
                                        esjw esjwVar = (esjw) esjy.a.createBuilder();
                                        esjx esjxVar = esjx.NOT_SET;
                                        esjwVar.copyOnWrite();
                                        ((esjy) esjwVar.instance).b = esjxVar.a();
                                        return (esjy) esjwVar.build();
                                    }
                                    try {
                                        eydq eydqVar = ((etaq) findFirst.get()).g;
                                        if (eydqVar == null) {
                                            eydqVar = eydq.a;
                                        }
                                        esij esijVar = (esij) eyfy.parseFrom(esij.a, eydqVar.c, eyfc.a());
                                        if (esijVar.c != -1) {
                                            csjb e2 = csbw.a.e();
                                            e2.I("Could not parse MultiDeviceStatus object");
                                            e2.A("ObjectId", eszzVar.c);
                                            e2.A("Method", "parseMultiDeviceStatus");
                                            e2.A("Cause", "EncryptedData doesn't have unencrypted key index.");
                                            e2.r();
                                            esjw esjwVar2 = (esjw) esjy.a.createBuilder();
                                            esjx esjxVar2 = esjx.NOT_SET;
                                            esjwVar2.copyOnWrite();
                                            ((esjy) esjwVar2.instance).b = esjxVar2.a();
                                            return (esjy) esjwVar2.build();
                                        }
                                        try {
                                            return (esjy) eyfy.parseFrom(esjy.a, esijVar.b, eyfc.a());
                                        } catch (eygu e3) {
                                            csjb e4 = csbw.a.e();
                                            e4.I("Could not parse MultiDeviceStatus object");
                                            e4.A("ObjectId", eszzVar.c);
                                            e4.A("Method", "parseMultiDeviceStatus");
                                            e4.A("Message", e3.getMessage());
                                            e4.A("Cause", e3.getCause());
                                            e4.r();
                                            esjw esjwVar3 = (esjw) esjy.a.createBuilder();
                                            esjx esjxVar3 = esjx.NOT_SET;
                                            esjwVar3.copyOnWrite();
                                            ((esjy) esjwVar3.instance).b = esjxVar3.a();
                                            return (esjy) esjwVar3.build();
                                        }
                                    } catch (eygu e5) {
                                        csjb e6 = csbw.a.e();
                                        e6.I("Could not parse EncryptedData object");
                                        e6.A("ObjectId", eszzVar.c);
                                        e6.A("Method", "parseMultiDeviceStatus");
                                        e6.A("Message", e5.getMessage());
                                        e6.A("Cause", e5.getCause());
                                        e6.r();
                                        esjw esjwVar4 = (esjw) esjy.a.createBuilder();
                                        esjx esjxVar4 = esjx.NOT_SET;
                                        esjwVar4.copyOnWrite();
                                        ((esjy) esjwVar4.instance).b = esjxVar4.a();
                                        return (esjy) esjwVar4.build();
                                    }
                                }
                            }, cecqVar2.f).e(fedn.class, new emwl() { // from class: cecb
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    fedn fednVar = (fedn) obj3;
                                    Status status = fednVar.a;
                                    entd entdVar2 = cecq.b;
                                    if (!status.getCode().equals(Status.Code.NOT_FOUND)) {
                                        throw fednVar;
                                    }
                                    ((ensz) ((ensz) ((ensz) cecq.b.j()).g(fednVar)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsBoxCopyMultiDeviceAndInitialSyncStatusHandler", "updateBoxStatusWithCatching", (char) 199, "CmsBoxCopyMultiDeviceAndInitialSyncStatusHandler.java")).q("CloudMessageStoreClient Object does not contain MultiDeviceStatus, return default MultiDeviceStatus instance.");
                                    return esjy.a;
                                }
                            }, cecqVar2.f);
                            final elfl e2 = eR.r("initial_sync_status").h(new emwl() { // from class: cecc
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    eszz eszzVar = (eszz) obj3;
                                    java.util.Collection arrayList = new ArrayList();
                                    if ((eszzVar.b & 4) != 0) {
                                        etao etaoVar = eszzVar.i;
                                        if (etaoVar == null) {
                                            etaoVar = etao.a;
                                        }
                                        arrayList = etaoVar.b;
                                    }
                                    Optional findFirst = Collection.EL.stream(arrayList).filter(new Predicate() { // from class: csbv
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
                                        public final boolean test(Object obj4) {
                                            return ((etaq) obj4).f.equals("initial_sync_status@message.cms.google");
                                        }
                                    }).findFirst();
                                    if (findFirst.isEmpty()) {
                                        esik esikVar = (esik) esim.a.createBuilder();
                                        esil esilVar = esil.NOT_SET;
                                        esikVar.copyOnWrite();
                                        ((esim) esikVar.instance).b = esilVar.a();
                                        return (esim) esikVar.build();
                                    }
                                    try {
                                        eydq eydqVar = ((etaq) findFirst.get()).g;
                                        if (eydqVar == null) {
                                            eydqVar = eydq.a;
                                        }
                                        esij esijVar = (esij) eyfy.parseFrom(esij.a, eydqVar.c, eyfc.a());
                                        if (esijVar.c != -1) {
                                            csjb e3 = csbw.a.e();
                                            e3.I("Could not parse InitialSyncStatus object");
                                            e3.A("ObjectId", eszzVar.c);
                                            e3.A("Method", "parseInitialSyncStatus");
                                            e3.A("Cause", "EncryptedData doesn't have unencrypted key index.");
                                            e3.r();
                                            esik esikVar2 = (esik) esim.a.createBuilder();
                                            esil esilVar2 = esil.NOT_SET;
                                            esikVar2.copyOnWrite();
                                            ((esim) esikVar2.instance).b = esilVar2.a();
                                            return (esim) esikVar2.build();
                                        }
                                        try {
                                            return (esim) eyfy.parseFrom(esim.a, esijVar.b, eyfc.a());
                                        } catch (eygu e4) {
                                            csjb e5 = csbw.a.e();
                                            e5.I("Could not parse InitialSyncStatus object");
                                            e5.A("ObjectId", eszzVar.c);
                                            e5.A("Method", "parseInitialSyncStatus");
                                            e5.A("Message", e4.getMessage());
                                            e5.A("Cause", e4.getCause());
                                            e5.r();
                                            esik esikVar3 = (esik) esim.a.createBuilder();
                                            esil esilVar3 = esil.NOT_SET;
                                            esikVar3.copyOnWrite();
                                            ((esim) esikVar3.instance).b = esilVar3.a();
                                            return (esim) esikVar3.build();
                                        }
                                    } catch (eygu e6) {
                                        csjb e7 = csbw.a.e();
                                        e7.I("Could not parse InitialSyncStatus object");
                                        e7.A("ObjectId", eszzVar.c);
                                        e7.A("Method", "parseInitialSyncStatus");
                                        e7.A("Message", e6.getMessage());
                                        e7.A("Cause", e6.getCause());
                                        e7.r();
                                        esik esikVar4 = (esik) esim.a.createBuilder();
                                        esil esilVar4 = esil.NOT_SET;
                                        esikVar4.copyOnWrite();
                                        ((esim) esikVar4.instance).b = esilVar4.a();
                                        return (esim) esikVar4.build();
                                    }
                                }
                            }, cecqVar2.f).e(fedn.class, new emwl() { // from class: cecd
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    fedn fednVar = (fedn) obj3;
                                    Status status = fednVar.a;
                                    entd entdVar2 = cecq.b;
                                    if (!status.getCode().equals(Status.Code.NOT_FOUND)) {
                                        throw fednVar;
                                    }
                                    ((ensz) ((ensz) ((ensz) cecq.b.j()).g(fednVar)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsBoxCopyMultiDeviceAndInitialSyncStatusHandler", "updateBoxStatusWithCatching", (char) 215, "CmsBoxCopyMultiDeviceAndInitialSyncStatusHandler.java")).q("CloudMessageStoreClient Object does not contain InitialSyncStatus, return default InitialSyncStatus instance.");
                                    return esim.a;
                                }
                            }, cecqVar2.f);
                            return elfo.k(e, e2).b(new erog() { // from class: cece
                                @Override // defpackage.erog
                                public final ListenableFuture a() {
                                    entd entdVar2 = cecq.b;
                                    return crtz.this.k((esjy) erqt.q(e), (esim) erqt.q(e2));
                                }
                            }, cecqVar2.f).h(new emwl() { // from class: cecf
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    entd entdVar2 = cecq.b;
                                    return true;
                                }
                            }, cecqVar2.f).f(Exception.class, new eroh() { // from class: cecg
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj3) {
                                    ((ensz) ((ensz) ((ensz) cecq.b.j()).g((Exception) obj3)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsBoxCopyMultiDeviceAndInitialSyncStatusHandler", "updateBoxStatusWithCatching", 236, "CmsBoxCopyMultiDeviceAndInitialSyncStatusHandler.java")).q("CmsBoxState upgrade step failed when cloudMessageStoreClient fetch data. Will retry.");
                                    return elfo.e(false);
                                }
                            }, cecqVar2.f).i(new eroh() { // from class: ceca
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj3) {
                                    boolean booleanValue = ((Boolean) obj3).booleanValue();
                                    cecq cecqVar3 = cecq.this;
                                    return booleanValue ? cecqVar3.c.aq(2).h(new emwl() { // from class: ceck
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj4) {
                                            entd entdVar2 = cecq.b;
                                            return ceyt.i();
                                        }
                                    }, cecqVar3.f) : cecqVar3.c.aq(3).h(new emwl() { // from class: cecl
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj4) {
                                            entd entdVar2 = cecq.b;
                                            return ceyt.m();
                                        }
                                    }, cecqVar3.f);
                                }
                            }, cecqVar2.f);
                        }
                    }, cecqVar.f).f(babn.class, new eroh() { // from class: cecn
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            ((ensz) ((ensz) ((ensz) cecq.b.j()).g((babn) obj2)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsBoxCopyMultiDeviceAndInitialSyncStatusHandler", "processUpgradeTask", 178, "CmsBoxCopyMultiDeviceAndInitialSyncStatusHandler.java")).q("CmsBoxState upgrade step failed with exception.");
                            cecq cecqVar2 = cecq.this;
                            return cecqVar2.c.aq(3).h(new emwl() { // from class: ceco
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    entd entdVar2 = cecq.b;
                                    return ceyt.k();
                                }
                            }, cecqVar2.f);
                        }
                    }, cecqVar.f);
                }
            }, this.g).e(Throwable.class, new emwl() { // from class: cecj
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    ((ensz) ((ensz) ((ensz) cecq.b.j()).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsBoxCopyMultiDeviceAndInitialSyncStatusHandler", "processPendingWorkItemAsync", 128, "CmsBoxCopyMultiDeviceAndInitialSyncStatusHandler.java")).q("CmsBoxState upgrade step failed. Will retry.");
                    return ceyt.m();
                }
            }, this.f);
        }
        ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsBoxCopyMultiDeviceAndInitialSyncStatusHandler", "processPendingWorkItemAsync", 104, "CmsBoxCopyMultiDeviceAndInitialSyncStatusHandler.java")).q("CmsBoxState upgrade steps aborted because max retry is exceeded.");
        return this.c.aq(3).h(new emwl() { // from class: cech
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                entd entdVar2 = cecq.b;
                return ceyt.k();
            }
        }, this.f);
    }
}
