package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avtf {
    private Duration a;
    private Duration b;

    public final avtj a() {
        Duration duration;
        Duration duration2 = this.a;
        if (duration2 != null && (duration = this.b) != null) {
            return new avtm(duration2, duration);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" rcsValidity");
        }
        if (this.b == null) {
            sb.append(" nonRcsValidity");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(Duration duration) {
        if (duration == null) {
            throw new NullPointerException("Null nonRcsValidity");
        }
        this.b = duration;
    }

    public final void c(Duration duration) {
        if (duration == null) {
            throw new NullPointerException("Null rcsValidity");
        }
        this.a = duration;
    }
}
