package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvt {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public fvt(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof fvt)) {
            return false;
        }
        fvt fvtVar = (fvt) obj;
        return jzq.b(this.a, fvtVar.a) && jzq.b(this.b, fvtVar.b) && jzq.b(this.c, fvtVar.c) && jzq.b(this.d, fvtVar.d) && jzq.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(0.0f);
    }
}
