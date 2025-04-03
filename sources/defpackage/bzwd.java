package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzwd {
    public static final cfva A;
    public static final emyl B;
    public static final cfva C;
    public static final cfva D;
    public static final cfva E;
    private static final cfvk F;
    public static final cskc a = cskc.g("BugleEtouffee", "EtouffeeConfig");
    public static final cfva b;
    static final cfva c;
    public static final cfva d;
    static final cfva e;
    static final cfva f;
    public static final cfva g;
    public static final cfva h;
    public static final cfva i;
    public static final cfva j;
    public static final cfva k;
    public static final cfva l;
    static final cfva m;
    public static final cfva n;
    public static final cfva o;
    public static final cfva p;
    public static final cfva q;
    public static final cfva r;
    public static final cfva s;
    public static final cfva t;
    static final emyl u;
    static final emyl v;
    public static final cfva w;
    public static final cfva x;
    public static final emyl y;
    public static final cfva z;

    static {
        ecwh ecwhVar = cfvl.a;
        cfvk cfvkVar = new cfvk(cfvl.a, "Etouffee__");
        F = cfvkVar;
        b = cfvkVar.d("enable_etouffee", true);
        c = cfvkVar.d("enable_e2ee_receive", true);
        d = cfvkVar.a("prekey_count", 100);
        e = cfvl.t(cfvkVar.a, cfvkVar.b.concat("scytale_experiment_config"), new byte[0]);
        f = cfvkVar.d("use_official_mimetypes_for_outgoing", true);
        g = cfvkVar.d("enable_etouffee_ui", true);
        h = cfvkVar.d("enable_save_etouffee_to_telephony_setting", false);
        i = cfvkVar.d("enable_user_toggle_for_etouffee", false);
        j = cfvkVar.c("user_toggle_for_etouffee_learn_more_destination", "");
        k = cfvkVar.d("enable_etouffee_security_key_ui", false);
        l = cfvkVar.c("identity_details_learn_more_destination", "https://support.google.com/messages/answer/10252671#verify");
        m = cfvkVar.d("add_message_prefix", true);
        n = cfvkVar.c("message_prefix", "Encrypted message. Learn more https://support.google.com/messages?p=messages_e2ee");
        cfvkVar.c("previous_message_prefix", "Encrypted message. Learn more https://support.google.com/messages?p=messages_e2ee");
        o = cfvkVar.d("enable_open_etouffee_conversation_growthkit", true);
        p = cfvkVar.c("etouffee_privacy_setting_learn_more_destination", "");
        q = cfvkVar.d("enable_etouffee_message_failure_to_decrypt_ui", true);
        r = cfvkVar.d("always_enable_etouffee_message_failure_to_decrypt_ui", false);
        cfvkVar.a("etouffee_failure_to_decrypt_display_garbled_length", 25);
        s = cfvkVar.c("etouffee_failure_to_decrypt_dialog_learn_more_destination", "https://support.google.com/messages?p=messages_e2ee");
        t = cfvkVar.c("etouffee_tombstone_learn_more_destination", "https://support.google.com/messages?p=messages_e2ee");
        u = emys.a(new emyl() { // from class: bzwb
            @Override // defpackage.emyl
            public final Object get() {
                cskc cskcVar = bzwd.a;
                return cfvl.e(cfvl.b, "e2ee_overhead_constant", 410);
            }
        });
        v = emys.a(new emyl() { // from class: bzwc
            @Override // defpackage.emyl
            public final Object get() {
                cskc cskcVar = bzwd.a;
                return cfvl.c(cfvl.b, "e2ee_overhead_ratio", 1.36d);
            }
        });
        w = cfvkVar.a("identity_verification_max_retry", 5);
        x = cfvkVar.a("identity_verification_max_cache_size", 1000);
        y = cfvl.z(186182985, "use_messaging_identity_in_identity_worker_parameters");
        z = cfvkVar.a("id_fresh_buffer", 10000);
        A = cfvkVar.b("rcs_group_sync_throttle_in_ms", 300000L);
        B = cfvl.w("send_encrypted_display_imdn_with_control_message_source");
        C = cfvkVar.a("max_conversations_to_update_when_reprovisions", 20);
        cfvkVar.a("max_alpha_for_highlight_animation", 31);
        cfvkVar.b("highlight_animation_duration_in_milli_seconds", 1000L);
        cfvkVar.b("highlight_animation_delay_in_milli_seconds", 500L);
        D = cfvkVar.d("enable_e2ee_one_to_one_ui_v2", false);
        E = cfvkVar.d("enable_one_to_one_e2ee_details_page_section", false);
    }

    public static boolean a() {
        if (!csjc.a.equals(eovw.WEAR_BUILD) && !csjc.a.equals(eovw.WEAR_ENG_BUILD) && !csjc.a.equals(eovw.WEAR_FISH_FOOD_BUILD) && !csjc.a.equals(eovw.WEAR_DOG_FOOD_BUILD) && !csjc.a.equals(eovw.WEAR_OPEN_BETA_BUILD) && !csjc.a.equals(eovw.WEAR_RELEASE_BUILD)) {
            return ((Boolean) b.e()).booleanValue() && ((Boolean) cgyj.d.e()).booleanValue();
        }
        ersy.a("bugle.enable_wear_standalone_rcs", "bugle");
        return false;
    }

    public static boolean b() {
        return ((Boolean) D.e()).booleanValue();
    }

    public static boolean c() {
        return ((Boolean) E.e()).booleanValue();
    }

    static boolean d() {
        return a() && ((Boolean) c.e()).booleanValue();
    }

    static boolean e() {
        return ((Boolean) r.e()).booleanValue();
    }

    public static boolean f() {
        return a() && ((Boolean) g.e()).booleanValue();
    }

    static boolean g() {
        return ((Boolean) f.e()).booleanValue();
    }
}
