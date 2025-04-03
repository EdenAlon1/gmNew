package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dosu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dosk b;
    final /* synthetic */ cxj c;
    final /* synthetic */ cyl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dosu(dosk doskVar, cxj cxjVar, cyl cylVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = doskVar;
        this.c = cxjVar;
        this.d = cylVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dosu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0 && this.b.d) {
            cxj cxjVar = this.c;
            Float f = new Float(1.0f);
            cyz d = cxu.d(this.d, 2, 0L, 4);
            this.a = 1;
            if (cxj.j(cxjVar, f, d, null, this, 12) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dosu(this.b, this.c, this.d, ffguVar);
    }
}
