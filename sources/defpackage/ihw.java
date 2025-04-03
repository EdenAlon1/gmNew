package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ihw extends ihy {
    public final float a;

    public ihw(float f) {
        super(false, false, 3);
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ihw) && Float.compare(this.a, ((ihw) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "RelativeVerticalTo(dy=" + this.a + ')';
    }
}
