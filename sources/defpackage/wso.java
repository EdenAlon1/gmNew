package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wso extends ffhv implements ffjm {
    final /* synthetic */ wsv a;
    final /* synthetic */ cssv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wso(wsv wsvVar, cssv cssvVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = wsvVar;
        this.b = cssvVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wso) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.b.f(Boolean.valueOf(this.b.a()));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new wso(this.a, this.b, ffguVar);
    }
}
