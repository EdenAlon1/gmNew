package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class douw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ild b;
    final /* synthetic */ boolean c;
    final /* synthetic */ ffji d;
    final /* synthetic */ dovc e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public douw(ild ildVar, boolean z, ffji ffjiVar, dovc dovcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ildVar;
        this.c = z;
        this.d = ffjiVar;
        this.e = dovcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((douw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffsk ffskVar = (ffsk) this.f;
            ild ildVar = this.b;
            douv douvVar = new douv(ffskVar, this.c, this.d, this.e, null);
            this.a = 1;
            if (dpu.b(ildVar, douvVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        douw douwVar = new douw(this.b, this.c, this.d, this.e, ffguVar);
        douwVar.f = obj;
        return douwVar;
    }
}
