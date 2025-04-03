package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuuw implements cukg {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/util/spam/strangerdanger/StrangerDangerSpamProtection");
    public static final cfva b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffhd f;

    static {
        ecwh ecwhVar = cfvl.b;
        ezgt ezgtVar = (ezgt) ezgu.a.createBuilder();
        ezgtVar.a(30);
        ezgtVar.a(30);
        ezgtVar.a(30);
        b = cfvl.u(ecwhVar, "stranger_danger_recheck_delay_array_seconds", ezgtVar.build(), new ecwg() { // from class: cuuo
            @Override // defpackage.ecwg
            public final Object a(byte[] bArr) {
                return (ezgu) eyfy.parseFrom(ezgu.a, bArr);
            }
        });
    }

    public cuuw(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffhd ffhdVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffhdVar.getClass();
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = ffhdVar;
    }

    @Override // defpackage.cukg
    public final cukx a() {
        return cukx.f;
    }

    @Override // defpackage.cukg
    public final ekzz b() {
        return eleg.f("StrangerDangerSpamProtection.classify");
    }

    @Override // defpackage.cukg
    public final ekzz c() {
        return eleg.f("StrangerDangerSpamProtection.reclassify");
    }

    @Override // defpackage.cukg
    public final Object d(cujo cujoVar, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.f), new cuus(null, this, cujoVar), ffguVar);
    }

    @Override // defpackage.cukg
    public final Object e(cujo cujoVar, int i, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.f), new cuuu(null, this, cujoVar, i), ffguVar);
    }

    @Override // defpackage.cukg
    public final /* synthetic */ boolean f() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.cujo r12, defpackage.erdy r13, java.lang.Integer r14, defpackage.ffgu r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof defpackage.cuur
            if (r0 == 0) goto L13
            r0 = r15
            cuur r0 = (defpackage.cuur) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cuur r0 = new cuur
            r0.<init>(r11, r15)
        L18:
            r8 = r0
            java.lang.Object r15 = r8.a
            ffhh r0 = defpackage.ffhh.a
            int r1 = r8.c
            r10 = 1
            if (r1 == 0) goto L30
            if (r1 != r10) goto L28
            defpackage.ffci.b(r15)
            goto L5e
        L28:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L30:
            defpackage.ffci.b(r15)
            ffbr r15 = r11.d
            java.lang.Object r15 = r15.b()
            r1 = r15
            culy r1 = (defpackage.culy) r1
            cukx r3 = defpackage.cukx.f
            if (r14 == 0) goto L45
            int r14 = r14.intValue()
            goto L46
        L45:
            r14 = 0
        L46:
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r14)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r10)
            r8.c = r10
            r9 = 16
            r6 = 0
            r2 = r12
            r4 = r13
            java.lang.Object r15 = defpackage.culy.b(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r15 != r0) goto L5e
            return r0
        L5e:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r12 = r15.booleanValue()
            r12 = r12 ^ r10
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuuw.g(cujo, erdy, java.lang.Integer, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.cujo r12, java.lang.String r13, int r14, defpackage.ffgu r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof defpackage.cuuv
            if (r0 == 0) goto L13
            r0 = r15
            cuuv r0 = (defpackage.cuuv) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cuuv r0 = new cuuv
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            int r14 = r0.a
            cujo r12 = r0.f
            cuuw r13 = r0.e
            defpackage.ffci.b(r15)     // Catch: java.lang.Throwable -> L2e
            goto L5f
        L2e:
            r0 = move-exception
            r15 = r0
            goto L85
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            defpackage.ffci.b(r15)
            ffbr r15 = r11.c     // Catch: java.lang.Throwable -> L81
            java.lang.Object r15 = r15.b()     // Catch: java.lang.Throwable -> L81
            cuwf r15 = (defpackage.cuwf) r15     // Catch: java.lang.Throwable -> L81
            r0.e = r11     // Catch: java.lang.Throwable -> L81
            r0.f = r12     // Catch: java.lang.Throwable -> L81
            r0.a = r14     // Catch: java.lang.Throwable -> L81
            r0.d = r3     // Catch: java.lang.Throwable -> L81
            ffhd r2 = r15.i     // Catch: java.lang.Throwable -> L81
            ffhd r2 = defpackage.ekxi.a(r2)     // Catch: java.lang.Throwable -> L81
            cuwc r5 = new cuwc     // Catch: java.lang.Throwable -> L81
            r5.<init>(r4, r13, r15)     // Catch: java.lang.Throwable -> L81
            java.lang.Object r15 = defpackage.ffra.a(r2, r5, r0)     // Catch: java.lang.Throwable -> L81
            if (r15 != r1) goto L5e
            return r1
        L5e:
            r13 = r11
        L5f:
            fcjg r15 = (defpackage.fcjg) r15     // Catch: java.lang.Throwable -> L2e
            if (r15 != 0) goto L64
            return r4
        L64:
            java.lang.String r12 = r15.c
            r12.getClass()
            int r12 = r12.length()
            if (r12 <= 0) goto L71
            java.lang.String r4 = r15.c
        L71:
            cuuq r12 = new cuuq
            int r13 = r15.b
            int r13 = defpackage.fgto.b(r13)
            if (r13 != 0) goto L7c
            goto L7d
        L7c:
            r3 = r13
        L7d:
            r12.<init>(r3, r4)
            return r12
        L81:
            r0 = move-exception
            r13 = r0
            r15 = r13
            r13 = r11
        L85:
            r10 = r14
            r7 = r15
            ffbr r13 = r13.e
            java.lang.Object r13 = r13.b()
            r5 = r13
            culs r5 = (defpackage.culs) r5
            culh r12 = r12.f
            culf r6 = r12.a
            cukx r8 = defpackage.cukx.f
            erdy r9 = defpackage.erdy.RECLASSIFICATION
            r5.b(r6, r7, r8, r9, r10)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuuw.h(cujo, java.lang.String, int, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.cujo r12, java.lang.String r13, int r14, defpackage.ffgu r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof defpackage.cuut
            if (r0 == 0) goto L13
            r0 = r15
            cuut r0 = (defpackage.cuut) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cuut r0 = new cuut
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            cujo r12 = r0.e
            cuuw r13 = r0.d
            defpackage.ffci.b(r15)     // Catch: java.lang.Throwable -> L2c
            goto L61
        L2c:
            r0 = move-exception
            r14 = r0
            goto L87
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            defpackage.ffci.b(r15)
            ffbr r15 = r11.c     // Catch: java.lang.Throwable -> L83
            java.lang.Object r15 = r15.b()     // Catch: java.lang.Throwable -> L83
            r8 = r15
            cuwf r8 = (defpackage.cuwf) r8     // Catch: java.lang.Throwable -> L83
            culh r10 = r12.f     // Catch: java.lang.Throwable -> L83
            r0.d = r11     // Catch: java.lang.Throwable -> L83
            r0.e = r12     // Catch: java.lang.Throwable -> L83
            r0.c = r4     // Catch: java.lang.Throwable -> L83
            ffhd r15 = r8.i     // Catch: java.lang.Throwable -> L83
            ffhd r15 = defpackage.ekxi.a(r15)     // Catch: java.lang.Throwable -> L83
            cuwb r5 = new cuwb     // Catch: java.lang.Throwable -> L83
            r6 = 0
            r7 = r13
            r9 = r14
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L83
            java.lang.Object r15 = defpackage.ffra.a(r15, r5, r0)     // Catch: java.lang.Throwable -> L83
            if (r15 != r1) goto L60
            return r1
        L60:
            r13 = r11
        L61:
            fcio r15 = (defpackage.fcio) r15     // Catch: java.lang.Throwable -> L2c
            if (r15 != 0) goto L66
            return r3
        L66:
            java.lang.String r12 = r15.c
            r12.getClass()
            int r12 = r12.length()
            if (r12 <= 0) goto L73
            java.lang.String r3 = r15.c
        L73:
            cuuq r12 = new cuuq
            int r13 = r15.b
            int r13 = defpackage.fgto.b(r13)
            if (r13 != 0) goto L7e
            goto L7f
        L7e:
            r4 = r13
        L7f:
            r12.<init>(r4, r3)
            return r12
        L83:
            r0 = move-exception
            r13 = r0
            r14 = r13
            r13 = r11
        L87:
            ffbr r13 = r13.e
            java.lang.Object r13 = r13.b()
            culs r13 = (defpackage.culs) r13
            culh r12 = r12.f
            culf r12 = r12.a
            cukx r15 = defpackage.cukx.f
            erdy r0 = defpackage.erdy.MESSAGE_RECEIPT
            defpackage.culs.d(r13, r12, r14, r15, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuuw.i(cujo, java.lang.String, int, ffgu):java.lang.Object");
    }
}
