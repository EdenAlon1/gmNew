package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coow implements ffxy {
    final /* synthetic */ ffxy a;
    final /* synthetic */ copc b;

    public coow(ffxy ffxyVar, copc copcVar) {
        this.a = ffxyVar;
        this.b = copcVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007a, code lost:
    
        if (r8.fQ(r7, r0) == r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.ffxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(java.lang.Object r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.coov
            if (r0 == 0) goto L13
            r0 = r8
            coov r0 = (defpackage.coov) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            coov r0 = new coov
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r8)
            goto L7d
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.c
            defpackage.ffci.b(r8)
            goto L65
        L38:
            defpackage.ffci.b(r8)
            ffxy r8 = r6.a
            eyhs r7 = (defpackage.eyhs) r7
            copc r2 = r6.b
            boolean r2 = r2.x()
            if (r2 == 0) goto L6b
            copc r2 = r6.b
            if (r7 == 0) goto L50
            j$.util.Optional r7 = j$.util.Optional.of(r7)
            goto L54
        L50:
            j$.util.Optional r7 = j$.util.Optional.empty()
        L54:
            elfl r7 = r2.o(r7)
            r0.c = r8
            r0.b = r4
            java.lang.Object r7 = defpackage.fgfz.c(r7, r0)
            if (r7 == r1) goto L7c
            r5 = r8
            r8 = r7
            r7 = r5
        L65:
            eyhs r8 = (defpackage.eyhs) r8
            r5 = r8
            r8 = r7
            r7 = r5
            goto L71
        L6b:
            if (r7 != 0) goto L71
            copc r7 = r6.b
            eyhs r7 = r7.g
        L71:
            r2 = 0
            r0.c = r2
            r0.b = r3
            java.lang.Object r7 = r8.fQ(r7, r0)
            if (r7 != r1) goto L7d
        L7c:
            return r1
        L7d:
            ffcu r7 = defpackage.ffcu.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coow.fQ(java.lang.Object, ffgu):java.lang.Object");
    }
}
