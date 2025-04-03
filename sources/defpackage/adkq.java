package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adkq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ adkv b;
    final /* synthetic */ eisx c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adkq(adkv adkvVar, eisx eisxVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = adkvVar;
        this.c = eisxVar;
        this.d = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adkq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        if (r8 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        if (r8 == r0) goto L24;
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
            int r1 = r7.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 == r3) goto L14
            if (r1 == r2) goto L10
            defpackage.ffci.b(r8)     // Catch: java.lang.Throwable -> L18
            goto L76
        L10:
            defpackage.ffci.b(r8)     // Catch: java.lang.Throwable -> L18
            goto L57
        L14:
            defpackage.ffci.b(r8)     // Catch: java.lang.Throwable -> L18
            goto L46
        L18:
            r8 = move-exception
            goto L79
        L1a:
            defpackage.ffci.b(r8)
            adkv r8 = r7.b     // Catch: java.lang.Throwable -> L18
            ffbr r8 = r8.f     // Catch: java.lang.Throwable -> L18
            java.lang.Object r8 = r8.b()     // Catch: java.lang.Throwable -> L18
            atxv r8 = (defpackage.atxv) r8     // Catch: java.lang.Throwable -> L18
            boolean r8 = r8.a()     // Catch: java.lang.Throwable -> L18
            if (r8 == 0) goto L5a
            adkv r8 = r7.b     // Catch: java.lang.Throwable -> L18
            ffbr r8 = r8.e     // Catch: java.lang.Throwable -> L18
            java.lang.Object r8 = r8.b()     // Catch: java.lang.Throwable -> L18
            eixo r8 = (defpackage.eixo) r8     // Catch: java.lang.Throwable -> L18
            eisx r1 = r7.c     // Catch: java.lang.Throwable -> L18
            com.google.common.util.concurrent.ListenableFuture r8 = r8.c(r1)     // Catch: java.lang.Throwable -> L18
            r7.a = r3     // Catch: java.lang.Throwable -> L18
            java.lang.Object r8 = defpackage.fgfz.c(r8, r7)     // Catch: java.lang.Throwable -> L18
            if (r8 != r0) goto L46
            goto L75
        L46:
            eixn r8 = (defpackage.eixn) r8     // Catch: java.lang.Throwable -> L18
            adkv r1 = r7.b     // Catch: java.lang.Throwable -> L18
            r8.getClass()     // Catch: java.lang.Throwable -> L18
            java.lang.String r4 = r7.d     // Catch: java.lang.Throwable -> L18
            r7.a = r2     // Catch: java.lang.Throwable -> L18
            java.lang.Object r8 = r1.c(r8, r4, r7)     // Catch: java.lang.Throwable -> L18
            if (r8 == r0) goto L75
        L57:
            adko r8 = (defpackage.adko) r8     // Catch: java.lang.Throwable -> L18
            return r8
        L5a:
            adkv r8 = r7.b     // Catch: java.lang.Throwable -> L18
            eisx r1 = r7.c     // Catch: java.lang.Throwable -> L18
            java.lang.String r2 = r7.d     // Catch: java.lang.Throwable -> L18
            r4 = 3
            r7.a = r4     // Catch: java.lang.Throwable -> L18
            ffhd r4 = r8.b     // Catch: java.lang.Throwable -> L18
            ffhd r4 = defpackage.ekxi.a(r4)     // Catch: java.lang.Throwable -> L18
            adks r5 = new adks     // Catch: java.lang.Throwable -> L18
            r6 = 0
            r5.<init>(r6, r8, r1, r2)     // Catch: java.lang.Throwable -> L18
            java.lang.Object r8 = defpackage.ffra.a(r4, r5, r7)     // Catch: java.lang.Throwable -> L18
            if (r8 != r0) goto L76
        L75:
            return r0
        L76:
            adko r8 = (defpackage.adko) r8     // Catch: java.lang.Throwable -> L18
            return r8
        L79:
            enru r0 = defpackage.adkv.a
            ensk r0 = r0.j()
            ensn r1 = defpackage.ente.a
            java.lang.String r2 = "BugleGaia"
            r0.Y(r1, r2)
            enrr r0 = (defpackage.enrr) r0
            ensk r8 = r0.g(r8)
            java.lang.String r0 = "invokeSuspend"
            r1 = 80
            java.lang.String r2 = "com/google/android/apps/messaging/gaia/capability/GmsGaiaCapabilityRetriever$hasCapability$1$1"
            java.lang.String r4 = "GmsGaiaCapabilityRetriever.kt"
            ensk r8 = r8.h(r2, r0, r1, r4)
            enrr r8 = (defpackage.enrr) r8
            java.lang.String r0 = "Retrieving capability failed"
            r8.q(r0)
            adkv r8 = r7.b
            r8.e(r3)
            adko r8 = defpackage.adko.FAILED
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adkq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new adkq(this.b, this.c, this.d, ffguVar);
    }
}
