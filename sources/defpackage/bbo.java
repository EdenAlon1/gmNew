package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbo extends bgn {
    private final Throwable a;

    public bbo(Throwable th) {
        this.a = th;
    }

    @Override // defpackage.bgn
    public final Throwable a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bgn) {
            return this.a.equals(((bgn) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ErrorWrapper{error=" + this.a + "}";
    }
}
