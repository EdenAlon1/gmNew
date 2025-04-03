package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaze extends ffhv implements ffji {
    int a;
    final /* synthetic */ aoax b;
    final /* synthetic */ abac c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaze(aoax aoaxVar, abac abacVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = aoaxVar;
        this.c = abacVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        r6 = ((java.lang.Boolean) r6).booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r6 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0075, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r6 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        if (r6 != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        if (r1 != 2) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0053, code lost:
    
        r6 = ((java.lang.Boolean) r6).booleanValue();
     */
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
            if (r1 == r3) goto L6e
            if (r1 == r2) goto L53
            goto L38
        L10:
            defpackage.ffci.b(r6)
            aoax r6 = r5.b
            aoav r6 = r6.a()
            int r6 = r6.ordinal()
            switch(r6) {
                case 19: goto L5a;
                case 20: goto L3f;
                case 21: goto L22;
                default: goto L20;
            }
        L20:
            r6 = 0
            goto L76
        L22:
            abac r6 = r5.c
            aoax r1 = r5.b
            abgh r2 = defpackage.abgh.b
            bdtg r1 = (defpackage.bdtg) r1
            java.lang.String r3 = r1.a
            java.lang.String r1 = r1.b
            r4 = 3
            r5.a = r4
            java.lang.Object r6 = r6.n(r2, r3, r1)
            if (r6 != r0) goto L38
            goto L75
        L38:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            goto L76
        L3f:
            abac r6 = r5.c
            aoax r1 = r5.b
            abgh r3 = defpackage.abgh.c
            bdtg r1 = (defpackage.bdtg) r1
            java.lang.String r4 = r1.a
            java.lang.String r1 = r1.b
            r5.a = r2
            java.lang.Object r6 = r6.n(r3, r4, r1)
            if (r6 == r0) goto L75
        L53:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            goto L76
        L5a:
            abac r6 = r5.c
            aoax r1 = r5.b
            abgh r2 = defpackage.abgh.a
            bdtg r1 = (defpackage.bdtg) r1
            java.lang.String r4 = r1.a
            java.lang.String r1 = r1.b
            r5.a = r3
            java.lang.Object r6 = r6.n(r2, r4, r1)
            if (r6 == r0) goto L75
        L6e:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            goto L76
        L75:
            return r0
        L76:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaze.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new aaze(this.b, this.c, (ffgu) obj).b(ffcu.a);
    }
}
