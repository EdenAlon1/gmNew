package defpackage;

import com.google.android.apps.messaging.conversation2.api.OpenConversation2Arguments;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wpw {
    public final ConversationId a;
    public final MessageId b;
    public final String c;
    public final ComposeRowState d;
    public final IncomingDraft e;
    public final MessageCoreData f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final OpenConversation2Arguments k;

    public wpw(ConversationId conversationId, MessageId messageId, String str, ComposeRowState composeRowState, IncomingDraft incomingDraft, MessageCoreData messageCoreData, boolean z, boolean z2, boolean z3, long j) {
        this.a = conversationId;
        this.b = messageId;
        this.c = str;
        this.d = composeRowState;
        this.e = incomingDraft;
        this.f = messageCoreData;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = j;
        this.k = new OpenConversation2Arguments(conversationId, messageId, str, Boolean.valueOf(z), z2, z3, null, 64, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wpw)) {
            return false;
        }
        wpw wpwVar = (wpw) obj;
        return ffkj.e(this.a, wpwVar.a) && ffkj.e(this.b, wpwVar.b) && ffkj.e(this.c, wpwVar.c) && ffkj.e(this.d, wpwVar.d) && ffkj.e(this.e, wpwVar.e) && ffkj.e(this.f, wpwVar.f) && this.g == wpwVar.g && this.h == wpwVar.h && this.i == wpwVar.i && this.j == wpwVar.j;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        MessageId messageId = this.b;
        int hashCode2 = (hashCode + (messageId == null ? 0 : messageId.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        ComposeRowState composeRowState = this.d;
        int hashCode4 = (hashCode3 + (composeRowState == null ? 0 : composeRowState.hashCode())) * 31;
        IncomingDraft incomingDraft = this.e;
        int hashCode5 = (hashCode4 + (incomingDraft == null ? 0 : incomingDraft.hashCode())) * 31;
        MessageCoreData messageCoreData = this.f;
        int hashCode6 = (((((((hashCode5 + (messageCoreData != null ? messageCoreData.hashCode() : 0)) * 31) + wpv.a(this.g)) * 31) + wpv.a(this.h)) * 31) + wpv.a(this.i)) * 31;
        long j = this.j;
        return hashCode6 + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String str = this.c;
        CharSequence c = str != null ? cskw.c(str) : null;
        MessageId messageId = this.b;
        return "Arguments(conversationId=" + this.a + ", messageId=" + messageId + ", searchQuery=" + ((Object) c) + ", composeRowState=" + this.d + ", deprecatedIncomingDraft=" + this.e + ", deprecatedLegacyIncomingDraft=" + this.f + ", canNavigateBack=" + this.g + ", renderAddPeople=" + this.h + ", isBubbleActivity=" + this.i + ", intentTimestamp=" + this.j + ")";
    }
}
