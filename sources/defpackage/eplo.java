package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eplo implements eyge {
    MIME_UNKNOWN(0),
    MIME_OTHER(1),
    AUDIO_AAC(2),
    AUDIO_MP3(3),
    AUDIO_MPEG(4),
    AUDIO_MPG(5),
    AUDIO_MP4(6),
    AUDIO_MP4_LATM(7),
    AUDIO_OGG(8),
    VIDEO_3GP(9),
    VIDEO_3GPP(10),
    VIDEO_3G2(11),
    VIDEO_M4V(12),
    VIDEO_MP4(13),
    VIDEO_MPEG(14),
    VIDEO_MPEG4(15),
    VIDEO_WEBM(16),
    UNRECOGNIZED(-1);

    private final int t;

    eplo(int i) {
        this.t = i;
    }

    public static eplo b(int i) {
        switch (i) {
            case 0:
                return MIME_UNKNOWN;
            case 1:
                return MIME_OTHER;
            case 2:
                return AUDIO_AAC;
            case 3:
                return AUDIO_MP3;
            case 4:
                return AUDIO_MPEG;
            case 5:
                return AUDIO_MPG;
            case 6:
                return AUDIO_MP4;
            case 7:
                return AUDIO_MP4_LATM;
            case 8:
                return AUDIO_OGG;
            case 9:
                return VIDEO_3GP;
            case 10:
                return VIDEO_3GPP;
            case 11:
                return VIDEO_3G2;
            case 12:
                return VIDEO_M4V;
            case 13:
                return VIDEO_MP4;
            case 14:
                return VIDEO_MPEG;
            case 15:
                return VIDEO_MPEG4;
            case 16:
                return VIDEO_WEBM;
            default:
                return null;
        }
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.t;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
