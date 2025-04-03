package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aate implements ffxy {
    final /* synthetic */ ffxy a;

    public aate(ffxy ffxyVar) {
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
            boolean r0 = r10 instanceof defpackage.aatd
            if (r0 == 0) goto L13
            r0 = r10
            aatd r0 = (defpackage.aatd) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aatd r0 = new aatd
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r10)
            goto L68
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            defpackage.ffci.b(r10)
            ffxy r10 = r8.a
            com.google.android.apps.messaging.shared.api.messaging.MessageId r9 = (com.google.android.apps.messaging.shared.api.messaging.MessageId) r9
            enru r2 = defpackage.aatu.a
            ensk r2 = r2.h()
            java.lang.String r4 = "emit"
            r5 = 148(0x94, float:2.07E-43)
            java.lang.String r6 = "com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingDataProviderImpl$getInitialMessageId$$inlined$map$1$2"
            java.lang.String r7 = "MessageListPagingDataProviderImpl.kt"
            ensk r2 = r2.h(r6, r4, r5, r7)
            enrr r2 = (defpackage.enrr) r2
            r4 = 0
            if (r9 == 0) goto L52
            java.lang.String r5 = r9.a()
            goto L53
        L52:
            r5 = r4
        L53:
            java.lang.String r6 = "getInitialMessageId - oldestUnreadMessageIdFlow emitted: %s"
            r2.t(r6, r5)
            if (r9 == 0) goto L5f
            aasw r4 = new aasw
            r4.<init>(r9)
        L5f:
            r0.b = r3
            java.lang.Object r9 = r10.fQ(r4, r0)
            if (r9 != r1) goto L68
            return r1
        L68:
            ffcu r9 = defpackage.ffcu.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aate.fQ(java.lang.Object, ffgu):java.lang.Object");
    }
}
