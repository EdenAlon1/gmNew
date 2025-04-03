package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejqr extends ejqs {
    public final Object a;

    public ejqr(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ejqr) && ffkj.e(this.a, ((ejqr) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Success(value=" + this.a + ")";
    }
}
