package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lln extends ffhv implements ffjm {
    int a;
    final /* synthetic */ lkk b;
    final /* synthetic */ lkj c;
    final /* synthetic */ ffjm d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lln(lkk lkkVar, lkj lkjVar, ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = lkkVar;
        this.c = lkjVar;
        this.d = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lln) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffsk ffskVar = (ffsk) this.e;
            ffsd ffsdVar = fftc.a;
            ffuu j = fghh.a.j();
            llm llmVar = new llm(this.b, this.c, ffskVar, this.d, null);
            this.a = 1;
            if (ffra.a(j, llmVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        lln llnVar = new lln(this.b, this.c, this.d, ffguVar);
        llnVar.e = obj;
        return llnVar;
    }
}
