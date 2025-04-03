package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdfe extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cdfh b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdfe(ffgu ffguVar, cdfh cdfhVar) {
        super(2, ffguVar);
        this.b = cdfhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdfe) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [comc, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        elfl h = this.b.a.e.get().h().h(new emwl() { // from class: axfs
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                axeo axeoVar = ((axez) obj2).t;
                return axeoVar == null ? axeo.a : axeoVar;
            }
        }, erpp.a);
        this.a = 1;
        Object c = fgfz.c(h, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cdfe cdfeVar = new cdfe(ffguVar, this.b);
        cdfeVar.c = obj;
        return cdfeVar;
    }
}
