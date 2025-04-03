package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxsv extends dxsx {
    private final eriu a;
    private final erie b;

    public dxsv(eriu eriuVar, erie erieVar) {
        if (eriuVar == null) {
            throw new NullPointerException("Null fileGroupStatus");
        }
        this.a = eriuVar;
        if (erieVar == null) {
            throw new NullPointerException("Null fileGroupDetails");
        }
        this.b = erieVar;
    }

    @Override // defpackage.dxsx
    public final erie a() {
        return this.b;
    }

    @Override // defpackage.dxsx
    public final eriu b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dxsx) {
            dxsx dxsxVar = (dxsx) obj;
            if (this.a.equals(dxsxVar.b()) && this.b.equals(dxsxVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        erie erieVar = this.b;
        return "FileGroupStatusWithDetails{fileGroupStatus=" + this.a.toString() + ", fileGroupDetails=" + erieVar.toString() + "}";
    }
}
