package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjlc extends ffhv implements ffji {
    int a;
    final /* synthetic */ cjld b;
    final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjlc(cjld cjldVar, Object obj, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = cjldVar;
        this.c = obj;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cjld cjldVar = this.b;
        Object obj2 = this.c;
        this.a = 1;
        Object b = cjldVar.a.b(obj2, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cjlc(this.b, this.c, (ffgu) obj).b(ffcu.a);
    }
}
