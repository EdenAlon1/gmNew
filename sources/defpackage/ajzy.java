package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajzy extends ffhv implements ffji {
    int a;
    final /* synthetic */ UUID b;
    final /* synthetic */ akag c;
    final /* synthetic */ akdb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajzy(UUID uuid, akag akagVar, akdb akdbVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = uuid;
        this.c = akagVar;
        this.d = akdbVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ensk h = akag.a.h();
            h.Y(ente.a, "BugleBackup");
            ((enrr) h.h("com/google/android/apps/messaging/restore/impl/BasicRestoreWorkflowSteps$initializeRestore$2", "invokeSuspend", 88, "BasicRestoreWorkflowSteps.kt")).t("Starting new Restore Execution [%s]", this.b);
            akag.l(this.c, eqza.INITIALIZE_RESTORE_WORKFLOW, this.b);
            ajyr ajyrVar = (ajyr) this.c.b.b();
            UUID uuid = this.b;
            akdb akdbVar = this.d;
            this.a = 1;
            if (ajyrVar.r(uuid, akdbVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ajzy(this.b, this.c, this.d, (ffgu) obj).b(ffcu.a);
    }
}
