package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqvy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dqwa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqvy(dqwa dqwaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dqwaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqvy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dqwa dqwaVar = this.b;
            ffxx d = dslh.d(dqwaVar.f.a);
            dqvx dqvxVar = new dqvx(dqwaVar);
            this.a = 1;
            if (d.a(dqvxVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqvy(this.b, ffguVar);
    }
}
