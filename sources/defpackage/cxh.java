package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cxh extends ffhv implements ffji {
    final /* synthetic */ cxj a;
    final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxh(cxj cxjVar, Object obj, ffgu ffguVar) {
        super(1, ffguVar);
        this.a = cxjVar;
        this.b = obj;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.g();
        cxj cxjVar = this.a;
        Object obj2 = this.b;
        cxv cxvVar = cxjVar.b;
        Object b = cxjVar.b(obj2);
        cxvVar.c(b);
        this.a.i(b);
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cxh(this.a, this.b, (ffgu) obj).b(ffcu.a);
    }
}
