package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dayn extends ffhv implements ffjm {
    final /* synthetic */ dayt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dayn(dayt daytVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = daytVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dayn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((cdhd) this.a.n.b()).a();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dayn(this.a, ffguVar);
    }
}
