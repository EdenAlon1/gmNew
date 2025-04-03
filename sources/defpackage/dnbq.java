package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnbq extends ffhv implements ffjm {
    final /* synthetic */ dnbm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnbq(dnbm dnbmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dnbmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnbq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.c().invoke();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dnbq(this.a, ffguVar);
    }
}
