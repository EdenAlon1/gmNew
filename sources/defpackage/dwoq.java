package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwoq extends dwxi {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    public dwoq(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    @Override // defpackage.dwxi
    public final boolean a() {
        return this.c;
    }

    @Override // defpackage.dwxi
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.dwxi
    public final boolean c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwxi) {
            dwxi dwxiVar = (dwxi) obj;
            if (this.a == dwxiVar.c() && this.b == dwxiVar.b() && this.c == dwxiVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        return ((((i ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final String toString() {
        return "ConstraintOverrides{requiresDeviceIdle=" + this.a + ", requiresCharging=" + this.b + ", requiresBatteryNotLow=" + this.c + "}";
    }
}
