package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmqi extends cmqj {
    public final eprt a;
    private final boolean b;

    public cmqi(eprt eprtVar, boolean z) {
        if (eprtVar == null) {
            throw new NullPointerException("Null reactionSurfaceType");
        }
        this.a = eprtVar;
        this.b = z;
    }

    @Override // defpackage.cmqj
    public final eprt a() {
        return this.a;
    }

    @Override // defpackage.cmqj
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cmqj) {
            cmqj cmqjVar = (cmqj) obj;
            if (this.a.equals(cmqjVar.a()) && this.b == cmqjVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "ReactionSendLoggingInfo{reactionSurfaceType=" + this.a.toString() + ", conversationEncrypted=" + this.b + "}";
    }
}
