package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebf implements ebe {
    public final float a;
    public final float b;
    private final float c;
    private final float d;

    public ebf(float f, float f2, float f3, float f4) {
        this.c = f;
        this.a = f2;
        this.d = f3;
        this.b = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            edc.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.ebe
    public final float a() {
        return this.b;
    }

    @Override // defpackage.ebe
    public final float b(kah kahVar) {
        return kahVar == kah.a ? this.c : this.d;
    }

    @Override // defpackage.ebe
    public final float c(kah kahVar) {
        return kahVar == kah.a ? this.d : this.c;
    }

    @Override // defpackage.ebe
    public final float d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ebf)) {
            return false;
        }
        ebf ebfVar = (ebf) obj;
        return jzq.b(this.c, ebfVar.c) && jzq.b(this.a, ebfVar.a) && jzq.b(this.d, ebfVar.d) && jzq.b(this.b, ebfVar.b);
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.a)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) jzq.a(this.c)) + ", top=" + ((Object) jzq.a(this.a)) + ", end=" + ((Object) jzq.a(this.d)) + ", bottom=" + ((Object) jzq.a(this.b)) + ')';
    }
}
