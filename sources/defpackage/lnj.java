package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lnj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ lkk b;
    final /* synthetic */ lkj c;
    final /* synthetic */ ffhd d;
    final /* synthetic */ ffxx e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnj(lkk lkkVar, lkj lkjVar, ffhd ffhdVar, ffxx ffxxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = lkkVar;
        this.c = lkjVar;
        this.d = ffhdVar;
        this.e = ffxxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lnj) c((hij) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            hij hijVar = (hij) this.f;
            lkk lkkVar = this.b;
            lkj lkjVar = this.c;
            lni lniVar = new lni(this.d, this.e, hijVar, null);
            this.a = 1;
            if (llo.a(lkkVar, lkjVar, lniVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        lnj lnjVar = new lnj(this.b, this.c, this.d, this.e, ffguVar);
        lnjVar.f = obj;
        return lnjVar;
    }
}
