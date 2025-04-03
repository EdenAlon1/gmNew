package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyha extends cyhh {
    private final MessageIdType a;

    public cyha(MessageIdType messageIdType) {
        this.a = messageIdType;
    }

    @Override // defpackage.cyhh
    public final MessageIdType a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cyhh) {
            return this.a.equals(((cyhh) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RemindersBannerScrollEvent{messageId=" + this.a.toString() + "}";
    }
}
