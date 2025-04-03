package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbnd {
    public final MessageId a;
    public final int b;

    public cbnd(MessageId messageId, int i) {
        this.a = messageId;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbnd)) {
            return false;
        }
        cbnd cbndVar = (cbnd) obj;
        return ffkj.e(this.a, cbndVar.a) && this.b == cbndVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "Hit(id=" + this.a + ", position=" + this.b + ")";
    }
}
