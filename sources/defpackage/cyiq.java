package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyiq implements ffxy {
    final /* synthetic */ ffxy a;
    final /* synthetic */ cyis b;

    public cyiq(ffxy ffxyVar, cyis cyisVar) {
        this.a = ffxyVar;
        this.b = cyisVar;
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
            boolean r0 = r11 instanceof defpackage.cyip
            if (r0 == 0) goto L13
            r0 = r11
            cyip r0 = (defpackage.cyip) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            cyip r0 = new cyip
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.ffci.b(r11)
            goto Lbd
        L28:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L30:
            defpackage.ffci.b(r11)
            ffxy r11 = r9.a
            alxj r10 = (defpackage.alxj) r10
            cyis r2 = r9.b
            alxi r4 = r10.b()
            r4.getClass()
            alxi r5 = defpackage.alxi.GROUP
            r6 = 0
            r7 = 0
            if (r4 == r5) goto L4a
            alxi r5 = defpackage.alxi.ONE_ON_ONE
            if (r4 != r5) goto La1
        L4a:
            ffbr r4 = r2.d
            java.lang.Object r4 = r4.b()
            culp r4 = (defpackage.culp) r4
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5 = r2.f
            cuva r8 = defpackage.cuuz.a(r5)
            boolean r4 = r4.j(r5, r8)
            if (r4 != 0) goto La1
            aqkp r4 = r2.c
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r2 = r2.a
            aqge r2 = r4.a(r2)
            java.lang.Object r2 = r2.c()
            engw r2 = (defpackage.engw) r2
            r2.getClass()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        L78:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L93
            java.lang.Object r5 = r2.next()
            r8 = r5
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r8 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r8
            aqpn r8 = r8.H()
            boolean r8 = r8.a()
            if (r8 == 0) goto L78
            r4.add(r5)
            goto L78
        L93:
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto L9a
            goto La1
        L9a:
            java.lang.Object r2 = r4.get(r6)
            r7 = r2
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r7 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r7
        La1:
            cyiu r2 = new cyiu
            alxi r10 = r10.b()
            alxi r4 = defpackage.alxi.GROUP
            if (r10 != r4) goto Lad
            r10 = r3
            goto Lae
        Lad:
            r10 = r6
        Lae:
            if (r7 == 0) goto Lb1
            r6 = r3
        Lb1:
            r2.<init>(r7, r10, r6)
            r0.b = r3
            java.lang.Object r10 = r11.fQ(r2, r0)
            if (r10 != r1) goto Lbd
            return r1
        Lbd:
            ffcu r10 = defpackage.ffcu.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyiq.fQ(java.lang.Object, ffgu):java.lang.Object");
    }
}
