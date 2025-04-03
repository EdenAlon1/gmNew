package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dphd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dpif b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dphd(dpif dpifVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dpifVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dphd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dpif dpifVar = this.b;
            int intValue = dpifVar.e.c.intValue();
            this.a = 1;
            if (dpifVar.f.a(intValue, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dphd(this.b, ffguVar);
    }
}
