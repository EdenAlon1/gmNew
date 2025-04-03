package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zlh {
    public final aaud a;
    public final aaxe b;
    public final cbnd c;
    public final ablm d;
    public final zkm e;
    public final int f;
    public final MessageId g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final Instant k;

    public zlh(aaud aaudVar, aaxe aaxeVar, cbnd cbndVar, ablm ablmVar, zkm zkmVar, int i, MessageId messageId, boolean z, boolean z2, boolean z3, Instant instant) {
        this.a = aaudVar;
        this.b = aaxeVar;
        this.c = cbndVar;
        this.d = ablmVar;
        this.e = zkmVar;
        this.f = i;
        this.g = messageId;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zlh)) {
            return false;
        }
        zlh zlhVar = (zlh) obj;
        return ffkj.e(this.a, zlhVar.a) && ffkj.e(this.b, zlhVar.b) && ffkj.e(this.c, zlhVar.c) && ffkj.e(this.d, zlhVar.d) && ffkj.e(this.e, zlhVar.e) && this.f == zlhVar.f && ffkj.e(this.g, zlhVar.g) && this.h == zlhVar.h && this.i == zlhVar.i && this.j == zlhVar.j && ffkj.e(this.k, zlhVar.k);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        cbnd cbndVar = this.c;
        int hashCode2 = ((hashCode * 31) + (cbndVar == null ? 0 : cbndVar.hashCode())) * 31;
        ablm ablmVar = this.d;
        int hashCode3 = (((((hashCode2 + (ablmVar == null ? 0 : ablmVar.hashCode())) * 31) + this.e.hashCode()) * 31) + this.f) * 31;
        MessageId messageId = this.g;
        int hashCode4 = (((((((hashCode3 + (messageId == null ? 0 : messageId.hashCode())) * 31) + zlg.a(this.h)) * 31) + zlg.a(this.i)) * 31) + zlg.a(this.j)) * 31;
        Instant instant = this.k;
        return hashCode4 + (instant != null ? instant.hashCode() : 0);
    }

    public final String toString() {
        return "MessagesFlowRequirements(messageListPagingData=" + this.a + ", selectionData=" + this.b + ", currentHit=" + this.c + ", searchResults=" + this.d + ", conversationProperties=" + this.e + ", selfIdentitiesCount=" + this.f + ", messageIdWithLastReadMarker=" + this.g + ", lastReadMarkerVisibility=" + this.h + ", isCurrentlyPinching=" + this.i + ", isPenpalConversation=" + this.j + ", latestReadMessageTimestamp=" + this.k + ")";
    }
}
