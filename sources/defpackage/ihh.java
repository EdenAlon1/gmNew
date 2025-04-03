package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ihh extends ihy {
    public final float a;

    public ihh(float f) {
        super(false, false, 3);
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ihh) && Float.compare(this.a, ((ihh) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "HorizontalTo(x=" + this.a + ')';
    }
}
