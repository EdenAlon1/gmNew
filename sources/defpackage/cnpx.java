package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnpx implements cnpw {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/satelliteapi/dunestar/periodpull/PullMessageHelperImpl");
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final csmk e;

    public cnpx(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, csmk csmkVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        csmkVar.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = csmkVar;
    }

    @Override // defpackage.cnpw
    public final Object a() {
        for (djrm djrmVar : ((djrv) this.c.b()).q()) {
            djtp djtpVar = (djtp) fflm.b(((djry) this.d.b()).i(djrmVar));
            if (djtpVar == null) {
                ensk j = a.j();
                j.Y(ente.a, "BugleSatellite");
                ((enrr) j.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/periodpull/PullMessageHelperImpl", "pullMessagesForAllAvailableSim", 38, "PullMessageHelperImpl.kt")).t("configuration is null for provisioningId %s, skip pulling messages", djrmVar);
            } else {
                ensk h = a.h();
                h.Y(ente.a, "BugleSatellite");
                ((enrr) h.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/periodpull/PullMessageHelperImpl", "pullMessagesForAllAvailableSim", 41, "PullMessageHelperImpl.kt")).t("start pulling messages for provisioningId %s", djrmVar);
                cilk cilkVar = (cilk) this.b.b();
                fcej fcejVar = (fcej) fcek.a.createBuilder();
                fcejVar.copyOnWrite();
                ((fcek) fcejVar.instance).d = "RCS";
                String b = this.e.b(djtpVar);
                fcejVar.copyOnWrite();
                ((fcek) fcejVar.instance).c = b;
                cilkVar.a((fcek) fcejVar.build());
            }
        }
        return ffcu.a;
    }
}
