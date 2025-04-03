package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sqt extends ffhv implements ffjm {
    final /* synthetic */ sqv a;
    final /* synthetic */ UUID b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sqt(sqv sqvVar, UUID uuid, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = sqvVar;
        this.b = uuid;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sqt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((enrr) sqv.a.h().h("com/google/android/apps/messaging/backup/analytics/D2DEventLogger$logStartEvent$1", "invokeSuspend", 52, "D2DEventLogger.kt")).q("Logging D2D start event to clearcut.");
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoluVar.getClass();
        eogy.g(eolt.D2D_BACKUP_AND_RESTORE_EVENT, eoluVar);
        eqof eqofVar = (eqof) eqoh.a.createBuilder();
        eqofVar.getClass();
        eqoc.d(2, eqofVar);
        eqoc.c(sqv.b(this.b), eqofVar);
        eqoc.b(sqv.c(0, 0, 0), eqofVar);
        eqoo eqooVar = (eqoo) eqop.a.createBuilder();
        eqooVar.getClass();
        eyfy build = eqooVar.build();
        build.getClass();
        eqofVar.copyOnWrite();
        eqoh eqohVar = (eqoh) eqofVar.instance;
        eqohVar.d = (eqop) build;
        eqohVar.c = 4;
        eogy.f(eqoc.a(eqofVar), eoluVar);
        eyfq builder = eogy.a(eoluVar).toBuilder();
        builder.getClass();
        akxn a = ((akyb) this.a.a(true).b()).a();
        a.d(epyw.D2D_BACKUP_AND_RESTORE_EVENT);
        a.j((eolu) builder, alal.LOG_SPEC_D2D_BACKUP_AND_RESTORE_EVENTS);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new sqt(this.a, this.b, ffguVar);
    }
}
