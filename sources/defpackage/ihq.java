package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ihq extends ihy {
    public final float a;

    public ihq(float f) {
        super(false, false, 3);
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ihq) && Float.compare(this.a, ((ihq) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "RelativeHorizontalTo(dx=" + this.a + ')';
    }
}
