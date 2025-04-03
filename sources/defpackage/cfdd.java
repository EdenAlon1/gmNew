package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfdd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cfdp b;
    final /* synthetic */ ceze c;
    final /* synthetic */ ceve d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfdd(ffgu ffguVar, cfdp cfdpVar, ceze cezeVar, ceve ceveVar) {
        super(2, ffguVar);
        this.b = cfdpVar;
        this.c = cezeVar;
        this.d = ceveVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfdd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cfdp cfdpVar = this.b;
            ceze cezeVar = this.c;
            ceve ceveVar = this.d;
            ceveVar.getClass();
            this.a = 1;
            if (cfdpVar.g(cezeVar, ceveVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cfdd cfddVar = new cfdd(ffguVar, this.b, this.c, this.d);
        cfddVar.e = obj;
        return cfddVar;
    }
}
