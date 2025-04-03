package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.workqueue.WorkQueueWorkerShim;
import j$.time.Duration;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceza implements ceyw {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueSchedulerImpl");
    private final Context b;
    private final cqoh c;
    private final errl d;
    private final errl e;
    private final ffbr f;
    private final ffbr g;
    private final cfgz h;
    private final asxc i;
    private final avdx j;
    private final Map k = new HashMap();
    private final Object l = new Object();

    public ceza(Context context, cqoh cqohVar, errl errlVar, errl errlVar2, ffbr ffbrVar, ffbr ffbrVar2, cfgz cfgzVar, asxc asxcVar, avdx avdxVar) {
        this.b = context;
        this.c = cqohVar;
        this.d = errlVar;
        this.e = errlVar2;
        this.f = ffbrVar;
        this.g = ffbrVar2;
        this.h = cfgzVar;
        this.i = asxcVar;
        this.j = avdxVar;
    }

    @Override // defpackage.ceyw
    public final elfl a(ceze cezeVar) {
        String str;
        String str2;
        String str3;
        String q = cezeVar.q();
        String r = cezeVar.r();
        ensk g = a.g();
        g.Y(ente.a, "BugleWorkQueue");
        enrr enrrVar = (enrr) g;
        enrrVar.Y(cflu.c, Long.valueOf(cezeVar.l()));
        enrrVar.Y(cflu.d, r);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueSchedulerImpl", "launchExecutorAndWorkManager", 92, "WorkQueueSchedulerImpl.java")).q("launchExecutorAndWorkManager");
        if (cezeVar.s().getTime() == 0) {
            ceve c = ((ceww) this.g.b()).c(r);
            if (this.j.a()) {
                cfgz cfgzVar = this.h;
                cetl cetlVar = new cetl(q, r);
                cety a2 = c.a();
                a2.m();
                ensk g2 = cfgz.a.g();
                str2 = "com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueSchedulerImpl";
                g2.Y(ente.a, "BugleWorkQueue");
                enrr enrrVar2 = (enrr) g2;
                str3 = "WorkQueueSchedulerImpl.java";
                cetj cetjVar = (cetj) a2;
                str = r;
                enrrVar2.Y(cflu.g, cetjVar.b);
                ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueWorkerExecutor", "launch", 55, "WorkQueueWorkerExecutor.java")).q("launchExecutorAndWorkManager");
                cevc cevcVar = cetjVar.b;
                if (cevcVar != cevc.WORKMANAGER_ONLY) {
                    ensk g3 = cfgz.a.g();
                    g3.Y(ente.a, "BugleWorkQueue");
                    enrr enrrVar3 = (enrr) g3;
                    enrrVar3.Y(cflu.b, cetlVar.a);
                    ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueWorkerExecutor", "submit", 67, "WorkQueueWorkerExecutor.java")).q("submit to executor");
                    ((cexg) cfgzVar.c.b()).b(cetlVar.a);
                    cfgzVar.a(((cfgy) cfgzVar.b.b()).a("Executor", cetlVar), a2, cevcVar);
                }
            } else {
                str = r;
                str2 = "com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueSchedulerImpl";
                str3 = "WorkQueueSchedulerImpl.java";
                cfgz cfgzVar2 = this.h;
                cety a3 = c.a();
                a3.m();
                ensk g4 = cfgz.a.g();
                g4.Y(ente.a, "BugleWorkQueue");
                enrr enrrVar4 = (enrr) g4;
                cetj cetjVar2 = (cetj) a3;
                enrrVar4.Y(cflu.g, cetjVar2.b);
                ((enrr) enrrVar4.h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueWorkerExecutor", "launch", 42, "WorkQueueWorkerExecutor.java")).q("launchExecutorAndWorkManager");
                cevc cevcVar2 = cetjVar2.b;
                if (cevcVar2 != cevc.WORKMANAGER_ONLY) {
                    ensk g5 = cfgz.a.g();
                    g5.Y(ente.a, "BugleWorkQueue");
                    enrr enrrVar5 = (enrr) g5;
                    enrrVar5.Y(cflu.b, q);
                    ((enrr) enrrVar5.h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueWorkerExecutor", "submit", 73, "WorkQueueWorkerExecutor.java")).q("submit to executor");
                    ((cexg) cfgzVar2.c.b()).b(q);
                    cfgzVar2.a(((cfgy) cfgzVar2.b.b()).b("Executor", q), a3, cevcVar2);
                }
            }
        } else {
            str = r;
            str2 = "com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueSchedulerImpl";
            str3 = "WorkQueueSchedulerImpl.java";
        }
        try {
            return b(cezeVar);
        } catch (ceuv e) {
            ensk i = a.i();
            i.Y(ente.a, "BugleWorkQueue");
            enrr enrrVar6 = (enrr) i;
            enrrVar6.Y(cflu.d, str);
            ((enrr) enrrVar6.h(str2, "launchExecutorAndWorkManager", 107, str3)).q("dropping work due to scheduling exception");
            throw new IllegalStateException("found invalid row", e);
        }
    }

    @Override // defpackage.ceyw
    public final elfl b(final ceze cezeVar) {
        String str;
        final String q = cezeVar.q();
        if (q == null) {
            throw new ceuv();
        }
        final String r = cezeVar.r();
        try {
            cety a2 = ((ceww) this.g.b()).c(r).a();
            ppv ppvVar = new ppv(WorkQueueWorkerShim.class);
            ppvVar.d(q);
            if (cezeVar.s().getTime() > 0) {
                Duration ofMillis = Duration.ofMillis(cezeVar.s().getTime() - this.c.f().toEpochMilli());
                if (ofMillis.toMillis() > 0) {
                    ppvVar.i(ofMillis);
                }
            }
            if (this.j.a()) {
                pon ponVar = new pon();
                ponVar.e("worker_type", q);
                ponVar.e("handler_name", r);
                ppvVar.j(ponVar.a());
            } else {
                pon ponVar2 = new pon();
                ponVar2.e("worker_type", q);
                ppvVar.j(ponVar2.a());
            }
            cetj cetjVar = (cetj) a2;
            poj pojVar = cetjVar.a;
            if (pojVar != null) {
                ppvVar.g(pojVar);
            }
            if (pojVar == null || !pojVar.d) {
                ppvVar.f(cetjVar.f, cetjVar.e, TimeUnit.MILLISECONDS);
            }
            final ppw ppwVar = (ppw) ppvVar.b();
            if (cezeVar.s().getTime() == 0) {
                if (d(q, ceyv.SCHEDULED, ppwVar.a)) {
                    ensk g = a.g();
                    g.Y(ente.a, "BugleWorkQueue");
                    enrr enrrVar = (enrr) g;
                    enrrVar.Y(cflu.c, Long.valueOf(cezeVar.l()));
                    enrrVar.Y(cflu.b, q);
                    enrrVar.Y(cflu.d, r);
                    ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueSchedulerImpl", "launchToWorkManager", 225, "WorkQueueSchedulerImpl.java")).q("skipping wm scheduling");
                    String[] strArr = cfbf.a;
                    cfbc cfbcVar = new cfbc();
                    cfbcVar.ap("launchToWorkManager");
                    cfbcVar.d();
                    cfbcVar.c(cezeVar.l());
                    return elfo.e(pqb.a);
                }
            }
            ensk g2 = a.g();
            g2.Y(ente.a, "BugleWorkQueue");
            enrr enrrVar2 = (enrr) g2;
            enrrVar2.Y(cflu.c, Long.valueOf(cezeVar.l()));
            enrrVar2.Y(cflu.b, q);
            enrrVar2.Y(cflu.d, r);
            ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueSchedulerImpl", "launchToWorkManager", 239, "WorkQueueSchedulerImpl.java")).q("scheduling in wm");
            cexg cexgVar = (cexg) this.f.b();
            synchronized (cexgVar.d) {
                try {
                    cexgVar.e.add(new cexf(cexgVar.b.f().toEpochMilli(), 4, cezeVar));
                } catch (Throwable th) {
                    th = th;
                    while (true) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
            }
            pqs a3 = pqr.a(this.b);
            if (cezeVar.s().getTime() == 0) {
                str = "";
            } else {
                str = "-" + cezeVar.s().getTime();
            }
            elfl g3 = elfl.g(((pqc) a3.j(q.concat(str), ppa.APPEND_OR_REPLACE, ppwVar).a()).c);
            String[] strArr2 = cfbf.a;
            cfbc cfbcVar2 = new cfbc();
            cfbcVar2.ap("WorkQueueSchedulerImpl#launchToWorkManager1");
            Optional of = Optional.of(ppwVar.a);
            int intValue = cfbf.c().intValue();
            int intValue2 = cfbf.c().intValue();
            if (intValue2 < 46060) {
                dtub.w("workmanager_id", intValue2);
            }
            if (intValue >= 46060) {
                cfbcVar2.a.put("workmanager_id", bdhj.b(of));
            }
            cfbcVar2.c(cezeVar.l());
            return g3.h(new emwl() { // from class: ceyx
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    ppz ppzVar = (ppz) obj;
                    ensk g4 = ceza.a.g();
                    g4.Y(ente.a, "BugleWorkQueue");
                    enrr enrrVar3 = (enrr) g4;
                    ceze cezeVar2 = cezeVar;
                    enrrVar3.Y(cflu.c, Long.valueOf(cezeVar2.l()));
                    ensn ensnVar = cflu.b;
                    String str2 = q;
                    enrrVar3.Y(ensnVar, str2);
                    enrrVar3.Y(cflu.d, r);
                    ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueSchedulerImpl", "launchToWorkManager", 268, "WorkQueueSchedulerImpl.java")).q("confirmed from wm");
                    String[] strArr3 = cfbf.a;
                    cfbc cfbcVar3 = new cfbc();
                    cfbcVar3.ap("WorkQueueSchedulerImpl#launchToWorkManager2");
                    cfbcVar3.d();
                    cfbcVar3.c(cezeVar2.l());
                    ceza.this.d(str2, ceyv.PERSISTED, ppwVar.a);
                    return ppzVar;
                }
            }, this.i.a() ? this.e : this.d);
        } catch (IllegalArgumentException e) {
            throw new ceuv(e);
        }
    }

    @Override // defpackage.ceyw
    public final /* synthetic */ Optional c(ceze cezeVar) {
        return Optional.empty();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089 A[Catch: all -> 0x008e, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x004a, B:11:0x0058, B:13:0x005c, B:16:0x005e, B:22:0x008c, B:24:0x0075, B:26:0x0079, B:27:0x007f, B:29:0x0083, B:30:0x0089), top: B:3:0x0003 }] */
    @Override // defpackage.ceyw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(java.lang.String r7, defpackage.ceyv r8, java.util.UUID r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.l
            monitor-enter(r0)
            java.util.Map r1 = r6.k     // Catch: java.lang.Throwable -> L8e
            ceyy r2 = new ceyy     // Catch: java.lang.Throwable -> L8e
            r2.<init>()     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r1 = j$.util.Map.EL.computeIfAbsent(r1, r7, r2)     // Catch: java.lang.Throwable -> L8e
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L8e
            enru r2 = defpackage.ceza.a     // Catch: java.lang.Throwable -> L8e
            ensk r2 = r2.g()     // Catch: java.lang.Throwable -> L8e
            ensn r3 = defpackage.ente.a     // Catch: java.lang.Throwable -> L8e
            java.lang.String r4 = "BugleWorkQueue"
            r2.Y(r3, r4)     // Catch: java.lang.Throwable -> L8e
            enrr r2 = (defpackage.enrr) r2     // Catch: java.lang.Throwable -> L8e
            ensn r3 = defpackage.cflu.b     // Catch: java.lang.Throwable -> L8e
            r2.Y(r3, r7)     // Catch: java.lang.Throwable -> L8e
            ensn r7 = defpackage.cflu.e     // Catch: java.lang.Throwable -> L8e
            r2.Y(r7, r9)     // Catch: java.lang.Throwable -> L8e
            ensn r7 = defpackage.cflu.f     // Catch: java.lang.Throwable -> L8e
            r2.Y(r7, r8)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r7 = "com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueSchedulerImpl"
            java.lang.String r3 = "getAndSetScheduledInWorkManager"
            java.lang.String r4 = "WorkQueueSchedulerImpl.java"
            r5 = 126(0x7e, float:1.77E-43)
            ensk r7 = r2.h(r7, r3, r5, r4)     // Catch: java.lang.Throwable -> L8e
            enrr r7 = (defpackage.enrr) r7     // Catch: java.lang.Throwable -> L8e
            java.lang.String r2 = "set execution state"
            r7.q(r2)     // Catch: java.lang.Throwable -> L8e
            ceyv r7 = defpackage.ceyv.SCHEDULED     // Catch: java.lang.Throwable -> L8e
            boolean r7 = r1.containsValue(r7)     // Catch: java.lang.Throwable -> L8e
            r2 = 1
            if (r7 != 0) goto L55
            ceyv r7 = defpackage.ceyv.PERSISTED     // Catch: java.lang.Throwable -> L8e
            boolean r7 = r1.containsValue(r7)     // Catch: java.lang.Throwable -> L8e
            if (r7 == 0) goto L53
            goto L55
        L53:
            r7 = 0
            goto L56
        L55:
            r7 = r2
        L56:
            if (r7 == 0) goto L5e
            ceyv r3 = defpackage.ceyv.SCHEDULED     // Catch: java.lang.Throwable -> L8e
            if (r8 != r3) goto L5e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            return r2
        L5e:
            ceyz r3 = new ceyz     // Catch: java.lang.Throwable -> L8e
            r3.<init>()     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r3 = j$.util.Map.EL.computeIfAbsent(r1, r9, r3)     // Catch: java.lang.Throwable -> L8e
            ceyv r3 = (defpackage.ceyv) r3     // Catch: java.lang.Throwable -> L8e
            int r8 = r8.ordinal()     // Catch: java.lang.Throwable -> L8e
            if (r8 == 0) goto L89
            if (r8 == r2) goto L7f
            r2 = 2
            if (r8 == r2) goto L75
            goto L8c
        L75:
            ceyv r8 = defpackage.ceyv.SCHEDULED     // Catch: java.lang.Throwable -> L8e
            if (r3 != r8) goto L8c
            ceyv r8 = defpackage.ceyv.PERSISTED     // Catch: java.lang.Throwable -> L8e
            r1.put(r9, r8)     // Catch: java.lang.Throwable -> L8e
            goto L8c
        L7f:
            ceyv r8 = defpackage.ceyv.NOT_SCHEDULED     // Catch: java.lang.Throwable -> L8e
            if (r3 != r8) goto L8c
            ceyv r8 = defpackage.ceyv.SCHEDULED     // Catch: java.lang.Throwable -> L8e
            r1.put(r9, r8)     // Catch: java.lang.Throwable -> L8e
            goto L8c
        L89:
            r1.remove(r9)     // Catch: java.lang.Throwable -> L8e
        L8c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            return r7
        L8e:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceza.d(java.lang.String, ceyv, java.util.UUID):boolean");
    }
}
