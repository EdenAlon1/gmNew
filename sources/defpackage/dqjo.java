package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqjo extends ffhv implements ffji {
    int a;
    final /* synthetic */ dqjz b;
    final /* synthetic */ dqij c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqjo(dqjz dqjzVar, dqij dqijVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = dqjzVar;
        this.c = dqijVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (r6.fQ(r1, r5) != r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x001f, code lost:
    
        if (r6.g.fQ(r1, r5) != r0) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0056 A[RETURN] */
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L10
            defpackage.ffci.b(r6)
            if (r1 == r3) goto L21
            if (r1 == r2) goto L3b
            return r6
        L10:
            defpackage.ffci.b(r6)
            dqjz r6 = r5.b
            dqij r1 = r5.c
            r5.a = r3
            fgcl r6 = r6.g
            java.lang.Object r6 = r6.fQ(r1, r5)
            if (r6 == r0) goto L56
        L21:
            dqjz r6 = r5.b
            ffbz r6 = r6.h
            boolean r6 = r6.b()
            if (r6 == 0) goto L3b
            dqjz r6 = r5.b
            dqij r1 = r5.c
            fgcl r6 = r6.d()
            r5.a = r2
            java.lang.Object r6 = r6.fQ(r1, r5)
            if (r6 == r0) goto L56
        L3b:
            dqjz r6 = r5.b
            dqij r1 = r5.c
            ffsk r2 = r6.c
            ffhd r2 = r2.hT()
            dqjn r3 = new dqjn
            r4 = 0
            r3.<init>(r6, r1, r4)
            r6 = 3
            r5.a = r6
            java.lang.Object r6 = defpackage.ffra.a(r2, r3, r5)
            if (r6 != r0) goto L55
            goto L56
        L55:
            return r6
        L56:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqjo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dqjo(this.b, this.c, (ffgu) obj).b(ffcu.a);
    }
}
