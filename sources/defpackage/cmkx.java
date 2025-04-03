package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmkx {
    public final MessageIdType a;
    public final Instant b;

    public cmkx(MessageIdType messageIdType, Instant instant) {
        this.a = messageIdType;
        this.b = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmkx)) {
            return false;
        }
        cmkx cmkxVar = (cmkx) obj;
        return ffkj.e(this.a, cmkxVar.a) && ffkj.e(this.b, cmkxVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "LatestEditVersionInfo(messageId=" + this.a + ", timestamp=" + this.b + ")";
    }
}
