package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eedn extends eeer {
    public final String a;
    public final ezaa b;
    public final String c;
    public final long d;
    public final boolean e;

    public eedn(String str, ezaa ezaaVar, String str2, long j, boolean z) {
        this.a = str;
        if (ezaaVar == null) {
            throw new NullPointerException("Null type");
        }
        this.b = ezaaVar;
        this.c = str2;
        this.d = j;
        this.e = z;
    }

    @Override // defpackage.eeer
    public final long a() {
        return this.d;
    }

    @Override // defpackage.eeer
    public final ezaa b() {
        return this.b;
    }

    @Override // defpackage.eeer
    public final String c() {
        return this.c;
    }

    @Override // defpackage.eeer
    public final String d() {
        return this.a;
    }

    @Override // defpackage.eeer
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof eeer) {
            eeer eeerVar = (eeer) obj;
            if (this.a.equals(eeerVar.d()) && this.b.equals(eeerVar.b()) && ((str = this.c) != null ? str.equals(eeerVar.c()) : eeerVar.c() == null) && this.d == eeerVar.a() && this.e == eeerVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        String str = this.c;
        int hashCode2 = ((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j = this.d;
        return ((hashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ (true != this.e ? 1237 : 1231);
    }

    public final String toString() {
        return "LoggableQuery{target=" + this.a + ", type=" + this.b.toString() + ", dnsServer=" + this.c + ", queryTimeMillis=" + this.d + ", isFallbackAttempt=" + this.e + "}";
    }
}
