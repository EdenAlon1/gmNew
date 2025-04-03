package defpackage;

import j$.time.Duration;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqes implements Closeable {
    private final cqoh a;
    private final Duration b;
    private Duration c;

    public cqes(cqoh cqohVar) {
        this.a = cqohVar;
        this.b = Duration.ofMillis(cqohVar.a());
    }

    public final Duration a() {
        Duration duration = this.c;
        if (duration == null) {
            duration = Duration.ofMillis(this.a.a());
        }
        Duration minus = duration.minus(this.b);
        minus.getClass();
        return minus;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c != null) {
            throw new IllegalArgumentException("Timer has already been closed");
        }
        this.c = Duration.ofMillis(this.a.a());
    }
}
