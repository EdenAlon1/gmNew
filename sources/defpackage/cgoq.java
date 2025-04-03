package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cgoq extends cgot {
    private final int a;
    private final engw b;
    private final boolean c;

    public cgoq(int i, engw engwVar, boolean z) {
        this.a = i;
        this.b = engwVar;
        this.c = z;
    }

    @Override // defpackage.cgot
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cgot
    public final engw b() {
        return this.b;
    }

    @Override // defpackage.cgot
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cgot) {
            cgot cgotVar = (cgot) obj;
            if (this.a == cgotVar.a() && enkr.h(this.b, cgotVar.b()) && this.c == cgotVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "ConversationDeletionResult{numberOfDeletedMessages=" + this.a + ", messageUrisDeleted=" + this.b.toString() + ", isConversationDeleted=" + this.c + "}";
    }
}
