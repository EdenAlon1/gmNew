package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akbu implements ajvo {
    private static final enru a = enru.c("com/google/android/apps/messaging/restore/listeners/ConversationRefreshListener");
    private final ffbr b;

    public akbu(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.b = ffbrVar;
    }

    @Override // defpackage.ajvo
    public final ekzz a() {
        return eleg.f("ConversationRefreshListener::onRestoreCompleted");
    }

    @Override // defpackage.ajvo
    public final void b(ajvn ajvnVar) {
        enru enruVar = a;
        ensk h = enruVar.h();
        h.Y(ente.a, "BugleBackup");
        enrr enrrVar = (enrr) h.h("com/google/android/apps/messaging/restore/listeners/ConversationRefreshListener", "onRestoreCompleted", 46, "ConversationRefreshListener.kt");
        UUID uuid = ajvnVar.a;
        enrrVar.t("Restore completed - scheduling conversation metadata refresh [%s]", uuid);
        akdc akdcVar = (akdc) this.b.b();
        ensz enszVar = (ensz) akdc.a.h();
        UUID uuid2 = ajvnVar.a;
        enszVar.t("Queueing work to refresh conversations [%s]", uuid2);
        akcj akcjVar = (akcj) akcv.a.createBuilder();
        akcjVar.getClass();
        akcw.c(cqjf.a(uuid2), akcjVar);
        akcr akcrVar = (akcr) akcs.a.createBuilder();
        akcrVar.getClass();
        eyfy build = akcrVar.build();
        build.getClass();
        akcjVar.copyOnWrite();
        akcv akcvVar = (akcv) akcjVar.instance;
        akcvVar.d = (akcs) build;
        akcvVar.c = 7;
        akdcVar.a(akcw.a(akcjVar));
        ensk h2 = enruVar.h();
        h2.Y(ente.a, "BugleBackup");
        ((enrr) h2.h("com/google/android/apps/messaging/restore/listeners/ConversationRefreshListener", "onRestoreCompleted", 48, "ConversationRefreshListener.kt")).t("Scheduled conversation metadata refresh [%s]", uuid);
    }
}
