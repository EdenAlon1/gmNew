package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yyj extends ffhv implements ffjp {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;

    public yyj(ffgu ffguVar) {
        super(5, ffguVar);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        Object obj4 = this.c;
        Object obj5 = this.d;
        return obj3 != null ? obj3 : obj5 == null ? obj4 == null ? obj2 : obj4 : obj5;
    }

    @Override // defpackage.ffjp
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        yyj yyjVar = new yyj((ffgu) obj5);
        yyjVar.a = (doqo) obj;
        yyjVar.b = (doqo) obj2;
        yyjVar.c = (doqo) obj3;
        yyjVar.d = (doqo) obj4;
        return yyjVar.b(ffcu.a);
    }
}
