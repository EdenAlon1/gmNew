package defpackage;

import j$.time.Duration;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbhz extends ffhv implements ffjm {
    final /* synthetic */ bbic a;
    final /* synthetic */ Duration b;
    final /* synthetic */ UUID c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbhz(bbic bbicVar, Duration duration, UUID uuid, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = bbicVar;
        this.b = duration;
        this.c = uuid;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bbhz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        epon a;
        ffci.b(obj);
        ensk h = bbic.a.h();
        h.Y(ente.a, "BugleBackup");
        enrr enrrVar = (enrr) h;
        enrrVar.W(10, TimeUnit.SECONDS);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/backup/analytics/BackupEventLogger$logCompleteEvent$1", "invokeSuspend", 108, "BackupEventLogger.kt")).t("Logging backup complete event to clearcut: %s", "DATABASE_BACKUP");
        epok epokVar = (epok) epol.a.createBuilder();
        epokVar.getClass();
        epoh.c(epokVar);
        epoo epooVar = (epoo) epop.a.createBuilder();
        epooVar.getClass();
        Duration duration = this.b;
        eyev a2 = eykn.a(duration);
        epooVar.copyOnWrite();
        epop epopVar = (epop) epooVar.instance;
        epopVar.c = a2;
        epopVar.b |= 1;
        eyfy build = epooVar.build();
        build.getClass();
        epokVar.copyOnWrite();
        epol epolVar = (epol) epokVar.instance;
        epolVar.d = (epop) build;
        epolVar.c = 6;
        UUID uuid = this.c;
        if (uuid != null) {
            epoh.b(cqjf.a(uuid), epokVar);
        }
        if (!duration.isZero()) {
            if (duration.toMillis() == 0) {
                epom epomVar = (epom) epon.a.createBuilder();
                epomVar.getClass();
                a = epoi.a(epomVar);
            } else {
                int i = this.d;
                epom epomVar2 = (epom) epon.a.createBuilder();
                epomVar2.getClass();
                int b = bbic.b(i, duration);
                epomVar2.copyOnWrite();
                epon eponVar = (epon) epomVar2.instance;
                eponVar.b |= 1;
                eponVar.c = b;
                int b2 = bbic.b(0, duration);
                epomVar2.copyOnWrite();
                epon eponVar2 = (epon) epomVar2.instance;
                eponVar2.b |= 2;
                eponVar2.d = b2;
                a = epoi.a(epomVar2);
            }
            epokVar.copyOnWrite();
            epol epolVar2 = (epol) epokVar.instance;
            epolVar2.g = a;
            epolVar2.b |= 8;
        }
        epol a3 = epoh.a(epokVar);
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoluVar.getClass();
        eogy.g(eolt.BACKUP_WORKFLOW_EVENT, eoluVar);
        eogy.b(a3, eoluVar);
        eyfq builder = eogy.a(eoluVar).toBuilder();
        builder.getClass();
        this.a.a((eolu) builder, true);
        ensk h2 = bbic.a.h();
        h2.Y(ente.a, "BugleBackup");
        enrr enrrVar2 = (enrr) h2;
        enrrVar2.W(10, TimeUnit.SECONDS);
        ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/datamodel/backup/analytics/BackupEventLogger$logCompleteEvent$1", "invokeSuspend", 124, "BackupEventLogger.kt")).t("Logged backup complete event to clearcut: %s", "DATABASE_BACKUP");
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bbhz(this.a, this.b, this.c, this.d, ffguVar);
    }
}
