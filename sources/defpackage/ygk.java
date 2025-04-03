package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ygk {
    public final boolean a;
    public final long b;

    public ygk(boolean z, long j) {
        this.a = z;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygk)) {
            return false;
        }
        ygk ygkVar = (ygk) obj;
        return this.a == ygkVar.a && this.b == ygkVar.b;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        long j = this.b;
        return (i * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "InfoData(useInfoTooltip=" + this.a + ", maxMessageSizeBytes=" + this.b + ")";
    }
}
