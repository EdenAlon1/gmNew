package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdhz {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/delayedincrementalbackup/MediaConstraintsCheck");
    private static final cfup b = cfvl.l(cfvl.b, "cms_delayed_incremental_media_constraint_check_period_milli", 60000);
    private final cdlo c;
    private final axkm d;
    private final cqoh e;
    private final fgjb f;
    private Instant g;
    private boolean h;

    public cdhz(cdlo cdloVar, axkm axkmVar, cqoh cqohVar) {
        axkmVar.getClass();
        cqohVar.getClass();
        this.c = cdloVar;
        this.d = axkmVar;
        this.e = cqohVar;
        this.f = new fgjf();
        Instant instant = Instant.EPOCH;
        instant.getClass();
        this.g = instant;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cdhx
            if (r0 == 0) goto L13
            r0 = r6
            cdhx r0 = (defpackage.cdhx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cdhx r0 = new cdhx
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            fgjf r1 = r0.e
            cdhz r0 = r0.d
            defpackage.ffci.b(r6)
            goto L4a
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            defpackage.ffci.b(r6)
            fgjb r6 = r5.f
            r0.d = r5
            r2 = r6
            fgjf r2 = (defpackage.fgjf) r2
            r0.e = r2
            r0.c = r3
            java.lang.Object r0 = r6.a(r4, r0)
            if (r0 == r1) goto L59
            r0 = r5
            r1 = r6
        L4a:
            j$.time.Instant r6 = j$.time.Instant.EPOCH     // Catch: java.lang.Throwable -> L54
            r0.g = r6     // Catch: java.lang.Throwable -> L54
            r1.b(r4)
            ffcu r6 = defpackage.ffcu.a
            return r6
        L54:
            r6 = move-exception
            r1.b(r4)
            throw r6
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdhz.a(ffgu):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(7:(2:3|(10:5|6|7|(1:(1:(1:(9:12|13|14|15|(1:29)|23|24|25|26)(2:34|35))(6:36|37|38|39|(8:41|15|(1:17)|29|23|24|25|26)|42))(1:50))(3:66|(1:68)|42)|51|52|(2:54|(1:56)(4:57|24|25|26))|58|(3:60|39|(0))|42))|51|52|(0)|58|(0)|42)|70|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0035, code lost:
    
        r12 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x007c A[Catch: all -> 0x00f4, Exception -> 0x00f7, TryCatch #5 {Exception -> 0x00f7, all -> 0x00f4, blocks: (B:52:0x0072, B:54:0x007c, B:58:0x00a0), top: B:51:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [cdhy, ffgu] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r12v4, types: [fgjb] */
    /* JADX WARN: Type inference failed for: r12v9, types: [cdlo] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [fgjb] */
    /* JADX WARN: Type inference failed for: r2v10, types: [fgjb] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [fgjb] */
    /* JADX WARN: Type inference failed for: r2v15, types: [fgjf] */
    /* JADX WARN: Type inference failed for: r2v16, types: [fgjf] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r12) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdhz.b(ffgu):java.lang.Object");
    }
}
