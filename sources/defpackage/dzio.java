package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzio extends dzpt {
    public final dzpg a;
    public final dzps b;

    public dzio(dzpg dzpgVar, dzps dzpsVar) {
        if (dzpgVar == null) {
            throw new NullPointerException("Null owner");
        }
        this.a = dzpgVar;
        if (dzpsVar == null) {
            throw new NullPointerException("Null oneOfId");
        }
        this.b = dzpsVar;
    }

    @Override // defpackage.dzpt
    public final dzpg a() {
        return this.a;
    }

    @Override // defpackage.dzpt
    public final dzps b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzpt) {
            dzpt dzptVar = (dzpt) obj;
            if (this.a.equals(dzptVar.a()) && this.b.equals(dzptVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        dzps dzpsVar = this.b;
        return "ConversationId{owner=" + this.a.toString() + ", oneOfId=" + dzpsVar.toString() + "}";
    }
}
