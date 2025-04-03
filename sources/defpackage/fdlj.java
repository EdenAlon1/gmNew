package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdlj implements fdli {
    public static final ecwj a;
    public static final ecwj b;
    public static final ecwj c;
    public static final ecwj d;

    static {
        ecwh a2 = new ecwh(ecvd.a("com.google.android.ims.library")).a();
        a = a2.o("FiMultiSync__enable_fi_multi_sync_help_article_in_rcs_settings", false);
        b = a2.o("FiMultiSync__enable_grpc_to_tycho_for_fi_multi_sync_status", false);
        c = a2.o("FiMultiSync__log_fi_multi_device_sync_sign_out", false);
        d = a2.o("FiMultiSync__remove_unnecessary_grpc_to_tycho", false);
    }

    @Override // defpackage.fdli
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.fdli
    public final boolean b() {
        return ((Boolean) b.b()).booleanValue();
    }

    @Override // defpackage.fdli
    public final boolean c() {
        return ((Boolean) c.b()).booleanValue();
    }

    @Override // defpackage.fdli
    public final boolean d() {
        return ((Boolean) d.b()).booleanValue();
    }
}
