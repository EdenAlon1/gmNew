package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cppk implements cppg {
    private static final cfup a = cfvl.h(cfvl.b, "penpal_oauth2_transport_scope", "https://www.googleapis.com/auth/tachyon");
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/tachygram/chat/penpal/PenpalGaiaOauth2TokenProviderImpl");
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final akzt f;

    public cppk(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, akzt akztVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        akztVar.getClass();
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = akztVar;
    }

    static /* synthetic */ Exception e(cppk cppkVar, cppl cpplVar) {
        return cppkVar.f(cpplVar, false);
    }

    private final Exception f(cppl cpplVar, boolean z) {
        return new esqb(cpplVar.a, new espw(espt.q, z ? espv.b : espv.a), cpplVar);
    }

    @Override // defpackage.cppg
    public final Object a(ffgu ffguVar) {
        return c(ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.eisx r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cpph
            if (r0 == 0) goto L13
            r0 = r6
            cpph r0 = (defpackage.cpph) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cpph r0 = new cpph
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cppk r5 = r0.d
            defpackage.ffci.b(r6)
            goto L4b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            ffbr r6 = r4.d
            java.lang.Object r6 = r6.b()
            ejar r6 = (defpackage.ejar) r6
            com.google.common.util.concurrent.ListenableFuture r5 = r6.a(r5)
            r0.d = r4
            r0.c = r3
            java.lang.Object r6 = defpackage.fgfz.c(r5, r0)
            if (r6 == r1) goto L63
            r5 = r4
        L4b:
            android.accounts.Account r6 = (android.accounts.Account) r6
            if (r6 == 0) goto L50
            return r6
        L50:
            akzt r6 = r5.f
            java.lang.String r0 = "Bugle.Penpal.Transport.OAuth2.Failure.AccountIdNotFound"
            r6.c(r0)
            cppl r6 = new cppl
            java.lang.String r0 = "Penpal failed to retrieve Android Account for AccountId"
            r6.<init>(r0)
            java.lang.Exception r5 = e(r5, r6)
            throw r5
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cppk.b(eisx, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffgu r10) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cppk.c(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cppj
            if (r0 == 0) goto L13
            r0 = r5
            cppj r0 = (defpackage.cppj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cppj r0 = new cppj
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cppk r0 = r0.d
            defpackage.ffci.b(r5)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.ffci.b(r5)
            ffbr r5 = r4.e
            java.lang.Object r5 = r5.b()
            cjeo r5 = (defpackage.cjeo) r5
            r0.d = r4
            r0.c = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 == r1) goto L5f
            r0 = r4
        L47:
            eisx r5 = (defpackage.eisx) r5
            if (r5 == 0) goto L4c
            return r5
        L4c:
            akzt r5 = r0.f
            java.lang.String r1 = "Bugle.Penpal.Transport.OAuth2.Failure.NoPenpalAccount"
            r5.c(r1)
            cppl r5 = new cppl
            java.lang.String r1 = "No Penpal active account set or account invalid"
            r5.<init>(r1)
            java.lang.Exception r5 = e(r0, r5)
            throw r5
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cppk.d(ffgu):java.lang.Object");
    }
}
