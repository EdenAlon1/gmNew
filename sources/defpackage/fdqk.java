package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdqk implements fdqj {
    public static final ecwj a;
    public static final ecwj b;
    public static final ecwj c;

    static {
        ecwh b2 = new ecwh(ecvd.a("com.google.lighter.android")).a().b();
        a = b2.m("incoming_typing_indicator_expiry_ms", 60000L);
        b = b2.m("typing_indicators_max_typers", 5L);
        c = b2.m("typing_indicator_timeout_ms", 5000L);
    }

    @Override // defpackage.fdqj
    public final long a() {
        return ((Long) a.b()).longValue();
    }

    @Override // defpackage.fdqj
    public final long b() {
        return ((Long) b.b()).longValue();
    }

    @Override // defpackage.fdqj
    public final long c() {
        return ((Long) c.b()).longValue();
    }
}
