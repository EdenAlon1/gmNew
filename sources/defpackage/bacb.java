package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class bacb extends basw {
    private final bseh a;
    private final boolean b;

    public bacb(bseh bsehVar, boolean z) {
        if (bsehVar == null) {
            throw new NullPointerException("Null conversation");
        }
        this.a = bsehVar;
        this.b = z;
    }

    @Override // defpackage.basw
    public final bseh a() {
        return this.a;
    }

    @Override // defpackage.basw
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof basw) {
            basw baswVar = (basw) obj;
            if (this.a.equals(baswVar.a()) && this.b == baswVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "ConversationMatchResult{conversation=" + this.a.toString() + ", isNewConversation=" + this.b + "}";
    }
}
