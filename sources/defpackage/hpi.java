package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpi {
    public int a;

    public hpi() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hpi) && this.a == ((hpi) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "DeltaCounter(count=" + this.a + ')';
    }

    public /* synthetic */ hpi(byte[] bArr) {
        this.a = 0;
    }
}
