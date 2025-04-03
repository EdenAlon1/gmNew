package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjrj implements cjrc {
    public final cqoh a;
    private final effy b;

    public cjrj(effy effyVar, cqoh cqohVar) {
        effyVar.getClass();
        cqohVar.getClass();
        this.b = effyVar;
        this.a = cqohVar;
        new fgjf();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.cjrc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cjrf
            if (r0 == 0) goto L13
            r0 = r5
            cjrf r0 = (defpackage.cjrf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cjrf r0 = new cjrf
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.e(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r5 = r5 ^ r3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjrj.a(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.cjrc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cjrg
            if (r0 == 0) goto L13
            r0 = r5
            cjrg r0 = (defpackage.cjrg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cjrg r0 = new cjrg
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.f(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r5 = r5 ^ r3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjrj.b(ffgu):java.lang.Object");
    }

    @Override // defpackage.cjrc
    public final Object c(ffgu ffguVar) {
        Object b = ctzl.b(this.b, new ffji() { // from class: cjre
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                cjrk cjrkVar = (cjrk) obj;
                long epochMilli = cjrj.this.a.f().toEpochMilli();
                cjrkVar.copyOnWrite();
                cjrl cjrlVar = (cjrl) cjrkVar.instance;
                cjrl cjrlVar2 = cjrl.a;
                cjrlVar.b |= 1;
                cjrlVar.c = epochMilli;
                return ffcu.a;
            }
        }, ffguVar);
        return b == ffhh.a ? b : ffcu.a;
    }

    @Override // defpackage.cjrc
    public final Object d(ffgu ffguVar) {
        Object b = ctzl.b(this.b, new ffji() { // from class: cjrd
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                cjrk cjrkVar = (cjrk) obj;
                long epochMilli = cjrj.this.a.f().toEpochMilli();
                cjrkVar.copyOnWrite();
                cjrl cjrlVar = (cjrl) cjrkVar.instance;
                cjrl cjrlVar2 = cjrl.a;
                cjrlVar.b |= 2;
                cjrlVar.d = epochMilli;
                return ffcu.a;
            }
        }, ffguVar);
        return b == ffhh.a ? b : ffcu.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ffgu r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.cjrh
            if (r0 == 0) goto L13
            r0 = r9
            cjrh r0 = (defpackage.cjrh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cjrh r0 = new cjrh
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cjrj r0 = r0.d
            defpackage.ffci.b(r9)
            goto L48
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L31:
            defpackage.ffci.b(r9)
            effy r9 = r8.b
            com.google.common.util.concurrent.ListenableFuture r9 = r9.a()
            r9.getClass()
            r0.d = r8
            r0.c = r3
            java.lang.Object r9 = defpackage.fgfz.c(r9, r0)
            if (r9 == r1) goto L6d
            r0 = r8
        L48:
            cjrl r9 = (defpackage.cjrl) r9
            long r1 = r9.c
            cqoh r9 = r0.a
            j$.time.Instant r9 = r9.f()
            long r4 = r9.toEpochMilli()
            cjrl r9 = defpackage.cjrl.a
            long r6 = r9.c
            int r9 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r9 == 0) goto L68
            long r4 = r4 - r1
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            int r9 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r9 < 0) goto L67
            goto L68
        L67:
            r3 = 0
        L68:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            return r9
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjrj.e(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.ffgu r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.cjri
            if (r0 == 0) goto L13
            r0 = r9
            cjri r0 = (defpackage.cjri) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cjri r0 = new cjri
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cjrj r0 = r0.d
            defpackage.ffci.b(r9)
            goto L48
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L31:
            defpackage.ffci.b(r9)
            effy r9 = r8.b
            com.google.common.util.concurrent.ListenableFuture r9 = r9.a()
            r9.getClass()
            r0.d = r8
            r0.c = r3
            java.lang.Object r9 = defpackage.fgfz.c(r9, r0)
            if (r9 == r1) goto L6d
            r0 = r8
        L48:
            cjrl r9 = (defpackage.cjrl) r9
            long r1 = r9.d
            cqoh r9 = r0.a
            j$.time.Instant r9 = r9.f()
            long r4 = r9.toEpochMilli()
            cjrl r9 = defpackage.cjrl.a
            long r6 = r9.d
            int r9 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r9 == 0) goto L68
            long r4 = r4 - r1
            r0 = 604800000(0x240c8400, double:2.988109026E-315)
            int r9 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r9 < 0) goto L67
            goto L68
        L67:
            r3 = 0
        L68:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            return r9
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjrj.f(ffgu):java.lang.Object");
    }
}
