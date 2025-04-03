package defpackage;

import android.os.Environment;
import android.os.StatFs;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpaf {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/sms/analytics/RcsTelephonyFilePersistenceEventLogger");
    public final ffsk b;
    private final ffbr c;

    public cpaf(ffbr ffbrVar, ffsk ffskVar) {
        ffbrVar.getClass();
        ffskVar.getClass();
        this.c = ffbrVar;
        this.b = ffskVar;
    }

    public static final long b() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    public final void a(eolu eoluVar) {
        akxn a2 = ((akyb) this.c.b()).a();
        a2.d(epyw.TELEPHONY_PERSISTENCE_EVENT);
        a2.j(eoluVar, alal.LOG_SPEC_TELEPHONY_PERSISTENCE_EVENTS);
    }
}
