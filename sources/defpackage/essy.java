package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class essy {
    public final Instant a;

    public essy(Instant instant) {
        this.a = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof essy) && ffkj.e(this.a, ((essy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SendMessageResponse(timestamp=" + this.a + ")";
    }
}
