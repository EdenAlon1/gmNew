package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axlx implements axld {
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/cloudstore/folsom/CmsFolsomKeyManagerImpl");
    public final ffbr a;
    private final ffsk c;
    private final ffhd d;
    private final eisx e;
    private final ejar f;
    private final crty g;
    private final crtz h;
    private final axkm i;
    private final crvy j;
    private final ffbr k;
    private final axmm l;
    private final croi m;

    public axlx(ffsk ffskVar, ffhd ffhdVar, eisx eisxVar, ejar ejarVar, crok crokVar, crty crtyVar, crtz crtzVar, axkm axkmVar, crvy crvyVar, ffbr ffbrVar, ffbr ffbrVar2, axmm axmmVar) {
        ffskVar.getClass();
        ffhdVar.getClass();
        eisxVar.getClass();
        ejarVar.getClass();
        crokVar.getClass();
        crtyVar.getClass();
        crtzVar.getClass();
        axkmVar.getClass();
        crvyVar.getClass();
        ffbrVar.getClass();
        axmmVar.getClass();
        this.c = ffskVar;
        this.d = ffhdVar;
        this.e = eisxVar;
        this.f = ejarVar;
        this.g = crtyVar;
        this.h = crtzVar;
        this.i = axkmVar;
        this.j = crvyVar;
        this.k = ffbrVar;
        this.a = ffbrVar2;
        this.l = axmmVar;
        this.m = crokVar.a(croj.c);
    }

    private final void q(String str) {
        ensk h = b.h();
        h.Y(ente.a, "BugleCmsFolsom");
        ((enrr) h.h("com/google/android/apps/messaging/shared/cloudstore/folsom/CmsFolsomKeyManagerImpl", "logNotReadyForFolsomEncryption", 485, "CmsFolsomKeyManagerImpl.kt")).t("Not ready for Folsom encryption. Reason: %s", str);
    }

    private final void r(Status status) {
        ensk h = b.h();
        h.Y(ente.a, "BugleCmsFolsom");
        ((enrr) h.h("com/google/android/apps/messaging/shared/cloudstore/folsom/CmsFolsomKeyManagerImpl", "logSetConsentStatus", 477, "CmsFolsomKeyManagerImpl.kt")).t("SetConsentStatus: %s", status.toString());
        ((akzt) this.k.b()).e("Bugle.Keychain.Cms.SetConsent.Count", status.f);
    }

    private final void s(int i) {
        ensk h = b.h();
        h.Y(ente.a, "BugleCmsFolsom");
        ((enrr) h.h("com/google/android/apps/messaging/shared/cloudstore/folsom/CmsFolsomKeyManagerImpl", "logKeyRetrievalStatus", 465, "CmsFolsomKeyManagerImpl.kt")).D("KeyRetrievalStatus: %s. %s", i != 1 ? i != 2 ? i != 3 ? "FAILED" : "NEED_KNOWLEDGE_FACTOR" : "EMPTY_MATERIAL" : "SUCCESS", i == 1 ? "Key retrieval succeeded." : "Key retrieval failed.");
        ((akzt) this.k.b()).e("Bugle.Keychain.Cms.KeyRetrieval.Count", i);
    }

    @Override // defpackage.axld
    public final elfl a() {
        elfl c;
        c = axol.c(this.c, ffhe.a, ffsm.a, new axll(this, null));
        return c;
    }

    @Override // defpackage.axld
    public final elfl b() {
        elfl c;
        c = axol.c(this.c, ffhe.a, ffsm.a, new axlr(this, null));
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e0, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c3, code lost:
    
        if (r9.p(r12, r0) != r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // defpackage.axld
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffgu r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.axlh
            if (r0 == 0) goto L13
            r0 = r12
            axlh r0 = (defpackage.axlh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            axlh r0 = new axlh
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            java.lang.String r3 = "com/google/android/apps/messaging/shared/cloudstore/folsom/CmsFolsomKeyManagerImpl"
            java.lang.String r4 = "CmsFolsomKeyManagerImpl.kt"
            java.lang.String r5 = "BugleCmsFolsom"
            r6 = 2
            r7 = 1
            java.lang.String r8 = "decryptCmsBackupAndUpdateCmsBoxState"
            if (r2 == 0) goto L43
            if (r2 == r7) goto L3b
            if (r2 != r6) goto L33
            defpackage.ffci.b(r12)
            goto Lc5
        L33:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3b:
            engs r2 = r0.e
            axlx r9 = r0.d
            defpackage.ffci.b(r12)
            goto L7d
        L43:
            defpackage.ffci.b(r12)
            enru r12 = defpackage.axlx.b
            ensk r12 = r12.h()
            ensn r2 = defpackage.ente.a
            r12.Y(r2, r5)
            r2 = 296(0x128, float:4.15E-43)
            ensk r12 = r12.h(r3, r8, r2, r4)
            enrr r12 = (defpackage.enrr) r12
            java.lang.String r2 = "Running starlight."
            r12.q(r2)
            bqwn r12 = defpackage.bqws.a()
            r12.z(r8)
            axle r2 = new axle
            r2.<init>()
            r12.e(r2)
            bqwl r12 = r12.b()
            engw r12 = r12.y()
            enqv r2 = r12.iterator()
            r2.getClass()
            r9 = r11
        L7d:
            boolean r12 = r2.hasNext()
            if (r12 == 0) goto Lb6
            java.lang.Object r12 = r2.next()
            bqvj r12 = (defpackage.bqvj) r12
            java.lang.String r10 = r12.o()
            if (r10 == 0) goto Lae
            int r10 = r10.length()
            if (r10 == 0) goto Lae
            crvy r10 = r9.j
            eszz r12 = r10.c(r12)
            r12.getClass()
            r0.d = r9
            r10 = r2
            engs r10 = (defpackage.engs) r10
            r0.e = r10
            r0.c = r7
            java.lang.Object r12 = r9.n(r12, r0)
            if (r12 != r1) goto L7d
            goto Le0
        Lae:
            csgz r12 = new csgz
            java.lang.String r0 = "Missing Cms ID for Backup Key."
            r12.<init>(r0)
            throw r12
        Lb6:
            esxf r12 = defpackage.esxf.ENCRYPTION_STATE_NOT_ENCRYPTED
            r2 = 0
            r0.d = r2
            r0.e = r2
            r0.c = r6
            java.lang.Object r12 = r9.p(r12, r0)
            if (r12 == r1) goto Le0
        Lc5:
            enru r12 = defpackage.axlx.b
            ensk r12 = r12.h()
            ensn r0 = defpackage.ente.a
            r12.Y(r0, r5)
            r0 = 313(0x139, float:4.39E-43)
            ensk r12 = r12.h(r3, r8, r0, r4)
            enrr r12 = (defpackage.enrr) r12
            java.lang.String r0 = "Updated Starlight objects and local state."
            r12.q(r0)
            ffcu r12 = defpackage.ffcu.a
            return r12
        Le0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axlx.c(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00df, code lost:
    
        if (r2.p(r14, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
    
        if (r14 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // defpackage.axld
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ffgu r14) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axlx.d(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ca, code lost:
    
        if (r11 != r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009c, code lost:
    
        if (r11 != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // defpackage.axld
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ffgu r11) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axlx.e(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
    
        if (defpackage.fgfz.c(r6, r0) == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // defpackage.axld
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.ffgu r12) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axlx.f(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x016c, code lost:
    
        if (r2.m(true, r0) != r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0139, code lost:
    
        if (r11 != r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011a, code lost:
    
        if (r11 != r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00ad, code lost:
    
        if (r11 != r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // defpackage.axld
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.ffgu r11) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axlx.g(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.esxf r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.axlg
            if (r0 == 0) goto L13
            r0 = r6
            axlg r0 = (defpackage.axlg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            axlg r0 = new axlg
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            esxf r5 = r0.e
            axlx r0 = r0.d
            defpackage.ffci.b(r6)
            goto L49
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ffci.b(r6)
            axkm r6 = r4.i
            elfl r6 = r6.k()
            r0.d = r4
            r0.e = r5
            r0.c = r3
            java.lang.Object r6 = defpackage.fgfz.c(r6, r0)
            if (r6 == r1) goto Lb6
            r0 = r4
        L49:
            axez r6 = (defpackage.axez) r6
            axmm r0 = r0.l
            r6.getClass()
            esye r0 = r0.a(r6)
            emwl r1 = defpackage.tnz.a
            int r6 = r6.l
            axeu r6 = defpackage.axeu.b(r6)
            if (r6 != 0) goto L60
            axeu r6 = defpackage.axeu.UNSPECIFIED_STATUS
        L60:
            java.lang.Object r6 = r1.apply(r6)
            eswo r1 = defpackage.eswo.a
            eyfq r1 = r1.createBuilder()
            eswn r1 = (defpackage.eswn) r1
            r1.getClass()
            r5.getClass()
            r1.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r2 = r1.instance
            eswo r2 = (defpackage.eswo) r2
            int r5 = r5.a()
            r2.e = r5
            r0.getClass()
            r1.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r5 = r1.instance
            eswo r5 = (defpackage.eswo) r5
            int r0 = r0.a()
            r5.c = r0
            int r0 = r5.b
            r0 = r0 | r3
            r5.b = r0
            r6.getClass()
            r1.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r5 = r1.instance
            eswo r5 = (defpackage.eswo) r5
            eszw r6 = (defpackage.eszw) r6
            int r6 = r6.a()
            r5.d = r6
            int r6 = r5.b
            r6 = r6 | 2
            r5.b = r6
            eyfy r5 = r1.build()
            r5.getClass()
            eswo r5 = (defpackage.eswo) r5
            return r5
        Lb6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axlx.h(esxf, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.ffgu r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.axlk
            if (r0 == 0) goto L13
            r0 = r7
            axlk r0 = (defpackage.axlk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            axlk r0 = new axlk
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            axlx r0 = r0.d
            defpackage.ffci.b(r7)     // Catch: java.lang.Exception -> L2c
            goto L68
        L2c:
            r7 = move-exception
            goto L7a
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            axlx r2 = r0.d
            defpackage.ffci.b(r7)
            goto L52
        L3c:
            defpackage.ffci.b(r7)
            ejar r7 = r6.f
            eisx r2 = r6.e
            com.google.common.util.concurrent.ListenableFuture r7 = r7.b(r2)
            r0.d = r6
            r0.c = r4
            java.lang.Object r7 = defpackage.fgfz.c(r7, r0)
            if (r7 == r1) goto L88
            r2 = r6
        L52:
            java.lang.String r7 = (java.lang.String) r7
            croi r5 = r2.m     // Catch: java.lang.Exception -> L78
            r7.getClass()     // Catch: java.lang.Exception -> L78
            elfl r7 = r5.a(r7)     // Catch: java.lang.Exception -> L78
            r0.d = r2     // Catch: java.lang.Exception -> L78
            r0.c = r3     // Catch: java.lang.Exception -> L78
            java.lang.Object r7 = defpackage.fgfz.c(r7, r0)     // Catch: java.lang.Exception -> L78
            if (r7 == r1) goto L88
            r0 = r2
        L68:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Exception -> L2c
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L74
            r0.s(r3)
            return r7
        L74:
            r0.s(r4)
            return r7
        L78:
            r7 = move-exception
            r0 = r2
        L7a:
            boolean r1 = r7 instanceof defpackage.dfrj
            if (r1 == 0) goto L83
            r1 = 3
            r0.s(r1)
            goto L87
        L83:
            r1 = 4
            r0.s(r1)
        L87:
            throw r7
        L88:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axlx.i(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        if (r6 != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.axlm
            if (r0 == 0) goto L13
            r0 = r6
            axlm r0 = (defpackage.axlm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            axlm r0 = new axlm
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r6)
            goto L65
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            axlx r2 = r0.d
            defpackage.ffci.b(r6)
            goto L4e
        L38:
            defpackage.ffci.b(r6)
            ejar r6 = r5.f
            eisx r2 = r5.e
            com.google.common.util.concurrent.ListenableFuture r6 = r6.b(r2)
            r0.d = r5
            r0.c = r4
            java.lang.Object r6 = defpackage.fgfz.c(r6, r0)
            if (r6 == r1) goto L69
            r2 = r5
        L4e:
            java.lang.String r6 = (java.lang.String) r6
            croi r2 = r2.m
            r6.getClass()
            elfl r6 = r2.b(r6)
            r2 = 0
            r0.d = r2
            r0.c = r3
            java.lang.Object r6 = defpackage.fgfz.c(r6, r0)
            if (r6 != r1) goto L65
            goto L69
        L65:
            r6.getClass()
            return r6
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axlx.j(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0050, code lost:
    
        if (r7 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.ffgu r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.axln
            if (r0 == 0) goto L13
            r0 = r7
            axln r0 = (defpackage.axln) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            axln r0 = new axln
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L38
            if (r2 == r3) goto L32
            if (r2 != r4) goto L2a
            defpackage.ffci.b(r7)
            goto L66
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            crpn r2 = r0.d
            defpackage.ffci.b(r7)
            goto L52
        L38:
            defpackage.ffci.b(r7)
            croi r2 = r6.m
            ejar r7 = r6.f
            eisx r5 = r6.e
            com.google.common.util.concurrent.ListenableFuture r7 = r7.b(r5)
            r5 = r2
            crpn r5 = (defpackage.crpn) r5
            r0.d = r5
            r0.c = r3
            java.lang.Object r7 = defpackage.fgfz.c(r7, r0)
            if (r7 == r1) goto L8a
        L52:
            r7.getClass()
            java.lang.String r7 = (java.lang.String) r7
            elfl r7 = r2.c(r7)
            r2 = 0
            r0.d = r2
            r0.c = r4
            java.lang.Object r7 = defpackage.fgfz.c(r7, r0)
            if (r7 == r1) goto L8a
        L66:
            r7.getClass()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L74:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L89
            java.lang.Object r1 = r7.next()
            r2 = r1
            com.google.android.gms.auth.folsom.SecurityDomainMember r2 = (com.google.android.gms.auth.folsom.SecurityDomainMember) r2
            int r2 = r2.a
            if (r2 != r4) goto L74
            r0.add(r1)
            goto L74
        L89:
            return r0
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axlx.k(ffgu):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|(1:(1:9)(2:50|51))(3:52|(1:54)|17)|10|11|12|13|(1:15)(4:19|(3:38|(3:41|(2:43|44)(1:45)|39)|46)(1:23)|24|(2:29|(2:30|(1:37)(2:32|(2:34|35)(1:36))))(1:28))|16|17))|55|6|(0)(0)|10|11|12|13|(0)(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0095, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0096, code lost:
    
        r2 = defpackage.axlx.b.j();
        r2.Y(defpackage.ente.a, "BugleCmsFolsom");
        ((defpackage.enrr) ((defpackage.enrr) r2).g(r7).h("com/google/android/apps/messaging/shared/cloudstore/folsom/CmsFolsomKeyManagerImpl", "getLskfMembersStatus", 433, "CmsFolsomKeyManagerImpl.kt")).q("Parsing security members failed.");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049 A[Catch: eygu -> 0x0095, all -> 0x00bc, TryCatch #0 {eygu -> 0x0095, blocks: (B:13:0x0043, B:15:0x0049, B:19:0x004d, B:21:0x0051, B:24:0x0071, B:26:0x0075, B:29:0x007c, B:30:0x0080, B:32:0x0086, B:35:0x0092, B:38:0x0058, B:39:0x005c, B:41:0x0062, B:44:0x006e), top: B:12:0x0043, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d A[Catch: eygu -> 0x0095, all -> 0x00bc, TryCatch #0 {eygu -> 0x0095, blocks: (B:13:0x0043, B:15:0x0049, B:19:0x004d, B:21:0x0051, B:24:0x0071, B:26:0x0075, B:29:0x007c, B:30:0x0080, B:32:0x0086, B:35:0x0092, B:38:0x0058, B:39:0x005c, B:41:0x0062, B:44:0x006e), top: B:12:0x0043, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.ffgu r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.axlo
            if (r0 == 0) goto L13
            r0 = r7
            axlo r0 = (defpackage.axlo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            axlo r0 = new axlo
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            axlx r0 = r0.d
            defpackage.ffci.b(r7)
            goto L3f
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            defpackage.ffci.b(r7)
            r0.d = r6
            r0.c = r3
            java.lang.Object r7 = r6.k(r0)
            if (r7 == r1) goto Lcb
            r0 = r6
        L3f:
            java.util.List r7 = (java.util.List) r7
            axlb r1 = defpackage.axlb.a
            boolean r2 = r7.isEmpty()     // Catch: defpackage.eygu -> L95 java.lang.Throwable -> Lbc
            if (r2 == 0) goto L4d
            axlb r1 = defpackage.axlb.b     // Catch: defpackage.eygu -> L95 java.lang.Throwable -> Lbc
            goto Lbc
        L4d:
            boolean r2 = r7 instanceof java.util.Collection     // Catch: defpackage.eygu -> L95 java.lang.Throwable -> Lbc
            if (r2 == 0) goto L58
            boolean r2 = r7.isEmpty()     // Catch: defpackage.eygu -> L95 java.lang.Throwable -> Lbc
            if (r2 == 0) goto L58
            goto L71
        L58:
            java.util.Iterator r2 = r7.iterator()     // Catch: defpackage.eygu -> L95 java.lang.Throwable -> Lbc
        L5c:
            boolean r3 = r2.hasNext()     // Catch: defpackage.eygu -> L95 java.lang.Throwable -> Lbc
            if (r3 == 0) goto L71
            java.lang.Object r3 = r2.next()     // Catch: defpackage.eygu -> L95 java.lang.Throwable -> Lbc
            com.google.android.gms.auth.folsom.SecurityDomainMember r3 = (com.google.android.gms.auth.folsom.SecurityDomainMember) r3     // Catch: defpackage.eygu -> L95 java.lang.Throwable -> Lbc
            boolean r3 = defpackage.axlf.a(r3)     // Catch: defpackage.eygu -> L95 java.lang.Throwable -> Lbc
            if (r3 == 0) goto L5c
            axlb r1 = defpackage.axlb.c     // Catch: defpackage.eygu -> L95 java.lang.Throwable -> Lbc
            goto Lbc
        L71:
            boolean r2 = r7 instanceof java.util.Collection     // Catch: defpackage.eygu -> L95 java.lang.Throwable -> Lbc
            if (r2 == 0) goto L7c
            boolean r2 = r7.isEmpty()     // Catch: defpackage.eygu -> L95 java.lang.Throwable -> Lbc
            if (r2 == 0) goto L7c
            goto Lbc
        L7c:
            java.util.Iterator r7 = r7.iterator()     // Catch: defpackage.eygu -> L95 java.lang.Throwable -> Lbc
        L80:
            boolean r2 = r7.hasNext()     // Catch: defpackage.eygu -> L95 java.lang.Throwable -> Lbc
            if (r2 == 0) goto Lbc
            java.lang.Object r2 = r7.next()     // Catch: defpackage.eygu -> L95 java.lang.Throwable -> Lbc
            com.google.android.gms.auth.folsom.SecurityDomainMember r2 = (com.google.android.gms.auth.folsom.SecurityDomainMember) r2     // Catch: defpackage.eygu -> L95 java.lang.Throwable -> Lbc
            boolean r2 = defpackage.axlf.a(r2)     // Catch: defpackage.eygu -> L95 java.lang.Throwable -> Lbc
            if (r2 != 0) goto L80
            axlb r1 = defpackage.axlb.d     // Catch: defpackage.eygu -> L95 java.lang.Throwable -> Lbc
            goto Lbc
        L95:
            r7 = move-exception
            enru r2 = defpackage.axlx.b     // Catch: java.lang.Throwable -> Lbc
            ensk r2 = r2.j()     // Catch: java.lang.Throwable -> Lbc
            ensn r3 = defpackage.ente.a     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r4 = "BugleCmsFolsom"
            r2.Y(r3, r4)     // Catch: java.lang.Throwable -> Lbc
            enrr r2 = (defpackage.enrr) r2     // Catch: java.lang.Throwable -> Lbc
            ensk r7 = r2.g(r7)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r2 = "com/google/android/apps/messaging/shared/cloudstore/folsom/CmsFolsomKeyManagerImpl"
            java.lang.String r3 = "getLskfMembersStatus"
            java.lang.String r4 = "CmsFolsomKeyManagerImpl.kt"
            r5 = 433(0x1b1, float:6.07E-43)
            ensk r7 = r7.h(r2, r3, r5, r4)     // Catch: java.lang.Throwable -> Lbc
            enrr r7 = (defpackage.enrr) r7     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r2 = "Parsing security members failed."
            r7.q(r2)     // Catch: java.lang.Throwable -> Lbc
        Lbc:
            ffbr r7 = r0.k
            java.lang.Object r7 = r7.b()
            akzt r7 = (defpackage.akzt) r7
            java.lang.String r0 = "Bugle.Keychain.Cms.LskfMembersStatus.Count"
            int r2 = r1.e
            r7.e(r0, r2)
        Lcb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axlx.l(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r8 == r1) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v4, types: [axlx] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(boolean r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.axls
            if (r0 == 0) goto L13
            r0 = r8
            axls r0 = (defpackage.axls) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            axls r0 = new axls
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            axlx r7 = r0.e
            defpackage.ffci.b(r8)     // Catch: java.lang.Exception -> L2c
            goto L71
        L2c:
            r8 = move-exception
            goto L7b
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            boolean r7 = r0.a
            axlx r2 = r0.e
            defpackage.ffci.b(r8)
            r5 = r8
            r8 = r7
            r7 = r2
            r2 = r5
            goto L5c
        L42:
            defpackage.ffci.b(r8)
            ejar r8 = r6.f
            eisx r2 = r6.e
            com.google.common.util.concurrent.ListenableFuture r8 = r8.b(r2)
            r0.e = r6
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = defpackage.fgfz.c(r8, r0)
            if (r8 == r1) goto L93
            r2 = r8
            r8 = r7
            r7 = r6
        L5c:
            java.lang.String r2 = (java.lang.String) r2
            croi r4 = r7.m     // Catch: java.lang.Exception -> L2c
            r2.getClass()     // Catch: java.lang.Exception -> L2c
            elfl r8 = r4.e(r2, r8)     // Catch: java.lang.Exception -> L2c
            r0.e = r7     // Catch: java.lang.Exception -> L2c
            r0.d = r3     // Catch: java.lang.Exception -> L2c
            java.lang.Object r8 = defpackage.fgfz.c(r8, r0)     // Catch: java.lang.Exception -> L2c
            if (r8 == r1) goto L93
        L71:
            ffcu r8 = (defpackage.ffcu) r8     // Catch: java.lang.Exception -> L2c
            com.google.android.gms.common.api.Status r8 = com.google.android.gms.common.api.Status.a
            r7.r(r8)
            ffcu r7 = defpackage.ffcu.a
            return r7
        L7b:
            boolean r0 = r8 instanceof defpackage.dfqu
            if (r0 == 0) goto L85
            r0 = r8
            dfqu r0 = (defpackage.dfqu) r0
            com.google.android.gms.common.api.Status r0 = r0.a
            goto L8c
        L85:
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 13
            r0.<init>(r1)
        L8c:
            r0.getClass()
            r7.r(r0)
            throw r8
        L93:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axlx.m(boolean, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.eszz r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.axlu
            if (r0 == 0) goto L13
            r0 = r9
            axlu r0 = (defpackage.axlu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            axlu r0 = new axlu
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r9)
            goto L95
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.ffci.b(r9)
            enru r9 = defpackage.axlx.b
            ensk r9 = r9.h()
            ensn r2 = defpackage.ente.a
            java.lang.String r4 = "BugleCmsFolsom"
            r9.Y(r2, r4)
            java.lang.String r2 = "updateCmsBackupKeyObject"
            r4 = 355(0x163, float:4.97E-43)
            java.lang.String r5 = "com/google/android/apps/messaging/shared/cloudstore/folsom/CmsFolsomKeyManagerImpl"
            java.lang.String r6 = "CmsFolsomKeyManagerImpl.kt"
            ensk r9 = r9.h(r5, r2, r4, r6)
            enrr r9 = (defpackage.enrr) r9
            java.lang.String r2 = "Updating the CMS backup key object."
            r9.q(r2)
            crty r9 = r7.g
            eyfh r2 = defpackage.eyfh.a
            eyfq r2 = r2.createBuilder()
            eyfg r2 = (defpackage.eyfg) r2
            r2.getClass()
            defpackage.eyfi.b(r2)
            java.lang.String r4 = "labels"
            r2.a(r4)
            defpackage.eyfi.b(r2)
            java.lang.String r4 = "payload"
            r2.a(r4)
            eyfh r2 = defpackage.eyfi.a(r2)
            esze r4 = defpackage.esze.a
            eyfq r4 = r4.createBuilder()
            eszd r4 = (defpackage.eszd) r4
            r4.getClass()
            defpackage.eszf.b(r4)
            defpackage.eszf.c(r4)
            esze r4 = defpackage.eszf.a(r4)
            elfl r8 = r9.ak(r8, r2, r4)
            r0.c = r3
            java.lang.Object r9 = defpackage.fgfz.c(r8, r0)
            if (r9 != r1) goto L95
            return r1
        L95:
            r9.getClass()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axlx.n(eszz, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e4, code lost:
    
        if (r10 != r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.esxf r9, defpackage.ffgu r10) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axlx.o(esxf, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a A[Catch: Exception -> 0x004f, TryCatch #0 {Exception -> 0x004f, blocks: (B:22:0x004b, B:23:0x0064, B:25:0x006a, B:27:0x0083, B:28:0x0085, B:34:0x0099, B:35:0x009b, B:37:0x00a3, B:38:0x00a5, B:40:0x00ad, B:41:0x00af, B:43:0x00b7, B:44:0x00b9, B:46:0x00c1, B:47:0x00c3, B:63:0x008f, B:64:0x0092, B:65:0x0095, B:66:0x00cb), top: B:21:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cb A[Catch: Exception -> 0x004f, TRY_LEAVE, TryCatch #0 {Exception -> 0x004f, blocks: (B:22:0x004b, B:23:0x0064, B:25:0x006a, B:27:0x0083, B:28:0x0085, B:34:0x0099, B:35:0x009b, B:37:0x00a3, B:38:0x00a5, B:40:0x00ad, B:41:0x00af, B:43:0x00b7, B:44:0x00b9, B:46:0x00c1, B:47:0x00c3, B:63:0x008f, B:64:0x0092, B:65:0x0095, B:66:0x00cb), top: B:21:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.esxf r14, defpackage.ffgu r15) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axlx.p(esxf, ffgu):java.lang.Object");
    }
}
