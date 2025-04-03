package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awnu extends awrj {
    public final awxk a;
    public final int b;

    public awnu(awxk awxkVar, int i) {
        this.a = awxkVar;
        this.b = i;
    }

    @Override // defpackage.awrj
    protected final int a() {
        return this.b;
    }

    @Override // defpackage.awrj
    public final awxk b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof awrj) {
            awrj awrjVar = (awrj) obj;
            if (this.a.equals(awrjVar.b()) && this.b == awrjVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "SinglePartIncomingChatMessageRequest{incomingChatMessageRequest=" + this.a.toString() + ", contentPartIndex=" + this.b + "}";
    }
}
