package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aibx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aica b;
    final /* synthetic */ aoku c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aibx(aica aicaVar, aoku aokuVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aicaVar;
        this.c = aokuVar;
        this.d = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aibx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        if (r6 != r0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0064, code lost:
    
        if (r6 == r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0045, code lost:
    
        r6 = (com.google.android.apps.messaging.shared.api.messaging.Conversation) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0067, code lost:
    
        r6 = (com.google.android.apps.messaging.shared.api.messaging.Conversation) r6;
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
            r2 = 1
            defpackage.ffci.b(r6)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L45
            goto L67
        Ld:
            aica r6 = r5.b
            aoku r1 = r5.c
            aqkp r3 = r6.e
            com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient r1 = r3.f(r1)
            ffbr r6 = r6.j
            java.lang.Object r6 = r6.b()
            auho r6 = (defpackage.auho) r6
            boolean r6 = r6.a()
            if (r6 == 0) goto L48
            aica r6 = r5.b
            j$.util.Optional r3 = j$.util.Optional.empty()
            engw r1 = defpackage.engw.r(r1)
            alxl r6 = r6.g
            r4 = 0
            elfl r6 = r6.m(r3, r1, r4)
            r6.getClass()
            ffss r6 = defpackage.axol.e(r6)
            r5.a = r2
            java.lang.Object r6 = r6.c(r5)
            if (r6 == r0) goto L66
        L45:
            com.google.android.apps.messaging.shared.api.messaging.Conversation r6 = (com.google.android.apps.messaging.shared.api.messaging.Conversation) r6
            goto L69
        L48:
            aica r6 = r5.b
            engw r1 = defpackage.engw.r(r1)
            java.lang.String r2 = r5.d
            alxl r6 = r6.g
            elfl r6 = r6.k(r1, r2)
            r6.getClass()
            ffss r6 = defpackage.axol.e(r6)
            r1 = 2
            r5.a = r1
            java.lang.Object r6 = r6.c(r5)
            if (r6 != r0) goto L67
        L66:
            return r0
        L67:
            com.google.android.apps.messaging.shared.api.messaging.Conversation r6 = (com.google.android.apps.messaging.shared.api.messaging.Conversation) r6
        L69:
            aica r0 = r5.b
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r6 = r6.d()
            r0.b(r6)
            ffcu r6 = defpackage.ffcu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aibx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aibx(this.b, this.c, this.d, ffguVar);
    }
}
