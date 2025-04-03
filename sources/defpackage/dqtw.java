package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqtw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dqtz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqtw(dqtz dqtzVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dqtzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqtw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dqth dqthVar = this.b.aq;
            if (dqthVar == null) {
                ffkj.c("views");
                dqthVar = null;
            }
            ffxx d = dslh.d(dqthVar.a);
            dqtv dqtvVar = new dqtv(this.b);
            this.a = 1;
            if (d.a(dqtvVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqtw(this.b, ffguVar);
    }
}
