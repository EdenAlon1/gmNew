package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dowh extends dowi {
    private final float a;

    public dowh(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dowh) && Float.compare(this.a, ((dowh) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "Loading(progress=" + this.a + ")";
    }
}
