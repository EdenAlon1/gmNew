package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djul extends djum {
    private final clxt a;
    private final String b;

    public djul(clxt clxtVar, String str) {
        if (clxtVar == null) {
            throw new NullPointerException("Null googleToSConsentState");
        }
        this.a = clxtVar;
        this.b = str;
    }

    @Override // defpackage.djum
    public final clxt a() {
        return this.a;
    }

    @Override // defpackage.djum
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof djum) {
            djum djumVar = (djum) obj;
            if (this.a.equals(djumVar.a()) && ((str = this.b) != null ? str.equals(djumVar.b()) : djumVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        return (hashCode * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "GoogleToSConsent{googleToSConsentState=" + this.a.toString() + ", token=" + this.b + "}";
    }
}
