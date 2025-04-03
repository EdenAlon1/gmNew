package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fee extends ffhu implements ffjm {
    int a;
    final /* synthetic */ fcp b;
    final /* synthetic */ fcl c;
    final /* synthetic */ evy d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fee(fcp fcpVar, fcl fclVar, evy evyVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = fcpVar;
        this.c = fclVar;
        this.d = evyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fee) c((iju) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (defpackage.fek.d(r1, r3, r5, r9, r8) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        if (defpackage.fek.e(r1, r2, r9, r8) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0026, code lost:
    
        if (r9 != r0) goto L9;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r8.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L16
            if (r1 == r3) goto Le
            defpackage.ffci.b(r9)
            goto L74
        Le:
            java.lang.Object r1 = r8.e
            iju r1 = (defpackage.iju) r1
            defpackage.ffci.b(r9)
            goto L28
        L16:
            defpackage.ffci.b(r9)
            java.lang.Object r9 = r8.e
            r1 = r9
            iju r1 = (defpackage.iju) r1
            r8.e = r1
            r8.a = r3
            java.lang.Object r9 = defpackage.fek.c(r1, r8)
            if (r9 == r0) goto L77
        L28:
            iki r9 = (defpackage.iki) r9
            boolean r3 = defpackage.fek.g(r9)
            r4 = 0
            if (r3 == 0) goto L60
            int r3 = r9.c
            boolean r3 = defpackage.ikn.a(r3)
            if (r3 == 0) goto L60
            java.util.List r3 = r9.a
            int r5 = r3.size()
            r6 = 0
        L40:
            if (r6 >= r5) goto L51
            java.lang.Object r7 = r3.get(r6)
            iku r7 = (defpackage.iku) r7
            boolean r7 = r7.c()
            if (r7 != 0) goto L60
            int r6 = r6 + 1
            goto L40
        L51:
            fcp r3 = r8.b
            fcl r5 = r8.c
            r8.e = r4
            r8.a = r2
            java.lang.Object r9 = defpackage.fek.d(r1, r3, r5, r9, r8)
            if (r9 != r0) goto L74
            goto L77
        L60:
            boolean r2 = defpackage.fek.g(r9)
            if (r2 != 0) goto L74
            evy r2 = r8.d
            r8.e = r4
            r3 = 3
            r8.a = r3
            java.lang.Object r9 = defpackage.fek.e(r1, r2, r9, r8)
            if (r9 != r0) goto L74
            goto L77
        L74:
            ffcu r9 = defpackage.ffcu.a
            return r9
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fee.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        fee feeVar = new fee(this.b, this.c, this.d, ffguVar);
        feeVar.e = obj;
        return feeVar;
    }
}
