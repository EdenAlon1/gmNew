package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amxu extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ amxv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amxu(amxv amxvVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = amxvVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amxu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002f, code lost:
    
        if (r9 != r0) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0072 A[RETURN] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r8.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 == r2) goto L10
            defpackage.ffci.b(r9)
            return r9
        L10:
            java.lang.Object r1 = r8.a
            defpackage.ffci.b(r9)
            r3 = r1
            goto L4a
        L17:
            defpackage.ffci.b(r9)
            goto L31
        L1b:
            defpackage.ffci.b(r9)
            amxv r9 = r8.c
            aqge r9 = r9.d
            elfl r9 = r9.b()
            r9.getClass()
            r8.b = r3
            java.lang.Object r9 = defpackage.fgfz.c(r9, r8)
            if (r9 == r0) goto L73
        L31:
            amxv r1 = r8.c
            amxx r9 = (defpackage.amxx) r9
            aqge r1 = r1.c
            elfl r1 = r1.b()
            r1.getClass()
            r8.a = r9
            r8.b = r2
            java.lang.Object r1 = defpackage.fgfz.c(r1, r8)
            if (r1 == r0) goto L73
            r3 = r9
            r9 = r1
        L4a:
            amxv r1 = r8.c
            r2 = r9
            engw r2 = (defpackage.engw) r2
            ffbr r9 = r1.a
            java.lang.Object r9 = r9.b()
            r1 = r9
            ampf r1 = (defpackage.ampf) r1
            r2.getClass()
            r3.getClass()
            amxv r9 = r8.c
            r4 = 0
            r8.a = r4
            r4 = 3
            r8.b = r4
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r5 = r9.b
            r6 = 1
            r4 = 0
            r7 = r8
            java.lang.Object r9 = r1.a(r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L72
            goto L73
        L72:
            return r9
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amxu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amxu(this.c, ffguVar);
    }
}
