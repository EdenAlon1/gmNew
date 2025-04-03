package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apsd {
    public final MessageId a;
    public final apyv b;
    public final apyw c;

    public apsd(MessageId messageId, apyv apyvVar, apyw apywVar) {
        apywVar.getClass();
        this.a = messageId;
        this.b = apyvVar;
        this.c = apywVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apsd)) {
            return false;
        }
        apsd apsdVar = (apsd) obj;
        return ffkj.e(this.a, apsdVar.a) && ffkj.e(this.b, apsdVar.b) && this.c == apsdVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ReactionEnvelopeInfo(reactedMessageId=" + this.a + ", reaction=" + this.b + ", reactionAction=" + this.c + ")";
    }
}
