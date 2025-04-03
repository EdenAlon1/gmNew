package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmgb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ djrm b;
    final /* synthetic */ cmgg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmgb(djrm djrmVar, cmgg cmggVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = djrmVar;
        this.c = cmggVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmgb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return null;
        }
        ((enrr) cmgg.a.e().h("com/google/android/apps/messaging/shared/rcsdata/carriertos/CarrierTosDataServiceImpl$resetCarrierTosConsentForRcsProvisioningIdFuture$1", "invokeSuspend", 337, "CarrierTosDataServiceImpl.kt")).t("Resetting explicit carrier tos consent for simId: %s", cmfq.a(this.b));
        cmgg cmggVar = this.c;
        djrm djrmVar = this.b;
        this.a = 1;
        if (cmggVar.o(djrmVar, this) == ffhhVar) {
            return ffhhVar;
        }
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cmgb(this.b, this.c, ffguVar);
    }
}
