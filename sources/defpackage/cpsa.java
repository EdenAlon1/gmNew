package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpsa extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cpsm b;
    final /* synthetic */ fcgi c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpsa(ffgu ffguVar, cpsm cpsmVar, fcgi fcgiVar) {
        super(2, ffguVar);
        this.b = cpsmVar;
        this.c = fcgiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpsa) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        fcgi fcgiVar = this.c;
        this.a = 1;
        Object m = essz.m(cpsmVar, fcgiVar, this);
        return m == ffhhVar ? ffhhVar : m;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cpsa cpsaVar = new cpsa(ffguVar, this.b, this.c);
        cpsaVar.d = obj;
        return cpsaVar;
    }
}
