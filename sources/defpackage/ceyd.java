package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ceyd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ceze b;
    final /* synthetic */ ceyf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ceyd(ceze cezeVar, ceyf ceyfVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cezeVar;
        this.c = ceyfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ceyd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004c, code lost:
    
        r5 = (defpackage.ppz) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        if (r5 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (r5 != r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0026, code lost:
    
        if (r5 != r0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        if (r1 != 2) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x006a, code lost:
    
        r5 = (defpackage.ppz) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x006c, code lost:
    
        r5.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006f, code lost:
    
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
            if (r1 == r3) goto L28
            if (r1 == r2) goto L6a
            goto L4c
        L10:
            defpackage.ffci.b(r5)
            ceyf r5 = r4.c
            ceze r1 = r4.b
            java.lang.String r1 = r1.r()
            r1.getClass()
            r4.a = r3
            cexi r5 = r5.c
            java.lang.Object r5 = r5.d(r1, r4)
            if (r5 == r0) goto L70
        L28:
            cexh r5 = (defpackage.cexh) r5
            int r5 = r5.ordinal()
            if (r5 == 0) goto L55
            if (r5 != r3) goto L4f
            ceyf r5 = r4.c
            ffbr r5 = r5.b
            java.lang.Object r5 = r5.b()
            cfdp r5 = (defpackage.cfdp) r5
            ceze r1 = r4.b
            elfl r5 = r5.a(r1)
            r1 = 3
            r4.a = r1
            java.lang.Object r5 = defpackage.fgfz.c(r5, r4)
            if (r5 != r0) goto L4c
            goto L70
        L4c:
            ppz r5 = (defpackage.ppz) r5
            goto L6c
        L4f:
            ffcd r5 = new ffcd
            r5.<init>()
            throw r5
        L55:
            ceyf r5 = r4.c
            ceze r1 = r4.b
            ceza r5 = r5.a
            elfl r5 = r5.a(r1)
            r5.getClass()
            r4.a = r2
            java.lang.Object r5 = defpackage.fgfz.c(r5, r4)
            if (r5 == r0) goto L70
        L6a:
            ppz r5 = (defpackage.ppz) r5
        L6c:
            r5.getClass()
            return r5
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceyd.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ceyd(this.b, this.c, ffguVar);
    }
}
