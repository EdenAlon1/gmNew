package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmww extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cxj b;
    final /* synthetic */ eyld c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmww(cxj cxjVar, eyld eyldVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cxjVar;
        this.c = eyldVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmww) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r10 != r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0055, code lost:
    
        if (defpackage.cxj.j(r1, r2, r3, null, r5, 12) == r0) goto L20;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r9.a
            r2 = 1
            defpackage.ffci.b(r10)
            if (r1 == 0) goto Lf
            if (r1 == r2) goto Ld
            goto L58
        Ld:
            r5 = r9
            goto L34
        Lf:
            cxj r3 = r9.b
            java.lang.Float r4 = new java.lang.Float
            r10 = 1065353216(0x3f800000, float:1.0)
            r4.<init>(r10)
            eyld r10 = r9.c
            eykp r10 = r10.c
            if (r10 != 0) goto L20
            eykp r10 = defpackage.eykp.a
        L20:
            r10.getClass()
            dbu r5 = defpackage.dmws.b(r10)
            r9.a = r2
            r6 = 0
            r8 = 12
            r7 = r9
            java.lang.Object r10 = defpackage.cxj.j(r3, r4, r5, r6, r7, r8)
            r5 = r7
            if (r10 == r0) goto L5b
        L34:
            cxj r1 = r5.b
            java.lang.Float r2 = new java.lang.Float
            r10 = 0
            r2.<init>(r10)
            eyld r10 = r5.c
            eykp r10 = r10.d
            if (r10 != 0) goto L44
            eykp r10 = defpackage.eykp.a
        L44:
            r10.getClass()
            dbu r3 = defpackage.dmws.b(r10)
            r10 = 2
            r5.a = r10
            r4 = 0
            r6 = 12
            java.lang.Object r10 = defpackage.cxj.j(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L58
            goto L5b
        L58:
            ffcu r10 = defpackage.ffcu.a
            return r10
        L5b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmww.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dmww(this.b, this.c, ffguVar);
    }
}
