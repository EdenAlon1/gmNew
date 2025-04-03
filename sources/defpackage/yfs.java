package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yfs implements ffxy {
    final /* synthetic */ ffxy a;
    final /* synthetic */ yfu b;

    public yfs(ffxy ffxyVar, yfu yfuVar) {
        this.a = ffxyVar;
        this.b = yfuVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.ffxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(java.lang.Object r11, defpackage.ffgu r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.yfr
            if (r0 == 0) goto L13
            r0 = r12
            yfr r0 = (defpackage.yfr) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            yfr r0 = new yfr
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r12)
            goto L6e
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            defpackage.ffci.b(r12)
            ffxy r12 = r10.a
            alxr r11 = (defpackage.alxr) r11
            if (r11 != 0) goto L3f
            yfu r11 = r10.b
            r11.b()
            r11 = 0
            goto L65
        L3f:
            yfu r11 = r10.b
            android.content.Context r11 = r11.a
            r2 = 2132083978(0x7f15050a, float:1.9808114E38)
            java.lang.String r5 = r11.getString(r2)
            r5.getClass()
            yfu r11 = r10.b
            yfq r8 = new yfq
            r8.<init>(r11)
            android.content.Context r11 = r11.a
            r2 = 2132083906(0x7f1504c2, float:1.9807968E38)
            java.lang.String r6 = r11.getString(r2)
            dmnb r4 = new dmnb
            r7 = 0
            r9 = 4
            r4.<init>(r5, r6, r7, r8, r9)
            r11 = r4
        L65:
            r0.b = r3
            java.lang.Object r11 = r12.fQ(r11, r0)
            if (r11 != r1) goto L6e
            return r1
        L6e:
            ffcu r11 = defpackage.ffcu.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yfs.fQ(java.lang.Object, ffgu):java.lang.Object");
    }
}
