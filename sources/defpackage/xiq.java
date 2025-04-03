package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xiq {
    public final long a;
    public final int b;
    public final boolean c;

    public xiq(long j, int i, boolean z) {
        this.a = j;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xiq)) {
            return false;
        }
        xiq xiqVar = (xiq) obj;
        return this.a == xiqVar.a && this.b == xiqVar.b && this.c == xiqVar.c;
    }

    public final int hashCode() {
        int i = true != this.c ? 1237 : 1231;
        long j = this.a;
        return (((((int) (j ^ (j >>> 32))) * 31) + this.b) * 31) + i;
    }

    public final String toString() {
        return "ComposeConstraintsTransportCapabilityData(maxMessageSizeBytes=" + this.a + ", textLengthLimit=" + this.b + ", hasActiveSelfIdentity=" + this.c + ")";
    }
}
