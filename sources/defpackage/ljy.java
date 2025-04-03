package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ljy extends ffhv implements ffjm {
    final /* synthetic */ lld a;
    final /* synthetic */ llh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ljy(lld lldVar, llh llhVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = lldVar;
        this.b = llhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ljy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.g(this.b);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ljy(this.a, this.b, ffguVar);
    }
}
