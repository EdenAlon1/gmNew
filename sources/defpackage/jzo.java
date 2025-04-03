package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jzo implements jzn {
    private final float a;
    private final float b = 1.0f;

    public jzo(float f) {
        this.a = f;
    }

    @Override // defpackage.jzn
    public final float ec() {
        return this.a;
    }

    @Override // defpackage.jzx
    public final float ed() {
        return 1.0f;
    }

    @Override // defpackage.jzx
    public final /* synthetic */ float ef(long j) {
        return jzw.a(this, j);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ float eg(float f) {
        return jzm.a(this, f);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ float ek(int i) {
        return jzm.b(this, i);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ float el(long j) {
        return jzm.c(this, j);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ float em(float f) {
        return jzm.d(this, f);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ int en(long j) {
        return jzm.e(this, j);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ int eo(float f) {
        return jzm.f(this, f);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ long ep(long j) {
        return jzm.g(this, j);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ long eq(long j) {
        return jzm.h(this, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzo)) {
            return false;
        }
        jzo jzoVar = (jzo) obj;
        if (Float.compare(this.a, jzoVar.a) != 0) {
            return false;
        }
        float f = jzoVar.b;
        return Float.compare(1.0f, 1.0f) == 0;
    }

    @Override // defpackage.jzx
    public final /* synthetic */ long er(float f) {
        return jzw.b(this, f);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ long es(float f) {
        return jzm.i(this, f);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(1.0f);
    }

    public final String toString() {
        return "DensityImpl(density=" + this.a + ", fontScale=1.0)";
    }
}
