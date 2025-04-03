package defpackage;

import android.os.SystemClock;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlqb implements dlpw {
    @Override // defpackage.dlpw
    public final long a() {
        return SystemClock.elapsedRealtime();
    }

    @Override // defpackage.dlpw
    public final long b() {
        return dlqa.a ? SystemClock.elapsedRealtimeNanos() : SystemClock.elapsedRealtime() * 1000000;
    }

    @Override // defpackage.dlpw
    public final long c() {
        return System.nanoTime();
    }

    @Override // defpackage.dlpw
    public final Duration d() {
        return Duration.ofMillis(SystemClock.currentThreadTimeMillis());
    }

    @Override // defpackage.dlpw
    public final Duration e() {
        return Duration.ofMillis(SystemClock.uptimeMillis());
    }

    @Override // defpackage.dlpw
    public final Instant f() {
        return Instant.now();
    }
}
