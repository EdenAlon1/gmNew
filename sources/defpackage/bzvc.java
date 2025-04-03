package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzvc extends cabf {
    private final boolean a;
    private final Optional b;

    public bzvc(boolean z, Optional optional) {
        this.a = z;
        this.b = optional;
    }

    @Override // defpackage.cabf
    public final Optional a() {
        return this.b;
    }

    @Override // defpackage.cabf
    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cabf) {
            cabf cabfVar = (cabf) obj;
            if (this.a == cabfVar.b() && this.b.equals(cabfVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "FailToDecryptResult{successful=" + this.a + ", newIdentityKey=" + this.b.toString() + "}";
    }
}
