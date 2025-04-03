package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahp {
    final /* synthetic */ ahs a;
    private final long b;
    private long c = -1;

    public ahp(ahs ahsVar, long j) {
        this.a = ahsVar;
        this.b = j;
    }

    final int a() {
        if (!this.a.d()) {
            return 700;
        }
        long c = c();
        if (c <= 120000) {
            return 1000;
        }
        return c <= 300000 ? 2000 : 4000;
    }

    final int b() {
        boolean d = this.a.d();
        long j = this.b;
        if (d) {
            if (j > 0) {
                return Math.min((int) j, 1800000);
            }
            return 1800000;
        }
        if (j > 0) {
            return Math.min((int) j, 10000);
        }
        return 10000;
    }

    final long c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.c;
        if (j == -1) {
            this.c = uptimeMillis;
            j = uptimeMillis;
        }
        return uptimeMillis - j;
    }

    final void d() {
        this.c = -1L;
    }
}
