package defpackage;

import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mrv {
    public static final /* synthetic */ int a = 0;
    private static final HashMap b = new HashMap();

    public static mrf a() {
        List c = c("audio/raw", false, false);
        if (c.isEmpty()) {
            return null;
        }
        return (mrf) c.get(0);
    }

    public static String b(lqc lqcVar) {
        Pair a2;
        if ("audio/eac3-joc".equals(lqcVar.o)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(lqcVar.o) && (a2 = lto.a(lqcVar)) != null) {
            int intValue = ((Integer) a2.first).intValue();
            if (intValue == 16 || intValue == 256) {
                return "video/hevc";
            }
            if (intValue == 512) {
                return "video/avc";
            }
            if (intValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(lqcVar.o)) {
            return "video/hevc";
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0120 A[Catch: Exception -> 0x01a8, all -> 0x0218, TryCatch #0 {Exception -> 0x01a8, blocks: (B:32:0x00e9, B:36:0x0104, B:40:0x011a, B:42:0x0120, B:43:0x012e, B:45:0x0137, B:46:0x0158, B:48:0x015c, B:50:0x0160, B:54:0x016d, B:56:0x0174, B:59:0x0183, B:62:0x018d, B:65:0x019e, B:70:0x013b, B:72:0x014b, B:74:0x0153, B:75:0x0125), top: B:31:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0137 A[Catch: Exception -> 0x01a8, all -> 0x0218, TryCatch #0 {Exception -> 0x01a8, blocks: (B:32:0x00e9, B:36:0x0104, B:40:0x011a, B:42:0x0120, B:43:0x012e, B:45:0x0137, B:46:0x0158, B:48:0x015c, B:50:0x0160, B:54:0x016d, B:56:0x0174, B:59:0x0183, B:62:0x018d, B:65:0x019e, B:70:0x013b, B:72:0x014b, B:74:0x0153, B:75:0x0125), top: B:31:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015c A[Catch: Exception -> 0x01a8, all -> 0x0218, TryCatch #0 {Exception -> 0x01a8, blocks: (B:32:0x00e9, B:36:0x0104, B:40:0x011a, B:42:0x0120, B:43:0x012e, B:45:0x0137, B:46:0x0158, B:48:0x015c, B:50:0x0160, B:54:0x016d, B:56:0x0174, B:59:0x0183, B:62:0x018d, B:65:0x019e, B:70:0x013b, B:72:0x014b, B:74:0x0153, B:75:0x0125), top: B:31:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013b A[Catch: Exception -> 0x01a8, all -> 0x0218, TryCatch #0 {Exception -> 0x01a8, blocks: (B:32:0x00e9, B:36:0x0104, B:40:0x011a, B:42:0x0120, B:43:0x012e, B:45:0x0137, B:46:0x0158, B:48:0x015c, B:50:0x0160, B:54:0x016d, B:56:0x0174, B:59:0x0183, B:62:0x018d, B:65:0x019e, B:70:0x013b, B:72:0x014b, B:74:0x0153, B:75:0x0125), top: B:31:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0125 A[Catch: Exception -> 0x01a8, all -> 0x0218, TryCatch #0 {Exception -> 0x01a8, blocks: (B:32:0x00e9, B:36:0x0104, B:40:0x011a, B:42:0x0120, B:43:0x012e, B:45:0x0137, B:46:0x0158, B:48:0x015c, B:50:0x0160, B:54:0x016d, B:56:0x0174, B:59:0x0183, B:62:0x018d, B:65:0x019e, B:70:0x013b, B:72:0x014b, B:74:0x0153, B:75:0x0125), top: B:31:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.util.List c(java.lang.String r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mrv.c(java.lang.String, boolean, boolean):java.util.List");
    }

    public static List d(List list, final lqc lqcVar) {
        ArrayList arrayList = new ArrayList(list);
        e(arrayList, new mru() { // from class: mrq
            @Override // defpackage.mru
            public final int a(Object obj) {
                mrf mrfVar = (mrf) obj;
                int i = mrv.a;
                lqc lqcVar2 = lqc.this;
                return (mrfVar.e(lqcVar2) && mrfVar.c(lqcVar2, false)) ? 1 : 0;
            }
        });
        return arrayList;
    }

    public static void e(List list, final mru mruVar) {
        Collections.sort(list, new Comparator() { // from class: mro
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i = mrv.a;
                mru mruVar2 = mru.this;
                return mruVar2.a(obj2) - mruVar2.a(obj);
            }
        });
    }

    public static List f(lqc lqcVar, boolean z, boolean z2) {
        String b2 = b(lqcVar);
        if (b2 != null) {
            return c(b2, z, z2);
        }
        int i = engw.d;
        return enou.a;
    }

    public static List g(lqc lqcVar, boolean z, boolean z2) {
        List c = c(lqcVar.o, z, z2);
        List f = f(lqcVar, z, z2);
        int i = engw.d;
        engr engrVar = new engr();
        engrVar.j(c);
        engrVar.j(f);
        return engrVar.g();
    }

    private static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (lvf.a >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if (lre.i(str)) {
            return true;
        }
        String c = emuz.c(mediaCodecInfo.getName());
        if (c.startsWith("arc.")) {
            return false;
        }
        if (c.startsWith("omx.google.") || c.startsWith("omx.ffmpeg.") || ((c.startsWith("omx.sec.") && c.contains(".sw.")) || c.equals("omx.qcom.video.decoder.hevcswvdec") || c.startsWith("c2.android.") || c.startsWith("c2.google."))) {
            return true;
        }
        return (c.startsWith("omx.") || c.startsWith("c2.")) ? false : true;
    }
}
