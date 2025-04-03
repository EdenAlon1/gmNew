package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfgt {
    public final cqoh d;
    public final cfdt e;
    public final ejoc f;
    public final cexi g;
    public final ffsk h;
    private final ceyw j;
    private final ffbr k;
    public static final cffy a = new cffy();
    private static final cskc i = cskc.g("BugleWorkQueue", "WorkQueueWorkManagerTableJanitorTask");
    public static final cfva b = cfvl.j(cfvl.b, "thorough_pwq_check_frequency", 0.0f);
    public static final Set c = fffi.d(pqp.ENQUEUED, pqp.RUNNING, pqp.BLOCKED);

    public cfgt(cqoh cqohVar, ceyw ceywVar, cfdt cfdtVar, ejoc ejocVar, cexi cexiVar, ffbr ffbrVar, ffsk ffskVar, ffsk ffskVar2) {
        cqohVar.getClass();
        ceywVar.getClass();
        cfdtVar.getClass();
        ejocVar.getClass();
        cexiVar.getClass();
        ffbrVar.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        this.d = cqohVar;
        this.j = ceywVar;
        this.e = cfdtVar;
        this.f = ejocVar;
        this.g = cexiVar;
        this.k = ffbrVar;
        this.h = ffskVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cfgd
            if (r0 == 0) goto L13
            r0 = r6
            cfgd r0 = (defpackage.cfgd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cfgd r0 = new cfgd
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L42
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.ffci.b(r6)
            cffy r6 = defpackage.cfgt.a
            cfgg r2 = new cfgg
            r4 = 0
            r2.<init>(r5, r4)
            r0.c = r3
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 == r1) goto L6f
        L42:
            r0 = r6
            cfga r0 = (defpackage.cfga) r0
            java.util.Set r1 = r0.a
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L55
            cskc r0 = defpackage.cfgt.i
            java.lang.String r1 = "No queues have failed workmanager tasks"
            r0.p(r1)
            return r6
        L55:
            cskc r1 = defpackage.cfgt.i
            csjb r1 = r1.b()
            java.lang.String r2 = "Identified queues with failed workmanager tasks"
            r1.I(r2)
            java.util.Set r0 = r0.a
            int r0 = r0.size()
            java.lang.String r2 = "count"
            r1.y(r2, r0)
            r1.r()
            return r6
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfgt.a(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cfgh
            if (r0 == 0) goto L13
            r0 = r6
            cfgh r0 = (defpackage.cfgh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cfgh r0 = new cfgh
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L42
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.ffci.b(r6)
            cffy r6 = defpackage.cfgt.a
            cfgj r2 = new cfgj
            r4 = 0
            r2.<init>(r5, r4)
            r0.c = r3
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 == r1) goto L6f
        L42:
            r0 = r6
            cfga r0 = (defpackage.cfga) r0
            java.util.Set r1 = r0.a
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L55
            cskc r0 = defpackage.cfgt.i
            java.lang.String r1 = "No queues are missing from the work_queue_work_manager table"
            r0.p(r1)
            return r6
        L55:
            cskc r1 = defpackage.cfgt.i
            csjb r1 = r1.b()
            java.lang.String r2 = "Identified queues missing from the work_queue_work_manager table"
            r1.I(r2)
            java.util.Set r0 = r0.a
            int r0 = r0.size()
            java.lang.String r2 = "count"
            r1.y(r2, r0)
            r1.r()
            return r6
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfgt.b(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cfgk
            if (r0 == 0) goto L13
            r0 = r6
            cfgk r0 = (defpackage.cfgk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cfgk r0 = new cfgk
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L42
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.ffci.b(r6)
            cffy r6 = defpackage.cfgt.a
            cfgn r2 = new cfgn
            r4 = 0
            r2.<init>(r5, r4)
            r0.c = r3
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 == r1) goto L6f
        L42:
            r0 = r6
            cfga r0 = (defpackage.cfga) r0
            java.util.Set r1 = r0.a
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L55
            cskc r0 = defpackage.cfgt.i
            java.lang.String r1 = "No queues have null workmanager uuids"
            r0.p(r1)
            return r6
        L55:
            cskc r1 = defpackage.cfgt.i
            csjb r1 = r1.b()
            java.lang.String r2 = "Identified queues with null workmanager uuids"
            r1.I(r2)
            java.util.Set r0 = r0.a
            int r0 = r0.size()
            java.lang.String r2 = "count"
            r1.y(r2, r0)
            r1.r()
            return r6
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfgt.c(ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0110 A[LOOP:1: B:32:0x010a->B:34:0x0110, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0194 A[LOOP:3: B:48:0x018e->B:50:0x0194, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x022a A[LOOP:4: B:56:0x0224->B:58:0x022a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v49, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.cfgb r13, defpackage.ffgu r14) {
        /*
            Method dump skipped, instructions count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfgt.d(cfgb, ffgu):java.lang.Object");
    }
}
