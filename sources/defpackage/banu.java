package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class banu {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/action/ProcessPendingMessagesTimers");
    public static final long b = TimeUnit.SECONDS.toMillis(5);
    public static final long c = TimeUnit.SECONDS.toMillis(3);
    public static long d = 0;
    public static final Random e = new Random();
    public static final long[] f = new long[8];
    public static final int[] g = new int[8];
    public static final long[] h = new long[8];
    public final csxu i;
    public final bbgq j;

    static {
        for (int i = 0; i < 8; i++) {
            f[i] = 0;
            g[i] = 0;
            h[i] = 0;
        }
    }

    public banu(csxu csxuVar, bbgq bbgqVar) {
        this.i = csxuVar;
        this.j = bbgqVar;
    }

    static long a(int i) {
        if (bbgq.f(i)) {
            long j = h[i];
            return j > 0 ? j : f[i];
        }
        ensk i2 = a.i();
        i2.Y(ente.a, "BugleDataModel");
        ((enrr) ((enrr) i2).h("com/google/android/apps/messaging/shared/datamodel/action/ProcessPendingMessagesTimers", "getNextRetryTime", 235, "ProcessPendingMessagesTimers.java")).r("Invalid channel at getNextRetryTime: %s", i);
        return Long.MAX_VALUE;
    }

    public static void b(int i, boolean z) {
        if (!bbgq.f(i)) {
            ensk i2 = a.i();
            i2.Y(ente.a, "BugleDataModel");
            ((enrr) ((enrr) i2).h("com/google/android/apps/messaging/shared/datamodel/action/ProcessPendingMessagesTimers", "clearNextRetryTimestamp", 268, "ProcessPendingMessagesTimers.java")).r("Invalid channel at clearNextRetryTimestamp: %s", i);
        } else {
            f[i] = 0;
            if (z) {
                g[i] = 0;
            }
            ensk h2 = a.h();
            h2.Y(ente.a, "BugleDataModel");
            ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/datamodel/action/ProcessPendingMessagesTimers", "clearNextRetryTimestamp", 276, "ProcessPendingMessagesTimers.java")).D("Cleared next retry time for channel: %s %s", bbfp.d(i), true != z ? "" : "including counter");
        }
    }

    public static void c(MessageCoreData messageCoreData) {
        b(bbgq.b(messageCoreData), true);
    }

    public final boolean d(int i, long j) {
        return i == 1 && j - d <= c;
    }
}
