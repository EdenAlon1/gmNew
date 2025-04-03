package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aazz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ abac b;
    final /* synthetic */ Intent c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aazz(abac abacVar, Intent intent, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = abacVar;
        this.c = intent;
        this.d = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aazz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        if (r8.h(r1, r7) != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
    
        if (r8 != r0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        if (r1 != 2) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0061, code lost:
    
        r8 = (defpackage.ctqh) r7.b.u.b();
        r1 = ((com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId) r7.b.h.d()).a;
        r2 = r7.d;
        r3 = defpackage.fbre.CONSUMED;
        r7.a = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0082, code lost:
    
        if (r8.h(r1, r2, r3, r7) != r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0088, code lost:
    
        return r0;
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
            if (r1 == 0) goto L10
            defpackage.ffci.b(r8)
            if (r1 == r3) goto L33
            if (r1 == r2) goto L61
            goto L85
        L10:
            defpackage.ffci.b(r8)
            abac r8 = r7.b
            ffbr r8 = r8.s
            java.lang.Object r8 = r8.b()
            aigz r8 = (defpackage.aigz) r8
            aiir r1 = new aiir
            ael r4 = new ael
            r4.<init>()
            android.content.Intent r5 = r7.c
            java.lang.String r6 = "CalendarSuggestion"
            r1.<init>(r6, r4, r5)
            r7.a = r3
            java.lang.Object r8 = r8.f(r1, r7)
            if (r8 == r0) goto L88
        L33:
            ade r8 = (defpackage.ade) r8
            int r8 = r8.a
            r1 = -1
            if (r8 != r1) goto L85
            abac r8 = r7.b
            android.content.Context r8 = r8.g
            r1 = 2132083233(0x7f150221, float:1.9806603E38)
            r3 = 0
            android.widget.Toast r8 = android.widget.Toast.makeText(r8, r1, r3)
            r8.show()
            java.lang.String r8 = r7.d
            if (r8 == 0) goto L85
            abac r8 = r7.b
            ffbr r8 = r8.t
            java.lang.Object r8 = r8.b()
            ctjh r8 = (defpackage.ctjh) r8
            java.lang.String r1 = r7.d
            r7.a = r2
            java.lang.Object r8 = r8.h(r1, r7)
            if (r8 == r0) goto L88
        L61:
            abac r8 = r7.b
            ffbr r8 = r8.u
            java.lang.Object r8 = r8.b()
            ctqh r8 = (defpackage.ctqh) r8
            abac r1 = r7.b
            com.google.android.apps.messaging.shared.api.messaging.Conversation r1 = r1.h
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r1 = r1.d()
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r1 = (com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId) r1
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r1 = r1.a
            java.lang.String r2 = r7.d
            fbre r3 = defpackage.fbre.CONSUMED
            r4 = 3
            r7.a = r4
            java.lang.Object r8 = r8.h(r1, r2, r3, r7)
            if (r8 != r0) goto L85
            goto L88
        L85:
            ffcu r8 = defpackage.ffcu.a
            return r8
        L88:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aazz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aazz(this.b, this.c, this.d, ffguVar);
    }
}
