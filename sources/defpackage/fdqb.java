package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdqb implements fdqa {
    public static final ecwj a;
    public static final ecwj b;
    public static final ecwj c;

    static {
        ecwh b2 = new ecwh(ecvd.a("com.google.lighter.android")).a().b();
        a = b2.m("delivery_receipt_retry_time_ms", 900000L);
        b = b2.m("max_stale_receipt_retry_time_ms", 3600000L);
        c = b2.m("receipt_batch_time_ms", 3000L);
    }

    @Override // defpackage.fdqa
    public final long a() {
        return ((Long) a.b()).longValue();
    }

    @Override // defpackage.fdqa
    public final long b() {
        return ((Long) b.b()).longValue();
    }

    @Override // defpackage.fdqa
    public final long c() {
        return ((Long) c.b()).longValue();
    }
}
