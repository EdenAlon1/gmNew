package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdqh implements fdqg {
    public static final ecwj a;
    public static final ecwj b;

    static {
        ecwh b2 = new ecwh(ecvd.a("com.google.lighter.android")).a().b();
        a = b2.n("tachyon_host_name", "instantmessaging-pa.googleapis.com");
        b = b2.m("tachyon_port_number", 443L);
    }

    @Override // defpackage.fdqg
    public final long a() {
        return ((Long) b.b()).longValue();
    }

    @Override // defpackage.fdqg
    public final String b() {
        return (String) a.b();
    }
}
