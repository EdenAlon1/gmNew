package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drbq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ drcf b;
    final /* synthetic */ dqzc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drbq(drcf drcfVar, dqzc dqzcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = drcfVar;
        this.c = dqzcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drbq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0050, code lost:
    
        if (defpackage.dqiy.e(r1, r2, r3, null, r7, 12) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0023, code lost:
    
        if (r8 != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L16;
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
            r2 = 1
            defpackage.ffci.b(r8)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L25
            goto L53
        Ld:
            drcf r8 = r7.b
            ffix r8 = r8.bE()
            java.lang.Object r8 = r8.invoke()
            dqls r8 = (defpackage.dqls) r8
            dqlx r8 = r8.b
            dqzc r1 = r7.c
            r7.a = r2
            java.lang.Object r8 = r8.a(r1, r7)
            if (r8 == r0) goto L56
        L25:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L53
            drcf r8 = r7.b
            dqiy r8 = r8.al
            if (r8 != 0) goto L39
            java.lang.String r8 = "usageProcessor"
            defpackage.ffkj.c(r8)
            r8 = 0
        L39:
            r1 = r8
            dqzc r8 = r7.c
            drap r2 = new drap
            java.lang.String r8 = r8.a
            r2.<init>(r8)
            dqgm r3 = defpackage.dslv.aI
            r8 = 2
            r7.a = r8
            r4 = 0
            r6 = 12
            r5 = r7
            java.lang.Object r8 = defpackage.dqiy.e(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L53
            goto L56
        L53:
            ffcu r8 = defpackage.ffcu.a
            return r8
        L56:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drbq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new drbq(this.b, this.c, ffguVar);
    }
}
