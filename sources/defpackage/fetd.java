package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fetd {
    private final AtomicLong a = new AtomicLong();

    final long a(long j) {
        return this.a.addAndGet(j);
    }
}
