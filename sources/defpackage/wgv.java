package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wgv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ wgw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wgv(wgw wgwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = wgwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wgv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r7 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0093, code lost:
    
        if (r7 != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0097, code lost:
    
        return (defpackage.aixr) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003d, code lost:
    
        return (defpackage.aixr) r7;
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
            r2 = 1
            defpackage.ffci.b(r7)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L95
            goto L3b
        Ld:
            cfup r7 = defpackage.ctjd.bg
            java.lang.Object r7 = r7.e()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r1 = 0
            r3 = 2
            if (r7 != 0) goto L3e
            cfup r7 = defpackage.ctjd.bd
            java.lang.Object r7 = r7.e()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L2c
            goto L3e
        L2c:
            wgw r7 = r6.b
            r6.a = r3
            aixt r7 = r7.a
            r2 = 0
            r3 = 3
            java.lang.Object r7 = defpackage.aixp.a(r7, r2, r1, r6, r3)
            if (r7 != r0) goto L3b
            goto L98
        L3b:
            aixr r7 = (defpackage.aixr) r7
            return r7
        L3e:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            cfup r4 = defpackage.ctjd.bd
            java.lang.Object r4 = r4.e()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L66
            cfup r4 = defpackage.ctjd.be
            java.lang.Object r4 = r4.e()
            java.lang.Number r4 = (java.lang.Number) r4
            long r4 = r4.longValue()
            int r4 = (int) r4
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            r7.add(r5)
        L66:
            cfup r4 = defpackage.ctjd.bg
            java.lang.Object r4 = r4.e()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L89
            cfup r4 = defpackage.ctjd.bh
            java.lang.Object r4 = r4.e()
            java.lang.Number r4 = (java.lang.Number) r4
            long r4 = r4.longValue()
            int r4 = (int) r4
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            r7.add(r5)
        L89:
            wgw r4 = r6.b
            r6.a = r2
            aixt r2 = r4.a
            java.lang.Object r7 = defpackage.aixp.a(r2, r7, r1, r6, r3)
            if (r7 == r0) goto L98
        L95:
            aixr r7 = (defpackage.aixr) r7
            return r7
        L98:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new wgv(this.b, ffguVar);
    }
}
