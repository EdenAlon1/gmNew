package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdqe implements fdqd {
    public static final ecwj a;
    public static final ecwj b;

    static {
        ecwh b2 = new ecwh(ecvd.a("com.google.lighter.android")).a().b();
        a = b2.m("max_token_validity_window_in_millis", 604800000L);
        b = b2.m("token_expiry_window_in_millis", 3600000L);
    }

    @Override // defpackage.fdqd
    public final long a() {
        return ((Long) a.b()).longValue();
    }

    @Override // defpackage.fdqd
    public final long b() {
        return ((Long) b.b()).longValue();
    }
}
