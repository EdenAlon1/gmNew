package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cicy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cida b;
    final /* synthetic */ erxs c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cicy(cida cidaVar, erxs erxsVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cidaVar;
        this.c = erxsVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cicy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0023, code lost:
    
        if (r6 != r0) goto L8;
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
            r2 = 1
            defpackage.ffci.b(r6)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L25
            return r6
        Ld:
            cida r6 = r5.b
            erxs r1 = r5.c
            r5.a = r2
            ffhd r2 = r6.b
            ffhd r2 = defpackage.ekxi.a(r2)
            cicw r3 = new cicw
            r4 = 0
            r3.<init>(r4, r1, r6)
            java.lang.Object r6 = defpackage.ffra.a(r2, r3, r5)
            if (r6 == r0) goto L63
        L25:
            awui r6 = (defpackage.awui) r6
            if (r6 != 0) goto L3d
            erxu r6 = defpackage.erxu.a
            eyfq r6 = r6.createBuilder()
            erxt r6 = (defpackage.erxt) r6
            r6.getClass()
            r0 = 0
            defpackage.erxv.b(r0, r6)
            erxu r6 = defpackage.erxv.a(r6)
            return r6
        L3d:
            erxs r1 = r5.c
            ckqh r2 = defpackage.ckqh.a
            eyfq r2 = r2.createBuilder()
            ckqf r2 = (defpackage.ckqf) r2
            r2.getClass()
            java.lang.String r1 = r1.b
            defpackage.ckqi.b(r1, r2)
            defpackage.ckqi.c(r6, r2)
            cida r6 = r5.b
            ckqh r1 = defpackage.ckqi.a(r2)
            r2 = 2
            r5.a = r2
            java.lang.Object r6 = r6.d(r1, r5)
            if (r6 != r0) goto L62
            goto L63
        L62:
            return r6
        L63:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cicy.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cicy(this.b, this.c, ffguVar);
    }
}
