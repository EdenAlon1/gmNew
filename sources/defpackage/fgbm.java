package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgbm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ fgcz b;
    final /* synthetic */ ffxx c;
    final /* synthetic */ fgcl d;
    final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgbm(fgcz fgczVar, ffxx ffxxVar, fgcl fgclVar, Object obj, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = fgczVar;
        this.c = ffxxVar;
        this.d = fgclVar;
        this.e = obj;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fgbm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if (r7.a(r1, r6) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        if (defpackage.fgbj.b(r7, r1, r6) != r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        if (defpackage.ffyk.b(r7, r5, r6) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004e, code lost:
    
        if (r7.a(r1, r6) == r0) goto L23;
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
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L16
            if (r1 == r4) goto L12
            if (r1 == r3) goto Le
            goto L12
        Le:
            defpackage.ffci.b(r7)
            goto L44
        L12:
            defpackage.ffci.b(r7)
            goto L74
        L16:
            defpackage.ffci.b(r7)
            fgcz r7 = r6.b
            fgcz r1 = defpackage.fgcy.a
            if (r7 != r1) goto L2c
            ffxx r7 = r6.c
            fgcl r1 = r6.d
            r6.a = r4
            java.lang.Object r7 = r7.a(r1, r6)
            if (r7 != r0) goto L74
            goto L73
        L2c:
            fgcz r1 = defpackage.fgcy.b
            r4 = 0
            if (r7 != r1) goto L51
            fgcl r7 = r6.d
            fgdj r7 = r7.b()
            fgbk r1 = new fgbk
            r1.<init>(r4)
            r6.a = r3
            java.lang.Object r7 = defpackage.fgbj.b(r7, r1, r6)
            if (r7 == r0) goto L73
        L44:
            ffxx r7 = r6.c
            fgcl r1 = r6.d
            r6.a = r2
            java.lang.Object r7 = r7.a(r1, r6)
            if (r7 != r0) goto L74
            goto L73
        L51:
            fgcl r1 = r6.d
            fgdj r1 = r1.b()
            ffxx r7 = r7.a(r1)
            ffxx r7 = defpackage.ffyy.a(r7)
            ffxx r1 = r6.c
            fgcl r2 = r6.d
            java.lang.Object r3 = r6.e
            fgbl r5 = new fgbl
            r5.<init>(r1, r2, r3, r4)
            r1 = 4
            r6.a = r1
            java.lang.Object r7 = defpackage.ffyk.b(r7, r5, r6)
            if (r7 != r0) goto L74
        L73:
            return r0
        L74:
            ffcu r7 = defpackage.ffcu.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgbm.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new fgbm(this.b, this.c, this.d, this.e, ffguVar);
    }
}
