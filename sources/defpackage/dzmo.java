package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzmo extends dzow {
    private final dzpt a;
    private final dzox b;
    private final engw c;

    public dzmo(dzpt dzptVar, dzox dzoxVar, engw engwVar) {
        this.a = dzptVar;
        this.b = dzoxVar;
        this.c = engwVar;
    }

    @Override // defpackage.dzow
    public final dzox a() {
        return this.b;
    }

    @Override // defpackage.dzow
    public final dzpt b() {
        return this.a;
    }

    @Override // defpackage.dzow
    public final engw c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzow) {
            dzow dzowVar = (dzow) obj;
            if (this.a.equals(dzowVar.b()) && this.b.equals(dzowVar.a()) && enkr.h(this.c, dzowVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        engw engwVar = this.c;
        dzox dzoxVar = this.b;
        return "CloudConversation{conversationId=" + this.a.toString() + ", cloudConversationMetadata=" + dzoxVar.toString() + ", annotations=" + engwVar.toString() + "}";
    }
}
