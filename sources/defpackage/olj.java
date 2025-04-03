package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class olj extends ffhv implements ffjm {
    final /* synthetic */ olk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public olj(olk olkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = olkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((olj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return this.a.b.invoke();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new olj(this.a, ffguVar);
    }
}
