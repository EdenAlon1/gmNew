package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpdp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dpds b;
    final /* synthetic */ ffrp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpdp(dpds dpdsVar, ffrp ffrpVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dpdsVar;
        this.c = ffrpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpdp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0080, code lost:
    
        return defpackage.ffcu.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (r7 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        if (r5.a(r1, r6) != r0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
    
        if (r1 != 2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x006b, code lost:
    
        r7 = r6.b.e;
        r1 = new defpackage.dpdd((byte[]) null);
        r6.a = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x007b, code lost:
    
        if (r7.fQ(r1, r6) != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0081, code lost:
    
        return r0;
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
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L11
            defpackage.ffci.b(r7)
            if (r1 == r3) goto L3d
            if (r1 == r2) goto L6b
            goto L7e
        L11:
            defpackage.ffci.b(r7)
            dpds r7 = r6.b
            ffrp r1 = r6.c
            fgcq r7 = r7.f
            dpdm r5 = new dpdm
            r5.<init>(r1, r4)
            fgds r1 = new fgds
            r1.<init>(r7, r5)
            dpdn r7 = new dpdn
            r7.<init>(r4)
            fgad r5 = new fgad
            r5.<init>(r1, r7)
            dpds r7 = r6.b
            dpdo r1 = new dpdo
            r1.<init>(r7)
            r6.a = r3
            java.lang.Object r7 = r5.a(r1, r6)
            if (r7 == r0) goto L81
        L3d:
            dpds r7 = r6.b
            r6.a = r2
            ffrh r1 = new ffrh
            ffgu r2 = defpackage.ffhi.c(r6)
            r1.<init>(r2, r3)
            r1.B()
            faem r2 = r7.h
            if (r2 != 0) goto L57
            java.lang.String r2 = "processor"
            defpackage.ffkj.c(r2)
            r2 = r4
        L57:
            dpdr r3 = new dpdr
            r3.<init>(r7, r1)
            r2.e(r3)
            java.lang.Object r7 = r1.m()
            ffhh r1 = defpackage.ffhh.a
            if (r7 == r1) goto L69
            ffcu r7 = defpackage.ffcu.a
        L69:
            if (r7 == r0) goto L81
        L6b:
            dpds r7 = r6.b
            fgcl r7 = r7.e
            dpdd r1 = new dpdd
            r1.<init>(r4)
            r2 = 3
            r6.a = r2
            java.lang.Object r7 = r7.fQ(r1, r6)
            if (r7 != r0) goto L7e
            goto L81
        L7e:
            ffcu r7 = defpackage.ffcu.a
            return r7
        L81:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpdp.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpdp(this.b, this.c, ffguVar);
    }
}
