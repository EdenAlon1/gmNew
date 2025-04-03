package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmwx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cxj b;
    final /* synthetic */ eyld c;
    final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmwx(cxj cxjVar, eyld eyldVar, long j, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cxjVar;
        this.c = eyldVar;
        this.d = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmwx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0074, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if (r10 != r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006e, code lost:
    
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
            goto L71
        Ld:
            r5 = r9
            goto L4b
        Lf:
            cxj r3 = r9.b
            eyld r10 = r9.c
            eygl r10 = r10.b
            r10.getClass()
            java.lang.Object r10 = defpackage.ffdx.K(r10)
            r10.getClass()
            java.lang.Number r10 = (java.lang.Number) r10
            long r4 = r10.longValue()
            long r4 = defpackage.iby.d(r4)
            r5 = r4
            ibw r4 = new ibw
            r4.<init>(r5)
            eyld r10 = r9.c
            eykp r10 = r10.c
            if (r10 != 0) goto L37
            eykp r10 = defpackage.eykp.a
        L37:
            r10.getClass()
            dbu r5 = defpackage.dmws.a(r10)
            r9.a = r2
            r6 = 0
            r8 = 12
            r7 = r9
            java.lang.Object r10 = defpackage.cxj.j(r3, r4, r5, r6, r7, r8)
            r5 = r7
            if (r10 == r0) goto L74
        L4b:
            cxj r1 = r5.b
            long r2 = r5.d
            r3 = r2
            ibw r2 = new ibw
            r2.<init>(r3)
            eyld r10 = r5.c
            eykp r10 = r10.d
            if (r10 != 0) goto L5d
            eykp r10 = defpackage.eykp.a
        L5d:
            r10.getClass()
            dbu r3 = defpackage.dmws.a(r10)
            r10 = 2
            r5.a = r10
            r4 = 0
            r6 = 12
            java.lang.Object r10 = defpackage.cxj.j(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L71
            goto L74
        L71:
            ffcu r10 = defpackage.ffcu.a
            return r10
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmwx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dmwx(this.b, this.c, this.d, ffguVar);
    }
}
