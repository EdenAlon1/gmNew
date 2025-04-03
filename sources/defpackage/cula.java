package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cula implements Comparable {
    public static final cula a = new cula(eobe.a);
    public static final cula b = new cula(0.5d);
    public static final cula c = new cula(1.0d);
    private final double d;

    public cula(double d) {
        this.d = d;
        if (d < eobe.a) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (d > 1.0d) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final float a() {
        return (float) this.d;
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(cula culaVar) {
        culaVar.getClass();
        return Double.compare(this.d, culaVar.d);
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof cula) && this.d == ((cula) obj).d;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.d);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final String toString() {
        return String.valueOf(this.d);
    }
}
