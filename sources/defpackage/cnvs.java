package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnvs extends ffhv implements ffjm {
    final /* synthetic */ cnvt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnvs(cnvt cnvtVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cnvtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnvs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        boolean b = ekxi.b(u());
        cnvt cnvtVar = this.a;
        if (!b) {
            throw new IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
        }
        ekzz f = eleg.f("TelephonySatelliteReporter#reportNtnSmsSupport");
        try {
            boolean a = ((ausa) cnvtVar.b.b()).a();
            ensk h = cnvt.a.h();
            h.Y(ente.a, "BugleSatellite");
            ((enrr) h.h("com/google/android/apps/messaging/shared/satelliteapi/telephony/TelephonySatelliteReporter$reportNtnSmsSupport$1", "invokeSuspend", 70, "TelephonySatelliteReporterImpl.kt")).t("Reporting to Telephony: SMS supported = %b", Boolean.valueOf(a));
            cnvtVar.c.c(a);
            ffig.a(f, null);
            return ffcu.a;
        } finally {
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cnvs(this.a, ffguVar);
    }
}
