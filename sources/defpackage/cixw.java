package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cixw extends cixz {
    private final ConversationIdType a;
    private final long b;
    private final bcrs c;
    private final engw d;
    private final cjay e;
    private final int f;

    public cixw(ConversationIdType conversationIdType, long j, bcrs bcrsVar, engw engwVar, cjay cjayVar, int i) {
        this.a = conversationIdType;
        this.b = j;
        this.c = bcrsVar;
        if (engwVar == null) {
            throw new NullPointerException("Null messagesDataAsc");
        }
        this.d = engwVar;
        this.e = cjayVar;
        this.f = i;
    }

    @Override // defpackage.cixz
    public final int a() {
        return this.f;
    }

    @Override // defpackage.cixz
    public final long b() {
        return this.b;
    }

    @Override // defpackage.cixz
    public final bcrs c() {
        return this.c;
    }

    @Override // defpackage.cixz
    public final ConversationIdType d() {
        return this.a;
    }

    @Override // defpackage.cixz
    public final cjay e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cixz) {
            cixz cixzVar = (cixz) obj;
            if (this.a.equals(cixzVar.d()) && this.b == cixzVar.b() && this.c.equals(cixzVar.c()) && enkr.h(this.d, cixzVar.f()) && this.e.equals(cixzVar.e()) && this.f == cixzVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cixz
    public final engw f() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (((((((((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f;
    }

    public final String toString() {
        cjay cjayVar = this.e;
        engw engwVar = this.d;
        bcrs bcrsVar = this.c;
        return "ConversationAndMessagesData{conversationId=" + this.a.toString() + ", earliestTimestamp=" + this.b + ", conversationData=" + bcrsVar.toString() + ", messagesDataAsc=" + engwVar.toString() + ", latestIncomingMessageLineInfo=" + cjayVar.toString() + ", totalMessagesCount=" + this.f + "}";
    }
}
