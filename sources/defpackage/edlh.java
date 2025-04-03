package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class edlh extends edpc {
    public final int a;
    public final int b;

    public edlh(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.edpc
    public final int a() {
        return this.a;
    }

    @Override // defpackage.edpc
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edpc) {
            edpc edpcVar = (edpc) obj;
            if (this.a == edpcVar.a() && this.b == edpcVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "LocalTime{hours=" + this.a + ", minutes=" + this.b + "}";
    }
}
