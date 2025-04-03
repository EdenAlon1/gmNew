package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class okw extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ ffxy c;
    final /* synthetic */ ffjm d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public okw(ffxy ffxyVar, ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ffxyVar;
        this.d = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((okw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0060, code lost:
    
        if (r4.fQ(r7, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0069, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0045, code lost:
    
        if (r7 != r0) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0060 -> B:5:0x003b). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.b
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 == r2) goto L13
            java.lang.Object r1 = r6.a
            java.lang.Object r3 = r6.e
            ffud r3 = (defpackage.ffud) r3
            defpackage.ffci.b(r7)
            goto L3b
        L13:
            java.lang.Object r1 = r6.a
            java.lang.Object r3 = r6.e
            ffud r3 = (defpackage.ffud) r3
            defpackage.ffci.b(r7)
            goto L47
        L1d:
            defpackage.ffci.b(r7)
            java.lang.Object r7 = r6.e
            ffsk r7 = (defpackage.ffsk) r7
            r1 = 6
            r3 = 0
            ffwm r1 = defpackage.ffwp.a(r3, r3, r1)
            ffjm r3 = r6.d
            okv r4 = new okv
            r5 = 0
            r4.<init>(r1, r3, r5)
            r3 = 3
            ffud r3 = defpackage.ffqy.d(r7, r5, r5, r4, r3)
            ffwo r1 = r1.r()
        L3b:
            r6.e = r3
            r6.a = r1
            r6.b = r2
            java.lang.Object r7 = r1.a(r6)
            if (r7 == r0) goto L69
        L47:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L63
            java.lang.Object r7 = r1.b()
            ffxy r4 = r6.c
            r6.e = r3
            r6.a = r1
            r5 = 2
            r6.b = r5
            java.lang.Object r7 = r4.fQ(r7, r6)
            if (r7 != r0) goto L3b
            goto L69
        L63:
            defpackage.ffub.a(r3)
            ffcu r7 = defpackage.ffcu.a
            return r7
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.okw.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        okw okwVar = new okw(this.c, this.d, ffguVar);
        okwVar.e = obj;
        return okwVar;
    }
}
