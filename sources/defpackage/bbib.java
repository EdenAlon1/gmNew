package defpackage;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbib extends ffhv implements ffjm {
    final /* synthetic */ bbic a;
    final /* synthetic */ UUID b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbib(bbic bbicVar, UUID uuid, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = bbicVar;
        this.b = uuid;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bbib) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ensk h = bbic.a.h();
        h.Y(ente.a, "BugleBackup");
        enrr enrrVar = (enrr) h;
        enrrVar.W(10, TimeUnit.SECONDS);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/backup/analytics/BackupEventLogger$logStartEvent$1", "invokeSuspend", 59, "BackupEventLogger.kt")).t("Logging backup start event to clearcut: %s", "DATABASE_BACKUP");
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoluVar.getClass();
        eogy.g(eolt.BACKUP_WORKFLOW_EVENT, eoluVar);
        epok epokVar = (epok) epol.a.createBuilder();
        epokVar.getClass();
        epoh.c(epokVar);
        UUID uuid = this.b;
        if (uuid != null) {
            epoh.b(cqjf.a(uuid), epokVar);
        }
        epot epotVar = (epot) epou.a.createBuilder();
        epotVar.getClass();
        eyfy build = epotVar.build();
        build.getClass();
        epokVar.copyOnWrite();
        epol epolVar = (epol) epokVar.instance;
        epolVar.d = (epou) build;
        epolVar.c = 5;
        eogy.b(epoh.a(epokVar), eoluVar);
        eyfq builder = eogy.a(eoluVar).toBuilder();
        builder.getClass();
        this.a.a((eolu) builder, false);
        ensk h2 = bbic.a.h();
        h2.Y(ente.a, "BugleBackup");
        enrr enrrVar2 = (enrr) h2;
        enrrVar2.W(10, TimeUnit.SECONDS);
        ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/datamodel/backup/analytics/BackupEventLogger$logStartEvent$1", "invokeSuspend", 72, "BackupEventLogger.kt")).t("Logged backup start event to clearcut: %s", "DATABASE_BACKUP");
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bbib(this.a, this.b, ffguVar);
    }
}
