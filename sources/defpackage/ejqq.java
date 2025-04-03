package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejqq extends ejqs {
    public final Throwable a;

    public ejqq(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ejqq) && ffkj.e(this.a, ((ejqq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(error=" + this.a + ")";
    }
}
