package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnpi extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ BugleConversation d;
    final /* synthetic */ cnpj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnpi(BugleConversation bugleConversation, cnpj cnpjVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = bugleConversation;
        this.e = cnpjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnpi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
    
        if (r7 != r0) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00ab A[RETURN] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.c
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 == r2) goto L12
            defpackage.ffci.b(r7)
            goto Lab
        L12:
            java.lang.Object r1 = r6.b
            java.lang.Object r2 = r6.a
            defpackage.ffci.b(r7)
            goto L7f
        L1a:
            defpackage.ffci.b(r7)
            goto L36
        L1e:
            defpackage.ffci.b(r7)
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation r7 = r6.d
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation r7 = (com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation) r7
            aqge r7 = r7.f
            elfl r7 = r7.b()
            r7.getClass()
            r6.c = r3
            java.lang.Object r7 = defpackage.fgfz.c(r7, r6)
            if (r7 == r0) goto Lac
        L36:
            alxj r7 = (defpackage.alxj) r7
            aqux r7 = r7.f()
            if (r7 != 0) goto L5f
            enru r7 = defpackage.cnpj.a
            ensk r7 = r7.j()
            ensn r0 = defpackage.ente.a
            java.lang.String r1 = "BugleSatellite"
            r7.Y(r0, r1)
            java.lang.String r0 = "invokeSuspend"
            r1 = 63
            java.lang.String r2 = "com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/DunestarOpenConversationListener$onConversationOpened$1"
            java.lang.String r3 = "DunestarOpenConversationListener.kt"
            ensk r7 = r7.h(r2, r0, r1, r3)
            enrr r7 = (defpackage.enrr) r7
            java.lang.String r0 = "Active self identity is null"
            r7.q(r0)
            goto Lab
        L5f:
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation r1 = r6.d
            aotl r1 = r1.m()
            aqge r3 = r7.d()
            elfl r3 = r3.b()
            r3.getClass()
            r6.a = r7
            r6.b = r1
            r6.c = r2
            java.lang.Object r2 = defpackage.fgfz.c(r3, r6)
            if (r2 == r0) goto Lac
            r5 = r2
            r2 = r7
            r7 = r5
        L7f:
            aqvj r7 = (defpackage.aqvj) r7
            elfl r7 = r1.X(r7)
            defpackage.axnw.h(r7)
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation r7 = r6.d
            r6.a = r4
            r6.b = r4
            r1 = 3
            r6.c = r1
            aqge r1 = r2.d()
            ffxx r1 = defpackage.aqfu.a(r1)
            aqet r2 = new aqet
            r2.<init>(r7)
            java.lang.Object r7 = r1.a(r2, r6)
            ffhh r1 = defpackage.ffhh.a
            if (r7 == r1) goto La8
            ffcu r7 = defpackage.ffcu.a
        La8:
            if (r7 != r0) goto Lab
            goto Lac
        Lab:
            return r4
        Lac:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnpi.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cnpi(this.d, this.e, ffguVar);
    }
}
