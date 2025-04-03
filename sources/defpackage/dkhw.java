package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkhw {
    public static final long a = TimeUnit.MINUTES.toMillis(1);
    public final long b;
    public final long c = SystemClock.elapsedRealtime();

    public dkhw(long j) {
        this.b = j;
    }
}
