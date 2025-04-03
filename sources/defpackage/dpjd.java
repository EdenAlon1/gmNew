package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpjd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cxj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpjd(cxj cxjVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cxjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpjd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (defpackage.cxj.j(r6, r7, r8, null, r12, 12) != r0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0056, code lost:
    
        if (defpackage.cxj.j(r5, r6, r7, null, r9, 12) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005c, code lost:
    
        return r0;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r13) {
        /*
            r12 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r12.a
            r2 = 6
            r3 = 0
            r4 = 0
            r5 = 1
            defpackage.ffci.b(r13)
            if (r1 == 0) goto L12
            if (r1 == r5) goto L10
            goto L59
        L10:
            r9 = r12
            goto L36
        L12:
            cxj r6 = r12.b
            java.lang.Float r7 = new java.lang.Float
            r13 = 1066192077(0x3f8ccccd, float:1.1)
            r7.<init>(r13)
            j$.time.Duration r13 = defpackage.dpgt.a
            j$.time.Duration r13 = defpackage.dpgt.a
            long r8 = r13.toMillis()
            int r13 = (int) r8
            dbu r8 = defpackage.cxu.c(r13, r4, r3, r2)
            r12.a = r5
            r9 = 0
            r11 = 12
            r10 = r12
            java.lang.Object r13 = defpackage.cxj.j(r6, r7, r8, r9, r10, r11)
            r9 = r10
            if (r13 == r0) goto L5c
        L36:
            cxj r5 = r9.b
            java.lang.Float r6 = new java.lang.Float
            r13 = 1065353216(0x3f800000, float:1.0)
            r6.<init>(r13)
            j$.time.Duration r13 = defpackage.dpgt.a
            j$.time.Duration r13 = defpackage.dpgt.b
            long r7 = r13.toMillis()
            int r13 = (int) r7
            dbu r7 = defpackage.cxu.c(r13, r4, r3, r2)
            r13 = 2
            r9.a = r13
            r8 = 0
            r10 = 12
            java.lang.Object r13 = defpackage.cxj.j(r5, r6, r7, r8, r9, r10)
            if (r13 != r0) goto L59
            goto L5c
        L59:
            ffcu r13 = defpackage.ffcu.a
            return r13
        L5c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpjd.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpjd(this.b, ffguVar);
    }
}
