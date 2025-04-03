package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yax {
    public final long a;
    public final long b;

    public yax(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yax)) {
            return false;
        }
        yax yaxVar = (yax) obj;
        return this.a == yaxVar.a && this.b == yaxVar.b;
    }

    public final int hashCode() {
        return (yaw.a(this.a) * 31) + yaw.a(this.b);
    }

    public final String toString() {
        return "AttachmentSize(currentSizeBytes=" + this.a + ", finalSizeBytes=" + this.b + ")";
    }
}
