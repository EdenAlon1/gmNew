package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dtm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ild b;
    final /* synthetic */ ffjn c;
    final /* synthetic */ ffji d;
    final /* synthetic */ ffji e;
    final /* synthetic */ ffji f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtm(ild ildVar, ffjn ffjnVar, ffji ffjiVar, ffji ffjiVar2, ffji ffjiVar3, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ildVar;
        this.c = ffjnVar;
        this.d = ffjiVar;
        this.e = ffjiVar2;
        this.f = ffjiVar3;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffsk ffskVar = (ffsk) this.g;
            dqx dqxVar = new dqx(this.b);
            ild ildVar = this.b;
            dtl dtlVar = new dtl(ffskVar, this.c, this.d, this.e, this.f, dqxVar, null);
            this.a = 1;
            if (dpu.b(ildVar, dtlVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dtm dtmVar = new dtm(this.b, this.c, this.d, this.e, this.f, ffguVar);
        dtmVar.g = obj;
        return dtmVar;
    }
}
