package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmpu extends ffhv implements ffjm {
    final /* synthetic */ cmpv a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmpu(cmpv cmpvVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cmpvVar;
        this.b = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmpu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        boolean booleanValue = ((Boolean) djai.t().a.aA.a()).booleanValue();
        cmpv cmpvVar = this.a;
        String str = this.b;
        if (booleanValue) {
            ((enrr) cmpv.a.h().h("com/google/android/apps/messaging/shared/rcsprovisioning/tychogrpc/FiMultiSyncGrpcSchedulerImpl", "scheduleWork", 39, "FiMultiSyncGrpcSchedulerImpl.kt")).q("Cancelling existing FiMultiSyncGrpc work, if any, before scheduling new work.");
            ((cevh) ((cmpt) cmpvVar.b.b()).a.b()).h(Integer.toString(str.hashCode()));
        }
        cmpt cmptVar = (cmpt) cmpvVar.b.b();
        cmpr cmprVar = (cmpr) cmps.a.createBuilder();
        cmprVar.copyOnWrite();
        cmps cmpsVar = (cmps) cmprVar.instance;
        cmpsVar.b |= 1;
        cmpsVar.c = str;
        cmps cmpsVar2 = (cmps) cmprVar.build();
        cetp cetpVar = new cetp();
        cetpVar.d = Integer.toString(str.hashCode());
        ((cevh) cmptVar.a.b()).a(ceyr.h("fi_multi_sync_grpc", cmpsVar2, cetpVar.a()));
        cmqb cmqbVar = (cmqb) cmpvVar.c.b();
        erbi erbiVar = (erbi) erbj.a.createBuilder();
        erbiVar.getClass();
        erbt erbtVar = (erbt) erbu.a.createBuilder();
        erbtVar.getClass();
        eyfy build = erbtVar.build();
        build.getClass();
        erbiVar.copyOnWrite();
        erbj erbjVar = (erbj) erbiVar.instance;
        erbjVar.c = (erbu) build;
        erbjVar.b = 1;
        cmqbVar.a(erbk.a(erbiVar), str);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cmpu(this.a, this.b, ffguVar);
    }
}
