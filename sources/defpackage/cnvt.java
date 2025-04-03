package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnvt implements cnjs, cfug {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/satelliteapi/telephony/TelephonySatelliteReporter");
    public final ffbr b;
    public final cnoc c;
    private final ffsk d;

    public cnvt(ffsk ffskVar, ffbr ffbrVar, cnoc cnocVar) {
        ffskVar.getClass();
        ffbrVar.getClass();
        cnocVar.getClass();
        this.d = ffskVar;
        this.b = ffbrVar;
        this.c = cnocVar;
    }

    @Override // defpackage.cnjs
    public final void a() {
        ensk h = a.h();
        h.Y(ente.a, "BugleSatellite");
        ((enrr) h.h("com/google/android/apps/messaging/shared/satelliteapi/telephony/TelephonySatelliteReporter", "onBootComplete", 62, "TelephonySatelliteReporterImpl.kt")).q("Processing boot complete event.");
        c();
    }

    public final void c() {
        axol.m(this.d, new cnvs(this, null));
    }

    @Override // defpackage.cfug
    public final boolean ge() {
        return true;
    }

    @Override // defpackage.cfug
    public final void gg() {
        ensk h = a.h();
        h.Y(ente.a, "BugleSatellite");
        ((enrr) h.h("com/google/android/apps/messaging/shared/satelliteapi/telephony/TelephonySatelliteReporter", "onBuglePhenotypeFlagChanged", 77, "TelephonySatelliteReporterImpl.kt")).q("Processing Phenotype flag changes.");
        c();
    }
}
