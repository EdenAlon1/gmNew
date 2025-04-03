package defpackage;

import j$.time.Duration;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akbo implements ajys {
    public static final enru a = enru.c("com/google/android/apps/messaging/restore/impl/RestoreAnytimeCompatibleRestoreWorkflowSteps");
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
    public final ffbr l;
    public final ayzx m;
    private final ffbr n;

    public akbo(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffhd ffhdVar, ffbr ffbrVar6, ffbr ffbrVar7, ffsk ffskVar, ajwe ajweVar, ffbr ffbrVar8, ffbr ffbrVar9, ayzy ayzyVar, ffbr ffbrVar10) {
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
        ffbrVar9.getClass();
        ffbrVar10.getClass();
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
        this.n = ffbrVar8;
        this.l = ffbrVar9;
        long j = ffpw.a;
        Object b = ffbrVar10.b();
        b.getClass();
        Duration ofSeconds = Duration.ofSeconds(ffpw.h(ffpy.e(((Number) b).longValue(), ffpz.d)), ffpw.d(r1));
        ofSeconds.getClass();
        cqoh cqohVar = (cqoh) ayzyVar.a.b();
        cqohVar.getClass();
        this.m = new ayzx(cqohVar, ofSeconds);
    }

    static /* synthetic */ Object o(akbo akboVar, eqza eqzaVar, UUID uuid, ffgu ffguVar) {
        return akboVar.q(eqzaVar, uuid, true, ffguVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(defpackage.eqza r8, java.util.UUID r9, boolean r10, defpackage.ffgu r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.akbg
            if (r0 == 0) goto L13
            r0 = r11
            akbg r0 = (defpackage.akbg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            akbg r0 = new akbg
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.util.UUID r8 = r0.f
            eqza r9 = r0.e
            akbo r10 = r0.d
            defpackage.ffci.b(r11)
            r6 = r9
            r9 = r8
            r8 = r6
            goto L4d
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            defpackage.ffci.b(r11)
            if (r10 == 0) goto L54
            r0.d = r7
            r0.e = r8
            r0.f = r9
            r0.c = r3
            java.lang.Object r11 = r7.k(r9, r0)
            if (r11 != r1) goto L4c
            return r1
        L4c:
            r10 = r7
        L4d:
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            goto L56
        L54:
            r11 = 5
            r10 = r7
        L56:
            r1 = r8
            r2 = r9
            ffbr r8 = r10.i
            java.lang.Object r8 = r8.b()
            r0 = r8
            ajyw r0 = (defpackage.ajyw) r0
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r11)
            r4 = 0
            r5 = 20
            j$.time.Duration r8 = defpackage.ajyw.d(r0, r1, r2, r3, r4, r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akbo.q(eqza, java.util.UUID, boolean, ffgu):java.lang.Object");
    }

    private final void r(eqza eqzaVar, UUID uuid) {
        ajyw.e((ajyw) this.i.b(), eqzaVar, 3, uuid, null, 24);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(int i, eqys eqysVar) {
        ajyw.e((ajyw) this.i.b(), eqza.REQUEST_RESTORE_AFTER_APP_UPDATE, i, null, eqysVar, 12);
    }

    @Override // defpackage.ajys
    public final int a() {
        return 5;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0122 A[Catch: all -> 0x0098, TryCatch #0 {all -> 0x0098, blocks: (B:39:0x011e, B:41:0x0122, B:46:0x012c, B:47:0x013a, B:50:0x017d, B:54:0x01ba, B:55:0x0166, B:56:0x0178, B:61:0x007f, B:64:0x00e0, B:66:0x00fa, B:71:0x0093), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017d A[Catch: all -> 0x0098, TRY_LEAVE, TryCatch #0 {all -> 0x0098, blocks: (B:39:0x011e, B:41:0x0122, B:46:0x012c, B:47:0x013a, B:50:0x017d, B:54:0x01ba, B:55:0x0166, B:56:0x0178, B:61:0x007f, B:64:0x00e0, B:66:0x00fa, B:71:0x0093), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ba A[Catch: all -> 0x0098, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0098, blocks: (B:39:0x011e, B:41:0x0122, B:46:0x012c, B:47:0x013a, B:50:0x017d, B:54:0x01ba, B:55:0x0166, B:56:0x0178, B:61:0x007f, B:64:0x00e0, B:66:0x00fa, B:71:0x0093), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0166 A[Catch: all -> 0x0098, TryCatch #0 {all -> 0x0098, blocks: (B:39:0x011e, B:41:0x0122, B:46:0x012c, B:47:0x013a, B:50:0x017d, B:54:0x01ba, B:55:0x0166, B:56:0x0178, B:61:0x007f, B:64:0x00e0, B:66:0x00fa, B:71:0x0093), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fa A[Catch: all -> 0x0098, TryCatch #0 {all -> 0x0098, blocks: (B:39:0x011e, B:41:0x0122, B:46:0x012c, B:47:0x013a, B:50:0x017d, B:54:0x01ba, B:55:0x0166, B:56:0x0178, B:61:0x007f, B:64:0x00e0, B:66:0x00fa, B:71:0x0093), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    @Override // defpackage.ajys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.UUID r24, defpackage.akci r25, defpackage.ffgu r26) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akbo.b(java.util.UUID, akci, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.ajys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.UUID r10, defpackage.ffgu r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.akam
            if (r0 == 0) goto L13
            r0 = r11
            akam r0 = (defpackage.akam) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            akam r0 = new akam
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4e
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r10 = r0.a
            java.io.Closeable r10 = (java.io.Closeable) r10
            defpackage.ffci.b(r11)     // Catch: java.lang.Throwable -> L2f
            goto L8e
        L2f:
            r11 = move-exception
            goto L9d
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            ffkz r10 = r0.f
            ekzz r2 = r0.g
            java.util.UUID r4 = r0.e
            java.lang.Object r6 = r0.a
            akbo r6 = (defpackage.akbo) r6
            defpackage.ffci.b(r11)     // Catch: java.lang.Throwable -> L4b
            r11 = r2
            r2 = r10
            r10 = r4
            goto L70
        L4b:
            r11 = move-exception
            r10 = r2
            goto L9d
        L4e:
            defpackage.ffci.b(r11)
            java.lang.String r11 = "RestoreAnytimeCompatibleRestoreWorkflowSteps#doAttachmentRestore"
            ekzz r11 = defpackage.eleg.f(r11)
            ffkz r2 = new ffkz     // Catch: java.lang.Throwable -> L99
            r2.<init>()     // Catch: java.lang.Throwable -> L99
            eqza r6 = defpackage.eqza.DO_ATTACHMENTS_RESTORE     // Catch: java.lang.Throwable -> L99
            r0.a = r9     // Catch: java.lang.Throwable -> L99
            r0.e = r10     // Catch: java.lang.Throwable -> L99
            r0.g = r11     // Catch: java.lang.Throwable -> L99
            r0.f = r2     // Catch: java.lang.Throwable -> L99
            r0.d = r4     // Catch: java.lang.Throwable -> L99
            java.lang.Object r4 = o(r9, r6, r10, r0)     // Catch: java.lang.Throwable -> L99
            if (r4 != r1) goto L6f
            goto L98
        L6f:
            r6 = r9
        L70:
            ffhd r4 = r6.g     // Catch: java.lang.Throwable -> L99
            ffhd r4 = defpackage.ekxi.a(r4)     // Catch: java.lang.Throwable -> L99
            akao r7 = new akao     // Catch: java.lang.Throwable -> L99
            r7.<init>(r5, r6, r10, r2)     // Catch: java.lang.Throwable -> L99
            r0.a = r11     // Catch: java.lang.Throwable -> L99
            r0.e = r5     // Catch: java.lang.Throwable -> L99
            r0.g = r5     // Catch: java.lang.Throwable -> L99
            r0.f = r5     // Catch: java.lang.Throwable -> L99
            r0.d = r3     // Catch: java.lang.Throwable -> L99
            java.lang.Object r10 = defpackage.ffra.a(r4, r7, r0)     // Catch: java.lang.Throwable -> L99
            if (r10 == r1) goto L98
            r8 = r11
            r11 = r10
            r10 = r8
        L8e:
            ffpw r11 = (defpackage.ffpw) r11     // Catch: java.lang.Throwable -> L2f
            long r0 = r11.c     // Catch: java.lang.Throwable -> L2f
            defpackage.ffig.a(r10, r5)
            ffcu r10 = defpackage.ffcu.a
            return r10
        L98:
            return r1
        L99:
            r10 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
        L9d:
            throw r11     // Catch: java.lang.Throwable -> L9e
        L9e:
            r0 = move-exception
            defpackage.ffig.a(r10, r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akbo.c(java.util.UUID, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.io.Closeable] */
    @Override // defpackage.ajys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.UUID r9, defpackage.ffgu r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.akap
            if (r0 == 0) goto L13
            r0 = r10
            akap r0 = (defpackage.akap) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            akap r0 = new akap
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L49
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r9 = r0.a
            java.io.Closeable r9 = (java.io.Closeable) r9
            defpackage.ffci.b(r10)     // Catch: java.lang.Throwable -> L2f
            goto L82
        L2f:
            r10 = move-exception
            goto L91
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            ekzz r9 = r0.f
            java.util.UUID r2 = r0.e
            java.lang.Object r4 = r0.a
            akbo r4 = (defpackage.akbo) r4
            defpackage.ffci.b(r10)     // Catch: java.lang.Throwable -> L2f
            r7 = r10
            r10 = r9
            r9 = r2
            r2 = r7
            goto L64
        L49:
            defpackage.ffci.b(r10)
            java.lang.String r10 = "RestoreAnytimeCompatibleRestoreWorkflowSteps#doBugleDbRestore"
            ekzz r10 = defpackage.eleg.f(r10)
            eqza r2 = defpackage.eqza.DO_BUGLE_DATABASE_RESTORE     // Catch: java.lang.Throwable -> L8d
            r0.a = r8     // Catch: java.lang.Throwable -> L8d
            r0.e = r9     // Catch: java.lang.Throwable -> L8d
            r0.f = r10     // Catch: java.lang.Throwable -> L8d
            r0.d = r4     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r2 = o(r8, r2, r9, r0)     // Catch: java.lang.Throwable -> L8d
            if (r2 != r1) goto L63
            goto L8c
        L63:
            r4 = r8
        L64:
            j$.time.Duration r2 = (j$.time.Duration) r2     // Catch: java.lang.Throwable -> L8d
            ffhd r2 = r4.g     // Catch: java.lang.Throwable -> L8d
            ffhd r2 = defpackage.ekxi.a(r2)     // Catch: java.lang.Throwable -> L8d
            akas r6 = new akas     // Catch: java.lang.Throwable -> L8d
            r6.<init>(r5, r4, r9)     // Catch: java.lang.Throwable -> L8d
            r0.a = r10     // Catch: java.lang.Throwable -> L8d
            r0.e = r5     // Catch: java.lang.Throwable -> L8d
            r0.f = r5     // Catch: java.lang.Throwable -> L8d
            r0.d = r3     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r9 = defpackage.ffra.a(r2, r6, r0)     // Catch: java.lang.Throwable -> L8d
            if (r9 == r1) goto L8c
            r7 = r10
            r10 = r9
            r9 = r7
        L82:
            ffpw r10 = (defpackage.ffpw) r10     // Catch: java.lang.Throwable -> L2f
            long r0 = r10.c     // Catch: java.lang.Throwable -> L2f
            defpackage.ffig.a(r9, r5)
            ffcu r9 = defpackage.ffcu.a
            return r9
        L8c:
            return r1
        L8d:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L91:
            throw r10     // Catch: java.lang.Throwable -> L92
        L92:
            r0 = move-exception
            defpackage.ffig.a(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akbo.d(java.util.UUID, ffgu):java.lang.Object");
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
            boolean r0 = r14 instanceof defpackage.akat
            if (r0 == 0) goto L13
            r0 = r14
            akat r0 = (defpackage.akat) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            akat r0 = new akat
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.util.UUID r12 = r0.e
            akbo r13 = r0.d
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
            akau r2 = new akau
            r4 = 0
            r2.<init>(r11, r12, r13, r4)
            r0.d = r11
            r0.e = r12
            r0.c = r3
            java.lang.String r13 = "RestoreAnytimeCompatibleRestoreWorkflowSteps#doCompleteRestore"
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akbo.e(java.util.UUID, akci, ffgu):java.lang.Object");
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
            boolean r0 = r14 instanceof defpackage.akbd
            if (r0 == 0) goto L13
            r0 = r14
            akbd r0 = (defpackage.akbd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            akbd r0 = new akbd
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
            akbo r0 = r0.d
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
            akbe r2 = new akbe
            r4 = 0
            r2.<init>(r11, r12, r13, r4)
            r0.d = r11
            r0.e = r12
            r0.f = r13
            r0.c = r3
            java.lang.String r3 = "RestoreAnytimeCompatibleRestoreWorkflowSteps#initializeRestore"
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akbo.f(java.util.UUID, akdb, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // defpackage.ajys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.util.UUID r19, java.io.File r20, defpackage.sny r21, defpackage.ffgu r22) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akbo.g(java.util.UUID, java.io.File, sny, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // defpackage.ajys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.util.UUID r19, java.io.File r20, defpackage.som r21, defpackage.ffgu r22) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akbo.h(java.util.UUID, java.io.File, som, ffgu):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|(3:(1:(1:(12:12|13|14|15|16|(1:18)(1:44)|19|20|(2:23|(1:25)(4:26|27|(3:29|30|(3:32|33|(4:35|19|20|(1:21))(2:36|(7:38|15|16|(0)(0)|19|20|(1:21)))))|39))|41|42|43)(2:54|55))(6:56|57|58|59|33|(0)(0)))(7:63|64|65|66|30|(0)|39)|48|49)(3:70|71|(3:73|74|75)(2:76|(3:78|79|80)(7:81|82|20|(1:21)|41|42|43)))))|85|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x023a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x023b, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01ce A[Catch: all -> 0x022f, TryCatch #4 {all -> 0x022f, blocks: (B:16:0x01c6, B:18:0x01ce, B:21:0x010b, B:23:0x0111, B:25:0x011d, B:27:0x0136, B:33:0x0180, B:35:0x0188, B:36:0x01a5, B:44:0x01e8), top: B:15:0x01c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0111 A[Catch: all -> 0x022f, TryCatch #4 {all -> 0x022f, blocks: (B:16:0x01c6, B:18:0x01ce, B:21:0x010b, B:23:0x0111, B:25:0x011d, B:27:0x0136, B:33:0x0180, B:35:0x0188, B:36:0x01a5, B:44:0x01e8), top: B:15:0x01c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0188 A[Catch: all -> 0x022f, TryCatch #4 {all -> 0x022f, blocks: (B:16:0x01c6, B:18:0x01ce, B:21:0x010b, B:23:0x0111, B:25:0x011d, B:27:0x0136, B:33:0x0180, B:35:0x0188, B:36:0x01a5, B:44:0x01e8), top: B:15:0x01c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a5 A[Catch: all -> 0x022f, TryCatch #4 {all -> 0x022f, blocks: (B:16:0x01c6, B:18:0x01ce, B:21:0x010b, B:23:0x0111, B:25:0x011d, B:27:0x0136, B:33:0x0180, B:35:0x0188, B:36:0x01a5, B:44:0x01e8), top: B:15:0x01c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e8 A[Catch: all -> 0x022f, TRY_LEAVE, TryCatch #4 {all -> 0x022f, blocks: (B:16:0x01c6, B:18:0x01ce, B:21:0x010b, B:23:0x0111, B:25:0x011d, B:27:0x0136, B:33:0x0180, B:35:0x0188, B:36:0x01a5, B:44:0x01e8), top: B:15:0x01c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v4, types: [j$.time.Duration, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0188 -> B:19:0x01a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x01c3 -> B:15:0x01c6). Please report as a decompilation issue!!! */
    @Override // defpackage.ajys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.util.List r24, defpackage.ffgu r25) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akbo.i(java.util.List, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.util.UUID r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.akav
            if (r0 == 0) goto L13
            r0 = r6
            akav r0 = (defpackage.akav) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            akav r0 = new akav
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.util.UUID r5 = r0.e
            akbo r0 = r0.d
            defpackage.ffci.b(r6)
            goto L4b
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ffci.b(r6)
            ffbr r6 = r4.b
            java.lang.Object r6 = r6.b()
            ajyr r6 = (defpackage.ajyr) r6
            r0.d = r4
            r0.e = r5
            r0.c = r3
            java.lang.Object r6 = r6.n(r5, r0)
            if (r6 == r1) goto L6c
            r0 = r4
        L4b:
            akcg r6 = (defpackage.akcg) r6
            if (r6 == 0) goto L59
            java.lang.String r6 = r6.e
            if (r6 == 0) goto L59
            java.io.File r5 = new java.io.File
            r5.<init>(r6)
            return r5
        L59:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ActiveRestoreExecution found for sessionId ["
            java.lang.String r2 = "]"
            java.lang.String r1 = defpackage.a.i(r5, r1, r2)
            r6.<init>(r1)
            eqza r1 = defpackage.eqza.DO_BUGLE_DATABASE_RESTORE
            r0.r(r1, r5)
            throw r6
        L6c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akbo.j(java.util.UUID, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.util.UUID r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.akbc
            if (r0 == 0) goto L13
            r0 = r6
            akbc r0 = (defpackage.akbc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            akbc r0 = new akbc
            r0.<init>(r4, r6)
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
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r6)
            ffbr r6 = r4.l
            java.lang.Object r6 = r6.b()
            ajwh r6 = (defpackage.ajwh) r6
            r0.c = r3
            java.lang.Object r6 = r6.a(r5, r0)
            if (r6 == r1) goto L53
        L42:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            if (r3 == r5) goto L4c
            r5 = 5
            goto L4d
        L4c:
            r5 = 6
        L4d:
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            return r6
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akbo.k(java.util.UUID, ffgu):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(5:5|6|(4:(1:(7:10|11|12|13|14|15|16)(2:24|25))(4:26|27|28|29)|20|15|16)(11:37|38|39|40|41|42|43|44|45|(1:47)|33)|30|31))|57|6|(0)(0)|30|31|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00aa, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a1, code lost:
    
        if (r0 == r4) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.akbo r15, java.util.UUID r16, long r17, defpackage.ffgu r19) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akbo.l(akbo, java.util.UUID, long, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.io.File r11, java.util.UUID r12, defpackage.ffgu r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.akbn
            if (r0 == 0) goto L13
            r0 = r13
            akbn r0 = (defpackage.akbn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            akbn r0 = new akbn
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.util.UUID r12 = r0.e
            akbo r11 = r0.d
            defpackage.ffci.b(r13)     // Catch: java.lang.Exception -> L2c
            goto L9e
        L2c:
            r0 = move-exception
            r13 = r0
            goto L59
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            defpackage.ffci.b(r13)
            ffbr r13 = r10.e     // Catch: java.lang.Exception -> L55
            java.lang.Object r13 = r13.b()     // Catch: java.lang.Exception -> L55
            bbhx r13 = (defpackage.bbhx) r13     // Catch: java.lang.Exception -> L55
            ajwe r2 = r10.k     // Catch: java.lang.Exception -> L55
            akbq r2 = (defpackage.akbq) r2     // Catch: java.lang.Exception -> L55
            bckh r2 = r2.a     // Catch: java.lang.Exception -> L55
            r0.d = r10     // Catch: java.lang.Exception -> L55
            r0.e = r12     // Catch: java.lang.Exception -> L55
            r0.c = r3     // Catch: java.lang.Exception -> L55
            java.lang.Object r11 = r13.a(r11, r2, r0)     // Catch: java.lang.Exception -> L55
            if (r11 != r1) goto L9e
            return r1
        L55:
            r0 = move-exception
            r11 = r0
            r13 = r11
            r11 = r10
        L59:
            r7 = r12
            enru r12 = defpackage.akbo.a
            ensk r12 = r12.j()
            ensn r0 = defpackage.ente.a
            java.lang.String r1 = "BugleBackup"
            r12.Y(r0, r1)
            enrr r12 = (defpackage.enrr) r12
            ensk r12 = r12.g(r13)
            java.lang.String r0 = "runDatabaseRestore"
            r1 = 436(0x1b4, float:6.11E-43)
            java.lang.String r2 = "com/google/android/apps/messaging/restore/impl/RestoreAnytimeCompatibleRestoreWorkflowSteps"
            java.lang.String r4 = "RestoreAnytimeCompatibleRestoreWorkflowSteps.kt"
            ensk r12 = r12.h(r2, r0, r1, r4)
            enrr r12 = (defpackage.enrr) r12
            java.lang.String r0 = "Restore from backup failed!"
            r12.q(r0)
            boolean r12 = r13 instanceof defpackage.bbhw
            if (r12 == 0) goto L87
            r3 = 6
        L85:
            r6 = r3
            goto L8d
        L87:
            boolean r12 = r13 instanceof defpackage.bbig
            if (r12 == 0) goto L85
            r3 = 7
            goto L85
        L8d:
            ffbr r11 = r11.i
            java.lang.Object r11 = r11.b()
            r4 = r11
            ajyw r4 = (defpackage.ajyw) r4
            eqza r5 = defpackage.eqza.DO_BUGLE_DATABASE_RESTORE
            r8 = 0
            r9 = 24
            defpackage.ajyw.e(r4, r5, r6, r7, r8, r9)
        L9e:
            ffcu r11 = defpackage.ffcu.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akbo.m(java.io.File, java.util.UUID, ffgu):java.lang.Object");
    }
}
