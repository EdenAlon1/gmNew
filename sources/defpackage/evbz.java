package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evbz extends evcd {
    public final emxc a;
    public final enip b;

    public evbz(emxc emxcVar, enip enipVar) {
        this.a = emxcVar;
        this.b = enipVar;
    }

    @Override // defpackage.evcd
    public final emxc a() {
        return this.a;
    }

    @Override // defpackage.evcd
    public final enip b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof evcd) {
            evcd evcdVar = (evcd) obj;
            if (this.a.equals(evcdVar.a()) && this.b.equals(evcdVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        enip enipVar = this.b;
        return "Options{customScopes=" + String.valueOf(this.a) + ", fallbackOptions=" + String.valueOf(enipVar) + "}";
    }
}
