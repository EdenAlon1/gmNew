package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cimy extends ciou {
    private final ConversationIdType a;
    private final MessageIdType b;
    private final int c;
    private final int d;

    public cimy(ConversationIdType conversationIdType, MessageIdType messageIdType, int i, int i2) {
        this.a = conversationIdType;
        this.b = messageIdType;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.ciou
    public final int a() {
        return this.c;
    }

    @Override // defpackage.ciou
    public final ConversationIdType b() {
        return this.a;
    }

    @Override // defpackage.ciou
    public final MessageIdType c() {
        return this.b;
    }

    @Override // defpackage.ciou
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ciou) {
            ciou ciouVar = (ciou) obj;
            if (this.a.equals(ciouVar.b()) && this.b.equals(ciouVar.c()) && this.c == ciouVar.a() && this.d == ciouVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    public final String toString() {
        MessageIdType messageIdType = this.b;
        return "FailedMessageInfo{conversationId=" + this.a.toString() + ", messageId=" + messageIdType.toString() + ", rawTelephonyStatus=" + this.c + ", failureType=" + ciov.a(this.d) + "}";
    }
}
