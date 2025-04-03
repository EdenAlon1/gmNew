package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpjo extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cxj b;
    final /* synthetic */ hho c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpjo(cxj cxjVar, hho hhoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cxjVar;
        this.c = hhoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpjo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cxj cxjVar = this.b;
            Float f = new Float(true != dpkz.f(this.c) ? 1.0f : 0.0f);
            dbu c = cxu.c(300, 0, cyp.d, 2);
            this.a = 1;
            if (cxj.j(cxjVar, f, c, null, this, 12) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpjo(this.b, this.c, ffguVar);
    }
}
