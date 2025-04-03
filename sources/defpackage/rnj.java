package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rnj {
    public final float a;
    public final float b;
    public float c;
    public float d;

    public rnj(float f, float f2, float f3, float f4) {
        this.c = 0.0f;
        this.d = 0.0f;
        this.a = f;
        this.b = f2;
        double sqrt = Math.sqrt((f3 * f3) + (f4 * f4));
        if (sqrt != eobe.a) {
            this.c = (float) (f3 / sqrt);
            this.d = (float) (f4 / sqrt);
        }
    }

    public final void a(rnj rnjVar) {
        this.c += rnjVar.c;
        this.d += rnjVar.d;
    }

    public final void b(float f, float f2) {
        float f3 = f2 - this.b;
        float f4 = f - this.a;
        double sqrt = Math.sqrt((f4 * f4) + (f3 * f3));
        if (sqrt != eobe.a) {
            this.c += (float) (f4 / sqrt);
            this.d += (float) (f3 / sqrt);
        }
    }

    public final String toString() {
        return "(" + this.a + "," + this.b + " " + this.c + "," + this.d + ")";
    }
}
