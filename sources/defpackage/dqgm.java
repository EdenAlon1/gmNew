package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqgm {
    public final long a;

    public dqgm(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dqgm) && this.a == ((dqgm) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "UserContext(conversationId=" + this.a + ")";
    }
}
