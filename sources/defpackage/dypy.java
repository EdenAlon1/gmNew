package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dypy extends dyql {
    private final emxc a;
    private final int b;

    public dypy(int i, emxc emxcVar) {
        this.b = i;
        this.a = emxcVar;
    }

    @Override // defpackage.dyql
    public final emxc a() {
        return this.a;
    }

    @Override // defpackage.dyql
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyql) {
            dyql dyqlVar = (dyql) obj;
            if (this.b == dyqlVar.b() && this.a.equals(dyqlVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "GetProfileResult{status=" + (this.b != 1 ? "SUCCESS" : "UNSUPPORTED") + ", profileInfo=" + String.valueOf(this.a) + "}";
    }
}
