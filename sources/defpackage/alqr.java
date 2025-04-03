package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alqr extends alsw {
    private final MessageCoreData a;
    private final String b;

    public alqr(MessageCoreData messageCoreData, String str) {
        this.a = messageCoreData;
        if (str == null) {
            throw new NullPointerException("Null receiptRawSenderId");
        }
        this.b = str;
    }

    @Override // defpackage.alsw
    public final MessageCoreData a() {
        return this.a;
    }

    @Override // defpackage.alsw
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alsw) {
            alsw alswVar = (alsw) obj;
            if (this.a.equals(alswVar.a()) && this.b.equals(alswVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "MessageDeliveredEvent{message=" + this.a.toString() + ", receiptRawSenderId=" + this.b + "}";
    }
}
