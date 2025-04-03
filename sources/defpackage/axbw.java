package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axbw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ axby b;
    final /* synthetic */ axbq c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axbw(ffgu ffguVar, axby axbyVar, axbq axbqVar) {
        super(2, ffguVar);
        this.b = axbyVar;
        this.c = axbqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axbw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0055, code lost:
    
        if (defpackage.fgfz.c(r5, r4) == r0) goto L19;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r4.a
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r5)     // Catch: java.lang.Throwable -> L11
            goto L58
        Ld:
            defpackage.ffci.b(r5)     // Catch: java.lang.Throwable -> L11
            goto L46
        L11:
            r5 = move-exception
            goto L66
        L13:
            defpackage.ffci.b(r5)
            java.lang.Object r5 = r4.d
            ffsk r5 = (defpackage.ffsk) r5
            axbq r5 = r4.c
            boolean r1 = r5 instanceof defpackage.axbv
            if (r1 == 0) goto L90
            axbv r5 = (defpackage.axbv) r5
            awui r5 = r5.a
            java.lang.String r1 = r5.d
            r1.getClass()
            int r1 = r1.length()
            if (r1 <= 0) goto L88
            axby r1 = r4.b     // Catch: java.lang.Throwable -> L11
            chbx r1 = r1.c     // Catch: java.lang.Throwable -> L11
            java.lang.String r5 = r5.d     // Catch: java.lang.Throwable -> L11
            r3 = 5
            elfl r5 = r1.d(r5, r3)     // Catch: java.lang.Throwable -> L11
            r5.getClass()     // Catch: java.lang.Throwable -> L11
            r4.a = r2     // Catch: java.lang.Throwable -> L11
            java.lang.Object r5 = defpackage.fgfz.c(r5, r4)     // Catch: java.lang.Throwable -> L11
            if (r5 != r0) goto L46
            goto L57
        L46:
            chbu r5 = (defpackage.chbu) r5     // Catch: java.lang.Throwable -> L11
            cgwm r1 = defpackage.cgwm.FORCE_REFRESH     // Catch: java.lang.Throwable -> L11
            elfl r5 = r5.l(r1)     // Catch: java.lang.Throwable -> L11
            r1 = 2
            r4.a = r1     // Catch: java.lang.Throwable -> L11
            java.lang.Object r5 = defpackage.fgfz.c(r5, r4)     // Catch: java.lang.Throwable -> L11
            if (r5 != r0) goto L58
        L57:
            return r0
        L58:
            entd r5 = defpackage.axby.a     // Catch: java.lang.Throwable -> L11
            ensk r5 = r5.n()     // Catch: java.lang.Throwable -> L11
            java.lang.String r0 = "Recovering by register refresh succeeds."
            r5.q(r0)     // Catch: java.lang.Throwable -> L11
            axbn r5 = defpackage.axbn.a     // Catch: java.lang.Throwable -> L11
            return r5
        L66:
            boolean r0 = defpackage.chfh.d(r5)
            if (r0 == 0) goto L7a
            entd r0 = defpackage.axby.a
            ensk r0 = r0.j()
            java.lang.String r1 = "Recovering by register refresh but fails with a transient error."
            defpackage.a.K(r0, r1, r5)
            axbn r5 = defpackage.axbn.c
            goto L87
        L7a:
            entd r0 = defpackage.axby.a
            ensk r0 = r0.j()
            java.lang.String r1 = "Recovering by register refresh but fails with a permanent error."
            defpackage.a.K(r0, r1, r5)
            axbn r5 = defpackage.axbn.d
        L87:
            return r5
        L88:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Recovering by register refresh but empty chat endpoint is found."
            r5.<init>(r0)
            throw r5
        L90:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axbw.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        axbw axbwVar = new axbw(ffguVar, this.b, this.c);
        axbwVar.d = obj;
        return axbwVar;
    }
}
