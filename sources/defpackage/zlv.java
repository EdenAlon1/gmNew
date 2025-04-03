package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zlv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ zmw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zlv(zmw zmwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = zmwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zlv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        if (defpackage.fgbj.b(r5.j.b, r1, r4) != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0033, code lost:
    
        if (defpackage.fgfz.c(r5, r4) == r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0039, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        return defpackage.ffcu.a;
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
            r2 = 1
            defpackage.ffci.b(r5)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L21
            goto L36
        Ld:
            zmw r5 = r4.b
            zlu r1 = new zlu
            r3 = 0
            r1.<init>(r3)
            r4.a = r2
            zqx r5 = r5.j
            fgdj r5 = r5.b
            java.lang.Object r5 = defpackage.fgbj.b(r5, r1, r4)
            if (r5 == r0) goto L39
        L21:
            zmw r5 = r4.b
            alye r5 = r5.I
            elfl r5 = r5.y()
            r5.getClass()
            r1 = 2
            r4.a = r1
            java.lang.Object r5 = defpackage.fgfz.c(r5, r4)
            if (r5 != r0) goto L36
            goto L39
        L36:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zlv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new zlv(this.b, ffguVar);
    }
}
