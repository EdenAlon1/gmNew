package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clva implements bdny, bdnr {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/rcs/participant/ConversationDraftingUpdater");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffsk e;
    public final clvg f;
    public final asmf g;
    public final clvh h;

    public clva(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffsk ffskVar, ffsk ffskVar2, clvg clvgVar, asmf asmfVar, clvh clvhVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar4;
        this.e = ffskVar;
        this.f = clvgVar;
        this.g = asmfVar;
        this.h = clvhVar;
    }

    private final void d(ConversationIdType conversationIdType, Recipient recipient) {
        axol.m(this.e, new cluz(this, conversationIdType, recipient, null));
    }

    @Override // defpackage.bdnr
    public final void a(ConversationIdType conversationIdType, Recipient recipient) {
        d(conversationIdType, recipient);
    }

    @Override // defpackage.bdny
    public final void b(ConversationIdType conversationIdType, Recipient recipient) {
        conversationIdType.getClass();
        d(conversationIdType, recipient);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
    
        if (r5.am() == false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.bseh r5, com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient r6, defpackage.ffgu r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.clux
            if (r0 == 0) goto L13
            r0 = r7
            clux r0 = (defpackage.clux) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            clux r0 = new clux
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r5 = r0.a
            defpackage.ffci.b(r7)
            goto L4a
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r7)
            r7 = 2
            aqge r6 = r6.E(r7)
            elfl r6 = r6.b()
            r6.getClass()
            r0.a = r5
            r0.d = r3
            java.lang.Object r7 = defpackage.fgfz.c(r6, r0)
            if (r7 == r1) goto L72
        L4a:
            aqpf r7 = (defpackage.aqpf) r7
            boolean r6 = r7.p()
            r7 = 0
            if (r6 == 0) goto L6c
            bseh r5 = (defpackage.bseh) r5
            int r6 = r5.r()
            if (r6 != 0) goto L6c
            int r6 = r5.k()
            boolean r6 = defpackage.byyr.c(r6)
            if (r6 == 0) goto L6c
            boolean r5 = r5.am()
            if (r5 != 0) goto L6c
            goto L6d
        L6c:
            r3 = r7
        L6d:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clva.c(bseh, com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient, ffgu):java.lang.Object");
    }
}
