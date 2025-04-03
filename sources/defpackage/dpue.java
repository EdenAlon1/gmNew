package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpue extends ffhv implements ffjm {
    final /* synthetic */ dpui a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpue(dpui dpuiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dpuiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpue) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.g.load(0);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpue(this.a, ffguVar);
    }
}
