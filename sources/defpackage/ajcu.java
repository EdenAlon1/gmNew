package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajcu extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ ajcv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajcu(ajcv ajcvVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ajcvVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajcu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0021, code lost:
    
        if (r6 != r0) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.b
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L14
            if (r1 == r3) goto L10
            java.lang.Object r0 = r5.a
            defpackage.ffci.b(r6)
            goto L60
        L10:
            defpackage.ffci.b(r6)
            goto L23
        L14:
            defpackage.ffci.b(r6)
            ajcv r6 = r5.c
            r5.b = r3
            aixt r6 = r6.c
            java.lang.Object r6 = defpackage.aixp.a(r6, r2, r3, r5, r3)
            if (r6 == r0) goto Lda
        L23:
            aixr r6 = (defpackage.aixr) r6
            java.util.List r6 = r6.b
            emyl r1 = defpackage.ctjd.ak
            java.lang.Object r1 = r1.get()
            cfup r1 = (defpackage.cfup) r1
            java.lang.Object r1 = r1.e()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Ld7
            emyl r1 = defpackage.ctjd.aH
            java.lang.Object r1 = r1.get()
            cfup r1 = (defpackage.cfup) r1
            java.lang.Object r1 = r1.e()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Ld7
            ajcv r1 = r5.c
            r5.a = r6
            r3 = 2
            r5.b = r3
            cjeo r1 = r1.b
            java.lang.Object r1 = r1.e(r5)
            if (r1 == r0) goto Lda
            r0 = r6
            r6 = r1
        L60:
            ajcv r1 = r5.c
            eisx r1 = r1.a
            boolean r6 = defpackage.ffkj.e(r6, r1)
            if (r6 == 0) goto Ld7
            aixs r6 = defpackage.aixs.d
            boolean r6 = r0.contains(r6)
            if (r6 != 0) goto Ld7
            aixs r6 = defpackage.aixs.c
            boolean r6 = r0.contains(r6)
            if (r6 != 0) goto Ld7
            aixs r6 = defpackage.aixs.f
            boolean r6 = r0.contains(r6)
            if (r6 != 0) goto Ld7
            aixs r6 = defpackage.aixs.e
            boolean r6 = r0.contains(r6)
            if (r6 == 0) goto L8b
            goto Ld7
        L8b:
            ajcv r6 = r5.c
            cqoh r6 = r6.d
            j$.time.LocalDateTime r6 = r6.g()
            int r0 = r6.getHour()
            r1 = 8
            r3 = 9
            if (r0 >= r3) goto Lad
            int r3 = r3 - r0
            fflx r0 = defpackage.ffly.a
            int r0 = r0.c(r1)
            int r3 = r3 + r0
            int r3 = r3 * 60
            int r6 = r6.getMinute()
            int r3 = r3 - r6
            goto Lc4
        Lad:
            r3 = 17
            if (r0 < r3) goto Lc3
            int r0 = 33 - r0
            fflx r3 = defpackage.ffly.a
            int r1 = r3.c(r1)
            int r0 = r0 + r1
            int r0 = r0 * 60
            int r6 = r6.getMinute()
            int r3 = r0 - r6
            goto Lc4
        Lc3:
            r3 = 0
        Lc4:
            ajcv r6 = r5.c
            ajcs r0 = new ajcs
            ajct r6 = r6.e
            long r3 = (long) r3
            r0.<init>(r6, r3, r2)
            ffsk r6 = r6.a
            r1 = 3
            defpackage.axol.k(r6, r2, r0, r1)
            ffcu r6 = defpackage.ffcu.a
            return r6
        Ld7:
            ffcu r6 = defpackage.ffcu.a
            return r6
        Lda:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajcu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ajcu(this.c, ffguVar);
    }
}
