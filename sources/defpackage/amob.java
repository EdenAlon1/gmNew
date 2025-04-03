package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amob extends ffhv implements ffjm {
    int a;
    final /* synthetic */ amoc b;
    final /* synthetic */ ConversationId c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amob(amoc amocVar, ConversationId conversationId, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = amocVar;
        this.c = conversationId;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amob) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0086, code lost:
    
        r1.add(((com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r6.next()).g());
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0094, code lost:
    
        r6 = (defpackage.aqly) r5.b.d.b();
        r5.a = 4;
        r6 = r6.b(r1, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a5, code lost:
    
        if (r6 != r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00cd, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ae, code lost:
    
        if (((java.lang.Boolean) r6).booleanValue() == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b2, code lost:
    
        return defpackage.amod.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b5, code lost:
    
        return defpackage.amod.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r6 != r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0045, code lost:
    
        if (r6 != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x002b, code lost:
    
        if (r6 != r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if (r1 != 3) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x006c, code lost:
    
        r6.getClass();
        r6 = (java.lang.Iterable) r6;
        r1 = new java.util.ArrayList(defpackage.ffdx.n(r6, 10));
        r6 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0084, code lost:
    
        if (r6.hasNext() == false) goto L37;
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
            int r1 = r5.a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L18
            if (r1 == r4) goto L14
            defpackage.ffci.b(r6)
            if (r1 == r3) goto L47
            if (r1 == r2) goto L6c
            goto La8
        L14:
            defpackage.ffci.b(r6)
            goto L2d
        L18:
            defpackage.ffci.b(r6)
            amoc r6 = r5.b
            ffbr r6 = r6.e
            java.lang.Object r6 = r6.b()
            cghm r6 = (defpackage.cghm) r6
            r5.a = r4
            java.lang.Object r6 = r6.a(r5)
            if (r6 == r0) goto Lcd
        L2d:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto Lb6
            amoc r6 = r5.b
            ffbr r6 = r6.c
            java.lang.Object r6 = r6.b()
            cggl r6 = (defpackage.cggl) r6
            r5.a = r3
            java.lang.Object r6 = defpackage.cggl.a()
            if (r6 == r0) goto Lcd
        L47:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L50
            goto Lb6
        L50:
            amoc r6 = r5.b
            ffbr r6 = r6.f
            java.lang.Object r6 = r6.b()
            aqkp r6 = (defpackage.aqkp) r6
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r1 = r5.c
            aqge r6 = r6.d(r1)
            elfl r6 = r6.b()
            r5.a = r2
            java.lang.Object r6 = defpackage.fgfz.c(r6, r5)
            if (r6 == r0) goto Lcd
        L6c:
            r6.getClass()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.ffdx.n(r6, r2)
            r1.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
        L80:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L94
            java.lang.Object r2 = r6.next()
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r2 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r2
            aoku r2 = r2.g()
            r1.add(r2)
            goto L80
        L94:
            amoc r6 = r5.b
            ffbr r6 = r6.d
            java.lang.Object r6 = r6.b()
            aqly r6 = (defpackage.aqly) r6
            r2 = 4
            r5.a = r2
            java.lang.Object r6 = r6.b(r1, r5)
            if (r6 != r0) goto La8
            goto Lcd
        La8:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto Lb3
            amod r6 = defpackage.amod.b
            return r6
        Lb3:
            amod r6 = defpackage.amod.c
            return r6
        Lb6:
            entd r6 = defpackage.amoc.a
            ensk r6 = r6.h()
            ensz r6 = (defpackage.ensz) r6
            ensn r0 = defpackage.csux.O
            java.lang.String r1 = "ConversationTrustedContactsApi"
            r6.Y(r0, r1)
            java.lang.String r0 = "Devices not under supervision, conversation notification should always be posted."
            r6.q(r0)
            amod r6 = defpackage.amod.b
            return r6
        Lcd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amob.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amob(this.b, this.c, ffguVar);
    }
}
