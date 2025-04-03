package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfbm extends ffhv implements ffji {
    int a;
    final /* synthetic */ cfbn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfbm(cfbn cfbnVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = cfbnVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        elfl c;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cfbn.a.p("Running PWQ Janitor for this process session");
            cfgt cfgtVar = (cfgt) this.b.b.b();
            c = axol.c(cfgtVar.h, ffhe.a, ffsm.a, new cfgo(cfgtVar, null));
            this.a = 1;
            if (fgfz.c(c, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        cfbn.a.p("Janitor completed successfully");
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cfbm(this.b, (ffgu) obj).b(ffcu.a);
    }
}
