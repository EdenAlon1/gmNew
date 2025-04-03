package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cemx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cena b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cemx(ffgu ffguVar, cena cenaVar) {
        super(2, ffguVar);
        this.b = cenaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cemx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0051, code lost:
    
        if (r5.b.c(r4) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r5.b.b(r4) != r0) goto L9;
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
            if (r1 == 0) goto L11
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r5)
            goto L54
        Ld:
            defpackage.ffci.b(r5)
            goto L32
        L11:
            defpackage.ffci.b(r5)
            java.lang.Object r5 = r4.c
            ffsk r5 = (defpackage.ffsk) r5
            cena r5 = r4.b
            cemy r1 = new cemy
            r1.<init>(r5)
            dtuu r5 = r5.c
            java.lang.String r3 = "ResetAllLocalStateRecover#recover"
            r5.d(r3, r1)
            cena r5 = r4.b
            r4.a = r2
            crzf r5 = r5.b
            java.lang.Object r5 = r5.b(r4)
            if (r5 == r0) goto L57
        L32:
            emyl r5 = defpackage.csfu.m
            java.lang.Object r5 = r5.get()
            cfup r5 = (defpackage.cfup) r5
            java.lang.Object r5 = r5.e()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L54
            cena r5 = r4.b
            r1 = 2
            r4.a = r1
            crzf r5 = r5.b
            java.lang.Object r5 = r5.c(r4)
            if (r5 != r0) goto L54
            goto L57
        L54:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cemx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cemx cemxVar = new cemx(ffguVar, this.b);
        cemxVar.c = obj;
        return cemxVar;
    }
}
