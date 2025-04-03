package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cprt extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cprv b;
    final /* synthetic */ esqu c;
    final /* synthetic */ Iterable d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cprt(cprv cprvVar, esqu esquVar, Iterable iterable, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cprvVar;
        this.c = esquVar;
        this.d = iterable;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cprt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cprv cprvVar = this.b;
        esqu esquVar = this.c;
        Iterable iterable = this.d;
        this.a = 1;
        Object f = cprvVar.a.f(esquVar, iterable, this);
        return f == ffhhVar ? ffhhVar : f;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cprt(this.b, this.c, this.d, ffguVar);
    }
}
