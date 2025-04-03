package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaie implements ffxy {
    final /* synthetic */ ffxy a;
    final /* synthetic */ aaij b;
    final /* synthetic */ alxr c;

    public aaie(ffxy ffxyVar, aaij aaijVar, alxr alxrVar) {
        this.a = ffxyVar;
        this.b = aaijVar;
        this.c = alxrVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        if (r8.fQ(r9, r0) != r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.ffxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(java.lang.Object r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.aaid
            if (r0 == 0) goto L13
            r0 = r9
            aaid r0 = (defpackage.aaid) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aaid r0 = new aaid
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            defpackage.ffci.b(r9)
            goto L65
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            java.lang.Object r8 = r0.c
            defpackage.ffci.b(r9)
            goto L5a
        L39:
            defpackage.ffci.b(r9)
            ffxy r9 = r7.a
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L58
            aaij r8 = r7.b
            alxr r2 = r7.c
            r0.c = r9
            r0.b = r5
            java.lang.Object r8 = r8.c(r2, r0)
            if (r8 == r1) goto L64
            r6 = r9
            r9 = r8
            r8 = r6
            goto L5a
        L58:
            r8 = r9
            r9 = r3
        L5a:
            r0.c = r3
            r0.b = r4
            java.lang.Object r8 = r8.fQ(r9, r0)
            if (r8 != r1) goto L65
        L64:
            return r1
        L65:
            ffcu r8 = defpackage.ffcu.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaie.fQ(java.lang.Object, ffgu):java.lang.Object");
    }
}
