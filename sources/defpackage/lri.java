package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lri {
    public static final lri a = new lri(1.0f, 1.0f);
    public final float b;
    public final float c;
    public final int d;

    static {
        lvf.N(0);
        lvf.N(1);
    }

    public lri(float f, float f2) {
        lti.a(f > 0.0f);
        lti.a(f2 > 0.0f);
        this.b = f;
        this.c = f2;
        this.d = Math.round(f * 1000.0f);
    }

    public final lri a(float f) {
        return new lri(f, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            lri lriVar = (lri) obj;
            if (this.b == lriVar.b && this.c == lriVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.b) + 527) * 31) + Float.floatToRawIntBits(this.c);
    }

    public final String toString() {
        return lvf.G("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.b), Float.valueOf(this.c));
    }
}
