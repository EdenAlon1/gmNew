package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dinu {
    public static final deup a;
    public static final deup b;
    public static final deup c;

    static {
        Boolean bool = false;
        bool.getClass();
        a = dins.e("carrier_services_sip_flags_update_local_port_from_rport", false);
        a("retry_count_on_service_unavailable");
        b = dins.d("carrier_services_sip_flags_avoid_checking_duplicate_for_request_methods", "CANCEL,");
        c = a("resend_200ok_max_times");
    }

    private static deup a(String str) {
        return dins.c("carrier_services_sip_flags_".concat(str), 1);
    }
}
