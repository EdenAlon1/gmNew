package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cgxc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cgxd b;
    final /* synthetic */ esof c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgxc(cgxd cgxdVar, esof esofVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cgxdVar;
        this.c = esofVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgxc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cgxd cgxdVar = this.b;
        esof esofVar = this.c;
        this.a = 1;
        Object b = cgxdVar.b(esofVar, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cgxc(this.b, this.c, ffguVar);
    }
}
