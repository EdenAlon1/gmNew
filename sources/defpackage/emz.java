package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class emz implements dmk {
    private final eot b;
    private final dmk c;

    public emz(eot eotVar, dmk dmkVar) {
        this.b = eotVar;
        this.c = dmkVar;
    }

    @Override // defpackage.dmk
    public final float a(float f, float f2, float f3) {
        float f4 = f + f2;
        float a = this.c.a(f, f2, f3);
        boolean z = true;
        if (f <= 0.0f ? f4 > 0.0f : f4 <= f3) {
            z = false;
        }
        if (Math.abs(a) != 0.0f && z) {
            float f5 = -this.b.g;
            while (a > 0.0f && f5 < a) {
                f5 += this.b.l();
            }
            while (a < 0.0f && f5 > a) {
                f5 -= this.b.l();
            }
            return f5;
        }
        if (Math.abs(this.b.g) < 1.0E-6d) {
            return 0.0f;
        }
        float f6 = -r5.g;
        if (this.b.v()) {
            f6 += this.b.l();
        }
        return ffmk.e(f6, -f3, f3);
    }
}
