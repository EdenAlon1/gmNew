package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aelf extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ aelg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aelf(aelg aelgVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = aelgVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aelf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
    
        if (r6.a() != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0045  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x005f -> B:5:0x0061). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.b
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Lf
            java.lang.Object r1 = r5.a
            defpackage.ffci.b(r6)
            goto L61
        Lf:
            defpackage.ffci.b(r6)
            goto L2f
        L13:
            defpackage.ffci.b(r6)
            aelg r6 = r5.c
            emyl r6 = r6.b
            java.lang.Object r6 = r6.get()
            aqge r6 = (defpackage.aqge) r6
            elfl r6 = r6.b()
            r6.getClass()
            r5.b = r2
            java.lang.Object r6 = defpackage.fgfz.c(r6, r5)
            if (r6 == r0) goto L70
        L2f:
            engw r6 = (defpackage.engw) r6
            enqv r6 = r6.iterator()
            r6.getClass()
            r1 = 0
            r4 = r1
            r1 = r6
            r6 = r4
        L3c:
            r2 = r1
            enqu r2 = (defpackage.enqu) r2
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L6b
            java.lang.Object r6 = r2.next()
            aqux r6 = (defpackage.aqux) r6
            aqge r6 = r6.e()
            elfl r6 = r6.b()
            r6.getClass()
            r5.a = r1
            r2 = 2
            r5.b = r2
            java.lang.Object r6 = defpackage.fgfz.c(r6, r5)
            if (r6 == r0) goto L70
        L61:
            aqys r6 = (defpackage.aqys) r6
            if (r6 == 0) goto L3c
            boolean r2 = r6.a()
            if (r2 == 0) goto L3c
        L6b:
            aeld r0 = new aeld
            r0.<init>(r6)
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aelf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aelf(this.c, ffguVar);
    }
}
