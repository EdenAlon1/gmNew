package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lbe extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ lcc c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbe(lcc lccVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = lccVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lbe) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ae, code lost:
    
        if (defpackage.ffyk.c(r2, r1, r7) != r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        if (r1.fQ(r3, r7) != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        if ((r8 instanceof defpackage.lcr) != false) goto L28;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.b
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1c
            if (r1 == r2) goto L12
            defpackage.ffci.b(r8)
            goto Lb1
        L12:
            java.lang.Object r1 = r7.a
            java.lang.Object r2 = r7.d
            ffxy r2 = (defpackage.ffxy) r2
            defpackage.ffci.b(r8)
            goto L6c
        L1c:
            java.lang.Object r1 = r7.d
            ffxy r1 = (defpackage.ffxy) r1
            defpackage.ffci.b(r8)
            goto L45
        L24:
            defpackage.ffci.b(r8)
            java.lang.Object r8 = r7.d
            ffxy r8 = (defpackage.ffxy) r8
            lcc r1 = r7.c
            r7.d = r8
            r7.b = r3
            ffsk r3 = r1.b
            ffhd r3 = r3.hT()
            lbs r5 = new lbs
            r5.<init>(r1, r4)
            java.lang.Object r1 = defpackage.ffra.a(r3, r5, r7)
            if (r1 == r0) goto Lc1
            r6 = r1
            r1 = r8
            r8 = r6
        L45:
            ldh r8 = (defpackage.ldh) r8
            boolean r3 = r8 instanceof defpackage.lah
            if (r3 == 0) goto L5d
            r3 = r8
            lah r3 = (defpackage.lah) r3
            java.lang.Object r3 = r3.a
            r7.d = r1
            r7.a = r8
            r7.b = r2
            java.lang.Object r2 = r1.fQ(r3, r7)
            if (r2 == r0) goto Lc1
            goto L6a
        L5d:
            boolean r2 = r8 instanceof defpackage.ldl
            if (r2 != 0) goto Lb9
            boolean r2 = r8 instanceof defpackage.lcw
            if (r2 != 0) goto Lb4
            boolean r2 = r8 instanceof defpackage.lcr
            if (r2 == 0) goto L6a
            goto Lb1
        L6a:
            r2 = r1
            r1 = r8
        L6c:
            lcc r8 = r7.c
            lax r3 = new lax
            r3.<init>(r8, r4)
            lcd r8 = r8.c
            fgcm r8 = r8.a
            ffzh r5 = new ffzh
            r5.<init>(r3, r8)
            lay r8 = new lay
            r8.<init>(r4)
            fgad r3 = new fgad
            r3.<init>(r5, r8)
            laz r8 = new laz
            ldh r1 = (defpackage.ldh) r1
            r8.<init>(r1, r4)
            ffzu r1 = new ffzu
            r1.<init>(r3, r8)
            lbd r8 = new lbd
            r8.<init>(r1)
            lcc r1 = r7.c
            lba r3 = new lba
            r3.<init>(r1, r4)
            ffzb r1 = new ffzb
            r1.<init>(r8, r3)
            r7.d = r4
            r7.a = r4
            r8 = 3
            r7.b = r8
            java.lang.Object r8 = defpackage.ffyk.c(r2, r1, r7)
            if (r8 != r0) goto Lb1
            goto Lc1
        Lb1:
            ffcu r8 = defpackage.ffcu.a
            return r8
        Lb4:
            lcw r8 = (defpackage.lcw) r8
            java.lang.Throwable r8 = r8.a
            throw r8
        Lb9:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            r8.<init>(r0)
            throw r8
        Lc1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lbe.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        lbe lbeVar = new lbe(this.c, ffguVar);
        lbeVar.d = obj;
        return lbeVar;
    }
}
