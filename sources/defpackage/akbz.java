package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akbz implements ajvo {
    private static final enru a = enru.c("com/google/android/apps/messaging/restore/listeners/ScheduleIncrementalReverseSyncListener");
    private final cptk b;

    public akbz(cptk cptkVar) {
        cptkVar.getClass();
        this.b = cptkVar;
    }

    @Override // defpackage.ajvo
    public final ekzz a() {
        return eleg.f("ScheduleIncrementalReverseSyncListener::onRestoreCompleted");
    }

    @Override // defpackage.ajvo
    public final void b(ajvn ajvnVar) {
        enru enruVar = a;
        ensk h = enruVar.h();
        h.Y(ente.a, "BugleBackup");
        enrr enrrVar = (enrr) h.h("com/google/android/apps/messaging/restore/listeners/ScheduleIncrementalReverseSyncListener", "onRestoreCompleted", 40, "ScheduleIncrementalReverseSyncListener.kt");
        UUID uuid = ajvnVar.a;
        enrrVar.t("Restore completed - scheduling incremental reverse sync [%s]", uuid);
        this.b.a(uuid);
        ensk h2 = enruVar.h();
        h2.Y(ente.a, "BugleBackup");
        ((enrr) h2.h("com/google/android/apps/messaging/restore/listeners/ScheduleIncrementalReverseSyncListener", "onRestoreCompleted", 42, "ScheduleIncrementalReverseSyncListener.kt")).t("Scheduled incremental reverse sync [%s]", uuid);
    }
}
