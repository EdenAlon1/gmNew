package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axrj extends ffhv implements ffjm {
    /* synthetic */ Object a;
    final /* synthetic */ ffxx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axrj(ffxx ffxxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffxxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axrj) c(obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        ((enrr) axqg.a.h().h("com/google/android/apps/messaging/shared/concurrent/flow/LogEmissionsKt$logEmissions$withOnEach$1", "invokeSuspend", 20, "LogEmissions.kt")).D("%s emitted: %s", obj3 instanceof axra ? ((axra) obj3).a : obj3.toString(), cskt.b(String.valueOf(obj2)).toString());
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        axrj axrjVar = new axrj(this.b, ffguVar);
        axrjVar.a = obj;
        return axrjVar;
    }
}
