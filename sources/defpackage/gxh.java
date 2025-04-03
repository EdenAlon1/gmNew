package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gxh {
    public final float a;
    public final boolean b;

    public gxh(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxh)) {
            return false;
        }
        gxh gxhVar = (gxh) obj;
        return Float.compare(this.a, gxhVar.a) == 0 && this.b == gxhVar.b;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "TmpKeyline(size=" + this.a + ", isAnchor=" + this.b + ')';
    }
}
