package defpackage;

import android.media.MediaCodecInfo;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mrg {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        r2 = ((defpackage.mrf) r5.get(r1)).d.getVideoCapabilities().getSupportedPerformancePoints();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(boolean r5) {
        /*
            r0 = 0
            lqb r1 = new lqb     // Catch: defpackage.mrs -> L63
            r1.<init>()     // Catch: defpackage.mrs -> L63
            java.lang.String r2 = "video/avc"
            r1.c(r2)     // Catch: defpackage.mrs -> L63
            lqc r2 = new lqc     // Catch: defpackage.mrs -> L63
            r2.<init>(r1)     // Catch: defpackage.mrs -> L63
            java.lang.String r1 = r2.o     // Catch: defpackage.mrs -> L63
            if (r1 == 0) goto L63
            java.util.List r5 = defpackage.mrv.g(r2, r5, r0)     // Catch: defpackage.mrs -> L63
            r1 = r0
        L19:
            r2 = r5
            enou r2 = (defpackage.enou) r2     // Catch: defpackage.mrs -> L63
            int r2 = r2.c     // Catch: defpackage.mrs -> L63
            if (r1 >= r2) goto L63
            java.lang.Object r2 = r5.get(r1)     // Catch: defpackage.mrs -> L63
            mrf r2 = (defpackage.mrf) r2     // Catch: defpackage.mrs -> L63
            android.media.MediaCodecInfo$CodecCapabilities r2 = r2.d     // Catch: defpackage.mrs -> L63
            if (r2 == 0) goto L60
            java.lang.Object r2 = r5.get(r1)     // Catch: defpackage.mrs -> L63
            mrf r2 = (defpackage.mrf) r2     // Catch: defpackage.mrs -> L63
            android.media.MediaCodecInfo$CodecCapabilities r2 = r2.d     // Catch: defpackage.mrs -> L63
            android.media.MediaCodecInfo$VideoCapabilities r2 = r2.getVideoCapabilities()     // Catch: defpackage.mrs -> L63
            if (r2 == 0) goto L60
            java.lang.Object r2 = r5.get(r1)     // Catch: defpackage.mrs -> L63
            mrf r2 = (defpackage.mrf) r2     // Catch: defpackage.mrs -> L63
            android.media.MediaCodecInfo$CodecCapabilities r2 = r2.d     // Catch: defpackage.mrs -> L63
            android.media.MediaCodecInfo$VideoCapabilities r2 = r2.getVideoCapabilities()     // Catch: defpackage.mrs -> L63
            java.util.List r2 = defpackage.iy$$ExternalSyntheticApiModelOutline0.m(r2)     // Catch: defpackage.mrs -> L63
            if (r2 == 0) goto L60
            boolean r3 = r2.isEmpty()     // Catch: defpackage.mrs -> L63
            if (r3 != 0) goto L60
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r5 = new android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint     // Catch: defpackage.mrs -> L63
            r1 = 720(0x2d0, float:1.009E-42)
            r3 = 60
            r4 = 1280(0x500, float:1.794E-42)
            r5.<init>(r4, r1, r3)     // Catch: defpackage.mrs -> L63
            int r5 = b(r2, r5)     // Catch: defpackage.mrs -> L63
            return r5
        L60:
            int r1 = r1 + 1
            goto L19
        L63:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mrg.a(boolean):int");
    }

    public static int b(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        boolean covers;
        for (int i = 0; i < list.size(); i++) {
            covers = iy$$ExternalSyntheticApiModelOutline0.m(list.get(i)).covers(performancePoint);
            if (covers) {
                return 2;
            }
        }
        return 1;
    }
}
