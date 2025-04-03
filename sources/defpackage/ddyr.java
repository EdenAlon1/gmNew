package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddyr extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ ffji c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddyr(ffji ffjiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ddyr) c((hij) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        Exception e;
        Object ddynVar;
        Object obj3;
        Object obj4;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            Object obj5 = this.a;
            obj2 = (hij) this.d;
            try {
                ffci.b(obj);
                obj4 = obj5;
            } catch (Exception e2) {
                e = e2;
                ddynVar = new ddyn(e);
                obj3 = obj2;
                ((hij) obj3).b(ddynVar);
                return ffcu.a;
            }
        } else {
            ffci.b(obj);
            Object obj6 = (hij) this.d;
            try {
                ffji ffjiVar = this.c;
                this.d = obj6;
                this.a = obj6;
                this.b = 1;
                Object invoke = ffjiVar.invoke(this);
                if (invoke == ffhhVar) {
                    return ffhhVar;
                }
                Object obj7 = obj6;
                obj = invoke;
                obj2 = obj7;
                obj4 = obj7;
            } catch (Exception e3) {
                obj2 = obj6;
                e = e3;
                ddynVar = new ddyn(e);
                obj3 = obj2;
                ((hij) obj3).b(ddynVar);
                return ffcu.a;
            }
        }
        ddynVar = new ddyp(obj);
        obj3 = obj4;
        ((hij) obj3).b(ddynVar);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ddyr ddyrVar = new ddyr(this.c, ffguVar);
        ddyrVar.d = obj;
        return ddyrVar;
    }
}
