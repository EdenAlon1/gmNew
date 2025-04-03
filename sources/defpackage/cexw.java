package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cexw implements ffxy {
    final /* synthetic */ ffxy a;
    final /* synthetic */ ceyc b;

    public cexw(ffxy ffxyVar, ceyc ceycVar) {
        this.a = ffxyVar;
        this.b = ceycVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.ffxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(java.lang.Object r10, defpackage.ffgu r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.cexv
            if (r0 == 0) goto L13
            r0 = r11
            cexv r0 = (defpackage.cexv) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            cexv r0 = new cexv
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.ffci.b(r11)
            goto Laf
        L28:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L30:
            defpackage.ffci.b(r11)
            ffxy r11 = r9.a
            ceyi r10 = (defpackage.ceyi) r10
            eygr r10 = r10.b
            r10.getClass()
            ceyc r2 = r9.b
            java.util.Set r10 = defpackage.ffdx.ar(r10)
            ffbr r2 = r2.b
            java.lang.Object r2 = r2.b()
            java.util.Map r2 = (java.util.Map) r2
            java.util.Set r2 = r2.keySet()
            enpv r2 = defpackage.enpw.b(r2, r10)
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r6 = defpackage.ffdx.n(r2, r5)
            r4.<init>(r6)
            enpp r2 = (defpackage.enpp) r2
            enqu r2 = r2.iterator()
        L63:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L7a
            java.lang.Object r6 = r2.next()
            java.lang.String r6 = (java.lang.String) r6
            cexh r7 = defpackage.cexh.a
            ffcf r8 = new ffcf
            r8.<init>(r6, r7)
            r4.add(r8)
            goto L63
        L7a:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r5 = defpackage.ffdx.n(r10, r5)
            r2.<init>(r5)
            java.util.Iterator r10 = r10.iterator()
        L87:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L9e
            java.lang.Object r5 = r10.next()
            java.lang.String r5 = (java.lang.String) r5
            cexh r6 = defpackage.cexh.b
            ffcf r7 = new ffcf
            r7.<init>(r5, r6)
            r2.add(r7)
            goto L87
        L9e:
            java.util.List r10 = defpackage.ffdx.ad(r2, r4)
            java.util.Map r10 = defpackage.ffew.k(r10)
            r0.b = r3
            java.lang.Object r10 = r11.fQ(r10, r0)
            if (r10 != r1) goto Laf
            return r1
        Laf:
            ffcu r10 = defpackage.ffcu.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cexw.fQ(java.lang.Object, ffgu):java.lang.Object");
    }
}
