package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjxr extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ cjxt d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjxr(cjxt cjxtVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = cjxtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjxr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0031, code lost:
    
        if (r7 != r0) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 == r2) goto L14
            java.lang.Object r0 = r6.b
            java.lang.Object r1 = r6.a
            defpackage.ffci.b(r7)
            goto L6b
        L14:
            java.lang.Object r1 = r6.a
            defpackage.ffci.b(r7)
            goto L50
        L1a:
            defpackage.ffci.b(r7)
            goto L33
        L1e:
            defpackage.ffci.b(r7)
            cjxt r7 = r6.d
            ffbr r7 = r7.h
            java.lang.Object r7 = r7.b()
            cvjo r7 = (defpackage.cvjo) r7
            r6.c = r3
            java.lang.Object r7 = r7.a(r6)
            if (r7 == r0) goto L9b
        L33:
            cjxt r1 = r6.d
            eisx r7 = (defpackage.eisx) r7
            ffbr r1 = r1.i
            java.lang.Object r1 = r1.b()
            cgfd r1 = (defpackage.cgfd) r1
            elfl r1 = r1.a()
            r6.a = r7
            r6.c = r2
            java.lang.Object r1 = defpackage.fgfz.c(r1, r6)
            if (r1 == r0) goto L9b
            r5 = r1
            r1 = r7
            r7 = r5
        L50:
            cjxt r2 = r6.d
            eixo r4 = r2.c
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            eisx r2 = r2.b
            com.google.common.util.concurrent.ListenableFuture r2 = r4.c(r2)
            r6.a = r1
            r6.b = r7
            r4 = 3
            r6.c = r4
            java.lang.Object r2 = defpackage.fgfz.c(r2, r6)
            if (r2 == r0) goto L9b
            r0 = r7
            r7 = r2
        L6b:
            eixn r7 = (defpackage.eixn) r7
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r2 = r0.booleanValue()
            if (r2 == 0) goto L7f
            cjxt r2 = r6.d
            eisx r2 = r2.b
            boolean r1 = defpackage.ffkj.e(r1, r2)
            if (r1 != 0) goto L96
        L7f:
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 != 0) goto L95
            eixz r7 = r7.b()
            java.lang.String r7 = r7.k
            java.lang.String r0 = "pseudonymous"
            boolean r7 = defpackage.ffkj.e(r7, r0)
            if (r7 == 0) goto L95
            goto L96
        L95:
            r3 = r1
        L96:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        L9b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjxr.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cjxr(this.d, ffguVar);
    }
}
