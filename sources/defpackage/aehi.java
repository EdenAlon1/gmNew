package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aehi extends aeiv {
    private final ConversationIdType a;
    private final aemb b;
    private final long c;

    public aehi(ConversationIdType conversationIdType, aemb aembVar, long j) {
        if (conversationIdType == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.a = conversationIdType;
        if (aembVar == null) {
            throw new NullPointerException("Null partId");
        }
        this.b = aembVar;
        this.c = j;
    }

    @Override // defpackage.aeiv
    public final long a() {
        return this.c;
    }

    @Override // defpackage.aeiv
    public final aemb b() {
        return this.b;
    }

    @Override // defpackage.aeiv
    public final ConversationIdType c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aeiv) {
            aeiv aeivVar = (aeiv) obj;
            if (this.a.equals(aeivVar.c()) && this.b.equals(aeivVar.b()) && this.c == aeivVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        long j = this.c;
        return (hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        aemb aembVar = this.b;
        return "ConversationListRefreshPart{conversationId=" + this.a.toString() + ", partId=" + aembVar.toString() + ", refreshTimestamp=" + this.c + "}";
    }
}
