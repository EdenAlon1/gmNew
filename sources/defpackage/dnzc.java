package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnzc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cxj b;
    final /* synthetic */ hho c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnzc(cxj cxjVar, hho hhoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cxjVar;
        this.c = hhoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnzc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005e, code lost:
    
        if (defpackage.cxj.j(r6, r7, r8, null, r12, 12) != r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0064, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        return defpackage.ffcu.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        if (r13.e(r6, r12) != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x001e, code lost:
    
        if (r13.f(r12) != r0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        if (r1 != 2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003a, code lost:
    
        r6 = r12.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0042, code lost:
    
        if (true == defpackage.dnzj.e(r12.c)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0044, code lost:
    
        r2 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0045, code lost:
    
        r7 = new java.lang.Float(r2);
        r8 = defpackage.cxu.c(300, 0, defpackage.cyp.a, 2);
        r12.a = 3;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r13) {
        /*
            r12 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r12.a
            r2 = -1020002304(0xffffffffc3340000, float:-180.0)
            r3 = 0
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L13
            defpackage.ffci.b(r13)
            if (r1 == r5) goto L20
            if (r1 == r4) goto L3a
            goto L61
        L13:
            defpackage.ffci.b(r13)
            cxj r13 = r12.b
            r12.a = r5
            java.lang.Object r13 = r13.f(r12)
            if (r13 == r0) goto L64
        L20:
            cxj r13 = r12.b
            hho r1 = r12.c
            boolean r1 = defpackage.dnzj.e(r1)
            if (r5 == r1) goto L2c
            r1 = r2
            goto L2d
        L2c:
            r1 = r3
        L2d:
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r1)
            r12.a = r4
            java.lang.Object r13 = r13.e(r6, r12)
            if (r13 == r0) goto L64
        L3a:
            cxj r6 = r12.b
            hho r13 = r12.c
            boolean r13 = defpackage.dnzj.e(r13)
            if (r5 == r13) goto L45
            r2 = r3
        L45:
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r2)
            r13 = 0
            cym r1 = defpackage.cyp.a
            r2 = 300(0x12c, float:4.2E-43)
            dbu r8 = defpackage.cxu.c(r2, r13, r1, r4)
            r13 = 3
            r12.a = r13
            r9 = 0
            r11 = 12
            r10 = r12
            java.lang.Object r13 = defpackage.cxj.j(r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto L61
            goto L64
        L61:
            ffcu r13 = defpackage.ffcu.a
            return r13
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnzc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dnzc(this.b, this.c, ffguVar);
    }
}
