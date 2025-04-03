package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euzm extends euzw {
    public final Context a;
    public final evbq b;
    public final Executor c;
    public final Executor d;
    public final Executor e;
    public final ScheduledExecutorService f;
    public final evbu g;
    public final String h;
    public final emyl i;
    public final emyl j;
    public final evag k;
    public final int l;
    public final long m;
    public final long n;
    private final dlpw o;
    private final emyl p;
    private final emyl q;

    public euzm(Context context, dlpw dlpwVar, evbq evbqVar, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService, evbu evbuVar, String str, emyl emylVar, emyl emylVar2, emyl emylVar3, emyl emylVar4, evag evagVar, int i, long j, long j2) {
        this.a = context;
        this.o = dlpwVar;
        this.b = evbqVar;
        this.c = executor;
        this.d = executor2;
        this.e = executor3;
        this.f = scheduledExecutorService;
        this.g = evbuVar;
        this.h = str;
        this.i = emylVar;
        this.p = emylVar2;
        this.q = emylVar3;
        this.j = emylVar4;
        this.k = evagVar;
        this.l = i;
        this.m = j;
        this.n = j2;
    }

    @Override // defpackage.euzw
    public final int a() {
        return this.l;
    }

    @Override // defpackage.euzw
    public final long b() {
        return this.m;
    }

    @Override // defpackage.euzw
    public final long c() {
        return this.n;
    }

    @Override // defpackage.euzw
    public final Context d() {
        return this.a;
    }

    @Override // defpackage.euzw
    public final dlpw e() {
        return this.o;
    }

    public final boolean equals(Object obj) {
        ScheduledExecutorService scheduledExecutorService;
        evbu evbuVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof euzw) {
            euzw euzwVar = (euzw) obj;
            if (this.a.equals(euzwVar.d()) && this.o.equals(euzwVar.e()) && this.b.equals(euzwVar.k()) && this.c.equals(euzwVar.p()) && this.d.equals(euzwVar.n()) && this.e.equals(euzwVar.o()) && ((scheduledExecutorService = this.f) != null ? scheduledExecutorService.equals(euzwVar.q()) : euzwVar.q() == null) && ((evbuVar = this.g) != null ? evbuVar.equals(euzwVar.l()) : euzwVar.l() == null)) {
                euzwVar.u();
                String str = this.h;
                if (str != null ? str.equals(euzwVar.m()) : euzwVar.m() == null) {
                    if (this.i.equals(euzwVar.i()) && this.p.equals(euzwVar.h()) && this.q.equals(euzwVar.g()) && this.j.equals(euzwVar.f())) {
                        euzwVar.r();
                        evag evagVar = this.k;
                        if (evagVar != null ? evagVar.equals(euzwVar.j()) : euzwVar.j() == null) {
                            euzwVar.t();
                            if (this.l == euzwVar.a() && this.m == euzwVar.b() && this.n == euzwVar.c()) {
                                euzwVar.s();
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.euzw
    public final emyl f() {
        return this.j;
    }

    @Override // defpackage.euzw
    public final emyl g() {
        return this.q;
    }

    @Override // defpackage.euzw
    public final emyl h() {
        return this.p;
    }

    public final int hashCode() {
        int hashCode = ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        ScheduledExecutorService scheduledExecutorService = this.f;
        int hashCode2 = ((hashCode * 1000003) ^ (scheduledExecutorService == null ? 0 : scheduledExecutorService.hashCode())) * 1000003;
        evbu evbuVar = this.g;
        int hashCode3 = hashCode2 ^ (evbuVar == null ? 0 : evbuVar.hashCode());
        String str = this.h;
        int hashCode4 = (((((((((hashCode3 * (-721379959)) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.q.hashCode()) * 1000003) ^ this.j.hashCode();
        evag evagVar = this.k;
        int hashCode5 = ((((hashCode4 * (-721379959)) ^ (evagVar != null ? evagVar.hashCode() : 0)) * (-721379959)) ^ this.l) * 1000003;
        long j = this.m;
        int i = (hashCode5 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.n;
        return (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
    }

    @Override // defpackage.euzw
    public final emyl i() {
        return this.i;
    }

    @Override // defpackage.euzw
    public final evag j() {
        return this.k;
    }

    @Override // defpackage.euzw
    public final evbq k() {
        return this.b;
    }

    @Override // defpackage.euzw
    public final evbu l() {
        return this.g;
    }

    @Override // defpackage.euzw
    public final String m() {
        return this.h;
    }

    @Override // defpackage.euzw
    public final Executor n() {
        return this.d;
    }

    @Override // defpackage.euzw
    public final Executor o() {
        return this.e;
    }

    @Override // defpackage.euzw
    public final Executor p() {
        return this.c;
    }

    @Override // defpackage.euzw
    public final ScheduledExecutorService q() {
        return this.f;
    }

    public final String toString() {
        evag evagVar = this.k;
        emyl emylVar = this.j;
        emyl emylVar2 = this.q;
        emyl emylVar3 = this.p;
        emyl emylVar4 = this.i;
        evbu evbuVar = this.g;
        ScheduledExecutorService scheduledExecutorService = this.f;
        Executor executor = this.e;
        Executor executor2 = this.d;
        Executor executor3 = this.c;
        evbq evbqVar = this.b;
        dlpw dlpwVar = this.o;
        return "ChannelConfig{context=" + this.a.toString() + ", clock=" + dlpwVar.toString() + ", transport=" + evbqVar.toString() + ", lightweightExecutor=" + executor3.toString() + ", backgroundExecutor=" + executor2.toString() + ", blockingExecutor=" + executor.toString() + ", lightweightScheduledExecutor=" + String.valueOf(scheduledExecutorService) + ", authContextManager=" + String.valueOf(evbuVar) + ", rpcCacheProvider=null, userAgentOverride=" + this.h + ", recordNetworkMetricsToPrimes=" + emylVar4.toString() + ", recordCachingMetricsToPrimes=" + emylVar3.toString() + ", recordBandwidthMetrics=" + emylVar2.toString() + ", grpcIdleTimeoutMillis=" + emylVar.toString() + ", streamzConfig=null, grpcServiceConfig=" + String.valueOf(evagVar) + ", consistencyTokenConfig=null, maxMessageSize=" + this.l + ", grpcKeepAliveTimeMillis=" + this.m + ", grpcKeepAliveTimeoutMillis=" + this.n + ", channelCredentials=null}";
    }

    @Override // defpackage.euzw
    public final void r() {
    }

    @Override // defpackage.euzw
    public final void s() {
    }

    @Override // defpackage.euzw
    public final void t() {
    }

    @Override // defpackage.euzw
    public final void u() {
    }
}
