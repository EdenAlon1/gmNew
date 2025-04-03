package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acwl extends acwn {
    public final int a;
    public final String b;
    public final aclr c;
    public final String d;
    public final eyee e;

    public acwl(int i, String str, aclr aclrVar, String str2, eyee eyeeVar) {
        this.a = i;
        this.b = str;
        this.c = aclrVar;
        this.d = str2;
        this.e = eyeeVar;
    }

    @Override // defpackage.acwn
    public final int a() {
        return this.a;
    }

    @Override // defpackage.acwn
    public final aclr b() {
        return this.c;
    }

    @Override // defpackage.acwn
    public final eyee c() {
        return this.e;
    }

    @Override // defpackage.acwn
    public final String d() {
        return this.d;
    }

    @Override // defpackage.acwn
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acwn) {
            acwn acwnVar = (acwn) obj;
            if (this.a == acwnVar.a() && this.b.equals(acwnVar.e()) && this.c.equals(acwnVar.b()) && this.d.equals(acwnVar.d()) && this.e.equals(acwnVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        eyee eyeeVar = this.e;
        return "FailureNotificationParams{retryCount=" + this.a + ", replyText=" + this.b + ", dittoConversationId=" + this.c.toString() + ", conversationName=" + this.d + ", conversationReplyPayload=" + eyeeVar.toString() + "}";
    }
}
