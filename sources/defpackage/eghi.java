package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eghi extends eghk {
    private final long a;
    private final emxc b;

    public eghi(long j, emxc emxcVar) {
        this.a = j;
        this.b = emxcVar;
    }

    @Override // defpackage.eghk
    public final long a() {
        return this.a;
    }

    @Override // defpackage.eghk
    public final emxc b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eghk) {
            eghk eghkVar = (eghk) obj;
            if (this.a == eghkVar.a() && this.b.equals(eghkVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "DevicePhoto{id=" + this.a + ", timestamp=" + this.b.toString() + "}";
    }
}
