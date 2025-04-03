package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jfk {
    private static final hik a = new hky(jfh.a);

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.iwx r5, defpackage.jcp r6, defpackage.ffjm r7, defpackage.ffgu r8) {
        /*
            boolean r0 = r8 instanceof defpackage.jfj
            if (r0 == 0) goto L13
            r0 = r8
            jfj r0 = (defpackage.jfj) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            jfj r0 = new jfj
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L37
            if (r2 == r3) goto L2e
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2e:
            defpackage.ffci.b(r8)
            ffbx r5 = new ffbx
            r5.<init>()
            throw r5
        L37:
            defpackage.ffci.b(r8)
            goto L49
        L3b:
            defpackage.ffci.b(r8)
            if (r6 != 0) goto L4f
            r0.b = r4
            java.lang.Object r5 = r5.o(r7, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            ffbx r5 = new ffbx
            r5.<init>()
            throw r5
        L4f:
            r0.b = r3
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jfk.a(iwx, jcp, ffjm, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.fai r4, defpackage.ffjm r5, defpackage.ffgu r6) {
        /*
            boolean r0 = r6 instanceof defpackage.jfi
            if (r0 == 0) goto L13
            r0 = r6
            jfi r0 = (defpackage.jfi) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            jfi r0 = new jfi
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            defpackage.ffci.b(r6)
            goto L53
        L2f:
            defpackage.ffci.b(r6)
            hvh r6 = r4.p
            boolean r6 = r6.z
            if (r6 == 0) goto L59
            iwx r6 = defpackage.isx.f(r4)
            iui r4 = defpackage.isx.d(r4)
            hgb r4 = r4.v
            hik r2 = defpackage.jfk.a
            java.lang.Object r4 = r4.a(r2)
            jcp r4 = (defpackage.jcp) r4
            r0.b = r3
            java.lang.Object r4 = a(r6, r4, r5, r0)
            if (r4 != r1) goto L53
            return r1
        L53:
            ffbx r4 = new ffbx
            r4.<init>()
            throw r4
        L59:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "establishTextInputSession called from an unattached node"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jfk.b(fai, ffjm, ffgu):java.lang.Object");
    }
}
