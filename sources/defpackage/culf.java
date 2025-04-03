package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class culf {
    public final MessageIdType a;
    public final ConversationIdType b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final long h;
    public final cuvb i;
    public final cuva j;
    public final cuvc k;

    public culf(MessageIdType messageIdType, cuvb cuvbVar, ConversationIdType conversationIdType, cuva cuvaVar, int i, boolean z, boolean z2, String str, cuvc cuvcVar, boolean z3, long j) {
        this.a = messageIdType;
        this.i = cuvbVar;
        this.b = conversationIdType;
        this.j = cuvaVar;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = str;
        this.k = cuvcVar;
        this.g = z3;
        this.h = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof culf)) {
            return false;
        }
        culf culfVar = (culf) obj;
        return ffkj.e(this.a, culfVar.a) && ffkj.e(this.i, culfVar.i) && ffkj.e(this.b, culfVar.b) && ffkj.e(this.j, culfVar.j) && this.c == culfVar.c && this.d == culfVar.d && this.e == culfVar.e && ffkj.e(this.f, culfVar.f) && ffkj.e(this.k, culfVar.k) && this.g == culfVar.g && this.h == culfVar.h;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() * 31) + this.i.hashCode()) * 31) + this.b.hashCode()) * 31) + this.j.hashCode();
        String str = this.f;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int a = ((((((((hashCode * 31) + this.c) * 31) + culd.a(this.d)) * 31) + culd.a(this.e)) * 31) + hashCode2) * 31;
        cuvc cuvcVar = this.k;
        int hashCode3 = (((a + (cuvcVar != null ? cuvcVar.hashCode() : 0)) * 31) + culd.a(this.g)) * 31;
        long j = this.h;
        return hashCode3 + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "MessageMetadataWrapper(messageId=" + this.a + ", messageIdWrapper=" + this.i + ", conversationId=" + this.b + ", conversationIdWrapper=" + this.j + ", protocol=" + this.c + ", isIncoming=" + this.d + ", isOutgoing=" + this.e + ", senderParticipantId=" + this.f + ", senderParticipantIdWrapper=" + this.k + ", isEncrypted=" + this.g + ", receivedTimestamp=" + this.h + ")";
    }
}
