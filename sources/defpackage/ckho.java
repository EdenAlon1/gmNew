package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckho extends ckjr {
    public final Optional a;
    public final boolean b;

    public ckho(Optional optional, boolean z) {
        this.a = optional;
        this.b = z;
    }

    @Override // defpackage.ckjr
    public final Optional a() {
        return this.a;
    }

    @Override // defpackage.ckjr
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ckjr) {
            ckjr ckjrVar = (ckjr) obj;
            if (this.a.equals(ckjrVar.a()) && this.b == ckjrVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "ConversationIdAndThreadIdAndConversationCreationMetadata{conversationIdAndThreadId=" + String.valueOf(this.a) + ", conversationExistsByThreadId=" + this.b + "}";
    }
}
