package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdrg {
    private final crty a;
    private final ffbr b;
    private final ffsk c;

    static {
        cfvl.f(cfvl.b, "cms_settings_data_storage_info_outdate_threshold_millis", 86400000L);
    }

    public cdrg(crty crtyVar, axkm axkmVar, cqoh cqohVar, ffbr ffbrVar, ffsk ffskVar) {
        crtyVar.getClass();
        axkmVar.getClass();
        cqohVar.getClass();
        ffbrVar.getClass();
        ffskVar.getClass();
        this.a = crtyVar;
        this.b = ffbrVar;
        this.c = ffskVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r9, defpackage.ffgu r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.cdre
            if (r0 == 0) goto L13
            r0 = r10
            cdre r0 = (defpackage.cdre) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cdre r0 = new cdre
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cdrg r9 = r0.d
            defpackage.ffci.b(r10)
            goto L5e
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            defpackage.ffci.b(r10)
            emyl r10 = defpackage.csgj.x
            java.lang.Object r10 = r10.get()
            cfup r10 = (defpackage.cfup) r10
            java.lang.Object r10 = r10.e()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L4d
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            return r9
        L4d:
            crty r10 = r8.a
            elfl r9 = r10.ah(r9)
            r0.d = r8
            r0.c = r3
            java.lang.Object r10 = defpackage.fgfz.c(r9, r0)
            if (r10 == r1) goto L94
            r9 = r8
        L5e:
            etbm r10 = (defpackage.etbm) r10
            long r0 = r10.b
            long r4 = r10.c
            double r0 = (double) r0
            double r4 = (double) r4
            cfup r10 = defpackage.csgj.B
            java.lang.Object r10 = r10.e()
            java.lang.Number r10 = (java.lang.Number) r10
            double r6 = r10.doubleValue()
            double r0 = r0 / r4
            int r10 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r10 > 0) goto L79
            r10 = r3
            goto L7a
        L79:
            r10 = 0
        L7a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            r0.getClass()
            if (r3 == r10) goto L85
            r10 = 3
            goto L86
        L85:
            r10 = 2
        L86:
            ffbr r9 = r9.b
            java.lang.Object r9 = r9.b()
            akzt r9 = (defpackage.akzt) r9
            java.lang.String r1 = "Bugle.Sqs.UserStorageInfoUtil.OutCome"
            r9.e(r1, r10)
            return r0
        L94:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdrg.a(int, ffgu):java.lang.Object");
    }

    public final elfl b() {
        elfl c;
        c = axol.c(this.c, ffhe.a, ffsm.a, new cdrf(this, null));
        return c;
    }
}
