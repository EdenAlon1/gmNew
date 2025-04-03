package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xqy extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ xra c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xqy(xra xraVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = xraVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xqy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007c, code lost:
    
        if (r8.c((defpackage.xrc) r1, r2) != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        if (r8 != r0) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
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
            if (r1 == 0) goto L1a
            if (r1 == r3) goto L16
            if (r1 == r2) goto L10
            defpackage.ffci.b(r8)
            goto L7f
        L10:
            java.lang.Object r1 = r7.a
            defpackage.ffci.b(r8)
            goto L63
        L16:
            defpackage.ffci.b(r8)
            goto L47
        L1a:
            defpackage.ffci.b(r8)
            enru r8 = defpackage.xra.a
            ensk r8 = r8.e()
            ensn r1 = defpackage.ente.a
            java.lang.String r4 = "BugleComposeRow2"
            r8.Y(r1, r4)
            java.lang.String r1 = "invokeSuspend"
            r4 = 148(0x94, float:2.07E-43)
            java.lang.String r5 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/imagecompression/DirectSendImageCompressionUiAdapter$setImageCompressionSettingsToOriginal$1"
            java.lang.String r6 = "DirectSendImageCompressionUiAdapter.kt"
            ensk r8 = r8.h(r5, r1, r4, r6)
            enrr r8 = (defpackage.enrr) r8
            java.lang.String r1 = "Setting image compression to ORIGINAL"
            r8.q(r1)
            xra r8 = r7.c
            r7.b = r3
            java.lang.Object r8 = r8.a(r7)
            if (r8 == r0) goto L82
        L47:
            xra r1 = r7.c
            xrc r8 = (defpackage.xrc) r8
            ffbr r1 = r1.f
            java.lang.Object r1 = r1.b()
            comc r1 = (defpackage.comc) r1
            xqx r3 = new xqx
            r3.<init>()
            r7.a = r8
            r7.b = r2
            java.lang.Object r1 = r1.d(r3, r7)
            if (r1 == r0) goto L82
            r1 = r8
        L63:
            xrc r8 = defpackage.xrc.b
            if (r1 == r8) goto L6c
            xra r8 = r7.c
            r8.b()
        L6c:
            xra r8 = r7.c
            xrc r2 = defpackage.xrc.b
            r3 = 0
            r7.a = r3
            r3 = 3
            r7.b = r3
            xrc r1 = (defpackage.xrc) r1
            java.lang.Object r8 = r8.c(r1, r2)
            if (r8 != r0) goto L7f
            goto L82
        L7f:
            ffcu r8 = defpackage.ffcu.a
            return r8
        L82:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xqy.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new xqy(this.c, ffguVar);
    }
}
