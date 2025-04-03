package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmzu {
    public final float a;
    public final float b;
    public final float c;

    public dmzu(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmzu)) {
            return false;
        }
        dmzu dmzuVar = (dmzu) obj;
        return jzq.b(this.a, dmzuVar.a) && jzq.b(this.b, dmzuVar.b) && jzq.b(this.c, dmzuVar.c);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        float f = this.c;
        float f2 = this.b;
        return "GalleryDimensions(smallItemSideLength=" + jzq.a(this.a) + ", bigItemWidth=" + jzq.a(f2) + ", bigItemHeight=" + jzq.a(f) + ")";
    }
}
