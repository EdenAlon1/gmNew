package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnrn implements cnnh {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl");
    public final desb b;
    public final deri c;
    public final ders d;
    private final ffhd e;
    private final cnnz f;
    private final cnny g;

    public cnrn(ffhd ffhdVar, desb desbVar, deri deriVar, ders dersVar, cnnz cnnzVar, cnny cnnyVar) {
        ffhdVar.getClass();
        this.e = ffhdVar;
        this.b = desbVar;
        this.c = deriVar;
        this.d = dersVar;
        this.f = cnnzVar;
        this.g = cnnyVar;
    }

    private static final derv k(int i, eyee eyeeVar) {
        deru deruVar = (deru) derv.a.createBuilder();
        deruVar.getClass();
        deruVar.copyOnWrite();
        derv dervVar = (derv) deruVar.instance;
        dervVar.b |= 1;
        dervVar.c = i;
        deruVar.copyOnWrite();
        derv dervVar2 = (derv) deruVar.instance;
        dervVar2.b |= 2;
        dervVar2.d = eyeeVar;
        deruVar.copyOnWrite();
        derv dervVar3 = (derv) deruVar.instance;
        dervVar3.e = 1;
        dervVar3.b |= 4;
        eyfy build = deruVar.build();
        build.getClass();
        return (derv) build;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.cnnh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cnri
            if (r0 == 0) goto L13
            r0 = r5
            cnri r0 = (defpackage.cnri) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cnri r0 = new cnri
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.ffci.b(r5)
            ffch r5 = (defpackage.ffch) r5
            java.lang.Object r5 = r5.a
            goto L3e
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            defpackage.ffci.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.f(r0)
            if (r5 == r1) goto Lbe
        L3e:
            boolean r0 = defpackage.ffch.d(r5)
            if (r0 == 0) goto L90
            deqe r5 = (defpackage.deqe) r5
            int r0 = r5.b
            if (r0 <= 0) goto L82
            cntf r0 = defpackage.cntf.a
            eyfq r0 = r0.createBuilder()
            cnte r0 = (defpackage.cnte) r0
            r0.getClass()
            cnuv r1 = defpackage.cnuv.a
            eyfq r1 = r1.createBuilder()
            cnut r1 = (defpackage.cnut) r1
            r1.getClass()
            cnuu r2 = defpackage.cnuu.SUCCESS
            defpackage.cnuw.b(r2, r1)
            cnuv r1 = defpackage.cnuw.a(r1)
            defpackage.cntg.b(r1, r0)
            int r5 = r5.b
            r0.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r1 = r0.instance
            cntf r1 = (defpackage.cntf) r1
            int r2 = r1.b
            r2 = r2 | 2
            r1.b = r2
            r1.d = r5
            cntf r5 = defpackage.cntg.a(r0)
            goto L90
        L82:
            java.lang.String r5 = "Invalid maxDatagramSize ["
            java.lang.String r1 = "] in get capabilities response."
            java.lang.String r5 = defpackage.a.f(r0, r5, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        L90:
            java.lang.Throwable r0 = defpackage.ffch.c(r5)
            if (r0 != 0) goto L97
            return r5
        L97:
            cntf r5 = defpackage.cntf.a
            eyfq r5 = r5.createBuilder()
            cnte r5 = (defpackage.cnte) r5
            r5.getClass()
            cnuv r0 = defpackage.cnuv.a
            eyfq r0 = r0.createBuilder()
            cnut r0 = (defpackage.cnut) r0
            r0.getClass()
            cnuu r1 = defpackage.cnuu.FAILURE
            defpackage.cnuw.b(r1, r0)
            cnuv r0 = defpackage.cnuw.a(r0)
            defpackage.cntg.b(r0, r5)
            cntf r5 = defpackage.cntg.a(r5)
            return r5
        Lbe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnrn.a(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.cnnh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cnrj
            if (r0 == 0) goto L13
            r0 = r6
            cnrj r0 = (defpackage.cnrj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cnrj r0 = new cnrj
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            cnrn r0 = r0.d
            defpackage.ffci.b(r6)
            ffch r6 = (defpackage.ffch) r6
            java.lang.Object r6 = r6.a
            goto L43
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            defpackage.ffci.b(r6)
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = r5.g(r0)
            if (r6 == r1) goto Ld0
            r0 = r5
        L43:
            boolean r1 = defpackage.ffch.d(r6)
            if (r1 == 0) goto La2
            deqm r6 = (defpackage.deqm) r6
            cnti r1 = defpackage.cnti.a
            eyfq r1 = r1.createBuilder()
            cnth r1 = (defpackage.cnth) r1
            r1.getClass()
            cnuv r2 = defpackage.cnuv.a
            eyfq r2 = r2.createBuilder()
            cnut r2 = (defpackage.cnut) r2
            r2.getClass()
            cnuu r4 = defpackage.cnuu.SUCCESS
            defpackage.cnuw.b(r4, r2)
            cnuv r2 = defpackage.cnuw.a(r2)
            defpackage.cntj.b(r2, r1)
            cnui r2 = defpackage.cnui.a
            eyfq r2 = r2.createBuilder()
            cnug r2 = (defpackage.cnug) r2
            r2.getClass()
            cnnz r0 = r0.f
            int r6 = r6.b
            int r6 = defpackage.dert.b(r6)
            if (r6 != 0) goto L83
            goto L84
        L83:
            r3 = r6
        L84:
            cnuh r6 = defpackage.cnnz.a(r3)
            defpackage.cnuj.b(r6, r2)
            cnui r6 = defpackage.cnuj.a(r2)
            r1.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r0 = r1.instance
            cnti r0 = (defpackage.cnti) r0
            r0.d = r6
            int r6 = r0.b
            r6 = r6 | 2
            r0.b = r6
            cnti r6 = defpackage.cntj.a(r1)
        La2:
            java.lang.Throwable r0 = defpackage.ffch.c(r6)
            if (r0 != 0) goto La9
            return r6
        La9:
            cnti r6 = defpackage.cnti.a
            eyfq r6 = r6.createBuilder()
            cnth r6 = (defpackage.cnth) r6
            r6.getClass()
            cnuv r0 = defpackage.cnuv.a
            eyfq r0 = r0.createBuilder()
            cnut r0 = (defpackage.cnut) r0
            r0.getClass()
            cnuu r1 = defpackage.cnuu.FAILURE
            defpackage.cnuw.b(r1, r0)
            cnuv r0 = defpackage.cnuw.a(r0)
            defpackage.cntj.b(r0, r6)
            cnti r6 = defpackage.cntj.a(r6)
            return r6
        Ld0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnrn.b(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x03ce, code lost:
    
        if (r1 != r3) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.cnnh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffgu r18) {
        /*
            Method dump skipped, instructions count: 1019
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnrn.c(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.cnnh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.cnul r9, defpackage.ffgu r10) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnrn.d(cnul, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.cnnh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cnrm
            if (r0 == 0) goto L13
            r0 = r5
            cnrm r0 = (defpackage.cnrm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cnrm r0 = new cnrm
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.ffci.b(r5)
            ffch r5 = (defpackage.ffch) r5
            java.lang.Object r5 = r5.a
            goto L3e
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            defpackage.ffci.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.j(r0)
            if (r5 == r1) goto L9a
        L3e:
            boolean r0 = defpackage.ffch.d(r5)
            if (r0 == 0) goto L6c
            desf r5 = (defpackage.desf) r5
            cnur r5 = defpackage.cnur.a
            eyfq r5 = r5.createBuilder()
            cnuq r5 = (defpackage.cnuq) r5
            r5.getClass()
            cnuv r0 = defpackage.cnuv.a
            eyfq r0 = r0.createBuilder()
            cnut r0 = (defpackage.cnut) r0
            r0.getClass()
            cnuu r1 = defpackage.cnuu.SUCCESS
            defpackage.cnuw.b(r1, r0)
            cnuv r0 = defpackage.cnuw.a(r0)
            defpackage.cnus.b(r0, r5)
            cnur r5 = defpackage.cnus.a(r5)
        L6c:
            java.lang.Throwable r0 = defpackage.ffch.c(r5)
            if (r0 != 0) goto L73
            return r5
        L73:
            cnur r5 = defpackage.cnur.a
            eyfq r5 = r5.createBuilder()
            cnuq r5 = (defpackage.cnuq) r5
            r5.getClass()
            cnuv r0 = defpackage.cnuv.a
            eyfq r0 = r0.createBuilder()
            cnut r0 = (defpackage.cnut) r0
            r0.getClass()
            cnuu r1 = defpackage.cnuu.FAILURE
            defpackage.cnuw.b(r1, r0)
            cnuv r0 = defpackage.cnuw.a(r0)
            defpackage.cnus.b(r0, r5)
            cnur r5 = defpackage.cnus.a(r5)
            return r5
        L9a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnrn.e(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cnqx
            if (r0 == 0) goto L13
            r0 = r6
            cnqx r0 = (defpackage.cnqx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cnqx r0 = new cnqx
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
            ffhd r6 = r5.e
            ffhd r6 = defpackage.ekxi.a(r6)
            cnqy r2 = new cnqy
            r4 = 0
            r2.<init>(r4, r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.ffra.a(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            ffch r6 = (defpackage.ffch) r6
            java.lang.Object r6 = r6.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnrn.f(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cnqz
            if (r0 == 0) goto L13
            r0 = r6
            cnqz r0 = (defpackage.cnqz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cnqz r0 = new cnqz
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
            ffhd r6 = r5.e
            ffhd r6 = defpackage.ekxi.a(r6)
            cnra r2 = new cnra
            r4 = 0
            r2.<init>(r4, r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.ffra.a(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            ffch r6 = (defpackage.ffch) r6
            java.lang.Object r6 = r6.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnrn.g(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cnrb
            if (r0 == 0) goto L13
            r0 = r6
            cnrb r0 = (defpackage.cnrb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cnrb r0 = new cnrb
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
            ffhd r6 = r5.e
            ffhd r6 = defpackage.ekxi.a(r6)
            cnrd r2 = new cnrd
            r4 = 0
            r2.<init>(r4, r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.ffra.a(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            ffch r6 = (defpackage.ffch) r6
            java.lang.Object r6 = r6.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnrn.h(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.derv r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cnre
            if (r0 == 0) goto L13
            r0 = r7
            cnre r0 = (defpackage.cnre) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cnre r0 = new cnre
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r7)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.ffci.b(r7)
            ffhd r7 = r5.e
            ffhd r7 = defpackage.ekxi.a(r7)
            cnrf r2 = new cnrf
            r4 = 0
            r2.<init>(r4, r5, r6)
            r0.c = r3
            java.lang.Object r7 = defpackage.ffra.a(r7, r2, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            ffch r7 = (defpackage.ffch) r7
            java.lang.Object r6 = r7.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnrn.i(derv, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cnrg
            if (r0 == 0) goto L13
            r0 = r6
            cnrg r0 = (defpackage.cnrg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cnrg r0 = new cnrg
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
            ffhd r6 = r5.e
            ffhd r6 = defpackage.ekxi.a(r6)
            cnrh r2 = new cnrh
            r4 = 0
            r2.<init>(r4, r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.ffra.a(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            ffch r6 = (defpackage.ffch) r6
            java.lang.Object r6 = r6.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnrn.j(ffgu):java.lang.Object");
    }
}
