package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzmp extends dzox {
    public final engw a;

    public dzmp(engw engwVar) {
        this.a = engwVar;
    }

    @Override // defpackage.dzox
    public final engw a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzox) {
            return enkr.h(this.a, ((dzox) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "CloudConversationMetadata{cloudMessages=" + this.a.toString() + "}";
    }
}
