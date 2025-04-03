package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpkw extends ffhv implements ffjm {
    final /* synthetic */ cxj a;
    final /* synthetic */ cxj b;
    final /* synthetic */ cxj c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpkw(cxj cxjVar, cxj cxjVar2, cxj cxjVar3, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cxjVar;
        this.b = cxjVar2;
        this.c = cxjVar3;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpkw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ffsk ffskVar = (ffsk) this.d;
        ffqy.d(ffskVar, null, null, new dpkt(this.a, null), 3);
        ffqy.d(ffskVar, null, null, new dpku(this.b, null), 3);
        ffqy.d(ffskVar, null, null, new dpkv(this.c, null), 3);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dpkw dpkwVar = new dpkw(this.a, this.b, this.c, ffguVar);
        dpkwVar.d = obj;
        return dpkwVar;
    }
}
