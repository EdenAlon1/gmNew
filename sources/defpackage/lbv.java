package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lbv extends ffhv implements ffji {
    Object a;
    int b;
    final /* synthetic */ lcc c;
    final /* synthetic */ ffhd d;
    final /* synthetic */ ffjm e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbv(lcc lccVar, ffhd ffhdVar, ffjm ffjmVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.c = lccVar;
        this.d = ffhdVar;
        this.e = ffjmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0029, code lost:
    
        if (r9 != r0) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r8.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 == r2) goto L12
            java.lang.Object r0 = r8.a
            defpackage.ffci.b(r9)
            return r0
        L12:
            java.lang.Object r1 = r8.a
            lah r1 = (defpackage.lah) r1
            defpackage.ffci.b(r9)
            goto L44
        L1a:
            defpackage.ffci.b(r9)
            goto L2b
        L1e:
            defpackage.ffci.b(r9)
            lcc r9 = r8.c
            r8.b = r3
            java.lang.Object r9 = r9.k(r3, r8)
            if (r9 == r0) goto L70
        L2b:
            ffhd r1 = r8.d
            ffjm r4 = r8.e
            lah r9 = (defpackage.lah) r9
            lbu r5 = new lbu
            r6 = 0
            r5.<init>(r4, r9, r6)
            r8.a = r9
            r8.b = r2
            java.lang.Object r1 = defpackage.ffra.a(r1, r5, r8)
            if (r1 == r0) goto L70
            r7 = r1
            r1 = r9
            r9 = r7
        L44:
            java.lang.Object r2 = r1.a
            if (r2 == 0) goto L4d
            int r2 = r2.hashCode()
            goto L4e
        L4d:
            r2 = 0
        L4e:
            int r4 = r1.b
            if (r2 != r4) goto L68
            java.lang.Object r1 = r1.a
            boolean r1 = defpackage.ffkj.e(r1, r9)
            if (r1 != 0) goto L67
            lcc r1 = r8.c
            r8.a = r9
            r2 = 3
            r8.b = r2
            java.lang.Object r1 = r1.l(r9, r3, r8)
            if (r1 == r0) goto L70
        L67:
            return r9
        L68:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data in DataStore was mutated but DataStore is only compatible with Immutable types."
            r9.<init>(r0)
            throw r9
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lbv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new lbv(this.c, this.d, this.e, (ffgu) obj).b(ffcu.a);
    }
}
