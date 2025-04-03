package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes9.dex */
public final class OptionalDouble {
    private static final OptionalDouble c = new OptionalDouble();
    private final boolean a;
    private final double b;

    private OptionalDouble() {
        this.a = false;
        this.b = Double.NaN;
    }

    public static OptionalDouble a() {
        return c;
    }

    public static OptionalDouble b(double d) {
        return new OptionalDouble(d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionalDouble)) {
            return false;
        }
        OptionalDouble optionalDouble = (OptionalDouble) obj;
        boolean z = this.a;
        return (z && optionalDouble.a) ? Double.compare(this.b, optionalDouble.b) == 0 : z == optionalDouble.a;
    }

    public double getAsDouble() {
        if (this.a) {
            return this.b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final int hashCode() {
        if (!this.a) {
            return 0;
        }
        long doubleToLongBits = Double.doubleToLongBits(this.b);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public boolean isPresent() {
        return this.a;
    }

    public final String toString() {
        if (!this.a) {
            return "OptionalDouble.empty";
        }
        return "OptionalDouble[" + this.b + "]";
    }

    private OptionalDouble(double d) {
        this.a = true;
        this.b = d;
    }
}
