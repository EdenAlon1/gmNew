package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dta extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ild b;
    final /* synthetic */ ffjn c;
    final /* synthetic */ ffji d;
    final /* synthetic */ dqx e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dta(ild ildVar, ffjn ffjnVar, ffji ffjiVar, dqx dqxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ildVar;
        this.c = ffjnVar;
        this.d = ffjiVar;
        this.e = dqxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dta) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffsk ffskVar = (ffsk) this.f;
            ild ildVar = this.b;
            dsz dszVar = new dsz(ffskVar, this.c, this.d, this.e, null);
            this.a = 1;
            if (dpu.b(ildVar, dszVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dta dtaVar = new dta(this.b, this.c, this.d, this.e, ffguVar);
        dtaVar.f = obj;
        return dtaVar;
    }
}
