package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbec extends ffhv implements ffji {
    Object a;
    int b;
    final /* synthetic */ dbed c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbec(dbed dbedVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.c = dbedVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
    
        if (r7 != r0) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005b A[RETURN] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 == r3) goto L16
            if (r1 == r2) goto L10
            defpackage.ffci.b(r7)
            return r7
        L10:
            java.lang.Object r1 = r6.a
            defpackage.ffci.b(r7)
            goto L3c
        L16:
            defpackage.ffci.b(r7)
            goto L29
        L1a:
            defpackage.ffci.b(r7)
            dbed r7 = r6.c
            r6.b = r3
            ffss r7 = r7.e
            java.lang.Object r7 = r7.c(r6)
            if (r7 == r0) goto L5c
        L29:
            dbed r1 = r6.c
            dbdp r7 = (defpackage.dbdp) r7
            r6.a = r7
            r6.b = r2
            ffss r1 = r1.d
            java.lang.Object r1 = r1.c(r6)
            if (r1 == r0) goto L5c
            r5 = r1
            r1 = r7
            r7 = r5
        L3c:
            r7.getClass()
            eisx r7 = (defpackage.eisx) r7
            r2 = 0
            r6.a = r2
            r3 = 3
            r6.b = r3
            dbdp r1 = (defpackage.dbdp) r1
            ffhd r3 = r1.b
            ffhd r3 = defpackage.ekxi.a(r3)
            dbdo r4 = new dbdo
            r4.<init>(r2, r1, r7)
            java.lang.Object r7 = defpackage.ffra.a(r3, r4, r6)
            if (r7 != r0) goto L5b
            goto L5c
        L5b:
            return r7
        L5c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbec.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dbec(this.c, (ffgu) obj).b(ffcu.a);
    }
}
