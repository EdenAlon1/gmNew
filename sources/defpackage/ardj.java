package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ardj {
    public static final cfva a;
    public static final cfup b;
    public static final cfup c;
    public static final cfup d;
    public static final cfup e;
    public static final cfva f;
    public static final cfva g;
    public static final cfva h;
    public static final cfup i;
    public static final cfva j;

    static {
        cfvl.n(cfvl.b, "enable_audio_attachment_refactor", false);
        a = cfvl.n(cfvl.b, "enable_audio_quality_improvements", false);
        b = cfvl.e(cfvl.b, "improved_audio_limit_seconds", 120);
        c = cfvl.e(cfvl.b, "rcs_audio_limit_seconds", 600);
        d = cfvl.e(cfvl.b, "improved_audio_samples_per_second", 16000);
        e = cfvl.e(cfvl.b, "improved_audio_bits_per_second", 28000);
        f = cfvl.n(cfvl.b, "enable_multiplexed_metadata_validation", false);
        g = cfvl.n(cfvl.b, "enable_voice_moods", false);
        h = cfvl.u(cfvl.b, "voice_moods_config", ardl.a, new ecwg() { // from class: ardi
            @Override // defpackage.ecwg
            public final Object a(byte[] bArr) {
                return (ardl) eyfy.parseFrom(ardl.a, bArr);
            }
        });
        i = cfvl.k(cfvl.b, "audio_level_poll_interval", 100);
        j = cfvl.k(cfvl.b, "voice_button_background_value", 0);
    }
}
