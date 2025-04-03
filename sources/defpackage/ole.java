package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ole {
    private final olh a;
    private final boolean b = true;
    private final fgjb c = new fgjf();
    private ffud d;
    private int e;

    public ole(olh olhVar) {
        this.a = olhVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053 A[Catch: all -> 0x005b, TRY_LEAVE, TryCatch #0 {all -> 0x005b, blocks: (B:11:0x004f, B:13:0x0053), top: B:10:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffud r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.olc
            if (r0 == 0) goto L13
            r0 = r7
            olc r0 = (defpackage.olc) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            olc r0 = new olc
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            fgjf r6 = r0.f
            java.lang.Object r1 = r0.a
            ole r0 = r0.e
            defpackage.ffci.b(r7)
            r7 = r6
            r6 = r1
            goto L4f
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            defpackage.ffci.b(r7)
            fgjb r7 = r5.c
            r0.e = r5
            r0.a = r6
            r2 = r7
            fgjf r2 = (defpackage.fgjf) r2
            r0.f = r2
            r0.d = r3
            java.lang.Object r0 = r7.a(r4, r0)
            if (r0 == r1) goto L60
            r0 = r5
        L4f:
            ffud r1 = r0.d     // Catch: java.lang.Throwable -> L5b
            if (r6 != r1) goto L55
            r0.d = r4     // Catch: java.lang.Throwable -> L5b
        L55:
            r7.b(r4)
            ffcu r6 = defpackage.ffcu.a
            return r6
        L5b:
            r6 = move-exception
            r7.b(r4)
            throw r6
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ole.a(ffud, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        if (r2.o(r0) != r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f A[Catch: all -> 0x009c, TryCatch #1 {all -> 0x009c, blocks: (B:25:0x005f, B:27:0x0063, B:29:0x0069, B:31:0x006f, B:33:0x007b), top: B:24:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b A[Catch: all -> 0x009c, TRY_LEAVE, TryCatch #1 {all -> 0x009c, blocks: (B:25:0x005f, B:27:0x0063, B:29:0x0069, B:31:0x006f, B:33:0x007b), top: B:24:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffud r11, defpackage.ffgu r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.old
            if (r0 == 0) goto L13
            r0 = r12
            old r0 = (defpackage.old) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            old r0 = new old
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L48
            if (r2 == r5) goto L3c
            if (r2 != r3) goto L34
            fgjf r11 = r0.f
            java.lang.Object r1 = r0.a
            ole r0 = r0.e
            defpackage.ffci.b(r12)     // Catch: java.lang.Throwable -> L31
            goto L8f
        L31:
            r12 = move-exception
            goto La0
        L34:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3c:
            fgjf r11 = r0.f
            java.lang.Object r2 = r0.a
            ole r6 = r0.e
            defpackage.ffci.b(r12)
            r12 = r11
            r11 = r2
            goto L5f
        L48:
            defpackage.ffci.b(r12)
            fgjb r12 = r10.c
            r0.e = r10
            r0.a = r11
            r2 = r12
            fgjf r2 = (defpackage.fgjf) r2
            r0.f = r2
            r0.d = r5
            java.lang.Object r2 = r12.a(r4, r0)
            if (r2 == r1) goto La4
            r6 = r10
        L5f:
            ffud r2 = r6.d     // Catch: java.lang.Throwable -> L9c
            if (r2 == 0) goto L6d
            boolean r7 = r2.v()     // Catch: java.lang.Throwable -> L9c
            if (r7 == 0) goto L6d
            int r7 = r6.e     // Catch: java.lang.Throwable -> L9c
            boolean r7 = r6.b     // Catch: java.lang.Throwable -> L9c
        L6d:
            if (r2 == 0) goto L79
            olb r7 = new olb     // Catch: java.lang.Throwable -> L9c
            olh r8 = r6.a     // Catch: java.lang.Throwable -> L9c
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L9c
            r2.t(r7)     // Catch: java.lang.Throwable -> L9c
        L79:
            if (r2 == 0) goto L8c
            r0.e = r6     // Catch: java.lang.Throwable -> L9c
            r0.a = r11     // Catch: java.lang.Throwable -> L9c
            r7 = r12
            fgjf r7 = (defpackage.fgjf) r7     // Catch: java.lang.Throwable -> L9c
            r0.f = r7     // Catch: java.lang.Throwable -> L9c
            r0.d = r3     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r0 = r2.o(r0)     // Catch: java.lang.Throwable -> L9c
            if (r0 == r1) goto La4
        L8c:
            r1 = r11
            r11 = r12
            r0 = r6
        L8f:
            r0.d = r1     // Catch: java.lang.Throwable -> L31
            r12 = 0
            r0.e = r12     // Catch: java.lang.Throwable -> L31
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L31
            r11.b(r4)
            return r12
        L9c:
            r11 = move-exception
            r9 = r12
            r12 = r11
            r11 = r9
        La0:
            r11.b(r4)
            throw r12
        La4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ole.b(ffud, ffgu):java.lang.Object");
    }
}
