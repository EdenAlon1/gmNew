package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnex extends cngz {
    public final int a;
    public final int b;

    public cnex(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.cngz
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cngz
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cngz) {
            cngz cngzVar = (cngz) obj;
            if (this.a == cngzVar.a() && this.b == cngzVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return a.d(Integer.toString(this.b - 1), Integer.toString(this.a - 1), "ActionDescription{action=", ", reason=", "}");
    }
}
