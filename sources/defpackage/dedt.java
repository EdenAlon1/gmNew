package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dedt {
    public static final cfva a = cfvl.i(cfvl.b, "enable_external_video_trimmer", false);
    public static final cfva b;
    public static final cfva c;
    public static final cfva d;
    public static final cfup e;
    public static final cfup f;

    static {
        cfvl.f(cfvl.b, "trimming_threshold_ms", 30000L);
        b = cfvl.e(cfvl.b, "trimming_output_width", -1);
        c = cfvl.e(cfvl.b, "trimming_output_height", -1);
        d = cfvl.e(cfvl.b, "trimming_output_max_size", 4224);
        e = cfvl.i(cfvl.b, "video_trimmer_intent_logging", false);
        f = cfvl.i(cfvl.b, "video_trimmer_file_info_logging", false);
    }
}
