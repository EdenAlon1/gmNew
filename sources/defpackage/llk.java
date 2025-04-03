package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class llk extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ fgjb d;
    final /* synthetic */ ffjm e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public llk(fgjb fgjbVar, ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = fgjbVar;
        this.e = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((llk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x002c, code lost:
    
        if (r6.a(null, r5) != r0) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [fgjb] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.c
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1b
            if (r1 == r2) goto L12
            java.lang.Object r0 = r5.a
            defpackage.ffci.b(r6)     // Catch: java.lang.Throwable -> L10
            goto L41
        L10:
            r6 = move-exception
            goto L4b
        L12:
            java.lang.Object r1 = r5.b
            java.lang.Object r2 = r5.a
            defpackage.ffci.b(r6)
            r6 = r2
            goto L2e
        L1b:
            defpackage.ffci.b(r6)
            fgjb r6 = r5.d
            ffjm r1 = r5.e
            r5.a = r6
            r5.b = r1
            r5.c = r2
            java.lang.Object r2 = r6.a(r3, r5)
            if (r2 == r0) goto L4f
        L2e:
            llj r2 = new llj     // Catch: java.lang.Throwable -> L47
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L47
            r5.a = r6     // Catch: java.lang.Throwable -> L47
            r5.b = r3     // Catch: java.lang.Throwable -> L47
            r1 = 2
            r5.c = r1     // Catch: java.lang.Throwable -> L47
            java.lang.Object r1 = defpackage.ffsl.a(r2, r5)     // Catch: java.lang.Throwable -> L47
            if (r1 == r0) goto L4f
            r0 = r6
        L41:
            r0.b(r3)
            ffcu r6 = defpackage.ffcu.a
            return r6
        L47:
            r0 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L4b:
            r0.b(r3)
            throw r6
        L4f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.llk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new llk(this.d, this.e, ffguVar);
    }
}
