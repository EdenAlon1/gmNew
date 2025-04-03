package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaqb implements zqy {
    private final MessageId a;
    private final String b;

    public aaqb(MessageId messageId) {
        this.a = messageId;
        String a = messageId.a();
        a.getClass();
        this.b = a;
    }

    @Override // defpackage.zqy
    public final MessageId a() {
        return this.a;
    }

    @Override // defpackage.dnmw
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aaqb) && ffkj.e(this.a, ((aaqb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HiddenMessageUiData(messageId=" + this.a + ")";
    }
}
