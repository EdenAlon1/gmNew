package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdpd implements fdpc {
    public static final ecwj a;
    public static final ecwj b;
    public static final ecwj c;

    static {
        ecwh b2 = new ecwh(ecvd.a("com.google.lighter.android")).a().b();
        a = b2.m("bitmap_download_connection_timeout_millis", 15000L);
        b = b2.m("bitmap_download_read_timeout_millis", 30000L);
        c = b2.m("maximum_avatar_dimension_pixels", 256L);
    }

    @Override // defpackage.fdpc
    public final long a() {
        return ((Long) a.b()).longValue();
    }

    @Override // defpackage.fdpc
    public final long b() {
        return ((Long) b.b()).longValue();
    }

    @Override // defpackage.fdpc
    public final long c() {
        return ((Long) c.b()).longValue();
    }
}
