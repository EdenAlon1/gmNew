package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awap {
    public final String a;

    public awap(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof awap) && ffkj.e(this.a, ((awap) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ProcessingId(id=" + this.a + ")";
    }
}
