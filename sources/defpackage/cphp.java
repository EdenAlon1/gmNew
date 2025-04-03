package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cphp extends cphr {
    public final Optional a;
    private final eowh b;

    public cphp(Optional optional, eowh eowhVar) {
        this.a = optional;
        this.b = eowhVar;
    }

    @Override // defpackage.cphr
    public final eowh a() {
        return this.b;
    }

    @Override // defpackage.cphr
    public final Optional b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cphr) {
            cphr cphrVar = (cphr) obj;
            if (this.a.equals(cphrVar.b()) && this.b.equals(cphrVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        eowh eowhVar = this.b;
        return "RcsCapabilitiesWithMetadataAndLookupType{rcsCapabilitiesWithMetadata=" + this.a.toString() + ", capabilityLookup=" + eowhVar.toString() + "}";
    }
}
