package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajuo implements ellf {
    public final MessageIdType a;

    public ajuo(MessageIdType messageIdType) {
        this.a = messageIdType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ajuo) && ffkj.e(this.a, ((ajuo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DismissReplyButtonClickEvent(messageId=" + this.a + ")";
    }
}
