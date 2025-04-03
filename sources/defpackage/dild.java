package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dild extends dilp {
    public final int a;
    private final String b;

    public dild(int i, String str) {
        this.a = i;
        if (str == null) {
            throw new NullPointerException("Null text");
        }
        this.b = str;
    }

    @Override // defpackage.dilp
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dilp
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dilp) {
            dilp dilpVar = (dilp) obj;
            if (this.a == dilpVar.a() && this.b.equals(dilpVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "DisconnectionReason{cause=" + this.a + ", text=" + this.b + "}";
    }
}
