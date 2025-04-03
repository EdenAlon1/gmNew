package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axyu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ axyy b;
    final /* synthetic */ ffji c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axyu(ffgu ffguVar, axyy axyyVar, ffji ffjiVar) {
        super(2, ffguVar);
        this.b = axyyVar;
        this.c = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axyu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
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
            if (r1 == 0) goto L15
            if (r1 == r2) goto L11
            java.lang.Object r0 = r5.d
            java.util.List r0 = (java.util.List) r0
            defpackage.ffci.b(r6)
            goto L5f
        L11:
            defpackage.ffci.b(r6)
            goto L32
        L15:
            defpackage.ffci.b(r6)
            java.lang.Object r6 = r5.d
            ffsk r6 = (defpackage.ffsk) r6
            axyy r6 = r5.b
            ffji r1 = r5.c
            axwz r3 = defpackage.axwz.a
            java.lang.Object r1 = r1.invoke(r3)
            axwz r3 = defpackage.axwz.a
            r5.a = r2
            ekrb r1 = (defpackage.ekrb) r1
            java.lang.Object r6 = r6.A(r1, r3, r5)
            if (r6 == r0) goto L66
        L32:
            axyy r1 = r5.b
            java.util.List r6 = (java.util.List) r6
            ffbr r1 = r1.h
            java.lang.Object r1 = r1.b()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L65
            axyy r1 = r5.b
            ffji r2 = r5.c
            axwz r3 = defpackage.axwz.b
            java.lang.Object r2 = r2.invoke(r3)
            axwz r3 = defpackage.axwz.b
            r5.d = r6
            r4 = 2
            r5.a = r4
            ekrb r2 = (defpackage.ekrb) r2
            java.lang.Object r1 = r1.A(r2, r3, r5)
            if (r1 == r0) goto L66
            r0 = r6
            r6 = r1
        L5f:
            java.util.List r6 = (java.util.List) r6
            java.util.List r6 = defpackage.ffdx.ad(r0, r6)
        L65:
            return r6
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axyu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        axyu axyuVar = new axyu(ffguVar, this.b, this.c);
        axyuVar.d = obj;
        return axyuVar;
    }
}
