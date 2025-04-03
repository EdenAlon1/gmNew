package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class frq extends ffhv implements ffjm {
    final /* synthetic */ frr a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public frq(frr frrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = frrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((frq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return ffqy.d((ffsk) this.b, null, null, new frp(this.a, null), 3);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        frq frqVar = new frq(this.a, ffguVar);
        frqVar.b = obj;
        return frqVar;
    }
}
