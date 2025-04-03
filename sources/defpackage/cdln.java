package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdln implements cdlk {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaBugleDbHelperImpl");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final atky f;
    private final cbgf g;
    private final cbwj h;

    public cdln(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, cbgf cbgfVar, atky atkyVar, ffsk ffskVar, cbwj cbwjVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        cbgfVar.getClass();
        atkyVar.getClass();
        ffskVar.getClass();
        cbwjVar.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.g = cbgfVar;
        this.f = atkyVar;
        this.h = cbwjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.cdlk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(final com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable.BindData r12, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r13, final com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r14, final java.lang.String r15, final android.net.Uri r16, defpackage.ffgu r17) {
        /*
            r11 = this;
            r0 = r17
            boolean r1 = r0 instanceof defpackage.cdlm
            if (r1 == 0) goto L15
            r1 = r0
            cdlm r1 = (defpackage.cdlm) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.c = r2
            goto L1a
        L15:
            cdlm r1 = new cdlm
            r1.<init>(r11, r0)
        L1a:
            java.lang.Object r0 = r1.a
            ffhh r2 = defpackage.ffhh.a
            int r3 = r1.c
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r14 = r1.f
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r13 = r1.e
            cdln r12 = r1.d
            defpackage.ffci.b(r0)
            goto L60
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            defpackage.ffci.b(r0)
            cbwj r0 = r11.h
            cdll r5 = new cdll
            r6 = r11
            r7 = r12
            r8 = r14
            r9 = r15
            r10 = r16
            r5.<init>()
            java.lang.String r12 = "CmsMediaBugleDbHelper#updateBugleDbForMediaUri"
            elfl r12 = r0.b(r12, r5)
            r12.getClass()
            r1.d = r11
            r1.e = r13
            r1.f = r14
            r1.c = r4
            java.lang.Object r12 = defpackage.fgfz.c(r12, r1)
            if (r12 != r2) goto L5f
            return r2
        L5f:
            r12 = r11
        L60:
            cbgf r12 = r12.g
            java.lang.String[] r15 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable.a
            java.lang.String r15 = "parts"
            java.lang.String[] r15 = new java.lang.String[]{r15}
            r12.l(r13, r14, r15)
            ffcu r12 = defpackage.ffcu.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdln.a(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable$BindData, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType, java.lang.String, android.net.Uri, ffgu):java.lang.Object");
    }

    @Override // defpackage.cdlk
    public final void b(byyu byyuVar, ConversationIdType conversationIdType, MessageIdType messageIdType, String str) {
        byyuVar.getClass();
        conversationIdType.getClass();
        messageIdType.getClass();
        str.getClass();
        String[] strArr = PartsTable.a;
        bwdi bwdiVar = new bwdi();
        bwdiVar.ap("updateAndNotifyCmsAttachmentProcessingStatus");
        bwdiVar.f(byyuVar);
        bwdiVar.c(str);
        this.g.l(conversationIdType, messageIdType, "parts");
    }
}
