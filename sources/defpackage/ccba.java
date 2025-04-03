package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccba implements cnjx {
    private static final entd a = entd.c("BugleCms");
    private final cedx b;
    private final cedk c;
    private final axkm d;
    private final cecr e;

    public ccba(axkm axkmVar, cedx cedxVar, cedk cedkVar, cecr cecrVar) {
        this.d = axkmVar;
        this.b = cedxVar;
        this.c = cedkVar;
        this.e = cecrVar;
    }

    @Override // defpackage.cnjx
    public final void b() {
        try {
            axez c = this.d.c();
            axkl axklVar = this.d.n;
            if (!axkl.g(c)) {
                ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsAppUpgradeHandlerImpl", "onPackageReplaced", 72, "CmsAppUpgradeHandlerImpl.java")).q("Cms features are off at the time of package replaced, no app upgrade task will be scheduled");
                return;
            }
            if (((Boolean) ((cfup) csgj.w.get()).e()).booleanValue()) {
                ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsAppUpgradeHandlerImpl", "onPackageReplaced", 84, "CmsAppUpgradeHandlerImpl.java")).q("Copy MultiDevice and InitialSync status from Cms Object to Box.");
                cecr cecrVar = this.e;
                cetw cetwVar = cetw.a;
                cetp cetpVar = new cetp();
                cetpVar.b = "CmsBoxCopyMultiDeviceAndInitialSyncStatus";
                ((cevh) cecrVar.a.b()).a(ceyr.h("cms_box_copy_multi_device_and_initial_sync_status_on_app_upgrade", cetwVar, cetpVar.a()));
            }
            axkl axklVar2 = this.d.n;
            axeu b = axeu.b(c.l);
            if (b == null) {
                b = axeu.UNSPECIFIED_STATUS;
            }
            if (!axkl.f(b)) {
                ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsAppUpgradeHandlerImpl", "onPackageReplaced", 93, "CmsAppUpgradeHandlerImpl.java")).q("Cms Multi-Device is off at the time of package replaced, cmsSyncStaleStatus and cmsCheckMissingRestore upgrade task will not be scheduled");
                return;
            }
            cedx cedxVar = this.b;
            cedm cedmVar = cedm.a;
            cetp cetpVar2 = new cetp();
            cetpVar2.b = "CmsSyncStaleStatus";
            ((cevh) cedxVar.a.b()).a(ceyr.h("cms_sync_stale_status_on_app_upgrade", cedmVar, cetpVar2.a()));
            if (((Boolean) ((cfup) csgj.n.get()).e()).booleanValue()) {
                ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsAppUpgradeHandlerImpl", "onPackageReplaced", 104, "CmsAppUpgradeHandlerImpl.java")).q("Scheduling check for missing restore work.");
                cedk cedkVar = this.c;
                cect cectVar = cect.a;
                cetp cetpVar3 = new cetp();
                cetpVar3.b = "CmsCheckForMissingRestoreWork";
                ((cevh) cedkVar.a.b()).a(ceyr.h("cms_check_missing_restore_work_on_app_upgrade", cectVar, cetpVar3.a()));
            }
        } catch (eygu e) {
            ((ensz) ((ensz) ((ensz) a.j()).g(e)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsAppUpgradeHandlerImpl", "onPackageReplaced", 'N', "CmsAppUpgradeHandlerImpl.java")).q("Can't determine Cms feature status, skipping upgrade tasks");
        }
    }
}
