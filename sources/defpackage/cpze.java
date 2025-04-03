package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpze {
    public static final cfup a = cfvl.e(cfvl.b, "forward_sync_max_attempts_per_batch", 3);
    public static final emyl b = cfvl.w("skip_prior_messages_in_sync_check_before_sync_configured");
    public static final cfup c = cfvl.l(cfvl.b, "sync_batch_target_time_millis", 100);
    public static final cfup d = cfvl.l(cfvl.b, "sync_start_time_adjustment_millis", -1000);
    public static final cfup e = cfvl.k(cfvl.b, "forward_sync_max_messages_to_scan_per_batch", 4000);
    public static final cfup f = cfvl.k(cfvl.b, "forward_sync_max_messages_to_update_per_batch", 1000);
    public static final cfup g = cfvl.k(cfvl.b, "forward_sync_min_messages_to_update_per_batch", 80);
    public static final emyl h = cfvl.w("forward_sync_restores_rcs_as_rcs_not_mms");
    public static final cfup i = cfvl.k(cfvl.b, "forward_sync_keep_alive_strategy", 0);
    public static final cfup j = cfvl.l(cfvl.b, "forward_sync_engine_delay_millis", 60000);

    public static cevc a() {
        int intValue = ((Integer) i.e()).intValue();
        if (intValue == 0) {
            return cevc.FOREGROUND_SERVICE;
        }
        if (intValue == 1) {
            return cevc.WAKELOCK;
        }
        if (intValue == 2) {
            return cevc.WORKMANAGER_ONLY;
        }
        throw new AssertionError(a.h(intValue, "Unexpected forward sync keep alive strategy: "));
    }

    public static Duration b() {
        return Duration.ofMillis(((Long) d.e()).longValue());
    }
}
