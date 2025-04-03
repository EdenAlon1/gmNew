package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddpo extends ddpv {
    public final engw a;
    public final engw b;
    public final enip c;

    public ddpo(engw engwVar, engw engwVar2, enip enipVar) {
        this.a = engwVar;
        this.b = engwVar2;
        this.c = enipVar;
    }

    @Override // defpackage.ddpv
    public final engw a() {
        return this.b;
    }

    @Override // defpackage.ddpv
    public final engw b() {
        return this.a;
    }

    @Override // defpackage.ddpv
    public final enip c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ddpv) {
            ddpv ddpvVar = (ddpv) obj;
            if (enkr.h(this.a, ddpvVar.b()) && enkr.h(this.b, ddpvVar.a()) && this.c.equals(ddpvVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        enip enipVar = this.c;
        engw engwVar = this.b;
        return "ConversationSearchViewData{starredTextResultItemData=" + this.a.toString() + ", conversationListViewData=" + engwVar.toString() + ", conversationsWithNoMatchingParts=" + enipVar.toString() + "}";
    }
}
