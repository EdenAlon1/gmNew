package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cexq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ceyc b;
    final /* synthetic */ cexh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cexq(ceyc ceycVar, cexh cexhVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ceycVar;
        this.c = cexhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cexq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ceyc ceycVar = this.b;
        cexh cexhVar = this.c;
        this.a = 1;
        Object a = ffra.a(ekxi.a(ceycVar.d.hT()), new cexp(null, cexhVar, ceycVar), this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cexq(this.b, this.c, ffguVar);
    }
}
