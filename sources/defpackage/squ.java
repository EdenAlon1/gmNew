package defpackage;

import j$.time.Duration;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class squ extends ffhv implements ffjm {
    final /* synthetic */ sqv a;
    final /* synthetic */ Duration b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ UUID f;
    final /* synthetic */ dfkd g;
    final /* synthetic */ boolean h;
    final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public squ(sqv sqvVar, int i, Duration duration, int i2, int i3, int i4, UUID uuid, dfkd dfkdVar, boolean z, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = sqvVar;
        this.i = i;
        this.b = duration;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = uuid;
        this.g = dfkdVar;
        this.h = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((squ) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((enrr) sqv.a.h().h("com/google/android/apps/messaging/backup/analytics/D2DEventLogger$logSuccessEvent$1", "invokeSuspend", 107, "D2DEventLogger.kt")).q("Logging D2D success event to clearcut.");
        eyev a = eykn.a(this.b);
        eqof eqofVar = (eqof) eqoh.a.createBuilder();
        eqofVar.getClass();
        eqoc.d(this.i, eqofVar);
        UUID uuid = this.f;
        if (uuid != null) {
            eqoc.c(sqv.b(uuid), eqofVar);
        }
        eqoc.b(sqv.c(this.c, this.d, this.e), eqofVar);
        eqoi eqoiVar = (eqoi) eqoj.a.createBuilder();
        eqoiVar.getClass();
        eqoiVar.copyOnWrite();
        eqoj eqojVar = (eqoj) eqoiVar.instance;
        eqojVar.c = a;
        eqojVar.b |= 1;
        eyfy build = eqoiVar.build();
        build.getClass();
        eqofVar.copyOnWrite();
        eqoh eqohVar = (eqoh) eqofVar.instance;
        eqohVar.d = (eqoj) build;
        eqohVar.c = 5;
        eyfq builder = eqoc.a(eqofVar).toBuilder();
        builder.getClass();
        dfkd dfkdVar = this.g;
        eqof eqofVar2 = (eqof) builder;
        if (dfkdVar != null) {
            eqofVar2.copyOnWrite();
            eqoh eqohVar2 = (eqoh) eqofVar2.instance;
            eqohVar2.h = dfkdVar.a();
            eqohVar2.b |= 8;
        }
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoluVar.getClass();
        eogy.g(eolt.D2D_BACKUP_AND_RESTORE_EVENT, eoluVar);
        eogy.f((eqoh) eqofVar2.build(), eoluVar);
        eyfq builder2 = eogy.a(eoluVar).toBuilder();
        builder2.getClass();
        akxn a2 = ((akyb) this.a.a(this.h).b()).a();
        a2.d(epyw.D2D_BACKUP_AND_RESTORE_EVENT);
        a2.j((eolu) builder2, alal.LOG_SPEC_D2D_BACKUP_AND_RESTORE_EVENTS);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new squ(this.a, this.i, this.b, this.c, this.d, this.e, this.f, this.g, this.h, ffguVar);
    }
}
