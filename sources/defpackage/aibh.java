package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aibh {
    public final engw a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public aibh() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aibh)) {
            return false;
        }
        aibh aibhVar = (aibh) obj;
        return ffkj.e(this.a, aibhVar.a) && this.b == aibhVar.b && this.c == aibhVar.c && this.d == aibhVar.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.d;
        return ((((hashCode + aibg.a(this.b)) * 31) + aibg.a(this.c)) * 31) + aibg.a(z);
    }

    public final String toString() {
        return "ConversationsResultState(conversations=" + this.a + ", loaded=" + this.b + ", isLoadMoreVisible=" + this.c + ", isLoadMoreText=" + this.d + ")";
    }

    public aibh(engw engwVar, boolean z, boolean z2, boolean z3) {
        engwVar.getClass();
        this.a = engwVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aibh(byte[] bArr) {
        this(enou.a, false, false, false);
        int i = engw.d;
    }
}
