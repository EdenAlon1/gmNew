package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adkr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ adkv b;
    final /* synthetic */ eixn c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adkr(adkv adkvVar, eixn eixnVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = adkvVar;
        this.c = eixnVar;
        this.d = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adkr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                adkv adkvVar = this.b;
                eixn eixnVar = this.c;
                String str = this.d;
                this.a = 1;
                obj = adkvVar.c(eixnVar, str, this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            return (adko) obj;
        } catch (Throwable th) {
            ensk j = adkv.a.j();
            j.Y(ente.a, "BugleGaia");
            ((enrr) ((enrr) j).g(th).h("com/google/android/apps/messaging/gaia/capability/GmsGaiaCapabilityRetriever$hasCapability$2$1", "invokeSuspend", 96, "GmsGaiaCapabilityRetriever.kt")).q("Retrieving capability failed");
            this.b.e(1);
            return adko.FAILED;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new adkr(this.b, this.c, this.d, ffguVar);
    }
}
