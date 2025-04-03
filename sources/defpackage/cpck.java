package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpck implements cpcb {
    public static final /* synthetic */ int d = 0;
    private static final entd e = entd.c("BugleMmsConfig");
    public final cguo a;
    public final cpbu b;
    public final ffsk c;
    private final cort f;
    private final ffsk g;

    public cpck(cguo cguoVar, cpbu cpbuVar, cort cortVar, ffsk ffskVar, ffsk ffskVar2) {
        cguoVar.getClass();
        cpbuVar.getClass();
        cortVar.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        this.a = cguoVar;
        this.b = cpbuVar;
        this.f = cortVar;
        this.g = ffskVar;
        this.c = ffskVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
    
        if (r10 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r9, defpackage.ffgu r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.cpch
            if (r0 == 0) goto L13
            r0 = r10
            cpch r0 = (defpackage.cpch) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cpch r0 = new cpch
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.ffci.b(r10)
            goto L6f
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            cpck r9 = r0.d
            defpackage.ffci.b(r10)
            goto L47
        L39:
            defpackage.ffci.b(r10)
            r0.d = r8
            r0.c = r4
            java.lang.Object r10 = r8.b(r9, r0)
            if (r10 == r1) goto L8b
            r9 = r8
        L47:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L8a
            int r2 = r10.length()
            if (r2 != 0) goto L52
            goto L8a
        L52:
            ffsk r2 = r9.g
            ffhe r4 = defpackage.ffhe.a
            ffsm r6 = defpackage.ffsm.a
            ffhd r4 = defpackage.ekxi.a(r4)
            cpcg r7 = new cpcg
            r7.<init>(r5, r9, r10)
            ffss r9 = defpackage.ffra.b(r2, r4, r6, r7)
            r0.d = r5
            r0.c = r3
            java.lang.Object r10 = r9.c(r0)
            if (r10 == r1) goto L8b
        L6f:
            j$.util.Optional r10 = (j$.util.Optional) r10
            boolean r9 = r10.isPresent()
            if (r9 == 0) goto L8a
            java.lang.Object r9 = r10.get()
            ewgw r9 = (defpackage.ewgw) r9
            int r10 = r9.c
            r0 = 4
            if (r10 != r0) goto L87
            java.lang.Object r9 = r9.d
            ewhh r9 = (defpackage.ewhh) r9
            return r9
        L87:
            ewhh r9 = defpackage.ewhh.a
            return r9
        L8a:
            return r5
        L8b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpck.a(int, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cpci
            if (r0 == 0) goto L13
            r0 = r6
            cpci r0 = (defpackage.cpci) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cpci r0 = new cpci
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            int r5 = r0.a
            defpackage.ffci.b(r6)
            goto L40
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            cort r6 = r4.f
            r0.a = r5
            r0.d = r3
            java.lang.Object r6 = r6.m(r5, r0)
            if (r6 == r1) goto L61
        L40:
            cosz r6 = (defpackage.cosz) r6
            r0 = 0
            if (r6 == 0) goto L48
            java.lang.String r6 = r6.c
            goto L49
        L48:
            r6 = r0
        L49:
            if (r6 == 0) goto L53
            int r1 = r6.length()
            if (r1 != 0) goto L52
            goto L53
        L52:
            return r6
        L53:
            entd r6 = defpackage.cpck.e
            ensk r6 = r6.j()
            ensz r6 = (defpackage.ensz) r6
            java.lang.String r1 = "No simId found for subId %d"
            r6.r(r1, r5)
            return r0
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpck.b(int, ffgu):java.lang.Object");
    }
}
