package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lcm implements ldj {
    private final File a;
    private final lcs b;
    private final ffix c;
    private final AtomicBoolean d = new AtomicBoolean(false);
    private final fgjb e = new fgjf();
    private final lcv f;

    public lcm(File file, lcv lcvVar, lcs lcsVar, ffix ffixVar) {
        this.a = file;
        this.f = lcvVar;
        this.b = lcsVar;
        this.c = ffixVar;
    }

    private final void e() {
        if (this.d.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    @Override // defpackage.lae
    public final void a() {
        this.d.set(true);
        this.c.invoke();
    }

    @Override // defpackage.ldj
    public final lcs b() {
        return this.b;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(6:34|35|36|37|38|(1:40)(1:41))|13|14|15|(2:(1:18)|19)(1:21)))|53|6|7|(0)(0)|13|14|15|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073 A[Catch: all -> 0x0084, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0084, blocks: (B:21:0x0073, B:28:0x0083, B:31:0x0080, B:27:0x007b), top: B:7:0x001f, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12, types: [lcm] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, lck] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [lae] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [ffjn] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // defpackage.ldj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffjn r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.lck
            if (r0 == 0) goto L13
            r0 = r9
            lck r0 = (defpackage.lck) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            lck r0 = new lck
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            boolean r8 = r0.b
            java.lang.Object r1 = r0.a
            lcm r0 = r0.f
            defpackage.ffci.b(r9)     // Catch: java.lang.Throwable -> L2d
            goto L63
        L2d:
            r9 = move-exception
            goto L7b
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            defpackage.ffci.b(r9)
            r7.e()
            fgjb r9 = r7.e
            boolean r9 = defpackage.fgja.b(r9)
            lcg r2 = new lcg     // Catch: java.lang.Throwable -> L89
            java.io.File r4 = r7.a     // Catch: java.lang.Throwable -> L89
            lcv r5 = r7.f     // Catch: java.lang.Throwable -> L89
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L89
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L75
            r0.f = r7     // Catch: java.lang.Throwable -> L75
            r0.a = r2     // Catch: java.lang.Throwable -> L75
            r0.b = r9     // Catch: java.lang.Throwable -> L75
            r0.e = r3     // Catch: java.lang.Throwable -> L75
            java.lang.Object r8 = r8.a(r2, r4, r0)     // Catch: java.lang.Throwable -> L75
            if (r8 == r1) goto L74
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
            r1 = r2
        L63:
            r1.a()     // Catch: java.lang.Throwable -> L68
            r1 = 0
            goto L69
        L68:
            r1 = move-exception
        L69:
            if (r1 != 0) goto L73
            if (r8 == 0) goto L72
            fgjb r8 = r0.e
            defpackage.fgja.c(r8)
        L72:
            return r9
        L73:
            throw r1     // Catch: java.lang.Throwable -> L84
        L74:
            return r1
        L75:
            r8 = move-exception
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
            r1 = r2
        L7b:
            r1.a()     // Catch: java.lang.Throwable -> L7f
            goto L83
        L7f:
            r1 = move-exception
            defpackage.ffbt.a(r9, r1)     // Catch: java.lang.Throwable -> L84
        L83:
            throw r9     // Catch: java.lang.Throwable -> L84
        L84:
            r9 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
            goto L8b
        L89:
            r8 = move-exception
            r0 = r7
        L8b:
            if (r9 == 0) goto L92
            fgjb r9 = r0.e
            defpackage.fgja.c(r9)
        L92:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lcm.c(ffjn, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d7 A[Catch: all -> 0x011d, IOException -> 0x012d, TRY_ENTER, TryCatch #6 {IOException -> 0x012d, blocks: (B:18:0x00d7, B:20:0x00dd, B:24:0x00f5, B:25:0x0115, B:29:0x011c, B:36:0x012c, B:39:0x0129), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011c A[Catch: all -> 0x011d, IOException -> 0x012d, TRY_ENTER, TRY_LEAVE, TryCatch #6 {IOException -> 0x012d, blocks: (B:18:0x00d7, B:20:0x00dd, B:24:0x00f5, B:25:0x0115, B:29:0x011c, B:36:0x012c, B:39:0x0129), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // defpackage.ldj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ffjm r12, defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lcm.d(ffjm, ffgu):java.lang.Object");
    }
}
