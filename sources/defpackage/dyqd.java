package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyqd extends dyqq {
    public final emxc a;
    public final emxc b;

    public dyqd(emxc emxcVar, emxc emxcVar2) {
        this.a = emxcVar;
        this.b = emxcVar2;
    }

    @Override // defpackage.dyqq
    public final emxc a() {
        return this.b;
    }

    @Override // defpackage.dyqq
    public final emxc b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyqq) {
            dyqq dyqqVar = (dyqq) obj;
            if (this.a.equals(dyqqVar.b()) && this.b.equals(dyqqVar.a())) {
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
        return "ReceiveMessagesResult{tachyonMessage=" + String.valueOf(this.a) + ", ackId=" + String.valueOf(emxcVar) + "}";
    }
}
