package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtlo {
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (r5.c(r0) != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.dtll r5, int r6, defpackage.ffji r7, defpackage.ffgu r8) {
        /*
            boolean r0 = r8 instanceof defpackage.dtln
            if (r0 == 0) goto L13
            r0 = r8
            dtln r0 = (defpackage.dtln) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dtln r0 = new dtln
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r5 = r0.a
            exmf r5 = (defpackage.exmf) r5
            defpackage.ffci.b(r8)
            goto L70
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            dtlm r7 = r0.d
            java.lang.Object r5 = r0.a
            dtll r5 = (defpackage.dtll) r5
            defpackage.ffci.b(r8)
            goto L54
        L40:
            defpackage.ffci.b(r8)
            r0.a = r5
            r0.e = r6
            r6 = r7
            dtlm r6 = (defpackage.dtlm) r6
            r0.d = r6
            r0.c = r4
            java.lang.Object r6 = r5.c(r0)
            if (r6 == r1) goto L7a
        L54:
            exmf r6 = new exmf
            r8 = 0
            r6.<init>(r8)
            java.lang.Object r7 = r7.invoke(r6)
            r0.a = r6
            r2 = 0
            r0.e = r2
            r0.d = r8
            r0.c = r3
            fadq r7 = (defpackage.fadq) r7
            java.lang.Object r8 = r5.g(r7, r0)
            if (r8 == r1) goto L7a
            r5 = r6
        L70:
            faem r8 = (defpackage.faem) r8
            fafl r6 = new fafl
            javax.microedition.khronos.egl.EGLContext r5 = r5.c
            r6.<init>(r5, r8)
            return r6
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtlo.a(dtll, int, ffji, ffgu):java.lang.Object");
    }
}
