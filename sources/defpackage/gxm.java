package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gxm {
    public final int a;
    public final int b;
    public final float c;

    public gxm(int i, int i2, float f) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxm)) {
            return false;
        }
        gxm gxmVar = (gxm) obj;
        return this.a == gxmVar.a && this.b == gxmVar.b && Float.compare(this.c, gxmVar.c) == 0;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return "ShiftPointRange(fromStepIndex=" + this.a + ", toStepIndex=" + this.b + ", steppedInterpolation=" + this.c + ')';
    }
}
