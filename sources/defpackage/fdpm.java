package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdpm implements fdpl {
    public static final ecwj a;
    public static final ecwj b;
    public static final ecwj c;
    public static final ecwj d;
    public static final ecwj e;
    public static final ecwj f;
    public static final ecwj g;

    static {
        ecwh b2 = new ecwh(ecvd.a("com.google.lighter.android")).a().b();
        a = b2.m("ack_batch_time_ms", 3000L);
        b = b2.m("block_list_refresh_interval_millis", 86400000L);
        b2.m("conversation_properties_freshness_interval_millis", 86400000L);
        b2.m("conversation_properties_refresh_jitter_millis", 7200000L);
        c = b2.o("enable_conversation_profile_fallback", false);
        d = b2.o("enable_get_open_conversation", false);
        e = b2.o("enable_message_snippet_fallback", false);
        f = b2.o("enable_periodic_pull_messages", false);
        g = b2.m("sending_message_time_offset_ms", 30000L);
        b2.o("should_handle_read_notifications", false);
        b2.m("stale_sending_time_ms", 180000L);
    }

    @Override // defpackage.fdpl
    public final long a() {
        return ((Long) a.b()).longValue();
    }

    @Override // defpackage.fdpl
    public final long b() {
        return ((Long) b.b()).longValue();
    }

    @Override // defpackage.fdpl
    public final long c() {
        return ((Long) g.b()).longValue();
    }

    @Override // defpackage.fdpl
    public final boolean d() {
        return ((Boolean) c.b()).booleanValue();
    }

    @Override // defpackage.fdpl
    public final boolean e() {
        return ((Boolean) d.b()).booleanValue();
    }

    @Override // defpackage.fdpl
    public final boolean f() {
        return ((Boolean) e.b()).booleanValue();
    }

    @Override // defpackage.fdpl
    public final boolean g() {
        return ((Boolean) f.b()).booleanValue();
    }
}
