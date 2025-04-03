package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awjq extends awmq {
    public final boolean a;
    public final boolean b;

    public awjq(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.awmq
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.awmq
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof awmq) {
            awmq awmqVar = (awmq) obj;
            if (this.a == awmqVar.a() && this.b == awmqVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "UpdateResult{isSuccessful=" + this.a + ", shouldRefreshConversation=" + this.b + "}";
    }
}
