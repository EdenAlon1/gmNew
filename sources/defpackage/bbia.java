package defpackage;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbia extends ffhv implements ffjm {
    final /* synthetic */ bbic a;
    final /* synthetic */ UUID b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbia(bbic bbicVar, int i, UUID uuid, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = bbicVar;
        this.c = i;
        this.b = uuid;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bbia) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ensk h = bbic.a.h();
        h.Y(ente.a, "BugleBackup");
        enrr enrrVar = (enrr) h;
        enrrVar.W(10, TimeUnit.SECONDS);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/backup/analytics/BackupEventLogger$logFailedEvent$1", "invokeSuspend", 179, "BackupEventLogger.kt")).t("Logging backup failed event to clearcut: %s", "DATABASE_BACKUP");
        epok epokVar = (epok) epol.a.createBuilder();
        epokVar.getClass();
        epoh.c(epokVar);
        epoq epoqVar = (epoq) epos.a.createBuilder();
        epoqVar.getClass();
        epoqVar.copyOnWrite();
        epos eposVar = (epos) epoqVar.instance;
        eposVar.c = this.c - 1;
        eposVar.b |= 1;
        eyfy build = epoqVar.build();
        build.getClass();
        epokVar.copyOnWrite();
        epol epolVar = (epol) epokVar.instance;
        epolVar.d = (epos) build;
        epolVar.c = 7;
        UUID uuid = this.b;
        if (uuid != null) {
            epoh.b(cqjf.a(uuid), epokVar);
        }
        epol a = epoh.a(epokVar);
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoluVar.getClass();
        eogy.g(eolt.BACKUP_WORKFLOW_EVENT, eoluVar);
        eogy.b(a, eoluVar);
        eyfq builder = eogy.a(eoluVar).toBuilder();
        builder.getClass();
        this.a.a((eolu) builder, false);
        ensk h2 = bbic.a.h();
        h2.Y(ente.a, "BugleBackup");
        enrr enrrVar2 = (enrr) h2;
        enrrVar2.W(10, TimeUnit.SECONDS);
        ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/datamodel/backup/analytics/BackupEventLogger$logFailedEvent$1", "invokeSuspend", 194, "BackupEventLogger.kt")).t("Logged backup failed event to clearcut: %s", "DATABASE_BACKUP");
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bbia(this.a, this.c, this.b, ffguVar);
    }
}
