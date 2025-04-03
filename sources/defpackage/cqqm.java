package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqqm {
    private static final cfup b = cfvl.e(cfvl.b, "file_transfer_progress_threshold_bytes", 512);
    public static final cfup a = cfvl.f(cfvl.b, "file_transfer_progress_notifications_after_milliseconds", 0);
    private static final cfup c = cfvl.e(cfvl.b, "file_transfer_idle_timeout_seconds", 5);
    private static final cfup d = cfvl.e(cfvl.b, "file_transfer_max_retries_for_download", 7);

    public static int a() {
        return ((Integer) d.e()).intValue();
    }

    public static int b() {
        return ((Integer) b.e()).intValue();
    }

    public static eyev c() {
        return eyki.f(((Integer) c.e()).intValue());
    }
}
