package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyqf extends dyqs {
    private final emxc a;
    private final emxc b;
    private final emxc c;
    private final int d;

    public dyqf(int i, emxc emxcVar, emxc emxcVar2, emxc emxcVar3) {
        this.d = i;
        this.a = emxcVar;
        this.b = emxcVar2;
        this.c = emxcVar3;
    }

    @Override // defpackage.dyqs
    public final emxc a() {
        return this.a;
    }

    @Override // defpackage.dyqs
    public final emxc b() {
        return this.b;
    }

    @Override // defpackage.dyqs
    public final emxc c() {
        return this.c;
    }

    @Override // defpackage.dyqs
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyqs) {
            dyqs dyqsVar = (dyqs) obj;
            if (this.d == dyqsVar.d() && this.a.equals(dyqsVar.a()) && this.b.equals(dyqsVar.b()) && this.c.equals(dyqsVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.d ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        int i = this.d;
        String str = i != 1 ? i != 2 ? i != 3 ? "RETRY" : "FAILURE" : "SUCCESS" : "UNKNOWN";
        emxc emxcVar = this.a;
        emxc emxcVar2 = this.b;
        emxc emxcVar3 = this.c;
        return "RegisterRefreshResult{status=" + str + ", accountContext=" + String.valueOf(emxcVar) + ", authToken=" + String.valueOf(emxcVar2) + ", serverTimestamp=" + String.valueOf(emxcVar3) + "}";
    }
}
