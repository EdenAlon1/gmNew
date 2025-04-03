package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqgv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dqgw b;
    final /* synthetic */ ffji c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqgv(dqgw dqgwVar, ffji ffjiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dqgwVar;
        this.c = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqgv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        dqgw dqgwVar = this.b;
        dqgu dqguVar = new dqgu(this.c, dqgwVar, null);
        this.a = 1;
        Object d = dqgwVar.c.d("InputStreamSizeCalculator.getSizeBytes", dqguVar, this);
        return d == ffhhVar ? ffhhVar : d;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqgv(this.b, this.c, ffguVar);
    }
}
