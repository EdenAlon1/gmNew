package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dtf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffud b;
    final /* synthetic */ dqx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtf(ffud ffudVar, dqx dqxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffudVar;
        this.c = dqxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0015, code lost:
    
        if (r4.o(r3) != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if (r4.p(r3) == r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        return defpackage.ffcu.a;
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
            if (r1 == r2) goto L17
            goto L23
        Ld:
            ffud r4 = r3.b
            r3.a = r2
            java.lang.Object r4 = r4.o(r3)
            if (r4 == r0) goto L26
        L17:
            dqx r4 = r3.c
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = r4.p(r3)
            if (r4 != r0) goto L23
            goto L26
        L23:
            ffcu r4 = defpackage.ffcu.a
            return r4
        L26:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dtf(this.b, this.c, ffguVar);
    }
}
