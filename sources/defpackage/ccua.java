package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccua extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ccub b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccua(ccub ccubVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ccubVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccua) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                ccub ccubVar = this.b;
                this.a = 1;
                if (ccubVar.d(this) == ffhhVar) {
                    return ffhhVar;
                }
            }
        } catch (Exception e) {
            ensk j = ccub.a.j();
            j.Y(ente.a, "BugleCms");
            ((enrr) ((enrr) j).g(e).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsZeroKeyRecoveryHelper$updateZeroKeyMessagesInCmsAsync$1", "invokeSuspend", 77, "CmsZeroKeyRecoveryHelper.kt")).q("Failed to re-encrypt and update messages.");
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ccua(this.b, ffguVar);
    }
}
