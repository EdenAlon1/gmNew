package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuuj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cuun b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuuj(ffgu ffguVar, cuun cuunVar) {
        super(2, ffguVar);
        this.b = cuunVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cuuj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        if (r4 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        if (r4 != r0) goto L9;
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
            if (r1 == 0) goto L11
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r4)
            goto L41
        Ld:
            defpackage.ffci.b(r4)
            goto L28
        L11:
            defpackage.ffci.b(r4)
            java.lang.Object r4 = r3.c
            ffsk r4 = (defpackage.ffsk) r4
            cuun r4 = r3.b
            lap r4 = r4.a
            ffxx r4 = r4.b()
            r3.a = r2
            java.lang.Object r4 = defpackage.fgbj.a(r4, r3)
            if (r4 == r0) goto L4d
        L28:
            cuue r4 = (defpackage.cuue) r4
            int r4 = r4.b
            r4 = r4 & r2
            if (r4 == 0) goto L4b
            cuun r4 = r3.b
            lap r4 = r4.a
            ffxx r4 = r4.b()
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = defpackage.fgbj.a(r4, r3)
            if (r4 != r0) goto L41
            goto L4d
        L41:
            cuue r4 = (defpackage.cuue) r4
            int r4 = r4.c
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r4)
            return r0
        L4b:
            r4 = 0
            return r4
        L4d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuuj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cuuj cuujVar = new cuuj(ffguVar, this.b);
        cuujVar.c = obj;
        return cuujVar;
    }
}
