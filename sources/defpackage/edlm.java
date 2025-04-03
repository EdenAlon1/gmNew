package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class edlm extends edpm {
    public final edpu a;
    public final edpu b;
    public final edpu c;
    public final edpu d;
    public final edpu e;
    public final edpu f;
    public final edpu g;

    public edlm(edpu edpuVar, edpu edpuVar2, edpu edpuVar3, edpu edpuVar4, edpu edpuVar5, edpu edpuVar6, edpu edpuVar7) {
        if (edpuVar == null) {
            throw new NullPointerException("Null freeParkingLot");
        }
        this.a = edpuVar;
        if (edpuVar2 == null) {
            throw new NullPointerException("Null paidParkingLot");
        }
        this.b = edpuVar2;
        if (edpuVar3 == null) {
            throw new NullPointerException("Null freeStreetParking");
        }
        this.c = edpuVar3;
        if (edpuVar4 == null) {
            throw new NullPointerException("Null paidStreetParking");
        }
        this.d = edpuVar4;
        if (edpuVar5 == null) {
            throw new NullPointerException("Null valetParking");
        }
        this.e = edpuVar5;
        if (edpuVar6 == null) {
            throw new NullPointerException("Null freeGarageParking");
        }
        this.f = edpuVar6;
        if (edpuVar7 == null) {
            throw new NullPointerException("Null paidGarageParking");
        }
        this.g = edpuVar7;
    }

    @Override // defpackage.edpm
    public final edpu a() {
        return this.f;
    }

    @Override // defpackage.edpm
    public final edpu b() {
        return this.a;
    }

    @Override // defpackage.edpm
    public final edpu c() {
        return this.c;
    }

    @Override // defpackage.edpm
    public final edpu d() {
        return this.g;
    }

    @Override // defpackage.edpm
    public final edpu e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edpm) {
            edpm edpmVar = (edpm) obj;
            if (this.a.equals(edpmVar.b()) && this.b.equals(edpmVar.e()) && this.c.equals(edpmVar.c()) && this.d.equals(edpmVar.f()) && this.e.equals(edpmVar.g()) && this.f.equals(edpmVar.a()) && this.g.equals(edpmVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.edpm
    public final edpu f() {
        return this.d;
    }

    @Override // defpackage.edpm
    public final edpu g() {
        return this.e;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        edpu edpuVar = this.g;
        edpu edpuVar2 = this.f;
        edpu edpuVar3 = this.e;
        edpu edpuVar4 = this.d;
        edpu edpuVar5 = this.c;
        edpu edpuVar6 = this.b;
        return "ParkingOptions{freeParkingLot=" + this.a.toString() + ", paidParkingLot=" + edpuVar6.toString() + ", freeStreetParking=" + edpuVar5.toString() + ", paidStreetParking=" + edpuVar4.toString() + ", valetParking=" + edpuVar3.toString() + ", freeGarageParking=" + edpuVar2.toString() + ", paidGarageParking=" + edpuVar.toString() + "}";
    }
}
