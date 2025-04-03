package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akbk implements Runnable {
    final /* synthetic */ akbo a;
    final /* synthetic */ UUID b;
    final /* synthetic */ akcg c;
    final /* synthetic */ som d;

    public akbk(akbo akboVar, UUID uuid, akcg akcgVar, som somVar) {
        this.a = akboVar;
        this.b = uuid;
        this.c = akcgVar;
        this.d = somVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((ajyr) this.a.b.b()).u(this.b, this.c);
        ensk h = akbo.a.h();
        h.Y(ente.a, "BugleBackup");
        enrr enrrVar = (enrr) h.h("com/google/android/apps/messaging/restore/impl/RestoreAnytimeCompatibleRestoreWorkflowSteps", "appUpdateNeededForRestore", 190, "RestoreAnytimeCompatibleRestoreWorkflowSteps.kt");
        som somVar = this.d;
        boolean z = somVar.a > 140;
        enrrVar.t("Backup database schema out of date: %s", Boolean.valueOf(z));
        int i = somVar.e;
        ensk h2 = akbo.a.h();
        h2.Y(ente.a, "BugleBackup");
        enrr enrrVar2 = (enrr) h2.h("com/google/android/apps/messaging/restore/impl/RestoreAnytimeCompatibleRestoreWorkflowSteps", "appUpdateNeededForRestore", 192, "RestoreAnytimeCompatibleRestoreWorkflowSteps.kt");
        boolean z2 = i > 5;
        enrrVar2.t("Restore workflow version out of date: %s", Boolean.valueOf(z2));
        if (!((aspb) this.a.h.b()).a() || (!z && !z2)) {
            ((akdc) this.a.c.b()).c(this.b, 5);
            return;
        }
        ensk h3 = akbo.a.h();
        h3.Y(ente.a, "BugleBackup");
        ((enrr) h3.h("com/google/android/apps/messaging/restore/impl/RestoreAnytimeCompatibleRestoreWorkflowSteps$requestBugleDbRestore$2$unused$1$unusedTwo$1", "run", 166, "RestoreAnytimeCompatibleRestoreWorkflowSteps.kt")).w("App update needed for restore: workflowVersion: [%s] sessionId: [%s]", 5, this.b);
        ((ajyr) this.a.b.b()).w(this.b, akci.WAITING_ON_APP_UPDATE);
    }
}
