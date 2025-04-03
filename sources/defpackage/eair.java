package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eair extends eaix {
    private final String e;

    public eair(String str) {
        if (str == null) {
            throw new NullPointerException("Null key");
        }
        this.e = str;
    }

    @Override // defpackage.eaix
    public final String a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eaix) {
            return this.e.equals(((eaix) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "GnpHttpHeaderKey{key=" + this.e + "}";
    }
}
