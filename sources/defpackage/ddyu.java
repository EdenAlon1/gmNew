package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddyu extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ffjm c;
    final /* synthetic */ Object d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddyu(ffgu ffguVar, ffjm ffjmVar, Object obj) {
        super(3, ffguVar);
        this.c = ffjmVar;
        this.d = obj;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ddyu ddyuVar = new ddyu((ffgu) obj3, this.c, this.d);
        ddyuVar.e = (ffxy) obj;
        ddyuVar.b = obj2;
        return ddyuVar.b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (defpackage.ffyk.c(r1, r4, r5) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
    
        if (r6 != r0) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [ffxy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
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
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L16
            if (r1 == r3) goto Le
            defpackage.ffci.b(r6)
            goto L53
        Le:
            java.lang.Object r1 = r5.e
            defpackage.ffci.b(r6)     // Catch: java.lang.Exception -> L14
            goto L2b
        L14:
            r6 = move-exception
            goto L3d
        L16:
            defpackage.ffci.b(r6)
            java.lang.Object r1 = r5.e
            java.lang.Object r6 = r5.b
            ffcu r6 = (defpackage.ffcu) r6
            ffjm r6 = r5.c     // Catch: java.lang.Exception -> L14
            java.lang.Object r4 = r5.d     // Catch: java.lang.Exception -> L14
            r5.a = r3     // Catch: java.lang.Exception -> L14
            java.lang.Object r6 = r6.a(r4, r5)     // Catch: java.lang.Exception -> L14
            if (r6 == r0) goto L52
        L2b:
            ffxx r6 = (defpackage.ffxx) r6     // Catch: java.lang.Exception -> L14
            ddyx r3 = new ddyx     // Catch: java.lang.Exception -> L14
            r3.<init>(r6)     // Catch: java.lang.Exception -> L14
            ddyt r6 = new ddyt     // Catch: java.lang.Exception -> L14
            r6.<init>(r2)     // Catch: java.lang.Exception -> L14
            ffzk r4 = new ffzk     // Catch: java.lang.Exception -> L14
            r4.<init>(r3, r6)     // Catch: java.lang.Exception -> L14
            goto L47
        L3d:
            ddyn r3 = new ddyn
            r3.<init>(r6)
            ffyg r4 = new ffyg
            r4.<init>(r3)
        L47:
            r5.e = r2
            r6 = 2
            r5.a = r6
            java.lang.Object r6 = defpackage.ffyk.c(r1, r4, r5)
            if (r6 != r0) goto L53
        L52:
            return r0
        L53:
            ffcu r6 = defpackage.ffcu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddyu.b(java.lang.Object):java.lang.Object");
    }
}
