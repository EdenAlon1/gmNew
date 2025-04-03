package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drvz extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ drwc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drvz(drwc drwcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = drwcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drvz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006d, code lost:
    
        if (r6.bf(r1, r5) == r0) goto L21;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.c
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            if (r1 == r2) goto Le
            defpackage.ffci.b(r6)
            goto L70
        Le:
            java.lang.Object r1 = r5.b
            java.lang.Object r2 = r5.a
            defpackage.ffci.b(r6)
            goto L42
        L16:
            defpackage.ffci.b(r6)
            drwc r6 = r5.d
            aesp r1 = r6.bj()
            drub r4 = new drub
            boolean r6 = r6.bh()
            r4.<init>(r6)
            drwc r6 = r5.d
            aepl r6 = r6.an
            if (r6 != 0) goto L34
            java.lang.String r6 = "accountSignIn"
            defpackage.ffkj.c(r6)
            r6 = r3
        L34:
            r5.a = r1
            r5.b = r4
            r5.c = r2
            java.lang.Object r6 = r6.a(r5)
            if (r6 == r0) goto L73
            r2 = r1
            r1 = r4
        L42:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            drwc r4 = r5.d
            java.lang.String r4 = r4.al
            if (r4 != 0) goto L54
            java.lang.String r4 = "mimeType"
            defpackage.ffkj.c(r4)
            r4 = r3
        L54:
            aesp r2 = (defpackage.aesp) r2
            druc r1 = (defpackage.druc) r1
            r2.b(r1, r6, r4)
            drwc r6 = r5.d
            drvy r1 = new drvy
            r1.<init>(r6, r3)
            r5.a = r3
            r5.b = r3
            r2 = 2
            r5.c = r2
            java.lang.Object r6 = r6.bf(r1, r5)
            if (r6 != r0) goto L70
            goto L73
        L70:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drvz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new drvz(this.d, ffguVar);
    }
}
