package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejtz extends ejvz {
    private final String a;

    public ejtz(String str) {
        if (str == null) {
            throw new NullPointerException("Null stringRepresentation");
        }
        this.a = str;
    }

    @Override // defpackage.ejvz
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ejvz) {
            return this.a.equals(((ejvz) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "SingleStringKey{stringRepresentation=" + this.a + "}";
    }
}
