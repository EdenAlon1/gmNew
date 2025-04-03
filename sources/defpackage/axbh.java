package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axbh {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/chatapi/protomessage/workhandler/RcsProtoMessageSenderHandler");
    public final ffhd b;
    public final ffbr c;
    public final ffbr d;
    public final axaz e;
    public final awtm f;
    public final ffbr g;
    public final azei h;
    public final auti i;
    public final aute j;
    public final eijz k;
    public final cslr l;
    private final ffbr m;
    private final ffbr n;
    private final ffsk o;
    private final ffbr p;
    private final autl q;
    private final autb r;

    public axbh(ffhd ffhdVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, axaz axazVar, awtm awtmVar, ffbr ffbrVar5, ffsk ffskVar, azei azeiVar, auti autiVar, cslr cslrVar, ffbr ffbrVar6, autl autlVar, autb autbVar, autg autgVar, avks avksVar, aute auteVar, eijz eijzVar) {
        ffhdVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        awtmVar.getClass();
        ffbrVar5.getClass();
        ffskVar.getClass();
        azeiVar.getClass();
        cslrVar.getClass();
        ffbrVar6.getClass();
        autlVar.getClass();
        autgVar.getClass();
        avksVar.getClass();
        this.b = ffhdVar;
        this.c = ffbrVar;
        this.m = ffbrVar2;
        this.n = ffbrVar3;
        this.d = ffbrVar4;
        this.e = axazVar;
        this.f = awtmVar;
        this.g = ffbrVar5;
        this.o = ffskVar;
        this.h = azeiVar;
        this.i = autiVar;
        this.l = cslrVar;
        this.p = ffbrVar6;
        this.q = autlVar;
        this.r = autbVar;
        this.j = auteVar;
        this.k = eijzVar;
    }

    public final avkl a(amfx amfxVar, engw engwVar) {
        amfxVar.getClass();
        if (amfxVar.b() == alxi.ONE_ON_ONE) {
            E e = engwVar.get(0);
            e.getClass();
            aoku aokuVar = (aoku) e;
            if (!aokuVar.e().isPresent()) {
                return ((avkm) this.d.b()).a(aokuVar.p(true));
            }
            return new avkl((awui) aokuVar.e().get());
        }
        String I = amfxVar.I();
        if (I == null || I.length() <= 0) {
            throw new IllegalArgumentException("RCS group id is missing.");
        }
        String H = amfxVar.H();
        if (H == null || H.length() <= 0) {
            throw new IllegalArgumentException("RCS conference uri is missing.");
        }
        if (engwVar.isEmpty()) {
            throw new IllegalArgumentException("No group participants provided.");
        }
        avkm avkmVar = (avkm) this.d.b();
        String I2 = amfxVar.I();
        I2.getClass();
        String H2 = amfxVar.H();
        H2.getClass();
        return avkmVar.c(I2, H2, engwVar);
    }

    public final ceyt b(ckbx ckbxVar, ceuw ceuwVar) {
        ckbxVar.getClass();
        if (ckbxVar.c() == 0) {
            ((enrr) a.e().h("com/google/android/apps/messaging/shared/chatapi/protomessage/workhandler/RcsProtoMessageSenderHandler", "handleSendMessageResult", 480, "RcsProtoMessageSenderHandler.kt")).q("RCS proto message send successful.");
            return ceyt.i();
        }
        if (ckbxVar.c() == -1) {
            ((enrr) a.e().h("com/google/android/apps/messaging/shared/chatapi/protomessage/workhandler/RcsProtoMessageSenderHandler", "handleSendMessageResult", 484, "RcsProtoMessageSenderHandler.kt")).q("RCS proto message send pending.");
            return ceyt.i();
        }
        ((enrr) a.j().h("com/google/android/apps/messaging/shared/chatapi/protomessage/workhandler/RcsProtoMessageSenderHandler", "handleSendMessageResult", 488, "RcsProtoMessageSenderHandler.kt")).q("RCS proto message send failed.");
        return (ceuwVar == null || !ceuwVar.c()) ? ceyt.k() : ceyt.m();
    }

    public final Object c(BugleConversationId bugleConversationId, ffgu ffguVar) {
        elfl b = ((DefaultConversation) ((amhs) this.n.b()).H(bugleConversationId, false)).f.b();
        b.getClass();
        return fgfz.c(b, ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.axbb
            if (r0 == 0) goto L13
            r0 = r7
            axbb r0 = (defpackage.axbb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            axbb r0 = new axbb
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            axbh r6 = r0.d
            defpackage.ffci.b(r7)
            goto L5e
        L38:
            defpackage.ffci.b(r7)
            ffbr r7 = r5.n
            java.lang.Object r7 = r7.b()
            amhs r7 = (defpackage.amhs) r7
            r2 = 0
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation r6 = r7.H(r6, r2)
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation r6 = (com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation) r6
            aqge r6 = r6.f
            elfl r6 = r6.b()
            r6.getClass()
            r0.d = r5
            r0.c = r4
            java.lang.Object r7 = defpackage.fgfz.c(r6, r0)
            if (r7 == r1) goto L79
            r6 = r5
        L5e:
            amfx r7 = (defpackage.amfx) r7
            aqux r7 = r7.f()
            ffbr r6 = r6.m
            java.lang.Object r6 = r6.b()
            ckac r6 = (defpackage.ckac) r6
            r2 = 0
            r0.d = r2
            r0.c = r3
            java.lang.Object r6 = r6.g(r7, r0)
            if (r6 != r1) goto L78
            goto L79
        L78:
            return r6
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axbh.d(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.cjmt r9, defpackage.avkl r10, defpackage.awui r11, defpackage.awya r12, boolean r13, defpackage.ffgu r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof defpackage.axbg
            if (r0 == 0) goto L13
            r0 = r14
            axbg r0 = (defpackage.axbg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            axbg r0 = new axbg
            r0.<init>(r8, r14)
        L18:
            r7 = r0
            java.lang.Object r14 = r7.a
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.c
            r2 = 1
            if (r1 == 0) goto L47
            if (r1 == r2) goto L43
            r9 = 2
            r10 = 3
            if (r1 == r9) goto L36
            if (r1 != r10) goto L2e
            defpackage.ffci.b(r14)
            return r14
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            defpackage.ffci.b(r14)
            cjlu r14 = (defpackage.cjlu) r14
            azcr r9 = r14.a
            azhq r9 = r14.b
            r7.c = r10
            r9 = 0
            throw r9
        L43:
            defpackage.ffci.b(r14)
            return r14
        L47:
            defpackage.ffci.b(r14)
            r7.c = r2
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            java.lang.Object r9 = r1.g(r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L59
            return r0
        L59:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axbh.e(cjmt, avkl, awui, awya, boolean, ffgu):java.lang.Object");
    }

    public final void f(ffrf ffrfVar, cjmw cjmwVar, cjmw cjmwVar2, int i) {
        if (ffkj.e(cjmwVar, cjmwVar2)) {
            ffrfVar.w(ckbx.j(i, 0).a());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.cjmt r23, defpackage.avkl r24, defpackage.awui r25, defpackage.awya r26, boolean r27, defpackage.ffgu r28) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axbh.g(cjmt, avkl, awui, awya, boolean, ffgu):java.lang.Object");
    }
}
