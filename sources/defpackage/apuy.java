package defpackage;

import j$.time.Instant;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apuy extends ffhv implements ffjm {
    final /* synthetic */ apva a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apuy(apva apvaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = apvaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((apuy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        apvt apvtVar = this.a.e;
        synchronized (apvtVar.b) {
            apsv apsvVar = apvtVar.d;
            if (apsvVar == null) {
                ensk h = apvt.a.h();
                h.Y(ente.a, "BugleMapi");
                ((enrr) h.h("com/google/android/apps/messaging/shared/api/messaging/message/internal/StateTracker", "updateCacheWithInFlight", 242, "OptimisticMessagePager.kt")).q("dropping optimistic mutation for in flight messages, cache was null.");
            } else {
                List list = apvtVar.e;
                Instant a = apvc.a(apsvVar.c.a);
                Iterator it = list.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (((alxr) it.next()).n().compareTo(a) <= 0) {
                        break;
                    }
                    i++;
                }
                if (i >= 0) {
                    list = engq.a(list.subList(0, i));
                }
                if (list.isEmpty()) {
                    ensk h2 = apvt.a.h();
                    h2.Y(ente.a, "BugleMapi");
                    ((enrr) h2.h("com/google/android/apps/messaging/shared/api/messaging/message/internal/StateTracker", "updateCacheWithInFlight", 247, "OptimisticMessagePager.kt")).q("cache already includes all in flight messages.");
                } else {
                    AtomicLong atomicLong = apvtVar.c;
                    long j = apsvVar.b;
                    if (atomicLong.compareAndSet(j, j + 1)) {
                        apvf d = apvtVar.d(apsvVar.c, list, apsvVar.a);
                        ensk h3 = apvt.a.h();
                        h3.Y(ente.a, "BugleMapi");
                        ((enrr) h3.h("com/google/android/apps/messaging/shared/api/messaging/message/internal/StateTracker", "updateCacheWithInFlight", 262, "OptimisticMessagePager.kt")).s("cache updated with in flight messages at version %d", apsvVar.b + 1);
                        apvtVar.d = new apsv(apsvVar.a, apsvVar.b + 1, d);
                        this.a.f.c(false);
                    } else {
                        ensk h4 = apvt.a.h();
                        h4.Y(ente.a, "BugleMapi");
                        ((enrr) h4.h("com/google/android/apps/messaging/shared/api/messaging/message/internal/StateTracker", "updateCacheWithInFlight", 253, "OptimisticMessagePager.kt")).A("cache version is obsolete: cache: %d, current version: %d.", apsvVar.b, apvtVar.c);
                    }
                }
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new apuy(this.a, ffguVar);
    }
}
