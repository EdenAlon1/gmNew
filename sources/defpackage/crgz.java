package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crgz {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/transport/SimRegistrationInfoProvider");
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;

    public crgz(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
    }

    public final Map a() {
        ffga ffgaVar = new ffga();
        ekzz f = eleg.f("SimRegistrationInfoProvider#get#buildMap");
        try {
            Set<djrm> q = ((djrv) this.b.b()).q();
            q.getClass();
            ArrayList<djro> arrayList = new ArrayList(ffdx.n(q, 10));
            for (djrm djrmVar : q) {
                djrmVar.getClass();
                arrayList.add(djrn.a(djrmVar));
            }
            ensk h = a.h();
            h.Y(ente.a, "BugleTransport");
            enrr enrrVar = (enrr) h.h("com/google/android/apps/messaging/shared/transport/SimRegistrationInfoProvider", "getSimIdToRegistrationInfo$third_party_java_src_android_app_bugle_shared_java_com_google_android_apps_messaging_shared_transport_sim_registration_info_provider_AUTO_DEPS_ORIGINAL", 40, "SimRegistrationInfoProvider.kt");
            ArrayList arrayList2 = new ArrayList(ffdx.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(cskt.b(((djro) it.next()).a));
            }
            enrrVar.t("Retrieved RCS available simIds: %s", arrayList2);
            if (!((asqs) this.e.b()).a() && arrayList.size() > 1) {
                throw new IllegalStateException("More than one SIM available for RCS even though enableMultiSimRcs is false.");
            }
            for (djro djroVar : arrayList) {
                djtp djtpVar = (djtp) fflm.b(((djry) this.c.b()).i(djroVar));
                if (djtpVar == null) {
                    ensk j = a.j();
                    j.Y(ente.a, "BugleTransport");
                    ((enrr) j.h("com/google/android/apps/messaging/shared/transport/SimRegistrationInfoProvider", "getSimIdToRegistrationInfo$third_party_java_src_android_app_bugle_shared_java_com_google_android_apps_messaging_shared_transport_sim_registration_info_provider_AUTO_DEPS_ORIGINAL", 55, "SimRegistrationInfoProvider.kt")).t("No configuration found for SIM with simId %s", cskt.b(djroVar.a));
                } else {
                    djrq d = ((djsi) this.d.b()).d(djroVar);
                    if (d == null) {
                        ensk j2 = a.j();
                        j2.Y(ente.a, "BugleTransport");
                        ((enrr) j2.h("com/google/android/apps/messaging/shared/transport/SimRegistrationInfoProvider", "getSimIdToRegistrationInfo$third_party_java_src_android_app_bugle_shared_java_com_google_android_apps_messaging_shared_transport_sim_registration_info_provider_AUTO_DEPS_ORIGINAL", 68, "SimRegistrationInfoProvider.kt")).t("No subscription id found for SIM with simId %s", cskt.b(djroVar.a));
                    } else {
                        ffgaVar.put(djroVar, new crgw(djtpVar, d.a));
                    }
                }
            }
            ffig.a(f, null);
            return ffew.b(ffgaVar);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ffig.a(f, th);
                throw th2;
            }
        }
    }
}
