package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cevs extends ffhv implements ffjm {
    final /* synthetic */ cevt a;
    final /* synthetic */ ceyr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cevs(cevt cevtVar, ceyr ceyrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cevtVar;
        this.b = ceyrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cevs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        engw r = engw.r(this.b);
        r.getClass();
        Object obj2 = this.a.d(r).get(this.b);
        obj2.getClass();
        return obj2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cevs(this.a, this.b, ffguVar);
    }
}
