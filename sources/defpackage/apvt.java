package defpackage;

import j$.time.Instant;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apvt {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/api/messaging/message/internal/StateTracker");
    public apsv d;
    private final ffji f;
    public final Object b = new Object();
    public final AtomicLong c = new AtomicLong(0);
    public final List e = new ArrayList();

    public apvt(ffji ffjiVar) {
        this.f = ffjiVar;
    }

    public final long a() {
        return this.c.get();
    }

    public final apsv b() {
        apsv apsvVar;
        synchronized (this.b) {
            apsvVar = this.d;
        }
        return apsvVar;
    }

    public final apvf c(int i, long j, apvf apvfVar) {
        if (apvfVar.b > 0) {
            return apvfVar;
        }
        synchronized (this.b) {
            apsv apsvVar = this.d;
            final Instant a2 = apvc.a(apvfVar.a);
            List list = this.e;
            final ffji ffjiVar = new ffji() { // from class: apvr
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    alxr alxrVar = (alxr) obj;
                    alxrVar.getClass();
                    return Boolean.valueOf(alxrVar.n().compareTo(Instant.this) <= 0);
                }
            };
            Collection.EL.removeIf(list, new Predicate() { // from class: apvs
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo439negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((Boolean) ffji.this.invoke(obj)).booleanValue();
                }
            });
            if (!this.e.isEmpty()) {
                apvfVar = d(apvfVar, this.e, i);
            }
            if (apsvVar != null && apsvVar.b > j) {
                ensk h = a.h();
                h.Y(ente.a, "BugleMapi");
                ((enrr) h.h("com/google/android/apps/messaging/shared/api/messaging/message/internal/StateTracker", "updateCacheIfNewerResults", 232, "OptimisticMessagePager.kt")).z("cache is at a newer version, leaving as is. %d > %d", apsvVar.b, j);
            }
            this.d = new apsv(i, j, apvfVar);
            ensk h2 = a.h();
            h2.Y(ente.a, "BugleMapi");
            ((enrr) h2.h("com/google/android/apps/messaging/shared/api/messaging/message/internal/StateTracker", "updateCacheIfNewerResults", 228, "OptimisticMessagePager.kt")).s("cache set to non null value at version %d.", j);
        }
        return apvfVar;
    }

    public final apvf d(apvf apvfVar, List list, int i) {
        long j;
        engw engwVar = apvfVar.a;
        int min = list.size() > i ? Math.min(engwVar.size(), i) : Math.min(engwVar.size(), i - list.size());
        engr engrVar = new engr();
        engrVar.j(list);
        engrVar.j(engwVar.subList(0, min));
        long size = apvfVar.c + (engwVar.size() - min);
        if (size < 0) {
            enru enruVar = a;
            ensk e = enruVar.e();
            e.Y(ente.a, "BugleMapi");
            ((enrr) e.h("com/google/android/apps/messaging/shared/api/messaging/message/internal/StateTracker", "merge", 293, "OptimisticMessagePager.kt")).J("Cached list size = %d, inFlights size = %d, endIndex = %d", Integer.valueOf(engwVar.size()), Integer.valueOf(list.size()), Integer.valueOf(min));
            ensk j2 = enruVar.j();
            j2.Y(ente.a, "BugleMapi");
            ((enrr) j2.h("com/google/android/apps/messaging/shared/api/messaging/message/internal/StateTracker", "merge", 299, "OptimisticMessagePager.kt")).q("Paging results contain negative itemsAfter. Resetting to zero.");
            j = 0;
        } else {
            j = size;
        }
        if (apvfVar.b != 0) {
            throw new IllegalStateException("Check failed.");
        }
        engw g = engrVar.g();
        g.getClass();
        return new apvf(g, 0L, j, this.f);
    }
}
