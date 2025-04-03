package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cup {
    public final float a;
    public final long b;
    public final cyq c;

    public cup(float f, long j, cyq cyqVar) {
        this.a = f;
        this.b = j;
        this.c = cyqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cup)) {
            return false;
        }
        cup cupVar = (cup) obj;
        return Float.compare(this.a, cupVar.a) == 0 && idr.d(this.b, cupVar.b) && ffkj.e(this.c, cupVar.c);
    }

    public final int hashCode() {
        int floatToIntBits = Float.floatToIntBits(this.a) * 31;
        long j = idr.a;
        return ((floatToIntBits + idq.a(this.b)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Scale(scale=" + this.a + ", transformOrigin=" + ((Object) idr.c(this.b)) + ", animationSpec=" + this.c + ')';
    }
}
