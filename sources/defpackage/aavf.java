package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aavf {
    public final zqz a;
    public final boolean b;
    public final fgdj c;
    private final MessageId d;

    public aavf(zqz zqzVar, MessageId messageId, boolean z, fgdj fgdjVar) {
        fgdjVar.getClass();
        this.a = zqzVar;
        this.d = messageId;
        this.b = z;
        this.c = fgdjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aavf)) {
            return false;
        }
        aavf aavfVar = (aavf) obj;
        return ffkj.e(this.a, aavfVar.a) && ffkj.e(this.d, aavfVar.d) && this.b == aavfVar.b && ffkj.e(this.c, aavfVar.c);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.d.hashCode()) * 31) + (true != this.b ? 1237 : 1231)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ScheduledMessagesListItemUiData(scheduledMessage=" + this.a + ", messageId=" + this.d + ", isVisible=" + this.b + ", isTalkbackEnabled=" + this.c + ")";
    }
}
