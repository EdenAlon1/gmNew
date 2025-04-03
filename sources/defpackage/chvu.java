package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chvu {
    private static final cskc b = cskc.g("BugleGaia", "DittoUnpairHandler");
    public final ffbr a;
    private final ffsk c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;

    public chvu(ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6) {
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        this.c = ffskVar;
        this.a = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = ffbrVar4;
        this.g = ffbrVar5;
        this.h = ffbrVar6;
    }

    public final elfl a(bzge bzgeVar, String str) {
        str.getClass();
        chwu a = ((chww) this.d.b()).a(bzgeVar, esaa.GET_UPDATES);
        a.c = str;
        erxg erxgVar = (erxg) erxi.a.createBuilder();
        esdp esdpVar = (esdp) ((esdo) esdp.a.createBuilder()).build();
        erxgVar.copyOnWrite();
        erxi erxiVar = (erxi) erxgVar.instance;
        esdpVar.getClass();
        erxiVar.c = esdpVar;
        erxiVar.b = 14;
        a.b(erxgVar.build());
        a.f = true;
        elfl b2 = ((cikg) this.e.b()).b(a.a());
        b2.getClass();
        return b2;
    }

    public final elfl b(bzge bzgeVar) {
        elfl c;
        bzgeVar.getClass();
        c = axol.c(this.c, ffhe.a, ffsm.a, new chvs(bzgeVar, this, null));
        return c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        defpackage.chvu.b.n("RevokeRelayPairingRpcHandlerFactory failed with StatusRuntimeException");
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.bzge r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.chvr
            if (r0 == 0) goto L13
            r0 = r6
            chvr r0 = (defpackage.chvr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            chvr r0 = new chvr
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)     // Catch: defpackage.fedn -> L55
            goto L5c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r6)
            ffbr r6 = r4.f
            java.lang.Object r6 = r6.b()
            chyn r6 = (defpackage.chyn) r6
            fcek r5 = r5.d
            chym r5 = r6.a(r5)
            ffbr r6 = r4.g     // Catch: defpackage.fedn -> L55
            java.lang.Object r6 = r6.b()     // Catch: defpackage.fedn -> L55
            chep r6 = (defpackage.chep) r6     // Catch: defpackage.fedn -> L55
            elfl r5 = r6.a(r5)     // Catch: defpackage.fedn -> L55
            r0.c = r3     // Catch: defpackage.fedn -> L55
            java.lang.Object r5 = defpackage.fgfz.c(r5, r0)     // Catch: defpackage.fedn -> L55
            if (r5 != r1) goto L5c
            return r1
        L55:
            cskc r5 = defpackage.chvu.b
            java.lang.String r6 = "RevokeRelayPairingRpcHandlerFactory failed with StatusRuntimeException"
            r5.n(r6)
        L5c:
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chvu.c(bzge, ffgu):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(4:18|(1:20)|21|(1:23))|11|12|13))|25|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        defpackage.chvu.b.n("sendUnpairGaiaRpc failed with StatusRuntimeException");
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.bzej r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.chvt
            if (r0 == 0) goto L13
            r0 = r6
            chvt r0 = (defpackage.chvt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            chvt r0 = new chvt
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)     // Catch: defpackage.fedn -> L62
            goto L69
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r6)
            ffbr r6 = r4.a
            java.lang.Object r6 = r6.b()
            bzgd r6 = (defpackage.bzgd) r6
            r2 = r5
            bzeh r2 = (defpackage.bzeh) r2
            bzge r2 = r2.b
            boolean r6 = r6.t(r2)
            if (r6 != 0) goto L4c
            cskc r6 = defpackage.chvu.b
            java.lang.String r2 = "Desktop not found when attempting to unpair gaia desktop"
            r6.r(r2)
        L4c:
            r6 = r5
            bzeh r6 = (defpackage.bzeh) r6     // Catch: defpackage.fedn -> L62
            bzge r6 = r6.b     // Catch: defpackage.fedn -> L62
            bzeh r5 = (defpackage.bzeh) r5     // Catch: defpackage.fedn -> L62
            java.lang.String r5 = r5.a     // Catch: defpackage.fedn -> L62
            elfl r5 = r4.a(r6, r5)     // Catch: defpackage.fedn -> L62
            r0.c = r3     // Catch: defpackage.fedn -> L62
            java.lang.Object r5 = defpackage.fgfz.c(r5, r0)     // Catch: defpackage.fedn -> L62
            if (r5 != r1) goto L69
            return r1
        L62:
            cskc r5 = defpackage.chvu.b
            java.lang.String r6 = "sendUnpairGaiaRpc failed with StatusRuntimeException"
            r5.n(r6)
        L69:
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chvu.d(bzej, ffgu):java.lang.Object");
    }

    public final void e(fcek fcekVar) {
        if (!((bzek) this.h.b()).b(fcekVar)) {
            b.p("No need to clear Ditto active desktop ids");
        } else {
            ((bzek) this.h.b()).a();
            b.p("Ditto active desktop ids have been cleared");
        }
    }
}
