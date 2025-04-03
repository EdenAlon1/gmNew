package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hhu {
    private final String a;

    public hhu(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hhu) && ffkj.e(this.a, ((hhu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpaqueKey(key=" + this.a + ')';
    }
}
