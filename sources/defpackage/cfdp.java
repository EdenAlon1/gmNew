package defpackage;

import android.content.ContentValues;
import j$.util.DesugarDate;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Date;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfdp implements ceyw {
    private static final enru d = enru.c("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueWorkManagerScheduler");
    public final ceww a;
    public final ejoc b;
    public final cfdt c;
    private final cqoh e;
    private final ffbr f;
    private final ffbr g;
    private final dtuu h;
    private final ffbr i;
    private final ffsk j;
    private final ffsk k;
    private final asxc l;
    private final avdu m;
    private final cbwj n;

    public cfdp(cbwj cbwjVar, cqoh cqohVar, ceww cewwVar, ffbr ffbrVar, ffbr ffbrVar2, ejoc ejocVar, dtuu dtuuVar, cfdt cfdtVar, cetc cetcVar, ffbr ffbrVar3, ffsk ffskVar, ffsk ffskVar2, asxc asxcVar, avdu avduVar) {
        cbwjVar.getClass();
        cqohVar.getClass();
        cewwVar.getClass();
        ejocVar.getClass();
        dtuuVar.getClass();
        cfdtVar.getClass();
        cetcVar.getClass();
        ffbrVar3.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        this.n = cbwjVar;
        this.e = cqohVar;
        this.a = cewwVar;
        this.f = ffbrVar;
        this.g = ffbrVar2;
        this.b = ejocVar;
        this.h = dtuuVar;
        this.c = cfdtVar;
        this.i = ffbrVar3;
        this.j = ffskVar;
        this.k = ffskVar2;
        this.l = asxcVar;
        this.m = avduVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|24|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        r7 = defpackage.cfdp.d.g();
        r7.Y(defpackage.ente.a, "BugleWorkQueue");
        r7 = (defpackage.enrr) r7;
        r7.Y(defpackage.cflu.b, r8.q());
        ((defpackage.enrr) r7.h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueWorkManagerScheduler", "eagerlyLaunch", 163, "WorkQueueWorkManagerScheduler.kt")).q("Queue is already eagerly evaluating");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object k(defpackage.cfdp r7, defpackage.ceze r8, java.lang.Runnable r9, defpackage.cety r10, defpackage.ffgu r11) {
        /*
            boolean r0 = r11 instanceof defpackage.cfcu
            if (r0 == 0) goto L13
            r0 = r11
            cfcu r0 = (defpackage.cfcu) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cfcu r0 = new cfcu
            r0.<init>(r7, r11)
        L18:
            r6 = r0
            java.lang.Object r11 = r6.b
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.d
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            java.lang.Object r8 = r6.a
            defpackage.ffci.b(r11)     // Catch: defpackage.cfhy -> L58
            goto L55
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            defpackage.ffci.b(r11)
            ffbr r7 = r7.f     // Catch: defpackage.cfhy -> L58
            java.lang.Object r7 = r7.b()     // Catch: defpackage.cfhy -> L58
            r1 = r7
            cfim r1 = (defpackage.cfim) r1     // Catch: defpackage.cfhy -> L58
            r7 = r2
            java.lang.String r2 = r8.q()     // Catch: defpackage.cfhy -> L58
            r2.getClass()     // Catch: defpackage.cfhy -> L58
            cfhz r3 = defpackage.cfhz.b     // Catch: defpackage.cfhy -> L58
            r6.a = r8     // Catch: defpackage.cfhy -> L58
            r6.d = r7     // Catch: defpackage.cfhy -> L58
            r4 = r9
            r5 = r10
            java.lang.Object r11 = r1.e(r2, r3, r4, r5, r6)     // Catch: defpackage.cfhy -> L58
            if (r11 != r0) goto L55
            return r0
        L55:
            ppq r11 = (defpackage.ppq) r11     // Catch: defpackage.cfhy -> L58
            goto L85
        L58:
            enru r7 = defpackage.cfdp.d
            ensk r7 = r7.g()
            ensn r9 = defpackage.ente.a
            java.lang.String r10 = "BugleWorkQueue"
            r7.Y(r9, r10)
            enrr r7 = (defpackage.enrr) r7
            ensn r9 = defpackage.cflu.b
            ceze r8 = (defpackage.ceze) r8
            java.lang.String r8 = r8.q()
            r7.Y(r9, r8)
            java.lang.String r8 = "eagerlyLaunch"
            r9 = 163(0xa3, float:2.28E-43)
            java.lang.String r10 = "com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueWorkManagerScheduler"
            java.lang.String r11 = "WorkQueueWorkManagerScheduler.kt"
            ensk r7 = r7.h(r10, r8, r9, r11)
            enrr r7 = (defpackage.enrr) r7
            java.lang.String r8 = "Queue is already eagerly evaluating"
            r7.q(r8)
        L85:
            ffcu r7 = defpackage.ffcu.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfdp.k(cfdp, ceze, java.lang.Runnable, cety, ffgu):java.lang.Object");
    }

    @Override // defpackage.ceyw
    public final elfl a(ceze cezeVar) {
        elfl c;
        c = axol.c(i(), ffhe.a, ffsm.a, new cfdb(cezeVar, this, null));
        return c;
    }

    @Override // defpackage.ceyw
    public final elfl b(ceze cezeVar) {
        elfl c;
        c = axol.c(i(), ffhe.a, ffsm.a, new cfdc(this, cezeVar, null));
        return c;
    }

    @Override // defpackage.ceyw
    public final Optional c(ceze cezeVar) {
        ffss j = j(cezeVar);
        return Optional.of(ffra.b(i(), ekxi.a(ffhe.a), ffsm.b, new cfdg(null, j, this, cezeVar)));
    }

    @Override // defpackage.ceyw
    public final boolean d(String str, ceyv ceyvVar, UUID uuid) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        if (r8.c(r0) == r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r7v0, types: [ceze] */
    /* JADX WARN: Type inference failed for: r7v1, types: [erqf] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(final defpackage.ceze r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.cfde
            if (r0 == 0) goto L13
            r0 = r8
            cfde r0 = (defpackage.cfde) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cfde r0 = new cfde
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.a
            ffss r7 = (defpackage.ffss) r7
            defpackage.ffci.b(r8)     // Catch: java.util.concurrent.CancellationException -> L2e
            goto L80
        L2e:
            r8 = move-exception
            goto L73
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            java.lang.Object r7 = r0.a
            elfl r7 = (defpackage.elfl) r7
            defpackage.ffci.b(r8)     // Catch: java.util.concurrent.CancellationException -> L79
            goto L60
        L40:
            defpackage.ffci.b(r8)
            if (r7 == 0) goto L80
            cbwj r8 = r6.n
            cfcr r2 = new cfcr
            r2.<init>()
            java.lang.String r7 = "launchToWorkManager"
            elfl r7 = r8.a(r7, r2)
            r7.getClass()     // Catch: java.util.concurrent.CancellationException -> L79
            r0.a = r7     // Catch: java.util.concurrent.CancellationException -> L79
            r0.d = r4     // Catch: java.util.concurrent.CancellationException -> L79
            java.lang.Object r8 = defpackage.fgfz.c(r7, r0)     // Catch: java.util.concurrent.CancellationException -> L79
            if (r8 != r1) goto L60
            goto L6e
        L60:
            ffss r8 = (defpackage.ffss) r8     // Catch: java.util.concurrent.CancellationException -> L79
            if (r8 == 0) goto L80
            r0.a = r8     // Catch: java.util.concurrent.CancellationException -> L6f
            r0.d = r3     // Catch: java.util.concurrent.CancellationException -> L6f
            java.lang.Object r7 = r8.c(r0)     // Catch: java.util.concurrent.CancellationException -> L6f
            if (r7 != r1) goto L80
        L6e:
            return r1
        L6f:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L73:
            if (r7 == 0) goto L80
            r7.t(r8)
            goto L80
        L79:
            r8 = 0
            r7.cancel(r8)
            ppz r7 = defpackage.pqb.a
            return r7
        L80:
            ppz r7 = defpackage.pqb.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfdp.e(ceze, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(final java.lang.String r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cfdf
            if (r0 == 0) goto L13
            r0 = r6
            cfdf r0 = (defpackage.cfdf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cfdf r0 = new cfdf
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cfdp r5 = r0.d
            defpackage.ffci.b(r6)
            goto L50
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            cbwj r6 = r4.n
            cfco r2 = new cfco
            r2.<init>()
            java.lang.String r5 = "WorkQueueWorkManagerScheduler#removeQueueAssociation"
            elfl r5 = r6.b(r5, r2)
            r5.getClass()
            r0.d = r4
            r0.c = r3
            java.lang.Object r5 = defpackage.fgfz.c(r5, r0)
            if (r5 != r1) goto L4f
            return r1
        L4f:
            r5 = r4
        L50:
            ffbr r5 = r5.i
            java.lang.Object r5 = r5.b()
            akzt r5 = (defpackage.akzt) r5
            java.lang.String r6 = "Bugle.Pwq.ScheduledWorkManagerItems.Count"
            int r0 = defpackage.cfct.a()
            r5.e(r6, r0)
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfdp.f(java.lang.String, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0202 A[Catch: all -> 0x0045, TryCatch #2 {all -> 0x0045, blocks: (B:15:0x0040, B:16:0x01fe, B:18:0x0202, B:19:0x023d, B:20:0x023f), top: B:14:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x024e A[Catch: all -> 0x0066, TRY_LEAVE, TryCatch #4 {all -> 0x0066, blocks: (B:40:0x0061, B:41:0x019c, B:53:0x01e1, B:45:0x0244, B:47:0x024e, B:51:0x0298), top: B:7:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0298 A[Catch: all -> 0x0066, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x0066, blocks: (B:40:0x0061, B:41:0x019c, B:53:0x01e1, B:45:0x0244, B:47:0x024e, B:51:0x0298), top: B:7:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0197 A[Catch: all -> 0x0079, Exception -> 0x007d, cets -> 0x0081, TRY_LEAVE, TryCatch #8 {cets -> 0x0081, Exception -> 0x007d, all -> 0x0079, blocks: (B:58:0x0074, B:59:0x0166, B:61:0x0197), top: B:57:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v15, types: [ceze, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.ceze r20, defpackage.ceve r21, defpackage.ffgu r22) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfdp.g(ceze, ceve, ffgu):java.lang.Object");
    }

    public final Object h(ceve ceveVar, ceze cezeVar, cevc cevcVar, ffgu ffguVar) {
        boolean z = false;
        if (((Boolean) ((cfup) csgj.T.get()).e()).booleanValue() || this.m.a()) {
            if (cezeVar.s().getTime() <= this.e.f().toEpochMilli() && cevcVar != cevc.WORKMANAGER_ONLY) {
                cewk cewkVar = (cewk) this.g.b();
                poj pojVar = ((cetj) ceveVar.a()).a;
                if (pojVar == null) {
                    pojVar = poj.a;
                }
                return cewkVar.a(pojVar, ffguVar);
            }
        } else if (cezeVar.s().getTime() <= this.e.f().toEpochMilli()) {
            poj pojVar2 = ((cetj) ceveVar.a()).a;
            if (pojVar2 == null) {
                pojVar2 = poj.a;
            }
            if (ffkj.e(pojVar2, poj.a)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    public final ffsk i() {
        return this.l.a() ? this.k : this.j;
    }

    public final ffss j(ceze cezeVar) {
        int i;
        if (!this.h.i()) {
            throw new IllegalStateException("launchToWorkManagerInTransaction called outside a transaction");
        }
        ceve c = this.a.c(cezeVar.r());
        poj pojVar = ((cetj) c.a()).a;
        String q = cezeVar.q();
        q.getClass();
        Date s = cezeVar.s();
        String[] strArr = cfft.a;
        cffo cffoVar = new cffo(cfft.a);
        cffoVar.z("work_queue_work_manager_ids.queryOnQueue");
        cffoVar.q();
        cffs cffsVar = new cffs();
        cffsVar.b(q);
        cffoVar.k(new cffr(cffsVar));
        if (((cfdx) dtub.c(cffoVar.b())) != null) {
            i = 2;
        } else {
            if (!this.h.i()) {
                throw new IllegalStateException("Check failed.");
            }
            cfec cfecVar = new cfec();
            cfecVar.c(q);
            cfecVar.j(Optional.empty());
            cfecVar.i(DesugarDate.from(this.e.f()));
            if (s != null) {
                cfecVar.b(s);
            }
            if (pojVar != null) {
                cfecVar.g(pojVar.j - 1);
                cfecVar.e(pojVar.c);
                cfecVar.f(pojVar.d);
                cfecVar.d(pojVar.e);
                cfecVar.h(pojVar.f);
            }
            cfdx a = cfecVar.a(new Supplier() { // from class: cfea
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new cfdy();
                }
            });
            final dtve a2 = cfft.a();
            dtub.b(cfft.a(), "work_queue_work_manager_ids", a, new Function() { // from class: cfdv
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(dtve.this.S("work_queue_work_manager_ids", (ContentValues) obj));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Consumer() { // from class: cfdw
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            ((akzt) this.i.b()).e("Bugle.Pwq.ScheduledWorkManagerItems.Count", cfct.a());
            cfdt cfdtVar = this.c;
            synchronized (cfdtVar.a) {
                if (cfdtVar.b.isEmpty()) {
                    ffss ffssVar = cfdtVar.d;
                    if (ffssVar != null) {
                        ffssVar.t(null);
                    }
                    cfdtVar.d = null;
                }
                cfdtVar.b.add(q);
            }
            i = 1;
        }
        if (i - 1 == 0) {
            return ffra.b(i(), ekxi.a(ffhe.a), ffsm.b, new cfdd(null, this, cezeVar, c));
        }
        ensk g = d.g();
        g.Y(ente.a, "BugleWorkQueue");
        enrr enrrVar = (enrr) g;
        enrrVar.Y(cflu.d, cezeVar.r());
        enrrVar.Y(cflu.b, cezeVar.q());
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueWorkManagerScheduler", "launchToWorkManagerInTransaction$third_party_java_src_android_app_bugle_shared_java_com_google_android_apps_messaging_shared_datamodel_workqueue_work_queue_work_manager_scheduler_AUTO_DEPS_ORIGINAL", 280, "WorkQueueWorkManagerScheduler.kt")).q("Not launching WM work: Queue already has a scheduled task");
        return null;
    }
}
