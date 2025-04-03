package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdlt implements fdlr {
    public static final ecwj a;

    static {
        ecwh a2 = new ecwh(ecvd.a("com.google.android.gms.auth_account")).c().a();
        a2.o("BugFixFeatures__add_api_surface_to_token_request_options_for_3p", true);
        a2.o("BugFixFeatures__cancel_fido2_api_on_destroy", true);
        a2.o("BugFixFeatures__catch_activity_not_found_exception", true);
        a2.o("BugFixFeatures__check_network_by_capabilities", true);
        a2.o("BugFixFeatures__copy_suw_extras_to_managed_provisioning_intent", true);
        a2.o("BugFixFeatures__deprecate_check_account_name", true);
        a2.o("BugFixFeatures__enable_debuglogs_with_categoryhack", false);
        a2.o("BugFixFeatures__enable_disconnect_from_headless_service", true);
        a2.o("BugFixFeatures__enable_intent_logging", true);
        a2.o("BugFixFeatures__enable_propagate_theme_from_seed_data_fix", true);
        a2.o("BugFixFeatures__enable_verified_phone_number", true);
        a2.o("BugFixFeatures__enclose_data_collection_info", true);
        a2.o("BugFixFeatures__fill_screen_when_status_bar_drawn_in_webview", false);
        a2.o("BugFixFeatures__fix_device_management_intent_for_unicorn_accounts", false);
        a2.o("BugFixFeatures__fix_edge_to_edge_in_browser_consent_activity", true);
        a2.o("BugFixFeatures__fix_edge_to_edge_in_otp_activity", true);
        a2.o("BugFixFeatures__fix_edge_to_edge_in_private_space_activity", true);
        a2.o("BugFixFeatures__fix_edge_to_edge_in_uncertified_notification_activity", true);
        a2.o("BugFixFeatures__fix_minute_maid_top_margin", true);
        a2.o("BugFixFeatures__fix_missing_expiration_time_get_token_response", true);
        a2.o("BugFixFeatures__fix_webview_dropdown_crash", false);
        a = a2.l("BugFixFeatures__gau_telemetry_sampling_rate", 0.001d);
        a2.o("BugFixFeatures__handle_resource_not_found", true);
        a2.o("BugFixFeatures__include_gservices_android_id_in_constellation_reqs", false);
        a2.o("BugFixFeatures__limit_categoryhack_pendingintent_after_user_click", false);
        a2.o("BugFixFeatures__log_add_account_in_multi_mm", true);
        a2.o("BugFixFeatures__make_notifications_auto_cancel", true);
        a2.o("BugFixFeatures__migrate_to_codegen_flags", false);
        a2.o("BugFixFeatures__minute_maid_convert_to_opaque", true);
        a2.o("BugFixFeatures__minute_maid_fix_talkback_focus_", true);
        a2.o("BugFixFeatures__new_granted_scopes_propagation", true);
        a2.o("BugFixFeatures__no_custom_animations_outside_suw", true);
        a2.o("BugFixFeatures__pass_identifier_to_carrier_setup", true);
        a2.o("BugFixFeatures__prevent_get_result_on_failed_tasks", true);
        a2.o("BugFixFeatures__prevent_unpacking_redirect_chimera_activity_restart", true);
        a2.o("BugFixFeatures__remove_androidreauth_from_auto_urls", false);
        a2.o("BugFixFeatures__remove_category_hack_pending_intent", false);
        a2.o("BugFixFeatures__remove_signed_out_accounts_from_otc_spinner", false);
        a2.o("BugFixFeatures__remove_top_padding_from_landscape_content_area", true);
        a2.o("BugFixFeatures__remove_verify_pin_feature", false);
        a2.o("BugFixFeatures__retry_account_sync", false);
        a2.o("BugFixFeatures__set_is_frp_required_skip_minute_maid", true);
        a2.o("BugFixFeatures__set_update_current_task_only_if_different_for_device_cert", true);
        a2.o("BugFixFeatures__shutdown_grpc_channels", true);
        a2.o("BugFixFeatures__skip_it_cache_on_notification_click", true);
        a2.p("BugFixFeatures__treat_all_suw_flows_same_for_form_factor", new ecwg() { // from class: fdls
            @Override // defpackage.ecwg
            public final Object a(byte[] bArr) {
                return (eulj) eyfy.parseFrom(eulj.a, bArr);
            }
        }, "CgIIATICCAA6AggB");
        a2.o("BugFixFeatures__uncertified_devices_remove_permissions", true);
        a2.o("BugFixFeatures__update_default_icon_for_glif_auth_account_layout", true);
        a2.o("BugFixFeatures__upload_version_code", true);
        a2.o("BugFixFeatures__use_forward_animation_work_account_setup", true);
        a2.o("BugFixFeatures__use_identity_interrupt_payload", true);
        a2.o("BugFixFeatures__use_internal_api_to_whitelist_package", true);
        a2.o("BugFixFeatures__use_is_tv_in_pano_helper", true);
        a2.o("BugFixFeatures__use_sud_glif_blank_template", true);
        a2.o("BugFixFeatures__use_work_account_client_is_whitelisted", true);
        a2.o("BugFixFeatures__wait_for_headless_handle_state_update_complete", true);
        a2.o("BugFixFeatures__wrap_activity_once", true);
        a2.o("BugFixFeatures__write_visibility_to_local_storage_first", true);
    }

    @Override // defpackage.fdlr
    public final double a() {
        return ((Double) a.b()).doubleValue();
    }
}
