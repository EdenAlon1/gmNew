package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dprl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dprt b;
    final /* synthetic */ dpgl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dprl(dprt dprtVar, dpgl dpglVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dprtVar;
        this.c = dpglVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dprl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (defpackage.ernj.a(r4, r3) != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
    
        if (r4.s(r1, r3) == r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        return defpackage.ffcu.a;
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
            if (r1 == r2) goto L1d
            goto L2d
        Ld:
            dprt r4 = r3.b
            enru r1 = defpackage.dprt.a
            dpqo r4 = r4.i
            j$.time.Duration r4 = r4.d
            r3.a = r2
            java.lang.Object r4 = defpackage.ernj.a(r4, r3)
            if (r4 == r0) goto L30
        L1d:
            dprt r4 = r3.b
            dpgl r1 = r3.c
            r2 = 2
            r3.a = r2
            enru r2 = defpackage.dprt.a
            java.lang.Object r4 = r4.s(r1, r3)
            if (r4 != r0) goto L2d
            goto L30
        L2d:
            ffcu r4 = defpackage.ffcu.a
            return r4
        L30:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dprl.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dprl(this.b, this.c, ffguVar);
    }
}
