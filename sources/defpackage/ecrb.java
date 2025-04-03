package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageStats;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecrb extends ecqz implements ecgn, ecje {
    public static final long a = TimeUnit.HOURS.toMillis(12);
    public final ecjc b;
    public final Context c;
    public final fazb d;
    public final ecsr e;
    private final ecgt f;
    private final Executor g;

    public ecrb(ecjd ecjdVar, Context context, ecgt ecgtVar, Executor executor, fazb fazbVar, ecsr ecsrVar, ffbr ffbrVar) {
        this.b = ecjdVar.a(executor, fazbVar, ffbrVar);
        this.g = executor;
        this.c = context;
        this.d = fazbVar;
        this.e = ecsrVar;
        this.f = ecgtVar;
    }

    @Override // defpackage.ecgn
    public final void i(ecda ecdaVar) {
        this.f.b(this);
        erqt.n(new erog() { // from class: ecra
            @Override // defpackage.erog
            public final ListenableFuture a() {
                long j;
                ecrb ecrbVar = ecrb.this;
                ((ecqy) ecrbVar.d.b()).f();
                if (!dubc.e(ecrbVar.c)) {
                    ((enrr) ((enrr) ecdj.a.e()).h("com/google/android/libraries/performance/primes/metrics/storage/StorageMetricServiceImpl", "sendInBackgroundInternal", 109, "StorageMetricServiceImpl.java")).q("Device locked.");
                    return erre.a;
                }
                efbd.b();
                ecsr ecsrVar = ecrbVar.e;
                long j2 = ecrb.a;
                efbd.b();
                if (dubc.e(ecsrVar.a)) {
                    long j3 = dubc.e(ecsrVar.a) ? ((SharedPreferences) ecsrVar.c.b()).getLong("primes.packageMetric.lastSendTime", -1L) : -1L;
                    long a2 = ecsrVar.b.a();
                    if (a2 < j3) {
                        if (((SharedPreferences) ecsrVar.c.b()).edit().remove("primes.packageMetric.lastSendTime").commit()) {
                            j = -1;
                        } else {
                            j = -1;
                            ((enrr) ((enrr) ecdj.a.e()).h("com/google/android/libraries/performance/primes/sampling/PersistentRateLimiting", "hasRecentTimeStamp", 51, "PersistentRateLimiting.java")).q("Failure storing timestamp to SharedPreferences");
                        }
                        j3 = j;
                    } else {
                        j = -1;
                    }
                    if (j3 != j && a2 <= j3 + j2) {
                        ((enrr) ((enrr) ecdj.a.e()).h("com/google/android/libraries/performance/primes/metrics/storage/StorageMetricServiceImpl", "sendInBackgroundInternal", 113, "StorageMetricServiceImpl.java")).q("Ignoring storage metric request, storage metric collection occurred too recently.");
                        return erre.a;
                    }
                }
                if (!ecrbVar.b.c(null)) {
                    return erre.a;
                }
                Context context = ecrbVar.c;
                efbd.b();
                PackageStats a3 = ecqv.a(context);
                if (a3 == null) {
                    return erqt.h(new IllegalStateException("PackageStats capture failed."));
                }
                fgqw fgqwVar = (fgqw) fgqx.a.createBuilder();
                fgqj fgqjVar = (fgqj) fgqm.a.createBuilder();
                long j4 = a3.cacheSize;
                fgqjVar.copyOnWrite();
                fgqm fgqmVar = (fgqm) fgqjVar.instance;
                fgqmVar.b |= 1;
                fgqmVar.c = j4;
                long j5 = a3.codeSize;
                fgqjVar.copyOnWrite();
                fgqm fgqmVar2 = (fgqm) fgqjVar.instance;
                fgqmVar2.b |= 2;
                fgqmVar2.d = j5;
                long j6 = a3.dataSize;
                fgqjVar.copyOnWrite();
                fgqm fgqmVar3 = (fgqm) fgqjVar.instance;
                fgqmVar3.b |= 4;
                fgqmVar3.e = j6;
                long j7 = a3.externalCacheSize;
                fgqjVar.copyOnWrite();
                fgqm fgqmVar4 = (fgqm) fgqjVar.instance;
                fgqmVar4.b |= 8;
                fgqmVar4.f = j7;
                long j8 = a3.externalCodeSize;
                fgqjVar.copyOnWrite();
                fgqm fgqmVar5 = (fgqm) fgqjVar.instance;
                fgqmVar5.b |= 16;
                fgqmVar5.g = j8;
                long j9 = a3.externalDataSize;
                fgqjVar.copyOnWrite();
                fgqm fgqmVar6 = (fgqm) fgqjVar.instance;
                fgqmVar6.b |= 32;
                fgqmVar6.h = j9;
                long j10 = a3.externalMediaSize;
                fgqjVar.copyOnWrite();
                fgqm fgqmVar7 = (fgqm) fgqjVar.instance;
                fgqmVar7.b |= 64;
                fgqmVar7.i = j10;
                long j11 = a3.externalObbSize;
                fgqjVar.copyOnWrite();
                fgqm fgqmVar8 = (fgqm) fgqjVar.instance;
                fgqmVar8.b |= 128;
                fgqmVar8.j = j11;
                fgqj fgqjVar2 = (fgqj) ((fgqm) fgqjVar.build()).toBuilder();
                ((ecqy) ecrbVar.d.b()).d();
                fgqwVar.copyOnWrite();
                fgqx fgqxVar = (fgqx) fgqwVar.instance;
                fgqm fgqmVar9 = (fgqm) fgqjVar2.build();
                fgqmVar9.getClass();
                fgqxVar.j = fgqmVar9;
                fgqxVar.b |= 128;
                ecsr ecsrVar2 = ecrbVar.e;
                if (!dubc.e(ecsrVar2.a) || !((SharedPreferences) ecsrVar2.c.b()).edit().putLong("primes.packageMetric.lastSendTime", ecsrVar2.b.a()).commit()) {
                    ((enrr) ((enrr) ecdj.a.e()).h("com/google/android/libraries/performance/primes/metrics/storage/StorageMetricServiceImpl", "sendInBackgroundInternal", 146, "StorageMetricServiceImpl.java")).q("Failure storing timestamp persistently");
                }
                ecjc ecjcVar = ecrbVar.b;
                eciu m = eciv.m();
                m.f((fgqx) fgqwVar.build());
                return ecjcVar.b(m.a());
            }
        }, this.g);
    }

    @Override // defpackage.ecje
    public final void n() {
        this.f.a(this);
    }

    @Override // defpackage.ecgn
    public final /* synthetic */ void j(ecda ecdaVar) {
    }
}
