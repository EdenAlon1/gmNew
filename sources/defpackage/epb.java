package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class epb implements dpq {
    public final eot a;
    private final dtt b;

    public epb(dtt dttVar, eot eotVar) {
        this.b = dttVar;
        this.a = eotVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.dpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.drd r6, float r7, defpackage.ffgu r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.eoz
            if (r0 == 0) goto L13
            r0 = r8
            eoz r0 = (defpackage.eoz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            eoz r0 = new eoz
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            epb r6 = r0.d
            defpackage.ffci.b(r8)
            goto L46
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.ffci.b(r8)
            dtt r8 = r5.b
            epa r2 = new epa
            r2.<init>(r5)
            r0.d = r5
            r0.c = r3
            java.lang.Object r8 = r8.b(r6, r7, r2, r0)
            if (r8 == r1) goto L9c
            r6 = r5
        L46:
            java.lang.Number r8 = (java.lang.Number) r8
            float r7 = r8.floatValue()
            eot r8 = r6.a
            float r8 = r8.c()
            r0 = 0
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 != 0) goto L58
            goto L91
        L58:
            eot r8 = r6.a
            float r8 = r8.c()
            float r8 = java.lang.Math.abs(r8)
            double r1 = (double) r8
            r3 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 >= 0) goto L91
            eot r6 = r6.a
            int r8 = r6.j()
            boolean r1 = r6.i()
            if (r1 == 0) goto L8c
            hho r1 = r6.n
            java.lang.Object r1 = r1.a()
            eob r1 = (defpackage.eob) r1
            ffsk r1 = r1.o
            eon r2 = new eon
            r3 = 0
            r2.<init>(r6, r3)
            r4 = 3
            defpackage.ffqy.d(r1, r3, r3, r2, r4)
        L8c:
            r1 = 0
            r6.u(r8, r0, r1)
            goto L96
        L91:
            eot r6 = r6.a
            r6.c()
        L96:
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r7)
            return r6
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.epb.a(drd, float, ffgu):java.lang.Object");
    }
}
