package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fkk {
    public float a = 6.0f;
    public float b = 12.0f;
    public float c = 8.0f;
    public float d = 8.0f;
    public final cxj e = new cxj(new jzq(6.0f), dcp.c, null, 12);
    private dwm f;
    private dwm g;

    private final float c(dwm dwmVar) {
        return dwmVar instanceof dwp ? this.b : dwmVar instanceof dwk ? this.c : dwmVar instanceof dwf ? this.d : this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.dwm r8, defpackage.ffgu r9) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fkk.a(dwm, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.fkj
            if (r0 == 0) goto L13
            r0 = r6
            fkj r0 = (defpackage.fkj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fkj r0 = new fkj
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            fkk r0 = r0.d
            defpackage.ffci.b(r6)     // Catch: java.lang.Throwable -> L29
            goto L5e
        L29:
            r6 = move-exception
            goto L66
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            defpackage.ffci.b(r6)
            dwm r6 = r5.g
            float r6 = r5.c(r6)
            cxj r2 = r5.e
            java.lang.Object r2 = r2.c()
            jzq r2 = (defpackage.jzq) r2
            float r2 = r2.a
            boolean r2 = defpackage.jzq.b(r2, r6)
            if (r2 != 0) goto L6b
            cxj r2 = r5.e     // Catch: java.lang.Throwable -> L64
            jzq r4 = new jzq     // Catch: java.lang.Throwable -> L64
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L64
            r0.d = r5     // Catch: java.lang.Throwable -> L64
            r0.c = r3     // Catch: java.lang.Throwable -> L64
            java.lang.Object r6 = r2.e(r4, r0)     // Catch: java.lang.Throwable -> L64
            if (r6 == r1) goto L63
            r0 = r5
        L5e:
            dwm r6 = r0.g
            r0.f = r6
            goto L6b
        L63:
            return r1
        L64:
            r6 = move-exception
            r0 = r5
        L66:
            dwm r1 = r0.g
            r0.f = r1
            throw r6
        L6b:
            ffcu r6 = defpackage.ffcu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fkk.b(ffgu):java.lang.Object");
    }
}
