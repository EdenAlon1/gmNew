package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdhw implements cdhe {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/delayedincrementalbackup/IncrementalWorkDelegateImpl");
    public static final cfup b = cfvl.k(cfvl.b, "cms_delayed_incremental_batch_size", 1);
    private static final cfup e = cfvl.l(cfvl.b, "cms_delayed_incremental_media_retry_base_milli", 10000);
    public final cdhz c;
    public final dtuu d;
    private final ffhd f;
    private final cqoh g;
    private final Map h;
    private final cdoe i;

    public cdhw(ffhd ffhdVar, cqoh cqohVar, Map map, cdoe cdoeVar, cdhz cdhzVar, dtuu dtuuVar) {
        ffhdVar.getClass();
        cqohVar.getClass();
        map.getClass();
        cdoeVar.getClass();
        cdhzVar.getClass();
        dtuuVar.getClass();
        this.f = ffhdVar;
        this.g = cqohVar;
        this.h = map;
        this.i = cdoeVar;
        this.c = cdhzVar;
        this.d = dtuuVar;
    }

    private final bqmv h(boolean z, String str) {
        String[] strArr = bqon.a;
        bqna bqnaVar = new bqna();
        bqnaVar.i(5L);
        bqnaVar.h(z ? ccrk.a(33) : ccrk.a(17));
        bqnaVar.e(str);
        bqnaVar.d(true != z ? 1L : 0L);
        bqnaVar.f(this.g.f().toEpochMilli());
        bqnaVar.g(z ? 0L : this.g.f().toEpochMilli());
        bqmv a2 = bqnaVar.a();
        a2.getClass();
        return a2;
    }

    private final void i(bqmv bqmvVar) {
        long epochMilli = this.g.f().toEpochMilli();
        String[] strArr = bqon.a;
        bqok bqokVar = new bqok();
        bqokVar.a.put("attempt_count", Long.valueOf(bqmvVar.k() + 1));
        bqokVar.a.put("last_attempt_timestamp", Long.valueOf(epochMilli));
        long l = bqmvVar.l();
        bqom bqomVar = new bqom();
        bqomVar.aq(new dtwe("cms_incremental_events._id", 1, Long.valueOf(l)));
        bqokVar.aj(new bqol(bqomVar), "cms_incremental_events-buildAndUpdateForId");
    }

    private final void j(bqmv bqmvVar) {
        if (((int) bqmvVar.n()) != 5) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if ((((int) bqmvVar.m()) & ccrk.a(17)) == 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        i(bqmvVar);
    }

    @Override // defpackage.cdhe
    public final Object a(ffgu ffguVar) {
        Object a2 = ffra.a(this.f, new cdhn(this, null), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.bqmv r13, defpackage.ffgu r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.cdhj
            if (r0 == 0) goto L13
            r0 = r14
            cdhj r0 = (defpackage.cdhj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cdhj r0 = new cdhj
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            java.lang.String r3 = "applyDelayIfAny"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/delayedincrementalbackup/IncrementalWorkDelegateImpl"
            java.lang.String r5 = "IncrementalWorkDelegateImpl.kt"
            java.lang.String r6 = "BugleCms"
            r7 = 1
            if (r2 == 0) goto L37
            if (r2 != r7) goto L2f
            defpackage.ffci.b(r14)
            goto L79
        L2f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L37:
            defpackage.ffci.b(r14)
            long r8 = r13.k()
            r10 = 0
            int r14 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r14 <= 0) goto L93
            long r8 = r13.k()
            long r13 = r13.n()
            int r13 = (int) r13
            j$.time.Duration r13 = defpackage.cccm.a(r8, r13)
            enru r14 = defpackage.cdhw.a
            ensk r14 = r14.h()
            ensn r2 = defpackage.ente.a
            r14.Y(r2, r6)
            r2 = 206(0xce, float:2.89E-43)
            ensk r14 = r14.h(r4, r3, r2, r5)
            enrr r14 = (defpackage.enrr) r14
            long r8 = r13.toSeconds()
            java.lang.String r2 = "Backing off current work due to its previous failure, backoff delay(s) = %d"
            r14.s(r2, r8)
            long r13 = r13.toMillis()
            r0.c = r7
            java.lang.Object r13 = defpackage.ffsw.c(r13, r0)
            if (r13 == r1) goto L92
        L79:
            enru r13 = defpackage.cdhw.a
            ensk r13 = r13.h()
            ensn r14 = defpackage.ente.a
            r13.Y(r14, r6)
            r14 = 211(0xd3, float:2.96E-43)
            ensk r13 = r13.h(r4, r3, r14, r5)
            enrr r13 = (defpackage.enrr) r13
            java.lang.String r14 = "Resume work after backoff."
            r13.q(r14)
            goto L93
        L92:
            return r1
        L93:
            ffcu r13 = defpackage.ffcu.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdhw.b(bqmv, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r6, int r7, defpackage.ffgu r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.cdhk
            if (r0 == 0) goto L13
            r0 = r8
            cdhk r0 = (defpackage.cdhk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cdhk r0 = new cdhk
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r8)
            goto L66
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.ffci.b(r8)
            pon r8 = new pon
            r8.<init>()
            csgh r2 = defpackage.csgh.MEDIA
            int r2 = r2.e
            java.lang.String r4 = "media_upload_type_key"
            r8.g(r4, r2)
            java.lang.String r2 = "target_id_key"
            r8.e(r2, r6)
            java.lang.String r6 = "is_initial_sync"
            r2 = 0
            r8.f(r6, r2)
            java.lang.String r6 = "attempt_count_key"
            r8.g(r6, r7)
            cdoe r6 = r5.i
            pot r7 = r8.a()
            elfl r6 = r6.a(r7)
            r6.getClass()
            r0.c = r3
            java.lang.Object r8 = defpackage.fgfz.c(r6, r0)
            if (r8 != r1) goto L66
            return r1
        L66:
            r8.getClass()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdhw.c(java.lang.String, int, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0146 A[Catch: Exception -> 0x015b, TryCatch #0 {Exception -> 0x015b, blocks: (B:12:0x002d, B:13:0x0137, B:15:0x0146, B:18:0x0151), top: B:11:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0151 A[Catch: Exception -> 0x015b, TRY_LEAVE, TryCatch #0 {Exception -> 0x015b, blocks: (B:12:0x002d, B:13:0x0137, B:15:0x0146, B:18:0x0151), top: B:11:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d A[Catch: Exception -> 0x0044, TRY_LEAVE, TryCatch #3 {Exception -> 0x0044, blocks: (B:27:0x0040, B:28:0x006e, B:30:0x007d), top: B:26:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.bqmv r14, defpackage.ffgu r15) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdhw.d(bqmv, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.bqmv r10, defpackage.ffgu r11) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdhw.e(bqmv, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.ffsk r5, boolean r6, defpackage.ffgu r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.cdhq
            if (r0 == 0) goto L13
            r0 = r7
            cdhq r0 = (defpackage.cdhq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cdhq r0 = new cdhq
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r7)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r7)
            cdhu r7 = new cdhu
            r2 = 0
            r7.<init>(r6, r2)
            ffss r5 = defpackage.ekxl.c(r5, r7)
            r0.c = r3
            java.lang.Object r7 = r5.c(r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdhw.f(ffsk, boolean, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x013c, code lost:
    
        if (r0 != r3) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x013c -> B:11:0x013e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x015d -> B:14:0x0157). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.bqmv r17, defpackage.ccjf r18, defpackage.ffgu r19) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdhw.g(bqmv, ccjf, ffgu):java.lang.Object");
    }
}
