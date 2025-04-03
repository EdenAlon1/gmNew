package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cqeq {
    public final cqfe a;
    public final cpzi b;
    public final boolean c;
    public final int d;
    public final int e;
    public final Instant f;
    public final int g;
    public final int h;

    public cqeq(cqfe cqfeVar, cpzi cpziVar, boolean z, int i, int i2, Instant instant, int i3, int i4) {
        cqfeVar.getClass();
        this.a = cqfeVar;
        this.b = cpziVar;
        this.c = z;
        this.d = i;
        this.e = i2;
        this.f = instant;
        this.g = i3;
        this.h = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqeq)) {
            return false;
        }
        cqeq cqeqVar = (cqeq) obj;
        return this.a == cqeqVar.a && ffkj.e(this.b, cqeqVar.b) && this.c == cqeqVar.c && this.d == cqeqVar.d && this.e == cqeqVar.e && ffkj.e(this.f, cqeqVar.f) && this.g == cqeqVar.g && this.h == cqeqVar.h;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        Instant instant = this.f;
        return (((((((((((hashCode * 31) + (true != this.c ? 1237 : 1231)) * 31) + this.d) * 31) + this.e) * 31) + (instant == null ? 0 : instant.hashCode())) * 31) + this.g) * 31) + this.h;
    }

    public final String toString() {
        return "ScanResults(status=" + this.a + ", messagesToSync=" + this.b + ", syncComplete=" + this.c + ", messagesUpdatedCount=" + this.d + ", messagesSyncedCount=" + this.e + ", lastMessageTimestamp=" + this.f + ", remoteTotal=" + this.g + ", localTotal=" + this.h + ")";
    }

    public /* synthetic */ cqeq(cqfe cqfeVar) {
        this(cqfeVar, new cpzi(), false, 0, 0, null, 0, 0);
    }
}
