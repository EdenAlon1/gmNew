package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aagz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aahw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aagz(aahw aahwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aahwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aagz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        return defpackage.ffcu.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r6 != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0052, code lost:
    
        if (r1.d(r6, (com.google.android.apps.messaging.shared.api.messaging.MessageId) r2, r4, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0060, code lost:
    
        return r0;
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
            if (r1 == r2) goto L34
            goto L55
        Ld:
            aahw r6 = r5.b
            llv r6 = r6.n
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r3 = "has_pending_emotify_result"
            r6.d(r3, r1)
            aahw r6 = r5.b
            ffbr r6 = r6.j
            java.lang.Object r6 = r6.b()
            aigz r6 = (defpackage.aigz) r6
            ainc r1 = new ainc
            java.lang.String r3 = "emotify_result"
            r1.<init>(r3)
            r5.a = r2
            java.lang.Object r6 = r6.f(r1, r5)
            if (r6 == r0) goto L60
        L34:
            aahw r1 = r5.b
            llv r2 = r1.n
            ade r6 = (defpackage.ade) r6
            java.lang.String r3 = "emotify_result_message_id"
            java.lang.Object r2 = r2.b(r3)
            if (r2 == 0) goto L58
            aahw r3 = r5.b
            com.google.android.apps.messaging.shared.api.messaging.MessageId r2 = (com.google.android.apps.messaging.shared.api.messaging.MessageId) r2
            aagy r4 = new aagy
            r4.<init>()
            r3 = 2
            r5.a = r3
            java.lang.Object r6 = r1.d(r6, r2, r4, r5)
            if (r6 != r0) goto L55
            goto L60
        L55:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L58:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Required value was null."
            r6.<init>(r0)
            throw r6
        L60:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aagz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aagz(this.b, ffguVar);
    }
}
