package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzwf {
    public static final cfva a;
    public static final cfva b;
    public static final cfva c;
    public static final cfva d;
    public static final cfva e;
    public static final cfva f;
    public static final cfva g;
    public static final emyl h;
    public static final cfva i;
    public static final cfva j;
    public static final cfva k;
    public static int l;
    private static final cfvk m;
    private static final cfva n;

    static {
        ecwh ecwhVar = cfvl.a;
        cfvk cfvkVar = new cfvk(cfvl.a, "Etouffee__");
        m = cfvkVar;
        a = cfvkVar.d("enable_group_etouffee", false);
        b = cfvkVar.a("group_etouffee_size_limit", 100);
        c = cfvkVar.d("enable_message_resending_full", true);
        d = cfvkVar.d("enable_message_resending_full_receiver", true);
        e = cfvkVar.d("enable_message_resending_otk", true);
        f = cfvkVar.d("enable_message_resending_otk_receiver", true);
        g = cfvkVar.d("enable_message_otkh_sender", true);
        h = emys.a(new emyl() { // from class: bzwe
            @Override // defpackage.emyl
            public final Object get() {
                cfva cfvaVar = bzwf.a;
                return cfvl.i(cfvl.b, "enable_e2ee_info_data_source_in_details_page", false);
            }
        });
        i = cfvkVar.a("max_otk_time_span_days", 3);
        j = cfvkVar.a("max_pending_message_life_span_days", 5);
        k = cfvkVar.a("max_pending_decrypted_message_life_span_days", 3);
        cfvl.w("enable_group_downgrade_e2ee_on_plaintext");
        l = 1;
        n = cfvkVar.a("max_ftd_retry_count_group", 3);
    }

    public static int a(int i2, boolean z) {
        if (!g() || l == 1 || z || !csjc.e() || i2 <= 1) {
            return 1;
        }
        return Math.max(Math.min(l, 250 / i2), 1);
    }

    public static int b() {
        return ((Integer) n.e()).intValue();
    }

    public static boolean c() {
        return g() && ((Boolean) g.e()).booleanValue();
    }

    public static boolean d() {
        return g() && ((Boolean) c.e()).booleanValue();
    }

    public static boolean e() {
        return g() && ((Boolean) e.e()).booleanValue();
    }

    public static boolean f() {
        return g() && ((Boolean) f.e()).booleanValue();
    }

    public static boolean g() {
        return ((Boolean) a.e()).booleanValue() && bzwd.a();
    }

    public static boolean h() {
        return ((Boolean) a.e()).booleanValue() && bzwd.a();
    }
}
