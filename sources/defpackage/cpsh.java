package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpsh extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cpsm b;
    final /* synthetic */ fcad c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpsh(ffgu ffguVar, cpsm cpsmVar, fcad fcadVar) {
        super(2, ffguVar);
        this.b = cpsmVar;
        this.c = fcadVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpsh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cpsm cpsmVar = this.b;
        fcad fcadVar = this.c;
        this.a = 1;
        Object t = essz.t(cpsmVar, fcadVar, this);
        return t == ffhhVar ? ffhhVar : t;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cpsh cpshVar = new cpsh(ffguVar, this.b, this.c);
        cpshVar.d = obj;
        return cpshVar;
    }
}
