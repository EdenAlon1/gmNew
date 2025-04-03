package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjqv extends ffhv implements ffji {
    int a;
    final /* synthetic */ cjrb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjqv(cjrb cjrbVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = cjrbVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cjrb cjrbVar = this.b;
        this.a = 1;
        Object g = cjrbVar.g(this);
        return g == ffhhVar ? ffhhVar : g;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cjqv(this.b, (ffgu) obj).b(ffcu.a);
    }
}
