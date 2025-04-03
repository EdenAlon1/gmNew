package defpackage;

import android.content.Context;
import android.os.UserManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acpf {
    private static final enru a = enru.c("com/google/android/apps/messaging/dittosatellite/impl/DittoWebViewConfiguration");
    private final ffbr b;
    private final ffbr c;

    public acpf(Context context, ffbr ffbrVar, ffbr ffbrVar2) {
        context.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
    }

    public final boolean a() {
        boolean isDemoUser;
        if (((Boolean) acrz.d.e()).booleanValue()) {
            ensk h = a.h();
            h.Y(ente.a, "DittoSatellite");
            ((enrr) h.h("com/google/android/apps/messaging/dittosatellite/impl/DittoWebViewConfiguration", "isDittoWebViewEnabled", 27, "DittoWebViewConfiguration.kt")).q("Ditto Satellite Force disabled");
            return false;
        }
        boolean z = true;
        if (!((Boolean) acrz.c.e()).booleanValue() && ((ctvs) this.c.b()).e() && !((Boolean) acxy.a.a()).booleanValue()) {
            z = false;
        }
        if (z) {
            try {
                isDemoUser = ((UserManager) this.b.b()).isDemoUser();
                if (isDemoUser) {
                    ensk h2 = a.h();
                    h2.Y(ente.a, "DittoSatellite");
                    ((enrr) h2.h("com/google/android/apps/messaging/dittosatellite/impl/DittoWebViewConfiguration", "isDittoWebViewEnabled", 39, "DittoWebViewConfiguration.kt")).q("Demo user detected, disabling Ditto Satellite");
                    return false;
                }
            } catch (RuntimeException e) {
                ensk i = a.i();
                i.Y(ente.a, "DittoSatellite");
                ((enrr) ((enrr) i).g(e).h("com/google/android/apps/messaging/dittosatellite/impl/DittoWebViewConfiguration", "isDittoWebViewEnabled", 43, "DittoWebViewConfiguration.kt")).q("Error checking for demo user");
                return false;
            }
        }
        return z;
    }

    public final boolean b() {
        if (!((ctvs) this.c.b()).e() || ((Boolean) acrz.e.e()).booleanValue()) {
            return true;
        }
        if (!((Boolean) acxy.b.a()).booleanValue()) {
            return false;
        }
        ((Boolean) acxy.a.a()).booleanValue();
        return true;
    }
}
