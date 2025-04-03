package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtfy implements dtga {
    public final Duration a;

    public dtfy(Duration duration) {
        this.a = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dtfy) && ffkj.e(this.a, ((dtfy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Recording(elapsedTime=" + this.a + ")";
    }
}
