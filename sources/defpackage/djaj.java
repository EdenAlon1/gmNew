package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djaj {
    public final diza a;
    public final diza b;
    public final diza c;
    public final diza d;
    public final diza e;
    public final diza f;
    public final diza g;
    public final diza h;
    public final diza i;
    public final diza j;
    public final diza k;
    public final diza l;
    public final diza m;
    public final diza n;
    public final diza o;
    public final diza p;
    public final diza q;
    public final diza r;
    public final diza s;
    public final diza t;
    public final diza u;
    public final diza v;
    public final diza w;
    public final diza x;

    public djaj(djak djakVar) {
        this.a = djakVar.i("enable_capdiscovery_via_presence", true);
        this.b = djakVar.i("enable_request_interworking_imdn", false);
        this.c = djakVar.h("msrp_cert_fingerprint_algorithm", "SHA-1");
        this.d = djakVar.i("poll_sim_loaded_status_on_init", false);
        this.e = djakVar.i("enable_fi_network_selector", false);
        this.f = djakVar.i("deprioritize_vpns_in_network_selector", false);
        this.g = djakVar.i("enable_realtime_socket_monitoring", false);
        this.h = djakVar.i("delay_gc_transport_error_handling", false);
        this.i = djakVar.i("inform_bugle_of_sessionid_reset_in_runtime", true);
        this.j = djakVar.g("revoke_message_timeout_seconds", 32L);
        this.k = djakVar.g("group_management_response_timeout_seconds", 32L);
        this.l = djakVar.i("use_network_capabilities_for_availability_check", false);
        this.m = djakVar.i("enable_rcs_engine_initialization_by_bugle", false);
        this.n = djakVar.i("enable_fake_capabilities_discovery", false);
        this.o = djakVar.i("enable_bind_msrp_socket_local_address", false);
        this.p = djakVar.i("enable_active_msrp_port_selection", false);
        this.q = djakVar.i("enable_unsubscribe_to_cep", false);
        this.r = djakVar.i("deregister_on_sim_removal", false);
        this.s = djakVar.i("enable_sip_transport_event_logging", false);
        this.t = djakVar.i("enable_replace_conference_own_user_with_preferred_uri", false);
        this.u = djakVar.i("enable_msg_revoke_in_originating_invite", false);
        this.v = djakVar.i("enable_msg_revoke_in_originating_invite_for_e2ee", false);
        this.w = djakVar.i("enable_check_not_suspended_network_capability", false);
        this.x = djakVar.i("enable_encryption_tag_in_invite", false);
    }
}
