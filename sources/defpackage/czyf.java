package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czyf extends czyj {
    private final engw a;
    private final eoko b;

    public czyf(engw engwVar, eoko eokoVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null conversationIds");
        }
        this.a = engwVar;
        if (eokoVar == null) {
            throw new NullPointerException("Null origin");
        }
        this.b = eokoVar;
    }

    @Override // defpackage.czyj
    public final engw a() {
        return this.a;
    }

    @Override // defpackage.czyj
    public final eoko b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof czyj) {
            czyj czyjVar = (czyj) obj;
            if (enkr.h(this.a, czyjVar.a()) && this.b.equals(czyjVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        eoko eokoVar = this.b;
        return "ConversationArchiveEvent{conversationIds=" + this.a.toString() + ", origin=" + eokoVar.toString() + "}";
    }
}
