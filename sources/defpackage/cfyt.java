package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes7.dex */
public interface cfyt {
    public static final cfup a = cfvl.i(cfvl.b, "enable_silent_assert_feedback", false);
    public static final cfup b = cfvl.i(cfvl.b, "enable_silent_crash_issue_notification", false);
    public static final cfup c = cfvl.f(cfvl.b, "user_report_notification_backoff_ms", 2592000000L);

    elfl a(Throwable th);

    elfl b(Throwable th);

    void c(Throwable th);
}
