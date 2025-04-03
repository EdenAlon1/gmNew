package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuvb {
    public final MessageIdType a;

    public cuvb(MessageIdType messageIdType) {
        messageIdType.getClass();
        this.a = messageIdType;
        if (((Boolean) ((cfup) cubs.z.get()).e()).booleanValue() && messageIdType.c()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cuvb) && ffkj.e(this.a, ((cuvb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BugleMessageIdWrapper(messageId=" + this.a + ")";
    }
}
