package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aasf {
    public final MessageId a;
    public final apqa b;

    public aasf(MessageId messageId, apqa apqaVar) {
        this.a = messageId;
        this.b = apqaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aasf)) {
            return false;
        }
        aasf aasfVar = (aasf) obj;
        return ffkj.e(this.a, aasfVar.a) && ffkj.e(this.b, aasfVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ToolstoneArgs(messageId=" + this.a + ", content=" + this.b + ")";
    }
}
