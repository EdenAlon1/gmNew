package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xtu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ xuk b;
    final /* synthetic */ xhu c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xtu(ffgu ffguVar, xuk xukVar, xhu xhuVar) {
        super(2, ffguVar);
        this.b = xukVar;
        this.c = xhuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xtu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        xuk xukVar = this.b;
        xhu xhuVar = this.c;
        xih a = xukVar.a();
        this.a = 1;
        Object c = a.c(xhuVar, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        xtu xtuVar = new xtu(ffguVar, this.b, this.c);
        xtuVar.d = obj;
        return xtuVar;
    }
}
