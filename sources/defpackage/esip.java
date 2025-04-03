package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum esip implements eyge {
    ATTACHMENT_TYPE_UNKNOWN(0),
    IMAGE_JPEG(1),
    IMAGE_JPG(2),
    IMAGE_PNG(3),
    IMAGE_GIF(4),
    IMAGE_WEBP(5),
    IMAGE_HEIF(6),
    IMAGE_WBMP(7),
    IMAGE_X_MS_BMP(8),
    IMAGE_HEIC(33),
    VIDEO_MP4(9),
    VIDEO_3G2(10),
    VIDEO_3GPP(11),
    VIDEO_WEBM(12),
    VIDEO_MKV(13),
    VIDEO_M4V(24),
    VIDEO_MPEG4(25),
    VIDEO_MPEG(26),
    VIDEO_3GP(27),
    AUDIO_AAC(14),
    AUDIO_AMR(15),
    AUDIO_MP3(16),
    AUDIO_MPEG(17),
    AUDIO_MPG(18),
    AUDIO_MP4(19),
    AUDIO_MP4_LATM(20),
    AUDIO_3GPP(21),
    AUDIO_OGG(22),
    AUDIO_OGG2(31),
    TEXT_VCARD(23),
    TEXT_VCARD_RECEIVE(34),
    APP_PDF(28),
    APP_TXT(29),
    APP_HTML(30),
    APP_SMIL(32),
    UNRECOGNIZED(-1);

    private final int L;

    esip(int i) {
        this.L = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.L;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
