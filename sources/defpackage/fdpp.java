package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdpp implements fdpo {
    public static final ecwj a;
    public static final ecwj b;
    public static final ecwj c;

    static {
        ecwh b2 = new ecwh(ecvd.a("com.google.lighter.android")).a().b();
        a = b2.m("default_blocks_query_limit", 40L);
        b2.m("default_message_query_limit", 40L);
        b2.o("enable_store_deleted_conversations_in_db", false);
        b2.m("filtered_query_batch_multiplier", 1L);
        b2.m("fixed_filtered_query_batch_size", 15L);
        b = b2.m("monitor_cache_size_support_0", 0L);
        c = b2.o("registration_execute_in_transaction_fix", true);
    }

    @Override // defpackage.fdpo
    public final long a() {
        return ((Long) a.b()).longValue();
    }

    @Override // defpackage.fdpo
    public final long b() {
        return ((Long) b.b()).longValue();
    }

    @Override // defpackage.fdpo
    public final boolean c() {
        return ((Boolean) c.b()).booleanValue();
    }
}
