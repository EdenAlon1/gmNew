package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oej implements ffxy {
    final /* synthetic */ fflb a;
    final /* synthetic */ ffjn b;
    final /* synthetic */ ffxy c;

    public oej(fflb fflbVar, ffjn ffjnVar, ffxy ffxyVar) {
        this.a = fflbVar;
        this.b = ffjnVar;
        this.c = ffxyVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        if (r7.fQ(r8, r0) != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.ffxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(java.lang.Object r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.oei
            if (r0 == 0) goto L13
            r0 = r8
            oei r0 = (defpackage.oei) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            oei r0 = new oei
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r8)
            goto L69
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            fflb r7 = r0.e
            oej r2 = r0.d
            defpackage.ffci.b(r8)
            goto L53
        L3a:
            defpackage.ffci.b(r8)
            fflb r8 = r6.a
            ffjn r2 = r6.b
            java.lang.Object r5 = r8.a
            r0.d = r6
            r0.e = r8
            r0.c = r4
            java.lang.Object r7 = r2.a(r5, r7, r0)
            if (r7 == r1) goto L6c
            r2 = r8
            r8 = r7
            r7 = r2
            r2 = r6
        L53:
            r7.a = r8
            ffxy r7 = r2.c
            fflb r8 = r2.a
            java.lang.Object r8 = r8.a
            r2 = 0
            r0.d = r2
            r0.e = r2
            r0.c = r3
            java.lang.Object r7 = r7.fQ(r8, r0)
            if (r7 != r1) goto L69
            goto L6c
        L69:
            ffcu r7 = defpackage.ffcu.a
            return r7
        L6c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oej.fQ(java.lang.Object, ffgu):java.lang.Object");
    }
}
