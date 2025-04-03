package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ter extends ffhv implements ffjm {
    int a;
    final /* synthetic */ tet b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ter(tet tetVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = tetVar;
        this.c = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ter) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        return defpackage.ffcu.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001d, code lost:
    
        if (r4.g(r3) != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0041, code lost:
    
        if (r4.a(r3) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0047, code lost:
    
        return r0;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r4) {
        /*
            r3 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r3.a
            r2 = 1
            defpackage.ffci.b(r4)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L1f
            goto L44
        Ld:
            tet r4 = r3.b
            ffbr r4 = r4.b
            java.lang.Object r4 = r4.b()
            cqiy r4 = (defpackage.cqiy) r4
            r3.a = r2
            java.lang.Object r4 = r4.g(r3)
            if (r4 == r0) goto L47
        L1f:
            int r4 = r3.c
            int r4 = r4 + (-1)
            if (r4 == 0) goto L31
            tet r4 = r3.b
            axmm r4 = r4.a
            axkm r4 = r4.a
            axmi r1 = defpackage.axmi.INITIAL_BACKUP_NEEDS_RETRY
            r4.ad(r1)
            goto L38
        L31:
            tet r4 = r3.b
            axmm r4 = r4.a
            r4.g()
        L38:
            tet r4 = r3.b
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = r4.a(r3)
            if (r4 != r0) goto L44
            goto L47
        L44:
            ffcu r4 = defpackage.ffcu.a
            return r4
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ter.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ter(this.b, this.c, ffguVar);
    }
}
