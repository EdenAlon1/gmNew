package defpackage;

import android.text.TextUtils;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import com.android.vcard.VCardConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lre {
    private static final ArrayList a = new ArrayList();
    private static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(String str, String str2) {
        char c;
        lrd c2;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1365340241:
                if (str.equals("audio/vnd.dts.hd;profile=lbr")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 550520934:
                if (str.equals("audio/vnd.dts.uhd;profile=p2")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return 9;
            case 1:
                if (str2 == null || (c2 = c(str2)) == null) {
                    return 0;
                }
                return c2.a();
            case 2:
                return 5;
            case 3:
                return 6;
            case 4:
                return 18;
            case 5:
                return 17;
            case 6:
                return 7;
            case 7:
            case '\b':
                return 8;
            case '\t':
                return 30;
            case '\n':
                return 14;
            case 11:
                return 20;
            default:
                return 0;
        }
    }

    public static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (i(str)) {
            return 1;
        }
        if (l(str)) {
            return 2;
        }
        if (k(str)) {
            return 3;
        }
        if (j(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        int size = a.size();
        for (int i = 0; i < size; i++) {
            lrc lrcVar = (lrc) a.get(i);
            String str2 = lrcVar.a;
            if (str.equals(null)) {
                int i2 = lrcVar.c;
                return 0;
            }
        }
        return -1;
    }

    static lrd c(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        lti.f(group);
        String group2 = matcher.group(2);
        try {
            return new lrd(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String d(String str) {
        lrd c;
        String str2 = null;
        if (str != null) {
            String c2 = emuz.c(str.trim());
            if (!c2.startsWith("avc1") && !c2.startsWith("avc3")) {
                if (!c2.startsWith("hev1") && !c2.startsWith("hvc1")) {
                    if (!c2.startsWith("dvav") && !c2.startsWith("dva1") && !c2.startsWith("dvhe") && !c2.startsWith("dvh1")) {
                        if (!c2.startsWith("av01")) {
                            if (!c2.startsWith("vp9") && !c2.startsWith("vp09")) {
                                if (!c2.startsWith("vp8") && !c2.startsWith("vp08")) {
                                    if (!c2.startsWith("mp4a")) {
                                        if (!c2.startsWith("mha1")) {
                                            if (!c2.startsWith("mhm1")) {
                                                if (!c2.startsWith("ac-3") && !c2.startsWith("dac3")) {
                                                    if (!c2.startsWith("ec-3") && !c2.startsWith("dec3")) {
                                                        if (!c2.startsWith("ec+3")) {
                                                            if (!c2.startsWith("ac-4") && !c2.startsWith("dac4")) {
                                                                if (!c2.startsWith("dtsc")) {
                                                                    if (!c2.startsWith("dtse")) {
                                                                        if (!c2.startsWith("dtsh") && !c2.startsWith("dtsl")) {
                                                                            if (!c2.startsWith("dtsx")) {
                                                                                if (!c2.startsWith("opus")) {
                                                                                    if (!c2.startsWith("vorbis")) {
                                                                                        if (!c2.startsWith("flac")) {
                                                                                            if (!c2.startsWith("stpp")) {
                                                                                                if (!c2.startsWith("wvtt")) {
                                                                                                    if (!c2.contains("cea708")) {
                                                                                                        if (!c2.contains("eia608") && !c2.contains("cea608")) {
                                                                                                            int size = a.size();
                                                                                                            int i = 0;
                                                                                                            while (true) {
                                                                                                                if (i >= size) {
                                                                                                                    break;
                                                                                                                }
                                                                                                                lrc lrcVar = (lrc) a.get(i);
                                                                                                                String str3 = lrcVar.b;
                                                                                                                if (c2.startsWith(null)) {
                                                                                                                    String str4 = lrcVar.a;
                                                                                                                    break;
                                                                                                                }
                                                                                                                i++;
                                                                                                            }
                                                                                                        } else {
                                                                                                            return "application/cea-608";
                                                                                                        }
                                                                                                    } else {
                                                                                                        return "application/cea-708";
                                                                                                    }
                                                                                                } else {
                                                                                                    return "text/vtt";
                                                                                                }
                                                                                            } else {
                                                                                                return "application/ttml+xml";
                                                                                            }
                                                                                        } else {
                                                                                            return "audio/flac";
                                                                                        }
                                                                                    } else {
                                                                                        return "audio/vorbis";
                                                                                    }
                                                                                } else {
                                                                                    return "audio/opus";
                                                                                }
                                                                            } else {
                                                                                return "audio/vnd.dts.uhd;profile=p2";
                                                                            }
                                                                        } else {
                                                                            return "audio/vnd.dts.hd";
                                                                        }
                                                                    } else {
                                                                        return "audio/vnd.dts.hd;profile=lbr";
                                                                    }
                                                                } else {
                                                                    return "audio/vnd.dts";
                                                                }
                                                            } else {
                                                                return "audio/ac4";
                                                            }
                                                        } else {
                                                            return "audio/eac3-joc";
                                                        }
                                                    } else {
                                                        return "audio/eac3";
                                                    }
                                                } else {
                                                    return "audio/ac3";
                                                }
                                            } else {
                                                return "audio/mhm1";
                                            }
                                        } else {
                                            return "audio/mha1";
                                        }
                                    } else {
                                        if (c2.startsWith("mp4a.") && (c = c(c2)) != null) {
                                            str2 = e(c.a);
                                        }
                                        return str2 == null ? "audio/mp4a-latm" : str2;
                                    }
                                } else {
                                    return "video/x-vnd.on2.vp8";
                                }
                            } else {
                                return "video/x-vnd.on2.vp9";
                            }
                        } else {
                            return "video/av01";
                        }
                    } else {
                        return "video/dolby-vision";
                    }
                } else {
                    return "video/hevc";
                }
            } else {
                return "video/avc";
            }
        }
        return null;
    }

    public static String e(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
            case 97:
            case 98:
            case 99:
            case VCardConstants.DEFAULT_PREF /* 100 */:
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String f(String str) {
        char c;
        if (str == null) {
            return null;
        }
        String c2 = emuz.c(str);
        switch (c2.hashCode()) {
            case -1833600100:
                if (c2.equals("video/x-mvhevc")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1007807498:
                if (c2.equals("audio/x-flac")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -979095690:
                if (c2.equals("application/x-mpegurl")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -586683234:
                if (c2.equals("audio/x-wav")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -432836268:
                if (c2.equals("audio/mpeg-l1")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -432836267:
                if (c2.equals("audio/mpeg-l2")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 187090231:
                if (c2.equals("audio/mp3")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return "video/mv-hevc";
            case 1:
                return "audio/flac";
            case 2:
                return "audio/mpeg";
            case 3:
                return "audio/wav";
            case 4:
                return "application/x-mpegURL";
            case 5:
                return "audio/mpeg-L1";
            case 6:
                return "audio/mpeg-L2";
            default:
                return c2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean g(String str, String str2) {
        char c;
        lrd c2;
        int a2;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case '\n':
                if (str2 != null && (c2 = c(str2)) != null && (a2 = c2.a()) != 0 && a2 != 16) {
                }
                break;
        }
        return false;
    }

    public static boolean h(String str, String str2) {
        String str3 = null;
        if (str != null) {
            String[] ai = lvf.ai(str);
            StringBuilder sb = new StringBuilder();
            for (String str4 : ai) {
                if (str2.equals(d(str4))) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str4);
                }
            }
            if (sb.length() > 0) {
                str3 = sb.toString();
            }
        }
        return str3 != null;
    }

    public static boolean i(String str) {
        return "audio".equals(m(str));
    }

    public static boolean j(String str) {
        return "image".equals(m(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean k(String str) {
        return ConversationSuggestion.SUGGESTION_PROPERTY_TEXT.equals(m(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean l(String str) {
        return "video".equals(m(str));
    }

    private static String m(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }
}
