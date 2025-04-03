package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eawb extends eaww {
    private final emxc a;
    private final emxc b;

    public eawb(emxc emxcVar, emxc emxcVar2) {
        this.a = emxcVar;
        this.b = emxcVar2;
    }

    @Override // defpackage.eaww
    public final emxc a() {
        return this.a;
    }

    @Override // defpackage.eaww
    public final emxc b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eaww) {
            eaww eawwVar = (eaww) obj;
            if (this.a.equals(eawwVar.a()) && this.b.equals(eawwVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        emxc emxcVar = this.b;
        return "DecorationContent{badgeContent=" + String.valueOf(this.a) + ", ringContent=" + String.valueOf(emxcVar) + "}";
    }
}
