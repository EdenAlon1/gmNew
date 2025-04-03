package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qkn {
    private static final Interpolator c = new LinearInterpolator();
    static final qli a = qli.a("t", "s", "e", "o", "i", "h", "to", "ti");
    static final qli b = qli.a("x", "y");

    /* JADX WARN: Removed duplicated region for block: B:125:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0208  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static defpackage.qlx a(defpackage.qlk r20, defpackage.qci r21, float r22, defpackage.qlf r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qkn.a(qlk, qci, float, qlf, boolean, boolean):qlx");
    }

    private static Interpolator b(PointF pointF, PointF pointF2) {
        pointF.x = qlr.a(pointF.x, -1.0f, 1.0f);
        pointF.y = qlr.a(pointF.y, -100.0f, 100.0f);
        pointF2.x = qlr.a(pointF2.x, -1.0f, 1.0f);
        pointF2.y = qlr.a(pointF2.y, -100.0f, 100.0f);
        float f = pointF.x;
        float f2 = pointF.y;
        float f3 = pointF2.x;
        float f4 = pointF2.y;
        ThreadLocal threadLocal = qlw.a;
        try {
            return new PathInterpolator(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e) {
            return "The Path cannot loop back on itself.".equals(e.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
    }
}
