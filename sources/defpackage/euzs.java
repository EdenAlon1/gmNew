package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euzs extends evax {
    private final String a;

    public euzs(String str) {
        if (str == null) {
            throw new NullPointerException("Null key");
        }
        this.a = str;
    }

    @Override // defpackage.evax
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof evax) {
            return this.a.equals(((evax) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "HttpHeaderKey{key=" + this.a + "}";
    }
}
