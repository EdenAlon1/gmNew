package defpackage;

import android.content.Context;
import j$.time.Duration;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctmm {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/util/p2p/common/SmartsCacheCleaner");

    public static void a(cqoh cqohVar, Context context) {
        File[] listFiles;
        long epochMilli = cqohVar.f().toEpochMilli();
        File cacheDir = context.getCacheDir();
        if (cacheDir == null || !cacheDir.exists() || (listFiles = cacheDir.listFiles()) == null) {
            return;
        }
        for (File file : listFiles) {
            if ((file.getName().startsWith("hobbes") || file.getName().startsWith("multi_") || file.getName().startsWith("quantized_model") || file.getName().startsWith("sensitive_classifier") || file.getName().startsWith("smarts_cache_item_")) && epochMilli - file.lastModified() > Duration.ofDays(((Integer) ctmo.a.e()).intValue()).toMillis()) {
                if (file.delete()) {
                    ensk e = a.e();
                    e.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartsCacheCleaner", "cleanUpOldCacheFiles", 44, "SmartsCacheCleaner.java")).t("Deleted stale file %s", file.getName());
                } else {
                    ensk j = a.j();
                    j.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartsCacheCleaner", "cleanUpOldCacheFiles", 46, "SmartsCacheCleaner.java")).t("Failed to deleted stale file %s", file.getName());
                }
            }
        }
    }
}
