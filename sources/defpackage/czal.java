package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czal {
    public final czbe a;
    public final fgdj b;

    public czal(czbe czbeVar, fgdj fgdjVar) {
        this.a = czbeVar;
        this.b = fgdjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czal)) {
            return false;
        }
        czal czalVar = (czal) obj;
        return ffkj.e(this.a, czalVar.a) && ffkj.e(this.b, czalVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ConversationDetailsScreenUiData(conversationDetailsUiData=" + this.a + ", popupUiData=" + this.b + ")";
    }
}
