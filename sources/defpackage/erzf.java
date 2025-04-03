package defpackage;

import androidx.car.app.navigation.model.Maneuver;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum erzf implements eyge {
    UNSPECIFIED_TYPE(0),
    IMAGE_JPEG(1),
    IMAGE_JPG(2),
    IMAGE_PNG(3),
    IMAGE_GIF(4),
    IMAGE_WBMP(5),
    IMAGE_X_MS_BMP(6),
    IMAGE_UNSPECIFIED(7),
    VIDEO_MP4(8),
    VIDEO_3G2(9),
    VIDEO_3GPP(10),
    VIDEO_WEBM(11),
    VIDEO_MKV(12),
    VIDEO_UNSPECIFIED(13),
    AUDIO_AAC(14),
    AUDIO_AMR(15),
    AUDIO_MP3(16),
    AUDIO_MPEG(17),
    AUDIO_MPG(18),
    AUDIO_MP4(19),
    AUDIO_MP4_LATM(20),
    AUDIO_3GPP(21),
    AUDIO_OGG(22),
    AUDIO_UNSPECIFIED(23),
    TEXT_VCARD(24),
    APP_PDF(25),
    APP_TXT(26),
    APP_HTML(27),
    APP_DOC(28),
    APP_DOCX(29),
    APP_PPTX(30),
    APP_PPT(31),
    APP_XLSX(32),
    APP_XLS(33),
    APP_APK(34),
    APP_ZIP(35),
    APP_JAR(36),
    APP_UNSPECIFIED(37),
    CAL_TEXT_VCALENDAR(38),
    CAL_TEXT_XVCALENDAR(39),
    CAL_TEXT_CALENDAR(40),
    CAL_APPLICATION_VCS(41),
    CAL_APPLICATION_ICS(42),
    CAL_APPLICATION_HBSVCS(43),
    UNRECOGNIZED(-1);

    private final int U;

    erzf(int i) {
        this.U = i;
    }

    public static erzf b(int i) {
        switch (i) {
            case 0:
                return UNSPECIFIED_TYPE;
            case 1:
                return IMAGE_JPEG;
            case 2:
                return IMAGE_JPG;
            case 3:
                return IMAGE_PNG;
            case 4:
                return IMAGE_GIF;
            case 5:
                return IMAGE_WBMP;
            case 6:
                return IMAGE_X_MS_BMP;
            case 7:
                return IMAGE_UNSPECIFIED;
            case 8:
                return VIDEO_MP4;
            case 9:
                return VIDEO_3G2;
            case 10:
                return VIDEO_3GPP;
            case 11:
                return VIDEO_WEBM;
            case 12:
                return VIDEO_MKV;
            case 13:
                return VIDEO_UNSPECIFIED;
            case 14:
                return AUDIO_AAC;
            case 15:
                return AUDIO_AMR;
            case 16:
                return AUDIO_MP3;
            case 17:
                return AUDIO_MPEG;
            case 18:
                return AUDIO_MPG;
            case 19:
                return AUDIO_MP4;
            case 20:
                return AUDIO_MP4_LATM;
            case 21:
                return AUDIO_3GPP;
            case 22:
                return AUDIO_OGG;
            case 23:
                return AUDIO_UNSPECIFIED;
            case 24:
                return TEXT_VCARD;
            case 25:
                return APP_PDF;
            case 26:
                return APP_TXT;
            case 27:
                return APP_HTML;
            case 28:
                return APP_DOC;
            case 29:
                return APP_DOCX;
            case 30:
                return APP_PPTX;
            case 31:
                return APP_PPT;
            case 32:
                return APP_XLSX;
            case 33:
                return APP_XLS;
            case 34:
                return APP_APK;
            case 35:
                return APP_ZIP;
            case 36:
                return APP_JAR;
            case 37:
                return APP_UNSPECIFIED;
            case 38:
                return CAL_TEXT_VCALENDAR;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return CAL_TEXT_XVCALENDAR;
            case 40:
                return CAL_TEXT_CALENDAR;
            case 41:
                return CAL_APPLICATION_VCS;
            case 42:
                return CAL_APPLICATION_ICS;
            case 43:
                return CAL_APPLICATION_HBSVCS;
            default:
                return null;
        }
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.U;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
