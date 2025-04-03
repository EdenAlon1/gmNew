package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class olw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffhd b;
    final /* synthetic */ olu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public olw(ffhd ffhdVar, olu oluVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffhdVar;
        this.c = oluVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((olw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (defpackage.ffra.a(r5, r2, r4) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r5.e(r4) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0033, code lost:
    
        return r0;
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
            r2 = 1
            defpackage.ffci.b(r5)
            if (r1 == 0) goto Lb
            goto L34
        Lb:
            ffhd r5 = r4.b
            ffhe r1 = defpackage.ffhe.a
            boolean r5 = defpackage.ffkj.e(r5, r1)
            if (r5 == 0) goto L20
            olu r5 = r4.c
            r4.a = r2
            java.lang.Object r5 = r5.e(r4)
            if (r5 != r0) goto L34
            goto L33
        L20:
            ffhd r5 = r4.b
            olu r1 = r4.c
            olv r2 = new olv
            r3 = 0
            r2.<init>(r1, r3)
            r1 = 2
            r4.a = r1
            java.lang.Object r5 = defpackage.ffra.a(r5, r2, r4)
            if (r5 != r0) goto L34
        L33:
            return r0
        L34:
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.olw.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new olw(this.b, this.c, ffguVar);
    }
}
