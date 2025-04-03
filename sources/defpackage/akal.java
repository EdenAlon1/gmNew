package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akal extends ffhv implements ffjm {
    final /* synthetic */ akbo a;
    final /* synthetic */ UUID b;
    final /* synthetic */ akci c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akal(ffgu ffguVar, akbo akboVar, UUID uuid, akci akciVar) {
        super(2, ffguVar);
        this.a = akboVar;
        this.b = uuid;
        this.c = akciVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akal) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ensk h = akbo.a.h();
        h.Y(ente.a, "BugleBackup");
        ((enrr) h.h("com/google/android/apps/messaging/restore/impl/RestoreAnytimeCompatibleRestoreWorkflowSteps$completeRestore$lambda$9$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 277, "RestoreAnytimeCompatibleRestoreWorkflowSteps.kt")).w("Requested restore completed: workflowVersion: [%s] sessionId: [%s]", 5, this.b);
        ((akdc) this.a.c.b()).b(this.b, 5);
        ((akdc) this.a.c.b()).e(this.b);
        ((akdc) this.a.c.b()).d(this.b, this.c);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        akal akalVar = new akal(ffguVar, this.a, this.b, this.c);
        akalVar.d = obj;
        return akalVar;
    }
}
