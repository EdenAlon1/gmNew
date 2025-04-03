package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emzj {
    private final long a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;

    public emzj() {
        emxf.a(true);
        emxf.a(true);
        emxf.a(true);
        emxf.a(true);
        emxf.a(true);
        emxf.a(true);
        this.a = 0L;
        this.b = 0L;
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof emzj)) {
            return false;
        }
        emzj emzjVar = (emzj) obj;
        long j = emzjVar.a;
        long j2 = emzjVar.b;
        long j3 = emzjVar.c;
        long j4 = emzjVar.d;
        long j5 = emzjVar.e;
        long j6 = emzjVar.f;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{0L, 0L, 0L, 0L, 0L, 0L});
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.g("hitCount", 0L);
        b.g("missCount", 0L);
        b.g("loadSuccessCount", 0L);
        b.g("loadExceptionCount", 0L);
        b.g("totalLoadTime", 0L);
        b.g("evictionCount", 0L);
        return b.toString();
    }
}
