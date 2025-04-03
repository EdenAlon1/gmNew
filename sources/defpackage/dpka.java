package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpka extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cxj b;
    final /* synthetic */ dplw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpka(cxj cxjVar, dplw dplwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cxjVar;
        this.c = dplwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpka) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        return defpackage.ffcu.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (defpackage.cxj.j(r4, r5, r6, null, r8, 12) != r0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r1 != 1) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0038, code lost:
    
        if (r11.f(r10) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003e, code lost:
    
        return r0;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            r10 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r10.a
            r2 = 2
            r3 = 1
            defpackage.ffci.b(r11)
            if (r1 == 0) goto Lf
            r8 = r10
            if (r1 == r3) goto L2c
            goto L3b
        Lf:
            cxj r4 = r10.b
            java.lang.Float r5 = new java.lang.Float
            r11 = 0
            r5.<init>(r11)
            r11 = 0
            cym r1 = defpackage.cyp.d
            r6 = 200(0xc8, float:2.8E-43)
            dbu r6 = defpackage.cxu.c(r6, r11, r1, r2)
            r10.a = r3
            r7 = 0
            r9 = 12
            r8 = r10
            java.lang.Object r11 = defpackage.cxj.j(r4, r5, r6, r7, r8, r9)
            if (r11 == r0) goto L3e
        L2c:
            dplw r11 = r8.c
            dplk r11 = (defpackage.dplk) r11
            dplc r11 = r11.a
            r8.a = r2
            java.lang.Object r11 = r11.f(r10)
            if (r11 != r0) goto L3b
            goto L3e
        L3b:
            ffcu r11 = defpackage.ffcu.a
            return r11
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpka.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpka(this.b, this.c, ffguVar);
    }
}
