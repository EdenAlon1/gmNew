package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dire extends dism {
    private final String a;

    public dire(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.a = str;
    }

    @Override // java.security.Principal
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dism) {
            return this.a.equals(((dism) obj).getName());
        }
        return false;
    }

    @Override // defpackage.dism, java.security.Principal
    public final String getName() {
        return this.a;
    }

    @Override // java.security.Principal
    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override // java.security.Principal
    public final String toString() {
        return "GbaPrincipal{name=" + this.a + "}";
    }
}
