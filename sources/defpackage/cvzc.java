package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvzc implements ffxy {
    final /* synthetic */ ffxy a;
    final /* synthetic */ cvzm b;

    public cvzc(ffxy ffxyVar, cvzm cvzmVar) {
        this.a = ffxyVar;
        this.b = cvzmVar;
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
            boolean r0 = r12 instanceof defpackage.cvzb
            if (r0 == 0) goto L13
            r0 = r12
            cvzb r0 = (defpackage.cvzb) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            cvzb r0 = new cvzb
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r12)
            goto L78
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            defpackage.ffci.b(r12)
            ffxy r12 = r10.a
            cwir r11 = (defpackage.cwir) r11
            java.util.List r11 = r11.a
            java.util.ArrayList r5 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.ffdx.n(r11, r2)
            r5.<init>(r2)
            java.util.Iterator r11 = r11.iterator()
        L47:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L65
            java.lang.Object r2 = r11.next()
            com.google.android.apps.messaging.startchat.chip.ChipData r2 = (com.google.android.apps.messaging.startchat.chip.ChipData) r2
            cvzm r4 = r10.b
            ffbr r4 = r4.l
            java.lang.Object r4 = r4.b()
            tud r4 = (defpackage.tud) r4
            dnwq r2 = r4.a(r2)
            r5.add(r2)
            goto L47
        L65:
            dnyn r4 = new dnyn
            r8 = 0
            r9 = 59
            r6 = 0
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r0.b = r3
            java.lang.Object r11 = r12.fQ(r4, r0)
            if (r11 != r1) goto L78
            return r1
        L78:
            ffcu r11 = defpackage.ffcu.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvzc.fQ(java.lang.Object, ffgu):java.lang.Object");
    }
}
