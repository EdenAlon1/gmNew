package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bziu extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ bzid c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bziu(bzid bzidVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = bzidVar;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bziu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (r7.k(r3, (java.lang.String) r1, true, r6) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (r7 != r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002f, code lost:
    
        if (r7 != r0) goto L11;
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
            int r1 = r6.b
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1b
            if (r1 == r4) goto L17
            if (r1 == r3) goto L11
            defpackage.ffci.b(r7)
            goto L71
        L11:
            java.lang.Object r1 = r6.a
            defpackage.ffci.b(r7)
            goto L51
        L17:
            defpackage.ffci.b(r7)
            goto L31
        L1b:
            defpackage.ffci.b(r7)
            bzid r7 = r6.c
            bzku r1 = defpackage.bzkv.a
            bzit r5 = new bzit
            r5.<init>(r7, r2)
            r6.b = r4
            eisx r7 = r7.a
            java.lang.Object r7 = r1.a(r7, r3, r5, r6)
            if (r7 == r0) goto L76
        L31:
            eixn r7 = (defpackage.eixn) r7
            eixz r1 = r7.b()
            java.lang.String r1 = r1.g
            r1.getClass()
            bzid r5 = r6.c
            eixz r7 = r7.b()
            java.lang.String r7 = r7.k
            r7.getClass()
            r6.a = r1
            r6.b = r3
            java.lang.Object r7 = r5.w(r7, r1, r6)
            if (r7 == r0) goto L76
        L51:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L5f
            r7 = 0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L5f:
            bzid r7 = r6.c
            int r3 = r6.d
            r6.a = r2
            r2 = 3
            r6.b = r2
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r7 = r7.k(r3, r1, r4, r6)
            if (r7 != r0) goto L71
            goto L76
        L71:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            return r7
        L76:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bziu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bziu(this.c, this.d, ffguVar);
    }
}
