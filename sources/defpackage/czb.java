package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class czb extends ffkk implements ffji {
    final /* synthetic */ hho a;
    final /* synthetic */ czg b;
    final /* synthetic */ ffky c;
    final /* synthetic */ ffsk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czb(hho hhoVar, czg czgVar, ffky ffkyVar, ffsk ffskVar) {
        super(1);
        this.a = hhoVar;
        this.b = czgVar;
        this.c = ffkyVar;
        this.d = ffskVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:
    
        if (r12.c.a == defpackage.dap.a(r12.d.hT())) goto L15;
     */
    @Override // defpackage.ffji
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Number r13 = (java.lang.Number) r13
            long r0 = r13.longValue()
            hho r13 = r12.a
            java.lang.Object r13 = r13.a()
            hkx r13 = (defpackage.hkx) r13
            if (r13 == 0) goto L1b
            java.lang.Object r13 = r13.a()
            java.lang.Number r13 = (java.lang.Number) r13
            long r2 = r13.longValue()
            goto L1c
        L1b:
            r2 = r0
        L1c:
            czg r13 = r12.b
            long r4 = r13.b
            r6 = -9223372036854775808
            int r13 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r4 = 0
            r5 = 1
            if (r13 == 0) goto L3b
            ffky r13 = r12.c
            ffsk r6 = r12.d
            float r13 = r13.a
            ffhd r6 = r6.hT()
            float r6 = defpackage.dap.a(r6)
            int r13 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r13 != 0) goto L3b
            goto L5f
        L3b:
            czg r13 = r12.b
            r13.b = r0
            hne r13 = r13.a
            java.lang.Object[] r0 = r13.a
            int r13 = r13.b
            r1 = r4
        L46:
            if (r1 >= r13) goto L51
            r6 = r0[r1]
            cza r6 = (defpackage.cza) r6
            r6.g = r5
            int r1 = r1 + 1
            goto L46
        L51:
            ffky r13 = r12.c
            ffsk r0 = r12.d
            ffhd r0 = r0.hT()
            float r0 = defpackage.dap.a(r0)
            r13.a = r0
        L5f:
            ffky r13 = r12.c
            float r13 = r13.a
            r0 = 0
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 != 0) goto L82
            czg r13 = r12.b
            hne r13 = r13.a
            java.lang.Object[] r0 = r13.a
            int r13 = r13.b
        L70:
            if (r4 >= r13) goto Lcc
            r1 = r0[r4]
            cza r1 = (defpackage.cza) r1
            daq r2 = r1.e
            java.lang.Object r2 = r2.a
            r1.b(r2)
            r1.g = r5
            int r4 = r4 + 1
            goto L70
        L82:
            czg r0 = r12.b
            long r6 = r0.b
            long r2 = r2 - r6
            float r1 = (float) r2
            float r1 = r1 / r13
            hne r13 = r0.a
            java.lang.Object[] r2 = r13.a
            int r13 = r13.b
            r3 = r4
            r6 = r5
        L91:
            if (r3 >= r13) goto Lc1
            r7 = r2[r3]
            cza r7 = (defpackage.cza) r7
            boolean r8 = r7.f
            if (r8 != 0) goto Lbd
            long r8 = (long) r1
            czg r10 = r7.i
            r10.b(r4)
            boolean r10 = r7.g
            if (r10 == 0) goto La9
            r7.g = r4
            r7.h = r8
        La9:
            long r10 = r7.h
            long r8 = r8 - r10
            daq r10 = r7.e
            java.lang.Object r10 = r10.d(r8)
            r7.b(r10)
            daq r10 = r7.e
            boolean r8 = defpackage.cxp.a(r10, r8)
            r7.f = r8
        Lbd:
            r6 = r6 & r8
            int r3 = r3 + 1
            goto L91
        Lc1:
            r13 = r6 ^ 1
            hho r0 = r0.c
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r0.b(r13)
        Lcc:
            ffcu r13 = defpackage.ffcu.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czb.invoke(java.lang.Object):java.lang.Object");
    }
}
