package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlyz extends ffhv implements ffjm {
    final /* synthetic */ dlzf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlyz(dlzf dlzfVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dlzfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlyz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.e.invoke();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dlyz(this.a, ffguVar);
    }
}
