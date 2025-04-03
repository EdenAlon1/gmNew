package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cusj implements cukg {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/util/spam/rcs/RcsWithSpamHeaderProtection");
    private static final cfup b = cfvl.i(cfvl.b, "rcs_spam_protection_classify_despite_rejection", true);
    private final ffbr c;
    private final ffhd d;

    public cusj(ffbr ffbrVar, ffhd ffhdVar) {
        ffbrVar.getClass();
        ffhdVar.getClass();
        this.c = ffbrVar;
        this.d = ffhdVar;
    }

    @Override // defpackage.cukg
    public final cukx a() {
        return cukx.d;
    }

    @Override // defpackage.cukg
    public final ekzz b() {
        return eleg.f("RcsWithSpamHeaderProtection.classify");
    }

    @Override // defpackage.cukg
    public final /* synthetic */ ekzz c() {
        return cukf.a();
    }

    @Override // defpackage.cukg
    public final Object d(cujo cujoVar, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.d), new cusg(null, cujoVar, this), ffguVar);
    }

    @Override // defpackage.cukg
    public final /* synthetic */ Object e(cujo cujoVar, int i, ffgu ffguVar) {
        return cukf.b();
    }

    @Override // defpackage.cukg
    public final /* bridge */ /* synthetic */ boolean f() {
        return ((Boolean) b.e()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.cujo r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cush
            if (r0 == 0) goto L13
            r0 = r6
            cush r0 = (defpackage.cush) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cush r0 = new cush
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cusj r5 = r0.d
            defpackage.ffci.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            r0.d = r4
            r0.c = r3
            java.lang.Object r6 = r5.d(r0)
            if (r6 == r1) goto L5c
            r5 = r4
        L3f:
            aoku r6 = (defpackage.aoku) r6
            if (r6 != 0) goto L49
            r5 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L49:
            ffbr r5 = r5.c
            java.lang.Object r5 = r5.b()
            csrx r5 = (defpackage.csrx) r5
            java.util.Set r5 = r5.b
            boolean r5 = r5.contains(r6)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cusj.g(cujo, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.cusf r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.cusi
            if (r0 == 0) goto L13
            r0 = r9
            cusi r0 = (defpackage.cusi) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cusi r0 = new cusi
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r0 = r0.c
            r1 = 1
            if (r0 == 0) goto L3d
            if (r0 != r1) goto L35
            defpackage.ffci.b(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r8 = r9.booleanValue()
            r9 = 0
            if (r8 == 0) goto L30
            cula r8 = defpackage.cula.b
            goto L32
        L30:
            cula r8 = defpackage.cula.a
        L32:
            r2 = r8
            r8 = r9
            goto L4a
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3d:
            defpackage.ffci.b(r9)
            int r9 = r8.a
            if (r9 == r1) goto L47
            cula r9 = defpackage.cula.c
            goto L49
        L47:
            cula r9 = defpackage.cula.b
        L49:
            r2 = r9
        L4a:
            cula r9 = defpackage.cula.a
            boolean r9 = defpackage.ffkj.e(r2, r9)
            if (r9 == 0) goto L77
            enru r8 = defpackage.cusj.a
            ensk r8 = r8.e()
            ensn r9 = defpackage.ente.a
            java.lang.String r0 = "BugleSpam"
            r8.Y(r9, r0)
            java.lang.String r9 = "newImplementation"
            r0 = 93
            java.lang.String r1 = "com/google/android/apps/messaging/shared/util/spam/rcs/RcsWithSpamHeaderProtection"
            java.lang.String r2 = "RcsWithSpamHeaderProtection.kt"
            ensk r8 = r8.h(r1, r9, r0, r2)
            enrr r8 = (defpackage.enrr) r8
            java.lang.String r9 = "No spam warning header in incoming message, skipping RCS enforcement."
            r8.q(r9)
            cukp r8 = defpackage.cuko.a()
            return r8
        L77:
            java.lang.String r3 = r8.b
            cukp r0 = new cukp
            erer r1 = defpackage.erer.SPAM
            r5 = 0
            r6 = 24
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cusj.h(cusf, ffgu):java.lang.Object");
    }
}
