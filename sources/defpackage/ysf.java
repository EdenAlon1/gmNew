package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ysf implements ysh {
    private final Exception a;

    public ysf(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ysf) && ffkj.e(this.a, ((ysf) obj).a);
    }

    public final int hashCode() {
        Exception exc = this.a;
        if (exc == null) {
            return 0;
        }
        return exc.hashCode();
    }

    public final String toString() {
        return "Failed(exception=" + this.a + ")";
    }

    public ysf() {
        this(null);
    }
}
