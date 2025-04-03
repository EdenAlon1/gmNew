package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjrb implements cjqj {
    private static final enru c = enru.c("com/google/android/apps/messaging/shared/profile/analytics/ProfileRecurringMetricsLoggerImpl");
    public final ffbr a;
    public final ffbr b;
    private final ffbr d;
    private final ffsk e;
    private final cjws f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final ffhd j;
    private final ffji k;

    public cjrb(ffbr ffbrVar, ffsk ffskVar, cjws cjwsVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffhd ffhdVar, ffbr ffbrVar5, ffbr ffbrVar6) {
        ffbrVar.getClass();
        ffskVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffhdVar.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        this.d = ffbrVar;
        this.e = ffskVar;
        this.f = cjwsVar;
        this.g = ffbrVar2;
        this.h = ffbrVar3;
        this.i = ffbrVar4;
        this.j = ffhdVar;
        this.a = ffbrVar5;
        this.b = ffbrVar6;
        this.k = new eogl(new cjqv(this, null));
    }

    @Override // defpackage.cjqj
    public final elfl a() {
        ffhe ffheVar = ffhe.a;
        ffsm ffsmVar = ffsm.a;
        return axol.a(ffra.b(this.e, ekxi.a(ffheVar), ffsmVar, new cjqr(null, this)));
    }

    @Override // defpackage.cjqj
    public final elfl b() {
        ffhe ffheVar = ffhe.a;
        ffsm ffsmVar = ffsm.a;
        return axol.a(ffra.b(this.e, ekxi.a(ffheVar), ffsmVar, new cjqu(null, this)));
    }

    @Override // defpackage.cjqj
    public final elfl c() {
        ffhe ffheVar = ffhe.a;
        ffsm ffsmVar = ffsm.a;
        return axol.a(ffra.b(this.e, ekxi.a(ffheVar), ffsmVar, new cjra(null, this)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0139, code lost:
    
        if (r10 != r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0105, code lost:
    
        if (r10 != r1) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x013f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0083 -> B:38:0x0084). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ffgu r10) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjrb.d(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cjqo
            if (r0 == 0) goto L13
            r0 = r6
            cjqo r0 = (defpackage.cjqo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cjqo r0 = new cjqo
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.ffci.b(r6)     // Catch: java.lang.Exception -> L27
            return r6
        L27:
            r6 = move-exception
            goto L4a
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            defpackage.ffci.b(r6)
            ffhd r6 = r5.j     // Catch: java.lang.Exception -> L27
            ffhd r6 = defpackage.ekxi.a(r6)     // Catch: java.lang.Exception -> L27
            cjqn r2 = new cjqn     // Catch: java.lang.Exception -> L27
            r4 = 0
            r2.<init>(r4)     // Catch: java.lang.Exception -> L27
            r0.c = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r6 = defpackage.ffra.a(r6, r2, r0)     // Catch: java.lang.Exception -> L27
            if (r6 != r1) goto L49
            return r1
        L49:
            return r6
        L4a:
            enru r0 = defpackage.cjrb.c
            ensk r0 = r0.i()
            ensn r1 = defpackage.ente.a
            java.lang.String r2 = "BugleProfiles"
            r0.Y(r1, r2)
            enrr r0 = (defpackage.enrr) r0
            ensk r6 = r0.g(r6)
            java.lang.String r0 = "getPeopleProfileConsumerState"
            r1 = 130(0x82, float:1.82E-43)
            java.lang.String r2 = "com/google/android/apps/messaging/shared/profile/analytics/ProfileRecurringMetricsLoggerImpl"
            java.lang.String r3 = "ProfileRecurringMetricsLoggerImpl.kt"
            ensk r6 = r6.h(r2, r0, r1, r3)
            enrr r6 = (defpackage.enrr) r6
            java.lang.String r0 = "Unexpected error in ProfileRecurringMetricsLoggerImpl#getPeopleProfileConsumerState"
            r6.q(r0)
            eorh r6 = defpackage.eorh.a
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjrb.e(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cjqt
            if (r0 == 0) goto L13
            r0 = r6
            cjqt r0 = (defpackage.cjqt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cjqt r0 = new cjqt
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.ffci.b(r6)     // Catch: java.lang.Exception -> L27
            return r6
        L27:
            r6 = move-exception
            goto L4a
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            defpackage.ffci.b(r6)
            ffhd r6 = r5.j     // Catch: java.lang.Exception -> L27
            ffhd r6 = defpackage.ekxi.a(r6)     // Catch: java.lang.Exception -> L27
            cjqs r2 = new cjqs     // Catch: java.lang.Exception -> L27
            r4 = 0
            r2.<init>(r4, r5)     // Catch: java.lang.Exception -> L27
            r0.c = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r6 = defpackage.ffra.a(r6, r2, r0)     // Catch: java.lang.Exception -> L27
            if (r6 != r1) goto L49
            return r1
        L49:
            return r6
        L4a:
            enru r0 = defpackage.cjrb.c
            ensk r0 = r0.i()
            ensn r1 = defpackage.ente.a
            java.lang.String r2 = "BugleProfiles"
            r0.Y(r1, r2)
            enrr r0 = (defpackage.enrr) r0
            ensk r6 = r0.g(r6)
            java.lang.String r0 = "getPeopleProfileProducerState"
            r1 = 105(0x69, float:1.47E-43)
            java.lang.String r2 = "com/google/android/apps/messaging/shared/profile/analytics/ProfileRecurringMetricsLoggerImpl"
            java.lang.String r3 = "ProfileRecurringMetricsLoggerImpl.kt"
            ensk r6 = r6.h(r2, r0, r1, r3)
            enrr r6 = (defpackage.enrr) r6
            java.lang.String r0 = "Unexpected error in ProfileRecurringMetricsLoggerImpl#getPeopleProfileProducerState"
            r6.q(r0)
            eorl r6 = defpackage.eorl.a
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjrb.f(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x008b, code lost:
    
        if (r9 != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b6, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        if (r9 != r1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x008b -> B:11:0x008d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.ffgu r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.cjqw
            if (r0 == 0) goto L13
            r0 = r9
            cjqw r0 = (defpackage.cjqw) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cjqw r0 = new cjqw
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r2 = r0.a
            defpackage.ffci.b(r9)
            goto L8d
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            defpackage.ffci.b(r9)
            goto L57
        L39:
            defpackage.ffci.b(r9)
            ffbr r9 = r8.h
            java.lang.Object r9 = r9.b()
            aqvh r9 = (defpackage.aqvh) r9
            aqge r9 = r9.a()
            elfl r9 = r9.b()
            r9.getClass()
            r0.d = r5
            java.lang.Object r9 = defpackage.fgfz.c(r9, r0)
            if (r9 == r1) goto Lb6
        L57:
            r9.getClass()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            boolean r2 = r9 instanceof java.util.Collection
            if (r2 == 0) goto L6a
            r2 = r9
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L6a
            goto Lb1
        L6a:
            java.util.Iterator r9 = r9.iterator()
            r2 = r9
        L6f:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto Lb1
            java.lang.Object r9 = r2.next()
            aqux r9 = (defpackage.aqux) r9
            j$.util.Optional r6 = j$.util.Optional.empty()
            elfl r9 = r9.x(r5, r6)
            r0.a = r2
            r0.d = r3
            java.lang.Object r9 = defpackage.fgfz.c(r9, r0)
            if (r9 == r1) goto Lb6
        L8d:
            j$.util.Optional r9 = (j$.util.Optional) r9
            cjqk r6 = new cjqk
            r6.<init>()
            cjql r7 = new cjql
            r7.<init>()
            j$.util.Optional r9 = r9.map(r7)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r9 = r9.orElse(r6)
            r9.getClass()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L6f
            r4 = r5
        Lb1:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r4)
            return r9
        Lb6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjrb.g(ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(boolean r10, defpackage.ffgu r11) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjrb.h(boolean, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(boolean r10, defpackage.ffgu r11) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjrb.i(boolean, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
    
        if (r4.h(r7, r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.ffgu r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.cjqz
            if (r0 == 0) goto L13
            r0 = r7
            cjqz r0 = (defpackage.cjqz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cjqz r0 = new cjqz
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.ffci.b(r7)
            goto L89
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Boolean r2 = r0.e
            cjrb r4 = r0.d
            defpackage.ffci.b(r7)
            goto L74
        L3d:
            cjrb r2 = r0.d
            defpackage.ffci.b(r7)
            goto L5d
        L43:
            defpackage.ffci.b(r7)
            ffbr r7 = r6.g
            java.lang.Object r7 = r7.b()
            cgfd r7 = (defpackage.cgfd) r7
            elfl r7 = r7.a()
            r0.d = r6
            r0.c = r5
            java.lang.Object r7 = defpackage.fgfz.c(r7, r0)
            if (r7 == r1) goto L8c
            r2 = r6
        L5d:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            r7.getClass()
            boolean r5 = r7.booleanValue()
            r0.d = r2
            r0.e = r7
            r0.c = r4
            java.lang.Object r4 = r2.i(r5, r0)
            if (r4 == r1) goto L8c
            r4 = r2
            r2 = r7
        L74:
            r2.getClass()
            boolean r7 = r2.booleanValue()
            r2 = 0
            r0.d = r2
            r0.e = r2
            r0.c = r3
            java.lang.Object r7 = r4.h(r7, r0)
            if (r7 != r1) goto L89
            goto L8c
        L89:
            ffcu r7 = defpackage.ffcu.a
            return r7
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjrb.j(ffgu):java.lang.Object");
    }
}
