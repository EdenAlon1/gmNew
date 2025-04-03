package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ntp {
    public static final ntp a = new nto().a();
    public final int b;
    public final int d;
    public final int e;
    public final int c = 1;
    public final float f = 1.0f;
    public final int g = -1;
    public final int h = -1;
    public final long i = -1;

    public ntp(int i, int i2, int i3) {
        this.b = i;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ntp)) {
            return false;
        }
        ntp ntpVar = (ntp) obj;
        if (this.b == ntpVar.b) {
            int i = ntpVar.c;
            if (this.d == ntpVar.d && this.e == ntpVar.e) {
                float f = ntpVar.f;
                int i2 = ntpVar.g;
                int i3 = ntpVar.h;
                long j = ntpVar.i;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.b + 217) * 31) + 1) * 31) + this.d) * 31) + this.e) * 31) + Float.floatToIntBits(1.0f)) * 31) - 1) * 31) - 1) * 31) + ((int) (-4294967296L));
    }
}
