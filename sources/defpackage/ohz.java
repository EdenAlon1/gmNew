package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ohz extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ oia e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohz(oia oiaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.e = oiaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ohz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0059, code lost:
    
        if (((defpackage.oia) r1).a(r7, r2, r6) == r0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L18
            if (r1 == r2) goto Le
            defpackage.ffci.b(r7)
            goto L5c
        Le:
            java.lang.Object r1 = r6.c
            java.lang.Object r2 = r6.b
            java.lang.Object r4 = r6.a
            defpackage.ffci.b(r7)
            goto L30
        L18:
            defpackage.ffci.b(r7)
            oia r1 = r6.e
            oib r4 = r1.i
            r6.a = r4
            fgjb r7 = r4.a
            r6.b = r7
            r6.c = r1
            r6.d = r2
            java.lang.Object r2 = r7.a(r3, r6)
            if (r2 == r0) goto L64
            r2 = r7
        L30:
            oib r4 = (defpackage.oib) r4     // Catch: java.lang.Throwable -> L5f
            oie r7 = r4.b     // Catch: java.lang.Throwable -> L5f
            ffwm r4 = r7.h     // Catch: java.lang.Throwable -> L5f
            ffxr r5 = new ffxr     // Catch: java.lang.Throwable -> L5f
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L5f
            oic r4 = new oic     // Catch: java.lang.Throwable -> L5f
            r4.<init>(r7, r3)     // Catch: java.lang.Throwable -> L5f
            ffzh r7 = new ffzh     // Catch: java.lang.Throwable -> L5f
            r7.<init>(r4, r5)     // Catch: java.lang.Throwable -> L5f
            r2.b(r3)
            ofz r2 = defpackage.ofz.c
            r6.a = r3
            r6.b = r3
            r6.c = r3
            r3 = 2
            r6.d = r3
            oia r1 = (defpackage.oia) r1
            java.lang.Object r7 = r1.a(r7, r2, r6)
            if (r7 != r0) goto L5c
            goto L64
        L5c:
            ffcu r7 = defpackage.ffcu.a
            return r7
        L5f:
            r7 = move-exception
            r2.b(r3)
            throw r7
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ohz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ohz(this.e, ffguVar);
    }
}
