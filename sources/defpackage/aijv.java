package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aijv implements aihs {
    public final ConversationIdType a;
    public final MessageIdType b;
    public final String c;
    public final boolean d;
    private final boolean e;
    private final int f;

    public aijv(ConversationIdType conversationIdType, MessageIdType messageIdType, String str, boolean z) {
        conversationIdType.getClass();
        this.a = conversationIdType;
        this.b = messageIdType;
        this.c = str;
        this.d = z;
        this.e = false;
        this.f = 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aijv)) {
            return false;
        }
        aijv aijvVar = (aijv) obj;
        if (!ffkj.e(this.a, aijvVar.a) || !ffkj.e(this.b, aijvVar.b) || !ffkj.e(this.c, aijvVar.c) || this.d != aijvVar.d) {
            return false;
        }
        boolean z = aijvVar.e;
        int i = aijvVar.f;
        return true;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        return (((((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + aiju.a(this.d)) * 31) + aiju.a(false)) * 31) + 2;
    }

    public final String toString() {
        return "ConversationMessageSearch(conversationId=" + this.a + ", messageId=" + this.b + ", query=" + this.c + ", isBubbleActivity=" + this.d + ", hasRbmBotRecipient=false, source=2)";
    }
}
