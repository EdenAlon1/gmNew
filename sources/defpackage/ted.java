package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ted implements tee {
    public static final enru a = enru.c("com/google/android/apps/messaging/cloudstore/cmsrpc/deviceonboarding/CreatePairingDelegate");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    private final cgvp e;
    private final ffbr f;
    private final ffbr g;
    private final ffsk h;
    private final ffhd i;
    private final ffbr j;

    public ted(ffbr ffbrVar, cgvp cgvpVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffsk ffskVar, ffhd ffhdVar, ffbr ffbrVar6, ffbr ffbrVar7, areq areqVar) {
        ffbrVar.getClass();
        cgvpVar.getClass();
        ffbrVar2.getClass();
        ffbrVar5.getClass();
        ffskVar.getClass();
        ffhdVar.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        areqVar.getClass();
        this.b = ffbrVar;
        this.e = cgvpVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.c = ffbrVar4;
        this.d = ffbrVar5;
        this.h = ffskVar;
        this.i = ffhdVar;
        this.j = ffbrVar7;
    }

    private final ezlj l(eskt esktVar) {
        int ordinal = esktVar.ordinal();
        return ordinal != 0 ? ordinal != 2 ? ezlj.UNKNOWN_EVENT_TYPE : ezlj.CREATE_GAIA_PAIRING_CLIENT_FINISHED : ezlj.CREATE_GAIA_PAIRING_CLIENT_INIT;
    }

    @Override // defpackage.tee
    public final elfl a(String str, long j, eyee eyeeVar, esku eskuVar) {
        elfl c;
        c = axol.c(this.h, ffhe.a, ffsm.a, new tdz(this, eskuVar, str, j, eyeeVar, null));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.faom r8, java.lang.String r9, java.lang.String r10, defpackage.eskt r11, int r12, int r13, defpackage.ffgu r14) {
        /*
            r7 = this;
            boolean r0 = r14 instanceof defpackage.tdp
            if (r0 == 0) goto L13
            r0 = r14
            tdp r0 = (defpackage.tdp) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            tdp r0 = new tdp
            r0.<init>(r7, r14)
        L18:
            java.lang.Object r14 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            int r13 = r0.b
            int r12 = r0.a
            byte[] r8 = r0.j
            eskt r11 = r0.i
            java.lang.String r10 = r0.h
            java.lang.String r9 = r0.g
            ted r0 = r0.f
            defpackage.ffci.b(r14)
            goto L6b
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3d:
            defpackage.ffci.b(r14)
            ffbr r14 = r7.b
            java.lang.Object r14 = r14.b()
            cgvm r14 = (defpackage.cgvm) r14
            byte[] r8 = r14.k(r8)
            ffbr r14 = r7.b
            java.lang.Object r14 = r14.b()
            cgvm r14 = (defpackage.cgvm) r14
            r0.f = r7
            r0.g = r9
            r0.h = r10
            r0.i = r11
            r0.j = r8
            r0.a = r12
            r0.b = r13
            r0.e = r3
            java.lang.Object r14 = r14.f(r0)
            if (r14 == r1) goto Ld2
            r0 = r7
        L6b:
            r1 = r9
            r2 = r10
            r3 = r14
            eslj r3 = (defpackage.eslj) r3
            if (r3 == 0) goto L87
            ezlj r4 = r0.l(r11)
            ffbr r8 = r0.b
            java.lang.Object r8 = r8.b()
            r0 = r8
            cgvm r0 = (defpackage.cgvm) r0
            r5 = 3
            r6 = 32
            j$.util.Optional r8 = defpackage.cgvm.r(r0, r1, r2, r3, r4, r5, r6)
            return r8
        L87:
            ezlj r3 = r0.l(r11)
            ffbr r9 = r0.b
            java.lang.Object r9 = r9.b()
            r0 = r9
            cgvm r0 = (defpackage.cgvm) r0
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r12)
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r13)
            r6 = 3
            r0.q(r1, r2, r3, r4, r5, r6)
            eslk r9 = defpackage.eslk.a
            eyfq r9 = r9.createBuilder()
            esli r9 = (defpackage.esli) r9
            r9.getClass()
            faom r10 = defpackage.faom.a
            eyfy r8 = defpackage.eyfy.parseFrom(r10, r8)
            faom r8 = (defpackage.faom) r8
            defpackage.esll.h(r8, r9)
            defpackage.esll.i(r9)
            defpackage.esll.f(r1, r9)
            fagh r8 = defpackage.fagh.OK
            defpackage.esll.g(r8, r9)
            defpackage.esll.c(r12, r9)
            defpackage.esll.b(r13, r9)
            eslk r8 = defpackage.esll.a(r9)
            j$.util.Optional r8 = j$.util.Optional.of(r8)
            return r8
        Ld2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ted.b(faom, java.lang.String, java.lang.String, eskt, int, int, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.tdr
            if (r0 == 0) goto L13
            r0 = r6
            tdr r0 = (defpackage.tdr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            tdr r0 = new tdr
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.ffci.b(r6)
            ffhd r6 = r5.i
            ffhd r6 = defpackage.ekxi.a(r6)
            tdq r2 = new tdq
            r4 = 0
            r2.<init>(r4, r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.ffra.a(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ted.c(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(byte[] r6, byte[] r7, defpackage.ffgu r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.tdt
            if (r0 == 0) goto L13
            r0 = r8
            tdt r0 = (defpackage.tdt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            tdt r0 = new tdt
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r8)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.ffci.b(r8)
            ffhd r8 = r5.i
            ffhd r8 = defpackage.ekxi.a(r8)
            tds r2 = new tds
            r4 = 0
            r2.<init>(r4, r5, r6, r7)
            r0.c = r3
            java.lang.Object r8 = defpackage.ffra.a(r8, r2, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            r8.getClass()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ted.d(byte[], byte[], ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x024e, code lost:
    
        if (r1 != r9) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01ff, code lost:
    
        if (r0.a(null, r8) != r9) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01b6, code lost:
    
        if (r1 == r9) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x02a4, code lost:
    
        if (r1 != r9) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r2v20, types: [fgjb] */
    /* JADX WARN: Type inference failed for: r2v27, types: [fgjb] */
    /* JADX WARN: Type inference failed for: r2v3, types: [fgjb, int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [fgjb] */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v5, types: [fgjb] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r14, long r15, defpackage.eskt r17, defpackage.eslh r18, defpackage.ezlj r19, defpackage.eyee r20, defpackage.ffgu r21) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ted.e(java.lang.String, long, eskt, eslh, ezlj, eyee, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r22, long r23, defpackage.eyee r25, defpackage.eskt r26, defpackage.eslh r27, defpackage.ffgu r28) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ted.f(java.lang.String, long, eyee, eskt, eslh, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.eyee r9, defpackage.ffgu r10) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ted.g(eyee, ffgu):java.lang.Object");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x01dc -> B:56:0x01e4). Please report as a decompilation issue!!! */
    public final java.lang.Object h(defpackage.eslh r26, java.lang.String r27, defpackage.ezlj r28, defpackage.ffgu r29) {
        /*
            Method dump skipped, instructions count: 1010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ted.h(eslh, java.lang.String, ezlj, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e0, code lost:
    
        if (r1.i(r3, r4) == r5) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.eslh r17, defpackage.eskt r18, java.lang.String r19, defpackage.faom r20, defpackage.ffgu r21) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ted.i(eslh, eskt, java.lang.String, faom, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x010d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.eslh r21, defpackage.eskt r22, java.lang.String r23, defpackage.faom r24, defpackage.eyee r25, defpackage.ffgu r26) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ted.j(eslh, eskt, java.lang.String, faom, eyee, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x008b, code lost:
    
        if (r15 != r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e0, code lost:
    
        if (r15 != r0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.esku r10, java.lang.String r11, long r12, defpackage.eyee r14, defpackage.ffgu r15) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ted.k(esku, java.lang.String, long, eyee, ffgu):java.lang.Object");
    }
}
