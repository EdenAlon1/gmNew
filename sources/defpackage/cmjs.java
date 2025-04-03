package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmjs {
    public final MessageId a;

    public cmjs(MessageId messageId) {
        this.a = messageId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cmjs) && ffkj.e(this.a, ((cmjs) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "EditQueuedInfo(editedMessageId=" + this.a + ")";
    }
}
