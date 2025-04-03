package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aima implements aigv {
    private final cgie a;
    private final aiiu b;

    public aima(cgie cgieVar, aiiu aiiuVar) {
        cgieVar.getClass();
        this.a = cgieVar;
        this.b = aiiuVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b0, code lost:
    
        if (r9 != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.aigv
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.aily r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.ailz
            if (r0 == 0) goto L13
            r0 = r9
            ailz r0 = (defpackage.ailz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ailz r0 = new ailz
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            defpackage.ffci.b(r9)
            goto Lb2
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            aima r8 = r0.d
            defpackage.ffci.b(r9)
            goto L8e
        L3d:
            aima r8 = r0.d
            defpackage.ffci.b(r9)
            goto L60
        L43:
            defpackage.ffci.b(r9)
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r9 = r8.a
            boolean r2 = r9 instanceof com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId
            if (r2 != 0) goto L63
            cgie r8 = r7.a
            java.lang.String r9 = r9.b()
            r9.getClass()
            r0.d = r7
            r0.c = r5
            java.lang.Object r9 = r8.a(r9, r0)
            if (r9 == r1) goto Lc2
            r8 = r7
        L60:
            android.app.PendingIntent r9 = (android.app.PendingIntent) r9
            goto L90
        L63:
            java.util.List r9 = r8.b
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto Lc3
            cgie r9 = r7.a
            java.util.List r8 = r8.b
            r0.d = r7
            r0.c = r4
            ffbr r2 = r9.c
            java.lang.Object r2 = r2.b()
            r2.getClass()
            ffhd r2 = (defpackage.ffhd) r2
            ffhd r2 = defpackage.ekxi.a(r2)
            cgib r4 = new cgib
            r4.<init>(r6, r8, r9)
            java.lang.Object r9 = defpackage.ffra.a(r2, r4, r0)
            if (r9 == r1) goto Lc2
            r8 = r7
        L8e:
            android.app.PendingIntent r9 = (android.app.PendingIntent) r9
        L90:
            if (r9 == 0) goto Lbf
            android.content.IntentSender r9 = r9.getIntentSender()
            r9.getClass()
            adq r2 = new adq
            r4 = 0
            r2.<init>(r9, r6, r4, r4)
            aiiu r8 = r8.b
            aem r9 = new aem
            r9.<init>()
            r0.d = r6
            r0.c = r3
            java.lang.String r3 = "PARENTAL_APPROVAL_DIALOG_KEY"
            java.lang.Object r9 = defpackage.aiiu.c(r8, r3, r9, r2, r0)
            if (r9 == r1) goto Lc2
        Lb2:
            ade r9 = (defpackage.ade) r9
            int r8 = r9.a
            r9 = -1
            if (r8 != r9) goto Lbc
            aimb r8 = defpackage.aimb.a
            return r8
        Lbc:
            aimb r8 = defpackage.aimb.b
            return r8
        Lbf:
            aimb r8 = defpackage.aimb.b
            return r8
        Lc2:
            return r1
        Lc3:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Either ConversationId or messaging identities must be provided."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aima.b(aily, ffgu):java.lang.Object");
    }
}
