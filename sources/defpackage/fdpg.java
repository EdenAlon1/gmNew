package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdpg implements fdpf {
    public static final ecwj a;
    public static final ecwj b;

    static {
        ecwh b2 = new ecwh(ecvd.a("com.google.lighter.android")).a().b();
        b2.m("delay_to_pull_messages_if_stream_open_millis", 3000L);
        b2.m("minimum_pull_period_seconds", 60L);
        a = b2.m("stop_stream_grace_period_ms", 15000L);
        b = b2.m("stream_check_interval_millis", 30000L);
    }

    @Override // defpackage.fdpf
    public final long a() {
        return ((Long) a.b()).longValue();
    }

    @Override // defpackage.fdpf
    public final long b() {
        return ((Long) b.b()).longValue();
    }
}
