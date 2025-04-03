package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdki extends ffhv implements ffjm {
    final /* synthetic */ cdkp a;
    final /* synthetic */ cejh b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ int e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdki(ffgu ffguVar, cdkp cdkpVar, cejh cejhVar, boolean z, boolean z2, int i) {
        super(2, ffguVar);
        this.a = cdkpVar;
        this.b = cejhVar;
        this.c = z;
        this.d = z2;
        this.e = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdki) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cdkp cdkpVar = this.a;
        cdkpVar.h.a(cdkpVar.h(this.b, this.c, this.d, cejg.a(this.e)));
        ensk h = cdkp.a.h();
        h.Y(ente.a, "BugleCmsMediaRestore");
        ((enrr) h.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsLocalMediaRestoreDelegateImpl$enqueueLogMediaDownloadStage$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 325, "CmsLocalMediaRestoreDelegateImpl.kt")).J("Queued request to log %s event for media download metrics, requireWifi=%s requireBatteryNotLow=%s", cejg.a(this.e), Boolean.valueOf(this.c), Boolean.valueOf(this.d));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cdki cdkiVar = new cdki(ffguVar, this.a, this.b, this.c, this.d, this.e);
        cdkiVar.f = obj;
        return cdkiVar;
    }
}
