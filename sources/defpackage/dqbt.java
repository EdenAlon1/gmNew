package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqbt extends ffhv implements ffjm {
    final /* synthetic */ ada a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqbt(ada adaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = adaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqbt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        dpzb.b(this.a);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqbt(this.a, ffguVar);
    }
}
