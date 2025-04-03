package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqoq extends ffhv implements ffjm {
    final /* synthetic */ dqow a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqoq(dqow dqowVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dqowVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqoq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.b = new dqoi().a;
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqoq(this.a, ffguVar);
    }
}
