package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cehc implements ffxy {
    final /* synthetic */ ffxy a;
    final /* synthetic */ cehx b;

    public cehc(ffxy ffxyVar, cehx cehxVar) {
        this.a = ffxyVar;
        this.b = cehxVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        if (r11.fQ(r12, r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r12 == r1) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.ffxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(java.lang.Object r11, defpackage.ffgu r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.cehb
            if (r0 == 0) goto L13
            r0 = r12
            cehb r0 = (defpackage.cehb) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            cehb r0 = new cehb
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L42
            if (r2 == r6) goto L3c
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            defpackage.ffci.b(r12)
            goto L7c
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L36:
            java.lang.Object r11 = r0.c
            defpackage.ffci.b(r12)
            goto L71
        L3c:
            java.lang.Object r11 = r0.c
            defpackage.ffci.b(r12)
            goto L65
        L42:
            defpackage.ffci.b(r12)
            ffxy r12 = r10.a
            cehx r2 = r10.b
            r0.c = r12
            r0.b = r6
            ffhe r6 = defpackage.ffhe.a
            ffsm r7 = defpackage.ffsm.a
            ffhd r6 = defpackage.ekxi.a(r6)
            cehw r8 = new cehw
            r8.<init>(r3, r11, r2)
            ffsk r11 = r2.b
            ffss r11 = defpackage.ffra.b(r11, r6, r7, r8)
            if (r11 == r1) goto L7f
            r9 = r12
            r12 = r11
            r11 = r9
        L65:
            ffss r12 = (defpackage.ffss) r12
            r0.c = r11
            r0.b = r5
            java.lang.Object r12 = r12.c(r0)
            if (r12 == r1) goto L7f
        L71:
            r0.c = r3
            r0.b = r4
            java.lang.Object r11 = r11.fQ(r12, r0)
            if (r11 != r1) goto L7c
            goto L7f
        L7c:
            ffcu r11 = defpackage.ffcu.a
            return r11
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cehc.fQ(java.lang.Object, ffgu):java.lang.Object");
    }
}
