package defpackage;

import android.os.Build;
import android.view.FrameMetrics;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecmw {
    long a;

    static boolean b() {
        return Build.VERSION.SDK_INT <= 30;
    }

    public long a(FrameMetrics frameMetrics, long j) {
        long metric;
        long metric2;
        long metric3;
        metric = frameMetrics.getMetric(10);
        metric2 = frameMetrics.getMetric(8);
        long j2 = metric + metric2;
        long max = Math.max(this.a + j, metric + j);
        this.a = max;
        long j3 = max - metric;
        if (j2 >= max && metric2 >= j) {
            metric3 = frameMetrics.getMetric(11);
            this.a = (j2 - ((j2 - metric3) % j)) + j;
        }
        return j3;
    }
}
