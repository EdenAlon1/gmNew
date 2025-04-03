package com.google.android.apps.messaging.shared.datamodel.workqueue;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.android.apps.messaging.shared.datamodel.workqueue.WorkQueueWorkerShim;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.avdx;
import defpackage.cetl;
import defpackage.cexf;
import defpackage.cexg;
import defpackage.ceyv;
import defpackage.ceyw;
import defpackage.cfgy;
import defpackage.ekhw;
import defpackage.elbx;
import defpackage.eleg;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.emwl;
import defpackage.enru;
import defpackage.erpp;
import defpackage.fazb;
import defpackage.pot;
import defpackage.ppp;
import defpackage.ppr;
import j$.util.function.Function$CC;
import java.util.Date;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class WorkQueueWorkerShim extends ppr {
    public static final enru e = enru.c("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueWorkerShim");
    public final fazb f;
    private final fazb g;
    private final elbx h;
    private final cexg i;
    private final avdx j;

    /* compiled from: PG */
    public interface a {
        avdx aA();

        elbx b();

        cexg bT();

        fazb eY();

        fazb eZ();
    }

    public WorkQueueWorkerShim(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        a aVar = (a) ekhw.a(context, a.class);
        this.g = aVar.eZ();
        this.h = aVar.b();
        this.f = aVar.eY();
        this.i = aVar.bT();
        this.j = aVar.aA();
    }

    private static String c(pot potVar, String str, String str2) {
        String d = potVar.d(str);
        return d == null ? str2 : d;
    }

    @Override // defpackage.ppr
    public final /* synthetic */ ListenableFuture b() {
        AutoCloseable f;
        pot f2 = f();
        cexg cexgVar = this.i;
        synchronized (cexgVar.d) {
            cexgVar.e.add(new cexf(cexgVar.b.f().toEpochMilli(), 2, f2));
        }
        pot f3 = f();
        if (f3 == null) {
            return elfo.e(new ppp());
        }
        try {
            f = this.h.b("WorkQueueWorkerShim#startWork");
        } catch (IllegalStateException unused) {
            eleg.d();
            f = eleg.f("WorkQueueWorkerShim#startWork");
        }
        try {
            final String c = c(f3, "worker_type", "__UNKNOWN_TYPE");
            ((ceyw) this.f.b()).d(c, ceyv.NOT_SCHEDULED, g());
            elfl h = (this.j.a() ? ((cfgy) this.g.b()).a("WorkManager", new cetl(c(f3, "worker_type", "__UNKNOWN_TYPE"), c(f3, "handler_name", "__UNKNOWN_HANDLER"))) : ((cfgy) this.g.b()).b("WorkManager", c(f3, "worker_type", "__UNKNOWN_TYPE"))).h(new emwl() { // from class: cfin
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    ppp pppVar;
                    cfgx cfgxVar = (cfgx) obj;
                    ensk g = WorkQueueWorkerShim.e.g();
                    g.Y(ente.a, "BugleWorkQueue");
                    enrr enrrVar = (enrr) ((enrr) g).h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueWorkerShim", "startWork", 87, "WorkQueueWorkerShim.java");
                    final String str = c;
                    enrrVar.D("completed work for %s; retry status is %s", str, cfgxVar);
                    WorkQueueWorkerShim workQueueWorkerShim = WorkQueueWorkerShim.this;
                    if (cfgxVar != cfgx.CONTINUE) {
                        return cfgxVar == cfgx.RETRY ? new ppo() : new ppp();
                    }
                    cfba a2 = cfbf.a();
                    a2.z("recordWorkManagerWorkStarted");
                    a2.e(new Function() { // from class: cfio
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            cfbe cfbeVar = (cfbe) obj2;
                            cfbeVar.g(str);
                            Date date = new Date(0L);
                            int intValue = cfbf.c().intValue();
                            if (intValue < 46070) {
                                dtub.w("minimum_start_time", intValue);
                            }
                            cfbeVar.aq(new dtrt("work_queue.minimum_start_time", 1, Long.valueOf(bdgs.a(date))));
                            return cfbeVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    cfag cfagVar = (cfag) a2.b().o();
                    try {
                        ceze cezeVar = (ceze) cfagVar.cQ();
                        if (cezeVar == null) {
                            pppVar = new ppp();
                        } else {
                            try {
                                ((ceyw) workQueueWorkerShim.f.b()).b(cezeVar);
                                pppVar = new ppp();
                            } catch (ceuv e2) {
                                throw new AssertionError("Unhandled exception", e2);
                            }
                        }
                        cfagVar.close();
                        return pppVar;
                    } catch (Throwable th) {
                        try {
                            cfagVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }, erpp.a);
            f.close();
            return h;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
