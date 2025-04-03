package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cslz {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/util/common/XslEventThrottler");

    public static boolean a(fjay fjayVar) {
        double doubleValue = dizg.p().doubleValue();
        if (doubleValue >= 1.0d) {
            return true;
        }
        if (doubleValue > eobe.a && fjayVar != null && !fjayVar.b.isEmpty()) {
            String str = fjayVar.b;
            try {
                return Math.abs(UUID.fromString(str).hashCode()) <= ((int) (doubleValue * 2.147483647E9d));
            } catch (IllegalArgumentException unused) {
                ensk e = a.e();
                e.Y(ente.a, "BugleDataModel");
                ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/util/common/XslEventThrottler", "clientSideThrottle", 40, "XslEventThrottler.java")).t("Unable to parse UUID from: %s", str);
            }
        }
        return false;
    }
}
