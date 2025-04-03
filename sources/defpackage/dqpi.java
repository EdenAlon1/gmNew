package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqpi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dqpv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqpi(dqpv dqpvVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dqpvVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqpi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c A[SYNTHETIC] */
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
            r2 = 1
            defpackage.ffci.b(r9)
            if (r1 == 0) goto Lb
            goto L1f
        Lb:
            dqpv r9 = r8.b
            effy r9 = r9.a
            com.google.common.util.concurrent.ListenableFuture r9 = r9.a()
            r9.getClass()
            r8.a = r2
            java.lang.Object r9 = defpackage.fgfz.c(r9, r8)
            if (r9 != r0) goto L1f
            return r0
        L1f:
            dqpv r0 = r8.b
            dqrj r9 = (defpackage.dqrj) r9
            eyhm r1 = r9.b
            java.util.Map r1 = j$.util.DesugarCollections.unmodifiableMap(r1)
            r1.getClass()
            java.util.Map r0 = r0.c
            r0.putAll(r1)
            dqpv r0 = r8.b
            eyhm r9 = r9.c
            java.util.Map r9 = j$.util.DesugarCollections.unmodifiableMap(r9)
            r9.getClass()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            int r3 = r9.size()
            int r3 = defpackage.ffew.a(r3)
            r1.<init>(r3)
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L51:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto La5
            java.lang.Object r3 = r9.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            dqrg r3 = (defpackage.dqrg) r3
            r3.getClass()
            java.lang.String r5 = r3.c
            r6 = 0
            if (r5 == 0) goto L83
            int r7 = r5.length()
            if (r7 != 0) goto L76
            r5 = r6
        L76:
            if (r5 == 0) goto L83
            ffbz r7 = defpackage.dqnw.a
            java.lang.Class<dqnw> r7 = defpackage.dqnw.class
            java.lang.Enum r5 = java.lang.Enum.valueOf(r7, r5)
            dqnw r5 = (defpackage.dqnw) r5
            goto L84
        L83:
            r5 = r6
        L84:
            java.lang.String r3 = r3.d
            if (r3 == 0) goto L9c
            int r7 = r3.length()
            if (r7 != 0) goto L8f
            r3 = r6
        L8f:
            if (r3 == 0) goto L9c
            ffbz r6 = defpackage.dqnz.a
            java.lang.Class<dqnz> r6 = defpackage.dqnz.class
            java.lang.Enum r3 = java.lang.Enum.valueOf(r6, r3)
            r6 = r3
            dqnz r6 = (defpackage.dqnz) r6
        L9c:
            dqph r3 = new dqph
            r3.<init>(r5, r6)
            r1.put(r4, r3)
            goto L51
        La5:
            java.util.Map r9 = r0.d
            r9.putAll(r1)
            dqpv r9 = r8.b
            r9.b = r2
            ffcu r9 = defpackage.ffcu.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqpi.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqpi(this.b, ffguVar);
    }
}
