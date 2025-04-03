package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpkb extends ffhv implements ffji {
    final /* synthetic */ ffix a;
    final /* synthetic */ ffsk b;
    final /* synthetic */ cxj c;
    final /* synthetic */ cxj d;
    final /* synthetic */ dplw e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpkb(ffix ffixVar, ffsk ffskVar, cxj cxjVar, cxj cxjVar2, dplw dplwVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.a = ffixVar;
        this.b = ffskVar;
        this.c = cxjVar;
        this.d = cxjVar2;
        this.e = dplwVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.invoke();
        ffqy.d(this.b, null, null, new dpjz(this.c, null), 3);
        ffqy.d(this.b, null, null, new dpka(this.d, this.e, null), 3);
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dpkb(this.a, this.b, this.c, this.d, this.e, (ffgu) obj).b(ffcu.a);
    }
}
