package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjwy extends ffhv implements ffji {
    int a;
    final /* synthetic */ cjwz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjwy(cjwz cjwzVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = cjwzVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cjwz cjwzVar = this.b;
        this.a = 1;
        Object a = cjwzVar.a(this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cjwy(this.b, (ffgu) obj).b(ffcu.a);
    }
}
