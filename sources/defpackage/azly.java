package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azly extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ azml c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azly(azml azmlVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = azmlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azly) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0026, code lost:
    
        if (r5 != r0) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0052 A[LOOP:0: B:6:0x004c->B:8:0x0052, LOOP_END] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v5 */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r4.b
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Lf
            java.lang.Object r0 = r4.a
            defpackage.ffci.b(r5)
            goto L39
        Lf:
            defpackage.ffci.b(r5)
            goto L28
        L13:
            defpackage.ffci.b(r5)
            azml r5 = r4.c
            ffbr r5 = r5.c
            java.lang.Object r5 = r5.b()
            azpx r5 = (defpackage.azpx) r5
            r4.b = r2
            java.lang.Object r5 = r5.d(r4)
            if (r5 == r0) goto L65
        L28:
            azml r1 = r4.c
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r4.a = r5
            r2 = 2
            r4.b = r2
            java.lang.Object r1 = r1.i(r4)
            if (r1 == r0) goto L65
            r0 = r5
            r5 = r1
        L39:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            azml r5 = r4.c
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.ffdx.n(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r2 = r0.iterator()
        L4c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L60
            java.lang.Object r3 = r2.next()
            azop r3 = (defpackage.azop) r3
            azsu r3 = r3.b()
            r1.add(r3)
            goto L4c
        L60:
            azoz r5 = r5.b
            r5.c(r1)
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azly.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new azly(this.c, ffguVar);
    }
}
