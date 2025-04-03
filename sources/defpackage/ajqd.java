package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajqd {
    public final long a;
    public final bdhg b;
    public final bdhg c;
    public final MessageIdType d;
    public final boolean e;

    public ajqd(long j, bdhg bdhgVar, bdhg bdhgVar2, MessageIdType messageIdType, boolean z) {
        this.a = j;
        this.b = bdhgVar;
        this.c = bdhgVar2;
        this.d = messageIdType;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajqd)) {
            return false;
        }
        ajqd ajqdVar = (ajqd) obj;
        return this.a == ajqdVar.a && ffkj.e(this.b, ajqdVar.b) && ffkj.e(this.c, ajqdVar.c) && ffkj.e(this.d, ajqdVar.d) && this.e == ajqdVar.e;
    }

    public final int hashCode() {
        long j = this.a;
        return (((((((((int) (j ^ (j >>> 32))) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + (true != this.e ? 1237 : 1231);
    }

    public final String toString() {
        return "ReplyReceivedInfo(usageStatsLoggingId=" + this.a + ", rcsMessageId=" + this.b + ", inReplyToRcsMessageId=" + this.c + ", repliedToMessageId=" + this.d + ", hasGsmaHeaders=" + this.e + ")";
    }
}
