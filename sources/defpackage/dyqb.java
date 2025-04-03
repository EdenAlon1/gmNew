package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyqb extends dyqo {
    private final String a;
    private final engw b;

    public dyqb(String str, engw engwVar) {
        this.a = str;
        this.b = engwVar;
    }

    @Override // defpackage.dyqo
    public final engw a() {
        return this.b;
    }

    @Override // defpackage.dyqo
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyqo) {
            dyqo dyqoVar = (dyqo) obj;
            if (this.a.equals(dyqoVar.b()) && enkr.h(this.b, dyqoVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "ListConversationsResult{nextPageToken=" + this.a + ", conversations=" + this.b.toString() + "}";
    }
}
