package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cplq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cplr b;
    final /* synthetic */ fbzt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cplq(cplr cplrVar, fbzt fbztVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cplrVar;
        this.c = fbztVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cplq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cplr cplrVar = this.b;
        fbzt fbztVar = this.c;
        this.a = 1;
        Object k = cplrVar.k(fbztVar, this);
        return k == ffhhVar ? ffhhVar : k;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cplq(this.b, this.c, ffguVar);
    }
}
