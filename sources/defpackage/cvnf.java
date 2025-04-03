package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvnf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cvng b;
    final /* synthetic */ ConversationId c;
    final /* synthetic */ cuex d;
    final /* synthetic */ String e;
    final /* synthetic */ boolean f;
    final /* synthetic */ cuea g;
    final /* synthetic */ ResolvedRecipient h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvnf(cvng cvngVar, ConversationId conversationId, cuex cuexVar, String str, boolean z, cuea cueaVar, ResolvedRecipient resolvedRecipient, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cvngVar;
        this.c = conversationId;
        this.d = cuexVar;
        this.e = str;
        this.f = z;
        this.g = cueaVar;
        this.h = resolvedRecipient;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvnf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (defpackage.fgfz.c(r11, r10) != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0070, code lost:
    
        if (r11.a(r3, r10) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0076, code lost:
    
        return r0;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            r10 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r10.a
            r2 = 1
            defpackage.ffci.b(r11)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L31
            goto L73
        Ld:
            cvng r11 = r10.b
            ffbr r11 = r11.d
            java.lang.Object r11 = r11.b()
            r3 = r11
            alxl r3 = (defpackage.alxl) r3
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r4 = r10.c
            cuex r5 = r10.d
            java.lang.String r6 = r10.e
            boolean r7 = r10.f
            cuea r8 = r10.g
            elfl r11 = r3.z(r4, r5, r6, r7, r8)
            r11.getClass()
            r10.a = r2
            java.lang.Object r11 = defpackage.fgfz.c(r11, r10)
            if (r11 == r0) goto L76
        L31:
            boolean r11 = r10.f
            if (r11 == 0) goto L73
            cvng r11 = r10.b
            ffbr r11 = r11.e
            java.lang.Object r11 = r11.b()
            ablq r11 = (defpackage.ablq) r11
            cvng r1 = r10.b
            ablt r3 = new ablt
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r4 = r10.h
            aoku r4 = r4.g()
            aokr r4 = r4.G()
            java.lang.String r4 = r4.a
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r5 = 0
            r2[r5] = r4
            android.content.Context r1 = r1.a
            r4 = 2132088704(0x7f151780, float:1.98177E38)
            java.lang.String r4 = r1.getString(r4, r2)
            r4.getClass()
            r8 = 0
            r9 = 125(0x7d, float:1.75E-43)
            r5 = 0
            r6 = 0
            r7 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r1 = 2
            r10.a = r1
            java.lang.Object r11 = r11.a(r3, r10)
            if (r11 != r0) goto L73
            goto L76
        L73:
            ffcu r11 = defpackage.ffcu.a
            return r11
        L76:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvnf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cvnf(this.b, this.c, this.d, this.e, this.f, this.g, this.h, ffguVar);
    }
}
