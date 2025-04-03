package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akbv implements ajvo {
    private static final enru a = enru.c("com/google/android/apps/messaging/restore/listeners/IcingIndexRebuildListener");
    private final ffbr b;

    public akbv(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.b = ffbrVar;
    }

    @Override // defpackage.ajvo
    public final ekzz a() {
        return eleg.f("IcingIndexRebuildListener::onRestoreCompleted");
    }

    @Override // defpackage.ajvo
    public final void b(ajvn ajvnVar) {
        enru enruVar = a;
        ensk h = enruVar.h();
        h.Y(ente.a, "BugleBackup");
        enrr enrrVar = (enrr) h.h("com/google/android/apps/messaging/restore/listeners/IcingIndexRebuildListener", "onRestoreCompleted", 41, "IcingIndexRebuildListener.kt");
        UUID uuid = ajvnVar.a;
        enrrVar.t("Restore completed - scheduling icing index rebuild [%s]", uuid);
        ((cbto) this.b.b()).a();
        ensk h2 = enruVar.h();
        h2.Y(ente.a, "BugleBackup");
        ((enrr) h2.h("com/google/android/apps/messaging/restore/listeners/IcingIndexRebuildListener", "onRestoreCompleted", 43, "IcingIndexRebuildListener.kt")).t("Queued icing index rebuild [%s]", uuid);
    }
}
