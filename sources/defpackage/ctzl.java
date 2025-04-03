package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctzl {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.effy r4, defpackage.ffji r5, defpackage.ffgu r6) {
        /*
            boolean r0 = r6 instanceof defpackage.ctzk
            if (r0 == 0) goto L13
            r0 = r6
            ctzk r0 = (defpackage.ctzk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ctzk r0 = new ctzk
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r5 = r0.a
            defpackage.ffci.b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.ffci.b(r6)
            com.google.common.util.concurrent.ListenableFuture r4 = r4.a()
            r4.getClass()
            r0.a = r5
            r0.c = r3
            java.lang.Object r6 = defpackage.fgfz.c(r4, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            r6.getClass()
            java.lang.Object r4 = r5.invoke(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctzl.a(effy, ffji, ffgu):java.lang.Object");
    }

    public static final Object b(effy effyVar, final ffji ffjiVar, ffgu ffguVar) {
        final ffji ffjiVar2 = new ffji() { // from class: ctzi
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                eyfq builder;
                eyfy eyfyVar = (eyfy) obj;
                if (eyfyVar == null || (builder = eyfyVar.toBuilder()) == null) {
                    return null;
                }
                ffji.this.invoke(builder);
                return builder.build();
            }
        };
        return fgfz.c(effyVar.b(new emwl() { // from class: ctzj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }
        }, erpp.a), ffguVar);
    }
}
