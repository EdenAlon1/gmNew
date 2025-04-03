package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgz {
    private final Object a;
    private final Object b;

    public hgz(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    private static final int a(Object obj) {
        if (obj instanceof Enum) {
            return ((Enum) obj).ordinal();
        }
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hgz)) {
            return false;
        }
        hgz hgzVar = (hgz) obj;
        return ffkj.e(this.a, hgzVar.a) && ffkj.e(this.b, hgzVar.b);
    }

    public final int hashCode() {
        return (a(this.a) * 31) + a(this.b);
    }

    public final String toString() {
        return "JoinedKey(left=" + this.a + ", right=" + this.b + ')';
    }
}
