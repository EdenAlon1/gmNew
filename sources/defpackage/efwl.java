package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efwl extends efwk {
    public final emxc a;
    public final emxc b;

    public efwl(emxc emxcVar, emxc emxcVar2) {
        this.a = emxcVar;
        this.b = emxcVar2;
    }

    @Override // defpackage.efwk
    public final emxc a() {
        return this.b;
    }

    @Override // defpackage.efwk
    public final emxc b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof efwk) {
            efwk efwkVar = (efwk) obj;
            if (this.a.equals(efwkVar.b()) && this.b.equals(efwkVar.a())) {
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
        return "ArtEditActivityParams{imageIdOrUri=" + this.a.toString() + ", imageDisplayName=" + emxcVar.toString() + "}";
    }
}
