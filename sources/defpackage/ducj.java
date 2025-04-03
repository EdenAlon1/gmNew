package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ducj extends ducn {
    public final ezhv a;
    public final ezhz b;

    public ducj(ezhv ezhvVar, ezhz ezhzVar) {
        if (ezhvVar == null) {
            throw new NullPointerException("Null batchSyncRequest");
        }
        this.a = ezhvVar;
        if (ezhzVar == null) {
            throw new NullPointerException("Null batchSyncResponse");
        }
        this.b = ezhzVar;
    }

    @Override // defpackage.ducn
    public final ezhv a() {
        return this.a;
    }

    @Override // defpackage.ducn
    public final ezhz b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ducn) {
            ducn ducnVar = (ducn) obj;
            if (this.a.equals(ducnVar.a()) && this.b.equals(ducnVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ezhz ezhzVar = this.b;
        return "BatchSyncResult{batchSyncRequest=" + this.a.toString() + ", batchSyncResponse=" + ezhzVar.toString() + "}";
    }
}
