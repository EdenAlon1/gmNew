package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cehx {
    public static final cskc a = cskc.g("BugleCms", "CmsRestorePageExecutor");
    private static final ecda o = new ecda("CmsRestorePageExecutor");
    public final ffsk b;
    public final cdgk c;
    public final cqoh d;
    public final Context e;
    public final ffbr f;
    public final asio g;
    public final axkm h;
    public final cctm i;
    public final ccdx j;
    public final cega k;
    public final ffbr l;
    public final bqkx m;
    public final String n;
    private final asih p;
    private final ecmt q;
    private final akwo r;

    public cehx(ffsk ffskVar, cdgk cdgkVar, cqoh cqohVar, asih asihVar, Context context, ffbr ffbrVar, asio asioVar, axkm axkmVar, ecmt ecmtVar, akwo akwoVar, cctm cctmVar, ccdx ccdxVar, cega cegaVar, ffbr ffbrVar2, bqkx bqkxVar, String str) {
        this.b = ffskVar;
        this.c = cdgkVar;
        this.d = cqohVar;
        this.p = asihVar;
        this.e = context;
        this.f = ffbrVar;
        this.g = asioVar;
        this.h = axkmVar;
        this.q = ecmtVar;
        this.r = akwoVar;
        this.i = cctmVar;
        this.j = ccdxVar;
        this.k = cegaVar;
        this.l = ffbrVar2;
        this.m = bqkxVar;
        this.n = str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(5:11|12|(3:15|(1:17)(2:18|19)|13)|21|22)(2:23|24))(4:25|26|27|28))(3:30|(1:32)(1:35)|34)|37|38|(2:41|39)|42|43))|44|6|7|(0)(0)|37|38|(1:39)|42|43|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005f, code lost:
    
        if (r11 != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        if (r11 != r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082 A[LOOP:1: B:39:0x007c->B:41:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r8, j$.util.Optional r9, boolean r10, defpackage.ffgu r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.cehe
            if (r0 == 0) goto L13
            r0 = r11
            cehe r0 = (defpackage.cehe) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cehe r0 = new cehe
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 16
            r4 = 10
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3f
            if (r2 == r6) goto L37
            if (r2 != r5) goto L2f
            defpackage.ffci.b(r11)
            goto La2
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            java.lang.Object r8 = r0.a
            defpackage.ffci.b(r11)     // Catch: java.lang.Exception -> L3d
            goto L61
        L3d:
            r9 = move-exception
            goto L67
        L3f:
            defpackage.ffci.b(r11)
            ccdx r11 = r7.j
            boolean r11 = r11.c()
            if (r11 == 0) goto L8b
            ccdx r11 = r7.j     // Catch: java.lang.Exception -> L3d
            engw r2 = defpackage.engq.a(r8)     // Catch: java.lang.Exception -> L3d
            elfl r9 = r11.a(r2, r9, r10)     // Catch: java.lang.Exception -> L3d
            r9.getClass()     // Catch: java.lang.Exception -> L3d
            r0.a = r8     // Catch: java.lang.Exception -> L3d
            r0.d = r6     // Catch: java.lang.Exception -> L3d
            java.lang.Object r11 = defpackage.fgfz.c(r9, r0)     // Catch: java.lang.Exception -> L3d
            if (r11 == r1) goto Le7
        L61:
            r11.getClass()     // Catch: java.lang.Exception -> L3d
            java.util.Map r11 = (java.util.Map) r11     // Catch: java.lang.Exception -> L3d
            return r11
        L67:
            int r10 = defpackage.ffdx.n(r8, r4)
            int r10 = defpackage.ffew.a(r10)
            int r10 = defpackage.ffmk.f(r10, r3)
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>(r10)
            java.util.Iterator r8 = r8.iterator()
        L7c:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L8a
            java.lang.Object r10 = r8.next()
            r11.put(r10, r9)
            goto L7c
        L8a:
            return r11
        L8b:
            ffyd r9 = new ffyd
            r9.<init>(r8)
            cehd r8 = new cehd
            r8.<init>(r9, r7)
            ceha r9 = new ceha
            r9.<init>(r8)
            r0.d = r5
            java.lang.Object r11 = defpackage.ffxz.b(r9, r0)
            if (r11 == r1) goto Le7
        La2:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            int r8 = defpackage.ffdx.n(r11, r4)
            int r8 = defpackage.ffew.a(r8)
            int r8 = defpackage.ffmk.f(r8, r3)
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>(r8)
            java.util.Iterator r8 = r11.iterator()
        Lb9:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto Le6
            java.lang.Object r10 = r8.next()
            ffcf r10 = (defpackage.ffcf) r10
            java.lang.Object r11 = r10.a
            java.lang.Object r10 = r10.b
            ffch r10 = (defpackage.ffch) r10
            java.lang.Object r10 = r10.a
            java.lang.Throwable r10 = defpackage.ffch.c(r10)
            r10.getClass()
            boolean r0 = r10 instanceof java.lang.Exception
            if (r0 == 0) goto Le5
            ffcf r0 = new ffcf
            r0.<init>(r11, r10)
            java.lang.Object r10 = r0.a
            java.lang.Object r11 = r0.b
            r9.put(r10, r11)
            goto Lb9
        Le5:
            throw r10
        Le6:
            return r9
        Le7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cehx.a(java.util.List, j$.util.Optional, boolean, ffgu):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(1:(3:11|12|(2:14|15)(2:17|18))(2:19|20))(3:21|22|23))(7:38|39|40|41|42|(1:44)|45)|24|25|26|27))|56|6|7|(0)(0)|24|25|26|27|(2:(1:34)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0075, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r0v3, types: [cega] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2, types: [cefr] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v3, types: [cehx] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r11, j$.util.Optional r12, defpackage.cefr r13, defpackage.ffgu r14) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cehx.b(java.lang.String, j$.util.Optional, cefr, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffji r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cehf
            if (r0 == 0) goto L13
            r0 = r6
            cehf r0 = (defpackage.cehf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cehf r0 = new cehf
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            cehx r5 = r0.d
            defpackage.ffci.b(r6)     // Catch: java.lang.Throwable -> L29
            goto L49
        L29:
            r6 = move-exception
            goto L5a
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ffci.b(r6)
            ecmt r6 = r4.q     // Catch: java.lang.Throwable -> L57
            ecda r2 = defpackage.cehx.o     // Catch: java.lang.Throwable -> L57
            r6.d(r2)     // Catch: java.lang.Throwable -> L57
            r0.d = r4     // Catch: java.lang.Throwable -> L57
            r0.c = r3     // Catch: java.lang.Throwable -> L57
            java.lang.Object r6 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L57
            if (r6 != r1) goto L48
            return r1
        L48:
            r5 = r4
        L49:
            ecmt r0 = r5.q
            ecda r1 = defpackage.cehx.o
            akwo r5 = r5.r
            fgmh r5 = r5.b()
            r0.g(r1, r5)
            return r6
        L57:
            r5 = move-exception
            r6 = r5
            r5 = r4
        L5a:
            ecmt r0 = r5.q
            ecda r1 = defpackage.cehx.o
            akwo r5 = r5.r
            fgmh r5 = r5.b()
            r0.g(r1, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cehx.c(ffji, ffgu):java.lang.Object");
    }
}
