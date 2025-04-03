package defpackage;

import j$.time.Duration;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajyu extends ffhv implements ffjm {
    final /* synthetic */ ajyw a;
    final /* synthetic */ eqza b;
    final /* synthetic */ UUID c;
    final /* synthetic */ Duration d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;
    final /* synthetic */ int g;
    final /* synthetic */ akdb h;
    final /* synthetic */ eqyv i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajyu(ajyw ajywVar, eqza eqzaVar, UUID uuid, Duration duration, int i, int i2, int i3, akdb akdbVar, eqyv eqyvVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ajywVar;
        this.b = eqzaVar;
        this.c = uuid;
        this.d = duration;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = akdbVar;
        this.i = eqyvVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajyu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        try {
            ajza ajzaVar = (ajza) this.a.b.b();
            eqza eqzaVar = this.b;
            UUID uuid = this.c;
            Duration duration = this.d;
            int i = this.e;
            int i2 = this.f;
            int i3 = this.g;
            akdb akdbVar = this.h;
            axol.k(ajzaVar.b, null, new ajyx(ajzaVar, eqzaVar, uuid, duration, i, i2, i3, this.i, akdbVar, null), 3);
        } catch (Exception e) {
            ensk j = ajyw.a.j();
            j.Y(ente.a, "BugleBackup");
            ((enrr) ((enrr) j).g(e).h("com/google/android/apps/messaging/restore/analytics/BasicRestoreWorkflowStepsEventLoggers$logCompleteEvent$1", "invokeSuspend", 115, "BasicRestoreWorkflowStepsEventLoggers.kt")).t("Failed to log complete event for: %s", this.b);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ajyu(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, ffguVar);
    }
}
