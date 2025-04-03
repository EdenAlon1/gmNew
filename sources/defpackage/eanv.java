package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eanv {
    private static final entd a = entd.c("GnpSdk");
    private final emxc b;

    public eanv(emxc emxcVar) {
        this.b = emxcVar;
    }

    public final Object a(eamb eambVar, ffgu ffguVar) {
        int ordinal = eambVar.ordinal();
        return ordinal != 2 ? ordinal != 3 ? new eafo(null) : b(ffguVar) : c(ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.eant
            if (r0 == 0) goto L13
            r0 = r5
            eant r0 = (defpackage.eant) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            eant r0 = new eant
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r0 = r0.c
            if (r0 == 0) goto L44
            r1 = 1
            if (r0 != r1) goto L3c
            defpackage.ffci.b(r5)     // Catch: java.lang.Exception -> L2a
            eafo r0 = new eafo     // Catch: java.lang.Exception -> L2a
            r0.<init>(r5)     // Catch: java.lang.Exception -> L2a
            return r0
        L2a:
            r5 = move-exception
            entd r0 = defpackage.eanv.a
            ensk r0 = r0.i()
            java.lang.String r1 = "Failed getting YouTube visitor data cookie"
            defpackage.a.K(r0, r1, r5)
            eafi r0 = new eafi
            r0.<init>(r5)
            return r0
        L3c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L44:
            defpackage.ffci.b(r5)
            entd r5 = defpackage.eanv.a
            ensk r5 = r5.i()
            ensz r5 = (defpackage.ensz) r5
            java.lang.String r0 = "YouTubeVisitorDataProvider not found, can't get YouTube Visitor cookie"
            r5.q(r0)
            eafi r5 = new eafi
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            r5.<init>(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eanv.b(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.eanu
            if (r0 == 0) goto L13
            r0 = r5
            eanu r0 = (defpackage.eanu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            eanu r0 = new eanu
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L46
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            emxc r5 = r4.b
            emxn r5 = (defpackage.emxn) r5
            java.lang.Object r5 = r5.a
            easq r5 = (defpackage.easq) r5
            com.google.common.util.concurrent.ListenableFuture r5 = r5.a()
            r0.c = r3
            java.lang.Object r5 = defpackage.fgfz.c(r5, r0)
            if (r5 == r1) goto L6a
        L46:
            com.google.android.gms.pseudonymous.PseudonymousIdToken r5 = (com.google.android.gms.pseudonymous.PseudonymousIdToken) r5
            java.lang.String r5 = r5.a
            if (r5 != 0) goto L64
            entd r5 = defpackage.eanv.a
            ensk r5 = r5.i()
            ensz r5 = (defpackage.ensz) r5
            java.lang.String r0 = "Failed to get Zwieback ID"
            r5.q(r0)
            eafj r5 = new eafj
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            r5.<init>(r1)
            return r5
        L64:
            eafo r0 = new eafo
            r0.<init>(r5)
            return r0
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eanv.c(ffgu):java.lang.Object");
    }
}
