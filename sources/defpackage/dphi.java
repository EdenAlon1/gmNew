package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dphi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dpif b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dphi(dpif dpifVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dpifVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dphi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (r3.a(r1, r4) != r0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0043, code lost:
    
        r5 = r4.b;
        r4.a = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x004c, code lost:
    
        if (r5.e(r4) != r0) goto L13;
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
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L43
            goto L4f
        Ld:
            dpif r5 = r4.b
            fgcm r5 = r5.g
            dpgy r1 = defpackage.dpgy.a
            r5.f(r1)
            dpif r5 = r4.b
            dpgu r1 = r5.e
            j$.time.Duration r1 = r1.a
            if (r1 == 0) goto L4f
            dtcg r5 = r5.h
            r5.b()
            dpif r5 = r4.b
            dphg r1 = new dphg
            r3 = 0
            r1.<init>(r5, r3)
            fgad r3 = new fgad
            dtcg r5 = r5.h
            fgdj r5 = r5.d
            r3.<init>(r5, r1)
            dpif r5 = r4.b
            dphh r1 = new dphh
            r1.<init>(r5)
            r4.a = r2
            java.lang.Object r5 = r3.a(r1, r4)
            if (r5 == r0) goto L4e
        L43:
            dpif r5 = r4.b
            r1 = 2
            r4.a = r1
            java.lang.Object r5 = r5.e(r4)
            if (r5 != r0) goto L4f
        L4e:
            return r0
        L4f:
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dphi.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dphi(this.b, ffguVar);
    }
}
