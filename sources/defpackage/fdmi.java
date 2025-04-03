package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdmi implements fdmh {
    public static final ecwj a;
    public static final ecwj b;

    static {
        ecwh b2 = new ecwh(ecvd.a("com.google.android.gms.droidguardclient")).c().a().b();
        a = b2.o("ClientLibraryFeature__enable_v2_proxy_for_v1_get_results", false);
        b = b2.o("ClientLibraryFeature__use_singleton_vm_manager", true);
    }

    @Override // defpackage.fdmh
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.fdmh
    public final boolean b() {
        return ((Boolean) b.b()).booleanValue();
    }
}
