package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzzz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ caag b;
    final /* synthetic */ enpj c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzzz(ffgu ffguVar, caag caagVar, enpj enpjVar) {
        super(2, ffguVar);
        this.b = caagVar;
        this.c = enpjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzzz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005f, code lost:
    
        if (r6 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        if (r6 != r0) goto L9;
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
            if (r1 == 0) goto L11
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r6)
            goto L62
        Ld:
            defpackage.ffci.b(r6)
            goto L37
        L11:
            defpackage.ffci.b(r6)
            java.lang.Object r6 = r5.d
            ffsk r6 = (defpackage.ffsk) r6
            caag r6 = r5.b
            ffbr r6 = r6.e
            java.lang.Object r6 = r6.b()
            caga r6 = (defpackage.caga) r6
            caag r1 = r5.b
            awui r1 = r1.l
            java.lang.String r1 = r1.d
            elfl r6 = r6.a(r1)
            r6.getClass()
            r5.a = r2
            java.lang.Object r6 = defpackage.fgfz.c(r6, r5)
            if (r6 == r0) goto L6d
        L37:
            java.lang.String r6 = (java.lang.String) r6
            r6.getClass()
            boolean r6 = defpackage.ffpc.J(r6)
            if (r6 != 0) goto L65
            caag r6 = r5.b
            enpj r1 = r5.c
            r2 = 2
            r5.a = r2
            ffhd r2 = r6.i
            ffhd r2 = defpackage.ekxi.a(r2)
            bzzy r3 = new bzzy
            r4 = 0
            r3.<init>(r4, r6, r1)
            java.lang.Object r6 = defpackage.ffra.a(r2, r3, r5)
            ffhh r1 = defpackage.ffhh.a
            if (r6 == r1) goto L5f
            ffcu r6 = defpackage.ffcu.a
        L5f:
            if (r6 != r0) goto L62
            goto L6d
        L62:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L65:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "This device is not registered with Tachyon."
            r6.<init>(r0)
            throw r6
        L6d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzzz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        bzzz bzzzVar = new bzzz(ffguVar, this.b, this.c);
        bzzzVar.d = obj;
        return bzzzVar;
    }
}
