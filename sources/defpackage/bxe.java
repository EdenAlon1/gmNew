package defpackage;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxe {
    private static final Map a;
    private static final int b;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        b = 1;
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1, cai.a);
        hashMap2.put(2, cai.d);
        hashMap2.put(4096, cai.e);
        hashMap2.put(8192, cai.e);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(1, cai.a);
        hashMap3.put(2, cai.d);
        hashMap3.put(4096, cai.e);
        hashMap3.put(8192, cai.e);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(1, cai.a);
        hashMap4.put(4, cai.d);
        hashMap4.put(4096, cai.e);
        hashMap4.put(16384, cai.e);
        hashMap4.put(2, cai.a);
        hashMap4.put(8, cai.d);
        hashMap4.put(8192, cai.e);
        hashMap4.put(32768, cai.e);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(256, cai.d);
        hashMap5.put(512, cai.c);
        hashMap.put("video/hevc", hashMap2);
        hashMap.put("video/av01", hashMap3);
        hashMap.put("video/x-vnd.on2.vp9", hashMap4);
        hashMap.put("video/dolby-vision", hashMap5);
    }

    public static int a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, Range range) {
        char c;
        String str;
        int doubleValue = (int) (i * new Rational(i2, i3).doubleValue() * new Rational(i4, i5).doubleValue() * new Rational(i6, i7).doubleValue() * new Rational(i8, i9).doubleValue());
        if (avw.h("VideoConfigUtil")) {
            c = 1;
            str = String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) * Frame Rate Ratio(%d / %d) * Width Ratio(%d / %d) * Height Ratio(%d / %d) = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(doubleValue));
        } else {
            c = 1;
            str = "";
        }
        if (!but.f.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(doubleValue));
            int intValue = num.intValue();
            if (avw.h("VideoConfigUtil")) {
                Object[] objArr = new Object[2];
                objArr[0] = range;
                objArr[c] = num;
                str = String.valueOf(str).concat(String.valueOf(String.format("\nClamped to range %s -> %dbps", objArr)));
            }
            doubleValue = intValue;
        }
        avw.a("VideoConfigUtil", str);
        return doubleValue;
    }

    public static bxh b(brd brdVar, aua auaVar, bvc bvcVar) {
        ksw.d(auaVar.b(), a.i(auaVar, "Dynamic range must be a fully specified dynamic range [provided dynamic range: ", "]"));
        String str = "video/avc";
        String str2 = brdVar.a() != 1 ? "video/avc" : "video/x-vnd.on2.vp8";
        if (bvcVar != null) {
            Set set = (Set) cao.b.get(Integer.valueOf(auaVar.h));
            if (set == null) {
                set = Collections.EMPTY_SET;
            }
            Set set2 = (Set) cao.a.get(Integer.valueOf(auaVar.i));
            if (set2 == null) {
                set2 = Collections.EMPTY_SET;
            }
            for (beh behVar : bvcVar.d()) {
                if (set.contains(Integer.valueOf(behVar.f())) && set2.contains(Integer.valueOf(behVar.a()))) {
                    String j = behVar.j();
                    if (Objects.equals(str2, j)) {
                        avw.a("VideoConfigUtil", a.a(str2, "MediaSpec video mime matches EncoderProfiles. Using EncoderProfiles to derive VIDEO settings [mime type: ", "]"));
                    } else if (brdVar.a() == -1) {
                        avw.a("VideoConfigUtil", "MediaSpec contains OUTPUT_FORMAT_AUTO. Using CamcorderProfile to derive VIDEO settings [mime type: " + str2 + ", dynamic range: " + auaVar + "]");
                    }
                    str2 = j;
                    break;
                }
            }
        }
        behVar = null;
        if (behVar == null) {
            if (brdVar.a() == -1) {
                int i = auaVar.h;
                if (i != 1) {
                    if (i == 3 || i == 4 || i == 5) {
                        str = "video/hevc";
                    } else {
                        if (i != 6) {
                            throw new UnsupportedOperationException(a.i(auaVar, "Unsupported dynamic range: ", "\nNo supported default mime type available."));
                        }
                        str = "video/dolby-vision";
                    }
                }
            } else {
                str = str2;
            }
            if (bvcVar == null) {
                avw.a("VideoConfigUtil", "No EncoderProfiles present. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + str + ", dynamic range: " + auaVar + "]");
            } else {
                avw.a("VideoConfigUtil", "No video EncoderProfile is compatible with requested output format and dynamic range. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + str + ", dynamic range: " + auaVar + "]");
            }
            str2 = str;
        }
        Integer num = -1;
        beh behVar2 = behVar != null ? behVar : null;
        num.getClass();
        return new bxb(str2, behVar2);
    }

    public static cah c(beh behVar) {
        cag l = cah.l();
        l.e(behVar.j());
        l.f(behVar.h());
        l.g(new Size(behVar.i(), behVar.g()));
        l.c(behVar.e());
        l.b(behVar.b());
        l.d(b);
        return l.a();
    }

    public static cai d(String str, int i) {
        cai caiVar;
        Map map = (Map) a.get(str);
        if (map != null && (caiVar = (cai) map.get(Integer.valueOf(i))) != null) {
            return caiVar;
        }
        avw.f("VideoConfigUtil", String.format("Unsupported mime type %s or profile level %d. Data space is unspecified.", str, Integer.valueOf(i)));
        return cai.a;
    }

    public static cah e(bxh bxhVar, int i, but butVar, Size size, aua auaVar, Range range) {
        bxb bxbVar = (bxb) bxhVar;
        beh behVar = bxbVar.b;
        return (cah) (behVar != null ? new bxg(bxbVar.a, i, butVar, size, behVar, auaVar, range) : new bxf(bxbVar.a, i, butVar, size, auaVar, range)).a();
    }
}
