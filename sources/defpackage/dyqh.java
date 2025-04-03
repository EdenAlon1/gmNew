package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyqh extends dyqu {
    private final int a;
    private final emxc b;
    private final emxc c;

    public dyqh(int i, emxc emxcVar, emxc emxcVar2) {
        this.a = i;
        this.b = emxcVar;
        this.c = emxcVar2;
    }

    @Override // defpackage.dyqu
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dyqu
    public final emxc b() {
        return this.c;
    }

    @Override // defpackage.dyqu
    public final emxc c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyqu) {
            dyqu dyquVar = (dyqu) obj;
            if (this.a == dyquVar.a() && this.b.equals(dyquVar.c()) && this.c.equals(dyquVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        emxc emxcVar = this.c;
        return "RegistrationResult{status=" + this.a + ", unsavedAccountContext=" + String.valueOf(this.b) + ", authToken=" + String.valueOf(emxcVar) + "}";
    }
}
