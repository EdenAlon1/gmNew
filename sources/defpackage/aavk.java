package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aavk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aavn b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aavk(aavn aavnVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aavnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aavk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
    
        if (r9 != r0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c3  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r8.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L25
            if (r1 == r3) goto L1d
            if (r1 == r2) goto L15
            java.lang.Object r0 = r8.c
            ffsk r0 = (defpackage.ffsk) r0
            defpackage.ffci.b(r9)
            goto Lc4
        L15:
            java.lang.Object r1 = r8.c
            ffsk r1 = (defpackage.ffsk) r1
            defpackage.ffci.b(r9)
            goto L64
        L1d:
            java.lang.Object r1 = r8.c
            ffsk r1 = (defpackage.ffsk) r1
            defpackage.ffci.b(r9)
            goto L47
        L25:
            defpackage.ffci.b(r9)
            java.lang.Object r9 = r8.c
            ffsk r9 = (defpackage.ffsk) r9
            aavn r1 = r8.b
            auuw r1 = r1.b
            boolean r1 = r1.a()
            if (r1 == 0) goto Lb6
            aavn r1 = r8.b
            r8.c = r9
            r8.a = r3
            java.lang.String r3 = "file_id_map"
            java.lang.Object r1 = r1.d(r3, r8)
            if (r1 == r0) goto Lca
            r7 = r1
            r1 = r9
            r9 = r7
        L47:
            java.util.Map r9 = (java.util.Map) r9
            boolean r3 = r9.isEmpty()
            if (r3 != 0) goto L56
            aavn r3 = r8.b
            fgcm r3 = r3.c
            r3.f(r9)
        L56:
            aavn r9 = r8.b
            r8.c = r1
            r8.a = r2
            java.lang.String r2 = "priority_map"
            java.lang.Object r9 = r9.d(r2, r8)
            if (r9 == r0) goto Lca
        L64:
            java.util.Map r9 = (java.util.Map) r9
            boolean r2 = r9.isEmpty()
            if (r2 != 0) goto Lb5
            aavn r2 = r8.b
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            int r4 = r9.size()
            int r4 = defpackage.ffew.a(r4)
            r3.<init>(r4)
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L83:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto Lb0
            java.lang.Object r4 = r9.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Integer r4 = defpackage.ffpc.g(r4)
            if (r4 == 0) goto La4
            int r4 = r4.intValue()
            goto La7
        La4:
            r4 = 2147483647(0x7fffffff, float:NaN)
        La7:
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r4)
            r3.put(r5, r6)
            goto L83
        Lb0:
            fgcm r9 = r2.d
            r9.f(r3)
        Lb5:
            r9 = r1
        Lb6:
            aavn r1 = r8.b
            r8.c = r9
            r2 = 3
            r8.a = r2
            java.lang.Object r1 = r1.e(r8)
            if (r1 == r0) goto Lca
            r0 = r9
        Lc4:
            defpackage.ffsl.h(r0)
            ffcu r9 = defpackage.ffcu.a
            return r9
        Lca:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aavk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aavk aavkVar = new aavk(this.b, ffguVar);
        aavkVar.c = obj;
        return aavkVar;
    }
}
