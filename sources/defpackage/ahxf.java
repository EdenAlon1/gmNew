package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahxf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ConversationId b;
    final /* synthetic */ xhu c;
    final /* synthetic */ ahxi d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahxf(ffgu ffguVar, ConversationId conversationId, xhu xhuVar, ahxi ahxiVar) {
        super(2, ffguVar);
        this.b = conversationId;
        this.c = xhuVar;
        this.d = ahxiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahxf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x007f, code lost:
    
        if (r7.b(r1, r2, r6) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0085, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0070, code lost:
    
        if (defpackage.fgfz.c(r7, r6) != r0) goto L9;
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
            r2 = 1
            if (r1 == 0) goto L11
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r7)
            goto L82
        Ld:
            defpackage.ffci.b(r7)
            goto L72
        L11:
            defpackage.ffci.b(r7)
            java.lang.Object r7 = r6.e
            ffsk r7 = (defpackage.ffsk) r7
            enru r7 = defpackage.ahxi.a
            ensk r7 = r7.e()
            ensn r1 = defpackage.ente.a
            java.lang.String r3 = "BugleMultiShare"
            r7.Y(r1, r3)
            enrr r7 = (defpackage.enrr) r7
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r1 = r6.b
            ensn r3 = defpackage.csux.q
            r7.Y(r3, r1)
            java.lang.String r1 = "invokeSuspend"
            r3 = 54
            java.lang.String r4 = "com/google/android/apps/messaging/multishare/editmessage/bottomcontent/composerow/draft/DraftPersistenceImpl$save$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r5 = "DraftPersistenceImpl.kt"
            ensk r7 = r7.h(r4, r1, r3, r5)
            enrr r7 = (defpackage.enrr) r7
            xhu r1 = r6.c
            java.lang.String r3 = "Persistence saving draft %s"
            r7.t(r3, r1)
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r7 = r6.b
            xhu r1 = r6.c
            ahxi r3 = r6.d
            ahxg r4 = new ahxg
            r4.<init>(r1, r3, r7)
            java.lang.String[] r1 = defpackage.bsyb.a
            bswq r1 = new bswq
            r1.<init>()
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r7 = defpackage.amic.a(r7)
            r1.c(r7)
            r4.invoke(r1)
            bswn r7 = r1.a()
            elfl r7 = r7.l()
            r7.getClass()
            r6.a = r2
            java.lang.Object r7 = defpackage.fgfz.c(r7, r6)
            if (r7 == r0) goto L85
        L72:
            ahxi r7 = r6.d
            xhu r1 = r6.c
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r2 = r6.b
            r3 = 2
            r6.a = r3
            java.lang.Object r7 = r7.b(r1, r2, r6)
            if (r7 != r0) goto L82
            goto L85
        L82:
            ffcu r7 = defpackage.ffcu.a
            return r7
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahxf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ahxf ahxfVar = new ahxf(ffguVar, this.b, this.c, this.d);
        ahxfVar.e = obj;
        return ahxfVar;
    }
}
