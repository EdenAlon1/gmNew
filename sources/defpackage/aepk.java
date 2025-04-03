package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aepk implements aepg {
    public final eisx a;
    public final eixo b;
    public final ejar c;
    private final ffsk d;
    private final ffhd e;
    private final ffss f;
    private final ffss g;

    public aepk(eisx eisxVar, eixo eixoVar, ejar ejarVar, ffsk ffskVar, ffhd ffhdVar) {
        eisxVar.getClass();
        eixoVar.getClass();
        ejarVar.getClass();
        ffskVar.getClass();
        ffhdVar.getClass();
        this.a = eisxVar;
        this.b = eixoVar;
        this.c = ejarVar;
        this.d = ffskVar;
        this.e = ffhdVar;
        this.f = ffra.b(ffskVar, ekxi.a(ffhdVar), ffsm.a, new aepi(null, this));
        this.g = ffra.b(ffskVar, ekxi.a(ffhdVar), ffsm.a, new aepj(null, this));
    }

    @Override // defpackage.aepg
    public final Object a(ffgu ffguVar) {
        return this.f.c(ffguVar);
    }

    @Override // defpackage.aepg
    public final Object b(ffgu ffguVar) {
        return this.g.c(ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.aepg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.aeph
            if (r0 == 0) goto L13
            r0 = r5
            aeph r0 = (defpackage.aeph) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aeph r0 = new aeph
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L3a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.a(r0)
            if (r5 == r1) goto L52
        L3a:
            eixz r5 = (defpackage.eixz) r5
            r0 = 0
            if (r5 == 0) goto L4c
            java.lang.String r5 = r5.k
            if (r5 == 0) goto L4c
            java.lang.String r1 = "pseudonymous"
            boolean r5 = defpackage.ffkj.e(r5, r1)
            if (r5 != 0) goto L4c
            goto L4d
        L4c:
            r3 = r0
        L4d:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aepk.c(ffgu):java.lang.Object");
    }
}
