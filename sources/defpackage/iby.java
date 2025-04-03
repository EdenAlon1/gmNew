package defpackage;

import java.util.Objects;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iby {
    public static final float a(long j) {
        idy f = ibw.f(j);
        if (!idx.b(f.b, 12884901888L)) {
            String a = idx.a(f.b);
            Objects.toString(a);
            ick.a("The specified color must be encoded in an RGB color space. The supplied color space is ".concat(a));
        }
        f.getClass();
        iel ielVar = ((iff) f).p;
        float a2 = (float) ((ielVar.a(ibw.d(j)) * 0.2126d) + (ielVar.a(ibw.c(j)) * 0.7152d) + (ielVar.a(ibw.b(j)) * 0.0722d));
        if (a2 < 0.0f) {
            a2 = 0.0f;
        }
        if (a2 > 1.0f) {
            return 1.0f;
        }
        return a2;
    }

    public static final int b(long j) {
        float[] fArr = ieg.a;
        return (int) (ibw.e(j, ieg.e) >>> 32);
    }

    public static final long c(int i) {
        long j = ibw.a;
        return i << 32;
    }

    public static final long d(long j) {
        long j2 = ibw.a;
        return j << 32;
    }

    public static final long e(int i, int i2, int i3, int i4) {
        int i5 = i4 & PrivateKeyType.INVALID;
        return c(((i & PrivateKeyType.INVALID) << 16) | (i5 << 24) | ((i2 & PrivateKeyType.INVALID) << 8) | (i3 & PrivateKeyType.INVALID));
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long f(float r20, float r21, float r22, float r23, defpackage.idy r24) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iby.f(float, float, float, float, idy):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long g(float r18, float r19, float r20, float r21, defpackage.idy r22) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iby.g(float, float, float, float, idy):long");
    }

    public static final long h(long j, long j2) {
        long e = ibw.e(j, ibw.f(j2));
        float a = ibw.a(e);
        float d = ibw.d(e);
        float d2 = ibw.d(j2);
        float a2 = ibw.a(j2);
        float f = 1.0f - a;
        float f2 = (a2 * f) + a;
        return g(f2 == 0.0f ? 0.0f : ((d * a) + ((d2 * a2) * f)) / f2, f2 == 0.0f ? 0.0f : ((ibw.c(e) * a) + ((ibw.c(j2) * a2) * f)) / f2, f2 != 0.0f ? ((ibw.b(e) * a) + ((ibw.b(j2) * a2) * f)) / f2 : 0.0f, f2, ibw.f(j2));
    }

    public static final long i(long j, long j2, float f) {
        float[] fArr = ieg.a;
        idy idyVar = ieg.x;
        long e = ibw.e(j, idyVar);
        long e2 = ibw.e(j2, idyVar);
        float a = ibw.a(e);
        float d = ibw.d(e);
        float c = ibw.c(e);
        float b = ibw.b(e);
        float a2 = ibw.a(e2);
        float d2 = ibw.d(e2);
        float c2 = ibw.c(e2);
        float b2 = ibw.b(e2);
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        return ibw.e(g(kav.b(d, d2, f), kav.b(c, c2, f), kav.b(b, b2, f), kav.b(a, a2, f), idyVar), ibw.f(j2));
    }

    public static /* synthetic */ long j(float f, float f2, float f3, float f4, idy idyVar, int i) {
        if ((i & 16) != 0) {
            float[] fArr = ieg.a;
            idyVar = ieg.e;
        }
        if ((i & 8) != 0) {
            f4 = 1.0f;
        }
        return f(f, f2, f3, f4, idyVar);
    }
}
