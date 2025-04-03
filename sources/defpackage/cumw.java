package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cumw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cumx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cumw(cumx cumxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cumxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cumw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            if (!((Boolean) cumo.a.e()).booleanValue()) {
                ensk e = cumx.a.e();
                e.Y(ente.a, "BugleSpam");
                ((enrr) e.h("com/google/android/apps/messaging/shared/util/spam/fuzzymatching/TemplateFetcherSynclet$sync$1", "invokeSuspend", 43, "TemplateFetcherSynclet.kt")).q("skipping due to feature flag");
                return ffcu.a;
            }
            cumx cumxVar = this.b;
            this.a = 1;
            if (cumxVar.b(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cumw(this.b, ffguVar);
    }
}
