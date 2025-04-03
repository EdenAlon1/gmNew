package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dli extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffix b;
    final /* synthetic */ ffjm c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dli(ffix ffixVar, ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffixVar;
        this.c = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dli) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
            dlh dlhVar = new dlh(fflbVar, ffskVar, ffjmVar);
            this.a = 1;
            if (a.a(dlhVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dli dliVar = new dli(this.b, this.c, ffguVar);
        dliVar.d = obj;
        return dliVar;
    }
}
