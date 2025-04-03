package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class stl {
    public static final emyl a;
    public static final emyl b;
    public static final emyl c;
    public static final emyl d;
    public static final emyl e;
    public static final emyl f;
    public static final emyl g;
    public static final cfup h;
    public static final cfup i;
    public static final cfup j;
    public static final emyl k;
    public static final emyl l;
    public static final cfup m;
    public static final emyl n;

    static {
        emyl w = cfvl.w("enable_birthday_nudge");
        w.getClass();
        a = w;
        emyl w2 = cfvl.w("enable_birthday_suggestions");
        w2.getClass();
        b = w2;
        emyl w3 = cfvl.w("enable_birthday_nudge_setting");
        w3.getClass();
        c = w3;
        emyl a2 = emys.a(new emyl() { // from class: sti
            @Override // defpackage.emyl
            public final Object get() {
                emyl emylVar = stl.a;
                return cfvl.f(cfvl.b, "birthday_nudge_recent_message_threshold_seconds", 31536000L);
            }
        });
        a2.getClass();
        d = a2;
        emyl a3 = emys.a(new emyl() { // from class: stj
            @Override // defpackage.emyl
            public final Object get() {
                emyl emylVar = stl.a;
                return cfvl.e(cfvl.b, "birthday_nudge_days_to_sync", 2);
            }
        });
        a3.getClass();
        e = a3;
        emyl a4 = emys.a(new emyl() { // from class: stk
            @Override // defpackage.emyl
            public final Object get() {
                emyl emylVar = stl.a;
                return cfvl.e(cfvl.b, "cake_animation_repeat_count", -1);
            }
        });
        a4.getClass();
        f = a4;
        emyl w4 = cfvl.w("enable_same_birthday_nudge_string");
        w4.getClass();
        g = w4;
        cfvl.w("enable_birthday_banner_settings_button").getClass();
        h = cfvl.m(cfvl.b, "birthday_suggestion_spec", "");
        i = cfvl.k(cfvl.b, "birthday_max_suggestions", -1);
        j = cfvl.k(cfvl.b, "birthday_max_sticker_suggestions", -1);
        emyl w5 = cfvl.w("enable_save_birthday_banner");
        w5.getClass();
        k = w5;
        emyl w6 = cfvl.w("enable_birthday_contact_name_fix");
        w6.getClass();
        l = w6;
        m = cfvl.k(cfvl.b, "save_birthday_banner_max_impressions", 3);
        cfvl.k(cfvl.b, "birthday_banner_max_impressions", 3);
        emyl y = cfvl.y("enable_birthday_coverage_logging");
        y.getClass();
        n = y;
    }

    public static final boolean a() {
        Object e2 = ((cfup) a.get()).e();
        e2.getClass();
        return ((Boolean) e2).booleanValue();
    }
}
