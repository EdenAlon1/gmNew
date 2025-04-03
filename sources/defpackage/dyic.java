package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyic extends dyii {
    private final String a;
    private final engw b;

    public dyic(String str, engw engwVar) {
        this.a = str;
        this.b = engwVar;
    }

    @Override // defpackage.dyii
    public final engw a() {
        return this.b;
    }

    @Override // defpackage.dyii
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyii) {
            dyii dyiiVar = (dyii) obj;
            if (this.a.equals(dyiiVar.b()) && enkr.h(this.b, dyiiVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "GetBlockedConversationsResult{nextPageToken=" + this.a + ", conversationIds=" + this.b.toString() + "}";
    }
}
