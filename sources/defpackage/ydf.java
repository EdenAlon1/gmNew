package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ydf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ydq b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydf(ffgu ffguVar, ydq ydqVar) {
        super(2, ffguVar);
        this.b = ydqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ydf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (r7 != r0) goto L21;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.a
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L15
            if (r1 == r2) goto L11
            defpackage.ffci.b(r7)
            return r4
        L11:
            defpackage.ffci.b(r7)     // Catch: java.lang.Exception -> L19
            goto L48
        L15:
            defpackage.ffci.b(r7)     // Catch: java.lang.Exception -> L19
            goto L3a
        L19:
            r7 = move-exception
            goto L4c
        L1b:
            defpackage.ffci.b(r7)
            java.lang.Object r7 = r6.c
            ffsk r7 = (defpackage.ffsk) r7
            ydq r7 = r6.b     // Catch: java.lang.Exception -> L19
            ffhd r7 = r7.d     // Catch: java.lang.Exception -> L19
            ffhd r7 = defpackage.ekxi.a(r7)     // Catch: java.lang.Exception -> L19
            ydg r1 = new ydg     // Catch: java.lang.Exception -> L19
            ydq r5 = r6.b     // Catch: java.lang.Exception -> L19
            r1.<init>(r4, r5)     // Catch: java.lang.Exception -> L19
            r6.a = r3     // Catch: java.lang.Exception -> L19
            java.lang.Object r7 = defpackage.ffra.a(r7, r1, r6)     // Catch: java.lang.Exception -> L19
            if (r7 != r0) goto L3a
            goto L91
        L3a:
            bswn r7 = (defpackage.bswn) r7     // Catch: java.lang.Exception -> L19
            if (r7 == 0) goto L4b
            ydq r1 = r6.b     // Catch: java.lang.Exception -> L19
            r6.a = r2     // Catch: java.lang.Exception -> L19
            java.lang.Object r7 = r1.e(r7, r6)     // Catch: java.lang.Exception -> L19
            if (r7 == r0) goto L91
        L48:
            xhu r7 = (defpackage.xhu) r7     // Catch: java.lang.Exception -> L19
            return r7
        L4b:
            return r4
        L4c:
            boolean r1 = r7 instanceof java.util.concurrent.CancellationException
            if (r1 != 0) goto L92
            boolean r1 = r7 instanceof java.lang.InterruptedException
            if (r1 != 0) goto L92
            enru r1 = defpackage.ydq.a
            ensk r1 = r1.i()
            ensn r2 = defpackage.ente.a
            java.lang.String r3 = "BugleComposeRow2"
            r1.Y(r2, r3)
            enrr r1 = (defpackage.enrr) r1
            ensk r7 = r1.g(r7)
            enrr r7 = (defpackage.enrr) r7
            ydq r1 = r6.b
            ensn r2 = defpackage.csux.q
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r1 = r1.b
            r7.Y(r2, r1)
            java.lang.String r1 = "invokeSuspend"
            r2 = 66
            java.lang.String r3 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/persistence/ConversationDraftPersistence$query$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r5 = "ConversationDraftPersistence.kt"
            ensk r7 = r7.h(r3, r1, r2, r5)
            enrr r7 = (defpackage.enrr) r7
            java.lang.String r1 = "Exception when querying draft"
            r7.q(r1)
            ydq r7 = r6.b
            r1 = 3
            r6.a = r1
            java.lang.Object r7 = r7.c(r6)
            if (r7 == r0) goto L91
            return r4
        L91:
            return r0
        L92:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ydf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ydf ydfVar = new ydf(ffguVar, this.b);
        ydfVar.c = obj;
        return ydfVar;
    }
}
