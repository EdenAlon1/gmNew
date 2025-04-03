package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckhp extends ckjs {
    public final crme a;
    public final bdfy b;

    public ckhp(crme crmeVar, bdfy bdfyVar) {
        this.a = crmeVar;
        this.b = bdfyVar;
    }

    @Override // defpackage.ckjs
    public final bdfy a() {
        return this.b;
    }

    @Override // defpackage.ckjs
    public final crme b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ckjs) {
            ckjs ckjsVar = (ckjs) obj;
            if (this.a.equals(ckjsVar.b()) && this.b.equals(ckjsVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        bdfy bdfyVar = this.b;
        return "GetOrCreateConversationIdAndThreadIdForOneToOneResult{conversationIdAndThreadId=" + this.a.toString() + ", createConversationResult=" + bdfyVar.toString() + "}";
    }
}
