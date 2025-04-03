package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amna implements amns {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/destination/BugleConversationDestinationTokenUpdater");
    private final ffbr b;
    private final ffsk c;

    public amna(ffbr ffbrVar, ffsk ffskVar) {
        ffbrVar.getClass();
        ffskVar.getClass();
        this.b = ffbrVar;
        this.c = ffskVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ce, code lost:
    
        if (defpackage.fgfz.c(r10, r0) == r1) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r10, defpackage.amfx r11, defpackage.ffgu r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.ammz
            if (r0 == 0) goto L13
            r0 = r12
            ammz r0 = (defpackage.ammz) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ammz r0 = new ammz
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.ffci.b(r12)
            goto Ld1
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            java.lang.Object r11 = r0.a
            amna r10 = r0.e
            defpackage.ffci.b(r12)
            goto L52
        L3b:
            defpackage.ffci.b(r12)
            elfl r10 = r10.r()
            r10.getClass()
            r0.e = r9
            r0.a = r11
            r0.d = r4
            java.lang.Object r12 = defpackage.fgfz.c(r10, r0)
            if (r12 == r1) goto Ld4
            r10 = r9
        L52:
            azcr r12 = (defpackage.azcr) r12
            azcr r2 = defpackage.azcr.a
            boolean r2 = defpackage.ffkj.e(r12, r2)
            java.lang.String r4 = "updateDestinationToken"
            java.lang.String r5 = "com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/destination/BugleConversationDestinationTokenUpdater"
            java.lang.String r6 = "BugleConversationDestinationTokenUpdater.kt"
            java.lang.String r7 = "BugleCME"
            if (r2 == 0) goto L8a
            enru r10 = defpackage.amna.a
            ensk r10 = r10.j()
            ensn r12 = defpackage.ente.a
            r10.Y(r12, r7)
            enrr r10 = (defpackage.enrr) r10
            ensn r12 = defpackage.csux.q
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r11 = r11.c()
            r10.Y(r12, r11)
            r11 = 71
            ensk r10 = r10.h(r5, r4, r11, r6)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r11 = "Recipient should have a valid destination token for an RCS conversation."
            r10.q(r11)
            ffcu r10 = defpackage.ffcu.a
            return r10
        L8a:
            enru r2 = defpackage.amna.a
            ensk r2 = r2.h()
            ensn r8 = defpackage.ente.a
            r2.Y(r8, r7)
            enrr r2 = (defpackage.enrr) r2
            ensn r7 = defpackage.csux.q
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r8 = r11.c()
            r2.Y(r7, r8)
            r7 = 77
            ensk r2 = r2.h(r5, r4, r7, r6)
            enrr r2 = (defpackage.enrr) r2
            java.lang.String r4 = "Updating the destination token for the RCS conversation."
            r2.q(r4)
            ffbr r10 = r10.b
            java.lang.Object r10 = r10.b()
            amhs r10 = (defpackage.amhs) r10
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r11 = r11.c()
            r11.getClass()
            r12.getClass()
            elfl r10 = r10.K(r11, r12)
            r11 = 0
            r0.e = r11
            r0.a = r11
            r0.d = r3
            java.lang.Object r10 = defpackage.fgfz.c(r10, r0)
            if (r10 != r1) goto Ld1
            goto Ld4
        Ld1:
            ffcu r10 = defpackage.ffcu.a
            return r10
        Ld4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amna.a(com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, amfx, ffgu):java.lang.Object");
    }

    @Override // defpackage.amns
    public final void b(amfx amfxVar, List list) {
        amfxVar.getClass();
        list.getClass();
        if (!ffkj.e(amfxVar.B(), azcr.a)) {
            ensk e = a.e();
            e.Y(ente.a, "BugleCME");
            enrr enrrVar = (enrr) e;
            enrrVar.Y(csux.q, amfxVar.c());
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/destination/BugleConversationDestinationTokenUpdater", "onConversationRcs", 44, "BugleConversationDestinationTokenUpdater.kt")).q("Not updating token for conversation, since it's already set.");
            return;
        }
        if (amfxVar.b() != alxi.GROUP) {
            axol.m(this.c, new ammy(this, list, amfxVar, null));
            return;
        }
        ensk h = a.h();
        h.Y(ente.a, "BugleCME");
        enrr enrrVar2 = (enrr) h;
        enrrVar2.Y(csux.q, amfxVar.c());
        ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/destination/BugleConversationDestinationTokenUpdater", "onConversationRcs", 51, "BugleConversationDestinationTokenUpdater.kt")).q("Not updating destination token for a RCS group conversation. This should be done elsewhere.");
    }
}
