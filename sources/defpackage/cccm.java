package defpackage;

import j$.time.Duration;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cccm {
    private static final cskc g = cskc.g("BugleCms", "CmsBackupRescheduleDelay");
    static final cfup a = cfvl.f(cfvl.b, "cms_backup_queue_max_reschedule_delay_millis", TimeUnit.HOURS.toMillis(5));
    static final cfup b = cfvl.f(cfvl.b, "cms_backup_cms_key_max_reschedule_delay_millis", TimeUnit.HOURS.toMillis(5));
    static final cfup c = cfvl.f(cfvl.b, "cms_backup_participant_max_reschedule_delay_millis", TimeUnit.HOURS.toMillis(5));
    static final cfup d = cfvl.f(cfvl.b, "cms_backup_conversation_max_reschedule_delay_millis", TimeUnit.HOURS.toMillis(5));
    static final cfup e = cfvl.f(cfvl.b, "cms_backup_message_max_reschedule_delay_millis", TimeUnit.HOURS.toMillis(5));
    static final cfup f = cfvl.f(cfvl.b, "cms_backup_message_part_max_reschedule_delay_millis", TimeUnit.HOURS.toMillis(5));

    public static Duration a(long j, int i) {
        long longValue;
        double pow = Math.pow(2.0d, Math.min(j, 30L)) * 1000.0d;
        if (i == 1) {
            longValue = ((Long) e.e()).longValue();
        } else if (i == 2) {
            longValue = ((Long) d.e()).longValue();
        } else if (i == 3) {
            longValue = ((Long) c.e()).longValue();
        } else if (i == 5) {
            longValue = ((Long) f.e()).longValue();
        } else if (i != 7) {
            csjb e2 = g.e();
            e2.I("Unexpected table type, falling back to generic max delay");
            e2.y("tableType", i);
            e2.r();
            longValue = ((Long) a.e()).longValue();
        } else {
            longValue = ((Long) b.e()).longValue();
        }
        return Duration.ofMillis(Math.min((long) pow, longValue));
    }
}
