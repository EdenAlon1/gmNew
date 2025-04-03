package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzad extends dzbc {
    public final dzpt a;
    public final dzav b;

    public dzad(dzpt dzptVar, dzav dzavVar) {
        this.a = dzptVar;
        this.b = dzavVar;
    }

    @Override // defpackage.dzbc
    public final dzav a() {
        return this.b;
    }

    @Override // defpackage.dzbc
    public final dzpt b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzbc) {
            dzbc dzbcVar = (dzbc) obj;
            if (this.a.equals(dzbcVar.b()) && this.b.equals(dzbcVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        dzav dzavVar = this.b;
        return "SessionProfileUpdate{conversationId=" + this.a.toString() + ", profileInfo=" + dzavVar.toString() + "}";
    }
}
