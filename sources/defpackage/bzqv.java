package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzqv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bzqw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzqv(bzqw bzqwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = bzqwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzqv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (r7.f(r6) != r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (r7 != r0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000f, code lost:
    
        if (r1 != 2) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004a, code lost:
    
        r7 = r6.b;
        r1 = defpackage.ekxi.a(r7.c);
        r4 = new defpackage.bzqu(null, r7);
        r6.a = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
    
        if (defpackage.ffra.a(r1, r4, r6) != r0) goto L21;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.a
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L16
            if (r1 == r5) goto L12
            defpackage.ffci.b(r7)
            if (r1 == r4) goto L4a
            goto L6e
        L12:
            defpackage.ffci.b(r7)
            goto L38
        L16:
            defpackage.ffci.b(r7)
            bzqw r7 = r6.b
            ffbr r7 = r7.d
            java.lang.Object r7 = r7.b()
            bzqc r7 = (defpackage.bzqc) r7
            bzqw r1 = r6.b
            awui r1 = r1.f
            java.lang.String r1 = r1.d
            elfl r7 = r7.e(r1)
            r7.getClass()
            r6.a = r5
            java.lang.Object r7 = defpackage.fgfz.c(r7, r6)
            if (r7 == r0) goto L6f
        L38:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L60
            bzqw r7 = r6.b
            r6.a = r4
            java.lang.Object r7 = r7.f(r6)
            if (r7 == r0) goto L6f
        L4a:
            bzqw r7 = r6.b
            ffhd r1 = r7.c
            ffhd r1 = defpackage.ekxi.a(r1)
            bzqu r4 = new bzqu
            r4.<init>(r2, r7)
            r6.a = r3
            java.lang.Object r7 = defpackage.ffra.a(r1, r4, r6)
            if (r7 != r0) goto L6e
            goto L6f
        L60:
            bzqw r7 = r6.b
            caqc r1 = defpackage.caqc.DOWNGRADE_E2EE_NOT_PROVISIONED
            r3 = 4
            r6.a = r3
            java.lang.Object r7 = r7.j(r1, r6)
            if (r7 != r0) goto L6e
            goto L6f
        L6e:
            return r2
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzqv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bzqv(this.b, ffguVar);
    }
}
