package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dfmg {
    public static final dfmg c;

    static {
        d(1, Double.valueOf(eobe.a));
        c(3);
        c(4);
        c = c(5);
    }

    static dfmg c(int i) {
        emxf.a(true);
        emxf.a(true);
        return d(i, null);
    }

    static dfmg d(int i, Double d) {
        if (d == null) {
            d = Double.valueOf(eobe.a);
        }
        return new dfky(i, d.doubleValue());
    }

    public abstract double a();

    public abstract int b();
}
