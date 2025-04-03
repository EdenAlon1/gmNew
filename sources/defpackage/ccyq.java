package defpackage;

import java.util.EnumSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccyq implements ccvq {
    public static final /* synthetic */ int d = 0;
    private static final eyfh e;
    public final crty a;
    public final crzd b;
    public final ffhd c;

    static {
        eyfg eyfgVar = (eyfg) eyfh.a.createBuilder();
        eyfgVar.a("extended_detail");
        eyfy build = eyfgVar.build();
        build.getClass();
        e = (eyfh) build;
    }

    public ccyq(crty crtyVar, crzd crzdVar, ffhd ffhdVar) {
        crtyVar.getClass();
        crzdVar.getClass();
        ffhdVar.getClass();
        this.a = crtyVar;
        this.b = crzdVar;
        this.c = ffhdVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0126, code lost:
    
        if (r13 == r1) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b3 A[Catch: Exception -> 0x004b, LOOP:0: B:22:0x00ad->B:24:0x00b3, LOOP_END, TryCatch #1 {Exception -> 0x004b, blocks: (B:12:0x0030, B:13:0x0128, B:20:0x0047, B:21:0x009e, B:22:0x00ad, B:24:0x00b3, B:26:0x00c3, B:27:0x00df, B:29:0x00e5, B:32:0x00f6, B:37:0x00fa, B:38:0x0107, B:40:0x010d, B:42:0x0119), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e5 A[Catch: Exception -> 0x004b, TryCatch #1 {Exception -> 0x004b, blocks: (B:12:0x0030, B:13:0x0128, B:20:0x0047, B:21:0x009e, B:22:0x00ad, B:24:0x00b3, B:26:0x00c3, B:27:0x00df, B:29:0x00e5, B:32:0x00f6, B:37:0x00fa, B:38:0x0107, B:40:0x010d, B:42:0x0119), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010d A[Catch: Exception -> 0x004b, LOOP:2: B:38:0x0107->B:40:0x010d, LOOP_END, TryCatch #1 {Exception -> 0x004b, blocks: (B:12:0x0030, B:13:0x0128, B:20:0x0047, B:21:0x009e, B:22:0x00ad, B:24:0x00b3, B:26:0x00c3, B:27:0x00df, B:29:0x00e5, B:32:0x00f6, B:37:0x00fa, B:38:0x0107, B:40:0x010d, B:42:0x0119), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [ccvl] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    @Override // defpackage.ccvq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.Map r11, defpackage.ccvl r12, defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccyq.a(java.util.Map, ccvl, ffgu):java.lang.Object");
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
            boolean r0 = r7 instanceof defpackage.ccyi
            if (r0 == 0) goto L13
            r0 = r7
            ccyi r0 = (defpackage.ccyi) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ccyi r0 = new ccyi
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
            elfl r6 = r7.h(r5, r6)     // Catch: java.lang.Throwable -> L58
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccyq.b(java.lang.String, ccvl, ffgu):java.lang.Object");
    }

    @Override // defpackage.ccvq
    public final /* bridge */ /* synthetic */ Object c(Object obj, ccvl ccvlVar, EnumSet enumSet, ffgu ffguVar) {
        return e((etah) obj, ccvlVar, ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.Collection r9, defpackage.ffgu r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.ccyj
            if (r0 == 0) goto L13
            r0 = r10
            ccyj r0 = (defpackage.ccyj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ccyj r0 = new ccyj
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
            ccyq r9 = r0.d
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
            ccyk r9 = new ccyk
            r9.<init>(r8)
            ccym r2 = new ccym
            r2.<init>(r8, r4)
            r0.d = r8
            r0.c = r5
            java.lang.Object r10 = defpackage.ccyx.a(r10, r9, r2, r0)
            if (r10 == r1) goto La5
            r9 = r8
        L84:
            java.util.Map r10 = (java.util.Map) r10
            ccyf r2 = new ccyf
            r2.<init>()
            java.util.Map r10 = defpackage.ccyx.b(r10, r2)
            ccyn r2 = new ccyn
            r2.<init>(r9)
            ccyo r5 = new ccyo
            r5.<init>(r9, r4)
            r0.d = r4
            r0.c = r3
            java.lang.Object r9 = defpackage.ccyx.a(r10, r2, r5, r0)
            if (r9 != r1) goto La4
            goto La5
        La4:
            return r9
        La5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccyq.d(java.util.Collection, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.etah r5, defpackage.ccvl r6, defpackage.ffgu r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.ccyp
            if (r0 == 0) goto L13
            r0 = r7
            ccyp r0 = (defpackage.ccyp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ccyp r0 = new ccyp
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.ffci.b(r7)     // Catch: java.lang.Throwable -> L27
            goto L4b
        L27:
            r5 = move-exception
            goto L58
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r7)
            crty r7 = r4.a     // Catch: java.lang.Throwable -> L27
            eyfh r2 = defpackage.ccyq.e     // Catch: java.lang.Throwable -> L27
            int r6 = r6.c     // Catch: java.lang.Throwable -> L27
            boolean r6 = defpackage.csfx.b(r6)     // Catch: java.lang.Throwable -> L27
            elfl r5 = r7.W(r5, r2, r6)     // Catch: java.lang.Throwable -> L27
            r0.c = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r7 = defpackage.fgfz.c(r5, r0)     // Catch: java.lang.Throwable -> L27
            if (r7 != r1) goto L4b
            return r1
        L4b:
            etah r7 = (defpackage.etah) r7     // Catch: java.lang.Throwable -> L27
            ccvp r5 = new ccvp     // Catch: java.lang.Throwable -> L27
            java.lang.String r6 = r7.c     // Catch: java.lang.Throwable -> L27
            r6.getClass()     // Catch: java.lang.Throwable -> L27
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L27
            return r5
        L58:
            java.lang.Object r5 = defpackage.ffci.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccyq.e(etah, ccvl, ffgu):java.lang.Object");
    }
}
