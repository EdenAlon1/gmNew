package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfii extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ cfim c;
    final /* synthetic */ String d;
    final /* synthetic */ Runnable e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfii(cfim cfimVar, String str, Runnable runnable, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = cfimVar;
        this.d = str;
        this.e = runnable;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfii) c((cfir) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cfir cfirVar = (cfir) this.b;
        cfim cfimVar = this.c;
        String str = this.d;
        Runnable runnable = this.e;
        this.a = 1;
        Object f = cfimVar.a.f(str, cfirVar, runnable, this);
        return f == ffhhVar ? ffhhVar : f;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cfii cfiiVar = new cfii(this.c, this.d, this.e, ffguVar);
        cfiiVar.b = obj;
        return cfiiVar;
    }
}
