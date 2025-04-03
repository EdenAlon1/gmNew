package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cukv extends culc {
    private final cula a;
    private final String b;
    private final String c;

    public cukv(cula culaVar, String str, String str2) {
        this.a = culaVar;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.culc
    public final cula a() {
        return this.a;
    }

    @Override // defpackage.culc
    public final String b() {
        return this.b;
    }

    @Override // defpackage.culc
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof culc) {
            culc culcVar = (culc) obj;
            if (this.a.equals(culcVar.a()) && this.b.equals(culcVar.b()) && this.c.equals(culcVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "LinkPreviewSpamCheckParams{messageSuspiciousnessScore=" + this.a.toString() + ", countryCode=" + this.b + ", locale=" + this.c + "}";
    }
}
