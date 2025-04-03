package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class glt {
    public final float a;

    public glt(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof glt)) {
            return false;
        }
        return jzq.b(0.0f, 0.0f) && jzq.b(0.0f, 0.0f) && jzq.b(0.0f, 0.0f) && jzq.b(this.a, ((glt) obj).a) && jzq.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(0.0f) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(this.a)) * 31) + Float.floatToIntBits(0.0f);
    }
}
