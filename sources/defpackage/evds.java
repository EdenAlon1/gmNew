package defpackage;

import java.net.URI;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evds extends evep {
    public final URI a;
    public final long b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    private final long f;
    private final long g;

    public evds(URI uri, long j, long j2, long j3, Integer num, Integer num2, Integer num3) {
        this.a = uri;
        this.b = j;
        this.f = j2;
        this.g = j3;
        this.c = num;
        this.d = num2;
        this.e = num3;
    }

    @Override // defpackage.evep
    public final long a() {
        return this.b;
    }

    @Override // defpackage.evep
    public final long b() {
        return this.f;
    }

    @Override // defpackage.evep
    public final long c() {
        return this.g;
    }

    @Override // defpackage.evep
    public final Integer d() {
        return this.e;
    }

    @Override // defpackage.evep
    public final Integer e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        Integer num;
        Integer num2;
        Integer num3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof evep) {
            evep evepVar = (evep) obj;
            if (this.a.equals(evepVar.g()) && this.b == evepVar.a() && this.f == evepVar.b() && this.g == evepVar.c() && ((num = this.c) != null ? num.equals(evepVar.f()) : evepVar.f() == null) && ((num2 = this.d) != null ? num2.equals(evepVar.e()) : evepVar.e() == null) && ((num3 = this.e) != null ? num3.equals(evepVar.d()) : evepVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.evep
    public final Integer f() {
        return this.c;
    }

    @Override // defpackage.evep
    public final URI g() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        Integer num = this.c;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j = this.b;
        long j2 = this.f;
        long j3 = this.g;
        int i = ((((((((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ hashCode2) * 1000003;
        Integer num2 = this.d;
        int hashCode3 = (i ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        Integer num3 = this.e;
        return hashCode3 ^ (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "ChannelRuntimeConfig{uri=" + this.a.toString() + ", grpcIdleTimeoutMillis=" + this.b + ", grpcKeepAliveTimeMillis=" + this.f + ", grpcKeepAliveTimeoutMillis=" + this.g + ", trafficStatsUid=" + this.c + ", trafficStatsTag=" + this.d + ", maxMessageSize=" + this.e + "}";
    }
}
