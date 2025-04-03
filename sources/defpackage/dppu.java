package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dppu extends ffhv implements ffjm {
    final /* synthetic */ hzi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dppu(hzi hziVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = hziVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dppu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.b();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dppu(this.a, ffguVar);
    }
}
