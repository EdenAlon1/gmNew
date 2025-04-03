package defpackage;

import java.io.File;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akbt implements ajys {
    private static final enru a = enru.c("com/google/android/apps/messaging/restore/impl/StubbedRestoreWorkflowSteps");

    @Override // defpackage.ajys
    public final int a() {
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.ajys
    public final Object b(UUID uuid, akci akciVar, ffgu ffguVar) {
        ensk h = a.h();
        h.Y(ente.a, "BugleBackup");
        ((enrr) h.h("com/google/android/apps/messaging/restore/impl/StubbedRestoreWorkflowSteps", "completeRestore", 64, "StubbedRestoreWorkflowSteps.kt")).t("completeRestore called [%s]", uuid);
        return ffcu.a;
    }

    @Override // defpackage.ajys
    public final Object c(UUID uuid, ffgu ffguVar) {
        ensk h = a.h();
        h.Y(ente.a, "BugleBackup");
        ((enrr) h.h("com/google/android/apps/messaging/restore/impl/StubbedRestoreWorkflowSteps", "doAttachmentRestore", 72, "StubbedRestoreWorkflowSteps.kt")).t("doAttachmentRestore called [%s]", uuid);
        return ffcu.a;
    }

    @Override // defpackage.ajys
    public final Object d(UUID uuid, ffgu ffguVar) {
        ensk h = a.h();
        h.Y(ente.a, "BugleBackup");
        ((enrr) h.h("com/google/android/apps/messaging/restore/impl/StubbedRestoreWorkflowSteps", "doBugleDbRestore", 68, "StubbedRestoreWorkflowSteps.kt")).t("doBugleDbRestore called [%s]", uuid);
        return ffcu.a;
    }

    @Override // defpackage.ajys
    public final Object e(UUID uuid, akci akciVar, ffgu ffguVar) {
        ensk h = a.h();
        h.Y(ente.a, "BugleBackup");
        ((enrr) h.h("com/google/android/apps/messaging/restore/impl/StubbedRestoreWorkflowSteps", "doCompleteRestore", 76, "StubbedRestoreWorkflowSteps.kt")).t("doCompleteRestore called [%s]", uuid);
        return ffcu.a;
    }

    @Override // defpackage.ajys
    public final Object f(UUID uuid, akdb akdbVar, ffgu ffguVar) {
        ensk h = a.h();
        h.Y(ente.a, "BugleBackup");
        ((enrr) h.h("com/google/android/apps/messaging/restore/impl/StubbedRestoreWorkflowSteps", "initializeRestore", 35, "StubbedRestoreWorkflowSteps.kt")).D("initializeRestore called for feature [%s] [%s]", akdbVar, uuid);
        return ffcu.a;
    }

    @Override // defpackage.ajys
    public final Object g(UUID uuid, File file, sny snyVar, ffgu ffguVar) {
        ensk h = a.h();
        h.Y(ente.a, "BugleBackup");
        ((enrr) h.h("com/google/android/apps/messaging/restore/impl/StubbedRestoreWorkflowSteps", "requestAttachmentRestore", 55, "StubbedRestoreWorkflowSteps.kt")).J("restoreAttachment called with metadata [%s]\n%s\n%s", uuid, file, snyVar);
        return ffcu.a;
    }

    @Override // defpackage.ajys
    public final Object h(UUID uuid, File file, som somVar, ffgu ffguVar) {
        ensk h = a.h();
        h.Y(ente.a, "BugleBackup");
        ((enrr) h.h("com/google/android/apps/messaging/restore/impl/StubbedRestoreWorkflowSteps", "requestBugleDbRestore", 45, "StubbedRestoreWorkflowSteps.kt")).J("restoreBugleDb called with metadata [%s]\n%s\n%s", uuid, file, somVar);
        return ffcu.a;
    }

    @Override // defpackage.ajys
    public final Object i(List list, ffgu ffguVar) {
        ensk h = a.h();
        h.Y(ente.a, "BugleBackup");
        ((enrr) h.h("com/google/android/apps/messaging/restore/impl/StubbedRestoreWorkflowSteps", "requestRestoreAfterAppUpdate", 80, "StubbedRestoreWorkflowSteps.kt")).q("startRestoreAfterAppUpdate called");
        return ffcu.a;
    }
}
