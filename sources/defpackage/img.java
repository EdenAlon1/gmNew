package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class img {
    public long a;
    public float b;

    public img(long j, float f) {
        this.a = j;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof img)) {
            return false;
        }
        img imgVar = (img) obj;
        return this.a == imgVar.a && Float.compare(this.b, imgVar.b) == 0;
    }

    public final int hashCode() {
        long j = this.a;
        return (((int) (j ^ (j >>> 32))) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "DataPointAtTime(time=" + this.a + ", dataPoint=" + this.b + ')';
    }
}
