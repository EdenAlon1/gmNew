package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaqu implements zqy {
    public final doqd a;
    public final dnvr b;
    private final MessageId c;
    private final String d;

    public aaqu(MessageId messageId, doqd doqdVar, dnvr dnvrVar) {
        this.c = messageId;
        this.a = doqdVar;
        this.b = dnvrVar;
        String a = messageId.a();
        a.getClass();
        this.d = a;
    }

    @Override // defpackage.zqy
    public final MessageId a() {
        return this.c;
    }

    @Override // defpackage.dnmw
    public final String b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaqu)) {
            return false;
        }
        aaqu aaquVar = (aaqu) obj;
        return ffkj.e(this.c, aaquVar.c) && ffkj.e(this.a, aaquVar.a) && ffkj.e(this.b, aaquVar.b);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() * 31) + this.a.hashCode();
        dnvr dnvrVar = this.b;
        return (hashCode * 31) + (dnvrVar == null ? 0 : dnvrVar.hashCode());
    }

    public final String toString() {
        return "BugleTombstoneUiData(messageId=" + this.c + ", contentUiData=" + this.a + ", separators=" + this.b + ")";
    }
}
