package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckhm extends ckjg {
    private final emyl a;
    private final long b;

    public ckhm(emyl emylVar, long j) {
        if (emylVar == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.a = emylVar;
        this.b = j;
    }

    @Override // defpackage.ckjg
    public final long a() {
        return this.b;
    }

    @Override // defpackage.ckjg
    public final emyl b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ckjg) {
            ckjg ckjgVar = (ckjg) obj;
            if (this.a.equals(ckjgVar.b()) && this.b == ckjgVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "SupplierConversationIdAndThreadId{conversationId=" + this.a.toString() + ", threadId=" + this.b + "}";
    }
}
