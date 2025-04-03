package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cibr extends ciex {
    public final MessageIdType a;
    public final long b;

    public cibr(MessageIdType messageIdType, long j) {
        this.a = messageIdType;
        this.b = j;
    }

    @Override // defpackage.ciex
    public final long a() {
        return this.b;
    }

    @Override // defpackage.ciex
    public final MessageIdType b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ciex) {
            ciex ciexVar = (ciex) obj;
            if (this.a.equals(ciexVar.b()) && this.b == ciexVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "MessageInfo{messageId=" + this.a.toString() + ", timestamp=" + this.b + "}";
    }
}
