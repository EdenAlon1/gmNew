package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.model.Alert;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.Inflater;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lvf {
    public static final int a;
    public static final String b;
    public static final byte[] c;
    public static final long[] d;
    public static final int[] e;
    private static final Pattern f;
    private static HashMap g;
    private static final String[] h;
    private static final String[] i;
    private static final int[] j;
    private static final int[] k;

    static {
        int i2 = Build.VERSION.SDK_INT;
        a = i2;
        b = Build.DEVICE + ", " + Build.MODEL + ", " + Build.MANUFACTURER + ", " + i2;
        c = new byte[0];
        d = new long[0];
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        h = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        i = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        j = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        k = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        e = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, EnergyProfile.EVCONNECTOR_TYPE_OTHER, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, BasePaymentResult.ERROR_REQUEST_TIMEOUT, 206, 219, 220, 213, 210, PrivateKeyType.INVALID, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, BasePaymentResult.ERROR_REQUEST_FAILED, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static Drawable A(Context context, Resources resources, int i2) {
        return resources.getDrawable(i2, context.getTheme());
    }

    public static AudioFormat B(int i2, int i3, int i4) {
        return new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(i4).build();
    }

    public static Handler C() {
        Looper myLooper = Looper.myLooper();
        lti.g(myLooper);
        return new Handler(myLooper, null);
    }

    public static Handler D() {
        return new Handler(E(), null);
    }

    public static Looper E() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static lqc F(int i2, int i3, int i4) {
        lqb lqbVar = new lqb();
        lqbVar.c("audio/raw");
        lqbVar.C = i3;
        lqbVar.D = i4;
        lqbVar.E = i2;
        return new lqc(lqbVar);
    }

    public static String G(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String H(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static String I(byte[] bArr, int i2, int i3) {
        return new String(bArr, i2, i3, StandardCharsets.UTF_8);
    }

    public static String J(StringBuilder sb, Formatter formatter, long j2) {
        if (j2 == -9223372036854775807L) {
            j2 = 0;
        }
        long abs = Math.abs(j2) + 500;
        sb.setLength(0);
        String str = j2 < 0 ? "-" : "";
        long j3 = abs / 1000;
        long j4 = j3 / 3600;
        long j5 = (j3 / 60) % 60;
        long j6 = j3 % 60;
        return j4 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j6)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j5), Long.valueOf(j6)).toString();
    }

    public static String K(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            luj.d("Util", "Failed to read system property ".concat(str), e2);
            return null;
        }
    }

    public static String L(int i2) {
        switch (i2) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return ConversationSuggestion.SUGGESTION_PROPERTY_TEXT;
            case 4:
                return "image";
            case 5:
                return "metadata";
            default:
                return "camera motion";
        }
    }

    public static String M(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        return str + "/" + str2 + " (Linux;Android " + Build.VERSION.RELEASE + ") AndroidXMedia3/1.6.0-beta01";
    }

    public static String N(int i2) {
        return Integer.toString(i2, 36);
    }

    public static String O(Context context, String str) {
        Throwable th;
        InputStream inputStream;
        try {
            inputStream = context.getAssets().open(str);
            try {
                String H = H(eoej.b(inputStream));
                S(inputStream);
                return H;
            } catch (Throwable th2) {
                th = th2;
                S(inputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
        }
    }

    public static String P(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String c2 = emuz.c(str);
        int i2 = 0;
        String str2 = ah(c2, "-")[0];
        if (g == null) {
            g = ar();
        }
        String str3 = (String) g.get(str2);
        if (str3 != null) {
            c2 = str3.concat(String.valueOf(c2.substring(str2.length())));
            str2 = str3;
        }
        if ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) {
            while (true) {
                String[] strArr = i;
                int length = strArr.length;
                if (i2 >= 18) {
                    break;
                }
                if (c2.startsWith(strArr[i2])) {
                    return String.valueOf(strArr[i2 + 1]).concat(String.valueOf(c2.substring(strArr[i2].length())));
                }
                i2 += 2;
            }
        }
        return c2;
    }

    public static ExecutorService Q(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: lvd
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                int i2 = lvf.a;
                return new Thread(runnable, str);
            }
        });
    }

    public static ScheduledExecutorService R(final String str) {
        return Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: lve
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                int i2 = lvf.a;
                return new Thread(runnable, str);
            }
        });
    }

    public static void S(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean T(SparseArray sparseArray, int i2) {
        return sparseArray.indexOfKey(i2) >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x003f, code lost:
    
        r4.J(r3);
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean U(defpackage.luv r3, defpackage.luv r4, java.util.zip.Inflater r5) {
        /*
            int r0 = r3.b()
            r1 = 0
            if (r0 > 0) goto L8
            return r1
        L8:
            int r0 = r4.c()
            int r2 = r3.b()
            if (r0 >= r2) goto L1a
            int r0 = r3.b()
            int r0 = r0 + r0
            r4.D(r0)
        L1a:
            if (r5 != 0) goto L21
            java.util.zip.Inflater r5 = new java.util.zip.Inflater
            r5.<init>()
        L21:
            byte[] r0 = r3.a
            int r2 = r3.b
            int r3 = r3.b()
            r5.setInput(r0, r2, r3)
            r3 = r1
        L2d:
            byte[] r0 = r4.a     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            int r2 = r4.c()     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            int r2 = r2 - r3
            int r0 = r5.inflate(r0, r3, r2)     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            int r3 = r3 + r0
            boolean r0 = r5.finished()     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            if (r0 == 0) goto L44
            r4.J(r3)     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            r1 = 1
            goto L65
        L44:
            boolean r0 = r5.needsDictionary()     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            if (r0 != 0) goto L65
            boolean r0 = r5.needsInput()     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            if (r0 == 0) goto L51
            goto L65
        L51:
            int r0 = r4.c()     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            if (r3 != r0) goto L2d
            int r0 = r4.c()     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            int r0 = r0 + r0
            r4.D(r0)     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            goto L2d
        L60:
            r3 = move-exception
            r5.reset()
            throw r3
        L65:
            r5.reset()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lvf.U(luv, luv, java.util.zip.Inflater):boolean");
    }

    public static boolean V(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean W(String str) {
        char c2;
        switch (str.hashCode()) {
            case -1487656890:
                if (str.equals("image/avif")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -1487464693:
                if (str.equals("image/heic")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -1487464690:
                if (str.equals("image/heif")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -1487394660:
                if (str.equals("image/jpeg")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1487018032:
                if (str.equals("image/webp")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -879272239:
                if (str.equals("image/bmp")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -879258763:
                if (str.equals("image/png")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            case 6:
                return a >= 34;
            default:
                return false;
        }
    }

    public static boolean X(int i2) {
        return i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4;
    }

    public static boolean Y(Context context) {
        int i2 = a;
        if (i2 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i2 == 30 && (emuz.e(Build.MODEL, "moto g(20)") || emuz.e(Build.MODEL, "rmx3231"))) {
            return true;
        }
        return i2 == 34 && emuz.e(Build.MODEL, "sm-x200");
    }

    public static boolean Z(int i2) {
        return i2 == 10 || i2 == 13;
    }

    public static float a(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f2, f4));
    }

    public static boolean aa() {
        String c2 = emuz.c(Build.DEVICE);
        return c2.contains("emulator") || c2.contains("emu64a") || c2.contains("emu64x") || c2.contains("generic");
    }

    public static boolean ab(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean ac(luv luvVar, luv luvVar2, Inflater inflater) {
        return luvVar.b() > 0 && luvVar.d() == 120 && U(luvVar, luvVar2, inflater);
    }

    public static boolean ad(lro lroVar, boolean z) {
        if (lroVar == null || !lroVar.Y() || lroVar.u() == 1 || lroVar.u() == 4) {
            return true;
        }
        return z && lroVar.v() != 0;
    }

    public static byte[] ae(String str) {
        return str.getBytes(StandardCharsets.UTF_8);
    }

    public static Object[] af(Object[] objArr, int i2) {
        lti.a(i2 <= objArr.length);
        return Arrays.copyOf(objArr, i2);
    }

    public static String[] ag(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] ah(String str, String str2) {
        return str.split(str2, 2);
    }

    public static String[] ai(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : ag(str.trim(), "(\\s*,\\s*)");
    }

    public static int aj(long[] jArr, long j2, boolean z) {
        int i2;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        while (true) {
            i2 = binarySearch + 1;
            if (i2 >= jArr.length || jArr[i2] != j2) {
                break;
            }
            binarySearch = i2;
        }
        return !z ? i2 : binarySearch;
    }

    public static int ak(long[] jArr, long j2, boolean z) {
        int i2;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            while (true) {
                int i3 = binarySearch - 1;
                if (i3 < 0 || jArr[i3] != j2) {
                    break;
                }
                binarySearch = i3;
            }
            i2 = binarySearch;
        }
        return z ? Math.max(0, i2) : i2;
    }

    public static void al(lro lroVar, boolean z) {
        if (ad(lroVar, z)) {
            ap(lroVar);
        } else {
            ao(lroVar);
        }
    }

    public static void am(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static void an(long[] jArr, long j2) {
        long j3;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i2 = 0;
        if (j2 >= 1000000 && j2 % 1000000 == 0) {
            long e2 = erlc.e(j2, 1000000L, RoundingMode.UNNECESSARY);
            while (i2 < jArr.length) {
                jArr[i2] = erlc.e(jArr[i2], e2, roundingMode);
                i2++;
            }
            return;
        }
        if (j2 < 1000000 && 1000000 % j2 == 0) {
            long e3 = erlc.e(1000000L, j2, RoundingMode.UNNECESSARY);
            while (i2 < jArr.length) {
                jArr[i2] = erlc.h(jArr[i2], e3);
                i2++;
            }
            return;
        }
        int i3 = 0;
        while (i3 < jArr.length) {
            long j4 = jArr[i3];
            if (j4 != 0) {
                if (j2 >= j4 && j2 % j4 == 0) {
                    jArr[i3] = erlc.e(1000000L, erlc.e(j2, j4, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j2 >= j4 || j4 % j2 != 0) {
                    j3 = j2;
                    jArr[i3] = aq(j4, 1000000L, j3, roundingMode);
                    i3++;
                    j2 = j3;
                } else {
                    jArr[i3] = erlc.h(1000000L, erlc.e(j4, j2, RoundingMode.UNNECESSARY));
                }
            }
            j3 = j2;
            i3++;
            j2 = j3;
        }
    }

    public static void ao(lro lroVar) {
        if (lroVar.n(1)) {
            lroVar.d();
        }
    }

    public static void ap(lro lroVar) {
        int u = lroVar.u();
        if (u == 1) {
            if (lroVar.n(2)) {
                lroVar.Q();
            }
        } else if (u == 4 && lroVar.n(4)) {
            lroVar.i();
        }
        if (lroVar.n(1)) {
            lroVar.e();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0098, code lost:
    
        if (java.lang.Math.abs(r9 - r4) == 0.5d) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long aq(long r9, long r11, long r13, java.math.RoundingMode r15) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lvf.aq(long, long, long, java.math.RoundingMode):long");
    }

    private static HashMap ar() {
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = h.length;
        HashMap hashMap = new HashMap(length + 88);
        int i2 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = h;
            int length3 = strArr.length;
            if (i2 >= 88) {
                return hashMap;
            }
            hashMap.put(strArr[i2], strArr[i2 + 1]);
            i2 += 2;
        }
    }

    public static int b(int[] iArr, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        int binarySearch = Arrays.binarySearch(iArr, i2);
        if (binarySearch < 0) {
            i4 = -(binarySearch + 2);
        } else {
            while (true) {
                i3 = binarySearch - 1;
                if (i3 < 0 || iArr[i3] != i2) {
                    break;
                }
                binarySearch = i3;
            }
            i4 = z ? binarySearch : i3;
        }
        return z2 ? Math.max(0, i4) : i4;
    }

    public static int c(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    public static int d(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    public static int e(int i2, int i3) {
        return (char) (k[i2 ^ (i3 >> 12)] ^ ((char) (i3 << 4)));
    }

    public static int f(byte[] bArr, int i2, int i3, int i4) {
        while (i2 < i3) {
            i4 = j[(i4 >>> 24) ^ (bArr[i2] & PrivateKeyType.INVALID)] ^ (i4 << 8);
            i2++;
        }
        return i4;
    }

    public static int g(int i2) {
        if (i2 == 20) {
            return 30;
        }
        if (i2 == 22) {
            return 31;
        }
        if (i2 == 30) {
            return 34;
        }
        switch (i2) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i2) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return Alert.DURATION_SHOW_INDEFINITELY;
                }
        }
    }

    public static int h(int i2) {
        int i3;
        int i4 = 6396;
        if (i2 == 10) {
            i3 = 737532;
        } else {
            if (i2 == 12) {
                return 743676;
            }
            if (i2 != 24) {
                switch (i2) {
                    case 1:
                        return 4;
                    case 2:
                        return 12;
                    case 3:
                        return 28;
                    case 4:
                        return 204;
                    case 5:
                        return 220;
                    case 6:
                        return 252;
                    case 7:
                        return 1276;
                    case 8:
                        return 6396;
                    default:
                        return 0;
                }
            }
            i3 = 67108860;
            i4 = 0;
        }
        return a >= 32 ? i3 : i4;
    }

    public static int i(ByteBuffer byteBuffer, int i2) {
        int i3 = byteBuffer.getInt(i2);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i3 : Integer.reverseBytes(i3);
    }

    public static int j(int i2) {
        if (i2 == 2 || i2 == 4) {
            return 6005;
        }
        if (i2 == 10) {
            return 6004;
        }
        if (i2 == 7) {
            return 6005;
        }
        if (i2 == 8) {
            return 6003;
        }
        switch (i2) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i2) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static int k(String str) {
        String[] ag;
        int length;
        int i2 = 0;
        if (str == null || (length = (ag = ag(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = ag[length - 1];
        boolean z = length >= 3 && "neg".equals(ag[length + (-2)]);
        try {
            lti.f(str2);
            i2 = Integer.parseInt(str2);
            if (z) {
                return -i2;
            }
        } catch (NumberFormatException unused) {
        }
        return i2;
    }

    public static int l(Context context) {
        return Y(context) ? 1 : 5;
    }

    public static int m(int i2) {
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 2;
        }
        if (i2 != 24) {
            return i2 != 32 ? 0 : 22;
        }
        return 21;
    }

    public static int n(int i2, int i3) {
        int i4 = 2;
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 21) {
                        if (i2 != 22) {
                            if (i2 != 268435456) {
                                if (i2 != 1342177280) {
                                    if (i2 != 1610612736) {
                                        throw new IllegalArgumentException();
                                    }
                                }
                            }
                        }
                    }
                    i4 = 3;
                }
                i4 = 4;
            } else {
                i4 = 1;
            }
        }
        return i4 * i3;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int o(Uri uri, String str) {
        char c2 = 65535;
        if (str != null) {
            switch (str.hashCode()) {
                case -979127466:
                    if (str.equals("application/x-mpegURL")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -156749520:
                    if (str.equals("application/vnd.ms-sstr+xml")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 64194685:
                    if (str.equals("application/dash+xml")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 1154777587:
                    if (str.equals("application/x-rtsp")) {
                        c2 = 3;
                        break;
                    }
                    break;
            }
            if (c2 == 0) {
                return 0;
            }
            if (c2 == 1) {
                return 2;
            }
            if (c2 != 2) {
                return c2 != 3 ? 4 : 3;
            }
            return 1;
        }
        String scheme = uri.getScheme();
        if (scheme != null && emuz.e("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int lastIndexOf = lastPathSegment.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String c3 = emuz.c(lastPathSegment.substring(lastIndexOf + 1));
            switch (c3.hashCode()) {
                case 104579:
                    if (c3.equals("ism")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 108321:
                    if (c3.equals("mpd")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 3242057:
                    if (c3.equals("isml")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 3299913:
                    if (c3.equals("m3u8")) {
                        c2 = 1;
                        break;
                    }
                    break;
            }
            int i2 = c2 != 0 ? c2 != 1 ? (c2 == 2 || c2 == 3) ? 1 : 4 : 2 : 0;
            if (i2 != 4) {
                return i2;
            }
        }
        Pattern pattern = f;
        String path = uri.getPath();
        lti.f(path);
        Matcher matcher = pattern.matcher(path);
        if (!matcher.matches()) {
            return 4;
        }
        String group = matcher.group(2);
        if (group == null) {
            return 1;
        }
        if (group.contains("format=mpd-time-csf")) {
            return 0;
        }
        return !group.contains("format=m3u8-aapl") ? 1 : 2;
    }

    public static int p(int[] iArr, int i2) {
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (iArr[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }

    public static long q(long j2, long j3, long j4) {
        return Math.max(j3, Math.min(j2, j4));
    }

    public static long r(long j2, int i2) {
        return x(j2, i2, 1000000L, RoundingMode.UP);
    }

    public static long s(long j2, float f2) {
        return f2 == 1.0f ? j2 : Math.round(j2 * f2);
    }

    public static long t(long j2, float f2) {
        return f2 == 1.0f ? j2 : Math.round(j2 / f2);
    }

    public static long u(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 * 1000;
    }

    public static long v(long j2, int i2) {
        return x(j2, 1000000L, i2, RoundingMode.DOWN);
    }

    public static long w(long j2, long j3, long j4) {
        return x(j2, j3, j4, RoundingMode.DOWN);
    }

    public static long x(long j2, long j3, long j4, RoundingMode roundingMode) {
        if (j2 == 0 || j3 == 0) {
            return 0L;
        }
        return (j4 < j3 || j4 % j3 != 0) ? (j4 >= j3 || j3 % j4 != 0) ? (j4 < j2 || j4 % j2 != 0) ? (j4 >= j2 || j2 % j4 != 0) ? aq(j2, j3, j4, roundingMode) : erlc.h(j3, erlc.e(j2, j4, RoundingMode.UNNECESSARY)) : erlc.e(j3, erlc.e(j4, j2, RoundingMode.UNNECESSARY), roundingMode) : erlc.h(j2, erlc.e(j3, j4, RoundingMode.UNNECESSARY)) : erlc.e(j2, erlc.e(j4, j3, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static long y(int i2) {
        return i2 & 4294967295L;
    }

    public static long z(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 / 1000;
    }
}
