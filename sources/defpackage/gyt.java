package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gyt extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffix b;
    final /* synthetic */ ffjm c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyt(ffix ffixVar, ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffixVar;
        this.c = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gyt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffsk ffskVar = (ffsk) this.d;
            fflb fflbVar = new fflb();
            ffix ffixVar = this.b;
            ffjm ffjmVar = this.c;
            ffxx a = hkt.a(ffixVar);
            gys gysVar = new gys(fflbVar, ffskVar, ffjmVar);
            this.a = 1;
            if (a.a(gysVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        gyt gytVar = new gyt(this.b, this.c, ffguVar);
        gytVar.d = obj;
        return gytVar;
    }
}
