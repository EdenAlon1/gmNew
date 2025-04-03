package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdjz implements fdjy {
    public static final ecwj a;
    public static final ecwj b;

    static {
        ecwh a2 = new ecwh(ecvd.a("com.google.android.ims.library")).a();
        a = a2.o("cslib_phenotype__enable_welcome_message_suppression_v1", true);
        b = a2.o("cslib_phenotype__test_ramp_down_v2", false);
    }

    @Override // defpackage.fdjy
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.fdjy
    public final boolean b() {
        return ((Boolean) b.b()).booleanValue();
    }
}
