package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzgl extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ bzgo d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzgl(bzgo bzgoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = bzgoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzgl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x008f, code lost:
    
        if (r2.d(r3, r8) != r0) goto L14;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r8.c
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 == r2) goto L10
            java.lang.Object r0 = r8.a
            defpackage.ffci.b(r9)
            goto L92
        L10:
            java.lang.Object r1 = r8.b
            java.lang.Object r2 = r8.a
            defpackage.ffci.b(r9)
            r7 = r2
            r2 = r1
            r1 = r7
            goto L36
        L1b:
            defpackage.ffci.b(r9)
            fflb r1 = new fflb
            r1.<init>()
            bzgo r9 = r8.d
            comc r9 = r9.c()
            r8.a = r1
            r8.b = r1
            r8.c = r2
            java.lang.Object r9 = r9.c(r8)
            if (r9 == r0) goto L97
            r2 = r1
        L36:
            bzgg r9 = (defpackage.bzgg) r9
            java.lang.String r9 = r9.c
            r9.getClass()
            fflb r2 = (defpackage.fflb) r2
            r2.a = r9
            r9 = r1
            fflb r9 = (defpackage.fflb) r9
            java.lang.Object r2 = r9.a
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            if (r2 != 0) goto L91
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
            r9.a = r2
            enru r2 = defpackage.bzgo.a
            ensk r2 = r2.h()
            ensn r3 = defpackage.ente.a
            java.lang.String r4 = "BugleDittoRcs"
            r2.Y(r3, r4)
            java.lang.String r3 = "invokeSuspend"
            r4 = 71
            java.lang.String r5 = "com/google/android/apps/messaging/shared/datamodel/ditto/directrcs/CryptoKeyDataServiceImpl$getMultiDeviceUserId$1"
            java.lang.String r6 = "CryptoKeyDataServiceImpl.kt"
            ensk r2 = r2.h(r5, r3, r4, r6)
            enrr r2 = (defpackage.enrr) r2
            java.lang.String r3 = "Generated a user id for multi-device user. Storing it in DITTO_RCS_CRYPTO_KEY_SETTINGS"
            r2.q(r3)
            bzgo r2 = r8.d
            comc r2 = r2.c()
            bzgk r3 = new bzgk
            r3.<init>()
            r8.a = r1
            r9 = 0
            r8.b = r9
            r9 = 2
            r8.c = r9
            java.lang.Object r9 = r2.d(r3, r8)
            if (r9 == r0) goto L97
        L91:
            r0 = r1
        L92:
            fflb r0 = (defpackage.fflb) r0
            java.lang.Object r9 = r0.a
            return r9
        L97:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzgl.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bzgl(this.d, ffguVar);
    }
}
