package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aenm extends ffhv implements ffjm {
    final /* synthetic */ aenq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aenm(aenq aenqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = aenqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aenm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.g.compareAndSet(false, true);
        ((ejvp) this.a.f.b()).a(elfo.e(null), aefc.a);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aenm(this.a, ffguVar);
    }
}
