package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amvs extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ amvt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amvs(amvt amvtVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = amvtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amvs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002f, code lost:
    
        if (r8 != r0) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x007a A[RETURN] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 == r2) goto L10
            defpackage.ffci.b(r8)
            return r8
        L10:
            java.lang.Object r1 = r7.a
            defpackage.ffci.b(r8)
            r3 = r1
            goto L4e
        L17:
            defpackage.ffci.b(r8)
            goto L31
        L1b:
            defpackage.ffci.b(r8)
            amvt r8 = r7.c
            aqge r8 = r8.d
            elfl r8 = r8.b()
            r8.getClass()
            r7.b = r3
            java.lang.Object r8 = defpackage.fgfz.c(r8, r7)
            if (r8 == r0) goto L7b
        L31:
            amvt r1 = r7.c
            amvv r8 = (defpackage.amvv) r8
            com.google.android.apps.messaging.shared.api.messaging.Conversation r1 = r1.b
            aqge r1 = r1.g()
            elfl r1 = r1.b()
            r1.getClass()
            r7.a = r8
            r7.b = r2
            java.lang.Object r1 = defpackage.fgfz.c(r1, r7)
            if (r1 == r0) goto L7b
            r3 = r8
            r8 = r1
        L4e:
            amvt r1 = r7.c
            r2 = r8
            engw r2 = (defpackage.engw) r2
            ffbr r8 = r1.a
            java.lang.Object r8 = r8.b()
            r1 = r8
            ampf r1 = (defpackage.ampf) r1
            r2.getClass()
            r3.getClass()
            amvt r8 = r7.c
            com.google.android.apps.messaging.shared.api.messaging.Conversation r4 = r8.b
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r5 = r4.d()
            r4 = 0
            r7.a = r4
            r4 = 3
            r7.b = r4
            alxl r4 = r8.c
            r6 = r7
            java.lang.Object r8 = defpackage.ampf.b(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L7a
            goto L7b
        L7a:
            return r8
        L7b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amvs.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amvs(this.c, ffguVar);
    }
}
