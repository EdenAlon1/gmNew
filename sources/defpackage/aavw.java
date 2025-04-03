package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aavw implements ffxy {
    final /* synthetic */ ffxy a;

    public aavw(ffxy ffxyVar) {
        this.a = ffxyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.ffxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(java.lang.Object r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.aavv
            if (r0 == 0) goto L13
            r0 = r8
            aavv r0 = (defpackage.aavv) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aavv r0 = new aavv
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r8)
            goto L6b
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            defpackage.ffci.b(r8)
            ffxy r8 = r6.a
            r2 = r7
            ffcf r2 = (defpackage.ffcf) r2
            java.lang.Object r4 = r2.a
            engw r4 = (defpackage.engw) r4
            java.lang.Object r2 = r2.b
            alxr r2 = (defpackage.alxr) r2
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L6b
            if (r2 == 0) goto L6b
            r5 = 0
            java.lang.Object r4 = r4.get(r5)
            aavq r4 = (defpackage.aavq) r4
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r4 = r4.a
            java.lang.String r4 = r4.toString()
            com.google.android.apps.messaging.shared.api.messaging.MessageId r2 = r2.b()
            java.lang.String r2 = r2.a()
            boolean r2 = defpackage.ffkj.e(r4, r2)
            if (r2 == 0) goto L6b
            r0.b = r3
            java.lang.Object r7 = r8.fQ(r7, r0)
            if (r7 != r1) goto L6b
            return r1
        L6b:
            ffcu r7 = defpackage.ffcu.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aavw.fQ(java.lang.Object, ffgu):java.lang.Object");
    }
}
