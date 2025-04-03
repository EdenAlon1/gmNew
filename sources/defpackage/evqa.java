package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evqa extends evqk {
    public final evpx a;
    public final boolean b;

    public evqa(evpx evpxVar, boolean z) {
        this.a = evpxVar;
        this.b = z;
    }

    @Override // defpackage.evqk
    public final evpx a() {
        return this.a;
    }

    @Override // defpackage.evqk
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof evqk) {
            evqk evqkVar = (evqk) obj;
            evpx evpxVar = this.a;
            if (evpxVar != null ? evpxVar.equals(evqkVar.a()) : evqkVar.a() == null) {
                if (this.b == evqkVar.b()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        evpx evpxVar = this.a;
        return (((evpxVar == null ? 0 : evpxVar.hashCode()) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "ParsingOptions{defaultRegion=" + String.valueOf(this.a) + ", keepRawInput=" + this.b + "}";
    }
}
