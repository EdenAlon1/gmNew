package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajuh implements ellf {
    public final MessageIdType a;
    public final int b;

    public ajuh(MessageIdType messageIdType, int i) {
        this.a = messageIdType;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajuh)) {
            return false;
        }
        ajuh ajuhVar = (ajuh) obj;
        return ffkj.e(this.a, ajuhVar.a) && this.b == ajuhVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "ReplyInvokedEvent(messageId=" + this.a + ", source=" + ((Object) ajug.a(this.b)) + ")";
    }
}
