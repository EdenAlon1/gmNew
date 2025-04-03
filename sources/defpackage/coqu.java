package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class coqu extends ffhv implements ffjm {
    final /* synthetic */ coqx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coqu(coqx coqxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = coqxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((coqu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.f.a();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new coqu(this.a, ffguVar);
    }
}
