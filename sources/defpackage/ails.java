package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ails implements aihs {
    public final ConversationId a;
    public final String b;
    public final Recipient c;
    public final byyt d;

    public ails(ConversationId conversationId, String str, Recipient recipient, byyt byytVar) {
        this.a = conversationId;
        this.b = str;
        this.c = recipient;
        this.d = byytVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ails)) {
            return false;
        }
        ails ailsVar = (ails) obj;
        return ffkj.e(this.a, ailsVar.a) && ffkj.e(this.b, ailsVar.b) && ffkj.e(this.c, ailsVar.c) && this.d == ailsVar.d;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        Recipient recipient = this.c;
        return (((hashCode * 31) + (recipient == null ? 0 : recipient.hashCode())) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return cskt.b(super.toString()).toString();
    }
}
