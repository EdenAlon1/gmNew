package defpackage;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajyz extends ffhv implements ffjm {
    final /* synthetic */ ajza a;
    final /* synthetic */ boolean b;
    final /* synthetic */ eqza c;
    final /* synthetic */ UUID d;
    final /* synthetic */ akdb e;
    final /* synthetic */ Integer f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajyz(ajza ajzaVar, boolean z, eqza eqzaVar, UUID uuid, akdb akdbVar, Integer num, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ajzaVar;
        this.b = z;
        this.c = eqzaVar;
        this.d = uuid;
        this.e = akdbVar;
        this.f = num;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajyz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ensk h = ajza.a.h();
        h.Y(ente.a, "BugleBackup");
        enrr enrrVar = (enrr) h;
        enrrVar.W(10, TimeUnit.SECONDS);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/restore/analytics/RestoreEventLogger$logStartEvent$1", "invokeSuspend", 63, "RestoreEventLogger.kt")).q("Logging restore start event to clearcut");
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoluVar.getClass();
        eogy.g(eolt.RESTORE_WORKFLOW_EVENT, eoluVar);
        eqyy eqyyVar = (eqyy) eqzb.a.createBuilder();
        eqyyVar.getClass();
        eqyo.b(this.c, eqyyVar);
        eqyo.d(cqjf.a(this.d), eqyyVar);
        eqyo.c(this.e, eqyyVar);
        Integer num = this.f;
        if (num != null) {
            int intValue = num.intValue();
            eqyyVar.copyOnWrite();
            eqzb eqzbVar = (eqzb) eqyyVar.instance;
            eqzbVar.b |= 16;
            eqzbVar.i = intValue;
        }
        eqzh eqzhVar = (eqzh) eqzi.a.createBuilder();
        eqzhVar.getClass();
        eyfy build = eqzhVar.build();
        build.getClass();
        eqyyVar.copyOnWrite();
        eqzb eqzbVar2 = (eqzb) eqyyVar.instance;
        eqzbVar2.d = (eqzi) build;
        eqzbVar2.c = 4;
        eogy.h(eqyo.a(eqyyVar), eoluVar);
        eyfq builder = eogy.a(eoluVar).toBuilder();
        builder.getClass();
        akxn a = ((akyb) this.a.a(this.b).b()).a();
        a.d(epyw.RESTORE_WORKFLOW_EVENT);
        a.j((eolu) builder, alal.LOG_SPEC_RESTORE_WORKFLOW_EVENTS);
        ensk h2 = ajza.a.h();
        h2.Y(ente.a, "BugleBackup");
        enrr enrrVar2 = (enrr) h2;
        enrrVar2.W(10, TimeUnit.SECONDS);
        ((enrr) enrrVar2.h("com/google/android/apps/messaging/restore/analytics/RestoreEventLogger$logStartEvent$1", "invokeSuspend", 80, "RestoreEventLogger.kt")).t("Logging restore start event to clearcut: %s", this.c);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ajyz(this.a, this.b, this.c, this.d, this.e, this.f, ffguVar);
    }
}
