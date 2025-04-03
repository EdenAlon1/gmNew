package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbcq extends ffhv implements ffji {
    int a;
    final /* synthetic */ dbcd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbcq(dbcd dbcdVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = dbcdVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L11;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r4) {
        /*
            r3 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r3.a
            r2 = 1
            defpackage.ffci.b(r4)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L19
            goto L29
        Ld:
            dbcd r4 = r3.b
            r3.a = r2
            ffss r4 = r4.e
            java.lang.Object r4 = r4.c(r3)
            if (r4 == r0) goto L32
        L19:
            crty r4 = (defpackage.crty) r4
            elfl r4 = r4.M()
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = defpackage.fgfz.c(r4, r3)
            if (r4 != r0) goto L29
            goto L32
        L29:
            csdq r4 = (defpackage.csdq) r4
            int r4 = r4.c
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r4)
        L32:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbcq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dbcq(this.b, (ffgu) obj).b(ffcu.a);
    }
}
