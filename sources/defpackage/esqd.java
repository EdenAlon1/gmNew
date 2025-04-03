package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esqd {
    public final String a;

    public esqd(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof esqd) && ffkj.e(this.a, ((esqd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TraceId(id=" + this.a + ")";
    }
}
