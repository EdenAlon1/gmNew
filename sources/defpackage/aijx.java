package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aijx implements aigt {
    private final Activity a;
    private final ffbr b;
    private final ffbr c;

    public aijx(Activity activity, ffbr ffbrVar, ffbr ffbrVar2) {
        ffbrVar.getClass();
        this.a = activity;
        this.b = ffbrVar;
        this.c = ffbrVar2;
    }

    @Override // defpackage.aigt
    public final /* bridge */ /* synthetic */ Object a(aihs aihsVar, ffgu ffguVar) {
        Object b = b((aijv) aihsVar, ffguVar);
        return b == ffhh.a ? b : ffcu.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.aijv r14, defpackage.ffgu r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof defpackage.aijw
            if (r0 == 0) goto L13
            r0 = r15
            aijw r0 = (defpackage.aijw) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            aijw r0 = new aijw
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r14 = r0.b
            java.lang.Object r1 = r0.a
            aijv r0 = r0.f
            defpackage.ffci.b(r15)
            r2 = r14
            r14 = r0
            r3 = r1
            goto La3
        L34:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3c:
            java.lang.Object r14 = r0.b
            java.lang.Object r1 = r0.a
            aijv r0 = r0.f
            defpackage.ffci.b(r15)
            goto L73
        L46:
            defpackage.ffci.b(r15)
            boolean r15 = r14.d
            if (r15 == 0) goto L7f
            ffbr r15 = r13.b
            java.lang.Object r15 = r15.b()
            ayfg r15 = (defpackage.ayfg) r15
            android.app.Activity r2 = r13.a
            ffbr r3 = r13.c
            java.lang.Object r3 = r3.b()
            aijb r3 = (defpackage.aijb) r3
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5 = r14.a
            r0.f = r14
            r0.a = r15
            r0.b = r2
            r0.e = r4
            java.lang.Object r0 = r3.a(r5, r0)
            if (r0 == r1) goto Lbd
            r1 = r15
            r15 = r0
            r0 = r14
            r14 = r2
        L73:
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r15 = (com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId) r15
            android.content.Context r14 = (android.content.Context) r14
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r2 = r0.b
            java.lang.String r0 = r0.c
            r1.E(r14, r15, r2, r0)
            goto Lba
        L7f:
            ffbr r15 = r13.b
            java.lang.Object r15 = r15.b()
            ayfg r15 = (defpackage.ayfg) r15
            android.app.Activity r2 = r13.a
            ffbr r4 = r13.c
            java.lang.Object r4 = r4.b()
            aijb r4 = (defpackage.aijb) r4
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5 = r14.a
            r0.f = r14
            r0.a = r15
            r0.b = r2
            r0.e = r3
            java.lang.Object r0 = r4.a(r5, r0)
            if (r0 == r1) goto Lbd
            r3 = r15
            r15 = r0
        La3:
            r5 = r15
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r5 = (com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId) r5
            bdja r8 = new bdja
            r15 = 0
            r8.<init>(r15)
            java.lang.String r11 = r14.c
            r4 = r2
            android.content.Context r4 = (android.content.Context) r4
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r6 = r14.b
            r10 = 0
            r12 = 0
            r7 = 0
            r9 = 0
            r3.t(r4, r5, r6, r7, r8, r9, r10, r11, r12)
        Lba:
            ffcu r14 = defpackage.ffcu.a
            return r14
        Lbd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aijx.b(aijv, ffgu):java.lang.Object");
    }
}
