package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class clvb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ clvd b;
    final /* synthetic */ clvf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clvb(clvd clvdVar, clvf clvfVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = clvdVar;
        this.c = clvfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((clvb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        clvd clvdVar = this.b;
        clvf clvfVar = this.c;
        this.a = 1;
        Object k = clvdVar.k(clvfVar, this);
        return k == ffhhVar ? ffhhVar : k;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new clvb(this.b, this.c, ffguVar);
    }
}
