package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzut extends dzvv {
    public final engw a;
    public final emxc b;

    public dzut(engw engwVar, emxc emxcVar) {
        this.a = engwVar;
        this.b = emxcVar;
    }

    @Override // defpackage.dzvv
    public final emxc a() {
        return this.b;
    }

    @Override // defpackage.dzvv
    public final engw b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzvv) {
            dzvv dzvvVar = (dzvv) obj;
            if (enkr.h(this.a, dzvvVar.b()) && this.b.equals(dzvvVar.a())) {
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
        return "StackCard{components=" + String.valueOf(this.a) + ", preferredMaxWidth=" + String.valueOf(emxcVar) + "}";
    }
}
