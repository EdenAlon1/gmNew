package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cqde extends ffhv implements ffjm {
    final /* synthetic */ ffji a;
    final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqde(ffji ffjiVar, Object obj, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ffjiVar;
        this.b = obj;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((cqde) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
        return null;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.invoke(this.b);
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cqde(this.a, this.b, ffguVar);
    }
}
