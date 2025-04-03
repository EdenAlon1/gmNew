package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sqs extends ffhv implements ffjm {
    final /* synthetic */ sqv a;
    final /* synthetic */ eqom b;
    final /* synthetic */ UUID c;
    final /* synthetic */ dfkd d;
    final /* synthetic */ boolean e;
    final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sqs(sqv sqvVar, int i, eqom eqomVar, UUID uuid, dfkd dfkdVar, boolean z, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = sqvVar;
        this.f = i;
        this.b = eqomVar;
        this.c = uuid;
        this.d = dfkdVar;
        this.e = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sqs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((enrr) sqv.a.h().h("com/google/android/apps/messaging/backup/analytics/D2DEventLogger$logFailureEvent$1", "invokeSuspend", 178, "D2DEventLogger.kt")).q("Logging D2D failure event to clearcut.");
        eqof eqofVar = (eqof) eqoh.a.createBuilder();
        eqofVar.getClass();
        eqoc.d(this.f, eqofVar);
        eqoc.b(sqv.c(0, 0, 0), eqofVar);
        eqok eqokVar = (eqok) eqon.a.createBuilder();
        eqokVar.getClass();
        eqokVar.copyOnWrite();
        eqon eqonVar = (eqon) eqokVar.instance;
        eqonVar.c = this.b.z;
        eqonVar.b |= 1;
        eyfy build = eqokVar.build();
        build.getClass();
        eqofVar.copyOnWrite();
        eqoh eqohVar = (eqoh) eqofVar.instance;
        eqohVar.d = (eqon) build;
        eqohVar.c = 6;
        eyfq builder = eqoc.a(eqofVar).toBuilder();
        builder.getClass();
        UUID uuid = this.c;
        if (uuid != null) {
            eqof eqofVar2 = (eqof) builder;
            eyee a = cqjf.a(uuid);
            eqofVar2.copyOnWrite();
            eqoh eqohVar2 = (eqoh) eqofVar2.instance;
            eqohVar2.b |= 2;
            eqohVar2.f = a;
        }
        dfkd dfkdVar = this.d;
        if (dfkdVar != null) {
            eqof eqofVar3 = (eqof) builder;
            eqofVar3.copyOnWrite();
            eqoh eqohVar3 = (eqoh) eqofVar3.instance;
            eqohVar3.h = dfkdVar.a();
            eqohVar3.b |= 8;
        }
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoluVar.getClass();
        eogy.g(eolt.D2D_BACKUP_AND_RESTORE_EVENT, eoluVar);
        eogy.f((eqoh) ((eqof) builder).build(), eoluVar);
        eyfq builder2 = eogy.a(eoluVar).toBuilder();
        builder2.getClass();
        akxn a2 = ((akyb) this.a.a(this.e).b()).a();
        a2.d(epyw.D2D_BACKUP_AND_RESTORE_EVENT);
        a2.j((eolu) builder2, alal.LOG_SPEC_D2D_BACKUP_AND_RESTORE_EVENTS);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new sqs(this.a, this.f, this.b, this.c, this.d, this.e, ffguVar);
    }
}
