package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjqu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjrb b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjqu(ffgu ffguVar, cjrb cjrbVar) {
        super(2, ffguVar);
        this.b = cjrbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjqu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        Object f = cjrbVar.f(this);
        return f == ffhhVar ? ffhhVar : f;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cjqu cjquVar = new cjqu(ffguVar, this.b);
        cjquVar.c = obj;
        return cjquVar;
    }
}
