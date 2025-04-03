package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaqe implements zqy {
    public final List a;
    private final MessageId b;
    private final long c;
    private final String d;

    public aaqe(List list, MessageId messageId, long j) {
        this.a = list;
        this.b = messageId;
        this.c = j;
        String a = messageId.a();
        a.getClass();
        this.d = a;
    }

    @Override // defpackage.zqy
    public final MessageId a() {
        return this.b;
    }

    @Override // defpackage.dnmw
    public final String b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaqe)) {
            return false;
        }
        aaqe aaqeVar = (aaqe) obj;
        return ffkj.e(this.a, aaqeVar.a) && ffkj.e(this.b, aaqeVar.b) && this.c == aaqeVar.c;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        long j = this.c;
        return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "BugleMultiPartMessageUiData(messageBubbles=" + this.a + ", messageId=" + this.b + ", timestamp=" + this.c + ")";
    }
}
