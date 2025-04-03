package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class edkt extends edmh {
    public final edpu a;
    public final edpu b;
    public final edpu c;
    public final edpu d;

    public edkt(edpu edpuVar, edpu edpuVar2, edpu edpuVar3, edpu edpuVar4) {
        if (edpuVar == null) {
            throw new NullPointerException("Null wheelchairAccessibleParking");
        }
        this.a = edpuVar;
        if (edpuVar2 == null) {
            throw new NullPointerException("Null wheelchairAccessibleEntrance");
        }
        this.b = edpuVar2;
        if (edpuVar3 == null) {
            throw new NullPointerException("Null wheelchairAccessibleRestroom");
        }
        this.c = edpuVar3;
        if (edpuVar4 == null) {
            throw new NullPointerException("Null wheelchairAccessibleSeating");
        }
        this.d = edpuVar4;
    }

    @Override // defpackage.edmh
    public final edpu a() {
        return this.b;
    }

    @Override // defpackage.edmh
    public final edpu b() {
        return this.a;
    }

    @Override // defpackage.edmh
    public final edpu c() {
        return this.c;
    }

    @Override // defpackage.edmh
    public final edpu d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edmh) {
            edmh edmhVar = (edmh) obj;
            if (this.a.equals(edmhVar.b()) && this.b.equals(edmhVar.a()) && this.c.equals(edmhVar.c()) && this.d.equals(edmhVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        edpu edpuVar = this.d;
        edpu edpuVar2 = this.c;
        edpu edpuVar3 = this.b;
        return "AccessibilityOptions{wheelchairAccessibleParking=" + this.a.toString() + ", wheelchairAccessibleEntrance=" + edpuVar3.toString() + ", wheelchairAccessibleRestroom=" + edpuVar2.toString() + ", wheelchairAccessibleSeating=" + edpuVar.toString() + "}";
    }
}
