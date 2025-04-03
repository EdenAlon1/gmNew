package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ouw implements ffxy {
    final /* synthetic */ ffxy a;
    final /* synthetic */ otb b;
    final /* synthetic */ ffji c;

    public ouw(ffxy ffxyVar, otb otbVar, ffji ffjiVar) {
        this.a = ffxyVar;
        this.b = otbVar;
        this.c = ffjiVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (r8.fQ(r9, r0) != r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.ffxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(java.lang.Object r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.ouv
            if (r0 == 0) goto L13
            r0 = r9
            ouv r0 = (defpackage.ouv) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ouv r0 = new ouv
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r9)
            goto L5d
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            java.lang.Object r8 = r0.c
            defpackage.ffci.b(r9)
            goto L51
        L38:
            defpackage.ffci.b(r9)
            ffxy r9 = r7.a
            java.util.Set r8 = (java.util.Set) r8
            otb r8 = r7.b
            ffji r2 = r7.c
            r0.c = r9
            r0.b = r4
            r5 = 0
            java.lang.Object r8 = defpackage.ovw.c(r8, r4, r5, r2, r0)
            if (r8 == r1) goto L60
            r6 = r9
            r9 = r8
            r8 = r6
        L51:
            r2 = 0
            r0.c = r2
            r0.b = r3
            java.lang.Object r8 = r8.fQ(r9, r0)
            if (r8 != r1) goto L5d
            goto L60
        L5d:
            ffcu r8 = defpackage.ffcu.a
            return r8
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ouw.fQ(java.lang.Object, ffgu):java.lang.Object");
    }
}
