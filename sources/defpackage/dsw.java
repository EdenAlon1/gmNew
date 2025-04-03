package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dsw extends ffhv implements ffjm {
    final /* synthetic */ dqx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsw(dqx dqxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dqxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.q();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dsw(this.a, ffguVar);
    }
}
