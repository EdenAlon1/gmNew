package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xky implements ffxy {
    final /* synthetic */ ffxy a;
    final /* synthetic */ xle b;

    public xky(ffxy ffxyVar, xle xleVar) {
        this.a = ffxyVar;
        this.b = xleVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008a, code lost:
    
        if (r2.fQ(r5, r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.ffxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(java.lang.Object r11, defpackage.ffgu r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.xkx
            if (r0 == 0) goto L13
            r0 = r12
            xkx r0 = (defpackage.xkx) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            xkx r0 = new xkx
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            defpackage.ffci.b(r12)
            goto L8d
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            long r5 = r0.f
            int r11 = r0.e
            java.lang.Object r2 = r0.c
            defpackage.ffci.b(r12)
            goto L71
        L3d:
            defpackage.ffci.b(r12)
            ffxy r2 = r10.a
            alxg r11 = (defpackage.alxg) r11
            long r6 = r11.c()
            int r12 = r11.b()
            aqux r11 = r11.g()
            if (r11 == 0) goto L7c
            xle r8 = r10.b
            ffhd r8 = r8.d
            ffhd r8 = defpackage.ekxi.a(r8)
            xla r9 = new xla
            r9.<init>(r3, r11)
            r0.c = r2
            r0.e = r12
            r0.f = r6
            r0.b = r5
            java.lang.Object r11 = defpackage.ffra.a(r8, r9, r0)
            if (r11 == r1) goto L8c
            r5 = r12
            r12 = r11
            r11 = r5
            r5 = r6
        L71:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            r7 = r12
            r12 = r11
            r11 = r7
            r6 = r5
            goto L7d
        L7c:
            r11 = 0
        L7d:
            xiq r5 = new xiq
            r5.<init>(r6, r12, r11)
            r0.c = r3
            r0.b = r4
            java.lang.Object r11 = r2.fQ(r5, r0)
            if (r11 != r1) goto L8d
        L8c:
            return r1
        L8d:
            ffcu r11 = defpackage.ffcu.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xky.fQ(java.lang.Object, ffgu):java.lang.Object");
    }
}
