package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uky {
    public static final cfva a = cfvl.n(cfvl.b, "enable_compose_gifs_in_emotive_button", false);
    public static final cfva b = cfvl.n(cfvl.b, "enable_compose_stickers_in_emotive_button", false);
    public static final cfva c = cfvl.n(cfvl.b, "enable_gifs_stickers_shortcuts", false);
    public static final cfva d = cfvl.n(cfvl.b, "enable_compose_sending_webp_over_rcs", false);
    public static final cfva e = cfvl.n(cfvl.b, "enable_compose_shortcuts_screen", false);
    public static final cfva f = cfvl.m(cfvl.b, "emoji_preferences_strategy", dqpw.b.name());
    public static final cfva g = cfvl.n(cfvl.b, "enable_compose_camera_gallery_screen", false);
    public static final cfva h;
    public static final cfva i;
    public static final cfva j;
    public static final cfva k;
    public static final cfva l;
    public static final emyl m;
    public static final emyl n;
    public static final cfva o;
    public static final emyl p;
    public static final cfup q;
    private static final cfuz r;

    static {
        cfvl.n(cfvl.b, "enable_compose_camera_in_gallery_screen", false);
        h = cfvl.n(cfvl.b, "force_mini_camera_simple_viewfinder", false);
        i = cfvl.n(cfvl.b, "expand_compose_camera_gallery_to_max_height_on_header", true);
        j = cfvl.n(cfvl.b, "enable_system_picker_tile_in_gallery_screen", false);
        k = cfvl.n(cfvl.b, "enable_compose_header_in_gallery_screen", false);
        l = cfvl.n(cfvl.b, "enable_compose_tracing", false);
        ecwh ecwhVar = cfvl.b;
        final dwqd dwqdVar = dwqd.a;
        dwqdVar.getClass();
        r = cfvl.s(ecwhVar, "emoji_search_manifest_file_flag", new emyl() { // from class: ukx
            @Override // defpackage.emyl
            public final Object get() {
                return dwqd.this.toByteArray();
            }
        });
        m = cfvl.w("enable_emotive_container_tooltip");
        n = cfvl.x(220339402, "enable_catch_sticker_api_ioexception");
        o = cfvl.i(cfvl.b, "follow_keyboard_transient_heights_on_programmatical_close", true);
        p = cfvl.y("enable_voice_input_redesign");
        q = cfvl.e(cfvl.b, "max_video_record_duration_seconds", 30);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    public static int a() {
        ?? booleanValue = ((Boolean) cful.ap.e()).booleanValue();
        int i2 = booleanValue;
        if (((Boolean) e.e()).booleanValue()) {
            i2 = booleanValue + 1;
        }
        int i3 = i2;
        if (((Boolean) g.e()).booleanValue()) {
            i3 = i2 + 1;
        }
        return ((Boolean) ((cfup) p.get()).e()).booleanValue() ? i3 + 1 : i3;
    }

    public static dwqd b() {
        try {
            return (dwqd) eyfy.parseFrom(dwqd.a, (byte[]) r.e(), eyfc.a());
        } catch (eygu unused) {
            return dwqd.a;
        }
    }

    public static boolean c() {
        return ((Boolean) cful.g.e()).booleanValue() && ((Boolean) cful.ap.e()).booleanValue() && ((Boolean) a.e()).booleanValue();
    }

    public static boolean d() {
        return ((Boolean) cful.g.e()).booleanValue() && ((Boolean) cful.ap.e()).booleanValue() && ((Boolean) b.e()).booleanValue();
    }
}
