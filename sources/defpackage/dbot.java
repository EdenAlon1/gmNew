package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbot implements ffxy {
    final /* synthetic */ ffxy a;

    public dbot(ffxy ffxyVar) {
        this.a = ffxyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.ffxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(java.lang.Object r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.dbos
            if (r0 == 0) goto L13
            r0 = r9
            dbos r0 = (defpackage.dbos) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            dbos r0 = new dbos
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r9)
            goto L87
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.ffci.b(r9)
            ffxy r9 = r7.a
            java.util.List r8 = (java.util.List) r8
            r2 = 10
            int r2 = defpackage.ffdx.n(r8, r2)
            int r2 = defpackage.ffew.a(r2)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r5 = 16
            int r2 = defpackage.ffmk.f(r2, r5)
            r4.<init>(r2)
            java.util.Iterator r8 = r8.iterator()
        L4f:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L7e
            java.lang.Object r2 = r8.next()
            ceze r2 = (defpackage.ceze) r2
            java.lang.String r5 = r2.q()
            java.lang.String r6 = "count"
            java.lang.String r2 = r2.ay(r6)
            r2.getClass()
            int r2 = java.lang.Integer.parseInt(r2)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r2)
            ffcf r2 = new ffcf
            r2.<init>(r5, r6)
            java.lang.Object r5 = r2.a
            java.lang.Object r2 = r2.b
            r4.put(r5, r2)
            goto L4f
        L7e:
            r0.b = r3
            java.lang.Object r8 = r9.fQ(r4, r0)
            if (r8 != r1) goto L87
            return r1
        L87:
            ffcu r8 = defpackage.ffcu.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbot.fQ(java.lang.Object, ffgu):java.lang.Object");
    }
}
