package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuwr {
    public final boolean a;
    public final long b;
    public final long c;
    public final List d;
    public final List e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;
    private final List k;

    public cuwr(boolean z, long j, long j2, List list, List list2, List list3, int i, int i2, int i3, int i4, String str) {
        str.getClass();
        this.a = z;
        this.b = j;
        this.c = j2;
        this.k = list;
        this.d = list2;
        this.e = list3;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuwr)) {
            return false;
        }
        cuwr cuwrVar = (cuwr) obj;
        return this.a == cuwrVar.a && this.b == cuwrVar.b && this.c == cuwrVar.c && ffkj.e(this.k, cuwrVar.k) && ffkj.e(this.d, cuwrVar.d) && ffkj.e(this.e, cuwrVar.e) && this.f == cuwrVar.f && this.g == cuwrVar.g && this.h == cuwrVar.h && this.i == cuwrVar.i && ffkj.e(this.j, cuwrVar.j);
    }

    public final int hashCode() {
        boolean z = this.a;
        return ((((((((((((((((((((true != z ? 1237 : 1231) * 31) + cuwq.a(this.b)) * 31) + cuwq.a(this.c)) * 31) + this.k.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + this.j.hashCode();
    }

    public final String toString() {
        return "TachyonSpamMetadata(isContact=" + this.a + ", earliestIncomingTimestamp=" + this.b + ", earliestOutgoingTimestamp=" + this.c + ", suspectedSpamSource=" + this.k + ", latestSpamDetectionBySource=" + this.d + ", latestClassificationsBySource=" + this.e + ", messagesFromReporterCount=" + this.f + ", messagesFromReportedCount=" + this.g + ", totalMessagesCount=" + this.h + ", otherParticipantCount=" + this.i + ", rcsGroupId=" + this.j + ")";
    }
}
