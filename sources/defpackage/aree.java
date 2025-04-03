package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aree {
    public final ConversationIdType a;
    public final MessageIdType b;
    public final String c;
    public final Uri d;
    public final boolean e;

    public aree(ConversationIdType conversationIdType, MessageIdType messageIdType, String str, Uri uri, boolean z) {
        conversationIdType.getClass();
        this.a = conversationIdType;
        this.b = messageIdType;
        this.c = str;
        this.d = uri;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aree)) {
            return false;
        }
        aree areeVar = (aree) obj;
        return ffkj.e(this.a, areeVar.a) && ffkj.e(this.b, areeVar.b) && ffkj.e(this.c, areeVar.c) && ffkj.e(this.d, areeVar.d) && this.e == areeVar.e;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + (true != this.e ? 1237 : 1231);
    }

    public final String toString() {
        return "TranscriptionRequest(conversationId=" + this.a + ", messageId=" + this.b + ", partId=" + this.c + ", audioFile=" + this.d + ", isUserTriggered=" + this.e + ")";
    }
}
