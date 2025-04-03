package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmjt {
    public final long a;
    public final MessageIdType b;
    public final Duration c;
    public final bdhg d;
    public final Instant e;
    public final boolean f;

    public cmjt(long j, MessageIdType messageIdType, Duration duration, bdhg bdhgVar, Instant instant, boolean z) {
        this.a = j;
        this.b = messageIdType;
        this.c = duration;
        this.d = bdhgVar;
        this.e = instant;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmjt)) {
            return false;
        }
        cmjt cmjtVar = (cmjt) obj;
        return this.a == cmjtVar.a && ffkj.e(this.b, cmjtVar.b) && ffkj.e(this.c, cmjtVar.c) && ffkj.e(this.d, cmjtVar.d) && ffkj.e(this.e, cmjtVar.e) && this.f == cmjtVar.f;
    }

    public final int hashCode() {
        MessageIdType messageIdType = this.b;
        int hashCode = messageIdType == null ? 0 : messageIdType.hashCode();
        long j = this.a;
        int hashCode2 = (((((int) (j ^ (j >>> 32))) * 31) + hashCode) * 31) + this.c.hashCode();
        bdhg bdhgVar = this.d;
        int hashCode3 = ((hashCode2 * 31) + (bdhgVar == null ? 0 : bdhgVar.hashCode())) * 31;
        Instant instant = this.e;
        return ((hashCode3 + (instant != null ? instant.hashCode() : 0)) * 31) + (true != this.f ? 1237 : 1231);
    }

    public final String toString() {
        return "EditReceivedInfo(usageStatsLoggingId=" + this.a + ", editedMessageId=" + this.b + ", elapsedTimeFromMessageSent=" + this.c + ", editedMessageIdInHeader=" + this.d + ", editedTimestampInHeader=" + this.e + ", hasGsmaHeaders=" + this.f + ")";
    }
}
