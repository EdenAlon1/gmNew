package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lbk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ lcc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbk(lcc lccVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = lccVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lbk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        if (r4 != r0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003f, code lost:
    
        if (r4.a(r2, r3) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0045, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0044, code lost:
    
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
            if (r1 == r2) goto L23
            goto L42
        Ld:
            lcc r4 = r3.b
            lav r4 = r4.d
            r3.a = r2
            ffrp r4 = r4.c
            ffuq r4 = (defpackage.ffuq) r4
            java.lang.Object r4 = r4.B(r3)
            ffhh r1 = defpackage.ffhh.a
            if (r4 == r1) goto L21
            ffcu r4 = defpackage.ffcu.a
        L21:
            if (r4 == r0) goto L45
        L23:
            lcc r4 = r3.b
            lcs r4 = r4.c()
            ffxx r4 = r4.c()
            ffxx r4 = defpackage.ffyo.a(r4)
            lcc r1 = r3.b
            lbj r2 = new lbj
            r2.<init>(r1)
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = r4.a(r2, r3)
            if (r4 != r0) goto L42
            goto L45
        L42:
            ffcu r4 = defpackage.ffcu.a
            return r4
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lbk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new lbk(this.b, ffguVar);
    }
}
