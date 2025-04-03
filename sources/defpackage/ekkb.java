package defpackage;

import android.os.Process;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekkb {

    /* compiled from: PG */
    public interface a {
        elbx b();
    }

    public static final long a(long j) {
        return Math.max(0L, System.currentTimeMillis() - Math.max(0L, SystemClock.elapsedRealtime() - j));
    }

    public static final long b() {
        long startElapsedRealtime;
        emxc a2 = ecqr.a();
        if (a2.g()) {
            return ((Long) a2.c()).longValue();
        }
        int i = ekka.u;
        startElapsedRealtime = Process.getStartElapsedRealtime();
        return startElapsedRealtime;
    }
}
