package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cusy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cutc b;
    final /* synthetic */ cujo c;
    final /* synthetic */ int d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cusy(ffgu ffguVar, cutc cutcVar, cujo cujoVar, int i) {
        super(2, ffguVar);
        this.b = cutcVar;
        this.c = cujoVar;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cusy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r0 == r6) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002e, code lost:
    
        if (r0 != r6) goto L9;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r16) {
        /*
            r15 = this;
            ffhh r6 = defpackage.ffhh.a
            int r0 = r15.a
            r1 = 1
            r7 = 2
            if (r0 == 0) goto L16
            if (r0 == r1) goto L10
            defpackage.ffci.b(r16)
            r0 = r16
            goto L53
        L10:
            defpackage.ffci.b(r16)
            r0 = r16
            goto L30
        L16:
            defpackage.ffci.b(r16)
            java.lang.Object r0 = r15.e
            ffsk r0 = (defpackage.ffsk) r0
            cutc r0 = r15.b
            cujo r2 = r15.c
            int r3 = r15.d
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r3)
            r15.a = r1
            java.lang.Object r0 = r0.l(r2)
            if (r0 == r6) goto L81
        L30:
            r2 = r0
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L3a
            cukp r0 = defpackage.cuko.a()
            return r0
        L3a:
            cutc r0 = r15.b
            cujo r1 = r15.c
            int r3 = r15.d
            erdy r4 = defpackage.erdy.RECLASSIFICATION
            r8 = r4
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r3)
            r15.a = r7
            r5 = r15
            r3 = r8
            java.lang.Object r0 = r0.j(r1, r2, r3, r4, r5)
            if (r0 != r6) goto L53
            goto L81
        L53:
            cusu r0 = (defpackage.cusu) r0
            if (r0 != 0) goto L74
            int r0 = r15.d
            cukp r8 = new cukp
            erer r9 = defpackage.erer.NO_VERDICT
            cula r10 = defpackage.cula.a
            cfva r1 = defpackage.cutc.a
            erer r1 = defpackage.erer.NO_VERDICT
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r0)
            java.lang.Integer r12 = defpackage.cust.c(r1, r2, r7)
            r13 = 0
            r14 = 20
            r11 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        L74:
            int r1 = r15.d
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r1)
            r1 = 0
            cukp r0 = defpackage.cusu.a(r0, r2, r1, r7)
            return r0
        L81:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cusy.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cusy cusyVar = new cusy(ffguVar, this.b, this.c, this.d);
        cusyVar.e = obj;
        return cusyVar;
    }
}
