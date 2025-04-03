package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dinm {
    final dino A;
    final dimm B;
    final dimm C;
    final dimm D;
    final dino a;
    final dino b;
    final dino c;
    final dino d;
    final dino e;
    final dino f;
    final dino g;
    final dino h;
    final dino i;
    final dino j;
    final dino k;
    final dino l;
    final dino m;
    final dino n;
    final dino o;
    final dino p;
    final dino q;
    final dino r;
    final dino s;
    final dino t;
    final dino u;
    final dino v;
    final dino w;
    final dino x;
    final dino y;
    final dino z;

    protected dinm(ecwh ecwhVar) {
        this.a = new dino(ecwhVar.h("acs_url", ""));
        dimn.c.booleanValue();
        this.b = new dino(ecwhVar.i("allow_overrides", true));
        dimn.d.booleanValue();
        this.c = new dino(ecwhVar.i("clear_sip_register_auth_digest", true));
        this.e = new dino(ecwhVar.g("initial_message_revocation_delay_in_millis", dimn.e.longValue()));
        this.f = new dino(ecwhVar.g("max_message_revocation_delay_in_millis", dimn.f.longValue()));
        dimn.g.intValue();
        this.g = new dino(ecwhVar.f("max_thumbnail_download_size_bytes", 102400));
        dimn.h.intValue();
        this.h = new dino(ecwhVar.f("max_thumbnail_download_size_pre_up_bytes", 10240));
        this.i = new dino(ecwhVar.h("mcc_mnc", "00101"));
        this.j = new dino(ecwhVar.h("mcc_url_format", ""));
        this.k = new dino(ecwhVar.h("otp_pattern", ""));
        this.l = new dino(ecwhVar.h("sms_ignore_pattern", "Google is verifying your number for Chat features \\d+|Google Chat features code [a-zA-Z0-9_-]+ \\d+"));
        this.m = new dino(ecwhVar.f("otp_wait_timeout_ms", dimn.i.intValue()));
        this.n = new dino(ecwhVar.f("provisioning_imei_format", 2));
        this.o = new dino(ecwhVar.f("provisioning_imsi_format", 2));
        this.p = new dino(ecwhVar.h("provisioning_rcs_profile", "UP_T"));
        this.q = new dino(ecwhVar.h("provisioning_rcs_version", "5.1B"));
        this.r = new dino(ecwhVar.g("provisioning_retry_max_delay_in_millis", dimn.w));
        this.s = new dino(ecwhVar.g("provisioning_retry_min_delay_in_millis", dimn.v));
        this.t = new dino(ecwhVar.g("sip_register_retry_max_delay_in_seconds", dimn.j.longValue()));
        dimn.k.longValue();
        this.u = new dino(ecwhVar.g("sip_register_retry_min_delay_in_seconds", 5L));
        dimn.l.intValue();
        this.v = new dino(ecwhVar.f("sms_port", -1));
        dimn.o.booleanValue();
        this.x = new dino(ecwhVar.i("allow_seamless_authorized_provisioning", false));
        dimn.p.booleanValue();
        this.y = new dino(ecwhVar.i("allow_manual_phone_number_input", false));
        dimn.q.booleanValue();
        this.z = new dino(ecwhVar.i("show_google_tos", false));
        dimn.r.booleanValue();
        this.A = new dino(ecwhVar.i("enable_instance_id_in_provisioning", false));
        dimn.s.booleanValue();
        this.B = new dino(ecwhVar.i("show_rcs_enabled_by_carrier_in_settings", false));
        dimn.t.booleanValue();
        this.C = new dino(ecwhVar.i("rcs_provisioning_enabled", true));
        dimn.u.booleanValue();
        this.D = new dino(ecwhVar.i("notify_backend_rcs_is_unavailable", false));
        dimn.n.booleanValue();
        this.d = new dino(ecwhVar.i("enable_analytics", true));
        dimn.m.intValue();
        this.w = new dino(ecwhVar.f("testing_device_id", -1));
    }
}
