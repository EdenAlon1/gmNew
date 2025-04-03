package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aijp {
    public final ConversationId a;
    public final boolean b;
    public final boolean c;
    public final ComposeRowState d;
    public final MessageCoreData e;
    public final IncomingDraft f;
    public final boolean g;
    public final boolean h;
    public final int i;
    private final MessageId j = null;
    private final bcyl k;
    private final String l;

    public /* synthetic */ aijp(ConversationId conversationId, boolean z, boolean z2, int i, ComposeRowState composeRowState, MessageCoreData messageCoreData, IncomingDraft incomingDraft, boolean z3, boolean z4, int i2) {
        this.a = conversationId;
        this.b = z & ((i2 & 4) == 0);
        this.c = z2;
        this.i = i;
        this.d = (i2 & 32) != 0 ? null : composeRowState;
        this.e = (i2 & 64) != 0 ? null : messageCoreData;
        this.f = (i2 & 128) != 0 ? null : incomingDraft;
        this.k = null;
        this.l = null;
        this.g = ((i2 & 1024) == 0) & z3;
        this.h = ((i2 & 2048) == 0) & z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aijp)) {
            return false;
        }
        aijp aijpVar = (aijp) obj;
        if (!ffkj.e(this.a, aijpVar.a)) {
            return false;
        }
        MessageId messageId = aijpVar.j;
        if (!ffkj.e(null, null) || this.b != aijpVar.b || this.c != aijpVar.c || this.i != aijpVar.i || !ffkj.e(this.d, aijpVar.d) || !ffkj.e(this.e, aijpVar.e) || !ffkj.e(this.f, aijpVar.f)) {
            return false;
        }
        bcyl bcylVar = aijpVar.k;
        if (!ffkj.e(null, null)) {
            return false;
        }
        String str = aijpVar.l;
        return ffkj.e(null, null) && this.g == aijpVar.g && this.h == aijpVar.h;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 961;
        ComposeRowState composeRowState = this.d;
        int hashCode2 = composeRowState == null ? 0 : composeRowState.hashCode();
        boolean z = this.b;
        boolean z2 = this.c;
        int a = hashCode + aijo.a(z);
        int i = this.i;
        MessageCoreData messageCoreData = this.e;
        int hashCode3 = messageCoreData == null ? 0 : messageCoreData.hashCode();
        int a2 = (((((a * 31) + aijo.a(z2)) * 31) + i) * 31) + hashCode2;
        IncomingDraft incomingDraft = this.f;
        return (((((((a2 * 31) + hashCode3) * 31) + (incomingDraft != null ? incomingDraft.hashCode() : 0)) * 29791) + aijo.a(this.g)) * 31) + aijo.a(this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConversationArguments(conversationId=");
        sb.append(this.a);
        sb.append(", messageId=null, withAddPeople=");
        sb.append(this.b);
        sb.append(", deleteConversationIfEmpty=");
        sb.append(this.c);
        sb.append(", eventSource=");
        int i = this.i;
        sb.append((Object) (i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? "SUGGESTED_ACTION" : "MINICDP" : "PENPAL_GAIA" : "CONVERSATION_LIST" : "MULTI_SHARE" : "START_CHAT"));
        sb.append(", composeRowState=");
        sb.append(this.d);
        sb.append(", deprecatedDraft=");
        sb.append(this.e);
        sb.append(", deprecatedIncomingDraft=");
        sb.append(this.f);
        sb.append(", renderData=null, searchQuery=null, hasRbmRecipient=");
        sb.append(this.g);
        sb.append(", finishCurrentActivity=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
