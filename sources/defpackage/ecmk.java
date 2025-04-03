package defpackage;

import android.content.Context;
import android.util.ArrayMap;
import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import org.chromium.net.NetError;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecmk implements Window$OnFrameMetricsAvailableListener {
    public static final /* synthetic */ int a = 0;
    private boolean b;
    private long c;
    private ecmw d;
    private final ArrayMap e;
    private final emyl f;
    private final ffbr g;

    public ecmk(final Context context, ArrayMap arrayMap, ffbr ffbrVar) {
        this.f = emys.a(new emyl() { // from class: ecmj
            @Override // defpackage.emyl
            public final Object get() {
                int i = ecmk.a;
                long j = ecmi.a;
                Context context2 = context;
                if (j == 0) {
                    synchronized (ecmi.class) {
                        j = ecmi.a;
                        if (j == 0) {
                            float f = 60.0f;
                            float floatValue = ((Float) ecmi.a(context2).e(Float.valueOf(60.0f))).floatValue();
                            if (floatValue >= 1.0f) {
                                f = floatValue;
                            }
                            j = (long) Math.ceil(1.0E9d / f);
                            ecmi.a = j;
                        }
                    }
                }
                return Long.valueOf(j);
            }
        });
        this.e = arrayMap;
        this.g = ffbrVar;
    }

    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        long metric;
        long metric2;
        long metric3;
        boolean z;
        boolean z2 = true;
        if (!this.b) {
            this.b = true;
            this.d = ecmw.b() ? new ecmw() : null;
            if (this.g.b() == null || !((Boolean) this.g.b()).booleanValue()) {
                this.c = ((Long) this.f.get()).longValue();
            } else {
                this.c = (long) (1.0E9f / window.getWindowManager().getDefaultDisplay().getRefreshRate());
            }
        }
        metric = frameMetrics.getMetric(9);
        if (metric == 1) {
            ecmw ecmwVar = this.d;
            if (ecmwVar != null) {
                ecmwVar.a(frameMetrics, this.c);
                return;
            }
            return;
        }
        metric2 = frameMetrics.getMetric(8);
        ecmw ecmwVar2 = this.d;
        long a2 = ecmwVar2 != null ? ecmwVar2.a(frameMetrics, this.c) : this.c;
        metric3 = frameMetrics.getMetric(13);
        ArrayMap arrayMap = this.e;
        synchronized (arrayMap) {
            int size = arrayMap.size();
            int i2 = 0;
            while (i2 < size) {
                ecmm ecmmVar = (ecmm) arrayMap.valueAt(i2);
                int i3 = i2;
                int i4 = (int) (metric2 / 1000000);
                if (i4 < 0) {
                    z = z2;
                    ((enrr) ((enrr) ecdj.a.g()).h("com/google/android/libraries/performance/primes/metrics/jank/FrameTimeHistogram", "addFrame", 84, "FrameTimeHistogram.java")).s("Invalid frame time: %d", metric2);
                    ecmmVar.j++;
                } else {
                    z = z2;
                    ecmmVar.i++;
                    if (metric3 > 0) {
                        int i5 = (int) ((metric2 - metric3) / 1000000);
                        if (ecmmVar.o < i5) {
                            ecmmVar.o = i5;
                        }
                        int[] iArr = ecmmVar.f;
                        int i6 = i5 < 20 ? i5 >= -20 ? ((i5 + 20) >> 1) + 12 : i5 >= -30 ? ((i5 + 30) / 5) + 10 : i5 >= -100 ? ((i5 + 100) / 10) + 3 : i5 >= -200 ? ((i5 + BasePaymentResult.ERROR_REQUEST_FAILED) / 50) + 1 : 0 : i5 < 30 ? ((i5 - 20) / 5) + 32 : i5 < 100 ? ((i5 - 30) / 10) + 34 : i5 < 200 ? ((i5 - 50) / 100) + 41 : i5 < 1000 ? ((i5 + NetError.ERR_CERT_COMMON_NAME_INVALID) / 100) + 43 : 51;
                        iArr[i6] = iArr[i6] + 1;
                        if (metric2 > metric3) {
                            ecmmVar.g++;
                            ecmmVar.l += i4;
                        }
                        if (metric2 > a2) {
                            ecmmVar.h++;
                            ecmmVar.m += i4;
                        }
                    } else if (metric2 > a2) {
                        ecmmVar.g++;
                        ecmmVar.l += i4;
                    }
                    int[] iArr2 = ecmmVar.e;
                    int i7 = i4 <= 20 ? i4 >= 8 ? (i4 >> 1) - 2 : i4 / 4 : i4 <= 30 ? (i4 / 5) + 4 : i4 <= 100 ? (i4 / 10) + 7 : i4 <= 200 ? (i4 / 50) + 15 : i4 <= 1000 ? (i4 / 100) + 17 : 27;
                    iArr2[i7] = iArr2[i7] + 1;
                    ecmmVar.j += i;
                    if (ecmmVar.k < i4) {
                        ecmmVar.k = i4;
                    }
                    ecmmVar.n += i4;
                }
                i2 = i3 + 1;
                z2 = z;
            }
        }
    }
}
