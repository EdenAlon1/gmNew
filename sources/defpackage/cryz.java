package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cryz {
    private static final enru d = enru.c("com/google/android/apps/messaging/shared/util/cloudstore/CmsDeltaSyncManager");
    public final crzf a;
    public final dtuu b;
    public final ffsk c;
    private final crty e;
    private final axkm f;
    private final ajyr g;
    private final asik h;
    private final ffhd i;
    private final ffbr j;
    private final eixo k;

    public cryz(crzf crzfVar, crty crtyVar, axkm axkmVar, ajyr ajyrVar, asik asikVar, dtuu dtuuVar, ffsk ffskVar, ffhd ffhdVar, ffbr ffbrVar, eixo eixoVar) {
        crzfVar.getClass();
        crtyVar.getClass();
        axkmVar.getClass();
        ajyrVar.getClass();
        dtuuVar.getClass();
        ffskVar.getClass();
        ffhdVar.getClass();
        ffbrVar.getClass();
        eixoVar.getClass();
        this.a = crzfVar;
        this.e = crtyVar;
        this.f = axkmVar;
        this.g = ajyrVar;
        this.h = asikVar;
        this.b = dtuuVar;
        this.c = ffskVar;
        this.i = ffhdVar;
        this.j = ffbrVar;
        this.k = eixoVar;
    }

    private final void g(String str) {
        ensk h = d.h();
        h.Y(ente.a, "BugleCms");
        enrr enrrVar = (enrr) h;
        enrrVar.Y(csux.O, "CmsDeltaSyncManager");
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsDeltaSyncManager", "logClearBugleDbFields", 308, "CmsDeltaSyncManager.kt")).t("Clearing BugleDb %s.", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.cryq
            if (r0 == 0) goto L13
            r0 = r8
            cryq r0 = (defpackage.cryq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cryq r0 = new cryq
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r7 = r0.d
            defpackage.ffci.b(r8)
            goto L5e
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.ffci.b(r8)
            crty r8 = r6.e
            eyfh r2 = defpackage.eyfh.a
            eyfq r2 = r2.createBuilder()
            eyfg r2 = (defpackage.eyfg) r2
            r2.getClass()
            defpackage.eyfi.b(r2)
            java.lang.String r4 = "box_devices"
            r2.a(r4)
            eyfh r2 = defpackage.eyfi.a(r2)
            elfl r8 = r8.k(r2)
            r8.getClass()
            r0.d = r7
            r0.c = r3
            java.lang.Object r8 = defpackage.fgfz.c(r8, r0)
            if (r8 == r1) goto Lc0
        L5e:
            esvv r8 = (defpackage.esvv) r8
            enru r0 = defpackage.cryz.d
            ensk r0 = r0.h()
            ensn r1 = defpackage.ente.a
            java.lang.String r2 = "BugleCms"
            r0.Y(r1, r2)
            enrr r0 = (defpackage.enrr) r0
            ensn r1 = defpackage.csux.O
            java.lang.String r2 = "CmsDeltaSyncManager"
            r0.Y(r1, r2)
            java.lang.String r1 = "backupDeviceIdNotMatchBoxDeviceIdForD2d"
            r2 = 251(0xfb, float:3.52E-43)
            java.lang.String r4 = "com/google/android/apps/messaging/shared/util/cloudstore/CmsDeltaSyncManager"
            java.lang.String r5 = "CmsDeltaSyncManager.kt"
            ensk r0 = r0.h(r4, r1, r2, r5)
            enrr r0 = (defpackage.enrr) r0
            eygr r1 = r8.f
            java.lang.String r2 = "The box's current devices: %s, local priorToDeviceId: %s"
            r0.D(r2, r1, r7)
            eygr r8 = r8.f
            r8.getClass()
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L97
            goto Lbb
        L97:
            java.util.Iterator r8 = r8.iterator()
        L9b:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Lbb
            java.lang.Object r0 = r8.next()
            esvx r0 = (defpackage.esvx) r0
            int r1 = r0.c
            int r1 = defpackage.esvz.a(r1)
            if (r1 == 0) goto L9b
            r2 = 3
            if (r1 != r2) goto L9b
            java.lang.String r0 = r0.b
            boolean r0 = defpackage.ffkj.e(r0, r7)
            if (r0 == 0) goto L9b
            r3 = 0
        Lbb:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        Lc0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cryz.a(java.lang.String, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(boolean r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.crys
            if (r0 == 0) goto L13
            r0 = r6
            crys r0 = (defpackage.crys) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            crys r0 = new crys
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cryz r5 = r0.d
            defpackage.ffci.b(r6)
            goto L53
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            if (r5 == 0) goto L52
            java.lang.String r5 = "CMS backup fields"
            r4.g(r5)
            ffhd r5 = r4.i
            ffhd r5 = defpackage.ekxi.a(r5)
            cryr r6 = new cryr
            r2 = 0
            r6.<init>(r2, r4)
            r0.d = r4
            r0.c = r3
            java.lang.Object r5 = defpackage.ffra.a(r5, r6, r0)
            if (r5 != r1) goto L52
            return r1
        L52:
            r5 = r4
        L53:
            java.lang.String r6 = "CmsSettings delta sync fields"
            r5.g(r6)
            axkm r5 = r5.f
            r5.E()
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cryz.b(boolean, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d5, code lost:
    
        if (r13.b(true, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e1, code lost:
    
        if (r13.b(false, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.eisx r13, defpackage.ffgu r14) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cryz.c(eisx, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x01d3, code lost:
    
        if (r1 == r3) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0171, code lost:
    
        if (r1 != r3) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0149, code lost:
    
        if (r1 != r3) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.eisx r17, defpackage.ffgu r18) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cryz.d(eisx, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.eyja r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cryx
            if (r0 == 0) goto L13
            r0 = r6
            cryx r0 = (defpackage.cryx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cryx r0 = new cryx
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            j$.time.Instant r5 = r0.d
            defpackage.ffci.b(r6)
            goto L48
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            j$.time.Instant r5 = defpackage.eykn.d(r5)
            crty r6 = r4.e
            elfl r6 = r6.l()
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = defpackage.fgfz.c(r6, r0)
            if (r6 == r1) goto L77
        L48:
            r6.getClass()
            eyja r6 = (defpackage.eyja) r6
            j$.time.Instant r6 = defpackage.eykn.d(r6)
            cfup r0 = defpackage.csgj.L
            java.lang.Object r0 = r0.e()
            r0.getClass()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            j$.time.temporal.ChronoUnit r2 = j$.time.temporal.ChronoUnit.DAYS
            j$.time.Instant r5 = r5.d(r0, r2)
            boolean r5 = r6.isAfter(r5)
            if (r5 == 0) goto L71
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L71:
            r5 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cryz.e(eyja, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.eyja r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.cryy
            if (r0 == 0) goto L13
            r0 = r9
            cryy r0 = (defpackage.cryy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cryy r0 = new cryy
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            eyja r8 = r0.d
            defpackage.ffci.b(r9)
            goto L44
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            defpackage.ffci.b(r9)
            crty r9 = r7.e
            elfl r9 = r9.v()
            r0.d = r8
            r0.c = r3
            java.lang.Object r9 = defpackage.fgfz.c(r9, r0)
            if (r9 == r1) goto La3
        L44:
            j$.util.Optional r9 = (j$.util.Optional) r9
            crym r0 = new crym
            r0.<init>()
            cryn r1 = new cryn
            r1.<init>()
            j$.util.Optional r0 = r9.map(r1)
            java.lang.String r1 = "empty"
            java.lang.Object r0 = r0.orElse(r1)
            java.lang.String r0 = (java.lang.String) r0
            enru r1 = defpackage.cryz.d
            ensk r1 = r1.h()
            ensn r2 = defpackage.ente.a
            java.lang.String r4 = "BugleCms"
            r1.Y(r2, r4)
            enrr r1 = (defpackage.enrr) r1
            ensn r2 = defpackage.csux.O
            java.lang.String r4 = "CmsDeltaSyncManager"
            r1.Y(r2, r4)
            java.lang.String r2 = "resetBoxAfterDeltaSyncTimestamp"
            r4 = 269(0x10d, float:3.77E-43)
            java.lang.String r5 = "com/google/android/apps/messaging/shared/util/cloudstore/CmsDeltaSyncManager"
            java.lang.String r6 = "CmsDeltaSyncManager.kt"
            ensk r1 = r1.h(r5, r2, r4, r6)
            enrr r1 = (defpackage.enrr) r1
            java.lang.String r2 = defpackage.eykm.i(r8)
            java.lang.String r4 = "ResetBox timestamp: %s, Delta sync timestamp: %s"
            r1.D(r4, r0, r2)
            boolean r0 = r9.isPresent()
            r1 = 0
            if (r0 == 0) goto L9d
            java.lang.Object r9 = r9.get()
            eyja r9 = (defpackage.eyja) r9
            int r8 = defpackage.eykl.a(r9, r8)
            if (r8 <= 0) goto L9d
            goto L9e
        L9d:
            r3 = r1
        L9e:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        La3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cryz.f(eyja, ffgu):java.lang.Object");
    }
}
