package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccwm implements ccvq {
    private static final enru c = enru.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/backup/conversations/CmsConversationsUpdater");
    public final crty a;
    public final ffhd b;
    private final atab d;

    public ccwm(crty crtyVar, atab atabVar, ffhd ffhdVar) {
        crtyVar.getClass();
        atabVar.getClass();
        ffhdVar.getClass();
        this.a = crtyVar;
        this.d = atabVar;
        this.b = ffhdVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0131, code lost:
    
        if (r13 != r1) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6 A[Catch: Exception -> 0x004e, LOOP:1: B:33:0x00b0->B:35:0x00b6, LOOP_END, TryCatch #0 {Exception -> 0x004e, blocks: (B:12:0x0030, B:16:0x0173, B:31:0x004a, B:32:0x00a1, B:33:0x00b0, B:35:0x00b6, B:37:0x00c6, B:39:0x00e1, B:40:0x00ea, B:42:0x00f0, B:45:0x0101, B:50:0x0105, B:51:0x0112, B:53:0x0118, B:55:0x0124, B:58:0x013d, B:59:0x0152, B:61:0x0158), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e1 A[Catch: Exception -> 0x004e, TryCatch #0 {Exception -> 0x004e, blocks: (B:12:0x0030, B:16:0x0173, B:31:0x004a, B:32:0x00a1, B:33:0x00b0, B:35:0x00b6, B:37:0x00c6, B:39:0x00e1, B:40:0x00ea, B:42:0x00f0, B:45:0x0101, B:50:0x0105, B:51:0x0112, B:53:0x0118, B:55:0x0124, B:58:0x013d, B:59:0x0152, B:61:0x0158), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013d A[Catch: Exception -> 0x004e, TRY_ENTER, TryCatch #0 {Exception -> 0x004e, blocks: (B:12:0x0030, B:16:0x0173, B:31:0x004a, B:32:0x00a1, B:33:0x00b0, B:35:0x00b6, B:37:0x00c6, B:39:0x00e1, B:40:0x00ea, B:42:0x00f0, B:45:0x0101, B:50:0x0105, B:51:0x0112, B:53:0x0118, B:55:0x0124, B:58:0x013d, B:59:0x0152, B:61:0x0158), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [ccvl] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.ccvq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.Map r11, defpackage.ccvl r12, defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccwm.a(java.util.Map, ccvl, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // defpackage.ccvq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, defpackage.ccvl r6, defpackage.ffgu r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.ccwf
            if (r0 == 0) goto L13
            r0 = r7
            ccwf r0 = (defpackage.ccwf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ccwf r0 = new ccwf
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.d
            defpackage.ffci.b(r7)     // Catch: java.lang.Throwable -> L58
            goto L4b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r7)
            crty r7 = r4.a     // Catch: java.lang.Throwable -> L58
            int r6 = r6.c     // Catch: java.lang.Throwable -> L58
            boolean r6 = defpackage.csfx.b(r6)     // Catch: java.lang.Throwable -> L58
            elfl r6 = r7.ad(r5, r6)     // Catch: java.lang.Throwable -> L58
            r0.d = r5     // Catch: java.lang.Throwable -> L58
            r0.c = r3     // Catch: java.lang.Throwable -> L58
            java.lang.Object r7 = defpackage.fgfz.c(r6, r0)     // Catch: java.lang.Throwable -> L58
            if (r7 != r1) goto L4b
            return r1
        L4b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L58
            ccvn r6 = new ccvn     // Catch: java.lang.Throwable -> L58
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L58
            r7 = r7 ^ r3
            r6.<init>(r5, r7)     // Catch: java.lang.Throwable -> L58
            return r6
        L58:
            r5 = move-exception
            java.lang.Object r5 = defpackage.ffci.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccwm.b(java.lang.String, ccvl, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.Collection r9, defpackage.ffgu r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.ccwg
            if (r0 == 0) goto L13
            r0 = r10
            ccwg r0 = (defpackage.ccwg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ccwg r0 = new ccwg
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r3) goto L2b
            defpackage.ffci.b(r10)
            return r10
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            ccwm r9 = r0.d
            defpackage.ffci.b(r10)
            goto L84
        L39:
            defpackage.ffci.b(r10)
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r2 = 10
            int r2 = defpackage.ffdx.n(r9, r2)
            int r2 = defpackage.ffew.a(r2)
            r6 = 16
            int r2 = defpackage.ffmk.f(r2, r6)
            r10.<init>(r2)
            java.util.Iterator r9 = r9.iterator()
        L55:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L6f
            java.lang.Object r2 = r9.next()
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            ffch r7 = new ffch
            r7.<init>(r6)
            r10.put(r2, r7)
            goto L55
        L6f:
            ccwb r9 = new ccwb
            r9.<init>()
            ccwh r2 = new ccwh
            r2.<init>(r8, r4)
            r0.d = r8
            r0.c = r5
            java.lang.Object r10 = defpackage.ccyx.a(r10, r9, r2, r0)
            if (r10 == r1) goto L97
            r9 = r8
        L84:
            java.util.Map r10 = (java.util.Map) r10
            ccwi r2 = new ccwi
            r2.<init>(r9, r4)
            r0.d = r4
            r0.c = r3
            java.lang.Object r9 = defpackage.ccyx.c(r10, r2, r0)
            if (r9 != r1) goto L96
            goto L97
        L96:
            return r9
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccwm.d(java.util.Collection, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // defpackage.ccvq
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.eswr r5, defpackage.ccvl r6, java.util.EnumSet r7, defpackage.ffgu r8) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccwm.c(eswr, ccvl, java.util.EnumSet, ffgu):java.lang.Object");
    }
}
