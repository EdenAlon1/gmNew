package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuqx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ curb b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuqx(ffgu ffguVar, curb curbVar) {
        super(2, ffguVar);
        this.b = curbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cuqx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
    
        if (((defpackage.curd) r5).b != false) goto L14;
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
            r3 = 0
            if (r1 == 0) goto Lc
            defpackage.ffci.b(r5)
            goto L26
        Lc:
            defpackage.ffci.b(r5)
            java.lang.Object r5 = r4.c
            ffsk r5 = (defpackage.ffsk) r5
            boolean r5 = defpackage.cuqt.a()
            if (r5 == 0) goto L2d
            curb r5 = r4.b
            r4.a = r2
            comc r5 = r5.a
            java.lang.Object r5 = r5.c(r4)
            if (r5 != r0) goto L26
            return r0
        L26:
            curd r5 = (defpackage.curd) r5
            boolean r5 = r5.b
            if (r5 == 0) goto L2d
            goto L2e
        L2d:
            r2 = r3
        L2e:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuqx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cuqx cuqxVar = new cuqx(ffguVar, this.b);
        cuqxVar.c = obj;
        return cuqxVar;
    }
}
