package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgdc implements ffxy {
    final /* synthetic */ ffkx a;
    final /* synthetic */ ffxy b;

    public fgdc(ffkx ffkxVar, ffxy ffxyVar) {
        this.a = ffkxVar;
        this.b = ffxyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.fgdb
            if (r0 == 0) goto L13
            r0 = r6
            fgdb r0 = (defpackage.fgdb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fgdb r0 = new fgdb
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L49
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r6)
            if (r5 <= 0) goto L49
            ffkx r5 = r4.a
            boolean r6 = r5.a
            if (r6 != 0) goto L49
            r5.a = r3
            ffxy r5 = r4.b
            fgcw r6 = defpackage.fgcw.a
            r0.c = r3
            java.lang.Object r5 = r5.fQ(r6, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgdc.b(int, ffgu):java.lang.Object");
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        return b(((Number) obj).intValue(), ffguVar);
    }
}
