package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tyn extends tyq {
    private final int a;
    private final int b;

    public tyn(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.tyq
    public final int a() {
        return this.a;
    }

    @Override // defpackage.tyq
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tyq) {
            tyq tyqVar = (tyq) obj;
            if (this.a == tyqVar.a() && this.b == tyqVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "ConversationMessagesUpdated{messageCount=" + this.a + ", unreadCount=" + this.b + "}";
    }
}
