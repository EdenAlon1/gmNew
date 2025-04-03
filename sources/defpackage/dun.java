package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dun extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ild b;
    final /* synthetic */ duq c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dun(ild ildVar, duq duqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ildVar;
        this.c = duqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dun) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffsk ffskVar = (ffsk) this.d;
            ffqy.d(ffskVar, null, ffsm.d, new dul(this.c, null), 1);
            ild ildVar = this.b;
            dum dumVar = new dum(this.c, ffskVar, null);
            this.a = 1;
            if (dpu.b(ildVar, dumVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dun dunVar = new dun(this.b, this.c, ffguVar);
        dunVar.d = obj;
        return dunVar;
    }
}
