package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgdb implements cgcw {
    private static final cskc b = cskc.g("BugleGaia", "BugleGaiaAuthWrapperImpl");
    public final ffbr a;
    private final ffsk c;
    private final ekos d;

    public cgdb(ffsk ffskVar, ekos ekosVar, ffbr ffbrVar) {
        ffskVar.getClass();
        ekosVar.getClass();
        ffbrVar.getClass();
        this.c = ffskVar;
        this.d = ekosVar;
        this.a = ffbrVar;
    }

    @Override // defpackage.cgcw
    public final elfl a(eisx eisxVar) {
        elfl c;
        eisxVar.getClass();
        c = axol.c(this.c, ffhe.a, ffsm.a, new cgcx(this, eisxVar, null));
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r7v0, types: [eisx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.eisx r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.cgcy
            if (r0 == 0) goto L13
            r0 = r8
            cgcy r0 = (defpackage.cgcy) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cgcy r0 = new cgcy
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 3
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r7 = r0.a
            cgdb r0 = r0.e
            defpackage.ffci.b(r8)     // Catch: defpackage.dezu -> L2d com.google.android.gms.auth.UserRecoverableAuthException -> L2f android.accounts.NetworkErrorException -> L59
            goto L53
        L2d:
            r7 = move-exception
            goto L70
        L2f:
            r8 = move-exception
            goto L90
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            defpackage.ffci.b(r8)
            ekos r8 = r6.d     // Catch: android.accounts.NetworkErrorException -> L59 defpackage.dezu -> L6e com.google.android.gms.auth.UserRecoverableAuthException -> L8e
            com.google.common.util.concurrent.ListenableFuture r8 = r8.b(r7)     // Catch: android.accounts.NetworkErrorException -> L59 defpackage.dezu -> L6e com.google.android.gms.auth.UserRecoverableAuthException -> L8e
            r8.getClass()     // Catch: android.accounts.NetworkErrorException -> L59 defpackage.dezu -> L6e com.google.android.gms.auth.UserRecoverableAuthException -> L8e
            r0.e = r6     // Catch: android.accounts.NetworkErrorException -> L59 defpackage.dezu -> L6e com.google.android.gms.auth.UserRecoverableAuthException -> L8e
            r0.a = r7     // Catch: android.accounts.NetworkErrorException -> L59 defpackage.dezu -> L6e com.google.android.gms.auth.UserRecoverableAuthException -> L8e
            r0.d = r4     // Catch: android.accounts.NetworkErrorException -> L59 defpackage.dezu -> L6e com.google.android.gms.auth.UserRecoverableAuthException -> L8e
            java.lang.Object r8 = defpackage.fgfz.c(r8, r0)     // Catch: android.accounts.NetworkErrorException -> L59 defpackage.dezu -> L6e com.google.android.gms.auth.UserRecoverableAuthException -> L8e
            if (r8 != r1) goto L52
            return r1
        L52:
            r0 = r6
        L53:
            cgdf r8 = new cgdf     // Catch: defpackage.dezu -> L2d com.google.android.gms.auth.UserRecoverableAuthException -> L2f android.accounts.NetworkErrorException -> L59
            r8.<init>()     // Catch: defpackage.dezu -> L2d com.google.android.gms.auth.UserRecoverableAuthException -> L2f android.accounts.NetworkErrorException -> L59
            return r8
        L59:
            r7 = move-exception
            cskc r8 = defpackage.cgdb.b
            csjb r8 = r8.e()
            java.lang.String r0 = "Network error during gaia auth check"
            r8.I(r0)
            r8.s(r7)
            cgde r7 = new cgde
            r7.<init>()
            goto Lc8
        L6e:
            r7 = move-exception
            r0 = r6
        L70:
            cskc r8 = defpackage.cgdb.b
            csjb r8 = r8.e()
            java.lang.String r1 = "Unrecoverable error detected for account"
            r8.I(r1)
            r8.s(r7)
            ffsk r8 = r0.c
            cgda r1 = new cgda
            r1.<init>(r0, r7, r5)
            defpackage.axol.k(r8, r5, r1, r3)
            cgde r7 = new cgde
            r7.<init>()
            goto Lc8
        L8e:
            r8 = move-exception
            r0 = r6
        L90:
            cskc r1 = defpackage.cgdb.b
            csjb r2 = r1.e()
            java.lang.String r4 = "User recoverable error detected for account"
            r2.I(r4)
            r2.s(r8)
            android.content.Intent r2 = r8.a()
            if (r2 != 0) goto Lc0
            csjb r7 = r1.e()
            java.lang.String r1 = "User recoverable error has null intent"
            r7.I(r1)
            r7.r()
            ffsk r7 = r0.c
            cgcz r1 = new cgcz
            r1.<init>(r0, r8, r5)
            defpackage.axol.k(r7, r5, r1, r3)
            cgde r7 = new cgde
            r7.<init>()
            goto Lc8
        Lc0:
            cgdg r8 = new cgdg
            eisx r7 = (defpackage.eisx) r7
            r8.<init>(r7, r2)
            r7 = r8
        Lc8:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgdb.b(eisx, ffgu):java.lang.Object");
    }
}
