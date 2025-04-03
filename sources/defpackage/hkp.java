package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hkp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffhd b;
    final /* synthetic */ ffxx c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hkp(ffhd ffhdVar, ffxx ffxxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffhdVar;
        this.c = ffxxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hkp) c((hij) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        if (defpackage.ffra.a(r1, r3, r5) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r1.a(r3, r5) == r0) goto L12;
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
            java.lang.Object r6 = r5.d
            hij r6 = (defpackage.hij) r6
            ffhd r1 = r5.b
            ffhe r3 = defpackage.ffhe.a
            boolean r1 = defpackage.ffkj.e(r1, r3)
            if (r1 == 0) goto L29
            ffxx r1 = r5.c
            hkm r3 = new hkm
            r3.<init>(r6)
            r5.a = r2
            java.lang.Object r6 = r1.a(r3, r5)
            if (r6 != r0) goto L3d
            goto L3c
        L29:
            ffhd r1 = r5.b
            ffxx r2 = r5.c
            hko r3 = new hko
            r4 = 0
            r3.<init>(r2, r6, r4)
            r6 = 2
            r5.a = r6
            java.lang.Object r6 = defpackage.ffra.a(r1, r3, r5)
            if (r6 != r0) goto L3d
        L3c:
            return r0
        L3d:
            ffcu r6 = defpackage.ffcu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hkp.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        hkp hkpVar = new hkp(this.b, this.c, ffguVar);
        hkpVar.d = obj;
        return hkpVar;
    }
}
