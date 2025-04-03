package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqtq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dqtz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqtq(dqtz dqtzVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dqtzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqtq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        dqoh dqohVar = this.b.a;
        if (dqohVar == null) {
            ffkj.c("categoriesService");
            dqohVar = null;
        }
        this.a = 1;
        Object b = dqohVar.b(this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqtq(this.b, ffguVar);
    }
}
