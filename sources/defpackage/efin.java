package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efin extends efio {
    public final eyhs a;
    private final eyfc b;

    public efin(eyhs eyhsVar, eyfc eyfcVar) {
        this.a = eyhsVar;
        if (eyfcVar == null) {
            throw new NullPointerException("Null extensionRegistryLite");
        }
        this.b = eyfcVar;
    }

    @Override // defpackage.efio
    public final eyfc b() {
        return this.b;
    }

    @Override // defpackage.efio
    public final eyhs c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof efio) {
            efio efioVar = (efio) obj;
            if (this.a.equals(efioVar.c()) && this.b.equals(efioVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        eyfc eyfcVar = this.b;
        return "ProtoSerializer{defaultValue=" + this.a.toString() + ", extensionRegistryLite=" + eyfcVar.toString() + "}";
    }
}
