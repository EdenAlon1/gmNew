package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdmf implements fdme {
    public static final ecwj a;

    static {
        ecwh a2 = new ecwh(ecvd.a("com.google.android.gms.constellation")).c().a();
        a2.m("VerificationSettings__a2p_hours_before_time_window_end", 0L);
        a2.m("VerificationSettings__a2p_sms_signal_granularity_hrs", 1L);
        a2.m("VerificationSettings__a2p_upload_message_count", 5L);
        a2.n("VerificationSettings__a2p_url_pattern_matcher", "(?:(?:https?|ftp)://)?[w/-?=%]+\\\\.[w/-?=%]+");
        a2.o("VerificationSettings__a2p_use_week_time_window", true);
        a2.m("VerificationSettings__carrier_id_max_verification_attempt_count", 2L);
        a = a2.n("VerificationSettings__default_policy_id", "");
        a2.m("VerificationSettings__expired_gaia_tokens_threshold_seconds", 1800L);
        a2.m("VerificationSettings__flash_call_expect_call_timeout_millis", 60000L);
        a2.m("VerificationSettings__flash_call_expect_fail_timeout_millis", 200L);
        a2.m("VerificationSettings__flash_call_millis_between_interceptions", 10000L);
        a2.o("VerificationSettings__is_1tv_param_in_verify_phone_number_api_allowed", true);
        a2.o("VerificationSettings__is_a2p_enabled", true);
        a2.o("VerificationSettings__is_carrier_id_enabled_for_multi_sim", false);
        a2.o("VerificationSettings__is_dual_sim_parallel_verification_enabled", false);
        a2.o("VerificationSettings__is_eligible_phone_range", false);
        a2.o("VerificationSettings__is_flash_call_enabled", true);
        a2.o("VerificationSettings__is_multi_challenge_verification", false);
        a2.o("VerificationSettings__is_non_persistent_mo_enabled", false);
        a2.o("VerificationSettings__is_one_time_verification_enabled", true);
        a2.o("VerificationSettings__is_required_consent_param_enabled", true);
        a2.o("VerificationSettings__is_silent_mt_enabled", false);
        a2.o("VerificationSettings__is_silent_mt_enabled_for_multi_sim", false);
        a2.o("VerificationSettings__is_verify_phone_number_api_v2_enabled", true);
        a2.m("VerificationSettings__max_task_count", 3L);
        a2.m("VerificationSettings__max_verification_attempt_count", 3L);
        a2.n("VerificationSettings__mo_ping_intervals_millis", "4000,1000,1000,3000,5000,5000,5000,5000,30000,30000,30000,240000,600000,300000");
        a2.m("VerificationSettings__mt_verification_timeout_secs", 1800L);
        a2.m("VerificationSettings__preferred_verification_method", 0L);
        a2.o("VerificationSettings__refresh_expired_gaia_tokens", true);
        a2.o("VerificationSettings__skip_mo_if_no_sms_manager", false);
        a2.o("VerificationSettings__stop_sending_phone_number_change_broadcast", true);
        a2.m("VerificationSettings__tasks_execution_timeout", 100L);
        a2.o("VerificationSettings__use_package_manager_for_mo_permissions", true);
    }

    @Override // defpackage.fdme
    public final String a() {
        return (String) a.b();
    }
}
