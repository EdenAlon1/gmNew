package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cflm {
    static final /* synthetic */ ffmx[] a;
    public static final /* synthetic */ int d = 0;
    public final cfkw b;
    public final dtuu c;
    private final fgjb e;

    static {
        ffkm ffkmVar = new ffkm(cflm.class);
        int i = fflc.a;
        a = new ffmx[]{ffkmVar};
    }

    public cflm(cfkw cfkwVar, dtuu dtuuVar) {
        cfkwVar.getClass();
        dtuuVar.getClass();
        this.b = cfkwVar;
        this.c = dtuuVar;
        this.e = new fgjf();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0035, code lost:
    
        if (r0 == defpackage.cfla.STOPPING) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
    
        r4 = defpackage.cfla.b(r4.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        if (r4 != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
    
        r4 = defpackage.cfla.UNRECOGNIZED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
    
        r4.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
    
        throw new defpackage.cflh(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x003a, code lost:
    
        if (r0 == defpackage.cfla.RUNNING) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0043, code lost:
    
        if (r0 != defpackage.cfla.RESTARTING) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0048, code lost:
    
        if (r0 == defpackage.cfla.NONE) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0055, code lost:
    
        if (r0 != defpackage.cfla.RESTARTING) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cflb a(defpackage.cflb r4, defpackage.cfla r5) {
        /*
            r3 = this;
            int r0 = r4.b
            cfla r1 = defpackage.cfla.b(r0)
            if (r1 != 0) goto La
            cfla r1 = defpackage.cfla.UNRECOGNIZED
        La:
            if (r1 == r5) goto L8c
            cfla r0 = defpackage.cfla.b(r0)
            if (r0 != 0) goto L14
            cfla r0 = defpackage.cfla.UNRECOGNIZED
        L14:
            r0.getClass()
            int r1 = r5.ordinal()
            if (r1 == 0) goto L4b
            r2 = 1
            if (r1 == r2) goto L46
            r2 = 2
            if (r1 == r2) goto L3d
            r2 = 3
            if (r1 == r2) goto L38
            r2 = 4
            if (r1 == r2) goto L33
            r0 = 5
            if (r1 != r0) goto L2d
            goto L6a
        L2d:
            ffcd r4 = new ffcd
            r4.<init>()
            throw r4
        L33:
            cfla r1 = defpackage.cfla.STOPPING
            if (r0 != r1) goto L57
            goto L6a
        L38:
            cfla r1 = defpackage.cfla.RUNNING
            if (r0 != r1) goto L57
            goto L6a
        L3d:
            cfla r1 = defpackage.cfla.STARTING
            if (r0 == r1) goto L6a
            cfla r1 = defpackage.cfla.RESTARTING
            if (r0 != r1) goto L57
            goto L6a
        L46:
            cfla r1 = defpackage.cfla.NONE
            if (r0 != r1) goto L57
            goto L6a
        L4b:
            cfla r1 = defpackage.cfla.STOPPING
            if (r0 == r1) goto L6a
            cfla r1 = defpackage.cfla.STARTING
            if (r0 == r1) goto L6a
            cfla r1 = defpackage.cfla.RESTARTING
            if (r0 == r1) goto L6a
        L57:
            cflh r0 = new cflh
            int r4 = r4.b
            cfla r4 = defpackage.cfla.b(r4)
            if (r4 != 0) goto L63
            cfla r4 = defpackage.cfla.UNRECOGNIZED
        L63:
            r4.getClass()
            r0.<init>(r4, r5)
            throw r0
        L6a:
            eyfq r4 = r4.toBuilder()
            cfkx r4 = (defpackage.cfkx) r4
            r4.getClass()
            r5.getClass()
            r4.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r0 = r4.instance
            cflb r0 = (defpackage.cflb) r0
            int r5 = r5.a()
            r0.b = r5
            eyfy r4 = r4.build()
            r4.getClass()
            cflb r4 = (defpackage.cflb) r4
        L8c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cflm.a(cflb, cfla):cflb");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cfli
            if (r0 == 0) goto L13
            r0 = r5
            cfli r0 = (defpackage.cfli) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cfli r0 = new cfli
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L44
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            cfkw r5 = r4.b
            comc r5 = r5.a()
            elfl r5 = r5.h()
            r0.c = r3
            java.lang.Object r5 = defpackage.fgfz.c(r5, r0)
            if (r5 == r1) goto L54
        L44:
            cflb r5 = (defpackage.cflb) r5
            int r5 = r5.b
            cfla r5 = defpackage.cfla.b(r5)
            if (r5 != 0) goto L50
            cfla r5 = defpackage.cfla.UNRECOGNIZED
        L50:
            r5.getClass()
            return r5
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cflm.b(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(final defpackage.cfla r9, final defpackage.cfla r10, defpackage.ffgu r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.cflj
            if (r0 == 0) goto L13
            r0 = r11
            cflj r0 = (defpackage.cflj) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cflj r0 = new cflj
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L49
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r9 = r0.a
            fgjb r9 = (defpackage.fgjb) r9
            defpackage.ffci.b(r11)     // Catch: java.lang.Throwable -> L2f
            goto L80
        L2f:
            r10 = move-exception
            goto L8c
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            fgjf r9 = r0.g
            cfla r10 = r0.f
            cfla r2 = r0.e
            java.lang.Object r4 = r0.a
            cflm r4 = (defpackage.cflm) r4
            defpackage.ffci.b(r11)
            r11 = r9
            r9 = r2
            goto L62
        L49:
            defpackage.ffci.b(r11)
            fgjb r11 = r8.e
            r0.a = r8
            r0.e = r9
            r0.f = r10
            r2 = r11
            fgjf r2 = (defpackage.fgjf) r2
            r0.g = r2
            r0.d = r4
            java.lang.Object r2 = r11.a(r5, r0)
            if (r2 == r1) goto L90
            r4 = r8
        L62:
            cfkw r2 = r4.b     // Catch: java.lang.Throwable -> L89
            comc r2 = r2.a()     // Catch: java.lang.Throwable -> L89
            cflc r6 = new cflc     // Catch: java.lang.Throwable -> L89
            r6.<init>()     // Catch: java.lang.Throwable -> L89
            r0.a = r11     // Catch: java.lang.Throwable -> L89
            r0.e = r5     // Catch: java.lang.Throwable -> L89
            r0.f = r5     // Catch: java.lang.Throwable -> L89
            r0.g = r5     // Catch: java.lang.Throwable -> L89
            r0.d = r3     // Catch: java.lang.Throwable -> L89
            java.lang.Object r9 = r4.e(r2, r6, r0)     // Catch: java.lang.Throwable -> L89
            if (r9 == r1) goto L90
            r7 = r11
            r11 = r9
            r9 = r7
        L80:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L2f
            r11.booleanValue()     // Catch: java.lang.Throwable -> L2f
            r9.b(r5)
            return r11
        L89:
            r9 = move-exception
            r10 = r9
            r9 = r11
        L8c:
            r9.b(r5)
            throw r10
        L90:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cflm.c(cfla, cfla, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(final defpackage.cfla r9, defpackage.ffgu r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.cflk
            if (r0 == 0) goto L13
            r0 = r10
            cflk r0 = (defpackage.cflk) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cflk r0 = new cflk
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r9 = r0.a
            fgjb r9 = (defpackage.fgjb) r9
            defpackage.ffci.b(r10)     // Catch: java.lang.Throwable -> L2f
            goto L7a
        L2f:
            r10 = move-exception
            goto L87
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            fgjf r9 = r0.f
            cfla r2 = r0.e
            java.lang.Object r4 = r0.a
            cflm r4 = (defpackage.cflm) r4
            defpackage.ffci.b(r10)
            r10 = r9
            r9 = r2
            goto L5e
        L47:
            defpackage.ffci.b(r10)
            fgjb r10 = r8.e
            r0.a = r8
            r0.e = r9
            r2 = r10
            fgjf r2 = (defpackage.fgjf) r2
            r0.f = r2
            r0.d = r4
            java.lang.Object r2 = r10.a(r5, r0)
            if (r2 == r1) goto L8b
            r4 = r8
        L5e:
            cfkw r2 = r4.b     // Catch: java.lang.Throwable -> L83
            comc r2 = r2.a()     // Catch: java.lang.Throwable -> L83
            cflg r6 = new cflg     // Catch: java.lang.Throwable -> L83
            r6.<init>()     // Catch: java.lang.Throwable -> L83
            r0.a = r10     // Catch: java.lang.Throwable -> L83
            r0.e = r5     // Catch: java.lang.Throwable -> L83
            r0.f = r5     // Catch: java.lang.Throwable -> L83
            r0.d = r3     // Catch: java.lang.Throwable -> L83
            java.lang.Object r9 = r4.e(r2, r6, r0)     // Catch: java.lang.Throwable -> L83
            if (r9 == r1) goto L8b
            r7 = r10
            r10 = r9
            r9 = r7
        L7a:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L2f
            r10.booleanValue()     // Catch: java.lang.Throwable -> L2f
            r9.b(r5)
            return r10
        L83:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L87:
            r9.b(r5)
            throw r10
        L8b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cflm.d(cfla, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.comc r5, final defpackage.ffji r6, defpackage.ffgu r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.cfll
            if (r0 == 0) goto L13
            r0 = r7
            cfll r0 = (defpackage.cfll) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cfll r0 = new cfll
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            fflq r5 = r0.d
            defpackage.ffci.b(r7)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r7)
            fflq r7 = new fflq
            r7.<init>()
            cfld r2 = new cfld
            r2.<init>()
            r0.d = r7
            r0.c = r3
            java.lang.Object r5 = r5.d(r2, r0)
            if (r5 == r1) goto L58
            r5 = r7
        L49:
            ffmx[] r6 = defpackage.cflm.a
            r7 = 0
            r6 = r6[r7]
            java.lang.Object r5 = r5.c(r6)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.booleanValue()
            return r5
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cflm.e(comc, ffji, ffgu):java.lang.Object");
    }
}
