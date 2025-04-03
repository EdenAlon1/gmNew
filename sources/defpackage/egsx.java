package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egsx implements egte {
    private final Throwable a;

    public egsx(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof egsx) && ffkj.e(this.a, ((egsx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(exception=" + this.a + ")";
    }
}
