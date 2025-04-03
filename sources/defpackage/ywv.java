package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ywv extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ ywz d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ywv(ywz ywzVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = ywzVar;
        this.e = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ywv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x009e, code lost:
    
        if (r9.c(r2, r1, r8) != r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002a, code lost:
    
        if (r9 != r0) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r8.c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L19
            if (r1 == r2) goto L11
            defpackage.ffci.b(r9)
            goto La1
        L11:
            java.lang.Object r1 = r8.b
            java.lang.Object r2 = r8.a
            defpackage.ffci.b(r9)
            goto L87
        L19:
            defpackage.ffci.b(r9)
            goto L2c
        L1d:
            defpackage.ffci.b(r9)
            ywz r9 = r8.d
            r8.c = r3
            ffxx r9 = r9.c
            java.lang.Object r9 = defpackage.fgbj.c(r9, r8)
            if (r9 == r0) goto La4
        L2c:
            aqux r9 = (defpackage.aqux) r9
            if (r9 == 0) goto La1
            enru r1 = defpackage.ywz.a
            ensk r1 = r1.e()
            ensn r3 = defpackage.ente.a
            java.lang.String r4 = "BugleComposeRow2"
            r1.Y(r3, r4)
            java.lang.String r3 = "invokeSuspend"
            r4 = 71
            java.lang.String r5 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/selfphonenumber/EnterSelfPhoneNumberDialogImpl$savePhoneNumber$1"
            java.lang.String r6 = "EnterSelfPhoneNumberDialogImpl.kt"
            ensk r1 = r1.h(r5, r3, r4, r6)
            enrr r1 = (defpackage.enrr) r1
            java.lang.String r3 = "Updating phone number for selfId: %s"
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r4 = r9.g()
            r1.t(r3, r4)
            ywz r1 = r8.d
            ffbr r1 = r1.d
            java.lang.Object r1 = r1.b()
            aolr r1 = (defpackage.aolr) r1
            java.lang.String r3 = r8.e
            aoku r1 = r1.n(r3)
            ywz r3 = r8.d
            int r4 = r9.b()
            cxao r3 = r3.e
            cxan r3 = r3.a(r4)
            j$.util.Optional r4 = j$.util.Optional.of(r1)
            elfl r3 = r3.b(r4)
            r8.a = r9
            r8.b = r1
            r8.c = r2
            java.lang.Object r2 = defpackage.fgfz.c(r3, r8)
            if (r2 == r0) goto La4
            r7 = r2
            r2 = r9
            r9 = r7
        L87:
            cwzz r9 = (defpackage.cwzz) r9
            ywz r9 = r8.d
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r2 = r2.g()
            r1.getClass()
            r3 = 0
            r8.a = r3
            r8.b = r3
            r3 = 3
            r8.c = r3
            java.lang.Object r9 = r9.c(r2, r1, r8)
            if (r9 != r0) goto La1
            goto La4
        La1:
            ffcu r9 = defpackage.ffcu.a
            return r9
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ywv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ywv(this.d, this.e, ffguVar);
    }
}
