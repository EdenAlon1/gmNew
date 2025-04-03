package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversation;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amrc extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ EmergencyConversation c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amrc(EmergencyConversation emergencyConversation, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = emergencyConversation;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amrc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00d1, code lost:
    
        if (defpackage.fgfz.c(r6, r5) != r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d7, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0093, code lost:
    
        if (r6 != r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
    
        if (r6 != r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0034, code lost:
    
        if (r6 != r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if (r1 != 3) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0097, code lost:
    
        if (((defpackage.apkn) r6) != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0099, code lost:
    
        ((defpackage.enrr) com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversation.a.h().h("com/google/android/apps/messaging/shared/api/messaging/conversation/emergency/EmergencyConversation$unlatchConversationIfNeeded$1", "invokeSuspend", 109, "EmergencyConversation.kt")).q("Unlatching emergency conversation. There is no active XMS session.");
        r6 = ((defpackage.amhs) r5.c.f.b()).J(r5.c.i.d(), defpackage.eoxn.SEND_MODE_AUTO);
        r5.b = 4;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.b
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 == r3) goto L14
            defpackage.ffci.b(r6)
            if (r1 == r2) goto L95
            goto Ld4
        L14:
            java.lang.Object r1 = r5.a
            defpackage.ffci.b(r6)
            goto L72
        L1a:
            defpackage.ffci.b(r6)
            goto L36
        L1e:
            defpackage.ffci.b(r6)
            com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversation r6 = r5.c
            aqge r6 = r6.i()
            elfl r6 = r6.b()
            r6.getClass()
            r5.b = r4
            java.lang.Object r6 = defpackage.fgfz.c(r6, r5)
            if (r6 == r0) goto Ld7
        L36:
            r6.getClass()
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r6 = defpackage.ffdx.M(r6)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r6 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r6
            if (r6 == 0) goto Ld4
            aoku r6 = r6.g()
            if (r6 == 0) goto Ld4
            j$.util.Optional r6 = r6.e()
            if (r6 == 0) goto Ld4
            java.lang.Object r6 = defpackage.fflm.b(r6)
            awui r6 = (defpackage.awui) r6
            if (r6 == 0) goto Ld4
            java.lang.String r1 = r6.d
            if (r1 == 0) goto Ld4
            com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversation r6 = r5.c
            aqge r6 = r6.m()
            elfl r6 = r6.b()
            r6.getClass()
            r5.a = r1
            r5.b = r3
            java.lang.Object r6 = defpackage.fgfz.c(r6, r5)
            if (r6 == r0) goto Ld7
        L72:
            amrh r6 = (defpackage.amrh) r6
            eoxn r6 = r6.E()
            eoxn r3 = defpackage.eoxn.SEND_MODE_XMS_LATCH
            if (r6 != r3) goto Ld4
            com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversation r6 = r5.c
            ffbr r6 = r6.e
            java.lang.Object r6 = r6.b()
            cfsm r6 = (defpackage.cfsm) r6
            aplf r3 = defpackage.aplf.b
            r4 = 0
            r5.a = r4
            r5.b = r2
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r6 = r6.c(r1, r3, r5)
            if (r6 == r0) goto Ld7
        L95:
            apkn r6 = (defpackage.apkn) r6
            if (r6 != 0) goto Ld4
            enru r6 = com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversation.a
            ensk r6 = r6.h()
            java.lang.String r1 = "invokeSuspend"
            r2 = 109(0x6d, float:1.53E-43)
            java.lang.String r3 = "com/google/android/apps/messaging/shared/api/messaging/conversation/emergency/EmergencyConversation$unlatchConversationIfNeeded$1"
            java.lang.String r4 = "EmergencyConversation.kt"
            ensk r6 = r6.h(r3, r1, r2, r4)
            enrr r6 = (defpackage.enrr) r6
            java.lang.String r1 = "Unlatching emergency conversation. There is no active XMS session."
            r6.q(r1)
            com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversation r6 = r5.c
            ffbr r6 = r6.f
            java.lang.Object r6 = r6.b()
            amhs r6 = (defpackage.amhs) r6
            com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversation r1 = r5.c
            com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversationId r1 = r1.i
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r1 = r1.d()
            eoxn r2 = defpackage.eoxn.SEND_MODE_AUTO
            elfl r6 = r6.J(r1, r2)
            r1 = 4
            r5.b = r1
            java.lang.Object r6 = defpackage.fgfz.c(r6, r5)
            if (r6 != r0) goto Ld4
            goto Ld7
        Ld4:
            ffcu r6 = defpackage.ffcu.a
            return r6
        Ld7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amrc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amrc(this.c, ffguVar);
    }
}
