package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cxi extends ffhv implements ffji {
    final /* synthetic */ cxj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxi(cxj cxjVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.a = cxjVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.g();
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cxi(this.a, (ffgu) obj).b(ffcu.a);
    }
}
