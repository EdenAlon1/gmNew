package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckwb extends ffhv implements ffjm {
    final /* synthetic */ ckwi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckwb(ckwi ckwiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ckwiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckwb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return Boolean.valueOf(this.a.d.d());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ckwb(this.a, ffguVar);
    }
}
