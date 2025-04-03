package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfdg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffss b;
    final /* synthetic */ cfdp c;
    final /* synthetic */ ceze d;
    Object e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfdg(ffgu ffguVar, ffss ffssVar, cfdp cfdpVar, ceze cezeVar) {
        super(2, ffguVar);
        this.b = ffssVar;
        this.c = cfdpVar;
        this.d = cezeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfdg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0080, code lost:
    
        if (r1.c(r12) != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e0, code lost:
    
        if (defpackage.fgiw.d(r2, r12) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        if (r13 == r0) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
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
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L21
            if (r1 == r3) goto L16
            if (r1 == r2) goto L12
            defpackage.ffci.b(r13)
            goto Le3
        L12:
            defpackage.ffci.b(r13)
            goto L82
        L16:
            java.lang.Object r1 = r12.e
            java.lang.Object r5 = r12.f
            ceve r5 = (defpackage.ceve) r5
            defpackage.ffci.b(r13)
        L1f:
            r9 = r5
            goto L6e
        L21:
            defpackage.ffci.b(r13)
            java.lang.Object r13 = r12.f
            ffsk r13 = (defpackage.ffsk) r13
            ffss r13 = r12.b
            if (r13 != 0) goto L43
            cfdp r13 = r12.c
            ffsk r13 = r13.i()
            ffhe r1 = defpackage.ffhe.a
            ffsm r5 = defpackage.ffsm.a
            ffhd r1 = defpackage.ekxi.a(r1)
            cfdl r6 = new cfdl
            r6.<init>(r4)
            ffss r13 = defpackage.ffra.b(r13, r1, r5, r6)
        L43:
            r1 = r13
            cfdp r13 = r12.c
            ceze r5 = r12.d
            ceww r13 = r13.a
            java.lang.String r5 = r5.r()
            ceve r5 = r13.c(r5)
            cfdp r13 = r12.c
            r5.getClass()
            ceze r6 = r12.d
            cety r7 = r5.a()
            cetj r7 = (defpackage.cetj) r7
            cevc r7 = r7.b
            r12.f = r5
            r12.e = r1
            r12.a = r3
            java.lang.Object r13 = r13.h(r5, r6, r7, r12)
            if (r13 != r0) goto L1f
            goto Le2
        L6e:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L87
            r12.f = r4
            r12.e = r4
            r12.a = r2
            java.lang.Object r13 = r1.c(r12)
            if (r13 == r0) goto Le2
        L82:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r3)
            return r13
        L87:
            ffrq r10 = new ffrq
            r10.<init>()
            cfdp r13 = r12.c
            ffsk r13 = r13.i()
            ffhe r2 = defpackage.ffhe.a
            ffsm r11 = defpackage.ffsm.a
            ffhd r2 = defpackage.ekxi.a(r2)
            cfdp r7 = r12.c
            ceze r8 = r12.d
            cfdm r5 = new cfdm
            r6 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            ffss r13 = defpackage.ffra.b(r13, r2, r11, r5)
            fgiw r2 = new fgiw
            ffhd r5 = r12.u()
            r2.<init>(r5)
            fgis r13 = r13.f()
            cfdh r5 = new cfdh
            r5.<init>(r1, r4)
            r2.a(r13, r5)
            fgis r13 = r10.U()
            cfdi r5 = new cfdi
            r5.<init>(r1, r4)
            r2.a(r13, r5)
            fgis r13 = r1.f()
            cfdj r1 = new cfdj
            r1.<init>(r4)
            r2.a(r13, r1)
            r12.f = r4
            r12.e = r4
            r13 = 3
            r12.a = r13
            java.lang.Object r13 = defpackage.fgiw.d(r2, r12)
            if (r13 != r0) goto Le3
        Le2:
            return r0
        Le3:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r3)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfdg.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cfdg cfdgVar = new cfdg(ffguVar, this.b, this.c, this.d);
        cfdgVar.f = obj;
        return cfdgVar;
    }
}
