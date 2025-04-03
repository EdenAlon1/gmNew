package defpackage;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajyy extends ffhv implements ffjm {
    final /* synthetic */ ajza a;
    final /* synthetic */ eqza b;
    final /* synthetic */ akdb c;
    final /* synthetic */ eqys d;
    final /* synthetic */ UUID e;
    final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajyy(ajza ajzaVar, eqza eqzaVar, int i, akdb akdbVar, eqys eqysVar, UUID uuid, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ajzaVar;
        this.b = eqzaVar;
        this.f = i;
        this.c = akdbVar;
        this.d = eqysVar;
        this.e = uuid;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajyy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ensk h = ajza.a.h();
        h.Y(ente.a, "BugleBackup");
        enrr enrrVar = (enrr) h;
        enrrVar.W(10, TimeUnit.SECONDS);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/restore/analytics/RestoreEventLogger$logProcessFailedEvent$1", "invokeSuspend", 213, "RestoreEventLogger.kt")).q("Logging restore failed event to clearcut");
        eqyy eqyyVar = (eqyy) eqzb.a.createBuilder();
        eqyyVar.getClass();
        eqyo.b(this.b, eqyyVar);
        eqyo.c(this.c, eqyyVar);
        eqze eqzeVar = (eqze) eqzg.a.createBuilder();
        eqzeVar.getClass();
        eqzeVar.copyOnWrite();
        eqzg eqzgVar = (eqzg) eqzeVar.instance;
        eqzgVar.c = this.f - 1;
        eqzgVar.b |= 1;
        eqys eqysVar = this.d;
        if (eqysVar != null) {
            eqzeVar.copyOnWrite();
            eqzg eqzgVar2 = (eqzg) eqzeVar.instance;
            eqzgVar2.d = eqysVar;
            eqzgVar2.b |= 2;
        }
        eyfy build = eqzeVar.build();
        build.getClass();
        eqyyVar.copyOnWrite();
        eqzb eqzbVar = (eqzb) eqyyVar.instance;
        eqzbVar.d = (eqzg) build;
        eqzbVar.c = 6;
        eyfq builder = eqyo.a(eqyyVar).toBuilder();
        builder.getClass();
        UUID uuid = this.e;
        eqyy eqyyVar2 = (eqyy) builder;
        if (uuid != null) {
            eyee a = cqjf.a(uuid);
            eqyyVar2.copyOnWrite();
            eqzb eqzbVar2 = (eqzb) eqyyVar2.instance;
            eqzbVar2.b |= 2;
            eqzbVar2.f = a;
        }
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoluVar.getClass();
        eogy.g(eolt.RESTORE_WORKFLOW_EVENT, eoluVar);
        eogy.h((eqzb) eqyyVar2.build(), eoluVar);
        eyfq builder2 = eogy.a(eoluVar).toBuilder();
        builder2.getClass();
        akxn a2 = ((akyb) this.a.a(false).b()).a();
        a2.d(epyw.RESTORE_WORKFLOW_EVENT);
        a2.j((eolu) builder2, alal.LOG_SPEC_RESTORE_WORKFLOW_EVENTS);
        ensk h2 = ajza.a.h();
        h2.Y(ente.a, "BugleBackup");
        enrr enrrVar2 = (enrr) h2;
        enrrVar2.W(10, TimeUnit.SECONDS);
        ((enrr) enrrVar2.h("com/google/android/apps/messaging/restore/analytics/RestoreEventLogger$logProcessFailedEvent$1", "invokeSuspend", 235, "RestoreEventLogger.kt")).q("Logged restore failed event to clearcut");
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ajyy(this.a, this.b, this.f, this.c, this.d, this.e, ffguVar);
    }
}
