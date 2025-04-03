package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awsv implements awsp {
    private final alxl a;
    private final aqvh b;
    private final aqvb c;

    public awsv(alxl alxlVar, aqvh aqvhVar, aqvb aqvbVar) {
        alxlVar.getClass();
        aqvhVar.getClass();
        this.a = alxlVar;
        this.b = aqvhVar;
        this.c = aqvbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.awsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.azcr r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.awst
            if (r0 == 0) goto L13
            r0 = r6
            awst r0 = (defpackage.awst) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            awst r0 = new awst
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r6)
            alxl r6 = r4.a
            elfl r5 = r6.h(r5)
            r5.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.fgfz.c(r5, r0)
            if (r6 == r1) goto L53
        L43:
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r6 = (com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId) r6
            if (r6 == 0) goto L50
            java.lang.String r5 = r6.b()
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5 = defpackage.bdgq.b(r5)
            return r5
        L50:
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5 = defpackage.bdgq.a
            return r5
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awsv.a(azcr, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a3, code lost:
    
        if (r11 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.awsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.azcr r8, defpackage.azsu r9, defpackage.amer r10, defpackage.ffgu r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.awsu
            if (r0 == 0) goto L13
            r0 = r11
            awsu r0 = (defpackage.awsu) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            awsu r0 = new awsu
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4d
            if (r2 == r5) goto L42
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            defpackage.ffci.b(r11)
            goto La6
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            java.lang.Object r8 = r0.a
            amer r9 = r0.g
            azcr r10 = r0.f
            awsv r2 = r0.e
            defpackage.ffci.b(r11)
            goto L7e
        L42:
            amer r10 = r0.g
            azcr r8 = r0.f
            awsv r9 = r0.e
            defpackage.ffci.b(r11)
            r2 = r9
            goto L61
        L4d:
            defpackage.ffci.b(r11)
            aqvb r11 = r7.c
            r0.e = r7
            r0.f = r8
            r0.g = r10
            r0.d = r5
            java.lang.Object r11 = r11.a(r9, r0)
            if (r11 == r1) goto Lbf
            r2 = r7
        L61:
            r9 = r11
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r9 = (com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId) r9
            aqvh r11 = r2.b
            elfl r11 = r11.d(r9)
            r0.e = r2
            r0.f = r8
            r0.g = r10
            r0.a = r9
            r0.d = r4
            java.lang.Object r11 = defpackage.fgfz.c(r11, r0)
            if (r11 == r1) goto Lbf
            r6 = r10
            r10 = r8
            r8 = r9
            r9 = r6
        L7e:
            r11.getClass()
            j$.util.Optional r11 = (j$.util.Optional) r11
            java.lang.Object r11 = defpackage.fflm.b(r11)
            aqux r11 = (defpackage.aqux) r11
            if (r11 == 0) goto Lb1
            alxl r8 = r2.a
            elfl r8 = r8.l(r10, r11, r9)
            r8.getClass()
            r9 = 0
            r0.e = r9
            r0.f = r9
            r0.g = r9
            r0.a = r9
            r0.d = r3
            java.lang.Object r11 = defpackage.fgfz.c(r8, r0)
            if (r11 != r1) goto La6
            goto Lbf
        La6:
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r11 = (com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId) r11
            java.lang.String r8 = r11.b()
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r8 = defpackage.bdgq.b(r8)
            return r8
        Lb1:
            java.lang.String r9 = "Received empty SelfIdentity, for the given SelfIdentityId: "
            java.lang.String r10 = "."
            java.lang.String r8 = defpackage.a.i(r8, r9, r10)
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r8)
            throw r9
        Lbf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awsv.b(azcr, azsu, amer, ffgu):java.lang.Object");
    }
}
