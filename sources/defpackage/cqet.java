package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cqet {
    public final cqfe a;
    public final Duration b;

    public cqet(cqfe cqfeVar, Duration duration) {
        cqfeVar.getClass();
        this.a = cqfeVar;
        this.b = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqet)) {
            return false;
        }
        cqet cqetVar = (cqet) obj;
        return this.a == cqetVar.a && ffkj.e(this.b, cqetVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "UpdateResults(status=" + this.a + ", txnDuration=" + this.b + ")";
    }
}
