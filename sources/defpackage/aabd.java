package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aabd extends ffhv implements ffjm {
    final /* synthetic */ aabi a;
    final /* synthetic */ alxr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aabd(aabi aabiVar, alxr alxrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = aabiVar;
        this.b = alxrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aabd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        axnw.h(this.a.d.A(this.b.b()));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aabd(this.a, this.b, ffguVar);
    }
}
