package defpackage;

import android.content.Context;
import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.cedw;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cedw extends ceut {
    static final cfup a = cfvl.e(cfvl.b, "cms_sync_stale_status_on_app_upgrade_max_retry_attempts", 5);
    public static final entd b = entd.c("BugleCms");
    public final axkm c;
    public final babf d;
    public final Context e;
    public final errl f;

    /* compiled from: PG */
    public interface a {
        crtz eU();
    }

    public cedw(axkm axkmVar, babf babfVar, Context context, errl errlVar) {
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
        poh pohVar = new poh();
        pohVar.c(4);
        ((ceti) l).a = pohVar.a();
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("CmsSyncStaleStatusHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cedm.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        entd entdVar = b;
        ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsSyncStaleStatusHandler", "processPendingWorkItemAsync", 90, "CmsSyncStaleStatusHandler.java")).q("CMS package upgrade steps triggered");
        if (((cetk) ceuwVar.a()).c <= ((Integer) a.e()).intValue()) {
            return this.c.q().i(new eroh() { // from class: cedo
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    if (((Boolean) obj).booleanValue()) {
                        final cedw cedwVar = cedw.this;
                        return cedwVar.c.l().i(new eroh() { // from class: ceds
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                int a2 = axkp.a(((axkq) obj2).c);
                                if (a2 != 0 && a2 == 2) {
                                    ((ensz) ((ensz) cedw.b.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsSyncStaleStatusHandler", "processPendingWorkItemAsync", 116, "CmsSyncStaleStatusHandler.java")).q("CMS package upgrade skipped because upgrade was already performed on this device.");
                                    return elfo.e(ceyt.i());
                                }
                                final cedw cedwVar2 = cedw.this;
                                return cedwVar2.d.a().i(new eroh() { // from class: cedq
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj3) {
                                        final cedw cedwVar3 = cedw.this;
                                        cedw.a aVar = (cedw.a) ekhv.a(cedwVar3.e, cedw.a.class, (eisx) obj3);
                                        ((ensz) cedw.b.n().h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsSyncStaleStatusHandler", "processUpgradeTask", 146, "CmsSyncStaleStatusHandler.java")).q("CMS package upgrade step starts updating stale status sync");
                                        return aVar.eU().g().i(new eroh() { // from class: cedt
                                            @Override // defpackage.eroh
                                            public final ListenableFuture a(Object obj4) {
                                                return cedw.this.c.as(2);
                                            }
                                        }, erpp.a).h(new emwl() { // from class: cedu
                                            @Override // defpackage.emwl
                                            public final Object apply(Object obj4) {
                                                entd entdVar2 = cedw.b;
                                                return ceyt.i();
                                            }
                                        }, erpp.a);
                                    }
                                }, cedwVar2.f).f(babn.class, new eroh() { // from class: cedr
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj3) {
                                        ((ensz) ((ensz) cedw.b.n().g((babn) obj3)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsSyncStaleStatusHandler", "processUpgradeTask", 161, "CmsSyncStaleStatusHandler.java")).q("CMS package upgrade step failed with exception.");
                                        return cedw.this.c.as(3).h(new emwl() { // from class: cedv
                                            @Override // defpackage.emwl
                                            public final Object apply(Object obj4) {
                                                entd entdVar2 = cedw.b;
                                                return ceyt.k();
                                            }
                                        }, erpp.a);
                                    }
                                }, erpp.a);
                            }
                        }, cedwVar.f);
                    }
                    ((ensz) ((ensz) cedw.b.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsSyncStaleStatusHandler", "processPendingWorkItemAsync", 104, "CmsSyncStaleStatusHandler.java")).q("Stale status sync not performed because multi-device is not enabled on the device.");
                    return elfo.e(ceyt.i());
                }
            }, this.f).e(Throwable.class, new emwl() { // from class: cedp
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    ((ensz) ((ensz) ((ensz) cedw.b.j()).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsSyncStaleStatusHandler", "processPendingWorkItemAsync", 131, "CmsSyncStaleStatusHandler.java")).q("Cms package upgrade step failed. Will retry.");
                    return ceyt.m();
                }
            }, erpp.a);
        }
        ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsSyncStaleStatusHandler", "processPendingWorkItemAsync", 93, "CmsSyncStaleStatusHandler.java")).q("CMS package upgrade steps aborted because max retry is exceeded.");
        return this.c.as(3).h(new emwl() { // from class: cedn
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                entd entdVar2 = cedw.b;
                return ceyt.k();
            }
        }, erpp.a);
    }
}
