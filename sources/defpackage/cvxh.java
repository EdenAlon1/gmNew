package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvxh implements ffxy {
    final /* synthetic */ ffxy a;
    final /* synthetic */ cvxj b;

    public cvxh(ffxy ffxyVar, cvxj cvxjVar) {
        this.a = ffxyVar;
        this.b = cvxjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.ffxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(java.lang.Object r11, defpackage.ffgu r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.cvxg
            if (r0 == 0) goto L13
            r0 = r12
            cvxg r0 = (defpackage.cvxg) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            cvxg r0 = new cvxg
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.ffci.b(r12)
            goto La2
        L28:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L30:
            defpackage.ffci.b(r12)
            ffxy r12 = r10.a
            aoku r11 = (defpackage.aoku) r11
            if (r11 != 0) goto L3b
            r11 = 0
            goto L99
        L3b:
            cvxj r2 = r10.b
            android.content.Context r2 = r2.e
            java.lang.String r4 = "android.permission.ACCESS_FINE_LOCATION"
            int r2 = defpackage.koa.c(r2, r4)
            r4 = 2132085465(0x7f150ad9, float:1.981113E38)
            r5 = 0
            if (r2 != 0) goto L6b
            cvxj r2 = r10.b
            cvxl r6 = new cvxl
            java.lang.String r7 = r11.l()
            java.lang.Object[] r8 = new java.lang.Object[r3]
            r8[r5] = r7
            android.content.Context r2 = r2.e
            java.lang.String r2 = r2.getString(r4, r8)
            r2.getClass()
            cvxj r4 = r10.b
            cvxc r5 = new cvxc
            r5.<init>(r4, r11)
            r6.<init>(r2, r5)
            goto L98
        L6b:
            cvxj r2 = r10.b
            android.content.Context r2 = r2.e
            cvxk r6 = new cvxk
            r7 = 2132083047(0x7f150167, float:1.9806225E38)
            java.lang.String r2 = r2.getString(r7)
            r2.getClass()
            cvxj r7 = r10.b
            java.lang.String r8 = r11.l()
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r9[r5] = r8
            android.content.Context r5 = r7.e
            java.lang.String r4 = r5.getString(r4, r9)
            r4.getClass()
            cvxj r5 = r10.b
            cvxd r7 = new cvxd
            r7.<init>(r5, r11)
            r6.<init>(r2, r4, r7)
        L98:
            r11 = r6
        L99:
            r0.b = r3
            java.lang.Object r11 = r12.fQ(r11, r0)
            if (r11 != r1) goto La2
            return r1
        La2:
            ffcu r11 = defpackage.ffcu.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvxh.fQ(java.lang.Object, ffgu):java.lang.Object");
    }
}
