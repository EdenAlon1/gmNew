package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csql extends csqy {
    private final long c;
    private final String d;

    public csql(long j, String str) {
        this.c = j;
        this.d = str;
    }

    @Override // defpackage.csqy
    public final long a() {
        return this.c;
    }

    @Override // defpackage.csqy
    public final String b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof csqy) {
            csqy csqyVar = (csqy) obj;
            if (this.c == csqyVar.a() && ((str = this.d) != null ? str.equals(csqyVar.b()) : csqyVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.d;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.c;
        return hashCode ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ContactsDirectory{id=" + this.c + ", displayName=" + this.d + "}";
    }
}
