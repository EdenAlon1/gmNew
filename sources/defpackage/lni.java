package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lni extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffhd b;
    final /* synthetic */ ffxx c;
    final /* synthetic */ hij d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lni(ffhd ffhdVar, ffxx ffxxVar, hij hijVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffhdVar;
        this.c = ffxxVar;
        this.d = hijVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lni) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        if (defpackage.ffra.a(r6, r3, r5) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (r6.a(r3, r5) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003c, code lost:
    
        return r0;
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
            if (r1 == 0) goto Lb
            goto L3d
        Lb:
            ffhd r6 = r5.b
            ffhe r1 = defpackage.ffhe.a
            boolean r6 = defpackage.ffkj.e(r6, r1)
            if (r6 == 0) goto L27
            ffxx r6 = r5.c
            hij r1 = r5.d
            lnf r3 = new lnf
            r3.<init>(r1)
            r5.a = r2
            java.lang.Object r6 = r6.a(r3, r5)
            if (r6 != r0) goto L3d
            goto L3c
        L27:
            ffhd r6 = r5.b
            ffxx r1 = r5.c
            hij r2 = r5.d
            lnh r3 = new lnh
            r4 = 0
            r3.<init>(r1, r2, r4)
            r1 = 2
            r5.a = r1
            java.lang.Object r6 = defpackage.ffra.a(r6, r3, r5)
            if (r6 != r0) goto L3d
        L3c:
            return r0
        L3d:
            ffcu r6 = defpackage.ffcu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lni.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new lni(this.b, this.c, this.d, ffguVar);
    }
}
