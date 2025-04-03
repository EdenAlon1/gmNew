package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzop extends dzsi {
    public final emxc a;
    public final emxc b;

    public dzop(emxc emxcVar, emxc emxcVar2) {
        this.a = emxcVar;
        this.b = emxcVar2;
    }

    @Override // defpackage.dzsi
    public final emxc a() {
        return this.a;
    }

    @Override // defpackage.dzsi
    public final emxc b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzsi) {
            dzsi dzsiVar = (dzsi) obj;
            if (this.a.equals(dzsiVar.a()) && this.b.equals(dzsiVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        emxc emxcVar = this.b;
        return "UserProperties{readReceiptOptIn=" + String.valueOf(this.a) + ", reviewPrivateReplyOptIn=" + String.valueOf(emxcVar) + "}";
    }
}
