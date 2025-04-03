package defpackage;

import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fetv {
    final int a;
    final long b;
    final long c;
    final double d;
    final Long e;
    final Set f;

    public fetv(int i, long j, long j2, double d, Long l, Set set) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = d;
        this.e = l;
        this.f = enip.o(set);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fetv)) {
            return false;
        }
        fetv fetvVar = (fetv) obj;
        return this.a == fetvVar.a && this.b == fetvVar.b && this.c == fetvVar.c && Double.compare(this.d, fetvVar.d) == 0 && emxb.a(this.e, fetvVar.e) && emxb.a(this.f, fetvVar.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Double.valueOf(this.d), this.e, this.f});
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.f("maxAttempts", this.a);
        b.g("initialBackoffNanos", this.b);
        b.g("maxBackoffNanos", this.c);
        b.d("backoffMultiplier", this.d);
        b.b("perAttemptRecvTimeoutNanos", this.e);
        b.b("retryableStatusCodes", this.f);
        return b.toString();
    }
}
