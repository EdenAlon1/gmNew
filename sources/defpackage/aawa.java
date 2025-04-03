package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aawa implements ffxy {
    final /* synthetic */ ffxy a;

    public aawa(ffxy ffxyVar) {
        this.a = ffxyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.ffxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(java.lang.Object r9, defpackage.ffgu r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.aavz
            if (r0 == 0) goto L13
            r0 = r10
            aavz r0 = (defpackage.aavz) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aavz r0 = new aavz
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r10)
            goto L7d
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            defpackage.ffci.b(r10)
            ffxy r10 = r8.a
            engw r9 = (defpackage.engw) r9
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r9.iterator()
        L3f:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L70
            java.lang.Object r4 = r9.next()
            aoax r4 = (defpackage.aoax) r4
            r4.getClass()
            boolean r5 = r4 instanceof defpackage.anxl
            if (r5 != 0) goto L54
            r4 = 0
            goto L6a
        L54:
            aavq r5 = new aavq
            anxl r4 = (defpackage.anxl) r4
            com.google.android.apps.messaging.shared.api.messaging.MessageId r6 = r4.b
            java.lang.String r6 = r6.a()
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r6 = defpackage.bdhb.b(r6)
            java.lang.String r7 = r4.a
            java.lang.String r4 = r4.c
            r5.<init>(r6, r7, r4)
            r4 = r5
        L6a:
            if (r4 == 0) goto L3f
            r2.add(r4)
            goto L3f
        L70:
            engw r9 = defpackage.engq.a(r2)
            r0.b = r3
            java.lang.Object r9 = r10.fQ(r9, r0)
            if (r9 != r1) goto L7d
            return r1
        L7d:
            ffcu r9 = defpackage.ffcu.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aawa.fQ(java.lang.Object, ffgu):java.lang.Object");
    }
}
