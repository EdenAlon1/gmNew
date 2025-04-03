package defpackage;

import java.security.Principal;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dird extends disl {
    private final Principal b;
    private final String c;

    public dird(Principal principal, String str) {
        this.b = principal;
        if (str == null) {
            throw new NullPointerException("Null password");
        }
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof disl) {
            disl dislVar = (disl) obj;
            if (this.b.equals(dislVar.getUserPrincipal()) && this.c.equals(dislVar.getPassword())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.disl, org.apache.http.auth.Credentials
    public final String getPassword() {
        return this.c;
    }

    @Override // defpackage.disl, org.apache.http.auth.Credentials
    public final Principal getUserPrincipal() {
        return this.b;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "GbaCredentials{userPrincipal=" + this.b.toString() + ", password=" + this.c + "}";
    }
}
