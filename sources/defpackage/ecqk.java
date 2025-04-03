package defpackage;

import android.app.Activity;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecqk {
    public static final ecqk a = new ecqk();
    public volatile boolean b;
    public volatile ecjl c;
    public volatile ecjl d;
    public volatile ecjl e;
    public volatile ecjl f;
    public volatile ecjl g;
    public volatile ecjl h;
    public volatile ecjl i;
    public volatile ecjl j;
    public volatile ecjl k;
    public volatile ecjl l;
    public volatile ecjl m;
    public volatile ecda n;
    private volatile int q = Alert.DURATION_SHOW_INDEFINITELY;
    public final ecqb o = new ecqb();
    public final ecqb p = new ecqb();

    public static void e(String str, long j) {
        long startElapsedRealtime;
        if (Build.VERSION.SDK_INT >= 29) {
            startElapsedRealtime = Process.getStartElapsedRealtime();
            Trace.setCounter(str, j - startElapsedRealtime);
            Trace.setCounter(str, 0L);
        }
    }

    public final void a(final int i) {
        if (this.o.b != null) {
            this.q = i;
        } else if (i < 4) {
            efbd.e(new Runnable() { // from class: ecpz
                @Override // java.lang.Runnable
                public final void run() {
                    ecqk.this.a(i + 1);
                }
            });
        }
    }

    public final void b(Activity activity) {
        if (efbd.g() && this.m == null) {
            this.m = ecjl.d();
            e("Primes-tti-end-and-length-ms", ((ecio) this.m).a);
            if (activity != null) {
                try {
                    activity.reportFullyDrawn();
                } catch (RuntimeException e) {
                    Log.d("PrimesStartupMeasure", "Failed to report App usable time.", e);
                }
            }
        }
    }

    public final void c(ecjl ecjlVar) {
        ecjl ecjlVar2 = this.o.b;
        if (!efbd.g() || this.c == null) {
            return;
        }
        ecio ecioVar = (ecio) ecjlVar;
        if (ecioVar.a <= SystemClock.elapsedRealtime()) {
            if ((ecjlVar2 == null || ecioVar.a <= ((ecio) ecjlVar2).a) && this.h == null) {
                this.h = ecjlVar;
            }
        }
    }

    public final void d(ecda ecdaVar) {
        if (this.n == null) {
            this.n = ecdaVar;
        }
    }

    final boolean f(boolean z, long j) {
        return z ? ((long) this.q) < j : this.b;
    }
}
