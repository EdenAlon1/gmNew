package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqez extends ffhv implements ffjm {
    final /* synthetic */ cqfa a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqez(ffgu ffguVar, cqfa cqfaVar) {
        super(2, ffguVar);
        this.a = cqfaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cqez) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return ((cevh) ((cqew) this.a.a.b()).a.b()).a(ceyr.g("forward_sync_engine", cqey.a));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cqez cqezVar = new cqez(ffguVar, this.a);
        cqezVar.b = obj;
        return cqezVar;
    }
}
