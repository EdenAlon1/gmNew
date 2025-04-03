package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amwx implements cfzm {
    private final ffbr a;
    private final ffsk b;

    public amwx(ffbr ffbrVar, ffsk ffskVar) {
        ffbrVar.getClass();
        ffskVar.getClass();
        this.a = ffbrVar;
        this.b = ffskVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.amwv
            if (r0 == 0) goto L13
            r0 = r6
            amwv r0 = (defpackage.amwv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            amwv r0 = new amwv
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            amwx r0 = r0.d
            defpackage.ffci.b(r6)
            goto L4f
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            defpackage.ffci.b(r6)
            ffbr r6 = r5.a
            java.lang.Object r6 = r6.b()
            amhs r6 = (defpackage.amhs) r6
            aqge r6 = r6.D(r3)
            elfl r6 = r6.b()
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = defpackage.fgfz.c(r6, r0)
            if (r6 == r1) goto La9
            r0 = r5
        L4f:
            r6.getClass()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.ffdx.n(r6, r2)
            r1.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
        L63:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto La4
            java.lang.Object r2 = r6.next()
            alxn r2 = (defpackage.alxn) r2
            r2.getClass()
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r3 = r2.c()
            boolean r3 = r3 instanceof com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId
            if (r3 == 0) goto L8e
            ffbr r3 = r0.a
            java.lang.Object r3 = r3.b()
            amhs r3 = (defpackage.amhs) r3
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r2 = r2.c()
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r2 = (com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId) r2
            r4 = 0
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation r2 = r3.H(r2, r4)
            goto La0
        L8e:
            ffbr r3 = r0.a
            java.lang.Object r3 = r3.b()
            amhs r3 = (defpackage.amhs) r3
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r2 = r2.c()
            alxk r4 = defpackage.alxk.MINIMAL
            com.google.android.apps.messaging.shared.api.messaging.Conversation r2 = r3.a(r2, r4)
        La0:
            r1.add(r2)
            goto L63
        La4:
            java.lang.Object r6 = defpackage.ffdx.M(r1)
            return r6
        La9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amwx.a(ffgu):java.lang.Object");
    }

    @Override // defpackage.cfzm
    public final /* synthetic */ elfl b() {
        return cfzj.b();
    }

    @Override // defpackage.cfzm
    public final /* synthetic */ elfl c() {
        return cfzj.c();
    }

    @Override // defpackage.cfzm
    public final elfl d() {
        elfl c;
        c = axol.c(this.b, ffhe.a, ffsm.a, new amww(this, null));
        return c;
    }
}
