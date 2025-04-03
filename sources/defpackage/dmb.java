package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmb {
    public final float a;
    public final long b;
    public final float c;

    public dmb(float f, long j, float f2) {
        this.a = f;
        this.b = j;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmb)) {
            return false;
        }
        dmb dmbVar = (dmb) obj;
        return Float.compare(this.a, dmbVar.a) == 0 && iak.i(this.b, dmbVar.b) && Float.compare(this.c, dmbVar.c) == 0;
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + iaj.a(this.b)) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return "AnimationData(zoom=" + this.a + ", offset=" + ((Object) iak.h(this.b)) + ", degrees=" + this.c + ')';
    }
}
