package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajde extends ajdf {
    private final Exception a;

    public ajde(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ajde) && ffkj.e(this.a, ((ajde) obj).a);
    }

    public final int hashCode() {
        Exception exc = this.a;
        if (exc == null) {
            return 0;
        }
        return exc.hashCode();
    }

    public final String toString() {
        return "UnrecoverableError(exception=" + this.a + ")";
    }
}
