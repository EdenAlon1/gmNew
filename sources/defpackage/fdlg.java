package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdlg implements fdlf {
    public static final ecwj a;
    public static final ecwj b;
    public static final ecwj c;
    public static final ecwj d;

    static {
        ecwh a2 = new ecwh(ecvd.a("com.google.android.ims.library")).a();
        a2.o("DsdrProvisioningFlags__check_phone_number_empty_in_formatted_e164_phone_number_factory", true);
        a2.o("DsdrProvisioningFlags__delay_sim_events", true);
        a2.o("DsdrProvisioningFlags__delay_sim_events_using_pwq", true);
        a2.o("DsdrProvisioningFlags__distinct_sim_subscription_infos_by_sub_id", true);
        a = a2.o("DsdrProvisioningFlags__enable_all_subscriptions_as_verified", false);
        b = a2.o("DsdrProvisioningFlags__enable_is_sim_loaded_comparison_event", false);
        a2.o("DsdrProvisioningFlags__enable_manifest_registered_async_telephony_sim_state_receiver", true);
        a2.o("DsdrProvisioningFlags__enable_multi_sim_carrier_tos", true);
        a2.o("DsdrProvisioningFlags__enable_rcs_availability_util_in_provisioning_engine", true);
        a2.o("DsdrProvisioningFlags__enable_rcs_settings_data_in_carrier_services", true);
        a2.o("DsdrProvisioningFlags__enable_schedule_provisioning_using_sim_id", true);
        a2.o("DsdrProvisioningFlags__enable_sequential_coalescing_helper_to_schedule_sim_updates", true);
        a2.o("DsdrProvisioningFlags__enable_sim_events_from_phone_sims_state_updater", true);
        c = a2.o("DsdrProvisioningFlags__enable_synchronized_update_value", false);
        d = a2.o("DsdrProvisioningFlags__handle_sim_loaded_in_phone_sims_state_updater", true);
        a2.o("DsdrProvisioningFlags__use_sim_subscription_info_in_sim_preferences", true);
    }

    @Override // defpackage.fdlf
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.fdlf
    public final boolean b() {
        return ((Boolean) b.b()).booleanValue();
    }

    @Override // defpackage.fdlf
    public final boolean c() {
        return ((Boolean) c.b()).booleanValue();
    }

    @Override // defpackage.fdlf
    public final boolean d() {
        return ((Boolean) d.b()).booleanValue();
    }
}
