package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsrf extends ffhv implements ffjm {
    final /* synthetic */ dspo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsrf(dspo dspoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dspoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsrf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((dsqw) this.a.c).a.f();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dsrf(this.a, ffguVar);
    }
}
