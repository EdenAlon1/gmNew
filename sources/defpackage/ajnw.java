package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajnw extends ajob {
    public final int a;
    public final boolean b;
    public final int c;

    public ajnw(int i, int i2, boolean z) {
        this.a = i;
        this.c = i2;
        this.b = z;
    }

    @Override // defpackage.ajob
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ajob
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.ajob
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajob) {
            ajob ajobVar = (ajob) obj;
            if (this.a == ajobVar.a() && this.c == ajobVar.c() && this.b == ajobVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.b ? 1237 : 1231) ^ ((((this.a ^ 1000003) * 1000003) ^ this.c) * 1000003);
    }

    public final String toString() {
        return "SingleRegistrationCapabilityInfo{subId=" + this.a + ", capabilityStatus=" + Integer.toString(this.c - 1) + ", singleRegistrationCapable=" + this.b + "}";
    }
}
