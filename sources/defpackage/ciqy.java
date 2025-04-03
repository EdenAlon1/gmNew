package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ciqy extends ciqz {
    public final ConversationIdType a;
    public final boolean b;
    public final boolean c;
    public final MessageIdType d;
    public final boolean e;
    public final bduq f;

    public ciqy(ConversationIdType conversationIdType, boolean z, boolean z2, MessageIdType messageIdType, boolean z3, bduq bduqVar) {
        this.a = conversationIdType;
        this.b = z;
        this.c = z2;
        this.d = messageIdType;
        this.e = z3;
        this.f = bduqVar;
    }

    @Override // defpackage.ciqz
    public final ConversationIdType a() {
        return this.a;
    }

    @Override // defpackage.ciqz
    public final MessageIdType b() {
        return this.d;
    }

    @Override // defpackage.ciqz
    public final bduq c() {
        return this.f;
    }

    @Override // defpackage.ciqz
    public final boolean d() {
        return this.c;
    }

    @Override // defpackage.ciqz
    public final boolean e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ciqz) {
            ciqz ciqzVar = (ciqz) obj;
            if (this.a.equals(ciqzVar.a()) && this.b == ciqzVar.e() && this.c == ciqzVar.d() && this.d.equals(ciqzVar.b()) && this.e == ciqzVar.f() && this.f.equals(ciqzVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ciqz
    public final boolean f() {
        return this.e;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true == this.e ? 1231 : 1237)) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        bduq bduqVar = this.f;
        MessageIdType messageIdType = this.d;
        return "NotificationSuggestionsConversationInfo{conversationId=" + this.a.toString() + ", hasRbmBotRecipient=" + this.b + ", allowReply=" + this.c + ", latestMessageId=" + messageIdType.toString() + ", latestMessageIsOutgoing=" + this.e + ", latestMessageAnnotationData=" + bduqVar.toString() + "}";
    }
}
