package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajcc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ BugleConversation b;
    final /* synthetic */ ajcd c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajcc(ffgu ffguVar, BugleConversation bugleConversation, ajcd ajcdVar) {
        super(2, ffguVar);
        this.b = bugleConversation;
        this.c = ajcdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajcc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0061, code lost:
    
        if (r8 != r0) goto L9;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.a
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L14
            if (r1 == r3) goto L10
            defpackage.ffci.b(r8)
            goto Leb
        L10:
            defpackage.ffci.b(r8)
            goto L63
        L14:
            defpackage.ffci.b(r8)
            java.lang.Object r8 = r7.d
            ffsk r8 = (defpackage.ffsk) r8
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation r8 = r7.b
            r1 = 3
            ffss[] r1 = new defpackage.ffss[r1]
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation r8 = (com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation) r8
            aqge r8 = r8.f
            elfl r8 = r8.b()
            r8.getClass()
            ffss r8 = defpackage.axol.e(r8)
            r1[r4] = r8
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation r8 = r7.b
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation r8 = (com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation) r8
            aqge r8 = r8.d
            elfl r8 = r8.b()
            r8.getClass()
            ffss r8 = defpackage.axol.e(r8)
            r1[r3] = r8
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation r8 = r7.b
            alxs r8 = r8.a()
            aqge r8 = r8.c()
            elfl r8 = r8.b()
            r8.getClass()
            ffss r8 = defpackage.axol.e(r8)
            r1[r2] = r8
            r7.a = r3
            java.lang.Object r8 = defpackage.ffqv.b(r1, r7)
            if (r8 == r0) goto Led
        L63:
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r1 = r8.get(r4)
            r1.getClass()
            alxj r1 = (defpackage.alxj) r1
            java.lang.Object r5 = r8.get(r3)
            r5.getClass()
            engw r5 = (defpackage.engw) r5
            java.lang.Object r8 = r8.get(r2)
            r8.getClass()
            alxg r8 = (defpackage.alxg) r8
            alxi r1 = r1.b()
            alxi r6 = defpackage.alxi.ONE_ON_ONE
            if (r1 != r6) goto Laa
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L8f
            goto Laa
        L8f:
            java.util.Iterator r1 = r5.iterator()
        L93:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto Laa
            java.lang.Object r6 = r1.next()
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r6 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r6
            aoku r6 = r6.g()
            boolean r6 = r6.A()
            if (r6 == 0) goto L93
            goto Lab
        Laa:
            r3 = r4
        Lab:
            aqux r8 = r8.g()
            if (r3 == 0) goto Leb
            ajcd r1 = r7.c
            ffbr r1 = r1.a
            java.lang.Object r1 = r1.b()
            j$.util.Optional r1 = (j$.util.Optional) r1
            boolean r1 = r1.isPresent()
            if (r1 == 0) goto Leb
            if (r8 == 0) goto Leb
            ajcd r1 = r7.c
            ffbr r1 = r1.a
            java.lang.Object r1 = r1.b()
            j$.util.Optional r1 = (j$.util.Optional) r1
            java.lang.Object r1 = r1.get()
            ajce r1 = (defpackage.ajce) r1
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation r3 = r7.b
            java.lang.Object r4 = r5.get(r4)
            r4.getClass()
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r4 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r4
            r7.a = r2
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation r3 = (com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation) r3
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r2 = r3.a
            java.lang.Object r8 = r1.a(r2, r8, r4, r7)
            if (r8 != r0) goto Leb
            goto Led
        Leb:
            r8 = 0
            return r8
        Led:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajcc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ajcc ajccVar = new ajcc(ffguVar, this.b, this.c);
        ajccVar.d = obj;
        return ajccVar;
    }
}
