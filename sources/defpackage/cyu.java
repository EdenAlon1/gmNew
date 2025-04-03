package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyu implements cyt {
    private final float a;
    private final float b;

    public cyu() {
        this(null);
    }

    @Override // defpackage.cyt
    public final float a() {
        return this.a;
    }

    @Override // defpackage.cyt
    public final float b(float f, float f2) {
        float abs = Math.abs(f2);
        float f3 = this.a;
        if (abs <= f3) {
            return f;
        }
        double abs2 = Math.abs(f3 / f2);
        float f4 = this.b;
        double d = f4;
        float f5 = f2 / f4;
        return (f - f5) + (f5 * ((float) Math.exp((d * ((Math.log(abs2) / d) * 1000.0d)) / 1000.0d)));
    }

    @Override // defpackage.cyt
    public final float c(long j, float f, float f2) {
        float exp = (float) Math.exp((this.b * (j / 1000000)) / 1000.0f);
        float f3 = f2 / this.b;
        return (f - f3) + (f3 * exp);
    }

    @Override // defpackage.cyt
    public final long d(float f) {
        return ((long) ((((float) Math.log(this.a / Math.abs(f))) * 1000.0f) / this.b)) * 1000000;
    }

    @Override // defpackage.cyt
    public final float e(long j, float f) {
        return f * ((float) Math.exp(((j / 1000000) / 1000.0f) * this.b));
    }

    public cyu(byte[] bArr) {
        this.a = Math.max(1.0E-7f, Math.abs(0.1f));
        this.b = Math.max(1.0E-4f, 1.0f) * (-4.2f);
    }
}
