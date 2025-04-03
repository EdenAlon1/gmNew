package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqai extends ffhv implements ffjm {
    final /* synthetic */ aqam a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqai(aqam aqamVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = aqamVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqai) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return new Integer(this.a.g.i());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aqai(this.a, ffguVar);
    }
}
