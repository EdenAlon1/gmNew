package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfcw extends ffhv implements ffjm {
    final /* synthetic */ ffss a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfcw(ffss ffssVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ffssVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfcw) c((ffcu) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ffui.e(this.a, "Eager job completed before scheduling could start", null);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cfcw(this.a, ffguVar);
    }
}
