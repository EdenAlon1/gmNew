package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzme extends dzjk {
    private final emxc a;
    private final emxc b;

    public dzme(emxc emxcVar, emxc emxcVar2) {
        this.a = emxcVar;
        this.b = emxcVar2;
    }

    @Override // defpackage.dzjk
    public final emxc a() {
        return this.a;
    }

    @Override // defpackage.dzjk
    public final emxc b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzjk) {
            dzjk dzjkVar = (dzjk) obj;
            if (this.a.equals(dzjkVar.a()) && this.b.equals(dzjkVar.b())) {
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
        return "OverlayActionPayload{reactionOverlayHeader=" + String.valueOf(this.a) + ", stackedReactionWebView=" + String.valueOf(emxcVar) + "}";
    }
}
