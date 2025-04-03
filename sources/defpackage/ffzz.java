package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffzz implements ffxx {
    final /* synthetic */ ffxx a;
    final /* synthetic */ int b;

    public ffzz(ffxx ffxxVar, int i) {
        this.a = ffxxVar;
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.ffxx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffxy r9, defpackage.ffgu r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.ffzy
            if (r0 == 0) goto L13
            r0 = r10
            ffzy r0 = (defpackage.ffzy) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ffzy r0 = new ffzy
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r9 = r0.d
            defpackage.ffci.b(r10)     // Catch: defpackage.fgdu -> L29
            goto L5b
        L29:
            r10 = move-exception
            goto L58
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            defpackage.ffci.b(r10)
            java.lang.Object r10 = new java.lang.Object
            r10.<init>()
            ffkz r2 = new ffkz
            r2.<init>()
            ffxx r4 = r8.a     // Catch: defpackage.fgdu -> L54
            fgab r5 = new fgab     // Catch: defpackage.fgdu -> L54
            int r6 = r8.b     // Catch: defpackage.fgdu -> L54
            r5.<init>(r2, r6, r9, r10)     // Catch: defpackage.fgdu -> L54
            r0.d = r10     // Catch: defpackage.fgdu -> L54
            r0.b = r3     // Catch: defpackage.fgdu -> L54
            java.lang.Object r9 = r4.a(r5, r0)     // Catch: defpackage.fgdu -> L54
            if (r9 != r1) goto L5b
            return r1
        L54:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L58:
            defpackage.fgfb.a(r10, r9)
        L5b:
            ffcu r9 = defpackage.ffcu.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffzz.a(ffxy, ffgu):java.lang.Object");
    }
}
