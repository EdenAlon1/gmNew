package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfdb extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ ceze c;
    final /* synthetic */ cfdp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfdb(ceze cezeVar, cfdp cfdpVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = cezeVar;
        this.d = cfdpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfdb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00d5, code lost:
    
        return defpackage.pqb.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
    
        if (r12 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d0, code lost:
    
        if (defpackage.fgiw.d(r3, r11) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        if (r12 != r0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        if (r1 != 2) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x005e, code lost:
    
        r12.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0061, code lost:
    
        return r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            r11 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r11.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 == r3) goto L11
            defpackage.ffci.b(r12)
            if (r1 == r2) goto L5e
            goto Ld3
        L11:
            java.lang.Object r1 = r11.a
            defpackage.ffci.b(r12)
            goto L41
        L17:
            defpackage.ffci.b(r12)
            cfdp r12 = r11.d
            ceze r1 = r11.c
            ceww r12 = r12.a
            java.lang.String r1 = r1.r()
            ceve r1 = r12.c(r1)
            cfdp r12 = r11.d
            r1.getClass()
            ceze r4 = r11.c
            cety r5 = r1.a()
            cetj r5 = (defpackage.cetj) r5
            cevc r5 = r5.b
            r11.a = r1
            r11.b = r3
            java.lang.Object r12 = r12.h(r1, r4, r5, r11)
            if (r12 == r0) goto Ld6
        L41:
            r7 = r1
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            r1 = 0
            if (r12 != 0) goto L62
            cfdp r12 = r11.d
            ceze r3 = r11.c
            elfl r12 = r12.b(r3)
            r11.a = r1
            r11.b = r2
            java.lang.Object r12 = defpackage.fgfz.c(r12, r11)
            if (r12 != r0) goto L5e
            goto Ld6
        L5e:
            r12.getClass()
            return r12
        L62:
            cfdp r12 = r11.d
            ceze r2 = r11.c
            ffsk r3 = r12.i()
            ffhe r4 = defpackage.ffhe.a
            ffsm r5 = defpackage.ffsm.a
            ffhd r4 = defpackage.ekxi.a(r4)
            cfcz r6 = new cfcz
            r6.<init>(r1, r12, r2)
            ffss r12 = defpackage.ffra.b(r3, r4, r5, r6)
            ffrq r8 = new ffrq
            r8.<init>()
            cfdp r5 = r11.d
            ceze r6 = r11.c
            ffsk r2 = r5.i()
            ffhe r3 = defpackage.ffhe.a
            ffsm r9 = defpackage.ffsm.a
            ffhd r10 = defpackage.ekxi.a(r3)
            cfda r3 = new cfda
            r4 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            ffss r2 = defpackage.ffra.b(r2, r10, r9, r3)
            fgiw r3 = new fgiw
            ffhd r4 = r11.u()
            r3.<init>(r4)
            fgis r2 = r2.f()
            cfcv r4 = new cfcv
            r4.<init>(r12, r1)
            r3.a(r2, r4)
            fgis r2 = r8.U()
            cfcw r4 = new cfcw
            r4.<init>(r12, r1)
            r3.a(r2, r4)
            fgis r12 = r12.f()
            cfcx r2 = new cfcx
            r2.<init>(r1)
            r3.a(r12, r2)
            r11.a = r1
            r12 = 3
            r11.b = r12
            java.lang.Object r12 = defpackage.fgiw.d(r3, r11)
            if (r12 != r0) goto Ld3
            goto Ld6
        Ld3:
            ppz r12 = defpackage.pqb.a
            return r12
        Ld6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfdb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cfdb(this.c, this.d, ffguVar);
    }
}
