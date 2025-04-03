package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnqd implements cnng {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/satelliteapi/incoming/IncomingSatelliteApiImpl");
    private final bbfr b;
    private final cnqi c;
    private final cnvc d;

    public cnqd(bbfr bbfrVar, cnqi cnqiVar, cnvc cnvcVar) {
        bbfrVar.getClass();
        cnvcVar.getClass();
        this.b = bbfrVar;
        this.c = cnqiVar;
        this.d = cnvcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.cnng
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.cntl r10, defpackage.ffgu r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.cnqa
            if (r0 == 0) goto L13
            r0 = r11
            cnqa r0 = (defpackage.cnqa) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cnqa r0 = new cnqa
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            ekzz r10 = r0.d
            defpackage.ffci.b(r11)     // Catch: java.lang.Throwable -> L2a
            goto L90
        L2a:
            r11 = move-exception
            goto Lcf
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            defpackage.ffci.b(r11)
            enru r11 = defpackage.cnqd.a
            ensk r11 = r11.h()
            ensn r2 = defpackage.ente.a
            java.lang.String r5 = "BugleSatellite"
            r11.Y(r2, r5)
            enrr r11 = (defpackage.enrr) r11
            ensn r2 = defpackage.csux.Y
            cnso r5 = r10.e
            if (r5 != 0) goto L4f
            cnso r5 = defpackage.cnso.a
        L4f:
            java.lang.String r5 = r5.c
            bdgr r6 = new bdgr
            r6.<init>(r5)
            r11.Y(r2, r6)
            java.lang.String r2 = "onReceiveSatelliteMessage"
            r5 = 61
            java.lang.String r6 = "com/google/android/apps/messaging/shared/satelliteapi/incoming/IncomingSatelliteApiImpl"
            java.lang.String r7 = "IncomingSatelliteApiImpl.kt"
            ensk r11 = r11.h(r6, r2, r5, r7)
            enrr r11 = (defpackage.enrr) r11
            java.lang.String r2 = "Calling IncomingSatelliteMessageProcessor"
            r11.q(r2)
            java.lang.String r11 = "IncomingSatelliteMessageProcessor#processIncomingMessage"
            ekzz r11 = defpackage.eleg.f(r11)
            cnqi r2 = r9.c     // Catch: java.lang.Throwable -> Lcb
            r0.d = r11     // Catch: java.lang.Throwable -> Lcb
            r0.c = r4     // Catch: java.lang.Throwable -> Lcb
            ffhd r5 = r2.a     // Catch: java.lang.Throwable -> Lcb
            ffhd r5 = defpackage.ekxi.a(r5)     // Catch: java.lang.Throwable -> Lcb
            cnqg r6 = new cnqg     // Catch: java.lang.Throwable -> Lcb
            r6.<init>(r3, r2, r10)     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r10 = defpackage.ffra.a(r5, r6, r0)     // Catch: java.lang.Throwable -> Lcb
            ffhh r0 = defpackage.ffhh.a     // Catch: java.lang.Throwable -> Lcb
            if (r10 == r0) goto L8d
            ffcu r10 = defpackage.ffcu.a     // Catch: java.lang.Throwable -> Lcb
        L8d:
            if (r10 == r1) goto Lca
            r10 = r11
        L90:
            defpackage.ffig.a(r10, r3)
            cntn r10 = defpackage.cntn.a
            eyfq r10 = r10.createBuilder()
            cntm r10 = (defpackage.cntm) r10
            r10.getClass()
            cnuv r11 = defpackage.cnuv.a
            eyfq r11 = r11.createBuilder()
            cnut r11 = (defpackage.cnut) r11
            r11.getClass()
            cnuu r0 = defpackage.cnuu.SUCCESS
            defpackage.cnuw.b(r0, r11)
            cnuv r11 = defpackage.cnuw.a(r11)
            r10.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r0 = r10.instance
            cntn r0 = (defpackage.cntn) r0
            r0.c = r11
            int r11 = r0.b
            r11 = r11 | r4
            r0.b = r11
            eyfy r10 = r10.build()
            r10.getClass()
            cntn r10 = (defpackage.cntn) r10
            return r10
        Lca:
            return r1
        Lcb:
            r10 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
        Lcf:
            throw r11     // Catch: java.lang.Throwable -> Ld0
        Ld0:
            r0 = move-exception
            defpackage.ffig.a(r10, r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnqd.a(cntl, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v18, types: [cntp] */
    /* JADX WARN: Type inference failed for: r0v2, types: [cnqb, ffgu] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [cntp] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v10, types: [cnvc] */
    @Override // defpackage.cnng
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.cntp r12, defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnqd.b(cntp, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.cnng
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.cntv r10, defpackage.ffgu r11) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnqd.c(cntv, ffgu):java.lang.Object");
    }
}
