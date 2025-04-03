package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wzr extends ffhv implements ffjm {
    final /* synthetic */ wzs a;
    final /* synthetic */ alxr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wzr(wzs wzsVar, alxr alxrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = wzsVar;
        this.b = alxrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wzr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.b.P(this.b.b(), 2);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new wzr(this.a, this.b, ffguVar);
    }
}
