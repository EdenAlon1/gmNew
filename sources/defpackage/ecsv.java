package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecsv {
    private final ffbr b;
    private final Object a = new Object();
    private int c = 0;
    private long d = 0;

    public ecsv(ffbr ffbrVar) {
        this.b = ffbrVar;
    }

    public static ecsv a(final int i) {
        return new ecsv(new ffbr() { // from class: ecsu
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                return Integer.valueOf(i);
            }
        });
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (this.a) {
            this.c++;
            if (elapsedRealtime - this.d > 1000) {
                this.c = 0;
                this.d = elapsedRealtime;
            }
        }
    }

    public final boolean c() {
        int intValue = ((Integer) this.b.b()).intValue();
        if (intValue == 0) {
            return true;
        }
        if (intValue == Integer.MAX_VALUE) {
            return false;
        }
        synchronized (this.a) {
            if (this.c < intValue) {
                return false;
            }
            return SystemClock.elapsedRealtime() - this.d <= 1000;
        }
    }
}
