package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdvj {
    public final engw a;
    public final engw b;

    public bdvj(engw engwVar, engw engwVar2) {
        this.a = engwVar;
        this.b = engwVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdvj)) {
            return false;
        }
        bdvj bdvjVar = (bdvj) obj;
        return ffkj.e(this.a, bdvjVar.a) && ffkj.e(this.b, bdvjVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ConversationParticipantsByProximity(localConversationParticipants=" + this.a + ", nonLocalConversationParticipants=" + this.b + ")";
    }
}
