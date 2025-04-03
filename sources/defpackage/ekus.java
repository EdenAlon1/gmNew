package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekus implements ejny {
    public static final enru a = enru.c("com/google/apps/tiktok/sync/impl/workmanager/SyncPeriodicWorker");
    static final ejog b = new ejnw(1, TimeUnit.DAYS);
    public final ejoc c;
    public final ektx d;
    public final edyp e;
    public final errl f;
    private final eksc g;
    private final boolean h;

    public ekus(eksc ekscVar, ejoc ejocVar, ektx ektxVar, errl errlVar, edyp edypVar, boolean z) {
        this.g = ekscVar;
        this.c = ejocVar;
        this.d = ektxVar;
        this.f = errlVar;
        this.e = edypVar;
        this.h = z;
    }

    static String d(emxc emxcVar) {
        return "com.google.apps.tiktok.sync.impl.workmanager.SyncPeriodicWorker".concat("");
    }

    @Override // defpackage.ejok
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return ejoj.a();
    }

    @Override // defpackage.ejny, defpackage.ejok
    public final ListenableFuture b(final WorkerParameters workerParameters) {
        return !this.h ? c(workerParameters) : this.d instanceof ekve ? ernq.f(elfr.j(elfr.k(this.g.b(), new eroh() { // from class: ekuo
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ekus ekusVar = ekus.this;
                ekve ekveVar = (ekve) ekusVar.d;
                if (ekusVar.e.a()) {
                    WorkerParameters workerParameters2 = workerParameters;
                    if (!workerParameters2.c.contains(ekus.d(ekveVar.c()))) {
                        ((enrr) ((enrr) ekus.a.h()).h("com/google/apps/tiktok/sync/impl/workmanager/SyncPeriodicWorker", "maybeCancelThisWorkerIfItHasWrongMainProcessTag", 141, "SyncPeriodicWorker.java")).q("Cancelling Sync worker since it has the wrong tag");
                        return ekusVar.c.b(workerParameters2.a);
                    }
                }
                return erre.a;
            }
        }, this.f), new emwl() { // from class: ekup
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                enru enruVar = ekus.a;
                return new ppp();
            }
        }, erpp.a), Throwable.class, eldl.a(new emwl() { // from class: ekuq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                enru enruVar = ekus.a;
                return new ppo();
            }
        }), erpp.a) : elfr.k(this.g.a(), eldl.d(new eroh() { // from class: ekur
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ekus.this.c(workerParameters);
            }
        }), this.f);
    }

    public final ListenableFuture c(final WorkerParameters workerParameters) {
        return ejks.a(elfr.k(this.c.e((String) enjk.g(workerParameters.c, new emxg() { // from class: ekul
            @Override // defpackage.emxg
            public final boolean a(Object obj) {
                enru enruVar = ekus.a;
                return ((String) obj).startsWith("com.google.apps.tiktok.sync.impl.workmanager.SyncPeriodicWorker");
            }
        })), new eroh() { // from class: ekum
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (true) {
                    final WorkerParameters workerParameters2 = workerParameters;
                    final ekus ekusVar = ekus.this;
                    if (!it.hasNext()) {
                        return elfr.a(arrayList).b(new erog() { // from class: ekuk
                            @Override // defpackage.erog
                            public final ListenableFuture a() {
                                return ekus.this.c.b(workerParameters2.a);
                            }
                        }, ekusVar.f);
                    }
                    pqq pqqVar = (pqq) it.next();
                    if (!workerParameters2.a.equals(pqqVar.a)) {
                        arrayList.add(ekusVar.c.b(pqqVar.a));
                    }
                }
            }
        }, this.f), new Callable() { // from class: ekun
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new ppn();
            }
        }, erpp.a);
    }
}
