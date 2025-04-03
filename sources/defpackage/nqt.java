package defpackage;

import android.media.CamcorderProfile;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Range;
import android.util.Size;
import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nqt {
    public static final /* synthetic */ int a = 0;
    private static final enct b = new enct();

    public static int a(MediaCodecInfo mediaCodecInfo, String str, int i) {
        int i2 = -1;
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mediaCodecInfo.getCapabilitiesForType(str).profileLevels) {
            if (codecProfileLevel.profile == i) {
                i2 = Math.max(i2, codecProfileLevel.level);
            }
        }
        return i2;
    }

    public static int b(MediaCodecInfo mediaCodecInfo, String str, int i) {
        MediaCodecInfo.AudioCapabilities audioCapabilities = mediaCodecInfo.getCapabilitiesForType(str).getAudioCapabilities();
        int[] supportedSampleRates = audioCapabilities.getSupportedSampleRates();
        int i2 = Alert.DURATION_SHOW_INDEFINITELY;
        int i3 = 0;
        if (supportedSampleRates != null) {
            while (i3 < supportedSampleRates.length) {
                int i4 = supportedSampleRates[i3];
                if (Math.abs(i4 - i) < Math.abs(i2 - i)) {
                    i2 = i4;
                }
                i3++;
            }
            return i2;
        }
        Range<Integer>[] supportedSampleRateRanges = audioCapabilities.getSupportedSampleRateRanges();
        int length = supportedSampleRateRanges.length;
        while (i3 < length) {
            int intValue = supportedSampleRateRanges[i3].clamp(Integer.valueOf(i)).intValue();
            if (Math.abs(intValue - i) < Math.abs(i2 - i)) {
                i2 = intValue;
            }
            i3++;
        }
        return i2;
    }

    public static Range c(MediaCodecInfo mediaCodecInfo, String str) {
        return mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities().getBitrateRange();
    }

    public static Size d(MediaCodecInfo mediaCodecInfo, String str, int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities();
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int k = k(i, widthAlignment);
        int k2 = k(i2, heightAlignment);
        if (j(mediaCodecInfo, str, k, k2)) {
            return new Size(k, k2);
        }
        float[] fArr = {0.95f, 0.9f, 0.85f, 0.8f, 0.75f, 0.7f, 0.6666667f, 0.6f, 0.55f, 0.5f, 0.4f, 0.33333334f, 0.25f};
        for (int i3 = 0; i3 < 13; i3++) {
            float f = fArr[i3];
            int k3 = k(Math.round(i * f), widthAlignment);
            int k4 = k(Math.round(i2 * f), heightAlignment);
            if (j(mediaCodecInfo, str, k3, k4)) {
                return new Size(k3, k4);
            }
        }
        int intValue = videoCapabilities.getSupportedHeightsFor(videoCapabilities.getSupportedWidths().clamp(Integer.valueOf(i)).intValue()).clamp(Integer.valueOf(i2)).intValue();
        if (intValue != i2) {
            i = k((int) Math.round((i * intValue) / i2), widthAlignment);
            i2 = k(intValue, heightAlignment);
        }
        if (j(mediaCodecInfo, str, i, i2)) {
            return new Size(i, i2);
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static engw e(String str, int i) {
        char c;
        switch (str.hashCode()) {
            case -1851077871:
                if (str.equals("video/dolby-vision")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1662735862:
                if (str.equals("video/av01")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c == 4 && i == 7) {
                            return engw.r(256);
                        }
                    } else {
                        if (i == 7) {
                            return engw.r(2);
                        }
                        if (i == 6) {
                            return engw.r(4096);
                        }
                    }
                } else {
                    if (i == 7) {
                        return engw.r(2);
                    }
                    if (i == 6) {
                        return engw.r(4096);
                    }
                }
            } else if (i == 7) {
                return engw.r(16);
            }
        } else if (i == 7 || i == 6) {
            return engw.s(4096, 8192);
        }
        int i2 = engw.d;
        return enou.a;
    }

    public static synchronized engw f(String str) {
        engw n;
        synchronized (nqt.class) {
            l();
            n = engw.n(b.c(emuz.c(str)));
        }
        return n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static engw g(String str, lpo lpoVar) {
        boolean isAlias;
        if (lvf.a < 33 || lpoVar == null) {
            int i = engw.d;
            return enou.a;
        }
        engw f = f(str);
        engr engrVar = new engr();
        for (int i2 = 0; i2 < f.size(); i2++) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) f.get(i2);
            isAlias = mediaCodecInfo.isAlias();
            if (!isAlias && i(mediaCodecInfo, str, lpoVar)) {
                engrVar.h(mediaCodecInfo);
            }
        }
        return engrVar.g();
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        return mediaCodecInfo.getCapabilitiesForType(str).isFeatureSupported(str2);
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str, lpo lpoVar) {
        if (!str.equals("video/dolby-vision") && !h(mediaCodecInfo, str, "hdr-editing") && (lpoVar.e != 7 || lvf.a < 35 || !h(mediaCodecInfo, str, "hlg-editing"))) {
            return false;
        }
        engw e = e(str, lpoVar.e);
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mediaCodecInfo.getCapabilitiesForType(str).profileLevels) {
            if (e.contains(Integer.valueOf(codecProfileLevel.profile))) {
                return true;
            }
        }
        return false;
    }

    public static boolean j(MediaCodecInfo mediaCodecInfo, String str, int i, int i2) {
        if (mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities().isSizeSupported(i, i2)) {
            return true;
        }
        if (i == 1920) {
            if (i2 == 1080) {
                return CamcorderProfile.hasProfile(6);
            }
            return false;
        }
        if (i == 3840 && i2 == 2160) {
            return CamcorderProfile.hasProfile(8);
        }
        return false;
    }

    private static int k(int i, int i2) {
        return i % 10 == 1 ? (int) (i2 * Math.floor(r4 / r1)) : i2 * Math.round(i / i2);
    }

    private static synchronized void l() {
        synchronized (nqt.class) {
            if (b.A()) {
                for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
                    if (mediaCodecInfo.isEncoder()) {
                        for (String str : mediaCodecInfo.getSupportedTypes()) {
                            b.t(emuz.c(str), mediaCodecInfo);
                        }
                    }
                }
            }
        }
    }
}
