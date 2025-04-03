package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqnb {
    public final long a;
    public final String b;

    public cqnb(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqnb)) {
            return false;
        }
        cqnb cqnbVar = (cqnb) obj;
        return this.a == cqnbVar.a && ffkj.e(this.b, cqnbVar.b);
    }

    public final int hashCode() {
        long j = this.a;
        return (((int) (j ^ (j >>> 32))) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SmsMessageToUpdate(messageId=" + this.a + ", address=" + this.b + ")";
    }
}
