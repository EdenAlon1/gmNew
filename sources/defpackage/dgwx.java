package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgwx extends dgxc {
    private final String a;
    private final emxc b;

    public dgwx(String str, emxc emxcVar) {
        if (str == null) {
            throw new NullPointerException("Null appPackage");
        }
        this.a = str;
        this.b = emxcVar;
    }

    @Override // defpackage.dgxc
    public final emxc a() {
        return this.b;
    }

    @Override // defpackage.dgxc
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dgxc) {
            dgxc dgxcVar = (dgxc) obj;
            if (this.a.equals(dgxcVar.b()) && this.b.equals(dgxcVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "CallerInfo{appPackage=" + this.a + ", appVersionCode=" + this.b.toString() + "}";
    }
}
