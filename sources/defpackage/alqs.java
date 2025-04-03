package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alqs extends alsx {
    private final MessageCoreData a;
    private final String b;

    public alqs(MessageCoreData messageCoreData, String str) {
        this.a = messageCoreData;
        if (str == null) {
            throw new NullPointerException("Null receiptRawSenderId");
        }
        this.b = str;
    }

    @Override // defpackage.alsx
    public final MessageCoreData a() {
        return this.a;
    }

    @Override // defpackage.alsx
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alsx) {
            alsx alsxVar = (alsx) obj;
            if (this.a.equals(alsxVar.a()) && this.b.equals(alsxVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "MessageDisplayedEvent{message=" + this.a.toString() + ", receiptRawSenderId=" + this.b + "}";
    }
}
