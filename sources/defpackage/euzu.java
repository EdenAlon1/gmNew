package defpackage;

import android.content.Context;
import java.net.URI;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euzu extends evbp {
    public final Context a;
    public final URI b;
    public final Executor c;
    public final Executor d;
    public final ScheduledExecutorService e;
    public final String f;
    public final emyl g;
    public final evag h;
    public final Integer i;
    public final Integer j;
    public final long k;
    public final int l;
    public final long m;
    private final Executor o;
    private final long p;

    public euzu(Context context, URI uri, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService, String str, emyl emylVar, evag evagVar, Integer num, Integer num2, long j, int i, long j2, long j3) {
        this.a = context;
        this.b = uri;
        this.o = executor;
        this.c = executor2;
        this.d = executor3;
        this.e = scheduledExecutorService;
        this.f = str;
        this.g = emylVar;
        this.h = evagVar;
        this.i = num;
        this.j = num2;
        this.k = j;
        this.l = i;
        this.p = j2;
        this.m = j3;
    }

    @Override // defpackage.evbp
    public final int a() {
        return this.l;
    }

    @Override // defpackage.evbp
    public final long b() {
        return this.k;
    }

    @Override // defpackage.evbp
    public final long c() {
        return this.p;
    }

    @Override // defpackage.evbp
    public final long d() {
        return this.m;
    }

    @Override // defpackage.evbp
    public final Context e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        ScheduledExecutorService scheduledExecutorService;
        String str;
        evag evagVar;
        Integer num;
        Integer num2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof evbp) {
            evbp evbpVar = (evbp) obj;
            if (this.a.equals(evbpVar.e()) && this.b.equals(evbpVar.k()) && this.o.equals(evbpVar.l()) && this.c.equals(evbpVar.m()) && this.d.equals(evbpVar.n()) && ((scheduledExecutorService = this.e) != null ? scheduledExecutorService.equals(evbpVar.o()) : evbpVar.o() == null) && ((str = this.f) != null ? str.equals(evbpVar.j()) : evbpVar.j() == null) && this.g.equals(evbpVar.f()) && ((evagVar = this.h) != null ? evagVar.equals(evbpVar.g()) : evbpVar.g() == null) && ((num = this.i) != null ? num.equals(evbpVar.i()) : evbpVar.i() == null) && ((num2 = this.j) != null ? num2.equals(evbpVar.h()) : evbpVar.h() == null) && this.k == evbpVar.b() && this.l == evbpVar.a() && this.p == evbpVar.c() && this.m == evbpVar.d()) {
                evbpVar.p();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.evbp
    public final emyl f() {
        return this.g;
    }

    @Override // defpackage.evbp
    public final evag g() {
        return this.h;
    }

    @Override // defpackage.evbp
    public final Integer h() {
        return this.j;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        ScheduledExecutorService scheduledExecutorService = this.e;
        int hashCode2 = ((hashCode * 1000003) ^ (scheduledExecutorService == null ? 0 : scheduledExecutorService.hashCode())) * 1000003;
        String str = this.f;
        int hashCode3 = (((hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.g.hashCode()) * 1000003;
        evag evagVar = this.h;
        int hashCode4 = (hashCode3 ^ (evagVar == null ? 0 : evagVar.hashCode())) * 1000003;
        Integer num = this.i;
        int hashCode5 = (hashCode4 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Integer num2 = this.j;
        int hashCode6 = num2 != null ? num2.hashCode() : 0;
        long j = this.k;
        int i = (((((hashCode5 ^ hashCode6) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.l) * 1000003;
        long j2 = this.p;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.m;
        return (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
    }

    @Override // defpackage.evbp
    public final Integer i() {
        return this.i;
    }

    @Override // defpackage.evbp
    public final String j() {
        return this.f;
    }

    @Override // defpackage.evbp
    public final URI k() {
        return this.b;
    }

    @Override // defpackage.evbp
    public final Executor l() {
        return this.o;
    }

    @Override // defpackage.evbp
    public final Executor m() {
        return this.c;
    }

    @Override // defpackage.evbp
    public final Executor n() {
        return this.d;
    }

    @Override // defpackage.evbp
    public final ScheduledExecutorService o() {
        return this.e;
    }

    public final String toString() {
        evag evagVar = this.h;
        emyl emylVar = this.g;
        ScheduledExecutorService scheduledExecutorService = this.e;
        Executor executor = this.d;
        Executor executor2 = this.c;
        Executor executor3 = this.o;
        URI uri = this.b;
        return "TransportConfig{applicationContext=" + String.valueOf(this.a) + ", uri=" + String.valueOf(uri) + ", backgroundExecutor=" + String.valueOf(executor3) + ", blockingExecutor=" + String.valueOf(executor2) + ", lightweightExecutor=" + String.valueOf(executor) + ", lightweightScheduledExecutorService=" + String.valueOf(scheduledExecutorService) + ", userAgentOverride=" + this.f + ", recordNetworkMetricsToPrimes=" + String.valueOf(emylVar) + ", grpcServiceConfig=" + String.valueOf(evagVar) + ", trafficStatsUid=" + this.i + ", trafficStatsTag=" + this.j + ", grpcIdleTimeoutMillis=" + this.k + ", maxMessageSize=" + this.l + ", grpcKeepAliveTimeMillis=" + this.p + ", grpcKeepAliveTimeoutMillis=" + this.m + ", channelCredentials=null}";
    }

    @Override // defpackage.evbp
    public final void p() {
    }
}
