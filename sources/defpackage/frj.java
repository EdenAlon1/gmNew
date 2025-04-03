package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frj {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public frj(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frj)) {
            return false;
        }
        frj frjVar = (frj) obj;
        return this.a == frjVar.a && this.b == frjVar.b && this.c == frjVar.c && this.d == frjVar.d;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d);
    }

    public final String toString() {
        return "RippleAlpha(draggedAlpha=" + this.a + ", focusedAlpha=" + this.b + ", hoveredAlpha=" + this.c + ", pressedAlpha=" + this.d + ')';
    }
}
