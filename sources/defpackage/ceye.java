package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ceye extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ceze b;
    final /* synthetic */ ceyf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ceye(ceze cezeVar, ceyf ceyfVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cezeVar;
        this.c = ceyfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ceye) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0051, code lost:
    
        r5 = (defpackage.ppz) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        if (r5 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (r5 != r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002b, code lost:
    
        if (r5 != r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        if (r1 != 2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x006f, code lost:
    
        r5 = (defpackage.ppz) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0071, code lost:
    
        r5.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0074, code lost:
    
        return r5;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r4.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L10
            defpackage.ffci.b(r5)
            if (r1 == r3) goto L2d
            if (r1 == r2) goto L6f
            goto L51
        L10:
            defpackage.ffci.b(r5)
            ceze r5 = r4.b
            if (r5 != 0) goto L1a
            ppz r5 = defpackage.pqb.a
            return r5
        L1a:
            ceyf r1 = r4.c
            java.lang.String r5 = r5.r()
            r5.getClass()
            r4.a = r3
            cexi r1 = r1.c
            java.lang.Object r5 = r1.d(r5, r4)
            if (r5 == r0) goto L75
        L2d:
            cexh r5 = (defpackage.cexh) r5
            int r5 = r5.ordinal()
            if (r5 == 0) goto L5a
            if (r5 != r3) goto L54
            ceyf r5 = r4.c
            ffbr r5 = r5.b
            java.lang.Object r5 = r5.b()
            cfdp r5 = (defpackage.cfdp) r5
            ceze r1 = r4.b
            elfl r5 = r5.b(r1)
            r1 = 3
            r4.a = r1
            java.lang.Object r5 = defpackage.fgfz.c(r5, r4)
            if (r5 != r0) goto L51
            goto L75
        L51:
            ppz r5 = (defpackage.ppz) r5
            goto L71
        L54:
            ffcd r5 = new ffcd
            r5.<init>()
            throw r5
        L5a:
            ceyf r5 = r4.c
            ceze r1 = r4.b
            ceza r5 = r5.a
            elfl r5 = r5.b(r1)
            r5.getClass()
            r4.a = r2
            java.lang.Object r5 = defpackage.fgfz.c(r5, r4)
            if (r5 == r0) goto L75
        L6f:
            ppz r5 = (defpackage.ppz) r5
        L71:
            r5.getClass()
            return r5
        L75:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceye.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ceye(this.b, this.c, ffguVar);
    }
}
