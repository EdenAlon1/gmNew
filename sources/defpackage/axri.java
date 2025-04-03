package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axri implements axrc {
    private final fgdj a;
    private final Object b;

    public axri(fgdj fgdjVar) {
        this.a = fgdjVar;
        this.b = fgdjVar.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.ffxx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffxy r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.axrh
            if (r0 == 0) goto L13
            r0 = r6
            axrh r0 = (defpackage.axrh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            axrh r0 = new axrh
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            defpackage.ffci.b(r6)
            goto L3d
        L2f:
            defpackage.ffci.b(r6)
            fgdj r6 = r4.a
            r0.c = r3
            java.lang.Object r5 = r6.a(r5, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            ffbx r5 = new ffbx
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axri.a(ffxy, ffgu):java.lang.Object");
    }

    @Override // defpackage.axrc
    public final Object b() {
        return this.b;
    }
}
