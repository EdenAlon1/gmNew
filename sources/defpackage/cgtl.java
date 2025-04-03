package defpackage;

import android.drm.DrmConvertedStatus;
import android.drm.DrmManagerClient;
import android.util.Log;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgtl {
    public final DrmManagerClient a;
    public final int b;

    private cgtl(DrmManagerClient drmManagerClient, int i) {
        this.a = drmManagerClient;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.drm.DrmManagerClient] */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.drm.DrmManagerClient] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.cgtl a(android.content.Context r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "DrmConvertSession"
            r1 = 0
            r2 = -1
            if (r6 == 0) goto L39
            boolean r3 = r7.isEmpty()
            if (r3 != 0) goto L39
            android.drm.DrmManagerClient r3 = new android.drm.DrmManagerClient     // Catch: java.lang.IllegalStateException -> L2b java.lang.IllegalArgumentException -> L32
            r3.<init>(r6)     // Catch: java.lang.IllegalStateException -> L2b java.lang.IllegalArgumentException -> L32
            int r6 = r3.openConvertSession(r7)     // Catch: java.lang.IllegalStateException -> L17 java.lang.IllegalArgumentException -> L1e
            r2 = r6
            goto L3a
        L17:
            r6 = move-exception
            java.lang.String r7 = "Could not access Open DrmFramework."
            android.util.Log.w(r0, r7, r6)     // Catch: java.lang.IllegalStateException -> L2c java.lang.IllegalArgumentException -> L33
            goto L3a
        L1e:
            r6 = move-exception
            java.lang.String r4 = "Conversion of Mimetype: "
            java.lang.String r5 = " is not supported."
            java.lang.String r7 = defpackage.a.a(r7, r4, r5)     // Catch: java.lang.IllegalStateException -> L2c java.lang.IllegalArgumentException -> L33
            android.util.Log.w(r0, r7, r6)     // Catch: java.lang.IllegalStateException -> L2c java.lang.IllegalArgumentException -> L33
            goto L3a
        L2b:
            r3 = r1
        L2c:
            java.lang.String r6 = "DrmManagerClient didn't initialize properly."
            android.util.Log.w(r0, r6)
            goto L3a
        L32:
            r3 = r1
        L33:
            java.lang.String r6 = "DrmManagerClient instance could not be created, context is Illegal."
            android.util.Log.w(r0, r6)
            goto L3a
        L39:
            r3 = r1
        L3a:
            if (r3 == 0) goto L45
            if (r2 >= 0) goto L3f
            goto L45
        L3f:
            cgtl r6 = new cgtl
            r6.<init>(r3, r2)
            return r6
        L45:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgtl.a(android.content.Context, java.lang.String):cgtl");
    }

    public final byte[] b(byte[] bArr, int i) {
        DrmConvertedStatus convertData;
        if (bArr == null) {
            throw new IllegalArgumentException("Parameter inBuffer is null");
        }
        try {
            if (i != bArr.length) {
                convertData = this.a.convertData(this.b, Arrays.copyOf(bArr, i));
            } else {
                convertData = this.a.convertData(this.b, bArr);
            }
            if (convertData == null || convertData.statusCode != 1 || convertData.convertedData == null) {
                return null;
            }
            return convertData.convertedData;
        } catch (IllegalArgumentException e) {
            Log.w("DrmConvertSession", "Buffer with data to convert is illegal. Convertsession: " + this.b, e);
            return null;
        } catch (IllegalStateException e2) {
            Log.w("DrmConvertSession", "Could not convert data. Convertsession: " + this.b, e2);
            return null;
        }
    }
}
