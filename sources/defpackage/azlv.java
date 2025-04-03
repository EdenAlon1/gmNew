package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azlv implements azpx, azqd {
    public final ffbr a;
    public final azei b;
    public final aolr c;
    public final ffsk d;
    private final ffbr e;
    private final ffsk f;

    public azlv(ffbr ffbrVar, ffbr ffbrVar2, azei azeiVar, aolr aolrVar, ffsk ffskVar, ffsk ffskVar2) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        azeiVar.getClass();
        aolrVar.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        this.a = ffbrVar;
        this.e = ffbrVar2;
        this.b = azeiVar;
        this.c = aolrVar;
        this.f = ffskVar;
        this.d = ffskVar2;
    }

    @Override // defpackage.azpx
    public final elfl a() {
        elfl c;
        c = axol.c(this.f, ffhe.a, ffsm.a, new azlh(this, null));
        return c;
    }

    @Override // defpackage.azpx
    public final elfl b(azsu azsuVar) {
        elfl c;
        c = axol.c(this.f, ffhe.a, ffsm.a, new azlk(this, azsuVar, null));
        return c;
    }

    @Override // defpackage.azqd
    @ffbs
    public final elfl c() {
        elfl c;
        c = axol.c(this.f, ffhe.a, ffsm.a, new azlm(this, null));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.azpx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.azlg
            if (r0 == 0) goto L13
            r0 = r6
            azlg r0 = (defpackage.azlg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            azlg r0 = new azlg
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r6)
            return r6
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            azlv r2 = r0.d
            defpackage.ffci.b(r6)
            goto L46
        L38:
            defpackage.ffci.b(r6)
            r0.d = r5
            r0.c = r4
            java.lang.Object r6 = r5.i(r0)
            if (r6 == r1) goto L5f
            r2 = r5
        L46:
            azol r6 = (defpackage.azol) r6
            ffbr r2 = r2.a
            java.lang.Object r2 = r2.b()
            azmn r2 = (defpackage.azmn) r2
            java.util.Set r6 = r6.a
            r4 = 0
            r0.d = r4
            r0.c = r3
            java.lang.Object r6 = r2.c(r6, r0)
            if (r6 != r1) goto L5e
            goto L5f
        L5e:
            return r6
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azlv.d(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.azpx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.azli
            if (r0 == 0) goto L13
            r0 = r6
            azli r0 = (defpackage.azli) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            azli r0 = new azli
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ekzz r0 = r0.d
            defpackage.ffci.b(r6)     // Catch: java.lang.Throwable -> L29
            goto L51
        L29:
            r6 = move-exception
            goto L5b
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            defpackage.ffci.b(r6)
            java.lang.String r6 = "BaseMyIdentityManager::getAll"
            ekzz r6 = defpackage.eleg.f(r6)
            ffbr r2 = r5.a     // Catch: java.lang.Throwable -> L57
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L57
            azmn r2 = (defpackage.azmn) r2     // Catch: java.lang.Throwable -> L57
            r0.d = r6     // Catch: java.lang.Throwable -> L57
            r0.c = r3     // Catch: java.lang.Throwable -> L57
            java.lang.Object r0 = r2.b(r0)     // Catch: java.lang.Throwable -> L57
            if (r0 == r1) goto L56
            r4 = r0
            r0 = r6
            r6 = r4
        L51:
            r1 = 0
            defpackage.ffig.a(r0, r1)
            return r6
        L56:
            return r1
        L57:
            r0 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L5b:
            throw r6     // Catch: java.lang.Throwable -> L5c
        L5c:
            r1 = move-exception
            defpackage.ffig.a(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azlv.e(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.azpx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.azsu r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.azlj
            if (r0 == 0) goto L13
            r0 = r7
            azlj r0 = (defpackage.azlj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            azlj r0 = new azlj
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ekzz r6 = r0.d
            defpackage.ffci.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L51
        L29:
            r7 = move-exception
            goto L5b
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.ffci.b(r7)
            java.lang.String r7 = "BaseMyIdentityManager::getMyIdentity"
            ekzz r7 = defpackage.eleg.f(r7)
            ffbr r2 = r5.a     // Catch: java.lang.Throwable -> L57
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L57
            azmn r2 = (defpackage.azmn) r2     // Catch: java.lang.Throwable -> L57
            r0.d = r7     // Catch: java.lang.Throwable -> L57
            r0.c = r3     // Catch: java.lang.Throwable -> L57
            java.lang.Object r6 = r2.d(r6, r0)     // Catch: java.lang.Throwable -> L57
            if (r6 == r1) goto L56
            r4 = r7
            r7 = r6
            r6 = r4
        L51:
            r0 = 0
            defpackage.ffig.a(r6, r0)
            return r7
        L56:
            return r1
        L57:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L5b:
            throw r7     // Catch: java.lang.Throwable -> L5c
        L5c:
            r0 = move-exception
            defpackage.ffig.a(r6, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azlv.f(azsu, ffgu):java.lang.Object");
    }

    @Override // defpackage.azpx
    public final Object g(int i, ffgu ffguVar) {
        throw new ffce("Not implemented as expected");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.azqd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.azll
            if (r0 == 0) goto L13
            r0 = r5
            azll r0 = (defpackage.azll) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            azll r0 = new azll
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            azlv r0 = r0.d
            defpackage.ffci.b(r5)
            goto L40
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.ffci.b(r5)
            r0.d = r4
            r0.c = r3
            java.lang.Object r5 = r4.i(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            r0 = r4
        L40:
            azol r5 = (defpackage.azol) r5
            azei r5 = r0.b
            azld r0 = new azld
            r0.<init>()
            r5.d(r0)
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azlv.h(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.ffgu r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.azlq
            if (r0 == 0) goto L13
            r0 = r7
            azlq r0 = (defpackage.azlq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            azlq r0 = new azlq
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ekzz r0 = r0.d
            defpackage.ffci.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L5d
        L29:
            r7 = move-exception
            goto L67
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            defpackage.ffci.b(r7)
            java.lang.String r7 = "BaseMyIdentityManager::updateMyIdentities"
            ekzz r7 = defpackage.eleg.f(r7)
            ffbr r2 = r6.a     // Catch: java.lang.Throwable -> L63
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L63
            azmn r2 = (defpackage.azmn) r2     // Catch: java.lang.Throwable -> L63
            ffbr r4 = r6.e     // Catch: java.lang.Throwable -> L63
            java.lang.Object r4 = r4.b()     // Catch: java.lang.Throwable -> L63
            ctwb r4 = (defpackage.ctwb) r4     // Catch: java.lang.Throwable -> L63
            java.util.List r4 = r4.m()     // Catch: java.lang.Throwable -> L63
            r0.d = r7     // Catch: java.lang.Throwable -> L63
            r0.c = r3     // Catch: java.lang.Throwable -> L63
            java.lang.Object r0 = r2.e(r4, r0)     // Catch: java.lang.Throwable -> L63
            if (r0 == r1) goto L62
            r5 = r0
            r0 = r7
            r7 = r5
        L5d:
            r1 = 0
            defpackage.ffig.a(r0, r1)
            return r7
        L62:
            return r1
        L63:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L67:
            throw r7     // Catch: java.lang.Throwable -> L68
        L68:
            r1 = move-exception
            defpackage.ffig.a(r0, r7)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azlv.i(ffgu):java.lang.Object");
    }

    @Override // defpackage.azpx
    public final void j(azmp azmpVar) {
        azmpVar.getClass();
        this.b.e(azmpVar);
    }

    @Override // defpackage.azpx
    public final void k(azmp azmpVar) {
        azmpVar.getClass();
        this.b.f(azmpVar);
    }
}
