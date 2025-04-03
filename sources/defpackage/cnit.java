package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnit {
    public static final cfva a;
    public static final cfva b;

    static {
        cfvl.i(cfvl.b, "enable_broadcast_receiver_foreground_notification_timeout", true);
        cfvl.f(cfvl.b, "broadcast_receiver_foreground_notification_timeout_seconds", 20L);
        a = cfvl.i(cfvl.b, "enable_broadcast_receiver_foreground_notification_extra_info", false);
        b = cfvl.f(cfvl.b, "broadcast_receiver_foreground_service_delay_millis", 3000L);
    }
}
