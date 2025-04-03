package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversationId;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apld {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/api/messaging/message/compose/emergency/session/EmergencySessionTimeoutTracker");
    public final ffsk b;
    public final ffbr c;
    public final EmergencyConversationId d;
    public final Map e = new ConcurrentHashMap();
    public final ctbl f;
    private final ffbr g;
    private final aqge h;

    public apld(ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ctbk ctbkVar, EmergencyConversationId emergencyConversationId, aqge aqgeVar) {
        this.b = ffskVar;
        this.g = ffbrVar;
        this.c = ffbrVar2;
        this.d = emergencyConversationId;
        this.h = aqgeVar;
        this.f = ctbkVar.a(new apkz());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a9, code lost:
    
        if (defpackage.fgfz.c(r9, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.apkn r9, defpackage.ffgu r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.apla
            if (r0 == 0) goto L13
            r0 = r10
            apla r0 = (defpackage.apla) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            apla r0 = new apla
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            java.lang.String r3 = "onSessionTimeout"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/api/messaging/message/compose/emergency/session/EmergencySessionTimeoutTracker"
            java.lang.String r5 = "EmergencySessionTimeoutTracker.kt"
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L3f
            if (r2 == r7) goto L39
            if (r2 != r6) goto L31
            defpackage.ffci.b(r10)
            goto Lac
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            apld r9 = r0.d
            defpackage.ffci.b(r10)
            goto L6f
        L3f:
            defpackage.ffci.b(r10)
            enru r10 = defpackage.apld.a
            ensk r10 = r10.h()
            r2 = 133(0x85, float:1.86E-43)
            ensk r10 = r10.h(r4, r3, r2, r5)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r2 = "Emergency session timeout: %s"
            r10.t(r2, r9)
            aplf r9 = r9.b
            aplf r10 = defpackage.aplf.b
            if (r9 != r10) goto Lac
            aqge r9 = r8.h
            elfl r9 = r9.b()
            r9.getClass()
            r0.d = r8
            r0.c = r7
            java.lang.Object r10 = defpackage.fgfz.c(r9, r0)
            if (r10 == r1) goto Lab
            r9 = r8
        L6f:
            amrh r10 = (defpackage.amrh) r10
            eoxn r10 = r10.E()
            eoxn r2 = defpackage.eoxn.SEND_MODE_XMS_LATCH
            if (r10 != r2) goto Lac
            enru r10 = defpackage.apld.a
            ensk r10 = r10.h()
            r2 = 138(0x8a, float:1.93E-43)
            ensk r10 = r10.h(r4, r3, r2, r5)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r2 = "Unlatching emergency conversation from XMS due to XMS session timeout."
            r10.q(r2)
            ffbr r10 = r9.g
            java.lang.Object r10 = r10.b()
            amhs r10 = (defpackage.amhs) r10
            com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversationId r9 = r9.d
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r9 = r9.d()
            eoxn r2 = defpackage.eoxn.SEND_MODE_AUTO
            elfl r9 = r10.J(r9, r2)
            r10 = 0
            r0.d = r10
            r0.c = r6
            java.lang.Object r9 = defpackage.fgfz.c(r9, r0)
            if (r9 != r1) goto Lac
        Lab:
            return r1
        Lac:
            ffcu r9 = defpackage.ffcu.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apld.a(apkn, ffgu):java.lang.Object");
    }
}
