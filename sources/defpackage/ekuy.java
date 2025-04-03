package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekuy implements ektx {
    public static final enru a = enru.c("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerOneTimeScheduler");
    public final ejoc b;
    public final dlpw c;
    private final ektz d;
    private final Executor e;
    private final Boolean f = false;
    private final Boolean g;

    public ekuy(ejoc ejocVar, ektz ektzVar, dlpw dlpwVar, Executor executor, Boolean bool) {
        this.b = ejocVar;
        this.d = ektzVar;
        this.c = dlpwVar;
        this.e = executor;
        this.g = bool;
    }

    @Override // defpackage.ektx
    public final ListenableFuture a(Set set, long j, Map map) {
        if (!this.g.booleanValue()) {
            return erre.a;
        }
        ((enrr) ((enrr) a.h()).h("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerOneTimeScheduler", "scheduleNextSyncSystemWakeup", 83, "SyncWorkManagerOneTimeScheduler.java")).q("Scheduling next onetime WorkManager workers");
        return erny.g(this.d.a(set, j, map), eldl.d(new eroh() { // from class: ekuv
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                Map map2 = (Map) obj;
                if (map2.isEmpty()) {
                    return erre.a;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = map2.entrySet().iterator();
                while (it.hasNext()) {
                    ekuy ekuyVar = ekuy.this;
                    final ektw ektwVar = (ektw) ((Map.Entry) it.next()).getValue();
                    boolean z = false;
                    boolean z2 = false;
                    boolean z3 = false;
                    for (ekrk ekrkVar : ektwVar.c()) {
                        boolean z4 = true;
                        z |= ekrkVar == ekrk.ON_CHARGER;
                        z3 |= ekrkVar == ekrk.ON_NETWORK_CONNECTED;
                        if (ekrkVar != ekrk.ON_NETWORK_UNMETERED) {
                            z4 = false;
                        }
                        z2 |= z4;
                    }
                    poh pohVar = new poh();
                    pohVar.a = z;
                    if (z2) {
                        pohVar.c(3);
                    } else if (z3) {
                        pohVar.c(2);
                    }
                    poj a2 = pohVar.a();
                    Set c = ektwVar.c();
                    StringBuilder sb = new StringBuilder(ejnz.a("SyncTask", ekuyVar.b()));
                    Iterator it2 = new TreeSet(c).iterator();
                    while (it2.hasNext()) {
                        sb.append(((ekrk) it2.next()).d);
                        sb.append('_');
                    }
                    String sb2 = sb.toString();
                    ejnw ejnwVar = new ejnw(Math.max(0L, ektwVar.a() - ekuyVar.c.f().toEpochMilli()), TimeUnit.MILLISECONDS);
                    ekuyVar.b();
                    ejoe n = ejoi.n(ekuh.class);
                    ((ejnt) n).c = ejnwVar;
                    n.g(new ejnx(sb2, poz.REPLACE));
                    n.d(a2);
                    n.f(new enpx("com.google.apps.tiktok.sync.impl.workmanager.SyncWorker"));
                    arrayList.add(erny.f(ekuyVar.b.c(n.h()), eldl.a(new emwl() { // from class: ekux
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            enrr enrrVar = (enrr) ((enrr) ekuy.a.e()).h("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerOneTimeScheduler", "scheduleWorker", 120, "SyncWorkManagerOneTimeScheduler.java");
                            ektw ektwVar2 = ektw.this;
                            enrrVar.C("Scheduled worker: %s at %s", ektwVar2.c(), ektwVar2.a());
                            return null;
                        }
                    }), erpp.a));
                }
                return erqt.c(arrayList).a(eldl.m(new Callable() { // from class: ekuw
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ((enrr) ((enrr) ekuy.a.h()).h("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerOneTimeScheduler", "scheduleNextSyncSystemWakeup", 102, "SyncWorkManagerOneTimeScheduler.java")).q("Successfully scheduled next onetime workers");
                        return null;
                    }
                }), erpp.a);
            }
        }), this.e);
    }

    final emxc b() {
        this.f.booleanValue();
        return emux.a;
    }
}
