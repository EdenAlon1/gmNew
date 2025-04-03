package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjfp extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ fjfs c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fjfp(fjfs fjfsVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = fjfsVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fjfp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        if (r5 != r0) goto L16;
     */
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 == r3) goto L16
            if (r1 == r2) goto L12
            java.lang.Object r0 = r4.a
            defpackage.ffci.b(r5)
            goto L5f
        L12:
            defpackage.ffci.b(r5)     // Catch: defpackage.babn -> L4c
            goto L40
        L16:
            defpackage.ffci.b(r5)     // Catch: defpackage.babn -> L4c
            goto L2e
        L1a:
            defpackage.ffci.b(r5)
            fjfs r5 = r4.c     // Catch: defpackage.babn -> L4c
            babf r5 = r5.a     // Catch: defpackage.babn -> L4c
            elfl r5 = r5.a()     // Catch: defpackage.babn -> L4c
            r4.b = r3     // Catch: defpackage.babn -> L4c
            java.lang.Object r5 = defpackage.fgfz.c(r5, r4)     // Catch: defpackage.babn -> L4c
            if (r5 != r0) goto L2e
            goto L6d
        L2e:
            eisx r5 = (defpackage.eisx) r5     // Catch: defpackage.babn -> L4c
            fjfs r1 = r4.c     // Catch: defpackage.babn -> L4c
            eixo r1 = r1.b     // Catch: defpackage.babn -> L4c
            com.google.common.util.concurrent.ListenableFuture r5 = r1.c(r5)     // Catch: defpackage.babn -> L4c
            r4.b = r2     // Catch: defpackage.babn -> L4c
            java.lang.Object r5 = defpackage.fgfz.c(r5, r4)     // Catch: defpackage.babn -> L4c
            if (r5 == r0) goto L6d
        L40:
            eixn r5 = (defpackage.eixn) r5     // Catch: defpackage.babn -> L4c
            eixz r5 = r5.b()     // Catch: defpackage.babn -> L4c
            java.lang.String r5 = r5.g     // Catch: defpackage.babn -> L4c
            r5.getClass()     // Catch: defpackage.babn -> L4c
            goto L4e
        L4c:
            java.lang.String r5 = ""
        L4e:
            fjfs r1 = r4.c
            r4.a = r5
            r2 = 3
            r4.b = r2
            eisx r2 = r1.f
            java.lang.Object r1 = r1.a(r2, r4)
            if (r1 == r0) goto L6d
            r0 = r5
            r5 = r1
        L5f:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            fjfu r1 = new fjfu
            java.lang.String r0 = (java.lang.String) r0
            r1.<init>(r0, r5)
            return r1
        L6d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fjfp.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new fjfp(this.c, ffguVar);
    }
}
