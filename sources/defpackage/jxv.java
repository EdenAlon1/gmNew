package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class jxv {
    public final float a;

    public final boolean equals(Object obj) {
        return (obj instanceof jxv) && Float.compare(this.a, ((jxv) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.a + ')';
    }
}
