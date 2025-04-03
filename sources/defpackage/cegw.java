package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cegw implements cegx {
    public final Exception a;

    public cegw(Exception exc) {
        exc.getClass();
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cegw) && ffkj.e(this.a, ((cegw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RetryThisPage(failure=" + this.a + ")";
    }
}
