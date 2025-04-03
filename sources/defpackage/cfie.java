package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfie extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cfim b;
    final /* synthetic */ String c;
    final /* synthetic */ Runnable d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfie(ffgu ffguVar, cfim cfimVar, String str, Runnable runnable) {
        super(2, ffguVar);
        this.b = cfimVar;
        this.c = str;
        this.d = runnable;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfie) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cfim cfimVar = this.b;
        String str = this.c;
        Runnable runnable = this.d;
        this.a = 1;
        Object f = cfimVar.f(str, runnable, this);
        return f == ffhhVar ? ffhhVar : f;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cfie cfieVar = new cfie(ffguVar, this.b, this.c, this.d);
        cfieVar.e = obj;
        return cfieVar;
    }
}
