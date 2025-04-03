package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpcj {
    public final dpey a;
    private final Set b;
    private final dpeg c;

    public dpcj(dpey dpeyVar, Set set, dpeg dpegVar) {
        this.a = dpeyVar;
        this.b = set;
        this.c = dpegVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        if (r7.b(r0) == r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.dpcg
            if (r0 == 0) goto L13
            r0 = r7
            dpcg r0 = (defpackage.dpcg) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dpcg r0 = new dpcg
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.ffci.b(r7)
            goto L83
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.a
            dpcj r5 = r0.e
            defpackage.ffci.b(r7)
            goto L5a
        L3d:
            dpcj r2 = r0.e
            defpackage.ffci.b(r7)
            r5 = r2
            goto L54
        L44:
            defpackage.ffci.b(r7)
            dpey r7 = r6.a
            r0.e = r6
            r0.d = r5
            java.lang.Object r7 = r7.b(r0)
            if (r7 == r1) goto L86
            r5 = r6
        L54:
            java.util.Set r7 = r5.b
            java.util.Iterator r2 = r7.iterator()
        L5a:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L73
            java.lang.Object r7 = r2.next()
            dpdc r7 = (defpackage.dpdc) r7
            r0.e = r5
            r0.a = r2
            r0.d = r4
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L5a
            goto L86
        L73:
            dpeg r7 = r5.c
            r2 = 0
            r0.e = r2
            r0.a = r2
            r0.d = r3
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L83
            goto L86
        L83:
            ffcu r7 = defpackage.ffcu.a
            return r7
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpcj.a(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        if (r7.c(r0) == r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.dpch
            if (r0 == 0) goto L13
            r0 = r7
            dpch r0 = (defpackage.dpch) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dpch r0 = new dpch
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.ffci.b(r7)
            goto L83
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.a
            dpcj r5 = r0.e
            defpackage.ffci.b(r7)
            goto L5a
        L3d:
            dpcj r2 = r0.e
            defpackage.ffci.b(r7)
            r5 = r2
            goto L54
        L44:
            defpackage.ffci.b(r7)
            dpey r7 = r6.a
            r0.e = r6
            r0.d = r5
            java.lang.Object r7 = r7.c(r0)
            if (r7 == r1) goto L86
            r5 = r6
        L54:
            java.util.Set r7 = r5.b
            java.util.Iterator r2 = r7.iterator()
        L5a:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L73
            java.lang.Object r7 = r2.next()
            dpdc r7 = (defpackage.dpdc) r7
            r0.e = r5
            r0.a = r2
            r0.d = r4
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r1) goto L5a
            goto L86
        L73:
            dpeg r7 = r5.c
            r2 = 0
            r0.e = r2
            r0.a = r2
            r0.d = r3
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r1) goto L83
            goto L86
        L83:
            ffcu r7 = defpackage.ffcu.a
            return r7
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpcj.b(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        if (r7.d(r0) == r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffgu r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.dpci
            if (r0 == 0) goto L13
            r0 = r7
            dpci r0 = (defpackage.dpci) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dpci r0 = new dpci
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.ffci.b(r7)
            goto L83
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.a
            dpcj r5 = r0.e
            defpackage.ffci.b(r7)
            goto L5a
        L3d:
            dpcj r2 = r0.e
            defpackage.ffci.b(r7)
            r5 = r2
            goto L54
        L44:
            defpackage.ffci.b(r7)
            dpeg r7 = r6.c
            r0.e = r6
            r0.d = r5
            java.lang.Object r7 = r7.d(r0)
            if (r7 == r1) goto L86
            r5 = r6
        L54:
            java.util.Set r7 = r5.b
            java.util.Iterator r2 = r7.iterator()
        L5a:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L73
            java.lang.Object r7 = r2.next()
            dpdc r7 = (defpackage.dpdc) r7
            r0.e = r5
            r0.a = r2
            r0.d = r4
            java.lang.Object r7 = r7.d(r0)
            if (r7 != r1) goto L5a
            goto L86
        L73:
            dpey r7 = r5.a
            r2 = 0
            r0.e = r2
            r0.a = r2
            r0.d = r3
            java.lang.Object r7 = r7.d(r0)
            if (r7 != r1) goto L83
            goto L86
        L83:
            ffcu r7 = defpackage.ffcu.a
            return r7
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpcj.c(ffgu):java.lang.Object");
    }
}
