package defpackage;

import j$.time.Duration;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akag implements ajys {
    public static final enru a = enru.c("com/google/android/apps/messaging/restore/impl/BasicRestoreWorkflowSteps");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffhd g;
    public final ffbr h;
    public final ffbr i;
    public final ffsk j;
    public final ajwe k;
    private final ffbr l;

    public akag(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffhd ffhdVar, ffbr ffbrVar6, ffbr ffbrVar7, ffsk ffskVar, ajwe ajweVar, ffbr ffbrVar8) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffhdVar.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        ffskVar.getClass();
        ffbrVar8.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.f = ffbrVar5;
        this.g = ffhdVar;
        this.h = ffbrVar6;
        this.i = ffbrVar7;
        this.j = ffskVar;
        this.k = ajweVar;
        this.l = ffbrVar8;
    }

    static /* synthetic */ Duration l(akag akagVar, eqza eqzaVar, UUID uuid) {
        return akagVar.n(eqzaVar, uuid, true);
    }

    private final Duration n(eqza eqzaVar, UUID uuid, boolean z) {
        return ajyw.d((ajyw) this.i.b(), eqzaVar, uuid, 1, z, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(int i, eqys eqysVar) {
        ajyw.e((ajyw) this.i.b(), eqza.REQUEST_RESTORE_AFTER_APP_UPDATE, i, null, eqysVar, 12);
    }

    @Override // defpackage.ajys
    public final int a() {
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:33:0x005e, B:34:0x00c1, B:36:0x00c5, B:40:0x00ce, B:41:0x00dc, B:49:0x00ff, B:50:0x0111), top: B:32:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011a A[Catch: all -> 0x0183, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0183, blocks: (B:44:0x011a, B:48:0x0155, B:55:0x0070, B:57:0x0078, B:58:0x007d, B:60:0x009a), top: B:54:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0155 A[Catch: all -> 0x0183, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0183, blocks: (B:44:0x011a, B:48:0x0155, B:55:0x0070, B:57:0x0078, B:58:0x007d, B:60:0x009a), top: B:54:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:33:0x005e, B:34:0x00c1, B:36:0x00c5, B:40:0x00ce, B:41:0x00dc, B:49:0x00ff, B:50:0x0111), top: B:32:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // defpackage.ajys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.UUID r21, defpackage.akci r22, defpackage.ffgu r23) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akag.b(java.util.UUID, akci, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.ajys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.UUID r9, defpackage.ffgu r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.ajzk
            if (r0 == 0) goto L13
            r0 = r10
            ajzk r0 = (defpackage.ajzk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ajzk r0 = new ajzk
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            ekzz r9 = r0.d
            defpackage.ffci.b(r10)     // Catch: java.lang.Throwable -> L2a
            goto L5f
        L2a:
            r10 = move-exception
            goto L6e
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            defpackage.ffci.b(r10)
            java.lang.String r10 = "BasicRestoreWorkflowSteps#doAttachmentRestore"
            ekzz r10 = defpackage.eleg.f(r10)
            ffkz r2 = new ffkz     // Catch: java.lang.Throwable -> L6a
            r2.<init>()     // Catch: java.lang.Throwable -> L6a
            eqza r5 = defpackage.eqza.DO_ATTACHMENTS_RESTORE     // Catch: java.lang.Throwable -> L6a
            l(r8, r5, r9)     // Catch: java.lang.Throwable -> L6a
            ffhd r5 = r8.g     // Catch: java.lang.Throwable -> L6a
            ffhd r5 = defpackage.ekxi.a(r5)     // Catch: java.lang.Throwable -> L6a
            ajzm r6 = new ajzm     // Catch: java.lang.Throwable -> L6a
            r6.<init>(r3, r8, r9, r2)     // Catch: java.lang.Throwable -> L6a
            r0.d = r10     // Catch: java.lang.Throwable -> L6a
            r0.c = r4     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r9 = defpackage.ffra.a(r5, r6, r0)     // Catch: java.lang.Throwable -> L6a
            if (r9 == r1) goto L69
            r7 = r10
            r10 = r9
            r9 = r7
        L5f:
            ffpw r10 = (defpackage.ffpw) r10     // Catch: java.lang.Throwable -> L2a
            long r0 = r10.c     // Catch: java.lang.Throwable -> L2a
            defpackage.ffig.a(r9, r3)
            ffcu r9 = defpackage.ffcu.a
            return r9
        L69:
            return r1
        L6a:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L6e:
            throw r10     // Catch: java.lang.Throwable -> L6f
        L6f:
            r0 = move-exception
            defpackage.ffig.a(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akag.c(java.util.UUID, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.ajys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.UUID r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.ajzn
            if (r0 == 0) goto L13
            r0 = r9
            ajzn r0 = (defpackage.ajzn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ajzn r0 = new ajzn
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            ekzz r8 = r0.d
            defpackage.ffci.b(r9)     // Catch: java.lang.Throwable -> L2a
            goto L5b
        L2a:
            r9 = move-exception
            goto L6a
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            defpackage.ffci.b(r9)
            java.lang.String r9 = "BasicRestoreWorkflowSteps#doBugleDbRestore"
            ekzz r9 = defpackage.eleg.f(r9)
            eqza r2 = defpackage.eqza.DO_BUGLE_DATABASE_RESTORE     // Catch: java.lang.Throwable -> L66
            r5 = 0
            r7.n(r2, r8, r5)     // Catch: java.lang.Throwable -> L66
            ffhd r2 = r7.g     // Catch: java.lang.Throwable -> L66
            ffhd r2 = defpackage.ekxi.a(r2)     // Catch: java.lang.Throwable -> L66
            ajzq r5 = new ajzq     // Catch: java.lang.Throwable -> L66
            r5.<init>(r3, r7, r8)     // Catch: java.lang.Throwable -> L66
            r0.d = r9     // Catch: java.lang.Throwable -> L66
            r0.c = r4     // Catch: java.lang.Throwable -> L66
            java.lang.Object r8 = defpackage.ffra.a(r2, r5, r0)     // Catch: java.lang.Throwable -> L66
            if (r8 == r1) goto L65
            r6 = r9
            r9 = r8
            r8 = r6
        L5b:
            ffpw r9 = (defpackage.ffpw) r9     // Catch: java.lang.Throwable -> L2a
            long r0 = r9.c     // Catch: java.lang.Throwable -> L2a
            defpackage.ffig.a(r8, r3)
            ffcu r8 = defpackage.ffcu.a
            return r8
        L65:
            return r1
        L66:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L6a:
            throw r9     // Catch: java.lang.Throwable -> L6b
        L6b:
            r0 = move-exception
            defpackage.ffig.a(r8, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akag.d(java.util.UUID, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.ajys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.util.UUID r12, defpackage.akci r13, defpackage.ffgu r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.ajzr
            if (r0 == 0) goto L13
            r0 = r14
            ajzr r0 = (defpackage.ajzr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ajzr r0 = new ajzr
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.util.UUID r12 = r0.e
            akag r13 = r0.d
            defpackage.ffci.b(r14)
            goto L4e
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            defpackage.ffci.b(r14)
            bbhj r14 = defpackage.bbhj.a
            ajzs r2 = new ajzs
            r4 = 0
            r2.<init>(r11, r12, r13, r4)
            r0.d = r11
            r0.e = r12
            r0.c = r3
            java.lang.String r13 = "BasicRestoreWorkflowSteps#doCompleteRestore"
            java.lang.Object r14 = r14.a(r13, r2, r0)
            if (r14 != r1) goto L4d
            return r1
        L4d:
            r13 = r11
        L4e:
            r4 = r12
            ffpw r14 = (defpackage.ffpw) r14
            long r0 = r14.c
            ffbr r12 = r13.i
            java.lang.Object r12 = r12.b()
            r2 = r12
            ajyw r2 = (defpackage.ajyw) r2
            eqza r3 = defpackage.eqza.DO_COMPLETE_RESTORE
            long r12 = defpackage.ffpw.h(r0)
            int r14 = defpackage.ffpw.d(r0)
            long r0 = (long) r14
            j$.time.Duration r9 = j$.time.Duration.ofSeconds(r12, r0)
            r9.getClass()
            r10 = 188(0xbc, float:2.63E-43)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            defpackage.ajyw.b(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            ffcu r12 = defpackage.ffcu.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akag.e(java.util.UUID, akci, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.ajys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.util.UUID r12, defpackage.akdb r13, defpackage.ffgu r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.ajzx
            if (r0 == 0) goto L13
            r0 = r14
            ajzx r0 = (defpackage.ajzx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ajzx r0 = new ajzx
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            akdb r13 = r0.f
            java.util.UUID r12 = r0.e
            akag r0 = r0.d
            defpackage.ffci.b(r14)
            goto L52
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            defpackage.ffci.b(r14)
            bbhj r14 = defpackage.bbhj.a
            ajzy r2 = new ajzy
            r4 = 0
            r2.<init>(r12, r11, r13, r4)
            r0.d = r11
            r0.e = r12
            r0.f = r13
            r0.c = r3
            java.lang.String r3 = "BasicRestoreWorkflowSteps#initializeRestore"
            java.lang.Object r14 = r14.a(r3, r2, r0)
            if (r14 != r1) goto L51
            return r1
        L51:
            r0 = r11
        L52:
            r4 = r12
            r8 = r13
            ffpw r14 = (defpackage.ffpw) r14
            long r12 = r14.c
            ffbr r14 = r0.i
            java.lang.Object r14 = r14.b()
            r2 = r14
            ajyw r2 = (defpackage.ajyw) r2
            eqza r3 = defpackage.eqza.INITIALIZE_RESTORE_WORKFLOW
            long r0 = defpackage.ffpw.h(r12)
            int r12 = defpackage.ffpw.d(r12)
            long r12 = (long) r12
            j$.time.Duration r9 = j$.time.Duration.ofSeconds(r0, r12)
            r9.getClass()
            r10 = 156(0x9c, float:2.19E-43)
            r5 = 0
            r6 = 0
            r7 = 0
            defpackage.ajyw.b(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            ffcu r12 = defpackage.ffcu.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akag.f(java.util.UUID, akdb, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.ajys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.util.UUID r18, java.io.File r19, defpackage.sny r20, defpackage.ffgu r21) {
        /*
            r17 = this;
            r3 = r17
            r2 = r18
            r0 = r21
            boolean r1 = r0 instanceof defpackage.ajzz
            if (r1 == 0) goto L19
            r1 = r0
            ajzz r1 = (defpackage.ajzz) r1
            int r4 = r1.c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r1.c = r4
            goto L1e
        L19:
            ajzz r1 = new ajzz
            r1.<init>(r3, r0)
        L1e:
            r6 = r1
            java.lang.Object r0 = r6.a
            ffhh r7 = defpackage.ffhh.a
            int r1 = r6.c
            r8 = 1
            if (r1 == 0) goto L43
            if (r1 != r8) goto L3b
            j$.time.Duration r1 = r6.f
            ekzz r2 = r6.g
            java.util.UUID r4 = r6.e
            akag r5 = r6.d
            defpackage.ffci.b(r0)     // Catch: java.lang.Throwable -> L38
            r14 = r1
            r13 = r4
            goto L76
        L38:
            r0 = move-exception
            r1 = r0
            goto L92
        L3b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L43:
            defpackage.ffci.b(r0)
            java.lang.String r0 = "BasicRestoreWorkflowSteps#requestAttachmentRestore"
            ekzz r9 = defpackage.eleg.f(r0)
            eqza r0 = defpackage.eqza.REQUEST_ATTACHMENTS_RESTORE     // Catch: java.lang.Throwable -> L8f
            j$.time.Duration r10 = l(r3, r0, r2)     // Catch: java.lang.Throwable -> L8f
            ffhd r0 = r3.g     // Catch: java.lang.Throwable -> L8f
            ffhd r11 = defpackage.ekxi.a(r0)     // Catch: java.lang.Throwable -> L8f
            akaa r0 = new akaa     // Catch: java.lang.Throwable -> L8f
            r1 = 0
            r4 = r19
            r5 = r20
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L8f
            r6.d = r3     // Catch: java.lang.Throwable -> L8f
            r6.e = r2     // Catch: java.lang.Throwable -> L8f
            r6.g = r9     // Catch: java.lang.Throwable -> L8f
            r6.f = r10     // Catch: java.lang.Throwable -> L8f
            r6.c = r8     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r0 = defpackage.ffra.a(r11, r0, r6)     // Catch: java.lang.Throwable -> L8f
            if (r0 == r7) goto L8e
            r13 = r2
            r5 = r3
            r2 = r9
            r14 = r10
        L76:
            ffbr r0 = r5.i     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.b()     // Catch: java.lang.Throwable -> L38
            r11 = r0
            ajyw r11 = (defpackage.ajyw) r11     // Catch: java.lang.Throwable -> L38
            eqza r12 = defpackage.eqza.REQUEST_ATTACHMENTS_RESTORE     // Catch: java.lang.Throwable -> L38
            r15 = 0
            r16 = 248(0xf8, float:3.48E-43)
            defpackage.ajyw.c(r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L38
            r0 = 0
            defpackage.ffig.a(r2, r0)
            ffcu r0 = defpackage.ffcu.a
            return r0
        L8e:
            return r7
        L8f:
            r0 = move-exception
            r1 = r0
            r2 = r9
        L92:
            throw r1     // Catch: java.lang.Throwable -> L93
        L93:
            r0 = move-exception
            defpackage.ffig.a(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akag.g(java.util.UUID, java.io.File, sny, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.ajys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.util.UUID r18, java.io.File r19, defpackage.som r20, defpackage.ffgu r21) {
        /*
            r17 = this;
            r3 = r17
            r2 = r18
            r0 = r21
            boolean r1 = r0 instanceof defpackage.akab
            if (r1 == 0) goto L19
            r1 = r0
            akab r1 = (defpackage.akab) r1
            int r4 = r1.c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r1.c = r4
            goto L1e
        L19:
            akab r1 = new akab
            r1.<init>(r3, r0)
        L1e:
            r6 = r1
            java.lang.Object r0 = r6.a
            ffhh r7 = defpackage.ffhh.a
            int r1 = r6.c
            r8 = 1
            if (r1 == 0) goto L43
            if (r1 != r8) goto L3b
            j$.time.Duration r1 = r6.f
            ekzz r2 = r6.g
            java.util.UUID r4 = r6.e
            akag r5 = r6.d
            defpackage.ffci.b(r0)     // Catch: java.lang.Throwable -> L38
            r14 = r1
            r13 = r4
            goto L76
        L38:
            r0 = move-exception
            r1 = r0
            goto L92
        L3b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L43:
            defpackage.ffci.b(r0)
            java.lang.String r0 = "BasicRestoreWorkflowSteps#requestBugleDbRestore"
            ekzz r9 = defpackage.eleg.f(r0)
            eqza r0 = defpackage.eqza.REQUEST_BUGLE_DATABASE_RESTORE     // Catch: java.lang.Throwable -> L8f
            j$.time.Duration r10 = l(r3, r0, r2)     // Catch: java.lang.Throwable -> L8f
            ffhd r0 = r3.g     // Catch: java.lang.Throwable -> L8f
            ffhd r11 = defpackage.ekxi.a(r0)     // Catch: java.lang.Throwable -> L8f
            akad r0 = new akad     // Catch: java.lang.Throwable -> L8f
            r1 = 0
            r4 = r19
            r5 = r20
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L8f
            r6.d = r3     // Catch: java.lang.Throwable -> L8f
            r6.e = r2     // Catch: java.lang.Throwable -> L8f
            r6.g = r9     // Catch: java.lang.Throwable -> L8f
            r6.f = r10     // Catch: java.lang.Throwable -> L8f
            r6.c = r8     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r0 = defpackage.ffra.a(r11, r0, r6)     // Catch: java.lang.Throwable -> L8f
            if (r0 == r7) goto L8e
            r13 = r2
            r5 = r3
            r2 = r9
            r14 = r10
        L76:
            ffbr r0 = r5.i     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.b()     // Catch: java.lang.Throwable -> L38
            r11 = r0
            ajyw r11 = (defpackage.ajyw) r11     // Catch: java.lang.Throwable -> L38
            eqza r12 = defpackage.eqza.REQUEST_BUGLE_DATABASE_RESTORE     // Catch: java.lang.Throwable -> L38
            r15 = 0
            r16 = 248(0xf8, float:3.48E-43)
            defpackage.ajyw.c(r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L38
            r0 = 0
            defpackage.ffig.a(r2, r0)
            ffcu r0 = defpackage.ffcu.a
            return r0
        L8e:
            return r7
        L8f:
            r0 = move-exception
            r1 = r0
            r2 = r9
        L92:
            throw r1     // Catch: java.lang.Throwable -> L93
        L93:
            r0 = move-exception
            defpackage.ffig.a(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akag.h(java.util.UUID, java.io.File, som, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x01f6: INVOKE (r15 I:java.io.Closeable), (r2 I:java.lang.Throwable) STATIC call: ffig.a(java.io.Closeable, java.lang.Throwable):void A[MD:(java.io.Closeable, java.lang.Throwable):void (m)] (LINE:503), block:B:64:0x01f6 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0187 A[Catch: all -> 0x01f2, TryCatch #0 {all -> 0x01f2, blocks: (B:12:0x003f, B:14:0x017f, B:16:0x0187, B:19:0x00e5, B:21:0x00eb, B:23:0x00f7, B:25:0x0110, B:29:0x013c, B:31:0x0144, B:32:0x015f, B:40:0x01a1, B:44:0x005e, B:47:0x0072, B:49:0x0080, B:52:0x00a2, B:54:0x00c0, B:57:0x00e0), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00eb A[Catch: all -> 0x01f2, TryCatch #0 {all -> 0x01f2, blocks: (B:12:0x003f, B:14:0x017f, B:16:0x0187, B:19:0x00e5, B:21:0x00eb, B:23:0x00f7, B:25:0x0110, B:29:0x013c, B:31:0x0144, B:32:0x015f, B:40:0x01a1, B:44:0x005e, B:47:0x0072, B:49:0x0080, B:52:0x00a2, B:54:0x00c0, B:57:0x00e0), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0144 A[Catch: all -> 0x01f2, TryCatch #0 {all -> 0x01f2, blocks: (B:12:0x003f, B:14:0x017f, B:16:0x0187, B:19:0x00e5, B:21:0x00eb, B:23:0x00f7, B:25:0x0110, B:29:0x013c, B:31:0x0144, B:32:0x015f, B:40:0x01a1, B:44:0x005e, B:47:0x0072, B:49:0x0080, B:52:0x00a2, B:54:0x00c0, B:57:0x00e0), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015f A[Catch: all -> 0x01f2, TryCatch #0 {all -> 0x01f2, blocks: (B:12:0x003f, B:14:0x017f, B:16:0x0187, B:19:0x00e5, B:21:0x00eb, B:23:0x00f7, B:25:0x0110, B:29:0x013c, B:31:0x0144, B:32:0x015f, B:40:0x01a1, B:44:0x005e, B:47:0x0072, B:49:0x0080, B:52:0x00a2, B:54:0x00c0, B:57:0x00e0), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a1 A[Catch: all -> 0x01f2, TRY_LEAVE, TryCatch #0 {all -> 0x01f2, blocks: (B:12:0x003f, B:14:0x017f, B:16:0x0187, B:19:0x00e5, B:21:0x00eb, B:23:0x00f7, B:25:0x0110, B:29:0x013c, B:31:0x0144, B:32:0x015f, B:40:0x01a1, B:44:0x005e, B:47:0x0072, B:49:0x0080, B:52:0x00a2, B:54:0x00c0, B:57:0x00e0), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0144 -> B:18:0x00e5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x017c -> B:14:0x017f). Please report as a decompilation issue!!! */
    @Override // defpackage.ajys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.util.List r24, defpackage.ffgu r25) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akag.i(java.util.List, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.util.UUID r13, defpackage.ffgu r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.akaf
            if (r0 == 0) goto L13
            r0 = r14
            akaf r0 = (defpackage.akaf) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            akaf r0 = new akaf
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            engs r13 = r0.f
            java.lang.Object r2 = r0.a
            akag r4 = r0.e
            defpackage.ffci.b(r14)
            goto L5f
        L30:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L38:
            akag r13 = r0.e
            defpackage.ffci.b(r14)
            r4 = r13
            goto L55
        L3f:
            defpackage.ffci.b(r14)
            ffbr r14 = r12.b
            java.lang.Object r14 = r14.b()
            ajyr r14 = (defpackage.ajyr) r14
            r0.e = r12
            r0.d = r4
            java.lang.Object r14 = r14.m(r13, r0)
            if (r14 == r1) goto Ld3
            r4 = r12
        L55:
            r2 = r14
            engw r2 = (defpackage.engw) r2
            enqv r13 = r2.iterator()
            r13.getClass()
        L5f:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto Lc7
            java.lang.Object r14 = r13.next()
            r14.getClass()
            bxlk r14 = (defpackage.bxlk) r14
            akcg r5 = r14.l()
            java.lang.String r8 = r5.e
            r8.getClass()
            akcg r5 = r14.l()
            int r6 = r5.c
            r7 = 3
            if (r6 != r7) goto L85
            java.lang.Object r5 = r5.d
            akcb r5 = (defpackage.akcb) r5
            goto L87
        L85:
            akcb r5 = defpackage.akcb.a
        L87:
            long r5 = r5.c
            int r5 = (int) r5
            akcg r6 = r14.l()
            int r9 = r6.c
            if (r9 != r7) goto L97
            java.lang.Object r6 = r6.d
            akcb r6 = (defpackage.akcb) r6
            goto L99
        L97:
            akcb r6 = defpackage.akcb.a
        L99:
            long r10 = r6.e
            ffbr r6 = r4.d
            java.lang.Object r6 = r6.b()
            ajwb r6 = (defpackage.ajwb) r6
            ajwe r9 = r4.k
            r7 = r5
            r6.h(r7, r8, r9, r10)
            ffbr r5 = r4.b
            java.lang.Object r5 = r5.b()
            ajyr r5 = (defpackage.ajyr) r5
            long r6 = r14.k()
            r0.e = r4
            r0.a = r2
            r14 = r13
            engs r14 = (defpackage.engs) r14
            r0.f = r14
            r0.d = r3
            java.lang.Object r14 = r5.q(r6, r0)
            if (r14 != r1) goto L5f
            goto Ld3
        Lc7:
            engw r2 = (defpackage.engw) r2
            int r13 = r2.size()
            java.lang.Integer r14 = new java.lang.Integer
            r14.<init>(r13)
            return r14
        Ld3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akag.j(java.util.UUID, ffgu):java.lang.Object");
    }

    public final void k(eqza eqzaVar, UUID uuid) {
        ajyw.e((ajyw) this.i.b(), eqzaVar, 3, uuid, null, 24);
    }
}
