package defpackage;

import android.graphics.Point;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cqwj extends cqxg {
    private final Point a;
    private final Duration b;

    public cqwj(Point point, Duration duration) {
        this.a = point;
        if (duration == null) {
            throw new NullPointerException("Null duration");
        }
        this.b = duration;
    }

    @Override // defpackage.cqxg
    public final Point a() {
        return this.a;
    }

    @Override // defpackage.cqxg
    public final Duration b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqxg) {
            cqxg cqxgVar = (cqxg) obj;
            if (this.a.equals(cqxgVar.a()) && this.b.equals(cqxgVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Duration duration = this.b;
        return "VideoMetadata{videoSize=" + this.a.toString() + ", duration=" + duration.toString() + "}";
    }
}
