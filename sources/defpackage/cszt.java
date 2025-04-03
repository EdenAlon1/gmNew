package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cszt {
    public static final cfva A;
    public static final cfva a;
    public static final cfva b;
    public static final cfva c;
    public static final cfva d;
    public static final cfva e;
    public static final cfva f;
    public static final cfva g;
    public static final cfva h;
    public static final cfva i;
    public static final cfva j;
    public static final cfva k;
    public static final cfva l;
    public static final cfup m;
    public static final cfup n;
    public static final cfup o;
    public static final cfup p;
    public static final cfva q;
    public static final cfva r;
    public static final cfva s;
    public static final cfva t;
    public static final cfva u;
    public static final cfva v;
    public static final cfva w;
    public static final cfva x;
    public static final cfva y;
    public static final cfva z;

    static {
        cfvl.i(cfvl.b, "use_hats_next", false);
        a = cfvl.q(161943181);
        b = cfvl.h(cfvl.b, "hats_api_key", "AIzaSyA-5SiTMe9aF3aGRp_pR87QxwCox6x0bpo");
        c = cfvl.h(cfvl.b, "general_survey_site_id", "pHL5GbnNZ0n5ZCStzjH0UAKXnZHt");
        d = cfvl.c(cfvl.b, "general_frequency", 0.04d);
        e = cfvl.h(cfvl.b, "smart_replies_survey_site_id", "9QuBEJKqA0n5ZCStzjH0WKid1hmT");
        f = cfvl.c(cfvl.b, "smart_replies_frequency", 0.04d);
        g = cfvl.h(cfvl.b, "sticker_gif_survey_site_id", "WCMJEuvXy0n5ZCStzjH0R6Sp9Qym");
        h = cfvl.c(cfvl.b, "sticker_gif_frequency", 0.08d);
        i = cfvl.h(cfvl.b, "mms_groups_survey_site_id", "Q5Mnx7rkD0n5ZCStzjH0SiBaeUsY");
        j = cfvl.c(cfvl.b, "mms_groups_frequency", 0.04d);
        k = cfvl.h(cfvl.b, "rcs_groups_survey_site_id", "bKKqjxVPi0n5ZCStzjH0TJ8bP6Et");
        l = cfvl.c(cfvl.b, "rcs_groups_frequency", 0.2d);
        m = cfvl.f(cfvl.b, "delay_between_prompts_millis", TimeUnit.DAYS.toMillis(90L));
        n = cfvl.e(cfvl.b, "versions_between_prompts", 1);
        o = cfvl.f(cfvl.b, "min_time_since_install_millis", TimeUnit.DAYS.toMillis(7L));
        p = cfvl.e(cfvl.b, "cycle_length", 90);
        q = cfvl.i(cfvl.b, "use_proof_mode", false);
        r = cfvl.i(cfvl.b, "bypass_hats_reasons", false);
        s = cfvl.i(cfvl.b, "provide_first_eligible_survey", false);
        t = cfvl.h(cfvl.b, "voice_message_transcription_survey_site_id", "CNZbj7VVy0n5ZCStzjH0W2HJaysm");
        u = cfvl.c(cfvl.b, "voice_message_transcription_survey_frequency", 0.04d);
        v = cfvl.h(cfvl.b, "penpal_conversation_survey_site_id", "s1yYC4h130n5ZCStzjH0YNGdvq9B");
        w = cfvl.c(cfvl.b, "penpal_conversation_survey_frequency", 0.04d);
        x = cfvl.h(cfvl.b, "rcs_disabled_survey_site_id", "VnJHhhSmW0n5ZCStzjH0VB9ag1op");
        y = cfvl.c(cfvl.b, "rcs_disabled_survey_frequency", 0.32d);
        z = cfvl.f(cfvl.b, "rcs_disabled_survey_eligibility_days", 14L);
        cfvl.h(cfvl.b, "rcs_disabled__v2_survey_site_id", "bzEzFFZYH0n5ZCStzjH0Q6NzrHhk");
        A = cfvl.c(cfvl.b, "rcs_disabled_v2_survey_frequency", 0.04d);
    }
}
