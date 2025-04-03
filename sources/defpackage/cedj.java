package defpackage;

import android.content.Context;
import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.cedj;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cedj extends ceut {
    static final cfup a = cfvl.e(cfvl.b, "cms_check_missing_restore_work_on_app_upgrade_max_retry_attempts", 10);
    public static final entd b = entd.c("BugleCms");
    public final axkm c;
    public final babf d;
    public final Context e;
    public final errl f;

    /* compiled from: PG */
    public interface a {
        cscu fd();
    }

    public cedj(axkm axkmVar, babf babfVar, Context context, errl errlVar) {
        this.c = axkmVar;
        this.d = babfVar;
        this.e = context;
        this.f = errlVar;
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
        return eleg.f("CmsCheckMissingRestoreWorkHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cect.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        entd entdVar = b;
        ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsCheckMissingRestoreWorkHandler", "processPendingWorkItemAsync", 96, "CmsCheckMissingRestoreWorkHandler.java")).q("CMS check missing restore work triggered");
        if (!((Boolean) ((cfup) csgj.n.get()).e()).booleanValue()) {
            ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsCheckMissingRestoreWorkHandler", "processPendingWorkItemAsync", 98, "CmsCheckMissingRestoreWorkHandler.java")).q("CMS check missing restore work flag not enabled.");
            return elfo.e(ceyt.k());
        }
        if (((cetk) ceuwVar.a()).c <= ((Integer) a.e()).intValue()) {
            return this.c.q().i(new eroh() { // from class: cedh
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    if (((Boolean) obj).booleanValue()) {
                        final cedj cedjVar = cedj.this;
                        return cedjVar.c.l().i(new eroh() { // from class: cedf
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                int a2 = axkp.a(((axkq) obj2).d);
                                if (a2 != 0 && a2 == 2) {
                                    ((ensz) ((ensz) cedj.b.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsCheckMissingRestoreWorkHandler", "processPendingWorkItemAsync", 126, "CmsCheckMissingRestoreWorkHandler.java")).q("CMS package upgrade skipped because upgrade was already performed on this device.");
                                    return elfo.e(ceyt.i());
                                }
                                final cedj cedjVar2 = cedj.this;
                                return cedjVar2.c.k().i(new eroh() { // from class: cecu
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj3) {
                                        axez axezVar = (axez) obj3;
                                        axezVar.getClass();
                                        axmi b2 = axmi.b(axezVar.f);
                                        if (b2 == null) {
                                            b2 = axmi.INITIAL_SYNC_STATUS_NOT_SET;
                                        }
                                        final cedj cedjVar3 = cedj.this;
                                        if (b2 == axmi.RESTORE_KEYS) {
                                            return cedjVar3.d.a().i(new eroh() { // from class: cecy
                                                @Override // defpackage.eroh
                                                public final ListenableFuture a(Object obj4) {
                                                    ((ensz) cedj.b.n().h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsCheckMissingRestoreWorkHandler", "processUpgradeTask", 172, "CmsCheckMissingRestoreWorkHandler.java")).q("CMS checking for missing restore work");
                                                    cfba a3 = cfbf.a();
                                                    a3.z("hasExistingBlockOnTelephonySyncWork");
                                                    a3.e(new Function() { // from class: cedd
                                                        @Override // java.util.function.Function
                                                        /* renamed from: andThen */
                                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                                            return Function$CC.$default$andThen(this, function);
                                                        }

                                                        @Override // java.util.function.Function
                                                        public final Object apply(Object obj5) {
                                                            cfbe cfbeVar = (cfbe) obj5;
                                                            entd entdVar2 = cedj.b;
                                                            cfbeVar.j("cms_block_on_telephony_sync");
                                                            return cfbeVar;
                                                        }

                                                        public final /* synthetic */ Function compose(Function function) {
                                                            return Function$CC.$default$compose(this, function);
                                                        }
                                                    });
                                                    boolean T = a3.b().T();
                                                    final cedj cedjVar4 = cedj.this;
                                                    if (T) {
                                                        return cedjVar4.c.ar(2).h(new emwl() { // from class: cecx
                                                            @Override // defpackage.emwl
                                                            public final Object apply(Object obj5) {
                                                                entd entdVar2 = cedj.b;
                                                                return ceyt.i();
                                                            }
                                                        }, erpp.a);
                                                    }
                                                    ((ensz) cedj.b.n().h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsCheckMissingRestoreWorkHandler", "processUpgradeTask", 174, "CmsCheckMissingRestoreWorkHandler.java")).q("Adding missing restore work");
                                                    return cedjVar4.d.a().h(new emwl() { // from class: cedb
                                                        @Override // defpackage.emwl
                                                        public final Object apply(Object obj5) {
                                                            eisx eisxVar = (eisx) obj5;
                                                            return ((cedj.a) ekhv.a(cedj.this.e, cedj.a.class, eisxVar)).fd().a(eisxVar, csfz.MULTI_DEVICE);
                                                        }
                                                    }, cedjVar4.f).h(new emwl() { // from class: cedc
                                                        @Override // defpackage.emwl
                                                        public final Object apply(Object obj5) {
                                                            entd entdVar2 = cedj.b;
                                                            return null;
                                                        }
                                                    }, erpp.a).i(new eroh() { // from class: cecv
                                                        @Override // defpackage.eroh
                                                        public final ListenableFuture a(Object obj5) {
                                                            return cedj.this.c.ar(2);
                                                        }
                                                    }, cedjVar4.f).h(new emwl() { // from class: cecw
                                                        @Override // defpackage.emwl
                                                        public final Object apply(Object obj5) {
                                                            entd entdVar2 = cedj.b;
                                                            return ceyt.i();
                                                        }
                                                    }, erpp.a);
                                                }
                                            }, cedjVar3.f).f(babn.class, new eroh() { // from class: cecz
                                                @Override // defpackage.eroh
                                                public final ListenableFuture a(Object obj4) {
                                                    ((ensz) ((ensz) cedj.b.n().g((babn) obj4)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsCheckMissingRestoreWorkHandler", "processUpgradeTask", 191, "CmsCheckMissingRestoreWorkHandler.java")).q("CMS check missing restore work failed with exception.");
                                                    return cedj.this.c.ar(3).h(new emwl() { // from class: ceda
                                                        @Override // defpackage.emwl
                                                        public final Object apply(Object obj5) {
                                                            entd entdVar2 = cedj.b;
                                                            return ceyt.k();
                                                        }
                                                    }, erpp.a);
                                                }
                                            }, erpp.a);
                                        }
                                        ((ensz) ((ensz) cedj.b.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsCheckMissingRestoreWorkHandler", "processPendingWorkItemAsync", 140, "CmsCheckMissingRestoreWorkHandler.java")).q("Device is not in RESTORE_KEYS, finishing");
                                        return cedjVar3.c.ar(2).h(new emwl() { // from class: cede
                                            @Override // defpackage.emwl
                                            public final Object apply(Object obj4) {
                                                entd entdVar2 = cedj.b;
                                                return ceyt.i();
                                            }
                                        }, erpp.a);
                                    }
                                }, cedjVar2.f);
                            }
                        }, cedjVar.f);
                    }
                    ((ensz) ((ensz) cedj.b.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsCheckMissingRestoreWorkHandler", "processPendingWorkItemAsync", 115, "CmsCheckMissingRestoreWorkHandler.java")).q("Check for missing restore work not performed because multi-device is not enabled on this device");
                    return elfo.e(ceyt.i());
                }
            }, this.f).e(Throwable.class, new emwl() { // from class: cedi
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    ((ensz) ((ensz) ((ensz) cedj.b.j()).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsCheckMissingRestoreWorkHandler", "processPendingWorkItemAsync", 158, "CmsCheckMissingRestoreWorkHandler.java")).q("Check for missing restore work failed. Will retry.");
                    return ceyt.m();
                }
            }, erpp.a);
        }
        ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsCheckMissingRestoreWorkHandler", "processPendingWorkItemAsync", 103, "CmsCheckMissingRestoreWorkHandler.java")).q("CMS check missing restore work failed because max retry is exceeded.");
        return this.c.ar(3).h(new emwl() { // from class: cedg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                entd entdVar2 = cedj.b;
                return ceyt.k();
            }
        }, erpp.a);
    }
}
