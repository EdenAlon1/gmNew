package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaur extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aaus b;
    final /* synthetic */ dnmw c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaur(aaus aausVar, dnmw dnmwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aausVar;
        this.c = dnmwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aaur) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffsk ffskVar = (ffsk) this.d;
            aaus aausVar = this.b;
            aauq aauqVar = new aauq(this.c, aausVar, ffskVar, null);
            this.a = 1;
            if (ffyk.b(aausVar.a, aauqVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aaur aaurVar = new aaur(this.b, this.c, ffguVar);
        aaurVar.d = obj;
        return aaurVar;
    }
}
