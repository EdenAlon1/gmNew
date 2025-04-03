package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvvv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cvvx b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvvv(cvvx cvvxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cvvxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvvv) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if (r1.fQ(r6, r5) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r6 != r0) goto L9;
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
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L16
            if (r1 == r3) goto Le
            defpackage.ffci.b(r6)
            goto L43
        Le:
            java.lang.Object r1 = r5.c
            ffxy r1 = (defpackage.ffxy) r1
            defpackage.ffci.b(r6)
            goto L37
        L16:
            defpackage.ffci.b(r6)
            java.lang.Object r6 = r5.c
            r1 = r6
            ffxy r1 = (defpackage.ffxy) r1
            cvvx r6 = r5.b
            r5.c = r1
            r5.a = r3
            cvvs r6 = r6.a
            ffhd r3 = r6.a
            ffhd r3 = defpackage.ekxi.a(r3)
            cvvr r4 = new cvvr
            r4.<init>(r2, r6)
            java.lang.Object r6 = defpackage.ffra.a(r3, r4, r5)
            if (r6 == r0) goto L46
        L37:
            r5.c = r2
            r2 = 2
            r5.a = r2
            java.lang.Object r6 = r1.fQ(r6, r5)
            if (r6 != r0) goto L43
            goto L46
        L43:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvvv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cvvv cvvvVar = new cvvv(this.b, ffguVar);
        cvvvVar.c = obj;
        return cvvvVar;
    }
}
