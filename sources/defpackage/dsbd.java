package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsbd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dsbf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsbd(dsbf dsbfVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dsbfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsbd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        if (defpackage.ffyk.a(r8, r7) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        if (defpackage.ffyk.a(r8, r7) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007a, code lost:
    
        if (r1.a(r2, r7) == r0) goto L22;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.a
            r2 = 2
            r3 = 1
            defpackage.ffci.b(r8)
            if (r1 == 0) goto Ld
            goto L7d
        Ld:
            dsbf r8 = r7.b
            dsaz r8 = r8.e
            r1 = 0
            if (r8 != 0) goto L1a
            java.lang.String r8 = "views"
            defpackage.ffkj.c(r8)
            r8 = r1
        L1a:
            dsbf r4 = r7.b
            android.support.v7.widget.RecyclerView r8 = r8.b
            boolean r5 = r4.bg()
            if (r5 == 0) goto L49
            boolean r5 = r4.gX()
            if (r5 == 0) goto L49
            ffxx r2 = defpackage.dslh.c(r8)
            ffbz r5 = r4.aO
            java.lang.Object r5 = r5.a()
            fgdj r5 = (defpackage.fgdj) r5
            dsba r6 = new dsba
            r6.<init>(r4, r8, r1)
            fgch r8 = new fgch
            r8.<init>(r2, r5, r6)
            r7.a = r3
            java.lang.Object r8 = defpackage.ffyk.a(r8, r7)
            if (r8 != r0) goto L7d
            goto L7c
        L49:
            boolean r3 = r4.gX()
            if (r3 == 0) goto L6a
            ffxx r3 = defpackage.dslh.c(r8)
            fgcm r5 = r4.aU()
            dsbb r6 = new dsbb
            r6.<init>(r4, r8, r1)
            fgch r8 = new fgch
            r8.<init>(r3, r5, r6)
            r7.a = r2
            java.lang.Object r8 = defpackage.ffyk.a(r8, r7)
            if (r8 != r0) goto L7d
            goto L7c
        L6a:
            ffxx r1 = defpackage.dslh.c(r8)
            dsbc r2 = new dsbc
            r2.<init>(r4, r8)
            r8 = 3
            r7.a = r8
            java.lang.Object r8 = r1.a(r2, r7)
            if (r8 != r0) goto L7d
        L7c:
            return r0
        L7d:
            ffcu r8 = defpackage.ffcu.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsbd.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dsbd(this.b, ffguVar);
    }
}
