package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpsi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cpsm b;
    final /* synthetic */ fcal c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpsi(ffgu ffguVar, cpsm cpsmVar, fcal fcalVar) {
        super(2, ffguVar);
        this.b = cpsmVar;
        this.c = fcalVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpsi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        fcal fcalVar = this.c;
        this.a = 1;
        Object u = essz.u(cpsmVar, fcalVar, this);
        return u == ffhhVar ? ffhhVar : u;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cpsi cpsiVar = new cpsi(ffguVar, this.b, this.c);
        cpsiVar.d = obj;
        return cpsiVar;
    }
}
