package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfdm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cfdp b;
    final /* synthetic */ ceze c;
    final /* synthetic */ ceve d;
    final /* synthetic */ ffrp e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfdm(ffgu ffguVar, cfdp cfdpVar, ceze cezeVar, ceve ceveVar, ffrp ffrpVar) {
        super(2, ffguVar);
        this.b = cfdpVar;
        this.c = cezeVar;
        this.d = ceveVar;
        this.e = ffrpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfdm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cfdp cfdpVar = this.b;
            ceze cezeVar = this.c;
            cfdk cfdkVar = new cfdk(this.e);
            cety a = this.d.a();
            this.a = 1;
            if (cfdp.k(cfdpVar, cezeVar, cfdkVar, a, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cfdm cfdmVar = new cfdm(ffguVar, this.b, this.c, this.d, this.e);
        cfdmVar.f = obj;
        return cfdmVar;
    }
}
