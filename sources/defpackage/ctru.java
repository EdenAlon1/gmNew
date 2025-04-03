package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctru extends ctsb {
    public final String a;
    public final String b;

    public ctru(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.ctsb
    public final String a() {
        return this.a;
    }

    @Override // defpackage.ctsb
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctsb) {
            ctsb ctsbVar = (ctsb) obj;
            if (this.a.equals(ctsbVar.a()) && this.b.equals(ctsbVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "ReactionMatchResult{reactedMessage=" + this.a + ", reaction=" + this.b + "}";
    }
}
