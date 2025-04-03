package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekve implements ektx {
    public static final enru a = enru.c("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerPeriodicScheduler");
    public final ejoc b;
    public final Executor c;
    private final ektz d;
    private final Boolean e = false;
    private final Boolean f;

    public ekve(ejoc ejocVar, ektz ektzVar, Executor executor, Boolean bool) {
        this.b = ejocVar;
        this.d = ektzVar;
        this.c = executor;
        this.f = bool;
    }

    public static poj b(Set set) {
        poh pohVar = new poh();
        pohVar.a = set.contains(ekrk.ON_CHARGER);
        if (set.contains(ekrk.ON_NETWORK_UNMETERED)) {
            pohVar.c(3);
        } else if (set.contains(ekrk.ON_NETWORK_CONNECTED)) {
            pohVar.c(2);
        }
        return pohVar.a();
    }

    static String d(poj pojVar, emxc emxcVar) {
        StringBuilder sb = new StringBuilder(ejnz.a("SyncPeriodicTask", emxcVar));
        if (pojVar.c) {
            sb.append("_charging");
        }
        int i = pojVar.j;
        if (i == 3) {
            sb.append("_unmetered");
        } else if (i == 2) {
            sb.append("_connected");
        }
        return sb.toString();
    }

    @Override // defpackage.ektx
    public final ListenableFuture a(Set set, long j, Map map) {
        if (!this.f.booleanValue()) {
            return erre.a;
        }
        ((enrr) ((enrr) a.h()).h("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerPeriodicScheduler", "scheduleNextSyncSystemWakeup", 85, "SyncWorkManagerPeriodicScheduler.java")).q("Scheduling next periodic WorkManager workers");
        return erny.g(this.d.a(set, j, map), eldl.d(new eroh() { // from class: ekva
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final ekve ekveVar;
                Map map2 = (Map) obj;
                ArrayList arrayList = new ArrayList();
                Iterator it = map2.entrySet().iterator();
                while (true) {
                    ekveVar = ekve.this;
                    if (!it.hasNext()) {
                        break;
                    }
                    final ektw ektwVar = (ektw) ((Map.Entry) it.next()).getValue();
                    ejoc ejocVar = ekveVar.b;
                    poj b = ekve.b(ektwVar.c());
                    String d = ekve.d(ekve.b(ektwVar.c()), ekveVar.c());
                    long a2 = ektwVar.a();
                    emxc c = ekveVar.c();
                    enru enruVar = ekus.a;
                    ejoe n = ejoi.n(ekus.class);
                    ((ejnt) n).d = emxc.j(Long.valueOf(a2));
                    n.e(new ejnv(ekus.b, emux.a));
                    n.g(new ejnx(d, poz.UPDATE));
                    n.d(b);
                    n.f(new enpx(ekus.d(c)));
                    arrayList.add(erny.f(ejocVar.c(n.h()), eldl.a(new emwl() { // from class: ekuz
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            enrr enrrVar = (enrr) ((enrr) ekve.a.e()).h("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerPeriodicScheduler", "scheduleWorker", 180, "SyncWorkManagerPeriodicScheduler.java");
                            ektw ektwVar2 = ektw.this;
                            enrrVar.C("Scheduled worker: %s at %s", ektwVar2.c(), ektwVar2.a());
                            return null;
                        }
                    }), erpp.a));
                }
                Set keySet = map2.keySet();
                final HashSet hashSet = new HashSet();
                Iterator it2 = keySet.iterator();
                while (it2.hasNext()) {
                    hashSet.add(ekve.b((Set) it2.next()));
                }
                arrayList.add(erny.g(ekveVar.b.e(ekus.d(ekveVar.c())), eldl.d(new eroh() { // from class: ekvb
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        ArrayList arrayList2 = new ArrayList();
                        HashSet hashSet2 = new HashSet();
                        for (pqq pqqVar : (List) obj2) {
                            if (pqqVar.b == pqp.ENQUEUED) {
                                hashSet2.add(pqqVar.d);
                            }
                        }
                        enqu listIterator = enip.o(hashSet2).listIterator();
                        while (listIterator.hasNext()) {
                            Set set2 = hashSet;
                            poj pojVar = (poj) listIterator.next();
                            if (!set2.contains(pojVar)) {
                                ekve ekveVar2 = ekve.this;
                                arrayList2.add(erny.f(ekveVar2.b.a(ekve.d(pojVar, ekveVar2.c())), new emwn(null), erpp.a));
                            }
                        }
                        return erqt.a(arrayList2).a(eldl.m(new Callable() { // from class: ekvd
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return null;
                            }
                        }), erpp.a);
                    }
                }), ekveVar.c));
                return erqt.c(arrayList).a(eldl.m(new Callable() { // from class: ekvc
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ((enrr) ((enrr) ekve.a.h()).h("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerPeriodicScheduler", "scheduleNextSyncSystemWakeup", 104, "SyncWorkManagerPeriodicScheduler.java")).q("Successfully scheduled next periodic workers");
                        return null;
                    }
                }), erpp.a);
            }
        }), this.c);
    }

    final emxc c() {
        this.e.booleanValue();
        return emux.a;
    }
}
