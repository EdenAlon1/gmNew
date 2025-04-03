package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwdp implements cwde {
    public static final enru a = enru.c("com/google/android/apps/messaging/startchat/starter/ChatStarterImpl");
    public final ffhd b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final cwdu f;
    public final ffbr g;
    public final auvq h;
    public final cwds i;
    private final ffbr j;
    private final ffbr k;
    private final fgjb l;

    public cwdp(ffhd ffhdVar, cwds cwdsVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, cwdu cwduVar, ffbr ffbrVar8, auvq auvqVar) {
        ffhdVar.getClass();
        cwdsVar.getClass();
        ffbrVar2.getClass();
        ffbrVar4.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        ffbrVar8.getClass();
        this.b = ffhdVar;
        this.i = cwdsVar;
        this.j = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.k = ffbrVar5;
        this.e = ffbrVar7;
        this.f = cwduVar;
        this.g = ffbrVar8;
        this.h = auvqVar;
        this.l = new fgjf();
    }

    @Override // defpackage.cwde
    public final Object a(aoku aokuVar, aqux aquxVar, ffgu ffguVar) {
        Object f = f(new cwdh(this, aokuVar, aquxVar, null), ffguVar);
        return f == ffhh.a ? f : ffcu.a;
    }

    @Override // defpackage.cwde
    public final Object b(List list, aqux aquxVar, String str, ffgu ffguVar) {
        Object f = f(new cwdk(this, list, aquxVar, str, null), ffguVar);
        return f == ffhh.a ? f : ffcu.a;
    }

    @Override // defpackage.cwde
    public final void c(ConversationId conversationId) {
        ensk h = a.h();
        h.Y(ente.a, "BugleContacts");
        ((enrr) h.h("com/google/android/apps/messaging/startchat/starter/ChatStarterImpl", "openChat", 88, "ChatStarterImpl.kt")).q("Opening the conversation");
        ((ecrj) this.d.b()).e(alrv.t);
        ((ecrj) this.d.b()).e(csra.n);
        g(conversationId);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.aoku r8, defpackage.aqux r9, defpackage.ffgu r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.cwdg
            if (r0 == 0) goto L13
            r0 = r10
            cwdg r0 = (defpackage.cwdg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cwdg r0 = new cwdg
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r10)
            goto L7a
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.ffci.b(r10)
            boolean r10 = r8.A()
            if (r10 != 0) goto L3e
            r8 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        L3e:
            ffbr r10 = r7.k
            java.lang.Object r10 = r10.b()
            aqkp r10 = (defpackage.aqkp) r10
            com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient r8 = r10.f(r8)
            enru r10 = defpackage.cwdp.a
            ensk r10 = r10.h()
            ensn r2 = defpackage.ente.a
            java.lang.String r4 = "BugleContacts"
            r10.Y(r2, r4)
            java.lang.String r2 = "mayStartPenpalBotChat"
            r4 = 273(0x111, float:3.83E-43)
            java.lang.String r5 = "com/google/android/apps/messaging/startchat/starter/ChatStarterImpl"
            java.lang.String r6 = "ChatStarterImpl.kt"
            ensk r10 = r10.h(r5, r2, r4, r6)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r2 = "Starting a 1-1 Penpal bot conversation"
            r10.q(r2)
            engw r8 = defpackage.engw.r(r8)
            r8.getClass()
            r0.c = r3
            java.lang.Object r8 = r7.e(r8, r9, r0)
            if (r8 != r1) goto L7a
            return r1
        L7a:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwdp.d(aoku, aqux, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.engw r23, defpackage.aqux r24, defpackage.ffgu r25) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwdp.e(engw, aqux, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.ffji r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cwdo
            if (r0 == 0) goto L13
            r0 = r6
            cwdo r0 = (defpackage.cwdo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cwdo r0 = new cwdo
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            cwdp r5 = r0.d
            defpackage.ffci.b(r6)     // Catch: java.lang.Throwable -> L29
            goto L49
        L29:
            r6 = move-exception
            goto L53
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ffci.b(r6)
            fgjb r6 = r4.l
            boolean r6 = defpackage.fgja.b(r6)
            if (r6 == 0) goto L59
            r0.d = r4     // Catch: java.lang.Throwable -> L50
            r0.c = r3     // Catch: java.lang.Throwable -> L50
            java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L50
            if (r5 == r1) goto L4f
            r5 = r4
        L49:
            fgjb r5 = r5.l
            defpackage.fgja.c(r5)
            goto L79
        L4f:
            return r1
        L50:
            r5 = move-exception
            r6 = r5
            r5 = r4
        L53:
            fgjb r5 = r5.l
            defpackage.fgja.c(r5)
            throw r6
        L59:
            enru r5 = defpackage.cwdp.a
            ensk r5 = r5.e()
            ensn r6 = defpackage.ente.a
            java.lang.String r0 = "BugleContacts"
            r5.Y(r6, r0)
            java.lang.String r6 = "tryWithLock"
            r0 = 286(0x11e, float:4.01E-43)
            java.lang.String r1 = "com/google/android/apps/messaging/startchat/starter/ChatStarterImpl"
            java.lang.String r2 = "ChatStarterImpl.kt"
            ensk r5 = r5.h(r1, r6, r0, r2)
            enrr r5 = (defpackage.enrr) r5
            java.lang.String r6 = "Failed to acquire lock for start chat"
            r5.q(r6)
        L79:
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwdp.f(ffji, ffgu):java.lang.Object");
    }

    public final void g(ConversationId conversationId) {
        enru enruVar = a;
        ensk h = enruVar.h();
        h.Y(ente.a, "BugleContacts");
        ((enrr) h.h("com/google/android/apps/messaging/startchat/starter/ChatStarterImpl", "navigateToConversation", 211, "ChatStarterImpl.kt")).t("Navigating to conversation: %s", conversationId);
        if (((aigz) this.j.b()).j(new aijn(new aijp(conversationId, true, false, 2, null, null, null, false, false, 4066)))) {
            return;
        }
        ensk j = enruVar.j();
        j.Y(ente.a, "BugleContacts");
        ((enrr) j.h("com/google/android/apps/messaging/startchat/starter/ChatStarterImpl", "navigateToConversation", 227, "ChatStarterImpl.kt")).t("Failed to navigate to conversation: %s", conversationId);
    }
}
