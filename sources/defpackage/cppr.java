package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cppr implements cigv {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/tachygram/control/ControlInboxMessageHandler");
    private final Map b;
    private final ffsk c;
    private final asms d;

    public cppr(Map map, ffsk ffskVar, asms asmsVar) {
        ffskVar.getClass();
        this.b = map;
        this.c = ffskVar;
        this.d = asmsVar;
    }

    @Override // defpackage.cigv
    public final elfl a(fbzt fbztVar) {
        elfl c;
        fbztVar.getClass();
        if (((ersq) ((arqt) this.d).a.b()).a("bugle.enable_processing_control_messages")) {
            c = axol.c(this.c, ffhe.a, ffsm.a, new cppp(this, fbztVar, null));
            return c;
        }
        elfl e = elfo.e(true);
        e.getClass();
        return e;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fbzt r10, defpackage.ffgu r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.cppq
            if (r0 == 0) goto L13
            r0 = r11
            cppq r0 = (defpackage.cppq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cppq r0 = new cppq
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            java.lang.String r3 = "handleInboxMessageInternal"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/tachygram/control/ControlInboxMessageHandler"
            java.lang.String r5 = "ControlInboxMessageHandler.kt"
            java.lang.String r6 = "BugleTachygram"
            r7 = 1
            if (r2 == 0) goto L37
            if (r2 != r7) goto L2f
            defpackage.ffci.b(r11)     // Catch: defpackage.eygu -> La9
            return r11
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            defpackage.ffci.b(r11)
            int r11 = r10.d
            fbzs r2 = defpackage.fbzs.b(r11)
            if (r2 != 0) goto L44
            fbzs r2 = defpackage.fbzs.UNRECOGNIZED
        L44:
            fbzs r8 = defpackage.fbzs.TACHYGRAM_CONTROL_MESSAGE
            if (r2 != r8) goto Lc6
            eyee r11 = r10.e     // Catch: defpackage.eygu -> La9
            fcda r2 = defpackage.fcda.a     // Catch: defpackage.eygu -> La9
            eyfy r11 = defpackage.eyfy.parseFrom(r2, r11)     // Catch: defpackage.eygu -> La9
            fcda r11 = (defpackage.fcda) r11     // Catch: defpackage.eygu -> La9
            r11.getClass()     // Catch: defpackage.eygu -> La9
            int r2 = r11.b     // Catch: defpackage.eygu -> La9
            if (r2 == 0) goto L66
            if (r2 == r7) goto L63
            r8 = 2
            if (r2 == r8) goto L60
            r2 = 0
            goto L68
        L60:
            fccz r2 = defpackage.fccz.CALL_HOME_MESSAGE     // Catch: defpackage.eygu -> La9
            goto L68
        L63:
            fccz r2 = defpackage.fccz.CLEAR_AUTH_TOKEN     // Catch: defpackage.eygu -> La9
            goto L68
        L66:
            fccz r2 = defpackage.fccz.MESSAGE_NOT_SET     // Catch: defpackage.eygu -> La9
        L68:
            r2.getClass()     // Catch: defpackage.eygu -> La9
            java.util.Map r8 = r9.b     // Catch: defpackage.eygu -> La9
            java.lang.Object r8 = r8.get(r2)     // Catch: defpackage.eygu -> La9
            cpps r8 = (defpackage.cpps) r8     // Catch: defpackage.eygu -> La9
            if (r8 != 0) goto L96
            enru r10 = defpackage.cppr.a     // Catch: defpackage.eygu -> La9
            ensk r10 = r10.j()     // Catch: defpackage.eygu -> La9
            ensn r11 = defpackage.ente.a     // Catch: defpackage.eygu -> La9
            r10.Y(r11, r6)     // Catch: defpackage.eygu -> La9
            r11 = 45
            ensk r10 = r10.h(r4, r3, r11, r5)     // Catch: defpackage.eygu -> La9
            enrr r10 = (defpackage.enrr) r10     // Catch: defpackage.eygu -> La9
            java.lang.String r11 = "No handler for TachygramControlMessage of type %s"
            java.lang.String r0 = r2.name()     // Catch: defpackage.eygu -> La9
            r10.t(r11, r0)     // Catch: defpackage.eygu -> La9
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r7)     // Catch: defpackage.eygu -> La9
            return r10
        L96:
            fcek r10 = r10.i     // Catch: defpackage.eygu -> La9
            if (r10 != 0) goto L9c
            fcek r10 = defpackage.fcek.a     // Catch: defpackage.eygu -> La9
        L9c:
            r10.getClass()     // Catch: defpackage.eygu -> La9
            r0.c = r7     // Catch: defpackage.eygu -> La9
            java.lang.Object r10 = r8.a(r11, r10, r0)     // Catch: defpackage.eygu -> La9
            if (r10 != r1) goto La8
            return r1
        La8:
            return r10
        La9:
            enru r10 = defpackage.cppr.a
            ensk r10 = r10.j()
            ensn r11 = defpackage.ente.a
            r10.Y(r11, r6)
            r11 = 50
            ensk r10 = r10.h(r4, r3, r11, r5)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r11 = "Could not parse TachygramControlMessage. Dropping message."
            r10.q(r11)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r7)
            return r10
        Lc6:
            fbzs r10 = defpackage.fbzs.b(r11)
            if (r10 != 0) goto Lce
            fbzs r10 = defpackage.fbzs.UNRECOGNIZED
        Lce:
            java.lang.String r10 = r10.name()
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Expected messageType TACHYGRAM_CONTROL_MESSAGE, but received: "
            java.lang.String r10 = r0.concat(r10)
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cppr.b(fbzt, ffgu):java.lang.Object");
    }
}
