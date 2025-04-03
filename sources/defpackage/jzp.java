package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jzp implements jzn {
    private final float a;
    private final float b;
    private final kap c;

    public jzp(float f, float f2, kap kapVar) {
        this.a = f;
        this.b = f2;
        this.c = kapVar;
    }

    @Override // defpackage.jzn
    public final float ec() {
        return this.a;
    }

    @Override // defpackage.jzx
    public final float ed() {
        return this.b;
    }

    @Override // defpackage.jzx
    public final float ef(long j) {
        if (kam.b(kak.c(j), 4294967296L)) {
            return this.c.b(kak.a(j));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
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
        if (!(obj instanceof jzp)) {
            return false;
        }
        jzp jzpVar = (jzp) obj;
        return Float.compare(this.a, jzpVar.a) == 0 && Float.compare(this.b, jzpVar.b) == 0 && ffkj.e(this.c, jzpVar.c);
    }

    @Override // defpackage.jzx
    public final long er(float f) {
        return kal.b(this.c.a(f));
    }

    @Override // defpackage.jzn
    public final /* synthetic */ long es(float f) {
        return jzm.i(this, f);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.a + ", fontScale=" + this.b + ", converter=" + this.c + ')';
    }
}
