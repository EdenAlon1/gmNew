package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cuk {
    public final float a;
    public final float b;
    private final jzn c;

    public cuk(float f, jzn jznVar) {
        this.a = f;
        this.c = jznVar;
        float ec = jznVar.ec();
        float f2 = cul.a;
        this.b = ec * 386.0878f * 160.0f * 0.84f;
    }

    public final double a(float f) {
        int i = cpz.a;
        return Math.log((Math.abs(f) * 0.35f) / (this.a * this.b));
    }

    public final cuj b(float f) {
        double a = a(f);
        double d = cul.a - 1.0d;
        return new cuj(f, (float) (this.a * this.b * Math.exp((cul.a / d) * a)), (long) (Math.exp(a / d) * 1000.0d));
    }
}
