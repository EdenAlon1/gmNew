package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aydx implements aydu {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/contacts/sync/incremental/recipient/ContactRecipientSyncImpl");
    private final aqkp b;
    private final ffbr c;

    public aydx(aqkp aqkpVar, ffbr ffbrVar) {
        aqkpVar.getClass();
        this.b = aqkpVar;
        this.c = ffbrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.aydu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r8, boolean r9, defpackage.ffgu r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.aydv
            if (r0 == 0) goto L13
            r0 = r10
            aydv r0 = (defpackage.aydv) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            aydv r0 = new aydv
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            boolean r9 = r0.a
            ecri r8 = r0.f
            aydx r0 = r0.e
            defpackage.ffci.b(r10)
            goto L82
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            defpackage.ffci.b(r10)
            enru r10 = defpackage.aydx.a
            ensk r10 = r10.h()
            ensn r2 = defpackage.ente.a
            java.lang.String r4 = "BugleRecipientSync"
            r10.Y(r2, r4)
            java.lang.String r2 = "syncChangedContacts"
            r4 = 36
            java.lang.String r5 = "com/google/android/apps/messaging/shared/contacts/sync/incremental/recipient/ContactRecipientSyncImpl"
            java.lang.String r6 = "ContactRecipientSyncImpl.kt"
            ensk r10 = r10.h(r5, r2, r4, r6)
            enrr r10 = (defpackage.enrr) r10
            int r2 = r8.size()
            java.lang.String r4 = "Syncing %d changed contacts with recipients"
            r10.r(r4, r2)
            ffbr r10 = r7.c
            java.lang.Object r10 = r10.b()
            ecrj r10 = (defpackage.ecrj) r10
            ecri r10 = r10.d()
            aqkp r2 = r7.b
            engw r8 = defpackage.engq.a(r8)
            elfl r8 = r2.r(r8)
            r0.e = r7
            r0.f = r10
            r0.a = r9
            r0.d = r3
            java.lang.Object r8 = defpackage.fgfz.c(r8, r0)
            if (r8 == r1) goto L9a
            r0 = r7
            r8 = r10
        L82:
            ffbr r10 = r0.c
            java.lang.Object r10 = r10.b()
            ecrj r10 = (defpackage.ecrj) r10
            if (r9 == 0) goto L8f
            ecda r9 = defpackage.axup.d
            goto L91
        L8f:
            ecda r9 = defpackage.axup.k
        L91:
            r0 = 0
            ecrh r1 = defpackage.ecrh.SUCCESS
            r10.f(r8, r9, r0, r1)
            ffcu r8 = defpackage.ffcu.a
            return r8
        L9a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aydx.a(java.util.List, boolean, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.aydu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.Set r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.aydw
            if (r0 == 0) goto L13
            r0 = r9
            aydw r0 = (defpackage.aydw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aydw r0 = new aydw
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ecri r8 = r0.e
            aydx r0 = r0.d
            defpackage.ffci.b(r9)
            goto L7e
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            defpackage.ffci.b(r9)
            enru r9 = defpackage.aydx.a
            ensk r9 = r9.h()
            ensn r2 = defpackage.ente.a
            java.lang.String r4 = "BugleRecipientSync"
            r9.Y(r2, r4)
            java.lang.String r2 = "syncDeletedContacts"
            r4 = 54
            java.lang.String r5 = "com/google/android/apps/messaging/shared/contacts/sync/incremental/recipient/ContactRecipientSyncImpl"
            java.lang.String r6 = "ContactRecipientSyncImpl.kt"
            ensk r9 = r9.h(r5, r2, r4, r6)
            enrr r9 = (defpackage.enrr) r9
            int r2 = r8.size()
            java.lang.String r4 = "Syncing %d deleted contacts with recipients"
            r9.r(r4, r2)
            ffbr r9 = r7.c
            java.lang.Object r9 = r9.b()
            ecrj r9 = (defpackage.ecrj) r9
            ecri r9 = r9.d()
            aqkp r2 = r7.b
            enip r8 = defpackage.engq.f(r8)
            elfl r8 = r2.s(r8)
            r0.d = r7
            r0.e = r9
            r0.c = r3
            java.lang.Object r8 = defpackage.fgfz.c(r8, r0)
            if (r8 == r1) goto L91
            r0 = r7
            r8 = r9
        L7e:
            ffbr r9 = r0.c
            java.lang.Object r9 = r9.b()
            ecrj r9 = (defpackage.ecrj) r9
            ecda r0 = defpackage.axup.l
            r1 = 0
            ecrh r2 = defpackage.ecrh.SUCCESS
            r9.f(r8, r0, r1, r2)
            ffcu r8 = defpackage.ffcu.a
            return r8
        L91:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aydx.b(java.util.Set, ffgu):java.lang.Object");
    }
}
