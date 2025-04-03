package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdfq implements cdwr {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/batchbackup/post_processing/UploadSessionIdsWorkItemProcessor");
    private final axkm b;

    public cdfq(axkm axkmVar) {
        axkmVar.getClass();
        this.b = axkmVar;
    }

    @Override // defpackage.cdws
    public final /* bridge */ /* synthetic */ int a(Object obj) {
        return ((cdvx) obj).c;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.cdfr r13, java.util.List r14, defpackage.ffgu r15) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdfq.b(cdfr, java.util.List, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.cdfr r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cdfm
            if (r0 == 0) goto L13
            r0 = r7
            cdfm r0 = (defpackage.cdfm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cdfm r0 = new cdfm
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            java.lang.String r3 = "previous_session_ids"
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            defpackage.ffci.b(r7)     // Catch: defpackage.fedn -> L29
            goto L4d
        L29:
            r6 = move-exception
            goto L54
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.ffci.b(r7)
            ffbr r6 = r6.gY()     // Catch: defpackage.fedn -> L29
            java.lang.Object r6 = r6.b()     // Catch: defpackage.fedn -> L29
            crty r6 = (defpackage.crty) r6     // Catch: defpackage.fedn -> L29
            elfl r6 = r6.r(r3)     // Catch: defpackage.fedn -> L29
            r0.c = r4     // Catch: defpackage.fedn -> L29
            java.lang.Object r7 = defpackage.fgfz.c(r6, r0)     // Catch: defpackage.fedn -> L29
            if (r7 != r1) goto L4d
            return r1
        L4d:
            eszz r7 = (defpackage.eszz) r7     // Catch: defpackage.fedn -> L29
            j$.util.Optional r6 = j$.util.Optional.of(r7)     // Catch: defpackage.fedn -> L29
            return r6
        L54:
            io.grpc.Status r7 = r6.a
            io.grpc.Status$Code r7 = r7.getCode()
            io.grpc.Status r0 = io.grpc.Status.g
            io.grpc.Status$Code r0 = r0.getCode()
            if (r7 != r0) goto L67
            j$.util.Optional r6 = j$.util.Optional.empty()
            return r6
        L67:
            enru r7 = defpackage.cdfq.a
            ensk r7 = r7.j()
            ensn r0 = defpackage.ente.a
            java.lang.String r1 = "BugleCms"
            r7.Y(r0, r1)
            enrr r7 = (defpackage.enrr) r7
            ensk r7 = r7.g(r6)
            java.lang.String r0 = "getServerObject"
            r1 = 104(0x68, float:1.46E-43)
            java.lang.String r2 = "com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/batchbackup/post_processing/UploadSessionIdsWorkItemProcessor"
            java.lang.String r4 = "UploadSessionIdsWorkItemProcessor.kt"
            ensk r7 = r7.h(r2, r0, r1, r4)
            enrr r7 = (defpackage.enrr) r7
            io.grpc.Status r0 = r6.a
            java.lang.String r1 = "Error when getting Object with correlation_id = %s, status = %s"
            r7.D(r1, r3, r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdfq.c(cdfr, ffgu):java.lang.Object");
    }

    @Override // defpackage.cdwr
    public final /* bridge */ /* synthetic */ Object d(Object obj, ceuw ceuwVar, Object obj2, ffgu ffguVar) {
        return g((cdfr) obj, ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.cdfr r11, java.util.List r12, java.lang.String r13, defpackage.ffgu r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.cdfo
            if (r0 == 0) goto L13
            r0 = r14
            cdfo r0 = (defpackage.cdfo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cdfo r0 = new cdfo
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r14)     // Catch: java.lang.Exception -> L27
            goto L7f
        L27:
            r0 = move-exception
            r11 = r0
            goto L85
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            defpackage.ffci.b(r14)
            etaq r14 = defpackage.etaq.a
            eyfq r14 = r14.createBuilder()
            etap r14 = (defpackage.etap) r14
            r14.getClass()
            defpackage.etar.c(r14)
            r8 = 0
            r9 = 62
            java.lang.String r5 = ","
            r6 = 0
            r7 = 0
            r4 = r12
            java.lang.String r12 = defpackage.ffdx.aA(r4, r5, r6, r7, r8, r9)
            defpackage.etar.b(r12, r14)
            defpackage.etar.d(r14)
            etaq r12 = defpackage.etar.a(r14)
            ffbr r11 = r11.gY()     // Catch: java.lang.Exception -> L27
            java.lang.Object r11 = r11.b()     // Catch: java.lang.Exception -> L27
            crty r11 = (defpackage.crty) r11     // Catch: java.lang.Exception -> L27
            eyfh r14 = defpackage.eyfh.a     // Catch: java.lang.Exception -> L27
            eyfq r14 = r14.createBuilder()     // Catch: java.lang.Exception -> L27
            eyfg r14 = (defpackage.eyfg) r14     // Catch: java.lang.Exception -> L27
            r14.getClass()     // Catch: java.lang.Exception -> L27
            eyfh r14 = defpackage.eyfi.a(r14)     // Catch: java.lang.Exception -> L27
            r2 = 0
            elfl r11 = r11.X(r13, r12, r14, r2)     // Catch: java.lang.Exception -> L27
            r0.c = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r14 = defpackage.fgfz.c(r11, r0)     // Catch: java.lang.Exception -> L27
            if (r14 == r1) goto L84
        L7f:
            etaq r14 = (defpackage.etaq) r14     // Catch: java.lang.Exception -> L27
            ffcu r11 = defpackage.ffcu.a
            return r11
        L84:
            return r1
        L85:
            enru r12 = defpackage.cdfq.a
            ensk r12 = r12.j()
            ensn r13 = defpackage.ente.a
            java.lang.String r14 = "BugleCms"
            r12.Y(r13, r14)
            enrr r12 = (defpackage.enrr) r12
            ensk r12 = r12.g(r11)
            java.lang.String r13 = "updateSessionIdsObject"
            r14 = 158(0x9e, float:2.21E-43)
            java.lang.String r0 = "com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/batchbackup/post_processing/UploadSessionIdsWorkItemProcessor"
            java.lang.String r1 = "UploadSessionIdsWorkItemProcessor.kt"
            ensk r12 = r12.h(r0, r13, r14, r1)
            enrr r12 = (defpackage.enrr) r12
            java.lang.String r13 = "Failed to update payload part"
            r12.q(r13)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdfq.e(cdfr, java.util.List, java.lang.String, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0107, code lost:
    
        if (r7.e(r6, r8, r13, r0) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0118, code lost:
    
        if (r7.b(r6, r8, r0) == r1) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e7 A[LOOP:1: B:30:0x00d5->B:32:0x00e7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r8v2, types: [comc, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.cdfr r13, defpackage.ffgu r14) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdfq.f(cdfr, ffgu):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0027, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        r6 = defpackage.cdfq.a.j();
        r6.Y(defpackage.ente.a, "BugleCms");
        ((defpackage.enrr) ((defpackage.enrr) r6).g(r5).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/batchbackup/post_processing/UploadSessionIdsWorkItemProcessor", "processCmsWorkItem", 56, "UploadSessionIdsWorkItemProcessor.kt")).q("Failed to upload previous session ids.");
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.cdfr r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cdfn
            if (r0 == 0) goto L13
            r0 = r6
            cdfn r0 = (defpackage.cdfn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cdfn r0 = new cdfn
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.ffci.b(r6)     // Catch: java.lang.Exception -> L27
            goto L63
        L27:
            r5 = move-exception
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            r0.c = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r5 = r4.f(r5, r0)     // Catch: java.lang.Exception -> L27
            if (r5 != r1) goto L63
            return r1
        L3d:
            enru r6 = defpackage.cdfq.a
            ensk r6 = r6.j()
            ensn r0 = defpackage.ente.a
            java.lang.String r1 = "BugleCms"
            r6.Y(r0, r1)
            enrr r6 = (defpackage.enrr) r6
            ensk r5 = r6.g(r5)
            java.lang.String r6 = "processCmsWorkItem"
            r0 = 56
            java.lang.String r1 = "com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/batchbackup/post_processing/UploadSessionIdsWorkItemProcessor"
            java.lang.String r2 = "UploadSessionIdsWorkItemProcessor.kt"
            ensk r5 = r5.h(r1, r6, r0, r2)
            enrr r5 = (defpackage.enrr) r5
            java.lang.String r6 = "Failed to upload previous session ids."
            r5.q(r6)
        L63:
            ceyt r5 = defpackage.ceyt.i()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdfq.g(cdfr, ffgu):java.lang.Object");
    }
}
