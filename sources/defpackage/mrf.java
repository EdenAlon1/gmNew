package defpackage;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mrf {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    private final boolean i;

    public mrf(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4) {
        lti.f(str);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z2;
        this.f = z3;
        this.h = z4;
        this.i = lre.l(str2);
    }

    public static Point a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(lvf.c(i, widthAlignment) * widthAlignment, lvf.c(i2, heightAlignment) * heightAlignment);
    }

    private final void i(String str) {
        luj.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.a + ", " + this.b + "] [" + lvf.b + "]");
    }

    private static boolean j(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point a = a(videoCapabilities, i, i2);
        int i3 = a.x;
        int i4 = a.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    public final mec b(lqc lqcVar, lqc lqcVar2) {
        lqc lqcVar3;
        lqc lqcVar4;
        String str = lqcVar2.o;
        int i = lvf.a;
        int i2 = true != Objects.equals(lqcVar.o, str) ? 8 : 0;
        if (this.i) {
            if (lqcVar.y != lqcVar2.y) {
                i2 |= 1024;
            }
            if (!this.e && (lqcVar.v != lqcVar2.v || lqcVar.w != lqcVar2.w)) {
                i2 |= 512;
            }
            if ((!lpo.h(lqcVar.C) || !lpo.h(lqcVar2.C)) && !Objects.equals(lqcVar.C, lqcVar2.C)) {
                i2 |= 2048;
            }
            String str2 = this.a;
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str2) && !lqcVar.d(lqcVar2)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new mec(this.a, lqcVar, lqcVar2, true != lqcVar.d(lqcVar2) ? 2 : 3, 0);
            }
            lqcVar3 = lqcVar;
            lqcVar4 = lqcVar2;
        } else {
            lqcVar3 = lqcVar;
            lqcVar4 = lqcVar2;
            if (lqcVar3.E != lqcVar4.E) {
                i2 |= 4096;
            }
            if (lqcVar3.F != lqcVar4.F) {
                i2 |= 8192;
            }
            if (lqcVar3.G != lqcVar4.G) {
                i2 |= 16384;
            }
            if (i2 == 0 && "audio/mp4a-latm".equals(this.b)) {
                int i3 = mrv.a;
                Pair a = lto.a(lqcVar3);
                Pair a2 = lto.a(lqcVar4);
                if (a != null && a2 != null) {
                    int intValue = ((Integer) a.first).intValue();
                    int intValue2 = ((Integer) a2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new mec(this.a, lqcVar3, lqcVar4, 3, 0);
                    }
                }
            }
            if (!lqcVar3.d(lqcVar4)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(this.b)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new mec(this.a, lqcVar3, lqcVar4, 1, 0);
            }
        }
        return new mec(this.a, lqcVar3, lqcVar4, 0, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0138  */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(defpackage.lqc r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mrf.c(lqc, boolean):boolean");
    }

    public final boolean d(lqc lqcVar) {
        int i;
        if (!e(lqcVar) || !c(lqcVar, true)) {
            return false;
        }
        if (this.i) {
            int i2 = lqcVar.v;
            if (i2 <= 0 || (i = lqcVar.w) <= 0) {
                return true;
            }
            return g(i2, i, lqcVar.x);
        }
        int i3 = lqcVar.F;
        if (i3 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
            if (codecCapabilities == null) {
                i("sampleRate.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                i("sampleRate.aCaps");
                return false;
            }
            if (!audioCapabilities.isSampleRateSupported(i3)) {
                i(a.h(i3, "sampleRate.support, "));
                return false;
            }
        }
        int i4 = lqcVar.E;
        if (i4 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.d;
            if (codecCapabilities2 == null) {
                i("channelCount.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                i("channelCount.aCaps");
                return false;
            }
            String str = this.a;
            String str2 = this.b;
            int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
            if (maxInputChannelCount <= 1) {
                int i5 = lvf.a;
                if (maxInputChannelCount <= 0 && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2)) {
                    int i6 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                    luj.f("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i6 + "]");
                    maxInputChannelCount = i6;
                }
            }
            if (maxInputChannelCount < i4) {
                i(a.h(i4, "channelCount.support, "));
                return false;
            }
        }
        return true;
    }

    public final boolean e(lqc lqcVar) {
        return this.b.equals(lqcVar.o) || this.b.equals(mrv.b(lqcVar));
    }

    public final boolean f(lqc lqcVar) {
        if (this.i) {
            return this.e;
        }
        int i = mrv.a;
        Pair a = lto.a(lqcVar);
        return a != null && ((Integer) a.first).intValue() == 42;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        r2 = r0.getSupportedPerformancePoints();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0075, code lost:
    
        if (defpackage.mrh.a.booleanValue() == false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(int r10, int r11, double r12) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mrf.g(int, int, double):boolean");
    }

    public final MediaCodecInfo.CodecProfileLevel[] h() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        return (codecCapabilities == null || codecCapabilities.profileLevels == null) ? new MediaCodecInfo.CodecProfileLevel[0] : this.d.profileLevels;
    }

    public final String toString() {
        return this.a;
    }
}
