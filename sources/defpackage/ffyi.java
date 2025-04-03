package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class ffyi {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #0 {all -> 0x0034, blocks: (B:12:0x002e, B:14:0x0059, B:21:0x0071, B:23:0x0079, B:34:0x0047, B:37:0x0055), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0090 -> B:14:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.ffxy r7, defpackage.ffxg r8, boolean r9, defpackage.ffgu r10) {
        /*
            boolean r0 = r10 instanceof defpackage.ffyh
            if (r0 == 0) goto L13
            r0 = r10
            ffyh r0 = (defpackage.ffyh) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ffyh r0 = new ffyh
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.d
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4f
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            boolean r9 = r0.c
            ffwc r7 = r0.f
            java.lang.Object r8 = r0.b
            java.lang.Object r2 = r0.a
            defpackage.ffci.b(r10)     // Catch: java.lang.Throwable -> L34
            r10 = r7
            r7 = r2
            goto L59
        L34:
            r7 = move-exception
            goto L9d
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            boolean r9 = r0.c
            ffwc r7 = r0.f
            java.lang.Object r8 = r0.b
            java.lang.Object r2 = r0.a
            defpackage.ffci.b(r10)     // Catch: java.lang.Throwable -> L34
            r6 = r0
            r0 = r7
            r7 = r2
        L4d:
            r2 = r6
            goto L71
        L4f:
            defpackage.ffci.b(r10)
            defpackage.ffzi.b(r7)
            ffwo r10 = r8.r()     // Catch: java.lang.Throwable -> L34
        L59:
            r0.a = r7     // Catch: java.lang.Throwable -> L34
            r0.b = r8     // Catch: java.lang.Throwable -> L34
            r2 = r10
            ffwc r2 = (defpackage.ffwc) r2     // Catch: java.lang.Throwable -> L34
            r0.f = r2     // Catch: java.lang.Throwable -> L34
            r0.c = r9     // Catch: java.lang.Throwable -> L34
            r0.e = r4     // Catch: java.lang.Throwable -> L34
            java.lang.Object r2 = r10.a(r0)     // Catch: java.lang.Throwable -> L34
            if (r2 != r1) goto L6d
            goto L93
        L6d:
            r6 = r0
            r0 = r10
            r10 = r2
            goto L4d
        L71:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L34
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r10 == 0) goto L94
            java.lang.Object r10 = r0.b()     // Catch: java.lang.Throwable -> L34
            r2.a = r7     // Catch: java.lang.Throwable -> L34
            r2.b = r8     // Catch: java.lang.Throwable -> L34
            r5 = r0
            ffwc r5 = (defpackage.ffwc) r5     // Catch: java.lang.Throwable -> L34
            r2.f = r5     // Catch: java.lang.Throwable -> L34
            r2.c = r9     // Catch: java.lang.Throwable -> L34
            r2.e = r3     // Catch: java.lang.Throwable -> L34
            java.lang.Object r10 = r7.fQ(r10, r2)     // Catch: java.lang.Throwable -> L34
            if (r10 == r1) goto L93
            r10 = r0
            r0 = r2
            goto L59
        L93:
            return r1
        L94:
            if (r9 == 0) goto L9a
            r7 = 0
            defpackage.ffww.a(r8, r7)
        L9a:
            ffcu r7 = defpackage.ffcu.a
            return r7
        L9d:
            throw r7     // Catch: java.lang.Throwable -> L9e
        L9e:
            r10 = move-exception
            if (r9 != 0) goto La2
            goto La5
        La2:
            defpackage.ffww.a(r8, r7)
        La5:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffyi.a(ffxy, ffxg, boolean, ffgu):java.lang.Object");
    }

    public static final ffxg b(ffxx ffxxVar, ffsk ffskVar) {
        fgea fgeaVar = ffxxVar instanceof fgea ? (fgea) ffxxVar : null;
        if (fgeaVar == null) {
            fgeaVar = new fgei(ffxxVar, null, 0, 0, 14);
        }
        return fgeaVar.e(ffskVar);
    }
}
