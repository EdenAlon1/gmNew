package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgdm extends ceut {
    public final Optional b;
    public final ffbr c;
    public final asjt d;
    private final ffsk f;
    private final eixo g;
    private final ejvb h;
    private final cgfd i;
    private final ffbr j;
    private static final cfup e = cfvl.e(cfvl.b, "gaia_auth_check_result_max_retry", 3);
    public static final cskc a = cskc.g("BugleGaia", "GaiaAuthCheckResultHandler");

    public cgdm(ffsk ffskVar, Optional optional, eixo eixoVar, ejvb ejvbVar, cgfd cgfdVar, ffbr ffbrVar, ffbr ffbrVar2, asjt asjtVar) {
        ffskVar.getClass();
        optional.getClass();
        eixoVar.getClass();
        ejvbVar.getClass();
        cgfdVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        asjtVar.getClass();
        this.f = ffskVar;
        this.b = optional;
        this.g = eixoVar;
        this.h = ejvbVar;
        this.i = cgfdVar;
        this.j = ffbrVar;
        this.c = ffbrVar2;
        this.d = asjtVar;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        Object e2 = e.e();
        e2.getClass();
        l.c(((Number) e2).intValue());
        l.b(cevc.WORKMANAGER_ONLY);
        l.f(poa.LINEAR);
        poh pohVar = new poh();
        pohVar.c(2);
        ((ceti) l).a = pohVar.a();
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("GaiaAuthCheckResultHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        eyhz parserForType = cdvx.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        elfl c;
        cdvx cdvxVar = (cdvx) eyhsVar;
        cdvxVar.getClass();
        c = axol.c(this.f, ffhe.a, ffsm.a, new cgdl(this, cdvxVar, ceuwVar, null));
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b2, code lost:
    
        if (r10 != r1) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(int r8, defpackage.ceuw r9, defpackage.ffgu r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.cgdi
            if (r0 == 0) goto L13
            r0 = r10
            cgdi r0 = (defpackage.cgdi) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            cgdi r0 = new cgdi
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            int r8 = r0.b
            defpackage.ffci.b(r10)
            goto Lb4
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            int r8 = r0.b
            java.lang.Object r9 = r0.a
            cgdm r2 = r0.f
            defpackage.ffci.b(r10)
            goto L62
        L3f:
            defpackage.ffci.b(r10)
            ejvb r10 = r7.h
            eixo r2 = r7.g
            ejuh r2 = r2.b()
            ejwa r5 = defpackage.ejwa.DONT_CARE
            com.google.common.util.concurrent.ListenableFuture r10 = r10.b(r2, r5)
            r10.getClass()
            r0.f = r7
            r0.a = r9
            r0.b = r8
            r0.e = r4
            java.lang.Object r10 = defpackage.fgfz.c(r10, r0)
            if (r10 == r1) goto Lcc
            r2 = r7
        L62:
            java.util.List r10 = (java.util.List) r10
            if (r10 == 0) goto Lba
            java.util.Iterator r10 = r10.iterator()
        L6a:
            boolean r4 = r10.hasNext()
            r5 = 0
            if (r4 == 0) goto L83
            java.lang.Object r4 = r10.next()
            r6 = r4
            eixn r6 = (defpackage.eixn) r6
            eisx r6 = r6.a()
            eisz r6 = (defpackage.eisz) r6
            int r6 = r6.a
            if (r6 != r8) goto L6a
            goto L84
        L83:
            r4 = r5
        L84:
            eixn r4 = (defpackage.eixn) r4
            if (r4 == 0) goto Lba
            eixz r10 = r4.b()
            java.lang.String r10 = r10.k
            java.lang.String r6 = "pseudonymous"
            boolean r10 = defpackage.ffkj.e(r10, r6)
            if (r10 == 0) goto La2
            cskc r9 = defpackage.cgdm.a
            java.lang.String r10 = "Gaia authentication not performed because account is pseudonymous"
            r9.r(r10)
            ceyt r9 = defpackage.ceyt.k()
            goto Lb7
        La2:
            eisx r10 = r4.a()
            r0.f = r2
            r0.a = r5
            r0.b = r8
            r0.e = r3
            java.lang.Object r10 = r2.l(r10, r9, r0)
            if (r10 == r1) goto Lcc
        Lb4:
            r9 = r10
            ceyt r9 = (defpackage.ceyt) r9
        Lb7:
            if (r9 == 0) goto Lba
            return r9
        Lba:
            cskc r9 = defpackage.cgdm.a
            java.lang.String r10 = "Get GaiaAuthCheckResult failed because unable to find account for Id "
            java.lang.String r0 = "."
            java.lang.String r8 = defpackage.a.f(r8, r10, r0)
            r9.r(r8)
            ceyt r8 = defpackage.ceyt.k()
            return r8
        Lcc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgdm.k(int, ceuw, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073 A[Catch: Exception -> 0x002e, TryCatch #1 {Exception -> 0x002e, blocks: (B:11:0x002a, B:12:0x005a, B:14:0x0073, B:15:0x007e, B:17:0x0082, B:18:0x009a), top: B:10:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082 A[Catch: Exception -> 0x002e, TryCatch #1 {Exception -> 0x002e, blocks: (B:11:0x002a, B:12:0x005a, B:14:0x0073, B:15:0x007e, B:17:0x0082, B:18:0x009a), top: B:10:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.eisx r6, defpackage.ceuw r7, defpackage.ffgu r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.cgdj
            if (r0 == 0) goto L13
            r0 = r8
            cgdj r0 = (defpackage.cgdj) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cgdj r0 = new cgdj
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.a
            eisz r6 = r0.f
            cgdm r0 = r0.e
            defpackage.ffci.b(r8)     // Catch: java.lang.Exception -> L2e
            goto L5a
        L2e:
            r6 = move-exception
            goto La1
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            defpackage.ffci.b(r8)
            j$.util.Optional r8 = r5.b     // Catch: java.lang.Exception -> L9f
            java.lang.Object r8 = r8.orElseThrow()     // Catch: java.lang.Exception -> L9f
            cgcw r8 = (defpackage.cgcw) r8     // Catch: java.lang.Exception -> L9f
            elfl r8 = r8.a(r6)     // Catch: java.lang.Exception -> L9f
            r0.e = r5     // Catch: java.lang.Exception -> L9f
            r2 = r6
            eisz r2 = (defpackage.eisz) r2     // Catch: java.lang.Exception -> L9f
            r0.f = r2     // Catch: java.lang.Exception -> L9f
            r0.a = r7     // Catch: java.lang.Exception -> L9f
            r0.d = r3     // Catch: java.lang.Exception -> L9f
            java.lang.Object r8 = defpackage.fgfz.c(r8, r0)     // Catch: java.lang.Exception -> L9f
            if (r8 != r1) goto L59
            return r1
        L59:
            r0 = r5
        L5a:
            cgdh r8 = (defpackage.cgdh) r8     // Catch: java.lang.Exception -> L2e
            cgfd r1 = r0.i     // Catch: java.lang.Exception -> L2e
            ffbr r2 = r1.g     // Catch: java.lang.Exception -> L2e
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Exception -> L2e
            cgdo r2 = (defpackage.cgdo) r2     // Catch: java.lang.Exception -> L2e
            java.util.concurrent.atomic.AtomicReference r2 = r2.c     // Catch: java.lang.Exception -> L2e
            j$.util.Optional r3 = j$.util.Optional.of(r8)     // Catch: java.lang.Exception -> L2e
            r2.set(r3)     // Catch: java.lang.Exception -> L2e
            boolean r2 = r8 instanceof defpackage.cgdg     // Catch: java.lang.Exception -> L2e
            if (r2 == 0) goto L7e
            ejvp r1 = r1.e     // Catch: java.lang.Exception -> L2e
            elfl r2 = defpackage.elfo.e(r4)     // Catch: java.lang.Exception -> L2e
            ejui r3 = defpackage.cgfd.a     // Catch: java.lang.Exception -> L2e
            r1.a(r2, r3)     // Catch: java.lang.Exception -> L2e
        L7e:
            boolean r8 = r8 instanceof defpackage.cgdf     // Catch: java.lang.Exception -> L2e
            if (r8 == 0) goto L9a
            ffbr r8 = r0.j     // Catch: java.lang.Exception -> L2e
            java.lang.Object r8 = r8.b()     // Catch: java.lang.Exception -> L2e
            cgdo r8 = (defpackage.cgdo) r8     // Catch: java.lang.Exception -> L2e
            r6.getClass()     // Catch: java.lang.Exception -> L2e
            java.util.Set r8 = r8.b     // Catch: java.lang.Exception -> L2e
            eisz r6 = (defpackage.eisz) r6     // Catch: java.lang.Exception -> L2e
            int r6 = r6.a     // Catch: java.lang.Exception -> L2e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L2e
            r8.add(r6)     // Catch: java.lang.Exception -> L2e
        L9a:
            ceyt r6 = defpackage.ceyt.i()     // Catch: java.lang.Exception -> L2e
            return r6
        L9f:
            r6 = move-exception
            r0 = r5
        La1:
            boolean r7 = r7.c()
            if (r7 == 0) goto Laf
            cskc r7 = defpackage.cgdm.a
            java.lang.String r8 = "Getting gaia auth check result failed, will retry"
            r7.s(r8, r6)
            goto Lc1
        Laf:
            ffsk r7 = r0.f
            cgdk r8 = new cgdk
            r8.<init>(r0, r6, r4)
            r0 = 3
            defpackage.axol.k(r7, r4, r8, r0)
            cskc r7 = defpackage.cgdm.a
            java.lang.String r8 = "Getting gaia auth check result failed, no retries left"
            r7.s(r8, r6)
        Lc1:
            ceyt r6 = defpackage.ceyt.m()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgdm.l(eisx, ceuw, ffgu):java.lang.Object");
    }
}
