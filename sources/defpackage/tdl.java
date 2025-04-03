package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tdl implements tdj {
    public static final enru a = enru.c("com/google/android/apps/messaging/cloudstore/cmsrpc/DeviceOnboardingDelegate");
    public final Map b;
    private final ffsk c;

    public tdl(Map map, ffsk ffskVar) {
        ffskVar.getClass();
        this.b = map;
        this.c = ffskVar;
        Iterator<E> it = ((enhk) map).keySet().iterator();
        while (it.hasNext()) {
            ((enrr) a.e().h("com/google/android/apps/messaging/cloudstore/cmsrpc/DeviceOnboardingDelegate", "<init>", 29, "DeviceOnboardingDelegate.kt")).t("Registered DeviceOnboardingPayloadDelegate for %s ", ((eskt) it.next()).name());
        }
    }

    @Override // defpackage.tdj
    public final elfl a(long j, eyee eyeeVar, eskr eskrVar) {
        elfl c;
        c = axol.c(this.c, ffhe.a, ffsm.a, new tdk(this, eskrVar, j, eyeeVar, null));
        return c;
    }
}
