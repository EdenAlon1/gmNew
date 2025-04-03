package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdlx implements fdlv {
    public static final ecwj a;

    static {
        ecwh a2 = new ecwh(ecvd.a("com.google.android.gms.auth_account")).c().a();
        a2.p("CapabilityFeatures__blocked_packages_for_connectionless", new ecwg() { // from class: fdlw
            @Override // defpackage.ecwg
            public final Object a(byte[] bArr) {
                return (ezgw) eyfy.parseFrom(ezgw.a, bArr);
            }
        }, "");
        a2.o("CapabilityFeatures__broadcast_capability_changes", false);
        a2.o("CapabilityFeatures__debug_connectionless", false);
        a = a2.o("CapabilityFeatures__enable_logging_capability_latency", false);
        a2.o("CapabilityFeatures__enable_logging_sync_time", false);
        a2.l("CapabilityFeatures__visibility_not_restricted_logging_sample_fractions", 0.01d);
        a2.l("CapabilityFeatures__visibility_restricted_logging_sample_fractions", 1.0d);
    }

    @Override // defpackage.fdlv
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }
}
