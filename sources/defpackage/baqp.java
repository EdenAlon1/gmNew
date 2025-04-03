package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baqp extends ffhv implements ffjm {
    final /* synthetic */ bara a;
    final /* synthetic */ cpbd b;
    final /* synthetic */ byyt c;
    final /* synthetic */ int d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baqp(ffgu ffguVar, bara baraVar, cpbd cpbdVar, byyt byytVar, int i) {
        super(2, ffguVar);
        this.a = baraVar;
        this.b = cpbdVar;
        this.c = byytVar;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((baqp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return ((bdgb) this.a.i.b()).b(this.b, this.c, this.d);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        baqp baqpVar = new baqp(ffguVar, this.a, this.b, this.c, this.d);
        baqpVar.e = obj;
        return baqpVar;
    }
}
