package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lcc implements lap {
    public final ldi a;
    public final ffsk b;
    public final lav d;
    public final ldc f;
    private final lag g;
    private int j;
    private ffud k;
    private final ffxx h = new fgcp(new lbe(this, null));
    private final fgjb i = new fgjf();
    public final lcd c = new lcd();
    public final ffbz e = ffca.a(new lbt(this));
    private final ffbz l = ffca.a(new law(this));

    public lcc(ldi ldiVar, List list, lag lagVar, ffsk ffskVar) {
        this.a = ldiVar;
        this.g = lagVar;
        this.b = ffskVar;
        this.d = new lav(this, list);
        this.f = new ldc(ffskVar, new lbx(this), lby.a, new lbz(this, null));
    }

    private final Object m(ffjm ffjmVar, ffhd ffhdVar, ffgu ffguVar) {
        return c().a(new lbv(this, ffhdVar, ffjmVar, null), ffguVar);
    }

    @Override // defpackage.lap
    public final Object a(ffjm ffjmVar, ffgu ffguVar) {
        ldo ldoVar = (ldo) ffguVar.u().get(ldn.a);
        if (ldoVar != null) {
            ldoVar.a(this);
        }
        return ffra.a(new ldo(ldoVar, this), new lbw(this, ffjmVar, null), ffguVar);
    }

    @Override // defpackage.lap
    public final ffxx b() {
        return this.h;
    }

    public final lcs c() {
        return (lcs) this.l.a();
    }

    public final ldj d() {
        return (ldj) this.e.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:11:0x004a, B:13:0x0052, B:15:0x0056, B:16:0x0059), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.lbf
            if (r0 == 0) goto L13
            r0 = r6
            lbf r0 = (defpackage.lbf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            lbf r0 = new lbf
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            fgjf r1 = r0.e
            lcc r0 = r0.d
            defpackage.ffci.b(r6)
            goto L4a
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            defpackage.ffci.b(r6)
            fgjb r6 = r5.i
            r0.d = r5
            r2 = r6
            fgjf r2 = (defpackage.fgjf) r2
            r0.e = r2
            r0.c = r3
            java.lang.Object r0 = r6.a(r4, r0)
            if (r0 == r1) goto L66
            r0 = r5
            r1 = r6
        L4a:
            int r6 = r0.j     // Catch: java.lang.Throwable -> L61
            int r6 = r6 + (-1)
            r0.j = r6     // Catch: java.lang.Throwable -> L61
            if (r6 != 0) goto L5b
            ffud r6 = r0.k     // Catch: java.lang.Throwable -> L61
            if (r6 == 0) goto L59
            defpackage.ffub.a(r6)     // Catch: java.lang.Throwable -> L61
        L59:
            r0.k = r4     // Catch: java.lang.Throwable -> L61
        L5b:
            r1.b(r4)
            ffcu r6 = defpackage.ffcu.a
            return r6
        L61:
            r6 = move-exception
            r1.b(r4)
            throw r6
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lcc.e(ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0023 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0050  */
    /* JADX WARN: Type inference failed for: r10v11, types: [ffrp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r9v13, types: [ffrp] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.lct r9, defpackage.ffgu r10) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lcc.f(lct, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051 A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #0 {all -> 0x0065, blocks: (B:11:0x004a, B:13:0x0051), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.lbi
            if (r0 == 0) goto L13
            r0 = r6
            lbi r0 = (defpackage.lbi) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            lbi r0 = new lbi
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            fgjf r1 = r0.e
            lcc r0 = r0.d
            defpackage.ffci.b(r6)
            goto L4a
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            defpackage.ffci.b(r6)
            fgjb r6 = r5.i
            r0.d = r5
            r2 = r6
            fgjf r2 = (defpackage.fgjf) r2
            r0.e = r2
            r0.c = r3
            java.lang.Object r0 = r6.a(r4, r0)
            if (r0 == r1) goto L6a
            r0 = r5
            r1 = r6
        L4a:
            int r6 = r0.j     // Catch: java.lang.Throwable -> L65
            int r6 = r6 + r3
            r0.j = r6     // Catch: java.lang.Throwable -> L65
            if (r6 != r3) goto L5f
            ffsk r6 = r0.b     // Catch: java.lang.Throwable -> L65
            lbk r2 = new lbk     // Catch: java.lang.Throwable -> L65
            r2.<init>(r0, r4)     // Catch: java.lang.Throwable -> L65
            r3 = 3
            ffud r6 = defpackage.ffqy.d(r6, r4, r4, r2, r3)     // Catch: java.lang.Throwable -> L65
            r0.k = r6     // Catch: java.lang.Throwable -> L65
        L5f:
            r1.b(r4)
            ffcu r6 = defpackage.ffcu.a
            return r6
        L65:
            r6 = move-exception
            r1.b(r4)
            throw r6
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lcc.g(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        if (r4.b(r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.lbl
            if (r0 == 0) goto L13
            r0 = r6
            lbl r0 = (defpackage.lbl) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            lbl r0 = new lbl
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            int r1 = r0.a
            lcc r0 = r0.e
            defpackage.ffci.b(r6)     // Catch: java.lang.Throwable -> L2e
            goto L65
        L2e:
            r6 = move-exception
            goto L6c
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            lcc r2 = r0.e
            defpackage.ffci.b(r6)
            goto L50
        L3e:
            defpackage.ffci.b(r6)
            lcs r6 = r5.c()
            r0.e = r5
            r0.d = r4
            java.lang.Object r6 = r6.d()
            if (r6 == r1) goto L77
            r2 = r5
        L50:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            lav r4 = r2.d     // Catch: java.lang.Throwable -> L68
            r0.e = r2     // Catch: java.lang.Throwable -> L68
            r0.a = r6     // Catch: java.lang.Throwable -> L68
            r0.d = r3     // Catch: java.lang.Throwable -> L68
            java.lang.Object r6 = r4.b(r0)     // Catch: java.lang.Throwable -> L68
            if (r6 != r1) goto L65
            goto L77
        L65:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L68:
            r0 = move-exception
            r1 = r6
            r6 = r0
            r0 = r2
        L6c:
            lcd r0 = r0.c
            lcw r2 = new lcw
            r2.<init>(r6, r1)
            r0.b(r2)
            throw r6
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lcc.h(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        if (r11 != r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b7, code lost:
    
        if (r11 != r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(boolean r10, defpackage.ffgu r11) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lcc.i(boolean, ffgu):java.lang.Object");
    }

    public final Object j(ffgu ffguVar) {
        return d().c(new ldk(null), ffguVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|89|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x008b, code lost:
    
        r12 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x008c, code lost:
    
        r7 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0146 A[Catch: all -> 0x016c, TryCatch #1 {all -> 0x016c, blocks: (B:27:0x0134, B:29:0x0146, B:33:0x014b), top: B:26:0x0134 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014b A[Catch: all -> 0x016c, TRY_LEAVE, TryCatch #1 {all -> 0x016c, blocks: (B:27:0x0134, B:29:0x0146, B:33:0x014b), top: B:26:0x0134 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(boolean r11, defpackage.ffgu r12) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lcc.k(boolean, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.Object r11, boolean r12, defpackage.ffgu r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.lca
            if (r0 == 0) goto L13
            r0 = r13
            lca r0 = (defpackage.lca) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            lca r0 = new lca
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ffkz r11 = r0.d
            defpackage.ffci.b(r13)
            goto L51
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            defpackage.ffci.b(r13)
            ffkz r5 = new ffkz
            r5.<init>()
            ldj r13 = r10.d()
            lcb r4 = new lcb
            r9 = 0
            r6 = r10
            r7 = r11
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.d = r5
            r0.c = r3
            java.lang.Object r11 = r13.d(r4, r0)
            if (r11 == r1) goto L59
            r11 = r5
        L51:
            int r11 = r11.a
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r11)
            return r12
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lcc.l(java.lang.Object, boolean, ffgu):java.lang.Object");
    }
}
