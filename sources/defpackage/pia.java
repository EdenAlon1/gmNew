package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pia extends pib {
    private final float a;

    public pia(float f) {
        super("dimension in ratio:" + f);
        this.a = f;
        double d = (double) f;
        if (d <= eobe.a || d > 1.0d) {
            throw new IllegalArgumentException("Ratio must be in range (0.0, 1.0]");
        }
    }

    public final int a(int i) {
        return (int) (this.a * i);
    }
}
