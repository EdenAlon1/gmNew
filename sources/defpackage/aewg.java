package defpackage;

import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aewg {
    static final cfva a = cfvl.e(cfvl.b, "conversation_default_label", SuperSortLabel.ALL.i);
    public static final cfva b = cfvl.n(cfvl.b, "conversation_labels_enabled", false);
    static final cfva c = cfvl.d(cfvl.b, "processed_messages_threshold", 0.5f);
    static final cfva d = cfvl.d(cfvl.b, "processed_messages_max_sorting_notice", 0.8f);
    static final cfva e = cfvl.h(cfvl.b, "supersort_mapping_strategy", "contactsToPersonalDefaultToMore");
    static final cfva f = cfvl.h(cfvl.b, "supersort_model_id", "");
    public static final cfva g = cfvl.h(cfvl.b, "supersort_intent_label_mapping", "");
    public static final cfva h = cfvl.n(cfvl.b, "enable_home_screen_banner", false);
    public static final emyl i;
    public static final cfva j;
    static final emyl k;
    public static final cfva l;
    public static final cfva m;
    public static final emyl n;
    private static final enhk o;

    static {
        cfvl.i(cfvl.b, "supersort_enable_update_donation_banner", false);
        cfvl.x(185831101, "supersort_enable_primary_view_banner");
        i = cfvl.y("supersort_enable_otp_banner_in_business_updates");
        j = cfvl.e(cfvl.b, "supersort_hide_category_scheme", 0);
        enhd enhdVar = new enhd();
        enhdVar.k(SuperSortLabel.BUSINESS_UPDATE, 16);
        enhdVar.k(SuperSortLabel.TRANSACTION, 1);
        enhdVar.k(SuperSortLabel.UPDATE, 2);
        enhdVar.k(SuperSortLabel.OTP, 4);
        enhdVar.k(SuperSortLabel.PROMOTION, 8);
        o = enhdVar.c();
        k = cfvl.x(187727046, "supersort_default_to_all_if_personal_is_empty");
        l = cfvl.i(cfvl.b, "supersort_enable_attaching_psd", false);
        m = cfvl.h(cfvl.b, "supersort_grammars_mdd_group_name", "supersort_india_grammars");
        n = cfvl.w("enable_report_spam_conversation_banner");
        cfvl.y("supersort_badge_all_filter");
        cfvl.y("chip_width_adjustments");
    }

    public static float a() {
        return ((Float) d.e()).floatValue();
    }

    public static float b() {
        return ((Float) c.e()).floatValue();
    }

    public static SuperSortLabel c() {
        return SuperSortLabel.a(((Integer) a.e()).intValue());
    }

    public static String d() {
        return (String) e.e();
    }

    public static String e() {
        return (String) f.e();
    }

    public static boolean f() {
        return ((Boolean) ((cfup) k.get()).e()).booleanValue();
    }

    public static boolean g(SuperSortLabel superSortLabel) {
        Integer num = (Integer) o.get(superSortLabel);
        return num != null && (((Integer) j.e()).intValue() & num.intValue()) == num.intValue();
    }

    public static boolean h() {
        return ((Boolean) b.e()).booleanValue();
    }

    public static boolean i() {
        return ((Boolean) ((cfup) i.get()).e()).booleanValue();
    }

    public static boolean j() {
        return ((Boolean) ((cfup) n.get()).e()).booleanValue();
    }
}
