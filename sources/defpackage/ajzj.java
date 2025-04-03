package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajzj extends ffhv implements ffjm {
    final /* synthetic */ UUID a;
    final /* synthetic */ akag b;
    final /* synthetic */ akci c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajzj(ffgu ffguVar, UUID uuid, akag akagVar, akci akciVar) {
        super(2, ffguVar);
        this.a = uuid;
        this.b = akagVar;
        this.c = akciVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajzj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ensk h = akag.a.h();
        h.Y(ente.a, "BugleBackup");
        ((enrr) h.h("com/google/android/apps/messaging/restore/impl/BasicRestoreWorkflowSteps$completeRestore$lambda$9$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 214, "BasicRestoreWorkflowSteps.kt")).t("Requested restore completed [%s]", this.a);
        ((akdc) this.b.c.b()).b(this.a, 1);
        ((akdc) this.b.c.b()).e(this.a);
        ((akdc) this.b.c.b()).d(this.a, this.c);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ajzj ajzjVar = new ajzj(ffguVar, this.a, this.b, this.c);
        ajzjVar.d = obj;
        return ajzjVar;
    }
}
