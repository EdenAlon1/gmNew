package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ainc implements aihu {
    public final String a;

    public ainc(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ainc) && ffkj.e(this.a, ((ainc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RetrievePendingActivityResult(key=" + this.a + ")";
    }
}
