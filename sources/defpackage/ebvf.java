package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebvf extends ebve {
    private final String a;
    private final int b;

    public ebvf(int i, String str) {
        this.b = i;
        this.a = str;
    }

    @Override // defpackage.ebve
    public final String b() {
        return this.a;
    }

    @Override // defpackage.ebve
    public final int c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebve) {
            ebve ebveVar = (ebve) obj;
            if (this.b == ebveVar.c() && ((str = this.a) != null ? str.equals(ebveVar.b()) : ebveVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return (str == null ? 0 : str.hashCode()) ^ ((this.b ^ 1000003) * 1000003);
    }

    public final String toString() {
        int i = this.b;
        return "AuthChannel{type=" + (i != 1 ? i != 2 ? "PSEUDONYMOUS" : "ANONYMOUS" : "GAIA") + ", account=" + this.a + "}";
    }
}
