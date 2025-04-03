package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ocj extends ffhv implements ffjm {
    final /* synthetic */ ojn a;
    final /* synthetic */ oco b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ocj(ojn ojnVar, oco ocoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ojnVar;
        this.b = ocoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ocj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ojn ojnVar = this.a;
        return okq.b(ojnVar.b, ojnVar.a, this.b.a);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ocj(this.a, this.b, ffguVar);
    }
}
