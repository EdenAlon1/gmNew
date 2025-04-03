package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akay extends ffhv implements ffjm {
    int a;
    final /* synthetic */ UUID b;
    final /* synthetic */ akbo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akay(UUID uuid, akbo akboVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = uuid;
        this.c = akboVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akay) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ensk e = akbo.a.e();
            e.Y(ente.a, "BugleBackup");
            ((enrr) e.h("com/google/android/apps/messaging/restore/impl/RestoreAnytimeCompatibleRestoreWorkflowSteps$getOrUpdateLastAttachmentRequestTimestamp$2$1", "invokeSuspend", 634, "RestoreAnytimeCompatibleRestoreWorkflowSteps.kt")).t("Updating last attachment timestamp for session [%s]", this.b);
            ajyr ajyrVar = (ajyr) this.c.b.b();
            UUID uuid = this.b;
            this.a = 1;
            if (ajyrVar.z(uuid) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new akay(this.b, this.c, ffguVar);
    }
}
