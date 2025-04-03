package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjdg extends civa {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/notification2o/unapprovedincomingmessage/UnapprovedIncomingMessageNotificationBlueprint");
    public final alxl b;
    private final Context c;
    private final ffsk d;
    private final aqvh e;
    private final cqoh f;
    private final ffbr g;
    private final ayfg h;
    private final Optional i;

    public cjdg(Context context, ffsk ffskVar, alxl alxlVar, aqvh aqvhVar, cqoh cqohVar, ffbr ffbrVar, ayfg ayfgVar, Optional optional) {
        context.getClass();
        ffskVar.getClass();
        alxlVar.getClass();
        aqvhVar.getClass();
        cqohVar.getClass();
        ffbrVar.getClass();
        ayfgVar.getClass();
        optional.getClass();
        this.c = context;
        this.d = ffskVar;
        this.b = alxlVar;
        this.e = aqvhVar;
        this.f = cqohVar;
        this.g = ffbrVar;
        this.h = ayfgVar;
        this.i = optional;
    }

    @Override // defpackage.civa
    public final /* bridge */ /* synthetic */ elfl a(List list, Object obj) {
        elfl c;
        cjda cjdaVar = (cjda) obj;
        cjdaVar.getClass();
        c = axol.c(this.d, ffhe.a, ffsm.a, new cjdd(this, cjdaVar, null));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.google.android.apps.messaging.shared.api.messaging.Conversation r9, defpackage.ffgu r10) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjdg.b(com.google.android.apps.messaging.shared.api.messaging.Conversation, ffgu):java.lang.Object");
    }

    @Override // defpackage.civa
    public final ciwq c() {
        return new cjdf();
    }

    @Override // defpackage.civa
    public final cixf d() {
        return cixf.NT_INCOMING_UNAPPROVED_MESSAGE;
    }

    @Override // defpackage.civa
    public final elfl e() {
        elfl e = elfo.e(true);
        e.getClass();
        return e;
    }

    @Override // defpackage.civa
    public final String g() {
        return "msg";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [civk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r18, defpackage.ffgu r19) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjdg.h(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.alxj r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.cjde
            if (r0 == 0) goto L13
            r0 = r8
            cjde r0 = (defpackage.cjde) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cjde r0 = new cjde
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.a
            cjdg r0 = r0.e
            defpackage.ffci.b(r8)
            goto L57
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.ffci.b(r8)
            aqux r8 = r7.f()
            if (r8 != 0) goto L63
            aqvh r8 = r6.e
            aqge r8 = r8.a()
            elfl r8 = r8.b()
            r8.getClass()
            r0.e = r6
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = defpackage.fgfz.c(r8, r0)
            if (r8 != r1) goto L56
            return r1
        L56:
            r0 = r6
        L57:
            r8.getClass()
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = defpackage.ffdx.K(r8)
            aqux r8 = (defpackage.aqux) r8
            goto L64
        L63:
            r0 = r6
        L64:
            android.content.Context r1 = r0.c
            r2 = 2132084827(0x7f15085b, float:1.9809836E38)
            java.lang.String r1 = r1.getString(r2)
            r8.getClass()
            android.net.Uri r8 = r8.c()
            cixt r8 = defpackage.cixt.d(r1, r8)
            ciwp[] r1 = new defpackage.ciwp[r3]
            java.lang.String r2 = r7.i()
            android.net.Uri r3 = r7.a()
            cixt r2 = defpackage.cixt.d(r2, r3)
            android.content.Context r3 = r0.c
            r4 = 2132088137(0x7f151549, float:1.981655E38)
            java.lang.String r3 = r3.getString(r4)
            cqoh r4 = r0.f
            j$.time.Instant r4 = r4.f()
            long r4 = r4.toEpochMilli()
            ciwo r2 = defpackage.ciwp.f(r2, r3, r4)
            ciwp r2 = r2.a()
            r3 = 0
            r1[r3] = r2
            java.util.List r1 = defpackage.ffdx.i(r1)
            java.lang.String r2 = r7.i()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            ciwr r8 = defpackage.ciwt.u(r8, r1, r2, r3)
            java.lang.String r7 = r7.i()
            r8.d(r7)
            android.content.Context r7 = r0.c
            r1 = 2131232215(0x7f0805d7, float:1.8080533E38)
            androidx.core.graphics.drawable.IconCompat r7 = androidx.core.graphics.drawable.IconCompat.h(r7, r1)
            r1 = r8
            citb r1 = (defpackage.citb) r1
            r1.a = r7
            android.content.Context r7 = r0.c
            r0 = 2131102609(0x7f060b91, float:1.781766E38)
            int r7 = r7.getColor(r0)
            r8.c(r7)
            ciwt r7 = r8.a()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjdg.i(alxj, ffgu):java.lang.Object");
    }
}
