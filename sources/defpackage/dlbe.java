package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlbe extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dlbf b;
    final /* synthetic */ dlgb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlbe(dlbf dlbfVar, dlgb dlgbVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dlbfVar;
        this.c = dlgbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlbe) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        if (r5.a.e(r1, r4) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        return defpackage.ffcu.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001b, code lost:
    
        if (r5 != r0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r1 != 1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (r5.a.a(r1, r4) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0047, code lost:
    
        return r0;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r4.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto Le
            defpackage.ffci.b(r5)
            if (r1 == r3) goto L1d
            goto L44
        Le:
            defpackage.ffci.b(r5)
            dlbf r5 = r4.b
            dlgb r1 = r4.c
            r4.a = r3
            java.lang.Object r5 = r5.a(r1, r4)
            if (r5 == r0) goto L47
        L1d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L34
            dlbf r5 = r4.b
            dlgb r1 = r4.c
            r4.a = r2
            dlau r5 = r5.a
            java.lang.Object r5 = r5.a(r1, r4)
            if (r5 != r0) goto L44
            goto L47
        L34:
            dlbf r5 = r4.b
            dlgb r1 = r4.c
            r2 = 3
            r4.a = r2
            dlau r5 = r5.a
            java.lang.Object r5 = r5.e(r1, r4)
            if (r5 != r0) goto L44
            goto L47
        L44:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlbe.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dlbe(this.b, this.c, ffguVar);
    }
}
