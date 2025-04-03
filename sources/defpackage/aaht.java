package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaht extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aahw b;
    final /* synthetic */ MessageId c;
    final /* synthetic */ aiir d;
    final /* synthetic */ boolean e;
    final /* synthetic */ fgcm f;
    final /* synthetic */ Long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaht(aahw aahwVar, MessageId messageId, aiir aiirVar, boolean z, fgcm fgcmVar, Long l, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aahwVar;
        this.c = messageId;
        this.d = aiirVar;
        this.e = z;
        this.f = fgcmVar;
        this.g = l;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aaht) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r8 != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000e, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0065, code lost:
    
        if (r1.d((defpackage.ade) r8, r2, r6, r7) == r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x006b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006a, code lost:
    
        return defpackage.ffcu.a;
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
            java.lang.String r2 = "emotify_result_message_id"
            java.lang.String r3 = "has_pending_emotify_result"
            r4 = 1
            defpackage.ffci.b(r8)
            if (r1 == 0) goto L11
            if (r1 == r4) goto L39
            goto L68
        L11:
            aahw r8 = r7.b
            llv r8 = r8.n
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r8.d(r3, r1)
            aahw r8 = r7.b
            com.google.android.apps.messaging.shared.api.messaging.MessageId r1 = r7.c
            llv r8 = r8.n
            r8.d(r2, r1)
            aahw r8 = r7.b
            ffbr r8 = r8.j
            java.lang.Object r8 = r8.b()
            aigz r8 = (defpackage.aigz) r8
            aiir r1 = r7.d
            r7.a = r4
            java.lang.Object r8 = r8.f(r1, r7)
            if (r8 == r0) goto L6b
        L39:
            aahw r1 = r7.b
            llv r1 = r1.n
            ade r8 = (defpackage.ade) r8
            r4 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1.d(r3, r4)
            aahw r1 = r7.b
            llv r1 = r1.n
            r3 = 0
            r1.d(r2, r3)
            aahw r1 = r7.b
            com.google.android.apps.messaging.shared.api.messaging.MessageId r2 = r7.c
            boolean r3 = r7.e
            fgcm r4 = r7.f
            java.lang.Long r5 = r7.g
            aahs r6 = new aahs
            r6.<init>()
            r3 = 2
            r7.a = r3
            java.lang.Object r8 = r1.d(r8, r2, r6, r7)
            if (r8 != r0) goto L68
            goto L6b
        L68:
            ffcu r8 = defpackage.ffcu.a
            return r8
        L6b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaht.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aaht(this.b, this.c, this.d, this.e, this.f, this.g, ffguVar);
    }
}
