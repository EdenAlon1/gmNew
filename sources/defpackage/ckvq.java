package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckvq extends ffhv implements ffjm {
    final /* synthetic */ ckwi a;
    final /* synthetic */ buxs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckvq(ckwi ckwiVar, buxs buxsVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ckwiVar;
        this.b = buxsVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckvq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return ((bdmq) this.a.e.b()).m(this.b);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ckvq(this.a, this.b, ffguVar);
    }
}
