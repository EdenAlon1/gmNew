package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fey extends ffhv implements ffjm {
    int a;
    final /* synthetic */ hkx b;
    final /* synthetic */ cxj c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fey(hkx hkxVar, cxj cxjVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = hkxVar;
        this.c = cxjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fey) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffsk ffskVar = (ffsk) this.d;
            ffxx a = hkt.a(new fev(this.b));
            fex fexVar = new fex(this.c, ffskVar);
            this.a = 1;
            if (a.a(fexVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        fey feyVar = new fey(this.b, this.c, ffguVar);
        feyVar.d = obj;
        return feyVar;
    }
}
