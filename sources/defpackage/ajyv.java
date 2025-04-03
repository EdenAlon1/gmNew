package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajyv extends ffhv implements ffjm {
    final /* synthetic */ ajyw a;
    final /* synthetic */ eqza b;
    final /* synthetic */ UUID c;
    final /* synthetic */ akdb d;
    final /* synthetic */ eqys e;
    final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajyv(ajyw ajywVar, eqza eqzaVar, UUID uuid, int i, akdb akdbVar, eqys eqysVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ajywVar;
        this.b = eqzaVar;
        this.c = uuid;
        this.f = i;
        this.d = akdbVar;
        this.e = eqysVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajyv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        try {
            ajza ajzaVar = (ajza) this.a.b.b();
            eqza eqzaVar = this.b;
            UUID uuid = this.c;
            axol.k(ajzaVar.b, null, new ajyy(ajzaVar, eqzaVar, this.f, this.d, this.e, uuid, null), 3);
        } catch (Exception e) {
            ensk j = ajyw.a.j();
            j.Y(ente.a, "BugleBackup");
            ((enrr) ((enrr) j).g(e).h("com/google/android/apps/messaging/restore/analytics/BasicRestoreWorkflowStepsEventLoggers$logFailureEvent$1", "invokeSuspend", 148, "BasicRestoreWorkflowStepsEventLoggers.kt")).t("Failed to log failure event for: %s", this.b);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ajyv(this.a, this.b, this.c, this.f, this.d, this.e, ffguVar);
    }
}
