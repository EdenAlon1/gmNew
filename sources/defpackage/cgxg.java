package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cgxg extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ chwk d;
    final /* synthetic */ cgxh e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgxg(chwk chwkVar, cgxh cgxhVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = chwkVar;
        this.e = cgxhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgxg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0074, code lost:
    
        r0 = defpackage.cgxh.a.e();
        r0.Y(defpackage.ente.a, "BugleNetwork");
        ((defpackage.enrr) r0.h("com/google/android/apps/messaging/shared/net/GaiaDeviceInfoProviderV2$getRegisteredGaiaDeviceInfo$1", "invokeSuspend", 72, "GaiaDeviceInfoProviderV2.kt")).t("Received registered Gaia device information for app: %s", r7.e.b);
        r8 = ((defpackage.fbzg) r8).c;
        r8.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x009f, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        if (r8 != r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        if (r1 != 2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x005f, code lost:
    
        r1 = r7.d;
        r8 = (defpackage.fbzg) r8;
        r8.getClass();
        r8 = r1.o(r8);
        r7.c = 3;
        r8 = defpackage.fgfz.c(r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0071, code lost:
    
        if (r8 != r0) goto L17;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 == r3) goto L10
            defpackage.ffci.b(r8)
            if (r1 == r2) goto L5f
            goto L74
        L10:
            java.lang.Object r1 = r7.b
            java.lang.Object r3 = r7.a
            defpackage.ffci.b(r8)
            goto L45
        L18:
            defpackage.ffci.b(r8)
            chwk r8 = r7.d
            cgxh r1 = r7.e
            chga r4 = r1.c
            java.lang.String r5 = r1.b
            fcfn r4 = r4.a(r5)
            eyfy r4 = r4.build()
            r4.getClass()
            fcfo r4 = (defpackage.fcfo) r4
            elfl r4 = r8.c(r4)
            r7.a = r8
            chrv r1 = r1.d
            r7.b = r1
            r7.c = r3
            java.lang.Object r3 = defpackage.fgfz.c(r4, r7)
            if (r3 == r0) goto La0
            r6 = r3
            r3 = r8
            r8 = r6
        L45:
            r8.getClass()
            fbze r8 = (defpackage.fbze) r8
            chwk r3 = (defpackage.chwk) r3
            chrv r1 = (defpackage.chrv) r1
            elfl r8 = r3.d(r1, r8)
            r1 = 0
            r7.a = r1
            r7.b = r1
            r7.c = r2
            java.lang.Object r8 = defpackage.fgfz.c(r8, r7)
            if (r8 == r0) goto La0
        L5f:
            chwk r1 = r7.d
            fbzg r8 = (defpackage.fbzg) r8
            r8.getClass()
            elfl r8 = r1.e(r8)
            r1 = 3
            r7.c = r1
            java.lang.Object r8 = defpackage.fgfz.c(r8, r7)
            if (r8 != r0) goto L74
            goto La0
        L74:
            fbzg r8 = (defpackage.fbzg) r8
            enru r0 = defpackage.cgxh.a
            ensk r0 = r0.e()
            ensn r1 = defpackage.ente.a
            java.lang.String r2 = "BugleNetwork"
            r0.Y(r1, r2)
            java.lang.String r1 = "invokeSuspend"
            r2 = 72
            java.lang.String r3 = "com/google/android/apps/messaging/shared/net/GaiaDeviceInfoProviderV2$getRegisteredGaiaDeviceInfo$1"
            java.lang.String r4 = "GaiaDeviceInfoProviderV2.kt"
            ensk r0 = r0.h(r3, r1, r2, r4)
            enrr r0 = (defpackage.enrr) r0
            cgxh r1 = r7.e
            java.lang.String r2 = "Received registered Gaia device information for app: %s"
            java.lang.String r1 = r1.b
            r0.t(r2, r1)
            eygr r8 = r8.c
            r8.getClass()
            return r8
        La0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgxg.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cgxg(this.d, this.e, ffguVar);
    }
}
