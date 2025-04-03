package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cihj {
    public final MessageId a;

    public cihj() {
        this((byte[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cihj) && ffkj.e(this.a, ((cihj) obj).a);
    }

    public final int hashCode() {
        MessageId messageId = this.a;
        if (messageId == null) {
            return 0;
        }
        return messageId.hashCode();
    }

    public final String toString() {
        return "AdditionalReflectedMessageParams(repliedToMessageId=" + this.a + ")";
    }

    public cihj(MessageId messageId) {
        this.a = messageId;
    }

    public /* synthetic */ cihj(byte[] bArr) {
        this((MessageId) null);
    }
}
