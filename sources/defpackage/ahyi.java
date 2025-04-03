package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahyi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ahyk b;
    final /* synthetic */ xhu c;
    final /* synthetic */ fjay d;
    final /* synthetic */ ecri e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahyi(ahyk ahykVar, xhu xhuVar, fjay fjayVar, ecri ecriVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ahykVar;
        this.c = xhuVar;
        this.d = fjayVar;
        this.e = ecriVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahyi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (r6.c(r5) != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0031, code lost:
    
        if (r6.c(r1, r2, r3, r5) == r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        return defpackage.ffcu.a;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.a
            r2 = 1
            defpackage.ffci.b(r6)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L1f
            goto L34
        Ld:
            ahyk r6 = r5.b
            ffbr r6 = r6.n
            java.lang.Object r6 = r6.b()
            ycv r6 = (defpackage.ycv) r6
            r5.a = r2
            java.lang.Object r6 = r6.c(r5)
            if (r6 == r0) goto L37
        L1f:
            ahyk r6 = r5.b
            xhu r1 = r5.c
            fjay r2 = r5.d
            r2.getClass()
            ecri r3 = r5.e
            r4 = 2
            r5.a = r4
            java.lang.Object r6 = r6.c(r1, r2, r3, r5)
            if (r6 != r0) goto L34
            goto L37
        L34:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L37:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahyi.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ahyi(this.b, this.c, this.d, this.e, ffguVar);
    }
}
